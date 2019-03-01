package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service enables a filter developer to register a dialog to query for user options before the filter operation is performed.
  *
  * The user options are stored inside the {@link com.sun.star.document.MediaDescriptor} and can be queried from the {@link
  * com.sun.star.document.MediaDescriptor} by the component that implements {@link com.sun.star.document.XFilter} .
  *
  * The application will set the {@link com.sun.star.document.MediaDescriptor} using the interface {@link com.sun.star.beans.XPropertyAccess} and then
  * call {@link XExecutableDialog.execute()} .
  *
  * If that method returns `ExecutableDialogResults::OK` , the application will retrieve the changed {@link com.sun.star.document.MediaDescriptor} back
  * using the interface {@link com.sun.star.beans.XPropertyAccess} . The filter operation is than continued, using the new {@link
  * com.sun.star.document.MediaDescriptor} .
  *
  * Otherwise, the filter operation is canceled.
  * @since OOo 1.1.2
  */
trait FilterOptionsDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyAccess
     with XExecutableDialog

object FilterOptionsDialog {
  @scala.inline
  def apply(
    PropertyValues: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    acquire: js.Function0[scala.Unit],
    execute: js.Function0[scala.Double],
    getPropertyValues: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): FilterOptionsDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PropertyValues")(PropertyValues)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getPropertyValues")(getPropertyValues)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setPropertyValues")(setPropertyValues)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.asInstanceOf[FilterOptionsDialog]
  }
}

