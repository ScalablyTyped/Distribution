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

