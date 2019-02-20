package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the base interface for all text fields.
  *
  * A text field is embedded in text and expands to a sequence of characters.
  * @see TextField
  */
trait XTextField extends XTextContent {
  /**
    * @param bShowCommand if `TRUE` the command of the field will be returned
    * @returns the display string of the text field either as the command of the field or as the output string.
    */
  def getPresentation(bShowCommand: scala.Boolean): java.lang.String
}

