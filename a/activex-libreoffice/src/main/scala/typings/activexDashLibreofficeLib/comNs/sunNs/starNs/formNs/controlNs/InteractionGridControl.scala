package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is an extended grid control, which allows the user to customize some of its user interface's aspects. */
trait InteractionGridControl
  extends GridControl
     with activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatch

object InteractionGridControl {
  @scala.inline
  def apply(
    AccessibleContext: activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext,
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Count: scala.Double,
    CurrentColumnPosition: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    Graphics: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics,
    Mode: java.lang.String,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel,
    Peer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer,
    PosSize: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle,
    Selection: js.Any,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    SupportedModes: activexDashInteropLib.SafeArray[java.lang.String],
    View: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    addGridControlListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XGridControlListener, 
      scala.Unit
    ],
    addKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    addModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    addMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    addMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    addPaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    addSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    addStatusListener: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XStatusListener, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      scala.Unit
    ],
    addUpdateListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XUpdateListener, scala.Unit],
    addWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    commit: js.Function0[scala.Boolean],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    createPeer: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XToolkit, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer, 
      scala.Unit
    ],
    dispatch: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    draw: js.Function2[scala.Double, scala.Double, scala.Unit],
    getAccessibleContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext],
    getByIndex: js.Function1[scala.Double, js.Any],
    getContext: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    getCount: js.Function0[scala.Double],
    getCurrentColumnPosition: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getGraphics: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics],
    getMode: js.Function0[java.lang.String],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel],
    getPeer: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowPeer],
    getPosSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle],
    getSelection: js.Function0[js.Any],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    getSupportedModes: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getView: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XView],
    hasElements: js.Function0[scala.Boolean],
    isDesignMode: js.Function0[scala.Boolean],
    isTransparent: js.Function0[scala.Boolean],
    queryFieldData: js.Function2[scala.Double, activexDashLibreofficeLib.`type`, activexDashInteropLib.SafeArray[_]],
    queryFieldDataType: js.Function1[activexDashLibreofficeLib.`type`, activexDashInteropLib.SafeArray[scala.Boolean]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerDispatchProviderInterceptor: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProviderInterceptor, 
      scala.Unit
    ],
    release: js.Function0[scala.Unit],
    releaseDispatchProviderInterceptor: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProviderInterceptor, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeFocusListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XFocusListener, scala.Unit],
    removeGridControlListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XGridControlListener, 
      scala.Unit
    ],
    removeKeyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XKeyListener, scala.Unit],
    removeModifyListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener, scala.Unit],
    removeMouseListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseListener, scala.Unit],
    removeMouseMotionListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XMouseMotionListener, 
      scala.Unit
    ],
    removePaintListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XPaintListener, scala.Unit],
    removeSelectionChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XSelectionChangeListener, 
      scala.Unit
    ],
    removeStatusListener: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XStatusListener, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      scala.Unit
    ],
    removeUpdateListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XUpdateListener, scala.Unit],
    removeWindowListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindowListener, scala.Unit],
    select: js.Function1[js.Any, scala.Boolean],
    setContext: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit],
    setCurrentColumnPosition: js.Function1[scala.Double, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setEnable: js.Function1[scala.Boolean, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setGraphics: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XGraphics, scala.Boolean],
    setMode: js.Function1[java.lang.String, scala.Unit],
    setModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel, scala.Boolean],
    setPosSize: js.Function5[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit],
    setZoom: js.Function2[scala.Double, scala.Double, scala.Unit],
    supportsMode: js.Function1[java.lang.String, scala.Boolean]
  ): InteractionGridControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AccessibleContext")(AccessibleContext)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("CurrentColumnPosition")(CurrentColumnPosition)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("Graphics")(Graphics)
    __obj.updateDynamic("Mode")(Mode)
    __obj.updateDynamic("Model")(Model)
    __obj.updateDynamic("Peer")(Peer)
    __obj.updateDynamic("PosSize")(PosSize)
    __obj.updateDynamic("Selection")(Selection)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("SupportedModes")(SupportedModes)
    __obj.updateDynamic("View")(View)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("addFocusListener")(addFocusListener)
    __obj.updateDynamic("addGridControlListener")(addGridControlListener)
    __obj.updateDynamic("addKeyListener")(addKeyListener)
    __obj.updateDynamic("addModifyListener")(addModifyListener)
    __obj.updateDynamic("addMouseListener")(addMouseListener)
    __obj.updateDynamic("addMouseMotionListener")(addMouseMotionListener)
    __obj.updateDynamic("addPaintListener")(addPaintListener)
    __obj.updateDynamic("addSelectionChangeListener")(addSelectionChangeListener)
    __obj.updateDynamic("addStatusListener")(addStatusListener)
    __obj.updateDynamic("addUpdateListener")(addUpdateListener)
    __obj.updateDynamic("addWindowListener")(addWindowListener)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("createPeer")(createPeer)
    __obj.updateDynamic("dispatch")(dispatch)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("draw")(draw)
    __obj.updateDynamic("getAccessibleContext")(getAccessibleContext)
    __obj.updateDynamic("getByIndex")(getByIndex)
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("getCurrentColumnPosition")(getCurrentColumnPosition)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getGraphics")(getGraphics)
    __obj.updateDynamic("getMode")(getMode)
    __obj.updateDynamic("getModel")(getModel)
    __obj.updateDynamic("getPeer")(getPeer)
    __obj.updateDynamic("getPosSize")(getPosSize)
    __obj.updateDynamic("getSelection")(getSelection)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("getSupportedModes")(getSupportedModes)
    __obj.updateDynamic("getView")(getView)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("isDesignMode")(isDesignMode)
    __obj.updateDynamic("isTransparent")(isTransparent)
    __obj.updateDynamic("queryFieldData")(queryFieldData)
    __obj.updateDynamic("queryFieldDataType")(queryFieldDataType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("registerDispatchProviderInterceptor")(registerDispatchProviderInterceptor)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("releaseDispatchProviderInterceptor")(releaseDispatchProviderInterceptor)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeFocusListener")(removeFocusListener)
    __obj.updateDynamic("removeGridControlListener")(removeGridControlListener)
    __obj.updateDynamic("removeKeyListener")(removeKeyListener)
    __obj.updateDynamic("removeModifyListener")(removeModifyListener)
    __obj.updateDynamic("removeMouseListener")(removeMouseListener)
    __obj.updateDynamic("removeMouseMotionListener")(removeMouseMotionListener)
    __obj.updateDynamic("removePaintListener")(removePaintListener)
    __obj.updateDynamic("removeSelectionChangeListener")(removeSelectionChangeListener)
    __obj.updateDynamic("removeStatusListener")(removeStatusListener)
    __obj.updateDynamic("removeUpdateListener")(removeUpdateListener)
    __obj.updateDynamic("removeWindowListener")(removeWindowListener)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("setContext")(setContext)
    __obj.updateDynamic("setCurrentColumnPosition")(setCurrentColumnPosition)
    __obj.updateDynamic("setDesignMode")(setDesignMode)
    __obj.updateDynamic("setEnable")(setEnable)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setGraphics")(setGraphics)
    __obj.updateDynamic("setMode")(setMode)
    __obj.updateDynamic("setModel")(setModel)
    __obj.updateDynamic("setPosSize")(setPosSize)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.updateDynamic("setZoom")(setZoom)
    __obj.updateDynamic("supportsMode")(supportsMode)
    __obj.asInstanceOf[InteractionGridControl]
  }
}

