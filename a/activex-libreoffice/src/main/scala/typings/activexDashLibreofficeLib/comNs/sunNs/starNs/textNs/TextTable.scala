package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a table of text cells which is anchored to a surrounding text.
  *
  * Note: The anchor of the actual implementation for text tables does not have a position in the text. Thus that anchor can not be used for some
  * operation like {@link XTextContent.attach()} or {@link XText.insertTextContent()} or other function that require the object to have a position in the
  * text.
  *
  * The reason why a text table still needs an anchor is that for example tables should be insertable via {@link XText.insertTextContent()} and that
  * interface uses a parameter of that type.
  *
  * Example: Create and insert a {@link TextTable} :
  *
  * {{program example here, see documentation}}
  * @see com.sun.star.text.Cell
  * @see com.sun.star.text.CellRange
  * @see com.sun.star.text.TableColumns
  * @see com.sun.star.text.TableRows
  * @see com.sun.star.text.TextTableCursor
  */
trait TextTable
  extends TextContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
     with XTextTable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataArray
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XAutoFormattable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XSortable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XCellRangeData {
  /** contains the color of the background. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: java.lang.String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL for the background graphic. */
  var BackGraphicURL: java.lang.String
  /** determines if the background color is transparent. */
  var BackTransparent: scala.Boolean
  /** determines the bottom margin. */
  var BottomMargin: scala.Double
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  /** determines if the first column of the table should be treated as axis labels when a chart is to be created. */
  var ChartColumnAsLabel: scala.Boolean
  /** determines if the first row of the table should be treated as axis labels when a chart is to be created. */
  var ChartRowAsLabel: scala.Boolean
  /** determines whether borders of neighboring table cells are collapsed into one */
  var CollapsingBorders: scala.Boolean
  /** determines the number of rows of the table repeated on every new page. */
  var HeaderRowCount: scala.Double
  /**
    * contains the horizontal orientation.
    * @see com.sun.star.text.HoriOrientation
    */
  var HoriOrient: scala.Double
  /** determines if the value of the relative width is valid. */
  var IsWidthRelative: scala.Boolean
  /** Setting this property to TRUE prevents page or column breaks between this table and the following paragraph or text table. */
  var KeepTogether: scala.Boolean
  /** contains the left margin of the table. */
  var LeftMargin: scala.Double
  /** If this property is set, it creates a page break before the table and assigns the value as the name of the new page style sheet to use. */
  var PageDescName: java.lang.String
  /** If a page break property is set at the table, this property contains the new value for the page number. */
  var PageNumberOffset: scala.Double
  /** determines the width of the table relative to its environment. */
  var RelativeWidth: scala.Double
  /** determines if the first row of the table is repeated on every new page. */
  var RepeatHeadline: scala.Boolean
  /** contains the right margin of the table. */
  var RightMargin: scala.Double
  /**
    * determines the type, color and size of the shadow.
    * @see com.sun.star.table.ShadowFormat
    */
  var ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** Setting this property to FALSE prevents the table from getting spread on two pages. */
  var Split: scala.Boolean
  /**
    * contains the description of the table borders.
    * @see com.sun.star.table.TableBorder
    */
  var TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder
  /** contains the sum of the column width values used in TableColumnSeparators. */
  var TableColumnRelativeSum: scala.Double
  /**
    * contains the column description of the table.
    * @see com.sun.star.text.TableColumnSeparator
    */
  var TableColumnSeparators: activexDashInteropLib.SafeArray[TableColumnSeparator]
  /**
    * Grab bag of table properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var TableInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * contains the name of table style used by the table.
    * @since LibreOffice 5.3
    */
  var TableTemplateName: java.lang.String
  /** determines the top margin. */
  var TopMargin: scala.Double
  /**
    * contains the absolute table width.
    *
    * As this is only a describing property the value of the actual table may vary depending on the environment the table is located in and the settings of
    * LeftMargin, RightMargin and HoriOrient.
    */
  var Width: scala.Double
}

object TextTable {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BottomMargin: scala.Double,
    BreakType: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType,
    CellNames: activexDashInteropLib.SafeArray[java.lang.String],
    ChartColumnAsLabel: scala.Boolean,
    ChartRowAsLabel: scala.Boolean,
    CollapsingBorders: scala.Boolean,
    ColumnDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns,
    Data: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]],
    DataArray: activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]],
    HeaderRowCount: scala.Double,
    HoriOrient: scala.Double,
    IsWidthRelative: scala.Boolean,
    KeepTogether: scala.Boolean,
    LeftMargin: scala.Double,
    Name: java.lang.String,
    NotANumber: scala.Double,
    PageDescName: java.lang.String,
    PageNumberOffset: scala.Double,
    RelativeWidth: scala.Double,
    RepeatHeadline: scala.Boolean,
    RightMargin: scala.Double,
    RowDescriptions: activexDashInteropLib.SafeArray[java.lang.String],
    Rows: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    Split: scala.Boolean,
    TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder,
    TableColumnRelativeSum: scala.Double,
    TableColumnSeparators: activexDashInteropLib.SafeArray[TableColumnSeparator],
    TableInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    TableTemplateName: java.lang.String,
    TextWrap: WrapTextMode,
    TopMargin: scala.Double,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Width: scala.Double,
    acquire: js.Function0[scala.Unit],
    addChartDataChangeEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener, 
      scala.Unit
    ],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    autoFormat: js.Function1[java.lang.String, scala.Unit],
    createCursorByCellName: js.Function1[java.lang.String, XTextTableCursor],
    createSortDescriptor: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getCellByName: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell],
    getCellByPosition: js.Function2[
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
    ],
    getCellNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getCellRangeByName: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange],
    getCellRangeByPosition: js.Function4[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
    ],
    getColumnDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getColumns: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns],
    getData: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[scala.Double]]],
    getDataArray: js.Function0[activexDashInteropLib.SafeArray[activexDashInteropLib.SafeArray[_]]],
    getName: js.Function0[java.lang.String],
    getNotANumber: js.Function0[scala.Double],
    getRowDescriptions: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getRows: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows],
    initialize: js.Function2[scala.Double, scala.Double, scala.Unit],
    isNotANumber: js.Function1[scala.Double, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChartDataChangeEventListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener, 
      scala.Unit
    ],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setColumnDescriptions: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]], 
      scala.Unit
    ],
    setDataArray: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ],
    setName: js.Function1[java.lang.String, scala.Unit],
    setRowDescriptions: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    sort: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      scala.Unit
    ]
  ): TextTable = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BottomMargin = BottomMargin, BreakType = BreakType, CellNames = CellNames, ChartColumnAsLabel = ChartColumnAsLabel, ChartRowAsLabel = ChartRowAsLabel, CollapsingBorders = CollapsingBorders, ColumnDescriptions = ColumnDescriptions, Columns = Columns, Data = Data, DataArray = DataArray, HeaderRowCount = HeaderRowCount, HoriOrient = HoriOrient, IsWidthRelative = IsWidthRelative, KeepTogether = KeepTogether, LeftMargin = LeftMargin, Name = Name, NotANumber = NotANumber, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, RelativeWidth = RelativeWidth, RepeatHeadline = RepeatHeadline, RightMargin = RightMargin, RowDescriptions = RowDescriptions, Rows = Rows, ShadowFormat = ShadowFormat, Split = Split, TableBorder = TableBorder, TableColumnRelativeSum = TableColumnRelativeSum, TableColumnSeparators = TableColumnSeparators, TableInteropGrabBag = TableInteropGrabBag, TableTemplateName = TableTemplateName, TextWrap = TextWrap, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, Width = Width, acquire = acquire, addChartDataChangeEventListener = addChartDataChangeEventListener, addEventListener = addEventListener, attach = attach, autoFormat = autoFormat, createCursorByCellName = createCursorByCellName, createSortDescriptor = createSortDescriptor, dispose = dispose, getAnchor = getAnchor, getCellByName = getCellByName, getCellByPosition = getCellByPosition, getCellNames = getCellNames, getCellRangeByName = getCellRangeByName, getCellRangeByPosition = getCellRangeByPosition, getColumnDescriptions = getColumnDescriptions, getColumns = getColumns, getData = getData, getDataArray = getDataArray, getName = getName, getNotANumber = getNotANumber, getRowDescriptions = getRowDescriptions, getRows = getRows, initialize = initialize, isNotANumber = isNotANumber, queryInterface = queryInterface, release = release, removeChartDataChangeEventListener = removeChartDataChangeEventListener, removeEventListener = removeEventListener, setColumnDescriptions = setColumnDescriptions, setData = setData, setDataArray = setDataArray, setName = setName, setRowDescriptions = setRowDescriptions, sort = sort)
  
    __obj.asInstanceOf[TextTable]
  }
}

