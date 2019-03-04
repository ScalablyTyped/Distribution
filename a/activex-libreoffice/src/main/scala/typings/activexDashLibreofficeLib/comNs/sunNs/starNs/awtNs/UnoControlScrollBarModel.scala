package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlScrollBar} . */
trait UnoControlScrollBarModel extends UnoControlModel {
  /**
    * specifies the RGB color to be used for the control.
    * @since OOo 2.0
    */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the increment for a block move. */
  var BlockIncrement: scala.Double
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: scala.Double
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: scala.Double
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /** specifies the increment for a single line move. */
  var LineIncrement: scala.Double
  /**
    * specifies the scrolling behavior of the control.
    *
    * `TRUE` means, that when the user moves the slider in the scroll bar, the content of the window is updated immediately. `FALSE` means, that the window
    * is only updated after the user has released the mouse button.
    * @since OOo 2.0
    */
  var LiveScroll: scala.Boolean
  /** specifies the {@link ScrollBarOrientation} of the control. */
  var Orientation: scala.Double
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as scrolling the scrollbar), then usual control implementations
    * allow to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: scala.Double
  /** specifies the scroll value of the control. */
  var ScrollValue: scala.Double
  /** specifies the maximum scroll value of the control. */
  var ScrollValueMax: scala.Double
  /**
    * specifies the minimum scroll value of the control.
    *
    * If this optional property is not present, clients of the component should assume a minimal scroll value of 0.
    */
  var ScrollValueMin: scala.Double
  /**
    * specifies the RGB color to be used when painting symbols which are part of the control's appearance, such as the arrow buttons.
    * @since OOo 2.0
    */
  var SymbolColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies that the control can be reached with the TAB key.
    * @since OOo 2.0
    */
  var Tabstop: scala.Boolean
  /** specifies the visible size of the scroll bar. */
  var VisibleSize: scala.Double
}

object UnoControlScrollBarModel {
  @scala.inline
  def apply(
    BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BlockIncrement: scala.Double,
    Border: scala.Double,
    BorderColor: scala.Double,
    DefaultControl: java.lang.String,
    Enabled: scala.Boolean,
    Height: scala.Double,
    HelpText: java.lang.String,
    HelpURL: java.lang.String,
    LineIncrement: scala.Double,
    LiveScroll: scala.Boolean,
    Name: java.lang.String,
    Orientation: scala.Double,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RepeatDelay: scala.Double,
    ScrollValue: scala.Double,
    ScrollValueMax: scala.Double,
    ScrollValueMin: scala.Double,
    ServiceName: java.lang.String,
    Step: scala.Double,
    SymbolColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TabIndex: scala.Double,
    Tabstop: scala.Boolean,
    Tag: java.lang.String,
    VisibleSize: scala.Double,
    Width: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    dispose: js.Function0[scala.Unit],
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getServiceName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectInputStream, scala.Unit],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    write: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectOutputStream, scala.Unit]
  ): UnoControlScrollBarModel = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor, BlockIncrement = BlockIncrement, Border = Border, BorderColor = BorderColor, DefaultControl = DefaultControl, Enabled = Enabled, Height = Height, HelpText = HelpText, HelpURL = HelpURL, LineIncrement = LineIncrement, LiveScroll = LiveScroll, Name = Name, Orientation = Orientation, PositionX = PositionX, PositionY = PositionY, Printable = Printable, PropertySetInfo = PropertySetInfo, RepeatDelay = RepeatDelay, ScrollValue = ScrollValue, ScrollValueMax = ScrollValueMax, ScrollValueMin = ScrollValueMin, ServiceName = ServiceName, Step = Step, SymbolColor = SymbolColor, TabIndex = TabIndex, Tabstop = Tabstop, Tag = Tag, VisibleSize = VisibleSize, Width = Width, acquire = acquire, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, queryInterface = queryInterface, read = read, release = release, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[UnoControlScrollBarModel]
  }
}

