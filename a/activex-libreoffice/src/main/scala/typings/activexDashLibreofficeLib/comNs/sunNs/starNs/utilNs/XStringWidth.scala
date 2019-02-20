package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface that encapsulates the abstract notion of string width.
  * @see XStringAbbreviation
  */
trait XStringWidth
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * compute the width of a given string.
    *
    * Depending on the implementation of this interface, the width of a string can be rather different things, like the number of characters in the string,
    * or the width in pixel when displayed with a specific font.
    * @param aString The string that is to be measured.
    * @returns the string's width.
    */
  def queryStringWidth(aString: java.lang.String): scala.Double
}

