package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the basic operations for a tab controller model. */
trait XTabControllerModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the control models. */
  var ControlModels: activexDashInteropLib.SafeArray[XControlModel]
  /** returns whether the control models are grouped together. */
  var GroupControl: scala.Boolean
  /** returns the number of control model groups. */
  val GroupCount: scala.Double
  /** returns the control models. */
  def getControlModels(): activexDashInteropLib.SafeArray[XControlModel]
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
    ControlModels: activexDashInteropLib.SafeArray[XControlModel],
    GroupControl: scala.Boolean,
    GroupCount: scala.Double,
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
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setControlModels: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel], scala.Unit],
    setGroup: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XControlModel], 
      java.lang.String, 
      scala.Unit
    ],
    setGroupControl: js.Function1[scala.Boolean, scala.Unit]
  ): XTabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels, GroupControl = GroupControl, GroupCount = GroupCount, acquire = acquire, getControlModels = getControlModels, getGroup = getGroup, getGroupByName = getGroupByName, getGroupControl = getGroupControl, getGroupCount = getGroupCount, queryInterface = queryInterface, release = release, setControlModels = setControlModels, setGroup = setGroup, setGroupControl = setGroupControl)
  
    __obj.asInstanceOf[XTabControllerModel]
  }
}

