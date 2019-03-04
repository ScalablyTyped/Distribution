package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the main interface of a desktop service.
  *
  * A desktop is an environment for components which can be viewed in frames. Frames are like frames in HTML framesets. This does not imply that a desktop
  * can handle framesets; the frames may be top frames only.
  * @see Desktop
  */
trait XDesktop
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides read access to collection of all currently loaded components inside the frame tree
    *
    * The component is, by definition, the model of the control which is loaded into a frame, or if no model exists, into the control itself. The service
    * {@link Components} which is available from this method is a collection of all components of the desktop which are open within a frame of the desktop.
    * @returns the collection of all components
    * @see Components
    */
  val Components: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /**
    * provides read access to the component inside the tree which has the UI focus
    *
    * Normally, the component is the model part of the active component. If no model exists it is the active controller (view) itself.
    * @returns the component within the desktop environment which has the UI focus.
    * @see XDesktop.getCurrentFrame()
    */
  val CurrentComponent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /**
    * provides read access to the frame which contains the current component
    * @returns the frame of the component which has the UI focus within this desktop environment
    * @see XDesktop.getCurrentComponent()
    */
  val CurrentFrame: XFrame
  /**
    * registers an event listener to the desktop, which is called when the desktop is queried to terminate, and when it really terminates.
    * @param Listener listener for termination events
    * @see XDesktop.removeTerminateListener()
    */
  def addTerminateListener(Listener: XTerminateListener): scala.Unit
  /**
    * provides read access to collection of all currently loaded components inside the frame tree
    *
    * The component is, by definition, the model of the control which is loaded into a frame, or if no model exists, into the control itself. The service
    * {@link Components} which is available from this method is a collection of all components of the desktop which are open within a frame of the desktop.
    * @returns the collection of all components
    * @see Components
    */
  def getComponents(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
  /**
    * provides read access to the component inside the tree which has the UI focus
    *
    * Normally, the component is the model part of the active component. If no model exists it is the active controller (view) itself.
    * @returns the component within the desktop environment which has the UI focus.
    * @see XDesktop.getCurrentFrame()
    */
  def getCurrentComponent(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
  /**
    * provides read access to the frame which contains the current component
    * @returns the frame of the component which has the UI focus within this desktop environment
    * @see XDesktop.getCurrentComponent()
    */
  def getCurrentFrame(): XFrame
  /**
    * unregisters an event listener for termination events.
    * @param Listener listener which wish to be deregistered
    * @see XDesktop.addTerminateListener()
    */
  def removeTerminateListener(Listener: XTerminateListener): scala.Unit
  /**
    * tries to terminate the desktop.
    *
    * First, every terminate listener is called by his {@link XTerminateListener.queryTermination()} method. Throwing of a {@link TerminationVetoException}
    * can break the termination process and the listener how has done that will be the new "controller" of the desktop lifetime. He should try to terminate
    * it by himself after his own processes will be finished. If nobody disagree with the termination request, every listener will be called by his {@link
    * XTerminateListener.notifyTermination()} method.
    * @returns `TRUE` if all listener agree with this request ; `FALSE` otherwise
    * @see XTerminateListener
    * @see TerminationVetoException
    */
  def terminate(): scala.Boolean
}

object XDesktop {
  @scala.inline
  def apply(
    Components: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess,
    CurrentComponent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent,
    CurrentFrame: XFrame,
    acquire: js.Function0[scala.Unit],
    addTerminateListener: js.Function1[XTerminateListener, scala.Unit],
    getComponents: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess],
    getCurrentComponent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent],
    getCurrentFrame: js.Function0[XFrame],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTerminateListener: js.Function1[XTerminateListener, scala.Unit],
    terminate: js.Function0[scala.Boolean]
  ): XDesktop = {
    val __obj = js.Dynamic.literal(Components = Components, CurrentComponent = CurrentComponent, CurrentFrame = CurrentFrame, acquire = acquire, addTerminateListener = addTerminateListener, getComponents = getComponents, getCurrentComponent = getCurrentComponent, getCurrentFrame = getCurrentFrame, queryInterface = queryInterface, release = release, removeTerminateListener = removeTerminateListener, terminate = terminate)
  
    __obj.asInstanceOf[XDesktop]
  }
}

