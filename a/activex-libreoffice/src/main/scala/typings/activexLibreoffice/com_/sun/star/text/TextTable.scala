package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.chart.XChartDataArray
import typings.activexLibreoffice.com_.sun.star.chart.XChartDataChangeEventListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.container.XNamed
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sheet.XCellRangeData
import typings.activexLibreoffice.com_.sun.star.style.BreakType
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.table.TableBorder
import typings.activexLibreoffice.com_.sun.star.table.XAutoFormattable
import typings.activexLibreoffice.com_.sun.star.table.XCell
import typings.activexLibreoffice.com_.sun.star.table.XCellRange
import typings.activexLibreoffice.com_.sun.star.table.XTableColumns
import typings.activexLibreoffice.com_.sun.star.table.XTableRows
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.util.XSortable
import typings.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with TextContent
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
  var BreakType: typings.activexLibreoffice.com_.sun.star.style.BreakType
  
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
  var ShadowFormat: typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
  
  /** Setting this property to FALSE prevents the table from getting spread on two pages. */
  var Split: Boolean
  
  /**
    * contains the description of the table borders.
    * @see com.sun.star.table.TableBorder
    */
  var TableBorder: typings.activexLibreoffice.com_.sun.star.table.TableBorder
  
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
  
  inline def apply(
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
    DataArray: SafeArray[SafeArray[js.Any]],
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
    getDataArray: () => SafeArray[SafeArray[js.Any]],
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
    setDataArray: SeqEquiv[SeqEquiv[js.Any]] => Unit,
    setName: String => Unit,
    setRowDescriptions: SeqEquiv[String] => Unit,
    sort: SeqEquiv[PropertyValue] => Unit
  ): TextTable = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], BottomMargin = BottomMargin.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CellNames = CellNames.asInstanceOf[js.Any], ChartColumnAsLabel = ChartColumnAsLabel.asInstanceOf[js.Any], ChartRowAsLabel = ChartRowAsLabel.asInstanceOf[js.Any], CollapsingBorders = CollapsingBorders.asInstanceOf[js.Any], ColumnDescriptions = ColumnDescriptions.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], DataArray = DataArray.asInstanceOf[js.Any], HeaderRowCount = HeaderRowCount.asInstanceOf[js.Any], HoriOrient = HoriOrient.asInstanceOf[js.Any], IsWidthRelative = IsWidthRelative.asInstanceOf[js.Any], KeepTogether = KeepTogether.asInstanceOf[js.Any], LeftMargin = LeftMargin.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NotANumber = NotANumber.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], RelativeWidth = RelativeWidth.asInstanceOf[js.Any], RepeatHeadline = RepeatHeadline.asInstanceOf[js.Any], RightMargin = RightMargin.asInstanceOf[js.Any], RowDescriptions = RowDescriptions.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], Split = Split.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableColumnRelativeSum = TableColumnRelativeSum.asInstanceOf[js.Any], TableColumnSeparators = TableColumnSeparators.asInstanceOf[js.Any], TableInteropGrabBag = TableInteropGrabBag.asInstanceOf[js.Any], TableTemplateName = TableTemplateName.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], TopMargin = TopMargin.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), autoFormat = js.Any.fromFunction1(autoFormat), createCursorByCellName = js.Any.fromFunction1(createCursorByCellName), createSortDescriptor = js.Any.fromFunction0(createSortDescriptor), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getCellByName = js.Any.fromFunction1(getCellByName), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellNames = js.Any.fromFunction0(getCellNames), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getColumns = js.Any.fromFunction0(getColumns), getData = js.Any.fromFunction0(getData), getDataArray = js.Any.fromFunction0(getDataArray), getName = js.Any.fromFunction0(getName), getNotANumber = js.Any.fromFunction0(getNotANumber), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), getRows = js.Any.fromFunction0(getRows), initialize = js.Any.fromFunction2(initialize), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setDataArray = js.Any.fromFunction1(setDataArray), setName = js.Any.fromFunction1(setName), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions), sort = js.Any.fromFunction1(sort))
    __obj.asInstanceOf[TextTable]
  }
  
  extension [Self <: TextTable](x: Self) {
    
    inline def setBackColor(value: Color): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicFilter(value: String): Self = StObject.set(x, "BackGraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "BackGraphicLocation", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicURL(value: String): Self = StObject.set(x, "BackGraphicURL", value.asInstanceOf[js.Any])
    
    inline def setBackTransparent(value: Boolean): Self = StObject.set(x, "BackTransparent", value.asInstanceOf[js.Any])
    
    inline def setBottomMargin(value: Double): Self = StObject.set(x, "BottomMargin", value.asInstanceOf[js.Any])
    
    inline def setBreakType(value: BreakType): Self = StObject.set(x, "BreakType", value.asInstanceOf[js.Any])
    
    inline def setChartColumnAsLabel(value: Boolean): Self = StObject.set(x, "ChartColumnAsLabel", value.asInstanceOf[js.Any])
    
    inline def setChartRowAsLabel(value: Boolean): Self = StObject.set(x, "ChartRowAsLabel", value.asInstanceOf[js.Any])
    
    inline def setCollapsingBorders(value: Boolean): Self = StObject.set(x, "CollapsingBorders", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowCount(value: Double): Self = StObject.set(x, "HeaderRowCount", value.asInstanceOf[js.Any])
    
    inline def setHoriOrient(value: Double): Self = StObject.set(x, "HoriOrient", value.asInstanceOf[js.Any])
    
    inline def setIsWidthRelative(value: Boolean): Self = StObject.set(x, "IsWidthRelative", value.asInstanceOf[js.Any])
    
    inline def setKeepTogether(value: Boolean): Self = StObject.set(x, "KeepTogether", value.asInstanceOf[js.Any])
    
    inline def setLeftMargin(value: Double): Self = StObject.set(x, "LeftMargin", value.asInstanceOf[js.Any])
    
    inline def setPageDescName(value: String): Self = StObject.set(x, "PageDescName", value.asInstanceOf[js.Any])
    
    inline def setPageNumberOffset(value: Double): Self = StObject.set(x, "PageNumberOffset", value.asInstanceOf[js.Any])
    
    inline def setRelativeWidth(value: Double): Self = StObject.set(x, "RelativeWidth", value.asInstanceOf[js.Any])
    
    inline def setRepeatHeadline(value: Boolean): Self = StObject.set(x, "RepeatHeadline", value.asInstanceOf[js.Any])
    
    inline def setRightMargin(value: Double): Self = StObject.set(x, "RightMargin", value.asInstanceOf[js.Any])
    
    inline def setShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ShadowFormat", value.asInstanceOf[js.Any])
    
    inline def setSplit(value: Boolean): Self = StObject.set(x, "Split", value.asInstanceOf[js.Any])
    
    inline def setTableBorder(value: TableBorder): Self = StObject.set(x, "TableBorder", value.asInstanceOf[js.Any])
    
    inline def setTableColumnRelativeSum(value: Double): Self = StObject.set(x, "TableColumnRelativeSum", value.asInstanceOf[js.Any])
    
    inline def setTableColumnSeparators(value: SafeArray[TableColumnSeparator]): Self = StObject.set(x, "TableColumnSeparators", value.asInstanceOf[js.Any])
    
    inline def setTableInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "TableInteropGrabBag", value.asInstanceOf[js.Any])
    
    inline def setTableTemplateName(value: String): Self = StObject.set(x, "TableTemplateName", value.asInstanceOf[js.Any])
    
    inline def setTopMargin(value: Double): Self = StObject.set(x, "TopMargin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
