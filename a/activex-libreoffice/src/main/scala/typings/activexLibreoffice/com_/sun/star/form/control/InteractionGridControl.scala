package typings.activexLibreoffice.com_.sun.star.form.control

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typings.activexLibreoffice.com_.sun.star.awt.XGraphics
import typings.activexLibreoffice.com_.sun.star.awt.XKeyListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseListener
import typings.activexLibreoffice.com_.sun.star.awt.XMouseMotionListener
import typings.activexLibreoffice.com_.sun.star.awt.XPaintListener
import typings.activexLibreoffice.com_.sun.star.awt.XToolkit
import typings.activexLibreoffice.com_.sun.star.awt.XView
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.activexLibreoffice.com_.sun.star.awt.XWindowListener
import typings.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.form.XBoundComponent
import typings.activexLibreoffice.com_.sun.star.form.XGridControl
import typings.activexLibreoffice.com_.sun.star.form.XGridControlListener
import typings.activexLibreoffice.com_.sun.star.form.XUpdateListener
import typings.activexLibreoffice.com_.sun.star.frame.XDispatch
import typings.activexLibreoffice.com_.sun.star.frame.XDispatchProviderInterception
import typings.activexLibreoffice.com_.sun.star.frame.XDispatchProviderInterceptor
import typings.activexLibreoffice.com_.sun.star.frame.XStatusListener
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.URL
import typings.activexLibreoffice.com_.sun.star.util.XModeSelector
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is an extended grid control, which allows the user to customize some of its user interface's aspects. */
trait InteractionGridControl
  extends XGridControl
     with XControl
     with XWindow
     with XView
     with XAccessible
     with XBoundComponent
     with XModifyBroadcaster
     with XIndexAccess
     with XEnumerationAccess
     with XModeSelector
     with XSelectionSupplier
     with XDispatchProviderInterception
     with XDispatch

object InteractionGridControl {
  @scala.inline
  def apply(
    AccessibleContext: XAccessibleContext,
    Context: XInterface,
    Count: Double,
    CurrentColumnPosition: Double,
    ElementType: `type`,
    Graphics: XGraphics,
    Mode: String,
    Model: XControlModel,
    Peer: XWindowPeer,
    PosSize: Rectangle,
    Selection: js.Any,
    Size: Size,
    SupportedModes: SafeArray[String],
    View: XView,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFocusListener: XFocusListener => Unit,
    addGridControlListener: XGridControlListener => Unit,
    addKeyListener: XKeyListener => Unit,
    addModifyListener: XModifyListener => Unit,
    addMouseListener: XMouseListener => Unit,
    addMouseMotionListener: XMouseMotionListener => Unit,
    addPaintListener: XPaintListener => Unit,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    addStatusListener: (XStatusListener, URL) => Unit,
    addUpdateListener: XUpdateListener => Unit,
    addWindowListener: XWindowListener => Unit,
    commit: () => Boolean,
    createEnumeration: () => XEnumeration,
    createPeer: (XToolkit, XWindowPeer) => Unit,
    dispatch: (URL, SeqEquiv[PropertyValue]) => Unit,
    dispose: () => Unit,
    draw: (Double, Double) => Unit,
    getAccessibleContext: () => XAccessibleContext,
    getByIndex: Double => js.Any,
    getContext: () => XInterface,
    getCount: () => Double,
    getCurrentColumnPosition: () => Double,
    getElementType: () => `type`,
    getGraphics: () => XGraphics,
    getMode: () => String,
    getModel: () => XControlModel,
    getPeer: () => XWindowPeer,
    getPosSize: () => Rectangle,
    getSelection: () => js.Any,
    getSize: () => Size,
    getSupportedModes: () => SafeArray[String],
    getView: () => XView,
    hasElements: () => Boolean,
    isDesignMode: () => Boolean,
    isTransparent: () => Boolean,
    queryFieldData: (Double, `type`) => SafeArray[_],
    queryFieldDataType: `type` => SafeArray[Boolean],
    queryInterface: `type` => js.Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => Unit,
    release: () => Unit,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => Unit,
    removeEventListener: XEventListener => Unit,
    removeFocusListener: XFocusListener => Unit,
    removeGridControlListener: XGridControlListener => Unit,
    removeKeyListener: XKeyListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removeMouseListener: XMouseListener => Unit,
    removeMouseMotionListener: XMouseMotionListener => Unit,
    removePaintListener: XPaintListener => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    removeStatusListener: (XStatusListener, URL) => Unit,
    removeUpdateListener: XUpdateListener => Unit,
    removeWindowListener: XWindowListener => Unit,
    select: js.Any => Boolean,
    setContext: XInterface => Unit,
    setCurrentColumnPosition: Double => Unit,
    setDesignMode: Boolean => Unit,
    setEnable: Boolean => Unit,
    setFocus: () => Unit,
    setGraphics: XGraphics => Boolean,
    setMode: String => Unit,
    setModel: XControlModel => Boolean,
    setPosSize: (Double, Double, Double, Double, Double) => Unit,
    setVisible: Boolean => Unit,
    setZoom: (Double, Double) => Unit,
    supportsMode: String => Boolean
  ): InteractionGridControl = {
    val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], CurrentColumnPosition = CurrentColumnPosition.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addGridControlListener = js.Any.fromFunction1(addGridControlListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addStatusListener = js.Any.fromFunction2(addStatusListener), addUpdateListener = js.Any.fromFunction1(addUpdateListener), addWindowListener = js.Any.fromFunction1(addWindowListener), commit = js.Any.fromFunction0(commit), createEnumeration = js.Any.fromFunction0(createEnumeration), createPeer = js.Any.fromFunction2(createPeer), dispatch = js.Any.fromFunction2(dispatch), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getByIndex = js.Any.fromFunction1(getByIndex), getContext = js.Any.fromFunction0(getContext), getCount = js.Any.fromFunction0(getCount), getCurrentColumnPosition = js.Any.fromFunction0(getCurrentColumnPosition), getElementType = js.Any.fromFunction0(getElementType), getGraphics = js.Any.fromFunction0(getGraphics), getMode = js.Any.fromFunction0(getMode), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSelection = js.Any.fromFunction0(getSelection), getSize = js.Any.fromFunction0(getSize), getSupportedModes = js.Any.fromFunction0(getSupportedModes), getView = js.Any.fromFunction0(getView), hasElements = js.Any.fromFunction0(hasElements), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1(registerDispatchProviderInterceptor), release = js.Any.fromFunction0(release), releaseDispatchProviderInterceptor = js.Any.fromFunction1(releaseDispatchProviderInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeGridControlListener = js.Any.fromFunction1(removeGridControlListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeStatusListener = js.Any.fromFunction2(removeStatusListener), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), select = js.Any.fromFunction1(select), setContext = js.Any.fromFunction1(setContext), setCurrentColumnPosition = js.Any.fromFunction1(setCurrentColumnPosition), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setMode = js.Any.fromFunction1(setMode), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom), supportsMode = js.Any.fromFunction1(supportsMode))
    __obj.asInstanceOf[InteractionGridControl]
  }
}

