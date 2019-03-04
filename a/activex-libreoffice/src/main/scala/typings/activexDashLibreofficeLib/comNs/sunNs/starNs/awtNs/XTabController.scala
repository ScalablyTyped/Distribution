package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the basic operations for a tab controller. */
trait XTabController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the control container. */
  var Container: XControlContainer
  /** returns all controls of the control container. */
  val Controls: activexDashInteropLib.SafeArray[XControl]
  /** sets the focus to the first control that can be reached with the TAB key. */
  def activateFirst(): scala.Unit
  /** sets the focus to the last control that can be reached with the TAB key. */
  def activateLast(): scala.Unit
  /** activates tab order. */
  def activateTabOrder(): scala.Unit
  /** enables automatic tab order. */
  def autoTabOrder(): scala.Unit
  /** returns the control container. */
  def getContainer(): XControlContainer
  /** returns all controls of the control container. */
  def getControls(): activexDashInteropLib.SafeArray[XControl]
  /** returns the tab controller model. */
  def getModel(): XTabControllerModel
  /** set the control container. */
  def setContainer(Container: XControlContainer): scala.Unit
  /** sets the tab controller model. */
  def setModel(Model: XTabControllerModel): scala.Unit
}

object XTabController {
  @scala.inline
  def apply(
    Container: XControlContainer,
    Controls: activexDashInteropLib.SafeArray[XControl],
    acquire: js.Function0[scala.Unit],
    activateFirst: js.Function0[scala.Unit],
    activateLast: js.Function0[scala.Unit],
    activateTabOrder: js.Function0[scala.Unit],
    autoTabOrder: js.Function0[scala.Unit],
    getContainer: js.Function0[XControlContainer],
    getControls: js.Function0[activexDashInteropLib.SafeArray[XControl]],
    getModel: js.Function0[XTabControllerModel],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setContainer: js.Function1[XControlContainer, scala.Unit],
    setModel: js.Function1[XTabControllerModel, scala.Unit]
  ): XTabController = {
    val __obj = js.Dynamic.literal(Container = Container, Controls = Controls, acquire = acquire, activateFirst = activateFirst, activateLast = activateLast, activateTabOrder = activateTabOrder, autoTabOrder = autoTabOrder, getContainer = getContainer, getControls = getControls, getModel = getModel, queryInterface = queryInterface, release = release, setContainer = setContainer, setModel = setModel)
  
    __obj.asInstanceOf[XTabController]
  }
}

