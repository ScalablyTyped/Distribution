package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.activexLibreoffice.com_.sun.star.awt.UnoControl
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlButton
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlCheckBox
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlComboBox
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlCurrencyField
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlDateField
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlEdit
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlFormattedField
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlGroupBox
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlImageControl
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlListBox
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlNumericField
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlPatternField
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlRadioButton
import typings.activexLibreoffice.com_.sun.star.awt.UnoControlTimeField
import typings.activexLibreoffice.com_.sun.star.awt.XActionListener
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.awt.XFocusListener
import typings.activexLibreoffice.com_.sun.star.awt.XGraphics
import typings.activexLibreoffice.com_.sun.star.awt.XItemListener
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
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.form.submission.XSubmission
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
import typings.activexLibreoffice.com_.sun.star.util.XNumberFormatter
import typings.activexLibreoffice.com_.sun.star.view.XSelectionChangeListener
import typings.activexLibreoffice.com_.sun.star.view.XSelectionSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  /**
    * describes a check box control which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.CheckBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait CheckBox
    extends StObject
       with UnoControlCheckBox
       with XBoundControl
  object CheckBox {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      Lock: Boolean,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      State: Double,
      View: XView,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addFocusListener: XFocusListener => Unit,
      addItemListener: XItemListener => Unit,
      addKeyListener: XKeyListener => Unit,
      addMouseListener: XMouseListener => Unit,
      addMouseMotionListener: XMouseMotionListener => Unit,
      addPaintListener: XPaintListener => Unit,
      addWindowListener: XWindowListener => Unit,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      dispose: () => Unit,
      draw: (Double, Double) => Unit,
      enableTriState: Boolean => Unit,
      getAccessibleContext: () => XAccessibleContext,
      getContext: () => XInterface,
      getGraphics: () => XGraphics,
      getLock: () => Boolean,
      getMinimumSize: () => Size,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getPreferredSize: () => Size,
      getSize: () => Size,
      getState: () => Double,
      getView: () => XView,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removeFocusListener: XFocusListener => Unit,
      removeItemListener: XItemListener => Unit,
      removeKeyListener: XKeyListener => Unit,
      removeMouseListener: XMouseListener => Unit,
      removeMouseMotionListener: XMouseMotionListener => Unit,
      removePaintListener: XPaintListener => Unit,
      removeWindowListener: XWindowListener => Unit,
      setContext: XInterface => Unit,
      setDesignMode: Boolean => Unit,
      setEnable: Boolean => Unit,
      setFocus: () => Unit,
      setGraphics: XGraphics => Boolean,
      setLabel: String => Unit,
      setLock: Boolean => Unit,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Unit,
      setState: Double => Unit,
      setVisible: Boolean => Unit,
      setZoom: (Double, Double) => Unit
    ): CheckBox = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Lock = Lock.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addItemListener = js.Any.fromFunction1(addItemListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), enableTriState = js.Any.fromFunction1(enableTriState), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getLock = js.Any.fromFunction0(getLock), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), getSize = js.Any.fromFunction0(getSize), getState = js.Any.fromFunction0(getState), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1(setLabel), setLock = js.Any.fromFunction1(setLock), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setState = js.Any.fromFunction1(setState), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
      __obj.asInstanceOf[CheckBox]
    }
  }
  
  /**
    * describes a combo box control.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.ComboBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait ComboBox
    extends StObject
       with UnoControlComboBox
       with XBoundControl
  
  /**
    * describes a button control.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.CommandButton} service.
    *
    * The control is clickable, the action taken upon clicking depends on the settings of the model the control belongs to.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    * @see com.sun.star.form.component.CommandButton.ButtonType
    */
  trait CommandButton
    extends StObject
       with UnoControlButton
       with XApproveActionBroadcaster
  object CommandButton {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      View: XView,
      acquire: () => Unit,
      addActionListener: XActionListener => Unit,
      addApproveActionListener: XApproveActionListener => Unit,
      addEventListener: XEventListener => Unit,
      addFocusListener: XFocusListener => Unit,
      addKeyListener: XKeyListener => Unit,
      addMouseListener: XMouseListener => Unit,
      addMouseMotionListener: XMouseMotionListener => Unit,
      addPaintListener: XPaintListener => Unit,
      addWindowListener: XWindowListener => Unit,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      dispose: () => Unit,
      draw: (Double, Double) => Unit,
      getAccessibleContext: () => XAccessibleContext,
      getContext: () => XInterface,
      getGraphics: () => XGraphics,
      getMinimumSize: () => Size,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getPreferredSize: () => Size,
      getSize: () => Size,
      getView: () => XView,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeActionListener: XActionListener => Unit,
      removeApproveActionListener: XApproveActionListener => Unit,
      removeEventListener: XEventListener => Unit,
      removeFocusListener: XFocusListener => Unit,
      removeKeyListener: XKeyListener => Unit,
      removeMouseListener: XMouseListener => Unit,
      removeMouseMotionListener: XMouseMotionListener => Unit,
      removePaintListener: XPaintListener => Unit,
      removeWindowListener: XWindowListener => Unit,
      setActionCommand: String => Unit,
      setContext: XInterface => Unit,
      setDesignMode: Boolean => Unit,
      setEnable: Boolean => Unit,
      setFocus: () => Unit,
      setGraphics: XGraphics => Boolean,
      setLabel: String => Unit,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Unit,
      setVisible: Boolean => Unit,
      setZoom: (Double, Double) => Unit
    ): CommandButton = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionListener = js.Any.fromFunction1(addActionListener), addApproveActionListener = js.Any.fromFunction1(addApproveActionListener), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), getSize = js.Any.fromFunction0(getSize), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionListener = js.Any.fromFunction1(removeActionListener), removeApproveActionListener = js.Any.fromFunction1(removeApproveActionListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setActionCommand = js.Any.fromFunction1(setActionCommand), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1(setLabel), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
      __obj.asInstanceOf[CommandButton]
    }
  }
  
  /**
    * describes a control which can be used for inputting currency values, and which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.CurrencyField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait CurrencyField
    extends StObject
       with UnoControlCurrencyField
       with XBoundControl
  
  /**
    * describes a control which can be used for inputting date values, and which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.DateField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait DateField
    extends StObject
       with UnoControlDateField
       with XBoundControl
  
  /**
    * describes a check box control which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.CheckBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait FilterControl
    extends StObject
       with XControl {
    
    def createWithFormat(MessageParent: XWindow, NumberFormatter: XNumberFormatter, ControlModel: XPropertySet): Unit
  }
  object FilterControl {
    
    inline def apply(
      Context: XInterface,
      Model: XControlModel,
      Peer: XWindowPeer,
      View: XView,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      createWithFormat: (XWindow, XNumberFormatter, XPropertySet) => Unit,
      dispose: () => Unit,
      getContext: () => XInterface,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getView: () => XView,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      setContext: XInterface => Unit,
      setDesignMode: Boolean => Unit,
      setModel: XControlModel => Boolean
    ): FilterControl = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), createPeer = js.Any.fromFunction2(createPeer), createWithFormat = js.Any.fromFunction3(createWithFormat), dispose = js.Any.fromFunction0(dispose), getContext = js.Any.fromFunction0(getContext), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setModel = js.Any.fromFunction1(setModel))
      __obj.asInstanceOf[FilterControl]
    }
    
    extension [Self <: FilterControl](x: Self) {
      
      inline def setCreateWithFormat(value: (XWindow, XNumberFormatter, XPropertySet) => Unit): Self = StObject.set(x, "createWithFormat", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * describes a control which can be used for inputting values with a arbitrary formatting, and can (but not necessarily has to) be bound to a database
    * field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.FormattedField} service.
    *
    * In addition, this control can be used in HTML forms. It triggers the {@link com.sun.star.form.XSubmit.submit()} method of the form it belongs to if
    * the **enter** key is pressed while it has the focus.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    * @see com.sun.star.util.XNumberFormatsSupplier
    */
  @js.native
  trait FormattedField
    extends StObject
       with UnoControlFormattedField
       with XBoundControl
  
  /**
    * describes a table-like control for displaying data.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.GridControl} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait GridControl
    extends StObject
       with UnoControl
       with XBoundComponent
       with XGridControl
       with XModifyBroadcaster
       with XIndexAccess
       with XEnumerationAccess
       with XModeSelector
       with XSelectionSupplier
       with XDispatchProviderInterception
  object GridControl {
    
    inline def apply(
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
      Selection: Any,
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
      addUpdateListener: XUpdateListener => Unit,
      addWindowListener: XWindowListener => Unit,
      commit: () => Boolean,
      createEnumeration: () => XEnumeration,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      dispose: () => Unit,
      draw: (Double, Double) => Unit,
      getAccessibleContext: () => XAccessibleContext,
      getByIndex: Double => Any,
      getContext: () => XInterface,
      getCount: () => Double,
      getCurrentColumnPosition: () => Double,
      getElementType: () => `type`,
      getGraphics: () => XGraphics,
      getMode: () => String,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getSelection: () => Any,
      getSize: () => Size,
      getSupportedModes: () => SafeArray[String],
      getView: () => XView,
      hasElements: () => Boolean,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryFieldData: (Double, `type`) => SafeArray[Any],
      queryFieldDataType: `type` => SafeArray[Boolean],
      queryInterface: `type` => Any,
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
      removeUpdateListener: XUpdateListener => Unit,
      removeWindowListener: XWindowListener => Unit,
      select: Any => Boolean,
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
    ): GridControl = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], CurrentColumnPosition = CurrentColumnPosition.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addGridControlListener = js.Any.fromFunction1(addGridControlListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), addUpdateListener = js.Any.fromFunction1(addUpdateListener), addWindowListener = js.Any.fromFunction1(addWindowListener), commit = js.Any.fromFunction0(commit), createEnumeration = js.Any.fromFunction0(createEnumeration), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getByIndex = js.Any.fromFunction1(getByIndex), getContext = js.Any.fromFunction0(getContext), getCount = js.Any.fromFunction0(getCount), getCurrentColumnPosition = js.Any.fromFunction0(getCurrentColumnPosition), getElementType = js.Any.fromFunction0(getElementType), getGraphics = js.Any.fromFunction0(getGraphics), getMode = js.Any.fromFunction0(getMode), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getSelection = js.Any.fromFunction0(getSelection), getSize = js.Any.fromFunction0(getSize), getSupportedModes = js.Any.fromFunction0(getSupportedModes), getView = js.Any.fromFunction0(getView), hasElements = js.Any.fromFunction0(hasElements), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1(registerDispatchProviderInterceptor), release = js.Any.fromFunction0(release), releaseDispatchProviderInterceptor = js.Any.fromFunction1(releaseDispatchProviderInterceptor), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeGridControlListener = js.Any.fromFunction1(removeGridControlListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), select = js.Any.fromFunction1(select), setContext = js.Any.fromFunction1(setContext), setCurrentColumnPosition = js.Any.fromFunction1(setCurrentColumnPosition), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setMode = js.Any.fromFunction1(setMode), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom), supportsMode = js.Any.fromFunction1(supportsMode))
      __obj.asInstanceOf[GridControl]
    }
  }
  
  /**
    * describes a control which can be used for visually grouping controls
    *
    * The model of the control has to support the {@link com.sun.star.form.component.GroupBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  type GroupBox = UnoControlGroupBox
  
  /**
    * describes a control which can be used for displaying images on a control acting like a button.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.ImageButton} service.
    *
    * The control is clickable, the action taken upon clicking depends on the settings of the model the control belongs to.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    * @see com.sun.star.form.component.ImageButton.ButtonType
    */
  trait ImageButton
    extends StObject
       with UnoControlImageControl
       with XApproveActionBroadcaster
  object ImageButton {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      View: XView,
      acquire: () => Unit,
      addApproveActionListener: XApproveActionListener => Unit,
      addEventListener: XEventListener => Unit,
      addFocusListener: XFocusListener => Unit,
      addKeyListener: XKeyListener => Unit,
      addMouseListener: XMouseListener => Unit,
      addMouseMotionListener: XMouseMotionListener => Unit,
      addPaintListener: XPaintListener => Unit,
      addWindowListener: XWindowListener => Unit,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      dispose: () => Unit,
      draw: (Double, Double) => Unit,
      getAccessibleContext: () => XAccessibleContext,
      getContext: () => XInterface,
      getGraphics: () => XGraphics,
      getMinimumSize: () => Size,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getPreferredSize: () => Size,
      getSize: () => Size,
      getView: () => XView,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeApproveActionListener: XApproveActionListener => Unit,
      removeEventListener: XEventListener => Unit,
      removeFocusListener: XFocusListener => Unit,
      removeKeyListener: XKeyListener => Unit,
      removeMouseListener: XMouseListener => Unit,
      removeMouseMotionListener: XMouseMotionListener => Unit,
      removePaintListener: XPaintListener => Unit,
      removeWindowListener: XWindowListener => Unit,
      setContext: XInterface => Unit,
      setDesignMode: Boolean => Unit,
      setEnable: Boolean => Unit,
      setFocus: () => Unit,
      setGraphics: XGraphics => Boolean,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Unit,
      setVisible: Boolean => Unit,
      setZoom: (Double, Double) => Unit
    ): ImageButton = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addApproveActionListener = js.Any.fromFunction1(addApproveActionListener), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), getSize = js.Any.fromFunction0(getSize), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeApproveActionListener = js.Any.fromFunction1(removeApproveActionListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
      __obj.asInstanceOf[ImageButton]
    }
  }
  
  /**
    * describes a control used for displaying images stored in a database.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.DatabaseImageControl} service.
    *
    * If the model of the control is valid bound to a database field, the control allows to select an image (browsing the file system) upon double clicking
    * into it, and forwards the URL of the chosen image to the ImageURL property of its model.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait ImageControl
    extends StObject
       with UnoControlImageControl
       with XBoundControl
  object ImageControl {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      Lock: Boolean,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      View: XView,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addFocusListener: XFocusListener => Unit,
      addKeyListener: XKeyListener => Unit,
      addMouseListener: XMouseListener => Unit,
      addMouseMotionListener: XMouseMotionListener => Unit,
      addPaintListener: XPaintListener => Unit,
      addWindowListener: XWindowListener => Unit,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      dispose: () => Unit,
      draw: (Double, Double) => Unit,
      getAccessibleContext: () => XAccessibleContext,
      getContext: () => XInterface,
      getGraphics: () => XGraphics,
      getLock: () => Boolean,
      getMinimumSize: () => Size,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getPreferredSize: () => Size,
      getSize: () => Size,
      getView: () => XView,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removeFocusListener: XFocusListener => Unit,
      removeKeyListener: XKeyListener => Unit,
      removeMouseListener: XMouseListener => Unit,
      removeMouseMotionListener: XMouseMotionListener => Unit,
      removePaintListener: XPaintListener => Unit,
      removeWindowListener: XWindowListener => Unit,
      setContext: XInterface => Unit,
      setDesignMode: Boolean => Unit,
      setEnable: Boolean => Unit,
      setFocus: () => Unit,
      setGraphics: XGraphics => Boolean,
      setLock: Boolean => Unit,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Unit,
      setVisible: Boolean => Unit,
      setZoom: (Double, Double) => Unit
    ): ImageControl = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Lock = Lock.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getLock = js.Any.fromFunction0(getLock), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), getSize = js.Any.fromFunction0(getSize), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setLock = js.Any.fromFunction1(setLock), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
      __obj.asInstanceOf[ImageControl]
    }
  }
  
  /** is an extended grid control, which allows the user to customize some of its user interface's aspects. */
  trait InteractionGridControl
    extends StObject
       with GridControl
       with XDispatch
  object InteractionGridControl {
    
    inline def apply(
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
      Selection: Any,
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
      getByIndex: Double => Any,
      getContext: () => XInterface,
      getCount: () => Double,
      getCurrentColumnPosition: () => Double,
      getElementType: () => `type`,
      getGraphics: () => XGraphics,
      getMode: () => String,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getSelection: () => Any,
      getSize: () => Size,
      getSupportedModes: () => SafeArray[String],
      getView: () => XView,
      hasElements: () => Boolean,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryFieldData: (Double, `type`) => SafeArray[Any],
      queryFieldDataType: `type` => SafeArray[Boolean],
      queryInterface: `type` => Any,
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
      select: Any => Boolean,
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
  
  /**
    * describes a list box control which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.ListBox} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait ListBox
    extends StObject
       with UnoControlListBox
       with XBoundControl
       with XChangeBroadcaster
  
  /**
    * This service specifies the model for control which provides controller functionality for a {@link com.sun.star.form.component.DataForm} , such as
    * navigating or filtering the form.
    * @see com.sun.star.form.component.NavigationToolBar
    */
  type NavigationToolBar = UnoControl
  
  /**
    * describes a control for inputting numeric values and which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.NumericField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait NumericField
    extends StObject
       with UnoControlNumericField
       with XBoundControl
  
  /**
    * describes a control for inputting text complying to a given pattern, and which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.PatternField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait PatternField
    extends StObject
       with UnoControlPatternField
       with XBoundControl
  
  /**
    * describes a radio button control which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.RadioButton} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  trait RadioButton
    extends StObject
       with UnoControlRadioButton
       with XBoundControl
  object RadioButton {
    
    inline def apply(
      AccessibleContext: XAccessibleContext,
      Context: XInterface,
      Graphics: XGraphics,
      Lock: Boolean,
      MinimumSize: Size,
      Model: XControlModel,
      Peer: XWindowPeer,
      PosSize: Rectangle,
      PreferredSize: Size,
      Size: Size,
      State: Boolean,
      View: XView,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addFocusListener: XFocusListener => Unit,
      addItemListener: XItemListener => Unit,
      addKeyListener: XKeyListener => Unit,
      addMouseListener: XMouseListener => Unit,
      addMouseMotionListener: XMouseMotionListener => Unit,
      addPaintListener: XPaintListener => Unit,
      addWindowListener: XWindowListener => Unit,
      calcAdjustedSize: Size => Size,
      createPeer: (XToolkit, XWindowPeer) => Unit,
      dispose: () => Unit,
      draw: (Double, Double) => Unit,
      getAccessibleContext: () => XAccessibleContext,
      getContext: () => XInterface,
      getGraphics: () => XGraphics,
      getLock: () => Boolean,
      getMinimumSize: () => Size,
      getModel: () => XControlModel,
      getPeer: () => XWindowPeer,
      getPosSize: () => Rectangle,
      getPreferredSize: () => Size,
      getSize: () => Size,
      getState: () => Boolean,
      getView: () => XView,
      isDesignMode: () => Boolean,
      isTransparent: () => Boolean,
      queryInterface: `type` => Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removeFocusListener: XFocusListener => Unit,
      removeItemListener: XItemListener => Unit,
      removeKeyListener: XKeyListener => Unit,
      removeMouseListener: XMouseListener => Unit,
      removeMouseMotionListener: XMouseMotionListener => Unit,
      removePaintListener: XPaintListener => Unit,
      removeWindowListener: XWindowListener => Unit,
      setContext: XInterface => Unit,
      setDesignMode: Boolean => Unit,
      setEnable: Boolean => Unit,
      setFocus: () => Unit,
      setGraphics: XGraphics => Boolean,
      setLabel: String => Unit,
      setLock: Boolean => Unit,
      setModel: XControlModel => Boolean,
      setPosSize: (Double, Double, Double, Double, Double) => Unit,
      setState: Boolean => Unit,
      setVisible: Boolean => Unit,
      setZoom: (Double, Double) => Unit
    ): RadioButton = {
      val __obj = js.Dynamic.literal(AccessibleContext = AccessibleContext.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Graphics = Graphics.asInstanceOf[js.Any], Lock = Lock.asInstanceOf[js.Any], MinimumSize = MinimumSize.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Peer = Peer.asInstanceOf[js.Any], PosSize = PosSize.asInstanceOf[js.Any], PreferredSize = PreferredSize.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFocusListener = js.Any.fromFunction1(addFocusListener), addItemListener = js.Any.fromFunction1(addItemListener), addKeyListener = js.Any.fromFunction1(addKeyListener), addMouseListener = js.Any.fromFunction1(addMouseListener), addMouseMotionListener = js.Any.fromFunction1(addMouseMotionListener), addPaintListener = js.Any.fromFunction1(addPaintListener), addWindowListener = js.Any.fromFunction1(addWindowListener), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), createPeer = js.Any.fromFunction2(createPeer), dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), getAccessibleContext = js.Any.fromFunction0(getAccessibleContext), getContext = js.Any.fromFunction0(getContext), getGraphics = js.Any.fromFunction0(getGraphics), getLock = js.Any.fromFunction0(getLock), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getModel = js.Any.fromFunction0(getModel), getPeer = js.Any.fromFunction0(getPeer), getPosSize = js.Any.fromFunction0(getPosSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), getSize = js.Any.fromFunction0(getSize), getState = js.Any.fromFunction0(getState), getView = js.Any.fromFunction0(getView), isDesignMode = js.Any.fromFunction0(isDesignMode), isTransparent = js.Any.fromFunction0(isTransparent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFocusListener = js.Any.fromFunction1(removeFocusListener), removeItemListener = js.Any.fromFunction1(removeItemListener), removeKeyListener = js.Any.fromFunction1(removeKeyListener), removeMouseListener = js.Any.fromFunction1(removeMouseListener), removeMouseMotionListener = js.Any.fromFunction1(removeMouseMotionListener), removePaintListener = js.Any.fromFunction1(removePaintListener), removeWindowListener = js.Any.fromFunction1(removeWindowListener), setContext = js.Any.fromFunction1(setContext), setDesignMode = js.Any.fromFunction1(setDesignMode), setEnable = js.Any.fromFunction1(setEnable), setFocus = js.Any.fromFunction0(setFocus), setGraphics = js.Any.fromFunction1(setGraphics), setLabel = js.Any.fromFunction1(setLabel), setLock = js.Any.fromFunction1(setLock), setModel = js.Any.fromFunction1(setModel), setPosSize = js.Any.fromFunction5(setPosSize), setState = js.Any.fromFunction1(setState), setVisible = js.Any.fromFunction1(setVisible), setZoom = js.Any.fromFunction2(setZoom))
      __obj.asInstanceOf[RadioButton]
    }
  }
  
  /**
    * specifies a button control which can execute external submissions
    *
    * The model of the control has to support the {@link com.sun.star.form.component.SubmitButton} service.
    *
    * The control is clickable. When clicked (by mouse or keyboard, or programmatically), the following happens:  1. Any
    * com::sun::star::form::submission::XSubmissionVetoListeners registered at the component are given the chance to veto the submission. 2. The model of
    * the control is examined for an external submission object. That is, com::sun::star::form::submission::XSubmissionSupplier::getSubmission() is called
    * at the model. ;  If there is such a submission object, its {@link com.sun.star.form.submission.XSubmission.submit()} method is invoked. 3. If there is
    * no external submission, the parent object of the model is examined for the presence of the {@link com.sun.star.form.XSubmit} interface. If it is
    * present, it's {@link com.sun.star.form.XSubmit.submit()} method is invoked. ;  Since the parent object of a submit button can only be a {@link
    * com.sun.star.form.component.Form} , this means that SubmitButtons are also able to submit com::sun::star::form::component::HTMLForms.
    */
  type SubmitButton = XSubmission
  
  /**
    * describes a control for entering arbitrary text which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.TextField} service.
    *
    * In addition, this control can be used in HTML forms. It triggers the {@link com.sun.star.form.XSubmit.submit()} method of the form it belongs to if
    * the **enter** is pressed while it has the focus.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait TextField
    extends StObject
       with UnoControlEdit
       with XBoundControl
       with XChangeBroadcaster
  
  /**
    * describes a control for inputting time values which can (but not necessarily has to) be bound to a database field.
    *
    * The model of the control has to support the {@link com.sun.star.form.component.TimeField} service.
    * @see com.sun.star.awt.UnoControl
    * @see com.sun.star.awt.UnoControlModel
    */
  @js.native
  trait TimeField
    extends StObject
       with UnoControlTimeField
       with XBoundControl
}
