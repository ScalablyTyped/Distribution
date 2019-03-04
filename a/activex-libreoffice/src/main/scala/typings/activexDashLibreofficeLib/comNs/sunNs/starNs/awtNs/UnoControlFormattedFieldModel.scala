package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlFormattedField} . */
trait UnoControlFormattedFieldModel extends UnoControlModel {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: scala.Double
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
  /**
    * specifies the default value of the formatted field.
    *
    * This may be a numeric value (double) or a string, depending on the formatting of the field.
    */
  var EffectiveDefault: js.Any
  /**
    * specifies the maximum value that can be entered.
    *
    * This property is ignored if the format of the field is no numeric format.
    */
  var EffectiveMax: scala.Double
  /**
    * specifies the minimum value that can be entered.
    *
    * This property is ignored if the format of the field is no numeric format.
    */
  var EffectiveMin: scala.Double
  /**
    * specifies the current value of the formatted field.
    *
    * This may be a numeric value (double) or a string, depending on the formatting of the field.
    */
  var EffectiveValue: scala.Double
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: FontDescriptor
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double
  /**
    * specifies the format to be used when formatting the field input and output.
    *
    * This value is meaningful relative to the FormatsSupplier property only.
    */
  var FormatKey: scala.Double
  /** supplies the formats the field should work with. */
  var FormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /**
    * specifies whether the selection in the control should be hidden when the control is not active (focused).
    * @since OOo 2.0
    */
  var HideInactiveSelection: scala.Boolean
  /**
    * specifies the maximum character count.
    *
    * There's no limitation, if set to 0.
    */
  var MaxTextLen: scala.Double
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: scala.Double
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: scala.Boolean
  /**
    * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
    * @since OOo 2.0
    */
  var Repeat: scala.Boolean
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: scala.Double
  /** specifies that the control has a spin button. */
  var Spin: scala.Boolean
  /**
    * specifies that the text is checked during the user input.
    *
    * This property is optional - not every component implementing this service is required to provide it, as real-time input checking on a formatted field
    * may be pretty expensive.
    */
  var StrictFormat: scala.Boolean
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
  /** specifies the text displayed in the control. */
  var Text: java.lang.String
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies that the text is treated as a number. */
  var TreatAsNumber: scala.Boolean
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 3.3
    */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: scala.Double
}

object UnoControlFormattedFieldModel {
  @scala.inline
  def apply(
    Align: scala.Double,
    BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Border: scala.Double,
    BorderColor: scala.Double,
    DefaultControl: java.lang.String,
    EffectiveDefault: js.Any,
    EffectiveMax: scala.Double,
    EffectiveMin: scala.Double,
    EffectiveValue: scala.Double,
    Enabled: scala.Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: scala.Double,
    FontRelief: scala.Double,
    FormatKey: scala.Double,
    FormatsSupplier: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XNumberFormatsSupplier,
    Height: scala.Double,
    HelpText: java.lang.String,
    HelpURL: java.lang.String,
    HideInactiveSelection: scala.Boolean,
    MaxTextLen: scala.Double,
    MouseWheelBehavior: scala.Double,
    Name: java.lang.String,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReadOnly: scala.Boolean,
    Repeat: scala.Boolean,
    RepeatDelay: scala.Double,
    ServiceName: java.lang.String,
    Spin: scala.Boolean,
    Step: scala.Double,
    StrictFormat: scala.Boolean,
    TabIndex: scala.Double,
    Tabstop: scala.Boolean,
    Tag: java.lang.String,
    Text: java.lang.String,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TreatAsNumber: scala.Boolean,
    VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment,
    Width: scala.Double,
    WritingMode: scala.Double,
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
  ): UnoControlFormattedFieldModel = {
    val __obj = js.Dynamic.literal(Align = Align, BackgroundColor = BackgroundColor, Border = Border, BorderColor = BorderColor, DefaultControl = DefaultControl, EffectiveDefault = EffectiveDefault, EffectiveMax = EffectiveMax, EffectiveMin = EffectiveMin, EffectiveValue = EffectiveValue, Enabled = Enabled, FontDescriptor = FontDescriptor, FontEmphasisMark = FontEmphasisMark, FontRelief = FontRelief, FormatKey = FormatKey, FormatsSupplier = FormatsSupplier, Height = Height, HelpText = HelpText, HelpURL = HelpURL, HideInactiveSelection = HideInactiveSelection, MaxTextLen = MaxTextLen, MouseWheelBehavior = MouseWheelBehavior, Name = Name, PositionX = PositionX, PositionY = PositionY, Printable = Printable, PropertySetInfo = PropertySetInfo, ReadOnly = ReadOnly, Repeat = Repeat, RepeatDelay = RepeatDelay, ServiceName = ServiceName, Spin = Spin, Step = Step, StrictFormat = StrictFormat, TabIndex = TabIndex, Tabstop = Tabstop, Tag = Tag, Text = Text, TextColor = TextColor, TextLineColor = TextLineColor, TreatAsNumber = TreatAsNumber, VerticalAlign = VerticalAlign, Width = Width, WritingMode = WritingMode, acquire = acquire, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, queryInterface = queryInterface, read = read, release = release, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[UnoControlFormattedFieldModel]
  }
}

