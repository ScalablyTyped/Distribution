package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive window events.
  * @see XActivateListener
  */
trait XTopWindowListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a window is activated. */
  def windowActivated(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is invoked when a window has been closed. */
  def windowClosed(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /**
    * is invoked when a window is in the process of being closed.
    *
    * The close operation can be overridden at this point.
    */
  def windowClosing(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is invoked when a window is deactivated. */
  def windowDeactivated(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is invoked when a window is iconified. */
  def windowMinimized(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is invoked when a window is deiconified. */
  def windowNormalized(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is invoked when a window has been opened. */
  def windowOpened(e: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

