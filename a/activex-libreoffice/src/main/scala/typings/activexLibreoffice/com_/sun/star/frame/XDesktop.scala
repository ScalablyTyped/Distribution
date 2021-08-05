package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the main interface of a desktop service.
  *
  * A desktop is an environment for components which can be viewed in frames. Frames are like frames in HTML framesets. This does not imply that a desktop
  * can handle framesets; the frames may be top frames only.
  * @see Desktop
  */
trait XDesktop
  extends StObject
     with XInterface {
  
  /**
    * provides read access to collection of all currently loaded components inside the frame tree
    *
    * The component is, by definition, the model of the control which is loaded into a frame, or if no model exists, into the control itself. The service
    * {@link Components} which is available from this method is a collection of all components of the desktop which are open within a frame of the desktop.
    * @returns the collection of all components
    * @see Components
    */
  val Components: XEnumerationAccess
  
  /**
    * provides read access to the component inside the tree which has the UI focus
    *
    * Normally, the component is the model part of the active component. If no model exists it is the active controller (view) itself.
    * @returns the component within the desktop environment which has the UI focus.
    * @see XDesktop.getCurrentFrame()
    */
  val CurrentComponent: XComponent
  
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
  def addTerminateListener(Listener: XTerminateListener): Unit
  
  /**
    * provides read access to collection of all currently loaded components inside the frame tree
    *
    * The component is, by definition, the model of the control which is loaded into a frame, or if no model exists, into the control itself. The service
    * {@link Components} which is available from this method is a collection of all components of the desktop which are open within a frame of the desktop.
    * @returns the collection of all components
    * @see Components
    */
  def getComponents(): XEnumerationAccess
  
  /**
    * provides read access to the component inside the tree which has the UI focus
    *
    * Normally, the component is the model part of the active component. If no model exists it is the active controller (view) itself.
    * @returns the component within the desktop environment which has the UI focus.
    * @see XDesktop.getCurrentFrame()
    */
  def getCurrentComponent(): XComponent
  
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
  def removeTerminateListener(Listener: XTerminateListener): Unit
  
  /**
    * tries to terminate the desktop.
    *
    * First, every terminate listener is called by their {@link XTerminateListener.queryTermination()} method. Throwing of a {@link TerminationVetoException}
    * can break the termination process and the listener how has done that will be the new "controller" of the desktop lifetime. They should try to terminate
    * it by themselves after their own processes will be finished. If nobody disagree with the termination request, every listener will be called by their {@link
    * XTerminateListener.notifyTermination()} method.
    * @returns `TRUE` if all listener agree with this request ; `FALSE` otherwise
    * @see XTerminateListener
    * @see TerminationVetoException
    */
  def terminate(): Boolean
}
object XDesktop {
  
  inline def apply(
    Components: XEnumerationAccess,
    CurrentComponent: XComponent,
    CurrentFrame: XFrame,
    acquire: () => Unit,
    addTerminateListener: XTerminateListener => Unit,
    getComponents: () => XEnumerationAccess,
    getCurrentComponent: () => XComponent,
    getCurrentFrame: () => XFrame,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTerminateListener: XTerminateListener => Unit,
    terminate: () => Boolean
  ): XDesktop = {
    val __obj = js.Dynamic.literal(Components = Components.asInstanceOf[js.Any], CurrentComponent = CurrentComponent.asInstanceOf[js.Any], CurrentFrame = CurrentFrame.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addTerminateListener = js.Any.fromFunction1(addTerminateListener), getComponents = js.Any.fromFunction0(getComponents), getCurrentComponent = js.Any.fromFunction0(getCurrentComponent), getCurrentFrame = js.Any.fromFunction0(getCurrentFrame), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTerminateListener = js.Any.fromFunction1(removeTerminateListener), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[XDesktop]
  }
  
  extension [Self <: XDesktop](x: Self) {
    
    inline def setAddTerminateListener(value: XTerminateListener => Unit): Self = StObject.set(x, "addTerminateListener", js.Any.fromFunction1(value))
    
    inline def setComponents(value: XEnumerationAccess): Self = StObject.set(x, "Components", value.asInstanceOf[js.Any])
    
    inline def setCurrentComponent(value: XComponent): Self = StObject.set(x, "CurrentComponent", value.asInstanceOf[js.Any])
    
    inline def setCurrentFrame(value: XFrame): Self = StObject.set(x, "CurrentFrame", value.asInstanceOf[js.Any])
    
    inline def setGetComponents(value: () => XEnumerationAccess): Self = StObject.set(x, "getComponents", js.Any.fromFunction0(value))
    
    inline def setGetCurrentComponent(value: () => XComponent): Self = StObject.set(x, "getCurrentComponent", js.Any.fromFunction0(value))
    
    inline def setGetCurrentFrame(value: () => XFrame): Self = StObject.set(x, "getCurrentFrame", js.Any.fromFunction0(value))
    
    inline def setRemoveTerminateListener(value: XTerminateListener => Unit): Self = StObject.set(x, "removeTerminateListener", js.Any.fromFunction1(value))
    
    inline def setTerminate(value: () => Boolean): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
