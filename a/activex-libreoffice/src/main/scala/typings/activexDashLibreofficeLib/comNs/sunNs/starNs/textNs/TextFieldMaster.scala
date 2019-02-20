package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A {@link TextFieldMaster} specifies important data for its DependentTextFields. */
trait TextFieldMaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** contains a sequence of all fields that depend on this master. */
  var DependentTextFields: activexDashInteropLib.SafeArray[XDependentTextField]
  /** contains the instance name as it is used in the {@link com.sun.star.text.XTextFieldsSupplier} . */
  var InstanceName: java.lang.String
  /**
    * determines the name of the field master. The name is void as long as the instance is not member of the document structure. When the value is being set
    * the instance is inserted into the document and the name cannot be changed afterwards. That does not apply to the Database text field master.
    */
  var Name: java.lang.String
}

