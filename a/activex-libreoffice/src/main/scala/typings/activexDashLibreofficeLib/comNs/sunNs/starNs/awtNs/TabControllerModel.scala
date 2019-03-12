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
    ControlModels: stdLib.SafeArray[XControlModel],
    GroupControl: scala.Boolean,
    GroupCount: scala.Double,
    ServiceName: java.lang.String,
    acquire: () => scala.Unit,
    getControlModels: () => stdLib.SafeArray[XControlModel],
    getGroup: (scala.Double, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]], js.Array[java.lang.String]) => scala.Unit,
    getGroupByName: (java.lang.String, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]]) => scala.Unit,
    getGroupControl: () => scala.Boolean,
    getGroupCount: () => scala.Double,
    getServiceName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    read: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectInputStream => scala.Unit,
    release: () => scala.Unit,
    setControlModels: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel] => scala.Unit,
    setGroup: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel], java.lang.String) => scala.Unit,
    setGroupControl: scala.Boolean => scala.Unit,
    write: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectOutputStream => scala.Unit
  ): TabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels, GroupControl = GroupControl, GroupCount = GroupCount, ServiceName = ServiceName, acquire = js.Any.fromFunction0(acquire), getControlModels = js.Any.fromFunction0(getControlModels), getGroup = js.Any.fromFunction3(getGroup), getGroupByName = js.Any.fromFunction2(getGroupByName), getGroupControl = js.Any.fromFunction0(getGroupControl), getGroupCount = js.Any.fromFunction0(getGroupCount), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), setControlModels = js.Any.fromFunction1(setControlModels), setGroup = js.Any.fromFunction2(setGroup), setGroupControl = js.Any.fromFunction1(setGroupControl), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[TabControllerModel]
  }
}

