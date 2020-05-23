package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the basic operations for a tab controller model. */
trait XTabControllerModel extends XInterface {
  /** returns the control models. */
  var ControlModels: SafeArray[XControlModel]
  /** returns whether the control models are grouped together. */
  var GroupControl: Boolean
  /** returns the number of control model groups. */
  val GroupCount: Double
  /** returns the control models. */
  def getControlModels(): SafeArray[XControlModel]
  /** returns a control model group. */
  def getGroup(nGroup: Double, Group: js.Array[SeqEquiv[XControlModel]], Name: js.Array[String]): Unit
  /** returns a control model group by name. */
  def getGroupByName(Name: String, Group: js.Array[SeqEquiv[XControlModel]]): Unit
  /** returns whether the control models are grouped together. */
  def getGroupControl(): Boolean
  /** returns the number of control model groups. */
  def getGroupCount(): Double
  /** sets the control models. */
  def setControlModels(Controls: SeqEquiv[XControlModel]): Unit
  /** sets a control model group. */
  def setGroup(Group: SeqEquiv[XControlModel], GroupName: String): Unit
  /** determines if the control models are grouped together. */
  def setGroupControl(GroupControl: Boolean): Unit
}

object XTabControllerModel {
  @scala.inline
  def apply(
    ControlModels: SafeArray[XControlModel],
    GroupControl: Boolean,
    GroupCount: Double,
    acquire: () => Unit,
    getControlModels: () => SafeArray[XControlModel],
    getGroup: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Unit,
    getGroupByName: (String, js.Array[SeqEquiv[XControlModel]]) => Unit,
    getGroupControl: () => Boolean,
    getGroupCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setControlModels: SeqEquiv[XControlModel] => Unit,
    setGroup: (SeqEquiv[XControlModel], String) => Unit,
    setGroupControl: Boolean => Unit
  ): XTabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels.asInstanceOf[js.Any], GroupControl = GroupControl.asInstanceOf[js.Any], GroupCount = GroupCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getControlModels = js.Any.fromFunction0(getControlModels), getGroup = js.Any.fromFunction3(getGroup), getGroupByName = js.Any.fromFunction2(getGroupByName), getGroupControl = js.Any.fromFunction0(getGroupControl), getGroupCount = js.Any.fromFunction0(getGroupCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControlModels = js.Any.fromFunction1(setControlModels), setGroup = js.Any.fromFunction2(setGroup), setGroupControl = js.Any.fromFunction1(setGroupControl))
    __obj.asInstanceOf[XTabControllerModel]
  }
}

