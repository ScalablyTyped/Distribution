package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a component which is created from an URL and arguments.
  *
  * It is a representation of a resource in the sense that it was created/loaded from the resource. The arguments are passed to the loader to modify its
  * behavior. An example for such an argument is "AsTemplate", which loads the resource as a template for a new document. (see {@link
  * com.sun.star.document.MediaDescriptor} for further details)
  *
  * Models can be controlled by controller components, which are usually views of the model. (see {@link Controller} for further details)
  *
  * If there is at least one controller, there is by definition a current controller. And if that controller supports the interface {@link
  * com.sun.star.view.XSelectionSupplier} , it has a current selection too.
  * @see com.sun.star.document.MediaDescriptor
  * @see Controller
  * @see com.sun.star.view.XSelectionSupplier
  */
trait XModel
  extends StObject
     with XComponent {
  
  /**
    * provides read access on currently representation of the {@link com.sun.star.document.MediaDescriptor} of this model which describes the model and its
    * state
    * @returns the arguments with which the model was originally created or stored the last time.
    */
  val Args: SafeArray[PropertyValue]
  
  /**
    * provides access to the controller which currently controls this model
    * @returns If the controller which is active is a controller of this model, it will be returned. If not, the controller which was the last active of this mo
    */
  var CurrentController: XController
  
  /**
    * provides read access on current selection on controller
    * @returns the current selection in the current controller. If there is no current controller, it returns `NULL` .
    */
  val CurrentSelection: XInterface
  
  /**
    * provides information about the location of this model
    * @returns the URL of the resource which is represented by this model.
    * @see XStorable.getLocation()
    */
  val URL: String
  
  /**
    * informs a model about its resource description.
    * @param URL specifies the resource
    * @param Arguments are optional arguments for that resource (see {@link com.sun.star.document.MediaDescriptor} )
    * @returns `TRUE` for success ; `FALSE` otherwise
    */
  def attachResource(URL: String, Arguments: SeqEquiv[PropertyValue]): Boolean
  
  /**
    * is called whenever a new controller is created for this model.
    *
    * The {@link com.sun.star.lang.XComponent} interface of the controller must be used to recognize when it is deleted.
    * @param Controller a new controller for this model
    * @see XModel.disconnectController()
    */
  def connectController(Controller: XController): Unit
  
  /**
    * is called whenever an existing controller should be deregistered at this model.
    *
    * The {@link com.sun.star.lang.XComponent} interface of the controller must be used to recognize when it is deleted.
    * @param Controller the existing controller which should be deregistered
    * @see XModel.connectController()
    */
  def disconnectController(Controller: XController): Unit
  
  /**
    * provides read access on currently representation of the {@link com.sun.star.document.MediaDescriptor} of this model which describes the model and its
    * state
    * @returns the arguments with which the model was originally created or stored the last time.
    */
  def getArgs(): SafeArray[PropertyValue]
  
  /**
    * provides access to the controller which currently controls this model
    * @returns If the controller which is active is a controller of this model, it will be returned. If not, the controller which was the last active of this mo
    */
  def getCurrentController(): XController
  
  /**
    * provides read access on current selection on controller
    * @returns the current selection in the current controller. If there is no current controller, it returns `NULL` .
    */
  def getCurrentSelection(): XInterface
  
  /**
    * provides information about the location of this model
    * @returns the URL of the resource which is represented by this model.
    * @see XStorable.getLocation()
    */
  def getURL(): String
  
  /**
    * determines if there is at least one lock remaining.
    *
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted to the controllers.
    * @returns `TRUE` if any lock exist ; `FALSE` otherwise
    */
  def hasControllersLocked(): Boolean
  
  /**
    * suspends some notifications to the controllers which are used for display updates.
    *
    * The calls to {@link XModel.lockControllers()} and {@link XModel.unlockControllers()} may be nested and even overlapping, but they must be in pairs.
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted.
    */
  def lockControllers(): Unit
  
  /**
    * sets a registered controller as the current controller.
    * @param Controller reference to an already existing connected controller, which should be the new active one
    * @throws com::sun::star::container::NoSuchElementException if **xController** isn't an already connected controller on this model
    */
  def setCurrentController(Controller: XController): Unit
  
  /**
    * resumes the notifications which were suspended by {@link XModel.lockControllers()} .
    *
    * The calls to {@link XModel.lockControllers()} and {@link XModel.unlockControllers()} may be nested and even overlapping, but they must be in pairs.
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted.
    */
  def unlockControllers(): Unit
}
object XModel {
  
  @scala.inline
  def apply(
    Args: SafeArray[PropertyValue],
    CurrentController: XController,
    CurrentSelection: XInterface,
    URL: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attachResource: (String, SeqEquiv[PropertyValue]) => Boolean,
    connectController: XController => Unit,
    disconnectController: XController => Unit,
    dispose: () => Unit,
    getArgs: () => SafeArray[PropertyValue],
    getCurrentController: () => XController,
    getCurrentSelection: () => XInterface,
    getURL: () => String,
    hasControllersLocked: () => Boolean,
    lockControllers: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setCurrentController: XController => Unit,
    unlockControllers: () => Unit
  ): XModel = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], CurrentController = CurrentController.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachResource = js.Any.fromFunction2(attachResource), connectController = js.Any.fromFunction1(connectController), disconnectController = js.Any.fromFunction1(disconnectController), dispose = js.Any.fromFunction0(dispose), getArgs = js.Any.fromFunction0(getArgs), getCurrentController = js.Any.fromFunction0(getCurrentController), getCurrentSelection = js.Any.fromFunction0(getCurrentSelection), getURL = js.Any.fromFunction0(getURL), hasControllersLocked = js.Any.fromFunction0(hasControllersLocked), lockControllers = js.Any.fromFunction0(lockControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setCurrentController = js.Any.fromFunction1(setCurrentController), unlockControllers = js.Any.fromFunction0(unlockControllers))
    __obj.asInstanceOf[XModel]
  }
  
  @scala.inline
  implicit class XModelMutableBuilder[Self <: XModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: SafeArray[PropertyValue]): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachResource(value: (String, SeqEquiv[PropertyValue]) => Boolean): Self = StObject.set(x, "attachResource", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConnectController(value: XController => Unit): Self = StObject.set(x, "connectController", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrentController(value: XController): Self = StObject.set(x, "CurrentController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentSelection(value: XInterface): Self = StObject.set(x, "CurrentSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnectController(value: XController => Unit): Self = StObject.set(x, "disconnectController", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetArgs(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getArgs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentController(value: () => XController): Self = StObject.set(x, "getCurrentController", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentSelection(value: () => XInterface): Self = StObject.set(x, "getCurrentSelection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasControllersLocked(value: () => Boolean): Self = StObject.set(x, "hasControllersLocked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLockControllers(value: () => Unit): Self = StObject.set(x, "lockControllers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCurrentController(value: XController => Unit): Self = StObject.set(x, "setCurrentController", js.Any.fromFunction1(value))
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnlockControllers(value: () => Unit): Self = StObject.set(x, "unlockControllers", js.Any.fromFunction0(value))
  }
}
