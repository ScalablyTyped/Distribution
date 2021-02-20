package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.Pair
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typings.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XCloneable
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the standard model of an {@link UnoControlListBox} . */
@js.native
trait UnoControlListBoxModel
  extends UnoControlModel
     with XItemList {
  
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: Double = js.native
  
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: Color = js.native
  
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double = js.native
  
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double = js.native
  
  /** specifies if the control has a drop down button. */
  var Dropdown: Boolean = js.native
  
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typings.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double = js.native
  
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double = js.native
  
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  
  /**
    * specifies where an item separator - a horizontal line - is drawn.
    *
    * If this is not `NULL` , then a horizontal line will be drawn between the item at the given position, and the following item.
    * @since OOo 3.3
    */
  var ItemSeparatorPos: Double = js.native
  
  /** specifies the maximum line count displayed in the drop down box. */
  var LineCount: Double = js.native
  
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel scroll through the control's entry list. Using this property, and one of the {@link MouseWheelBehavior} constants, you can
    * control under which circumstances this is possible.
    */
  var MouseWheelBehavior: Double = js.native
  
  /** specifies if more than one entry can be selected. */
  var MultiSelection: Boolean = js.native
  
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: Boolean = js.native
  
  /** specifies the sequence of selected items, identified by the position. */
  var SelectedItems: SafeArray[Double] = js.native
  
  /** specifies the list of items. */
  var StringItemList: SafeArray[String] = js.native
  
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: Double = js.native
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
object UnoControlListBoxModel {
  
  @scala.inline
  def apply(
    Align: Double,
    AllItems: SafeArray[Pair[String, String]],
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
    ItemCount: Double,
    ItemSeparatorPos: Double,
    LineCount: Double,
    MouseWheelBehavior: Double,
    MultiSelection: Boolean,
    Name: String,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReadOnly: Boolean,
    SelectedItems: SafeArray[Double],
    ServiceName: String,
    Step: Double,
    StringItemList: SafeArray[String],
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
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
  ): UnoControlListBoxModel = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], AllItems = AllItems.asInstanceOf[js.Any], BackgroundColor = BackgroundColor.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], Dropdown = Dropdown.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontEmphasisMark = FontEmphasisMark.asInstanceOf[js.Any], FontRelief = FontRelief.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], ItemCount = ItemCount.asInstanceOf[js.Any], ItemSeparatorPos = ItemSeparatorPos.asInstanceOf[js.Any], LineCount = LineCount.asInstanceOf[js.Any], MouseWheelBehavior = MouseWheelBehavior.asInstanceOf[js.Any], MultiSelection = MultiSelection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], SelectedItems = SelectedItems.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], StringItemList = StringItemList.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextLineColor = TextLineColor.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addItemListListener = js.Any.fromFunction1(addItemListListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getAllItems = js.Any.fromFunction0(getAllItems), getItemData = js.Any.fromFunction1(getItemData), getItemImage = js.Any.fromFunction1(getItemImage), getItemText = js.Any.fromFunction1(getItemText), getItemTextAndImage = js.Any.fromFunction1(getItemTextAndImage), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), insertItem = js.Any.fromFunction3(insertItem), insertItemImage = js.Any.fromFunction2(insertItemImage), insertItemText = js.Any.fromFunction2(insertItemText), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeAllItems = js.Any.fromFunction0(removeAllItems), removeEventListener = js.Any.fromFunction1(removeEventListener), removeItem = js.Any.fromFunction1(removeItem), removeItemListListener = js.Any.fromFunction1(removeItemListListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setItemData = js.Any.fromFunction2(setItemData), setItemImage = js.Any.fromFunction2(setItemImage), setItemText = js.Any.fromFunction2(setItemText), setItemTextAndImage = js.Any.fromFunction3(setItemTextAndImage), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[UnoControlListBoxModel]
  }
  
  @scala.inline
  implicit class UnoControlListBoxModelMutableBuilder[Self <: UnoControlListBoxModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Double): Self = StObject.set(x, "Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Double): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: Boolean): Self = StObject.set(x, "Dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDescriptor(value: FontDescriptor): Self = StObject.set(x, "FontDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontEmphasisMark(value: Double): Self = StObject.set(x, "FontEmphasisMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontRelief(value: Double): Self = StObject.set(x, "FontRelief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHelpText(value: String): Self = StObject.set(x, "HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpURL(value: String): Self = StObject.set(x, "HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorPos(value: Double): Self = StObject.set(x, "ItemSeparatorPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCount(value: Double): Self = StObject.set(x, "LineCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelBehavior(value: Double): Self = StObject.set(x, "MouseWheelBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiSelection(value: Boolean): Self = StObject.set(x, "MultiSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintable(value: Boolean): Self = StObject.set(x, "Printable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedItems(value: SafeArray[Double]): Self = StObject.set(x, "SelectedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringItemList(value: SafeArray[String]): Self = StObject.set(x, "StringItemList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabstop(value: Boolean): Self = StObject.set(x, "Tabstop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: Color): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLineColor(value: Color): Self = StObject.set(x, "TextLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingMode(value: Double): Self = StObject.set(x, "WritingMode", value.asInstanceOf[js.Any])
  }
}
