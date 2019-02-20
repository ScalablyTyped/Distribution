package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of an input field that is used to change the content of a corresponding field master of a user defined text field.
  * @see com.sun.star.text.TextField
  */
trait InputUser
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** contains the name of the corresponding field master. */
  var Content: java.lang.String
  /**
    * contains a hint text.
    *
    * This hint may be used as help tip or as headline of a corresponding dialog to edit the field content.
    */
  var Hint: java.lang.String
}

