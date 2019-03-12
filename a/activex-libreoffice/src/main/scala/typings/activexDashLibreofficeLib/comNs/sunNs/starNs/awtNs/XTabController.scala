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
  val Controls: stdLib.SafeArray[XControl]
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
  def getControls(): stdLib.SafeArray[XControl]
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
    Controls: stdLib.SafeArray[XControl],
    acquire: () => scala.Unit,
    activateFirst: () => scala.Unit,
    activateLast: () => scala.Unit,
    activateTabOrder: () => scala.Unit,
    autoTabOrder: () => scala.Unit,
    getContainer: () => XControlContainer,
    getControls: () => stdLib.SafeArray[XControl],
    getModel: () => XTabControllerModel,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setContainer: XControlContainer => scala.Unit,
    setModel: XTabControllerModel => scala.Unit
  ): XTabController = {
    val __obj = js.Dynamic.literal(Container = Container, Controls = Controls, acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), autoTabOrder = js.Any.fromFunction0(autoTabOrder), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel))
  
    __obj.asInstanceOf[XTabController]
  }
}

