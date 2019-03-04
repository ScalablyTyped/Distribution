package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the standard model of a {@link UnoControlGrid} control.
  * @since OOo 3.3
  */
trait UnoControlGridModel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControlModel {
  /**
    * specifies the color to be used when drawing the background of selected cells, while the control has the focus.
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var ActiveSelectionBackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the color to be used when drawing the text of selected cells, while the control has the focus.
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var ActiveSelectionTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the height of the column header row, if applicable.
    *
    * The height is specified in application font units - see {@link com.sun.star.util.MeasureUnit} .
    *
    * The value given here is ignored if {@link ShowColumnHeader} is `FALSE` .
    *
    * If the property is `VOID` , the grid control shall automatically determine a height which conveniently allows, according to the used font, to display
    * one line of text.
    */
  var ColumnHeaderHeight: scala.Double
  /**
    * Specifies the {@link XGridColumnModel} that is providing the column structure.
    *
    * You can implement your own instance of {@link XGridColumnModel} or use the {@link DefaultGridColumnModel} .
    *
    * The column model is in the ownership of the grid model: When you set a new column model, or dispose the grid model, then the (old) column model is
    * disposed, too.
    *
    * The default for this property is an empty instance of the {@link DefaultGridColumnModel} .
    */
  var ColumnModel: XGridColumnModel
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: scala.Double
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: scala.Double
  /**
    * Specifies the {@link XGridDataModel} that is providing the hierarchical data.
    *
    * You can implement your own instance of {@link XGridDataModel} or use the {@link DefaultGridDataModel} .
    *
    * The data model is in the ownership of the grid model: When you set a new data model, or dispose the grid model, then the (old) data model is disposed,
    * too.
    *
    * The default for this property is an empty instance of the {@link DefaultGridDataModel} .
    */
  var GridDataModel: XGridDataModel
  /**
    * specifies the color to be used when drawing lines between cells
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    * @see UseGridLines
    */
  var GridLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Specifies the vertical scrollbar mode.
    *
    * The default value is `FALSE`
    */
  var HScroll: scala.Boolean
  /**
    * specifies the color to be used when drawing the background of row or column headers
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var HeaderBackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the color to be used when drawing the text within row or column headers
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var HeaderTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** specifies the help text of the control. */
  var HelpText: java.lang.String
  /** specifies the help URL of the control. */
  var HelpURL: java.lang.String
  /**
    * specifies the color to be used when drawing the background of selected cells, while the control does not have the focus.
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var InactiveSelectionBackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the color to be used when drawing the text of selected cells, while the control does not have the focus.
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var InactiveSelectionTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the colors to be used as background for data rows.
    *
    * If this sequence is non-empty, the data rows will be rendered with alternating background colors: Assuming the sequence has `n` elements, each row
    * will use the background color as specified by its number's remainder modulo `n` .
    *
    * If this sequence is empty, all rows will use the same background color as the control as whole.
    *
    * If this property has a value of `VOID` , rows will be painted in alternating background colors, every second row having a background color derived
    * from the control's selection color.
    */
  var RowBackgroundColors: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color]
  /**
    * specifies the width of the row header column, if applicable.
    *
    * The width is specified in application font units - see {@link com.sun.star.util.MeasureUnit} .
    *
    * The value given here is ignored if {@link ShowRowHeader} is `FALSE` .
    */
  var RowHeaderWidth: scala.Double
  /**
    * Specifies the height of rows in the grid control.
    *
    * The height is specified in application font units - see {@link com.sun.star.util.MeasureUnit} .
    */
  var RowHeight: scala.Double
  /**
    * Specifies the selection mode that is enabled for this grid control.
    *
    * The default value is com::sun::star::view::SelectionType::SINGLE
    */
  var SelectionModel: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType
  /**
    * Specifies whether the grid control should display a title row.
    *
    * The default value is `TRUE`
    */
  var ShowColumnHeader: scala.Boolean
  /**
    * Specifies whether the grid control should display a special header column.
    *
    * The default value is `FALSE`
    */
  var ShowRowHeader: scala.Boolean
  /** Specifies that the control can be reached with the TAB key. */
  var Tabstop: scala.Boolean
  /**
    * specifies the color to be used when drawing cell texts
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * specifies the color to be used when drawing text lines (underlining and strikethrough)
    *
    * If this property has a value of `VOID` , the grid control renderer will use some default color, depending on the control's style settings.
    */
  var TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * controls whether or not to paint horizontal and vertical lines between the grid cells.
    * @see GridLineColor
    */
  var UseGridLines: scala.Boolean
  /**
    * Specifies the horizontal scrollbar mode.
    *
    * The default value is `FALSE`
    */
  var VScroll: scala.Boolean
  /** specifies the vertical alignment of the content in the control. */
  var VerticalAlign: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.VerticalAlignment
}

object UnoControlGridModel {
  @scala.inline
  def apply(
    ActiveSelectionBackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ActiveSelectionTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ColumnHeaderHeight: scala.Double,
    ColumnModel: XGridColumnModel,
    DefaultControl: java.lang.String,
    FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor,
    FontEmphasisMark: scala.Double,
    FontRelief: scala.Double,
    GridDataModel: XGridDataModel,
    GridLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HScroll: scala.Boolean,
    HeaderBackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HeaderTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Height: scala.Double,
    HelpText: java.lang.String,
    HelpURL: java.lang.String,
    InactiveSelectionBackgroundColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    InactiveSelectionTextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Name: java.lang.String,
    PositionX: java.lang.String,
    PositionY: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RowBackgroundColors: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    RowHeaderWidth: scala.Double,
    RowHeight: scala.Double,
    SelectionModel: activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.SelectionType,
    ServiceName: java.lang.String,
    ShowColumnHeader: scala.Boolean,
    ShowRowHeader: scala.Boolean,
    Step: scala.Double,
    TabIndex: scala.Double,
    Tabstop: scala.Boolean,
    Tag: java.lang.String,
    TextColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    TextLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    UseGridLines: scala.Boolean,
    VScroll: scala.Boolean,
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
  ): UnoControlGridModel = {
    val __obj = js.Dynamic.literal(ActiveSelectionBackgroundColor = ActiveSelectionBackgroundColor, ActiveSelectionTextColor = ActiveSelectionTextColor, ColumnHeaderHeight = ColumnHeaderHeight, ColumnModel = ColumnModel, DefaultControl = DefaultControl, FontDescriptor = FontDescriptor, FontEmphasisMark = FontEmphasisMark, FontRelief = FontRelief, GridDataModel = GridDataModel, GridLineColor = GridLineColor, HScroll = HScroll, HeaderBackgroundColor = HeaderBackgroundColor, HeaderTextColor = HeaderTextColor, Height = Height, HelpText = HelpText, HelpURL = HelpURL, InactiveSelectionBackgroundColor = InactiveSelectionBackgroundColor, InactiveSelectionTextColor = InactiveSelectionTextColor, Name = Name, PositionX = PositionX, PositionY = PositionY, PropertySetInfo = PropertySetInfo, RowBackgroundColors = RowBackgroundColors, RowHeaderWidth = RowHeaderWidth, RowHeight = RowHeight, SelectionModel = SelectionModel, ServiceName = ServiceName, ShowColumnHeader = ShowColumnHeader, ShowRowHeader = ShowRowHeader, Step = Step, TabIndex = TabIndex, Tabstop = Tabstop, Tag = Tag, TextColor = TextColor, TextLineColor = TextLineColor, UseGridLines = UseGridLines, VScroll = VScroll, VerticalAlign = VerticalAlign, Width = Width, acquire = acquire, addEventListener = addEventListener, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createClone = createClone, dispose = dispose, firePropertiesChangeEvent = firePropertiesChangeEvent, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, getServiceName = getServiceName, queryInterface = queryInterface, read = read, release = release, removeEventListener = removeEventListener, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues, write = write)
  
    __obj.asInstanceOf[UnoControlGridModel]
  }
}

