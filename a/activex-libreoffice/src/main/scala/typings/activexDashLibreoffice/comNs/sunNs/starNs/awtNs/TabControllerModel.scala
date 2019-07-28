package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XObjectInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XObjectOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XPersistObject
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a standard tab controller model. */
trait TabControllerModel
  extends XTabControllerModel
     with XPersistObject

object TabControllerModel {
  @scala.inline
  def apply(
    ControlModels: SafeArray[XControlModel],
    GroupControl: Boolean,
    GroupCount: Double,
    ServiceName: String,
    acquire: () => Unit,
    getControlModels: () => SafeArray[XControlModel],
    getGroup: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Unit,
    getGroupByName: (String, js.Array[SeqEquiv[XControlModel]]) => Unit,
    getGroupControl: () => Boolean,
    getGroupCount: () => Double,
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    setControlModels: SeqEquiv[XControlModel] => Unit,
    setGroup: (SeqEquiv[XControlModel], String) => Unit,
    setGroupControl: Boolean => Unit,
    write: XObjectOutputStream => Unit
  ): TabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels, GroupControl = GroupControl, GroupCount = GroupCount, ServiceName = ServiceName, acquire = js.Any.fromFunction0(acquire), getControlModels = js.Any.fromFunction0(getControlModels), getGroup = js.Any.fromFunction3(getGroup), getGroupByName = js.Any.fromFunction2(getGroupByName), getGroupControl = js.Any.fromFunction0(getGroupControl), getGroupCount = js.Any.fromFunction0(getGroupCount), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), setControlModels = js.Any.fromFunction1(setControlModels), setGroup = js.Any.fromFunction2(setGroup), setGroupControl = js.Any.fromFunction1(setGroupControl), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[TabControllerModel]
  }
}

