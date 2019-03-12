package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the controls within an {@link UnoControlContainer} . */
trait XControlContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all controls. */
  val Controls: stdLib.SafeArray[XControl]
  /** adds the given control with the specified name to the container. */
  def addControl(Name: java.lang.String, Control: XControl): scala.Unit
  /** returns the control with the specified name. */
  def getControl(aName: java.lang.String): XControl
  /** returns all controls. */
  def getControls(): stdLib.SafeArray[XControl]
  /** removes the given control from the container. */
  def removeControl(Control: XControl): scala.Unit
  /** sets the status text in the status bar of the container. */
  def setStatusText(StatusText: java.lang.String): scala.Unit
}

object XControlContainer {
  @scala.inline
  def apply(
    Controls: stdLib.SafeArray[XControl],
    acquire: () => scala.Unit,
    addControl: (java.lang.String, XControl) => scala.Unit,
    getControl: java.lang.String => XControl,
    getControls: () => stdLib.SafeArray[XControl],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeControl: XControl => scala.Unit,
    setStatusText: java.lang.String => scala.Unit
  ): XControlContainer = {
    val __obj = js.Dynamic.literal(Controls = Controls, acquire = js.Any.fromFunction0(acquire), addControl = js.Any.fromFunction2(addControl), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeControl = js.Any.fromFunction1(removeControl), setStatusText = js.Any.fromFunction1(setStatusText))
  
    __obj.asInstanceOf[XControlContainer]
  }
}

