package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlListBox} . */
trait UnoControlListBoxModel
  extends UnoControlModel
     with XItemList {
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
  /** specifies if the control has a drop down button. */
  var Dropdown: scala.Boolean
  /** determines whether the control is enabled or disabled. */
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
    * specifies where an item separator - a horizontal line - is drawn.
    *
    * If this is not `NULL` , then a horizontal line will be drawn between the item at the given position, and the following item.
    * @since OOo 3.3
    */
  var ItemSeparatorPos: scala.Double
  /** specifies the maximum line count displayed in the drop down box. */
  var LineCount: scala.Double
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel scroll through the control's entry list. Using this property, and one of the {@link MouseWheelBehavior} constants, you can
    * control under which circumstances this is possible.
    */
  var MouseWheelBehavior: scala.Double
  /** specifies if more than one entry can be selected. */
  var MultiSelection: scala.Boolean
  /** specifies that the control will be printed with the document. */
  var Printable: scala.Boolean
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: scala.Boolean
  /** specifies the sequence of selected items, identified by the position. */
  var SelectedItems: activexDashInteropLib.SafeArray[scala.Double]
  /** specifies the list of items. */
  var StringItemList: activexDashInteropLib.SafeArray[java.lang.String]
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
  /** specifies the text color (RGB) of the control. */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: scala.Double
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

object UnoControlListBoxModel {
  @scala.inline
  def apply(
    Align: scala.Double,
    AllItems: activexDashInteropLib.SafeArray[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[java.lang.String, java.lang.String]
    ],
    BackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Border: scala.Double,
    BorderColor: scala.Double,
    DefaultControl: java.lang.String,
    Dropdown: scala.Boolean,
    Enabled: scala.Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: scala.Double,
    FontRelief: scala.Double,
    Height: scala.Double,
    HelpText: java.lang.String,
    HelpURL: java.lang.String,
    ItemCount: scala.Double,
    ItemSeparatorPos: scala.Double,
    LineCount: scala.Double,
    MouseWheelBehavior: scala.Double,
    MultiSelection: scala.Boolean,
    Name: java.lang.String,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    Printable: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ReadOnly: scala.Boolean,
    SelectedItems: activexDashInteropLib.SafeArray[scala.Double],
    ServiceName: java.lang.String,
    Step: scala.Double,
    StringItemList: activexDashInteropLib.SafeArray[java.lang.String],
    TabIndex: scala.Double,
    Tabstop: scala.Boolean,
    Tag: java.lang.String,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Width: scala.Double,
    WritingMode: scala.Double,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addItemListListener: js.Function1[XItemListListener, scala.Unit],
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
    getAllItems: js.Function0[
      activexDashInteropLib.SafeArray[
        activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[java.lang.String, java.lang.String]
      ]
    ],
    getItemData: js.Function1[scala.Double, js.Any],
    getItemImage: js.Function1[scala.Double, java.lang.String],
    getItemText: js.Function1[scala.Double, java.lang.String],
    getItemTextAndImage: js.Function1[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[java.lang.String, java.lang.String]
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getServiceName: js.Function0[java.lang.String],
    insertItem: js.Function3[scala.Double, java.lang.String, java.lang.String, scala.Unit],
    insertItemImage: js.Function2[scala.Double, java.lang.String, scala.Unit],
    insertItemText: js.Function2[scala.Double, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    read: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectInputStream, scala.Unit],
    release: js.Function0[scala.Unit],
    removeAllItems: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeItem: js.Function1[scala.Double, scala.Unit],
    removeItemListListener: js.Function1[XItemListListener, scala.Unit],
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
    setItemData: js.Function2[scala.Double, js.Any, scala.Unit],
    setItemImage: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setItemText: js.Function2[scala.Double, java.lang.String, scala.Unit],
    setItemTextAndImage: js.Function3[scala.Double, java.lang.String, java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    write: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XObjectOutputStream, scala.Unit]
  ): UnoControlListBoxModel = {
    val __obj = js.Dynamic.literal(Align = Align, AllItems = AllItems, BackgroundColor = BackgroundColor, Border = Border, BorderColor = BorderColor, DefaultControl = DefaultControl, Dropdown = Dropdown, Enabled = Enabled, FontDescriptor = FontDescriptor, FontEmphasisMark = FontEmphasisMark, FontRelief = FontRelief, Height = Height, HelpText = HelpText, HelpURL = HelpURL, ItemCount = ItemCount, ItemSeparatorPos = ItemSeparatorPos, LineCount = LineCount, MouseWheelBehavior = MouseWheelBehavior, MultiSelection = MultiSelection, Name = Name, PositionX = PositionX, PositionY = PositionY, Printable = Printable, PropertySetInfo = PropertySetInfo, ReadOnly = ReadOnly, SelectedItems = SelectedItems, ServiceName = ServiceName, Step = Step, StringItemList = StringItemList, TabIndex = TabIndex, Tabstop = Tabstop, Tag = Tag, TextColor = TextColor, TextLineColor = TextLineColor, Width = Width, WritingMode = WritingMode, acquire = acquire, addEventListener = addEventListener, addItemListListener = addItemListListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getAllItems = getAllItems, getItemData = getItemData, getItemImage = getItemImage, getItemText = getItemText, getItemTextAndImage = getItemTextAndImage, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, insertItem = insertItem, insertItemImage = insertItemImage, insertItemText = insertItemText, queryInterface = queryInterface, read = read, release = release, removeAllItems = removeAllItems, removeEventListener = removeEventListener, removeItem = removeItem, removeItemListListener = removeItemListListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setItemData = setItemData, setItemImage = setItemImage, setItemText = setItemText, setItemTextAndImage = setItemTextAndImage, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[UnoControlListBoxModel]
  }
}

