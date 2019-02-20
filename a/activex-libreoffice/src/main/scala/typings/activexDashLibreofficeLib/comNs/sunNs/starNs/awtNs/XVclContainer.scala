package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a VCL container window.
  * @deprecated Deprecated
  */
trait XVclContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all windows. */
  val Windows: activexDashInteropLib.SafeArray[XWindow]
  /** adds the specified container listener to receive container events from this container. */
  def addVclContainerListener(l: XVclContainerListener): scala.Unit
  /** returns all windows. */
  def getWindows(): activexDashInteropLib.SafeArray[XWindow]
  /** removes the specified container listener so that it no longer receives container events from this container. */
  def removeVclContainerListener(l: XVclContainerListener): scala.Unit
}

