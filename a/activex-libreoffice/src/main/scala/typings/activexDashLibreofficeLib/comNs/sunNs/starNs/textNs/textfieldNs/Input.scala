package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a text input field.
  * @see com.sun.star.text.TextField
  */
trait Input
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /**
    * contains the text content of the text field.
    *
    * The field displays the text content.
    */
  var Content: java.lang.String
  /**
    * contains an internal-use-only multi purpose string.
    *
    * This is an internal multi purpose string used in WW8 import/export. Usually it holds the help text for form fields.
    *
    * It's content must NEVER be modified by the user.
    */
  var Help: java.lang.String
  /**
    * contains a hint text.
    *
    * This hint may be used as help tip or as headline of a corresponding dialog to edit the field content.
    */
  var Hint: java.lang.String
}

