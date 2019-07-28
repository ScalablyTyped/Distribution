package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XText
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextContent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextCursor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.CellProtection
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a singe cell within a table. */
trait Cell
  extends XText
     with CellProperties
     with XCell

object Cell {
  @scala.inline
  def apply(
    AsianVerticalMode: Boolean,
    BottomBorder: BorderLine,
    BottomBorder2: BorderLine2,
    CellBackColor: Color,
    CellInteropGrabBag: SafeArray[PropertyValue],
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
    IsTextWrapped: Boolean,
    LeftBorder: BorderLine,
    LeftBorder2: BorderLine2,
    NumberFormat: Double,
    Orientation: CellOrientation,
    ParaIndent: Double,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorder2: BorderLine2,
    RotateAngle: Double,
    RotateReference: Double,
    ShadowFormat: ShadowFormat,
    ShrinkToFit: Boolean,
    Start: XTextRange,
    String: String,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    Type: CellContentType,
    UserDefinedAttributes: XNameContainer,
    Value: Double,
    VertJustify: Double,
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
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode, BottomBorder = BottomBorder, BottomBorder2 = BottomBorder2, CellBackColor = CellBackColor, CellInteropGrabBag = CellInteropGrabBag, CellProtection = CellProtection, CellStyle = CellStyle, DiagonalBLTR = DiagonalBLTR, DiagonalBLTR2 = DiagonalBLTR2, DiagonalTLBR = DiagonalTLBR, DiagonalTLBR2 = DiagonalTLBR2, End = End, Error = Error, Formula = Formula, HoriJustify = HoriJustify, IsCellBackgroundTransparent = IsCellBackgroundTransparent, IsTextWrapped = IsTextWrapped, LeftBorder = LeftBorder, LeftBorder2 = LeftBorder2, NumberFormat = NumberFormat, Orientation = Orientation, ParaIndent = ParaIndent, PropertySetInfo = PropertySetInfo, RightBorder = RightBorder, RightBorder2 = RightBorder2, RotateAngle = RotateAngle, RotateReference = RotateReference, ShadowFormat = ShadowFormat, ShrinkToFit = ShrinkToFit, Start = Start, String = String, TableBorder = TableBorder, TableBorder2 = TableBorder2, TopBorder = TopBorder, TopBorder2 = TopBorder2, Type = Type, UserDefinedAttributes = UserDefinedAttributes, Value = Value, VertJustify = VertJustify, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getError = js.Any.fromFunction0(getError), getFormula = js.Any.fromFunction0(getFormula), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeTextContent = js.Any.fromFunction1(removeTextContent), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFormula = js.Any.fromFunction1(setFormula), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setString = js.Any.fromFunction1(setString), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[Cell]
  }
}

