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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AsianVerticalMode")(AsianVerticalMode)
    __obj.updateDynamic("BottomBorder")(BottomBorder)
    __obj.updateDynamic("BottomBorder2")(BottomBorder2)
    __obj.updateDynamic("CellBackColor")(CellBackColor)
    __obj.updateDynamic("CellInteropGrabBag")(CellInteropGrabBag)
    __obj.updateDynamic("CellProtection")(CellProtection)
    __obj.updateDynamic("CellStyle")(CellStyle)
    __obj.updateDynamic("DiagonalBLTR")(DiagonalBLTR)
    __obj.updateDynamic("DiagonalBLTR2")(DiagonalBLTR2)
    __obj.updateDynamic("DiagonalTLBR")(DiagonalTLBR)
    __obj.updateDynamic("DiagonalTLBR2")(DiagonalTLBR2)
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("HoriJustify")(HoriJustify)
    __obj.updateDynamic("IsCellBackgroundTransparent")(IsCellBackgroundTransparent)
    __obj.updateDynamic("IsTextWrapped")(IsTextWrapped)
    __obj.updateDynamic("LeftBorder")(LeftBorder)
    __obj.updateDynamic("LeftBorder2")(LeftBorder2)
    __obj.updateDynamic("NumberFormat")(NumberFormat)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("ParaIndent")(ParaIndent)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RightBorder")(RightBorder)
    __obj.updateDynamic("RightBorder2")(RightBorder2)
    __obj.updateDynamic("RotateAngle")(RotateAngle)
    __obj.updateDynamic("RotateReference")(RotateReference)
    __obj.updateDynamic("ShadowFormat")(ShadowFormat)
    __obj.updateDynamic("ShrinkToFit")(ShrinkToFit)
    __obj.updateDynamic("Start")(Start)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("TableBorder")(TableBorder)
    __obj.updateDynamic("TableBorder2")(TableBorder2)
    __obj.updateDynamic("TopBorder")(TopBorder)
    __obj.updateDynamic("TopBorder2")(TopBorder2)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("VertJustify")(VertJustify)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("createTextCursor")(createTextCursor)
    __obj.updateDynamic("createTextCursorByRange")(createTextCursorByRange)
    __obj.updateDynamic("getEnd")(getEnd)
    __obj.updateDynamic("getError")(getError)
    __obj.updateDynamic("getFormula")(getFormula)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("getStart")(getStart)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("insertControlCharacter")(insertControlCharacter)
    __obj.updateDynamic("insertString")(insertString)
    __obj.updateDynamic("insertTextContent")(insertTextContent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeTextContent")(removeTextContent)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setFormula")(setFormula)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.updateDynamic("setString")(setString)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[Cell]
  }
}

