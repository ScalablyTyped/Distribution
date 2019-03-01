package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the properties of a table cell.
  * @see com.sun.star.table.Cell
  * @see com.sun.star.table.CellRange
  */
trait CellProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * selects Asian character orientation in vertical orientation.
    *
    * If the {@link CellProperties.Orientation} property is CellOrientation::STACKED, in Asian mode only Asian characters are printed in horizontal
    * orientation instead of all characters. For other values of {@link CellProperties.Orientation} , this value is not used.
    */
  var AsianVerticalMode: scala.Boolean
  /** contains a description of the bottom border line of each cell. */
  var BottomBorder: BorderLine
  /**
    * contains a description of the bottom border line of each cell. Preferred over {@link BorderLine}{@link BottomBorder} .
    * @since LibreOffice 3.6
    */
  var BottomBorder2: BorderLine2
  /** contains the cell background color. */
  var CellBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /**
    * Grab bag of cell properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var CellInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * contains a description of the cell protection.
    *
    * {@link Cell} protection is active only if the sheet is protected.
    */
  var CellProtection: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.CellProtection
  /** contains the name of the style of the cell. */
  var CellStyle: java.lang.String
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
  var IsCellBackgroundTransparent: scala.Boolean
  /** is `TRUE` , if text in the cells will be wrapped automatically at the right border. */
  var IsTextWrapped: scala.Boolean
  /** contains a description of the left border line of each cell. */
  var LeftBorder: BorderLine
  /**
    * contains a description of the left border line of each cell. Preferred over {@link BorderLine}{@link LeftBorder} .
    * @since LibreOffice 3.6
    */
  var LeftBorder2: BorderLine2
  /**
    * contains the index of the number format that is used in the cells.
    *
    * The proper value can be determined by using the {@link com.sun.star.util.NumberFormatter} interface of the document.
    */
  var NumberFormat: scala.Double
  /**
    * contains the orientation of the cell contents.
    *
    * If the {@link CellProperties.RotateAngle} property is non-zero, this value is not used.
    */
  var Orientation: CellOrientation
  /** defines the indentation of the cell contents (in 1/100 mm). */
  var ParaIndent: scala.Double
  /** contains a description of the right border line of each cell. */
  var RightBorder: BorderLine
  /**
    * contains a description of the right border line of each cell. Preferred over {@link BorderLine}{@link RightBorder} .
    * @since LibreOffice 3.6
    */
  var RightBorder2: BorderLine2
  /** defines how much the content of cells is rotated (in 1/100 degrees). */
  var RotateAngle: scala.Double
  /**
    * defines at which edge rotated cells are aligned.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: scala.Double
  /** contains a description of the shadow. */
  var ShadowFormat: ShadowFormat
  /** is `TRUE` , if the cell content will be shrunk to fit in the cell. */
  var ShrinkToFit: scala.Boolean
  /**
    * contains a description of the cell or cell range border.
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    */
  var TableBorder: TableBorder
  /**
    * contains a description of the cell or cell range border. Preferred over {@link TableBorder}{@link TableBorder} .
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    * @since LibreOffice 3.6
    */
  var TableBorder2: TableBorder2
  /** contains a description of the top border line of each cell. */
  var TopBorder: BorderLine
  /**
    * contains a description of the top border line of each cell. Preferred over {@link BorderLine}{@link TopBorder} .
    * @since LibreOffice 3.6
    */
  var TopBorder2: BorderLine2
  /**
    * stores additional attributes.
    *
    * This property is used i.e. by the XML filters to load and restore unknown attributes.
    */
  var UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * contains the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: scala.Double
}

object CellProperties {
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
  ): CellProperties = {
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
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[CellProperties]
  }
}

