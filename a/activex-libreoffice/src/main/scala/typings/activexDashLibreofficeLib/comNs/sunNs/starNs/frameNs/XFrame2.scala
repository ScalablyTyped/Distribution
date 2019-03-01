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
    SupportedCommandGroups: activexDashInteropLib.SafeArray[scala.Double],
    Title: java.lang.String,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: js.Function0[scala.Unit],
    activate: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    contextChanged: js.Function0[scala.Unit],
    createStatusIndicator: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XStatusIndicator],
    deactivate: js.Function0[scala.Unit],
    dispose: js.Function0[scala.Unit],
    findFrame: js.Function2[java.lang.String, scala.Double, XFrame],
    getActiveFrame: js.Function0[XFrame],
    getComponentWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getConfigurableDispatchInformation: js.Function1[scala.Double, activexDashInteropLib.SafeArray[DispatchInformation]],
    getContainerWindow: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow],
    getController: js.Function0[XController],
    getCreator: js.Function0[XFramesSupplier],
    getFrames: js.Function0[XFrames],
    getName: js.Function0[java.lang.String],
    getSupportedCommandGroups: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    initialize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, scala.Unit],
    isActive: js.Function0[scala.Boolean],
    isTop: js.Function0[scala.Boolean],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor], 
      activexDashInteropLib.SafeArray[XDispatch]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerDispatchProviderInterceptor: js.Function1[XDispatchProviderInterceptor, scala.Unit],
    release: js.Function0[scala.Unit],
    releaseDispatchProviderInterceptor: js.Function1[XDispatchProviderInterceptor, scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFrameActionListener: js.Function1[XFrameActionListener, scala.Unit],
    setActiveFrame: js.Function1[XFrame, scala.Unit],
    setComponent: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      XController, 
      scala.Boolean
    ],
    setCreator: js.Function1[XFramesSupplier, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): XFrame2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveFrame")(ActiveFrame)
    __obj.updateDynamic("ComponentWindow")(ComponentWindow)
    __obj.updateDynamic("ContainerWindow")(ContainerWindow)
    __obj.updateDynamic("Controller")(Controller)
    __obj.updateDynamic("Creator")(Creator)
    __obj.updateDynamic("DispatchRecorderSupplier")(DispatchRecorderSupplier)
    __obj.updateDynamic("Frames")(Frames)
    __obj.updateDynamic("LayoutManager")(LayoutManager)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("SupportedCommandGroups")(SupportedCommandGroups)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFrameActionListener")(addFrameActionListener)
    __obj.updateDynamic("contextChanged")(contextChanged)
    __obj.updateDynamic("createStatusIndicator")(createStatusIndicator)
    __obj.updateDynamic("deactivate")(deactivate)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("findFrame")(findFrame)
    __obj.updateDynamic("getActiveFrame")(getActiveFrame)
    __obj.updateDynamic("getComponentWindow")(getComponentWindow)
    __obj.updateDynamic("getConfigurableDispatchInformation")(getConfigurableDispatchInformation)
    __obj.updateDynamic("getContainerWindow")(getContainerWindow)
    __obj.updateDynamic("getController")(getController)
    __obj.updateDynamic("getCreator")(getCreator)
    __obj.updateDynamic("getFrames")(getFrames)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getSupportedCommandGroups")(getSupportedCommandGroups)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("isTop")(isTop)
    __obj.updateDynamic("queryDispatch")(queryDispatch)
    __obj.updateDynamic("queryDispatches")(queryDispatches)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerDispatchProviderInterceptor")(registerDispatchProviderInterceptor)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseDispatchProviderInterceptor")(releaseDispatchProviderInterceptor)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFrameActionListener")(removeFrameActionListener)
    __obj.updateDynamic("setActiveFrame")(setActiveFrame)
    __obj.updateDynamic("setComponent")(setComponent)
    __obj.updateDynamic("setCreator")(setCreator)
    __obj.updateDynamic("setName")(setName)
    __obj.asInstanceOf[XFrame2]
  }
}

