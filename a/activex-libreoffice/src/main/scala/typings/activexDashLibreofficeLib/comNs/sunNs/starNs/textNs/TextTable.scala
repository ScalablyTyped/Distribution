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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("AnchorType")(AnchorType)
    __obj.updateDynamic("AnchorTypes")(AnchorTypes)
    __obj.updateDynamic("BackColor")(BackColor)
    __obj.updateDynamic("BackGraphicFilter")(BackGraphicFilter)
    __obj.updateDynamic("BackGraphicLocation")(BackGraphicLocation)
    __obj.updateDynamic("BackGraphicURL")(BackGraphicURL)
    __obj.updateDynamic("BackTransparent")(BackTransparent)
    __obj.updateDynamic("BottomMargin")(BottomMargin)
    __obj.updateDynamic("BreakType")(BreakType)
    __obj.updateDynamic("CellNames")(CellNames)
    __obj.updateDynamic("ChartColumnAsLabel")(ChartColumnAsLabel)
    __obj.updateDynamic("ChartRowAsLabel")(ChartRowAsLabel)
    __obj.updateDynamic("CollapsingBorders")(CollapsingBorders)
    __obj.updateDynamic("ColumnDescriptions")(ColumnDescriptions)
    __obj.updateDynamic("Columns")(Columns)
    __obj.updateDynamic("Data")(Data)
    __obj.updateDynamic("DataArray")(DataArray)
    __obj.updateDynamic("HeaderRowCount")(HeaderRowCount)
    __obj.updateDynamic("HoriOrient")(HoriOrient)
    __obj.updateDynamic("IsWidthRelative")(IsWidthRelative)
    __obj.updateDynamic("KeepTogether")(KeepTogether)
    __obj.updateDynamic("LeftMargin")(LeftMargin)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NotANumber")(NotANumber)
    __obj.updateDynamic("PageDescName")(PageDescName)
    __obj.updateDynamic("PageNumberOffset")(PageNumberOffset)
    __obj.updateDynamic("RelativeWidth")(RelativeWidth)
    __obj.updateDynamic("RepeatHeadline")(RepeatHeadline)
    __obj.updateDynamic("RightMargin")(RightMargin)
    __obj.updateDynamic("RowDescriptions")(RowDescriptions)
    __obj.updateDynamic("Rows")(Rows)
    __obj.updateDynamic("ShadowFormat")(ShadowFormat)
    __obj.updateDynamic("Split")(Split)
    __obj.updateDynamic("TableBorder")(TableBorder)
    __obj.updateDynamic("TableColumnRelativeSum")(TableColumnRelativeSum)
    __obj.updateDynamic("TableColumnSeparators")(TableColumnSeparators)
    __obj.updateDynamic("TableInteropGrabBag")(TableInteropGrabBag)
    __obj.updateDynamic("TableTemplateName")(TableTemplateName)
    __obj.updateDynamic("TextWrap")(TextWrap)
    __obj.updateDynamic("TopMargin")(TopMargin)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Width")(Width)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addChartDataChangeEventListener")(addChartDataChangeEventListener)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("autoFormat")(autoFormat)
    __obj.updateDynamic("createCursorByCellName")(createCursorByCellName)
    __obj.updateDynamic("createSortDescriptor")(createSortDescriptor)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAnchor")(getAnchor)
    __obj.updateDynamic("getCellByName")(getCellByName)
    __obj.updateDynamic("getCellByPosition")(getCellByPosition)
    __obj.updateDynamic("getCellNames")(getCellNames)
    __obj.updateDynamic("getCellRangeByName")(getCellRangeByName)
    __obj.updateDynamic("getCellRangeByPosition")(getCellRangeByPosition)
    __obj.updateDynamic("getColumnDescriptions")(getColumnDescriptions)
    __obj.updateDynamic("getColumns")(getColumns)
    __obj.updateDynamic("getData")(getData)
    __obj.updateDynamic("getDataArray")(getDataArray)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getNotANumber")(getNotANumber)
    __obj.updateDynamic("getRowDescriptions")(getRowDescriptions)
    __obj.updateDynamic("getRows")(getRows)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isNotANumber")(isNotANumber)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChartDataChangeEventListener")(removeChartDataChangeEventListener)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setColumnDescriptions")(setColumnDescriptions)
    __obj.updateDynamic("setData")(setData)
    __obj.updateDynamic("setDataArray")(setDataArray)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setRowDescriptions")(setRowDescriptions)
    __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[TextTable]
  }
}

