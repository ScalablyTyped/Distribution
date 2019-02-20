package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the controls within an {@link UnoControlContainer} . */
trait XControlContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all controls. */
  val Controls: activexDashInteropLib.SafeArray[XControl]
  /** adds the given control with the specified name to the container. */
  def addControl(Name: java.lang.String, Control: XControl): scala.Unit
  /** returns the control with the specified name. */
  def getControl(aName: java.lang.String): XControl
  /** returns all controls. */
  def getControls(): activexDashInteropLib.SafeArray[XControl]
  /** removes the given control from the container. */
  def removeControl(Control: XControl): scala.Unit
  /** sets the status text in the status bar of the container. */
  def setStatusText(StatusText: java.lang.String): scala.Unit
}

