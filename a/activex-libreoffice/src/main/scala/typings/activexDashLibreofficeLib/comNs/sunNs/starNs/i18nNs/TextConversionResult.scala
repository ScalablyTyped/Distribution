package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text conversion result to be used with {@link XTextConversion} .
  * @since OOo 1.1.2
  */
trait TextConversionResult extends js.Object {
  /**
    * The boundary of the first convertible word in the given text.
    *
    * If there is no convertible word found in the text, **startPos** and **endPos** for {@link Boundary} equal 0.
    */
  var Boundary: Boundary
  /** A list of replacement candidates for the first convertible word found in the given text. */
  var Candidates: activexDashInteropLib.SafeArray[java.lang.String]
}

