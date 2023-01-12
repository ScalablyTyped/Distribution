package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typings.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.Date
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the standard model of an {@link UnoControlDateField} . */
trait UnoControlDateFieldModel
  extends StObject
     with UnoControlModel {
  
  /** specifies the background color(RGB) of the control. */
  var BackgroundColor: Color
  
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double
  
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double
  
  /** specifies the date displayed in the control. */
  var Date: typings.activexLibreoffice.com_.sun.star.util.Date
  
  /**
    * specifies the format of the displayed date.
    *
    * `; 0:   system short; 1:   system short YY; 2:   system short YYYY; 3:   system long; 4:   short DDMMYY; 5:   short MMDDYY; 6:   short YYMMDD; 7:
    * short DDMMYYYY; 8:   short MMDDYYYY; 9:   short YYYYMMDD; 10:  short YYMMDD DIN5008; 11:  short YYYYMMDD DIN5008; `
    */
  var DateFormat: Double
  
  /** specifies the maximum date that can be entered. */
  var DateMax: Date
  
  /** specifies the minimum date that can be entered. */
  var DateMin: Date
  
  /** specifies, if the date century is displayed. */
  var DateShowCentury: Boolean
  
  /** specifies, if the control has a dropdown button. */
  var Dropdown: Boolean
  
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean
  
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor
  
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double
  
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double
  
  /** specifies the help text of the control. */
  var HelpText: String
  
  /** specifies the help URL of the control. */
  var HelpURL: String
  
  /**
    * specifies whether the selection in the control should be hidden when the control is not active (focused).
    * @since OOo 2.0
    */
  var HideInactiveSelection: Boolean
  
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: Double
  
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean
  
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: Boolean
  
  /**
    * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
    * @since OOo 2.0
    */
  var Repeat: Boolean
  
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: Double
  
  /** specifies that the control has a spin button. */
  var Spin: Boolean
  
  /** specifies that the date is checked during the user input. */
  var StrictFormat: Boolean
  
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean
  
  /**
    * specifies the text displayed in the control.
    * @since OOo 2.0
    */
  var Text: String
  
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color
  
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color
  
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 3.3
    */
  var VerticalAlign: VerticalAlignment
  
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: Double
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object UnoControlDateFieldModel {
  
  inline def apply(
    BackgroundColor: Color,
    Border: Double,
    BorderColor: Double,
    Date: Date,
    DateFormat: Double,
    DateMax: Date,
    DateMin: Date,
    DateShowCentury: Boolean,
    DefaultControl: String,
    Dropdown: Boolean,
    Enabled: Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: Double,
    FontRelief: Double,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    HideInactiveSelection: Boolean,
    MouseWheelBehavior: Double,
    Name: String,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReadOnly: Boolean,
    Repeat: Boolean,
    RepeatDelay: Double,
    ServiceName: String,
    Spin: Boolean,
    Step: Double,
    StrictFormat: Boolean,
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    Text: String,
    TextColor: Color,
    TextLineColor: Color,
    VerticalAlign: VerticalAlignment,
    Width: Double,
    WritingMode: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[Any],
    getServiceName: () => String,
    queryInterface: `type` => Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[Any]) => Unit,
    write: XObjectOutputStream => Unit
  ): UnoControlDateFieldModel = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], DateFormat = DateFormat.asInstanceOf[js.Any], DateMax = DateMax.asInstanceOf[js.Any], DateMin = DateMin.asInstanceOf[js.Any], DateShowCentury = DateShowCentury.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], Dropdown = Dropdown.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontEmphasisMark = FontEmphasisMark.asInstanceOf[js.Any], FontRelief = FontRelief.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], HideInactiveSelection = HideInactiveSelection.asInstanceOf[js.Any], MouseWheelBehavior = MouseWheelBehavior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], RepeatDelay = RepeatDelay.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Spin = Spin.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], StrictFormat = StrictFormat.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextLineColor = TextLineColor.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[UnoControlDateFieldModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnoControlDateFieldModel] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Double): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Date): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateFormat(value: Double): Self = StObject.set(x, "DateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateMax(value: Date): Self = StObject.set(x, "DateMax", value.asInstanceOf[js.Any])
    
    inline def setDateMin(value: Date): Self = StObject.set(x, "DateMin", value.asInstanceOf[js.Any])
    
    inline def setDateShowCentury(value: Boolean): Self = StObject.set(x, "DateShowCentury", value.asInstanceOf[js.Any])
    
    inline def setDropdown(value: Boolean): Self = StObject.set(x, "Dropdown", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFontDescriptor(value: FontDescriptor): Self = StObject.set(x, "FontDescriptor", value.asInstanceOf[js.Any])
    
    inline def setFontEmphasisMark(value: Double): Self = StObject.set(x, "FontEmphasisMark", value.asInstanceOf[js.Any])
    
    inline def setFontRelief(value: Double): Self = StObject.set(x, "FontRelief", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    inline def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    inline def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    inline def setHideInactiveSelection(value: Boolean): Self = StObject.set(x, "HideInactiveSelection", value.asInstanceOf[js.Any])
    
    inline def setMouseWheelBehavior(value: Double): Self = StObject.set(x, "MouseWheelBehavior", value.asInstanceOf[js.Any])
    
    inline def setPrintable(value: Boolean): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "Repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatDelay(value: Double): Self = StObject.set(x, "RepeatDelay", value.asInstanceOf[js.Any])
    
    inline def setSpin(value: Boolean): Self = StObject.set(x, "Spin", value.asInstanceOf[js.Any])
    
    inline def setStrictFormat(value: Boolean): Self = StObject.set(x, "StrictFormat", value.asInstanceOf[js.Any])
    
    inline def setTabstop(value: Boolean): Self = StObject.set(x, "Tabstop", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    inline def setTextLineColor(value: Color): Self = StObject.set(x, "TextLineColor", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlign(value: VerticalAlignment): Self = StObject.set(x, "VerticalAlign", value.asInstanceOf[js.Any])
    
    inline def setWritingMode(value: Double): Self = StObject.set(x, "WritingMode", value.asInstanceOf[js.Any])
  }
}
