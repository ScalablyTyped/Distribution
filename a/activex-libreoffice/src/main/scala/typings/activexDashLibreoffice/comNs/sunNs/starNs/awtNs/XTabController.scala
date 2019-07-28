package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the basic operations for a tab controller. */
trait XTabController extends XInterface {
  /** returns the control container. */
  var Container: XControlContainer
  /** returns all controls of the control container. */
  val Controls: SafeArray[XControl]
  /** sets the focus to the first control that can be reached with the TAB key. */
  def activateFirst(): Unit
  /** sets the focus to the last control that can be reached with the TAB key. */
  def activateLast(): Unit
  /** activates tab order. */
  def activateTabOrder(): Unit
  /** enables automatic tab order. */
  def autoTabOrder(): Unit
  /** returns the control container. */
  def getContainer(): XControlContainer
  /** returns all controls of the control container. */
  def getControls(): SafeArray[XControl]
  /** returns the tab controller model. */
  def getModel(): XTabControllerModel
  /** set the control container. */
  def setContainer(Container: XControlContainer): Unit
  /** sets the tab controller model. */
  def setModel(Model: XTabControllerModel): Unit
}

object XTabController {
  @scala.inline
  def apply(
    Container: XControlContainer,
    Controls: SafeArray[XControl],
    acquire: () => Unit,
    activateFirst: () => Unit,
    activateLast: () => Unit,
    activateTabOrder: () => Unit,
    autoTabOrder: () => Unit,
    getContainer: () => XControlContainer,
    getControls: () => SafeArray[XControl],
    getModel: () => XTabControllerModel,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setContainer: XControlContainer => Unit,
    setModel: XTabControllerModel => Unit
  ): XTabController = {
    val __obj = js.Dynamic.literal(Container = Container, Controls = Controls, acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), autoTabOrder = js.Any.fromFunction0(autoTabOrder), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel))
  
    __obj.asInstanceOf[XTabController]
  }
}

