package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.task.XStatusIndicator
import typings.activexLibreoffice.com_.sun.star.task.XStatusIndicatorFactory
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XFrame2
  extends XFramesSupplier
     with XDispatchProvider
     with XDispatchInformationProvider
     with XDispatchProviderInterception
     with XStatusIndicatorFactory {
  /**
    * provides access to the dispatch recorder of the frame
    *
    * Such recorder can be used to record dispatch requests. The supplier contains a dispatch recorder and provide the functionality to use it for any
    * dispatch object from outside which supports the interface {@link XDispatch} . A supplier is available only, if recording was enabled. That means: if
    * someone wishes to enable recoding on a frame they must set a supplier with a recorder object inside of it. Every user of dispatches has to check then if
    * such supplier is available at this frame property. If value of this property is `NULL` they must call {@link XDispatch.dispatch()} on the original
    * dispatch object. If it's a valid value they must use the supplier by calling its method {@link XDispatchRecorderSupplier.dispatchAndRecord()} with the
    * original dispatch object as argument.
    *
    * Note: ;  It's not recommended to cache an already gotten supplier. Because there exist no possibility to check for enabled/disabled recording then.
    * @since OOo 1.1.2
    */
  var DispatchRecorderSupplier: XDispatchRecorderSupplier
  /**
    * Provides access to the {@link LayoutManager} of the frame. This is actually of type {@link XLayoutManager} , but this API is still experimental
    * (unpublished).
    */
  var LayoutManager: XInterface
  /**
    * if possible it sets/gets the UI title on/from the frame container window
    *
    * It depends from the type of the frame container window. If it is a system task window all will be OK. Otherwise the title can't be set.
    * Setting/getting of the pure value of this property must be possible in every case. Only showing on the UI can be fail.
    */
  var Title: String
  /** contains user defined attributes. */
  var UserDefinedAttributes: XNameContainer
}

object XFrame2 {
  @scala.inline
  def apply(
    ActiveFrame: XFrame,
    ComponentWindow: XWindow,
    ContainerWindow: XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    DispatchRecorderSupplier: XDispatchRecorderSupplier,
    Frames: XFrames,
    LayoutManager: XInterface,
    Name: String,
    SupportedCommandGroups: SafeArray[Double],
    Title: String,
    UserDefinedAttributes: XNameContainer,
    acquire: () => Unit,
    activate: () => Unit,
    addEventListener: XEventListener => Unit,
    addFrameActionListener: XFrameActionListener => Unit,
    contextChanged: () => Unit,
    createStatusIndicator: () => XStatusIndicator,
    deactivate: () => Unit,
    dispose: () => Unit,
    findFrame: (String, Double) => XFrame,
    getActiveFrame: () => XFrame,
    getComponentWindow: () => XWindow,
    getConfigurableDispatchInformation: Double => SafeArray[DispatchInformation],
    getContainerWindow: () => XWindow,
    getController: () => XController,
    getCreator: () => XFramesSupplier,
    getFrames: () => XFrames,
    getName: () => String,
    getSupportedCommandGroups: () => SafeArray[Double],
    initialize: XWindow => Unit,
    isActive: () => Boolean,
    isTop: () => Boolean,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Unit,
    release: () => Unit,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Unit,
    removeEventListener: XEventListener => Unit,
    removeFrameActionListener: XFrameActionListener => Unit,
    setActiveFrame: XFrame => Unit,
    setComponent: (XWindow, XController) => Boolean,
    setCreator: XFramesSupplier => Unit,
    setName: String => Unit
  ): XFrame2 = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame.asInstanceOf[js.Any], ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DispatchRecorderSupplier = DispatchRecorderSupplier.asInstanceOf[js.Any], Frames = Frames.asInstanceOf[js.Any], LayoutManager = LayoutManager.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SupportedCommandGroups = SupportedCommandGroups.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), contextChanged = js.Any.fromFunction0(contextChanged), createStatusIndicator = js.Any.fromFunction0(createStatusIndicator), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = js.Any.fromFunction0(getActiveFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getConfigurableDispatchInformation = js.Any.fromFunction1(getConfigurableDispatchInformation), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getFrames = js.Any.fromFunction0(getFrames), getName = js.Any.fromFunction0(getName), getSupportedCommandGroups = js.Any.fromFunction0(getSupportedCommandGroups), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1(registerDispatchProviderInterceptor), release = js.Any.fromFunction0(release), releaseDispatchProviderInterceptor = js.Any.fromFunction1(releaseDispatchProviderInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), setActiveFrame = js.Any.fromFunction1(setActiveFrame), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XFrame2]
  }
}

