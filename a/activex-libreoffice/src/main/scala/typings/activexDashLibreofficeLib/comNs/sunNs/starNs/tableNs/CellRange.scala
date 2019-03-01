package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of cells within a table. */
trait CellRange
  extends CellProperties
     with XCellRange

object CellRange {
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
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
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
    getCellByPosition: js.Function2[scala.Double, scala.Double, XCell],
    getCellRangeByName: js.Function1[java.lang.String, XCellRange],
    getCellRangeByPosition: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, XCellRange],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): CellRange = {
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
    __obj.updateDynamic("TableBorder")(TableBorder)
    __obj.updateDynamic("TableBorder2")(TableBorder2)
    __obj.updateDynamic("TopBorder")(TopBorder)
    __obj.updateDynamic("TopBorder2")(TopBorder2)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("VertJustify")(VertJustify)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getCellByPosition")(getCellByPosition)
    __obj.updateDynamic("getCellRangeByName")(getCellRangeByName)
    __obj.updateDynamic("getCellRangeByPosition")(getCellRangeByPosition)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[CellRange]
  }
}

