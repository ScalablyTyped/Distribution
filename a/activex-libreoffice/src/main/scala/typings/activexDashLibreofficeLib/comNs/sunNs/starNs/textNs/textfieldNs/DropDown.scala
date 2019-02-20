package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.textfieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of an author text field.
  * @see com.sun.star.text.TextField
  */
trait DropDown
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.TextField {
  /** The items of the dropdown field. */
  var Items: activexDashInteropLib.SafeArray[java.lang.String]
  /** The name of the drop down field. */
  var Name: java.lang.String
  /**
    * The selected item. If no item is selected this property contains an empty string. If this property is set to a value not present in the items of the
    * dropdown field it is invalidated, i.e. it is set to an empty string.
    */
  var SelectedItem: java.lang.String
}

