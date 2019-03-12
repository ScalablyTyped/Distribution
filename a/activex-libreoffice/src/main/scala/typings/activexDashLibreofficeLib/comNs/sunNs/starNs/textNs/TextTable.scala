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
  var TableColumnSeparators: stdLib.SafeArray[TableColumnSeparator]
  /**
    * Grab bag of table properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var TableInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
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
    AnchorTypes: stdLib.SafeArray[TextContentAnchorType],
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BottomMargin: scala.Double,
    BreakType: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType,
    CellNames: stdLib.SafeArray[java.lang.String],
    ChartColumnAsLabel: scala.Boolean,
    ChartRowAsLabel: scala.Boolean,
    CollapsingBorders: scala.Boolean,
    ColumnDescriptions: stdLib.SafeArray[java.lang.String],
    Columns: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns,
    Data: stdLib.SafeArray[stdLib.SafeArray[scala.Double]],
    DataArray: stdLib.SafeArray[stdLib.SafeArray[_]],
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
    RowDescriptions: stdLib.SafeArray[java.lang.String],
    Rows: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    Split: scala.Boolean,
    TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder,
    TableColumnRelativeSum: scala.Double,
    TableColumnSeparators: stdLib.SafeArray[TableColumnSeparator],
    TableInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    TableTemplateName: java.lang.String,
    TextWrap: WrapTextMode,
    TopMargin: scala.Double,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Width: scala.Double,
    acquire: () => scala.Unit,
    addChartDataChangeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attach: XTextRange => scala.Unit,
    autoFormat: java.lang.String => scala.Unit,
    createCursorByCellName: java.lang.String => XTextTableCursor,
    createSortDescriptor: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    dispose: () => scala.Unit,
    getAnchor: () => XTextRange,
    getCellByName: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell,
    getCellByPosition: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell,
    getCellNames: () => stdLib.SafeArray[java.lang.String],
    getCellRangeByName: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getCellRangeByPosition: (scala.Double, scala.Double, scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange,
    getColumnDescriptions: () => stdLib.SafeArray[java.lang.String],
    getColumns: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableColumns,
    getData: () => stdLib.SafeArray[stdLib.SafeArray[scala.Double]],
    getDataArray: () => stdLib.SafeArray[stdLib.SafeArray[_]],
    getName: () => java.lang.String,
    getNotANumber: () => scala.Double,
    getRowDescriptions: () => stdLib.SafeArray[java.lang.String],
    getRows: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XTableRows,
    initialize: (scala.Double, scala.Double) => scala.Unit,
    isNotANumber: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeChartDataChangeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setColumnDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setData: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]] => scala.Unit,
    setDataArray: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]] => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setRowDescriptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    sort: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue] => scala.Unit
  ): TextTable = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BottomMargin = BottomMargin, BreakType = BreakType, CellNames = CellNames, ChartColumnAsLabel = ChartColumnAsLabel, ChartRowAsLabel = ChartRowAsLabel, CollapsingBorders = CollapsingBorders, ColumnDescriptions = ColumnDescriptions, Columns = Columns, Data = Data, DataArray = DataArray, HeaderRowCount = HeaderRowCount, HoriOrient = HoriOrient, IsWidthRelative = IsWidthRelative, KeepTogether = KeepTogether, LeftMargin = LeftMargin, Name = Name, NotANumber = NotANumber, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, RelativeWidth = RelativeWidth, RepeatHeadline = RepeatHeadline, RightMargin = RightMargin, RowDescriptions = RowDescriptions, Rows = Rows, ShadowFormat = ShadowFormat, Split = Split, TableBorder = TableBorder, TableColumnRelativeSum = TableColumnRelativeSum, TableColumnSeparators = TableColumnSeparators, TableInteropGrabBag = TableInteropGrabBag, TableTemplateName = TableTemplateName, TextWrap = TextWrap, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, Width = Width, acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), autoFormat = js.Any.fromFunction1(autoFormat), createCursorByCellName = js.Any.fromFunction1(createCursorByCellName), createSortDescriptor = js.Any.fromFunction0(createSortDescriptor), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getCellByName = js.Any.fromFunction1(getCellByName), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellNames = js.Any.fromFunction0(getCellNames), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getColumns = js.Any.fromFunction0(getColumns), getData = js.Any.fromFunction0(getData), getDataArray = js.Any.fromFunction0(getDataArray), getName = js.Any.fromFunction0(getName), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), getRows = js.Any.fromFunction0(getRows), initialize = js.Any.fromFunction2(initialize), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setDataArray = js.Any.fromFunction1(setDataArray), setName = js.Any.fromFunction1(setName), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[TextTable]
  }
}

