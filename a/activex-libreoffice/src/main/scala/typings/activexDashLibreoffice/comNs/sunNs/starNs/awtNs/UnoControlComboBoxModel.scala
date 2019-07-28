package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Pair
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XObjectInputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs.XObjectOutputStream
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XCloneable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlComboBox} . */
trait UnoControlComboBoxModel
  extends UnoControlModel
     with XItemList {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: Double
  /** specifies whether automatic completion of text is enabled. */
  var Autocomplete: Boolean
  /** specifies the background color (RGB) of the control. */
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
  /** specifies if the control has a drop down button. */
  var Dropdown: Boolean
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontDescriptor
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
  /** specifies the maximum line count displayed in the drop down box. */
  var LineCount: Double
  /**
    * specifies the maximum character count.
    *
    * There's no limitation, if set to 0.
    */
  var MaxTextLen: Double
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel scroll through the control's entry list. Using this property, and one of the {@link MouseWheelBehavior} constants, you can
    * control under which circumstances this is possible.
    */
  var MouseWheelBehavior: Double
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: Boolean
  /** specifies the list of items. */
  var StringItemList: SafeArray[String]
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean
  /** specifies the text displayed in the control. */
  var Text: String
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color
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

object UnoControlComboBoxModel {
  @scala.inline
  def apply(
    Align: Double,
    AllItems: SafeArray[Pair[String, String]],
    Autocomplete: Boolean,
    BackgroundColor: Color,
    Border: Double,
    BorderColor: Double,
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
    ItemCount: Double,
    LineCount: Double,
    MaxTextLen: Double,
    MouseWheelBehavior: Double,
    Name: String,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReadOnly: Boolean,
    ServiceName: String,
    Step: Double,
    StringItemList: SafeArray[String],
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    Text: String,
    TextColor: Color,
    TextLineColor: Color,
    Width: Double,
    WritingMode: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addItemListListener: XItemListListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getAllItems: () => SafeArray[Pair[String, String]],
    getItemData: Double => js.Any,
    getItemImage: Double => String,
    getItemText: Double => String,
    getItemTextAndImage: Double => Pair[String, String],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    getServiceName: () => String,
    insertItem: (Double, String, String) => Unit,
    insertItemImage: (Double, String) => Unit,
    insertItemText: (Double, String) => Unit,
    queryInterface: `type` => js.Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    removeAllItems: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeItem: Double => Unit,
    removeItemListListener: XItemListListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setItemData: (Double, js.Any) => Unit,
    setItemImage: (Double, String) => Unit,
    setItemText: (Double, String) => Unit,
    setItemTextAndImage: (Double, String, String) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit,
    write: XObjectOutputStream => Unit
  ): UnoControlComboBoxModel = {
    val __obj = js.Dynamic.literal(Align = Align, AllItems = AllItems, Autocomplete = Autocomplete, BackgroundColor = BackgroundColor, Border = Border, BorderColor = BorderColor, DefaultControl = DefaultControl, Dropdown = Dropdown, Enabled = Enabled, FontDescriptor = FontDescriptor, FontEmphasisMark = FontEmphasisMark, FontRelief = FontRelief, Height = Height, HelpText = HelpText, HelpURL = HelpURL, HideInactiveSelection = HideInactiveSelection, ItemCount = ItemCount, LineCount = LineCount, MaxTextLen = MaxTextLen, MouseWheelBehavior = MouseWheelBehavior, Name = Name, PositionX = PositionX, PositionY = PositionY, Printable = Printable, PropertySetInfo = PropertySetInfo, ReadOnly = ReadOnly, ServiceName = ServiceName, Step = Step, StringItemList = StringItemList, TabIndex = TabIndex, Tabstop = Tabstop, Tag = Tag, Text = Text, TextColor = TextColor, TextLineColor = TextLineColor, Width = Width, WritingMode = WritingMode, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addItemListListener = js.Any.fromFunction1(addItemListListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getAllItems = js.Any.fromFunction0(getAllItems), getItemData = js.Any.fromFunction1(getItemData), getItemImage = js.Any.fromFunction1(getItemImage), getItemText = js.Any.fromFunction1(getItemText), getItemTextAndImage = js.Any.fromFunction1(getItemTextAndImage), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), insertItem = js.Any.fromFunction3(insertItem), insertItemImage = js.Any.fromFunction2(insertItemImage), insertItemText = js.Any.fromFunction2(insertItemText), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeAllItems = js.Any.fromFunction0(removeAllItems), removeEventListener = js.Any.fromFunction1(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), removeItemListListener = js.Any.fromFunction1(removeItemListListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setItemData = js.Any.fromFunction2(setItemData), setItemImage = js.Any.fromFunction2(setItemImage), setItemText = js.Any.fromFunction2(setItemText), setItemTextAndImage = js.Any.fromFunction3(setItemTextAndImage), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[UnoControlComboBoxModel]
  }
}

