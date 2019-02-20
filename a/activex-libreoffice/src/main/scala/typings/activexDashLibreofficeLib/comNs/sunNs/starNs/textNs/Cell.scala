package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a singe cell within a text table.
  * @see com.sun.star.text.TextTable
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellProperties because var conflicts: BottomBorder, LeftBorder, NumberFormat, RightBorder, TopBorder, UserDefinedAttributes. Inlined AsianVerticalMode, BottomBorder2, CellBackColor, CellInteropGrabBag, CellProtection, CellStyle, DiagonalBLTR, DiagonalBLTR2, DiagonalTLBR, DiagonalTLBR2, HoriJustify, IsCellBackgroundTransparent, IsTextWrapped, LeftBorder2, Orientation, ParaIndent, RightBorder2, RotateAngle, RotateReference, ShadowFormat, ShrinkToFit, TableBorder, TableBorder2, TopBorder2, VertJustify */ trait Cell
  extends CellProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCell
     with XText {
  /**
    * selects Asian character orientation in vertical orientation.
    *
    * If the {@link CellProperties.Orientation} property is CellOrientation::STACKED, in Asian mode only Asian characters are printed in horizontal
    * orientation instead of all characters. For other values of {@link CellProperties.Orientation} , this value is not used.
    */
  var AsianVerticalMode: scala.Boolean
  /**
    * contains a description of the bottom border line of each cell. Preferred over {@link BorderLine}{@link BottomBorder} .
    * @since LibreOffice 3.6
    */
  var BottomBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
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
  var DiagonalBLTR: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /**
    * contains a description of the bottom left to top right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalBLTR} .
    * @since LibreOffice 3.6
    */
  var DiagonalBLTR2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /** contains a description of the top left to bottom right diagonal line of each cell. */
  var DiagonalTLBR: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /**
    * contains a description of the top left to bottom right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalTLBR} .
    * @since LibreOffice 3.6
    */
  var DiagonalTLBR2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /** contains the horizontal alignment of the cell contents. */
  var HoriJustify: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify
  /**
    * is `TRUE` , if the cell background is transparent.
    *
    * In this case the {@link CellProperties.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: scala.Boolean
  /** is `TRUE` , if text in the cells will be wrapped automatically at the right border. */
  var IsTextWrapped: scala.Boolean
  /**
    * contains a description of the left border line of each cell. Preferred over {@link BorderLine}{@link LeftBorder} .
    * @since LibreOffice 3.6
    */
  var LeftBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /**
    * contains the orientation of the cell contents.
    *
    * If the {@link CellProperties.RotateAngle} property is non-zero, this value is not used.
    */
  var Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation
  /** defines the indentation of the cell contents (in 1/100 mm). */
  var ParaIndent: scala.Double
  /**
    * contains a description of the right border line of each cell. Preferred over {@link BorderLine}{@link RightBorder} .
    * @since LibreOffice 3.6
    */
  var RightBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
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
  var ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** is `TRUE` , if the cell content will be shrunk to fit in the cell. */
  var ShrinkToFit: scala.Boolean
  /**
    * contains a description of the cell or cell range border.
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    */
  var TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder
  /**
    * contains a description of the cell or cell range border. Preferred over {@link TableBorder}{@link TableBorder} .
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    * @since LibreOffice 3.6
    */
  var TableBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder2
  /**
    * contains a description of the top border line of each cell. Preferred over {@link BorderLine}{@link TopBorder} .
    * @since LibreOffice 3.6
    */
  var TopBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2
  /**
    * contains the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: scala.Double
}

