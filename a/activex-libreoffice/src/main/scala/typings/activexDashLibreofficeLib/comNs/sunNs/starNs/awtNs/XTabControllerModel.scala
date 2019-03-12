package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the basic operations for a tab controller model. */
trait XTabControllerModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the control models. */
  var ControlModels: stdLib.SafeArray[XControlModel]
  /** returns whether the control models are grouped together. */
  var GroupControl: scala.Boolean
  /** returns the number of control model groups. */
  val GroupCount: scala.Double
  /** returns the control models. */
  def getControlModels(): stdLib.SafeArray[XControlModel]
  /** returns a control model group. */
  def getGroup(
    nGroup: scala.Double,
    Group: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]],
    Name: js.Array[java.lang.String]
  ): scala.Unit
  /** returns a control model group by name. */
  def getGroupByName(
    Name: java.lang.String,
    Group: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]]
  ): scala.Unit
  /** returns whether the control models are grouped together. */
  def getGroupControl(): scala.Boolean
  /** returns the number of control model groups. */
  def getGroupCount(): scala.Double
  /** sets the control models. */
  def setControlModels(Controls: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]): scala.Unit
  /** sets a control model group. */
  def setGroup(
    Group: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel],
    GroupName: java.lang.String
  ): scala.Unit
  /** determines if the control models are grouped together. */
  def setGroupControl(GroupControl: scala.Boolean): scala.Unit
}

object XTabControllerModel {
  @scala.inline
  def apply(
    ControlModels: stdLib.SafeArray[XControlModel],
    GroupControl: scala.Boolean,
    GroupCount: scala.Double,
    acquire: () => scala.Unit,
    getControlModels: () => stdLib.SafeArray[XControlModel],
    getGroup: (scala.Double, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]], js.Array[java.lang.String]) => scala.Unit,
    getGroupByName: (java.lang.String, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel]]) => scala.Unit,
    getGroupControl: () => scala.Boolean,
    getGroupCount: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setControlModels: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel] => scala.Unit,
    setGroup: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel], java.lang.String) => scala.Unit,
    setGroupControl: scala.Boolean => scala.Unit
  ): XTabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels, GroupControl = GroupControl, GroupCount = GroupCount, acquire = js.Any.fromFunction0(acquire), getControlModels = js.Any.fromFunction0(getControlModels), getGroup = js.Any.fromFunction3(getGroup), getGroupByName = js.Any.fromFunction2(getGroupByName), getGroupControl = js.Any.fromFunction0(getGroupControl), getGroupCount = js.Any.fromFunction0(getGroupCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControlModels = js.Any.fromFunction1(setControlModels), setGroup = js.Any.fromFunction2(setGroup), setGroupControl = js.Any.fromFunction1(setGroupControl))
  
    __obj.asInstanceOf[XTabControllerModel]
  }
}

