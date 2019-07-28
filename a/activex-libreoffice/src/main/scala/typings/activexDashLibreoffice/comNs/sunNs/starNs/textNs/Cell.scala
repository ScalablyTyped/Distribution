package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellContentType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellHoriJustify
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellOrientation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCell
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.CellProtection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a singe cell within a text table.
  * @see com.sun.star.text.TextTable
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellProperties because var conflicts: BottomBorder, LeftBorder, NumberFormat, RightBorder, TopBorder, UserDefinedAttributes. Inlined AsianVerticalMode, BottomBorder2, CellBackColor, CellInteropGrabBag, CellProtection, CellStyle, DiagonalBLTR, DiagonalBLTR2, DiagonalTLBR, DiagonalTLBR2, HoriJustify, IsCellBackgroundTransparent, IsTextWrapped, LeftBorder2, Orientation, ParaIndent, RightBorder2, RotateAngle, RotateReference, ShadowFormat, ShrinkToFit, TableBorder, TableBorder2, TopBorder2, VertJustify */ trait Cell
  extends CellProperties
     with XCell
     with XText {
  /**
    * selects Asian character orientation in vertical orientation.
    *
    * If the {@link CellProperties.Orientation} property is CellOrientation::STACKED, in Asian mode only Asian characters are printed in horizontal
    * orientation instead of all characters. For other values of {@link CellProperties.Orientation} , this value is not used.
    */
  var AsianVerticalMode: Boolean
  /**
    * contains a description of the bottom border line of each cell. Preferred over {@link BorderLine}{@link BottomBorder} .
    * @since LibreOffice 3.6
    */
  var BottomBorder2: BorderLine2
  /** contains the cell background color. */
  var CellBackColor: Color
  /**
    * Grab bag of cell properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var CellInteropGrabBag: SafeArray[PropertyValue]
  /**
    * contains a description of the cell protection.
    *
    * {@link Cell} protection is active only if the sheet is protected.
    */
  var CellProtection: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.CellProtection
  /** contains the name of the style of the cell. */
  var CellStyle: String
  /** contains a description of the bottom left to top right diagonal line of each cell. */
  var DiagonalBLTR: BorderLine
  /**
    * contains a description of the bottom left to top right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalBLTR} .
    * @since LibreOffice 3.6
    */
  var DiagonalBLTR2: BorderLine2
  /** contains a description of the top left to bottom right diagonal line of each cell. */
  var DiagonalTLBR: BorderLine
  /**
    * contains a description of the top left to bottom right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalTLBR} .
    * @since LibreOffice 3.6
    */
  var DiagonalTLBR2: BorderLine2
  /** contains the horizontal alignment of the cell contents. */
  var HoriJustify: CellHoriJustify
  /**
    * is `TRUE` , if the cell background is transparent.
    *
    * In this case the {@link CellProperties.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: Boolean
  /** is `TRUE` , if text in the cells will be wrapped automatically at the right border. */
  var IsTextWrapped: Boolean
  /**
    * contains a description of the left border line of each cell. Preferred over {@link BorderLine}{@link LeftBorder} .
    * @since LibreOffice 3.6
    */
  var LeftBorder2: BorderLine2
  /**
    * contains the orientation of the cell contents.
    *
    * If the {@link CellProperties.RotateAngle} property is non-zero, this value is not used.
    */
  var Orientation: CellOrientation
  /** defines the indentation of the cell contents (in 1/100 mm). */
  var ParaIndent: Double
  /**
    * contains a description of the right border line of each cell. Preferred over {@link BorderLine}{@link RightBorder} .
    * @since LibreOffice 3.6
    */
  var RightBorder2: BorderLine2
  /** defines how much the content of cells is rotated (in 1/100 degrees). */
  var RotateAngle: Double
  /**
    * defines at which edge rotated cells are aligned.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: Double
  /** contains a description of the shadow. */
  var ShadowFormat: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** is `TRUE` , if the cell content will be shrunk to fit in the cell. */
  var ShrinkToFit: Boolean
  /**
    * contains a description of the cell or cell range border.
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    */
  var TableBorder: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder
  /**
    * contains a description of the cell or cell range border. Preferred over {@link TableBorder}{@link TableBorder} .
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    * @since LibreOffice 3.6
    */
  var TableBorder2: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder2
  /**
    * contains a description of the top border line of each cell. Preferred over {@link BorderLine}{@link TopBorder} .
    * @since LibreOffice 3.6
    */
  var TopBorder2: BorderLine2
  /**
    * contains the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: Double
}

object Cell {
  @scala.inline
  def apply(
    AsianVerticalMode: Boolean,
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BottomBorder: BorderLine,
    BottomBorder2: BorderLine2,
    BottomBorderDistance: Double,
    CellBackColor: Color,
    CellInteropGrabBag: SafeArray[PropertyValue],
    CellName: String,
    CellProtection: CellProtection,
    CellStyle: String,
    DiagonalBLTR: BorderLine,
    DiagonalBLTR2: BorderLine2,
    DiagonalTLBR: BorderLine,
    DiagonalTLBR2: BorderLine2,
    End: XTextRange,
    Error: Double,
    Formula: String,
    HoriJustify: CellHoriJustify,
    IsCellBackgroundTransparent: Boolean,
    IsProtected: Boolean,
    IsTextWrapped: Boolean,
    LeftBorder: BorderLine,
    LeftBorder2: BorderLine2,
    LeftBorderDistance: Double,
    NumberFormat: Double,
    Orientation: CellOrientation,
    ParaIndent: Double,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorder2: BorderLine2,
    RightBorderDistance: Double,
    RotateAngle: Double,
    RotateReference: Double,
    ShadowFormat: ShadowFormat,
    ShrinkToFit: Boolean,
    Start: XTextRange,
    String: String,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TextSection: XTextSection,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    TopBorderDistance: Double,
    Type: CellContentType,
    UserDefinedAttributes: XNameContainer,
    Value: Double,
    VertJustify: Double,
    VertOrient: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getEnd: () => XTextRange,
    getError: () => Double,
    getFormula: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    getType: () => CellContentType,
    getValue: () => Double,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeTextContent: XTextContent => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setFormula: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setString: String => Unit,
    setValue: Double => Unit
  ): Cell = {
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BottomBorder = BottomBorder, BottomBorder2 = BottomBorder2, BottomBorderDistance = BottomBorderDistance, CellBackColor = CellBackColor, CellInteropGrabBag = CellInteropGrabBag, CellName = CellName, CellProtection = CellProtection, CellStyle = CellStyle, DiagonalBLTR = DiagonalBLTR, DiagonalBLTR2 = DiagonalBLTR2, DiagonalTLBR = DiagonalTLBR, DiagonalTLBR2 = DiagonalTLBR2, End = End, Error = Error, Formula = Formula, HoriJustify = HoriJustify, IsCellBackgroundTransparent = IsCellBackgroundTransparent, IsProtected = IsProtected, IsTextWrapped = IsTextWrapped, LeftBorder = LeftBorder, LeftBorder2 = LeftBorder2, LeftBorderDistance = LeftBorderDistance, NumberFormat = NumberFormat, Orientation = Orientation, ParaIndent = ParaIndent, PropertySetInfo = PropertySetInfo, RightBorder = RightBorder, RightBorder2 = RightBorder2, RightBorderDistance = RightBorderDistance, RotateAngle = RotateAngle, RotateReference = RotateReference, ShadowFormat = ShadowFormat, ShrinkToFit = ShrinkToFit, Start = Start, String = String, TableBorder = TableBorder, TableBorder2 = TableBorder2, TextSection = TextSection, TopBorder = TopBorder, TopBorder2 = TopBorder2, TopBorderDistance = TopBorderDistance, Type = Type, UserDefinedAttributes = UserDefinedAttributes, Value = Value, VertJustify = VertJustify, VertOrient = VertOrient, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFormula = js.Any.fromFunction1(setFormula), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[Cell]
  }
}

