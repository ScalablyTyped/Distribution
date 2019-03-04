package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * provides read access on currently representation of the {@link com.sun.star.document.MediaDescriptor} of this model which describes the model and his
    * state
    * @returns the arguments with which the model was originally created or stored the last time.
    */
  val Args: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * provides access to the controller which currently controls this model
    * @returns If the controller which is active is a controller of this model, it will be returned. If not, the controller which was the last active of this mo
    */
  var CurrentController: XController
  /**
    * provides read access on current selection on controller
    * @returns the current selection in the current controller. If there is no current controller, it returns `NULL` .
    */
  val CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * provides information about the location of this model
    * @returns the URL of the resource which is represented by this model.
    * @see XStorable.getLocation()
    */
  val URL: java.lang.String
  /**
    * informs a model about its resource description.
    * @param URL specifies the resource
    * @param Arguments are optional arguments for that resource (see {@link com.sun.star.document.MediaDescriptor} )
    * @returns `TRUE` for success ; `FALSE` otherwise
    */
  def attachResource(
    URL: java.lang.String,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Boolean
  /**
    * is called whenever a new controller is created for this model.
    *
    * The {@link com.sun.star.lang.XComponent} interface of the controller must be used to recognize when it is deleted.
    * @param Controller a new controller for this model
    * @see XModel.disconnectController()
    */
  def connectController(Controller: XController): scala.Unit
  /**
    * is called whenever an existing controller should be deregistered at this model.
    *
    * The {@link com.sun.star.lang.XComponent} interface of the controller must be used to recognize when it is deleted.
    * @param Controller the existing controller which should be deregistered
    * @see XModel.connectController()
    */
  def disconnectController(Controller: XController): scala.Unit
  /**
    * provides read access on currently representation of the {@link com.sun.star.document.MediaDescriptor} of this model which describes the model and his
    * state
    * @returns the arguments with which the model was originally created or stored the last time.
    */
  def getArgs(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * provides access to the controller which currently controls this model
    * @returns If the controller which is active is a controller of this model, it will be returned. If not, the controller which was the last active of this mo
    */
  def getCurrentController(): XController
  /**
    * provides read access on current selection on controller
    * @returns the current selection in the current controller. If there is no current controller, it returns `NULL` .
    */
  def getCurrentSelection(): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * provides information about the location of this model
    * @returns the URL of the resource which is represented by this model.
    * @see XStorable.getLocation()
    */
  def getURL(): java.lang.String
  /**
    * determines if there is at least one lock remaining.
    *
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted to the controllers.
    * @returns `TRUE` if any lock exist ; `FALSE` otherwise
    */
  def hasControllersLocked(): scala.Boolean
  /**
    * suspends some notifications to the controllers which are used for display updates.
    *
    * The calls to {@link XModel.lockControllers()} and {@link XModel.unlockControllers()} may be nested and even overlapping, but they must be in pairs.
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted.
    */
  def lockControllers(): scala.Unit
  /**
    * sets a registered controller as the current controller.
    * @param Controller reference to an already existing connected controller, which should be the new active one
    * @throws com::sun::star::container::NoSuchElementException if **xController** isn't an already connected controller on this model
    */
  def setCurrentController(Controller: XController): scala.Unit
  /**
    * resumes the notifications which were suspended by {@link XModel.lockControllers()} .
    *
    * The calls to {@link XModel.lockControllers()} and {@link XModel.unlockControllers()} may be nested and even overlapping, but they must be in pairs.
    * While there is at least one lock remaining, some notifications for display updates are not broadcasted.
    */
  def unlockControllers(): scala.Unit
}

object XModel {
  @scala.inline
  def apply(
    Args: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CurrentController: XController,
    CurrentSelection: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    URL: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attachResource: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Boolean
    ],
    connectController: js.Function1[XController, scala.Unit],
    disconnectController: js.Function1[XController, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getArgs: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getCurrentController: js.Function0[XController],
    getCurrentSelection: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getURL: js.Function0[java.lang.String],
    hasControllersLocked: js.Function0[scala.Boolean],
    lockControllers: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setCurrentController: js.Function1[XController, scala.Unit],
    unlockControllers: js.Function0[scala.Unit]
  ): XModel = {
    val __obj = js.Dynamic.literal(Args = Args, CurrentController = CurrentController, CurrentSelection = CurrentSelection, URL = URL, acquire = acquire, addEventListener = addEventListener, attachResource = attachResource, connectController = connectController, disconnectController = disconnectController, dispose = dispose, getArgs = getArgs, getCurrentController = getCurrentController, getCurrentSelection = getCurrentSelection, getURL = getURL, hasControllersLocked = hasControllersLocked, lockControllers = lockControllers, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setCurrentController = setCurrentController, unlockControllers = unlockControllers)
  
    __obj.asInstanceOf[XModel]
  }
}

