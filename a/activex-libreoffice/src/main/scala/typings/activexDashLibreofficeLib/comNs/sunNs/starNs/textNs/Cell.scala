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

object Cell {
  @scala.inline
  def apply(
    AsianVerticalMode: scala.Boolean,
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    BottomBorderDistance: scala.Double,
    CellBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    CellInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    CellName: java.lang.String,
    CellProtection: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.CellProtection,
    CellStyle: java.lang.String,
    DiagonalBLTR: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    DiagonalBLTR2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    DiagonalTLBR: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    DiagonalTLBR2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    End: XTextRange,
    Error: scala.Double,
    Formula: java.lang.String,
    HoriJustify: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellHoriJustify,
    IsCellBackgroundTransparent: scala.Boolean,
    IsProtected: scala.Boolean,
    IsTextWrapped: scala.Boolean,
    LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    LeftBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    LeftBorderDistance: scala.Double,
    NumberFormat: scala.Double,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellOrientation,
    ParaIndent: scala.Double,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    RightBorderDistance: scala.Double,
    RotateAngle: scala.Double,
    RotateReference: scala.Double,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    ShrinkToFit: scala.Boolean,
    Start: XTextRange,
    String: java.lang.String,
    TableBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder,
    TableBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableBorder2,
    TextSection: XTextSection,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorder2: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine2,
    TopBorderDistance: scala.Double,
    Type: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Value: scala.Double,
    VertJustify: scala.Double,
    VertOrient: scala.Double,
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
    createTextCursor: js.Function0[XTextCursor],
    createTextCursorByRange: js.Function1[XTextRange, XTextCursor],
    getEnd: js.Function0[XTextRange],
    getError: js.Function0[scala.Double],
    getFormula: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    getType: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellContentType],
    getValue: js.Function0[scala.Double],
    insertControlCharacter: js.Function3[XTextRange, scala.Double, scala.Boolean, scala.Unit],
    insertString: js.Function3[XTextRange, java.lang.String, scala.Boolean, scala.Unit],
    insertTextContent: js.Function3[XTextRange, XTextContent, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeTextContent: js.Function1[XTextContent, scala.Unit],
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
    __obj.updateDynamic("BackColor")(BackColor)
    __obj.updateDynamic("BackGraphicFilter")(BackGraphicFilter)
    __obj.updateDynamic("BackGraphicLocation")(BackGraphicLocation)
    __obj.updateDynamic("BackGraphicURL")(BackGraphicURL)
    __obj.updateDynamic("BackTransparent")(BackTransparent)
    __obj.updateDynamic("BottomBorder")(BottomBorder)
    __obj.updateDynamic("BottomBorder2")(BottomBorder2)
    __obj.updateDynamic("BottomBorderDistance")(BottomBorderDistance)
    __obj.updateDynamic("CellBackColor")(CellBackColor)
    __obj.updateDynamic("CellInteropGrabBag")(CellInteropGrabBag)
    __obj.updateDynamic("CellName")(CellName)
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
    __obj.updateDynamic("IsProtected")(IsProtected)
    __obj.updateDynamic("IsTextWrapped")(IsTextWrapped)
    __obj.updateDynamic("LeftBorder")(LeftBorder)
    __obj.updateDynamic("LeftBorder2")(LeftBorder2)
    __obj.updateDynamic("LeftBorderDistance")(LeftBorderDistance)
    __obj.updateDynamic("NumberFormat")(NumberFormat)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("ParaIndent")(ParaIndent)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("RightBorder")(RightBorder)
    __obj.updateDynamic("RightBorder2")(RightBorder2)
    __obj.updateDynamic("RightBorderDistance")(RightBorderDistance)
    __obj.updateDynamic("RotateAngle")(RotateAngle)
    __obj.updateDynamic("RotateReference")(RotateReference)
    __obj.updateDynamic("ShadowFormat")(ShadowFormat)
    __obj.updateDynamic("ShrinkToFit")(ShrinkToFit)
    __obj.updateDynamic("Start")(Start)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("TableBorder")(TableBorder)
    __obj.updateDynamic("TableBorder2")(TableBorder2)
    __obj.updateDynamic("TextSection")(TextSection)
    __obj.updateDynamic("TopBorder")(TopBorder)
    __obj.updateDynamic("TopBorder2")(TopBorder2)
    __obj.updateDynamic("TopBorderDistance")(TopBorderDistance)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UserDefinedAttributes")(UserDefinedAttributes)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("VertJustify")(VertJustify)
    __obj.updateDynamic("VertOrient")(VertOrient)
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

