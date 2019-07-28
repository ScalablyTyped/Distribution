package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.XChartDataArray
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs.XCellRangeData
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.BreakType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XAutoFormattable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCell
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCellRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableColumns
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableRows
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XSortable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
import typings.std.SafeArray
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
     with UserDefinedAttributesSupplier
     with XTextTable
     with XNamed
     with XCellRange
     with XChartDataArray
     with XAutoFormattable
     with XSortable
     with XCellRangeData {
  /** contains the color of the background. */
  var BackColor: Color
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: String
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation
  /** contains the URL for the background graphic. */
  var BackGraphicURL: String
  /** determines if the background color is transparent. */
  var BackTransparent: Boolean
  /** determines the bottom margin. */
  var BottomMargin: Double
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.BreakType
  /** determines if the first column of the table should be treated as axis labels when a chart is to be created. */
  var ChartColumnAsLabel: Boolean
  /** determines if the first row of the table should be treated as axis labels when a chart is to be created. */
  var ChartRowAsLabel: Boolean
  /** determines whether borders of neighboring table cells are collapsed into one */
  var CollapsingBorders: Boolean
  /** determines the number of rows of the table repeated on every new page. */
  var HeaderRowCount: Double
  /**
    * contains the horizontal orientation.
    * @see com.sun.star.text.HoriOrientation
    */
  var HoriOrient: Double
  /** determines if the value of the relative width is valid. */
  var IsWidthRelative: Boolean
  /** Setting this property to TRUE prevents page or column breaks between this table and the following paragraph or text table. */
  var KeepTogether: Boolean
  /** contains the left margin of the table. */
  var LeftMargin: Double
  /** If this property is set, it creates a page break before the table and assigns the value as the name of the new page style sheet to use. */
  var PageDescName: String
  /** If a page break property is set at the table, this property contains the new value for the page number. */
  var PageNumberOffset: Double
  /** determines the width of the table relative to its environment. */
  var RelativeWidth: Double
  /** determines if the first row of the table is repeated on every new page. */
  var RepeatHeadline: Boolean
  /** contains the right margin of the table. */
  var RightMargin: Double
  /**
    * determines the type, color and size of the shadow.
    * @see com.sun.star.table.ShadowFormat
    */
  var ShadowFormat: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** Setting this property to FALSE prevents the table from getting spread on two pages. */
  var Split: Boolean
  /**
    * contains the description of the table borders.
    * @see com.sun.star.table.TableBorder
    */
  var TableBorder: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder
  /** contains the sum of the column width values used in TableColumnSeparators. */
  var TableColumnRelativeSum: Double
  /**
    * contains the column description of the table.
    * @see com.sun.star.text.TableColumnSeparator
    */
  var TableColumnSeparators: SafeArray[TableColumnSeparator]
  /**
    * Grab bag of table properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var TableInteropGrabBag: SafeArray[PropertyValue]
  /**
    * contains the name of table style used by the table.
    * @since LibreOffice 5.3
    */
  var TableTemplateName: String
  /** determines the top margin. */
  var TopMargin: Double
  /**
    * contains the absolute table width.
    *
    * As this is only a describing property the value of the actual table may vary depending on the environment the table is located in and the settings of
    * LeftMargin, RightMargin and HoriOrient.
    */
  var Width: Double
}

object TextTable {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BottomMargin: Double,
    BreakType: BreakType,
    CellNames: SafeArray[String],
    ChartColumnAsLabel: Boolean,
    ChartRowAsLabel: Boolean,
    CollapsingBorders: Boolean,
    ColumnDescriptions: SafeArray[String],
    Columns: XTableColumns,
    Data: SafeArray[SafeArray[Double]],
    DataArray: SafeArray[SafeArray[_]],
    HeaderRowCount: Double,
    HoriOrient: Double,
    IsWidthRelative: Boolean,
    KeepTogether: Boolean,
    LeftMargin: Double,
    Name: String,
    NotANumber: Double,
    PageDescName: String,
    PageNumberOffset: Double,
    RelativeWidth: Double,
    RepeatHeadline: Boolean,
    RightMargin: Double,
    RowDescriptions: SafeArray[String],
    Rows: XTableRows,
    ShadowFormat: ShadowFormat,
    Split: Boolean,
    TableBorder: TableBorder,
    TableColumnRelativeSum: Double,
    TableColumnSeparators: SafeArray[TableColumnSeparator],
    TableInteropGrabBag: SafeArray[PropertyValue],
    TableTemplateName: String,
    TextWrap: WrapTextMode,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    autoFormat: String => Unit,
    createCursorByCellName: String => XTextTableCursor,
    createSortDescriptor: () => SafeArray[PropertyValue],
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getCellByName: String => XCell,
    getCellByPosition: (Double, Double) => XCell,
    getCellNames: () => SafeArray[String],
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getColumnDescriptions: () => SafeArray[String],
    getColumns: () => XTableColumns,
    getData: () => SafeArray[SafeArray[Double]],
    getDataArray: () => SafeArray[SafeArray[_]],
    getName: () => String,
    getNotANumber: () => Double,
    getRowDescriptions: () => SafeArray[String],
    getRows: () => XTableRows,
    initialize: (Double, Double) => Unit,
    isNotANumber: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    removeEventListener: XEventListener => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setDataArray: SeqEquiv[SeqEquiv[_]] => Unit,
    setName: String => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit,
    sort: SeqEquiv[PropertyValue] => Unit
  ): TextTable = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BottomMargin = BottomMargin, BreakType = BreakType, CellNames = CellNames, ChartColumnAsLabel = ChartColumnAsLabel, ChartRowAsLabel = ChartRowAsLabel, CollapsingBorders = CollapsingBorders, ColumnDescriptions = ColumnDescriptions, Columns = Columns, Data = Data, DataArray = DataArray, HeaderRowCount = HeaderRowCount, HoriOrient = HoriOrient, IsWidthRelative = IsWidthRelative, KeepTogether = KeepTogether, LeftMargin = LeftMargin, Name = Name, NotANumber = NotANumber, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, RelativeWidth = RelativeWidth, RepeatHeadline = RepeatHeadline, RightMargin = RightMargin, RowDescriptions = RowDescriptions, Rows = Rows, ShadowFormat = ShadowFormat, Split = Split, TableBorder = TableBorder, TableColumnRelativeSum = TableColumnRelativeSum, TableColumnSeparators = TableColumnSeparators, TableInteropGrabBag = TableInteropGrabBag, TableTemplateName = TableTemplateName, TextWrap = TextWrap, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, Width = Width, acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), autoFormat = js.Any.fromFunction1(autoFormat), createCursorByCellName = js.Any.fromFunction1(createCursorByCellName), createSortDescriptor = js.Any.fromFunction0(createSortDescriptor), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getCellByName = js.Any.fromFunction1(getCellByName), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellNames = js.Any.fromFunction0(getCellNames), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getColumns = js.Any.fromFunction0(getColumns), getData = js.Any.fromFunction0(getData), getDataArray = js.Any.fromFunction0(getDataArray), getName = js.Any.fromFunction0(getName), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), getRows = js.Any.fromFunction0(getRows), initialize = js.Any.fromFunction2(initialize), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setDataArray = js.Any.fromFunction1(setDataArray), setName = js.Any.fromFunction1(setName), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[TextTable]
  }
}

