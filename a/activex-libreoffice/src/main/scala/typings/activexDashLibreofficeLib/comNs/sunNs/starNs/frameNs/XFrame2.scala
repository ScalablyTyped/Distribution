package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XFrame2
  extends XFramesSupplier
     with XDispatchProvider
     with XDispatchInformationProvider
     with XDispatchProviderInterception
     with activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XStatusIndicatorFactory {
  /**
    * provides access to the dispatch recorder of the frame
    *
    * Such recorder can be used to record dispatch requests. The supplier contains a dispatch recorder and provide the functionality to use it for any
    * dispatch object from outside which supports the interface {@link XDispatch} . A supplier is available only, if recording was enabled. That means: if
    * someone wishes to enable recoding on a frame he must set a supplier with a recorder object inside of it. Every user of dispatches has to check then if
    * such supplier is available at this frame property. If value of this property is `NULL` he must call {@link XDispatch.dispatch()} on the original
    * dispatch object. If it's a valid value he must use the supplier by calling his method {@link XDispatchRecorderSupplier.dispatchAndRecord()} with the
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
  var LayoutManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  /**
    * if possible it sets/gets the UI title on/from the frame container window
    *
    * It depends from the type of the frame container window. If it is a system task window all will be OK. Otherwise the title can't be set.
    * Setting/getting of the pure value of this property must be possible in every case. Only showing on the UI can be fail.
    */
  var Title: java.lang.String
  /** contains user defined attributes. */
  var UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

object XFrame2 {
  @scala.inline
  def apply(
    ActiveFrame: XFrame,
    ComponentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    ContainerWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    DispatchRecorderSupplier: XDispatchRecorderSupplier,
    Frames: XFrames,
    LayoutManager: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Name: java.lang.String,
    SupportedCommandGroups: stdLib.SafeArray[scala.Double],
    Title: java.lang.String,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: () => scala.Unit,
    activate: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFrameActionListener: XFrameActionListener => scala.Unit,
    contextChanged: () => scala.Unit,
    createStatusIndicator: () => activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XStatusIndicator,
    deactivate: () => scala.Unit,
    dispose: () => scala.Unit,
    findFrame: (java.lang.String, scala.Double) => XFrame,
    getActiveFrame: () => XFrame,
    getComponentWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getConfigurableDispatchInformation: scala.Double => stdLib.SafeArray[DispatchInformation],
    getContainerWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    getController: () => XController,
    getCreator: () => XFramesSupplier,
    getFrames: () => XFrames,
    getName: () => java.lang.String,
    getSupportedCommandGroups: () => stdLib.SafeArray[scala.Double],
    initialize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => scala.Unit,
    isActive: () => scala.Boolean,
    isTop: () => scala.Boolean,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor] => stdLib.SafeArray[XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => scala.Unit,
    release: () => scala.Unit,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFrameActionListener: XFrameActionListener => scala.Unit,
    setActiveFrame: XFrame => scala.Unit,
    setComponent: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, XController) => scala.Boolean,
    setCreator: XFramesSupplier => scala.Unit,
    setName: java.lang.String => scala.Unit
  ): XFrame2 = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame, ComponentWindow = ComponentWindow, ContainerWindow = ContainerWindow, Controller = Controller, Creator = Creator, DispatchRecorderSupplier = DispatchRecorderSupplier, Frames = Frames, LayoutManager = LayoutManager, Name = Name, SupportedCommandGroups = SupportedCommandGroups, Title = Title, UserDefinedAttributes = UserDefinedAttributes, acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), contextChanged = js.Any.fromFunction0(contextChanged), createStatusIndicator = js.Any.fromFunction0(createStatusIndicator), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = js.Any.fromFunction0(getActiveFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getConfigurableDispatchInformation = js.Any.fromFunction1(getConfigurableDispatchInformation), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getFrames = js.Any.fromFunction0(getFrames), getName = js.Any.fromFunction0(getName), getSupportedCommandGroups = js.Any.fromFunction0(getSupportedCommandGroups), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1(registerDispatchProviderInterceptor), release = js.Any.fromFunction0(release), releaseDispatchProviderInterceptor = js.Any.fromFunction1(releaseDispatchProviderInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), setActiveFrame = js.Any.fromFunction1(setActiveFrame), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName))
  
    __obj.asInstanceOf[XFrame2]
  }
}

