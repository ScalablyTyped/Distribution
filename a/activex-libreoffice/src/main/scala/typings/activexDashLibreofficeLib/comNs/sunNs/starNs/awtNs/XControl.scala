package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * identifies a control.
  *
  * Implementations of this interface are abstract windows. The main reason to instantiate this implementation is to show the window on the screen. Before
  * the window appears on the screen, the {@link XControl.createPeer()} method must be called.
  *
  * If the implementation of the control does not distinguish between model, view and controller, it must allow to set a new {@link XGraphics} in the
  * view, so that the control can be printed.
  */
trait XControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /** gets the context of the control. */
  var Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** returns the model for this control. */
  var Model: XControlModel
  /** returns the peer which was previously created or set. */
  val Peer: XWindowPeer
  /** returns the view of this control. */
  val View: XView
  /**
    * creates a "child" window on the screen.
    *
    * If the parent is NULL, then the desktop window of the toolkit is the parent.
    */
  def createPeer(Toolkit: XToolkit, Parent: XWindowPeer): scala.Unit
  /** gets the context of the control. */
  def getContext(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /** returns the model for this control. */
  def getModel(): XControlModel
  /** returns the peer which was previously created or set. */
  def getPeer(): XWindowPeer
  /** returns the view of this control. */
  def getView(): XView
  /** returns `TRUE` if the control is in design mode, `FALSE` otherwise. */
  def isDesignMode(): scala.Boolean
  /** returns `TRUE` if the control is transparent, `FALSE` otherwise. */
  def isTransparent(): scala.Boolean
  /** sets the context of the control. */
  def setContext(Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): scala.Unit
  /**
    * sets the design mode for use in a design editor.
    *
    * Normally the control will be painted directly without a peer.
    */
  def setDesignMode(bOn: scala.Boolean): scala.Unit
  /** sets a model for the control. */
  def setModel(Model: XControlModel): scala.Boolean
}

