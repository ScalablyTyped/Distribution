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

