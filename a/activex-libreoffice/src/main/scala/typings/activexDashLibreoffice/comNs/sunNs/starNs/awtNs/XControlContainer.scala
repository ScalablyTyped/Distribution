package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the controls within an {@link UnoControlContainer} . */
trait XControlContainer extends XInterface {
  /** returns all controls. */
  val Controls: SafeArray[XControl]
  /** adds the given control with the specified name to the container. */
  def addControl(Name: String, Control: XControl): Unit
  /** returns the control with the specified name. */
  def getControl(aName: String): XControl
  /** returns all controls. */
  def getControls(): SafeArray[XControl]
  /** removes the given control from the container. */
  def removeControl(Control: XControl): Unit
  /** sets the status text in the status bar of the container. */
  def setStatusText(StatusText: String): Unit
}

object XControlContainer {
  @scala.inline
  def apply(
    Controls: SafeArray[XControl],
    acquire: () => Unit,
    addControl: (String, XControl) => Unit,
    getControl: String => XControl,
    getControls: () => SafeArray[XControl],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeControl: XControl => Unit,
    setStatusText: String => Unit
  ): XControlContainer = {
    val __obj = js.Dynamic.literal(Controls = Controls, acquire = js.Any.fromFunction0(acquire), addControl = js.Any.fromFunction2(addControl), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeControl = js.Any.fromFunction1(removeControl), setStatusText = js.Any.fromFunction1(setStatusText))
  
    __obj.asInstanceOf[XControlContainer]
  }
}

