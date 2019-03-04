package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a standard tab controller model. */
trait TabControllerModel
  extends XTabControllerModel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XPersistObject

object TabControllerModel {
  @scala.inline
  def apply(
    ControlModels: activexDashInteropLib.SafeArray[XControlModel],
    GroupControl: scala.Boolean,
    GroupCount: scala.Double,
    ServiceName: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getControlModels: js.Function0[activexDashInteropLib.SafeArray[XControlModel]],
    getGroup: js.Function3[
      scala.Double, 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]], 
      js.Array[java.lang.String], 
      scala.Unit
    ],
    getGroupByName: js.Function2[
      java.lang.String, 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]], 
      scala.Unit
    ],
    getGroupControl: js.Function0[scala.Boolean],
    getGroupCount: js.Function0[scala.Double],
    getServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectInputStream, scala.Unit],
    release: js.Function0[scala.Unit],
    setControlModels: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel], scala.Unit],
    setGroup: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel], 
      java.lang.String, 
      scala.Unit
    ],
    setGroupControl: js.Function1[scala.Boolean, scala.Unit],
    write: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectOutputStream, scala.Unit]
  ): TabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels, GroupControl = GroupControl, GroupCount = GroupCount, ServiceName = ServiceName, acquire = acquire, getControlModels = getControlModels, getGroup = getGroup, getGroupByName = getGroupByName, getGroupControl = getGroupControl, getGroupCount = getGroupCount, getServiceName = getServiceName, queryInterface = queryInterface, read = read, release = release, setControlModels = setControlModels, setGroup = setGroup, setGroupControl = setGroupControl, write = write)
  
    __obj.asInstanceOf[TabControllerModel]
  }
}

