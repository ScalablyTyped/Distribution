package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a singe cell within a table. */
trait Cell
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
     with CellProperties
     with XCell

object Cell {
  @scala.inline
  def apply(
    AsianVerticalMode: scala.Boolean,
    BottomBorder: BorderLine,
    BottomBorder2: BorderLine2,
    CellBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CellInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CellProtection: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.CellProtection,
    CellStyle: java.lang.String,
    DiagonalBLTR: BorderLine,
    DiagonalBLTR2: BorderLine2,
    DiagonalTLBR: BorderLine,
    DiagonalTLBR2: BorderLine2,
    End: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    Error: scala.Double,
    Formula: java.lang.String,
    HoriJustify: CellHoriJustify,
    IsCellBackgroundTransparent: scala.Boolean,
    IsTextWrapped: scala.Boolean,
    LeftBorder: BorderLine,
    LeftBorder2: BorderLine2,
    NumberFormat: scala.Double,
    Orientation: CellOrientation,
    ParaIndent: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorder2: BorderLine2,
    RotateAngle: scala.Double,
    RotateReference: scala.Double,
    ShadowFormat: ShadowFormat,
    ShrinkToFit: scala.Boolean,
    Start: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange,
    String: java.lang.String,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    Type: CellContentType,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Value: scala.Double,
    VertJustify: scala.Double,
    acquire: js.Function0[scala.Unit],
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
    createTextCursor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor],
    createTextCursorByRange: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextCursor
    ],
    getEnd: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getError: js.Function0[scala.Double],
    getFormula: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getStart: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText],
    getType: js.Function0[CellContentType],
    getValue: js.Function0[scala.Double],
    insertControlCharacter: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      scala.Double, 
      scala.Boolean, 
      scala.Unit
    ],
    insertString: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      java.lang.String, 
      scala.Boolean, 
      scala.Unit
    ],
    insertTextContent: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextRange, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextContent, 
      scala.Boolean, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeTextContent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextContent, scala.Unit],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setFormula: js.Function1[java.lang.String, scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit]
  ): Cell = {
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode, BottomBorder = BottomBorder, BottomBorder2 = BottomBorder2, CellBackColor = CellBackColor, CellInteropGrabBag = CellInteropGrabBag, CellProtection = CellProtection, CellStyle = CellStyle, DiagonalBLTR = DiagonalBLTR, DiagonalBLTR2 = DiagonalBLTR2, DiagonalTLBR = DiagonalTLBR, DiagonalTLBR2 = DiagonalTLBR2, End = End, Error = Error, Formula = Formula, HoriJustify = HoriJustify, IsCellBackgroundTransparent = IsCellBackgroundTransparent, IsTextWrapped = IsTextWrapped, LeftBorder = LeftBorder, LeftBorder2 = LeftBorder2, NumberFormat = NumberFormat, Orientation = Orientation, ParaIndent = ParaIndent, PropertySetInfo = PropertySetInfo, RightBorder = RightBorder, RightBorder2 = RightBorder2, RotateAngle = RotateAngle, RotateReference = RotateReference, ShadowFormat = ShadowFormat, ShrinkToFit = ShrinkToFit, Start = Start, String = String, TableBorder = TableBorder, TableBorder2 = TableBorder2, TopBorder = TopBorder, TopBorder2 = TopBorder2, Type = Type, UserDefinedAttributes = UserDefinedAttributes, Value = Value, VertJustify = VertJustify, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, createTextCursor = createTextCursor, createTextCursorByRange = createTextCursorByRange, getEnd = getEnd, getError = getError, getFormula = getFormula, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getStart = getStart, getString = getString, getText = getText, getType = getType, getValue = getValue, insertControlCharacter = insertControlCharacter, insertString = insertString, insertTextContent = insertTextContent, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeTextContent = removeTextContent, removeVetoableChangeListener = removeVetoableChangeListener, setFormula = setFormula, setPropertyValue = setPropertyValue, setString = setString, setValue = setValue)
  
    __obj.asInstanceOf[Cell]
  }
}

