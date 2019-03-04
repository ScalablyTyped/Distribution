package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlFileControl} . */
trait UnoControlFileControlModel extends UnoControlModel {
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
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
  /** determines whether a control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: FontDescriptor
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /**
    * specifies whether the selection in the control should be hidden when the control is not active (focused).
    * @since OOo 2.0
    */
  var HideInactiveSelection: scala.Boolean
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /**
    * specifies that the content of the control cannot be modified by the user.
    * @since OOo 1.1.2
    */
  var ReadOnly: scala.Boolean
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
  /** specifies the text displayed in the control. */
  var Text: java.lang.String
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 3.3
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
}

object UnoControlFileControlModel {
  @scala.inline
  def apply(
    BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Border: scala.Double,
    BorderColor: scala.Double,
    DefaultControl: java.lang.String,
    Enabled: scala.Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: scala.Double,
    FontRelief: scala.Double,
    Height: scala.Double,
    HelpText: java.lang.String,
    HelpURL: java.lang.String,
    HideInactiveSelection: scala.Boolean,
    Name: java.lang.String,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReadOnly: scala.Boolean,
    ServiceName: java.lang.String,
    Step: scala.Double,
    TabIndex: scala.Double,
    Tabstop: scala.Boolean,
    Tag: java.lang.String,
    Text: java.lang.String,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment,
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
  ): UnoControlFileControlModel = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor, Border = Border, BorderColor = BorderColor, DefaultControl = DefaultControl, Enabled = Enabled, FontDescriptor = FontDescriptor, FontEmphasisMark = FontEmphasisMark, FontRelief = FontRelief, Height = Height, HelpText = HelpText, HelpURL = HelpURL, HideInactiveSelection = HideInactiveSelection, Name = Name, PositionX = PositionX, PositionY = PositionY, Printable = Printable, PropertySetInfo = PropertySetInfo, ReadOnly = ReadOnly, ServiceName = ServiceName, Step = Step, TabIndex = TabIndex, Tabstop = Tabstop, Tag = Tag, Text = Text, TextColor = TextColor, TextLineColor = TextLineColor, VerticalAlign = VerticalAlign, Width = Width, acquire = acquire, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, queryInterface = queryInterface, read = read, release = release, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[UnoControlFileControlModel]
  }
}

