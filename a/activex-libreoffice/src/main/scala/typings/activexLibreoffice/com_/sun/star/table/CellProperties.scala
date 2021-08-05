package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.util.CellProtection
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the properties of a table cell.
  * @see com.sun.star.table.Cell
  * @see com.sun.star.table.CellRange
  */
trait CellProperties
  extends StObject
     with XPropertySet {
  
  /**
    * selects Asian character orientation in vertical orientation.
    *
    * If the {@link CellProperties.Orientation} property is CellOrientation::STACKED, in Asian mode only Asian characters are printed in horizontal
    * orientation instead of all characters. For other values of {@link CellProperties.Orientation} , this value is not used.
    */
  var AsianVerticalMode: Boolean
  
  /** contains a description of the bottom border line of each cell. */
  var BottomBorder: BorderLine
  
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
  var CellProtection: typings.activexLibreoffice.com_.sun.star.util.CellProtection
  
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
  var NumberFormat: Double
  
  /**
    * contains the orientation of the cell contents.
    *
    * If the {@link CellProperties.RotateAngle} property is non-zero, this value is not used.
    */
  var Orientation: CellOrientation
  
  /** defines the indentation of the cell contents (in 1/100 mm). */
  var ParaIndent: Double
  
  /** contains a description of the right border line of each cell. */
  var RightBorder: BorderLine
  
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
  var ShadowFormat: typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
  
  /** is `TRUE` , if the cell content will be shrunk to fit in the cell. */
  var ShrinkToFit: Boolean
  
  /**
    * contains a description of the cell or cell range border.
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    */
  var TableBorder: typings.activexLibreoffice.com_.sun.star.table.TableBorder
  
  /**
    * contains a description of the cell or cell range border. Preferred over {@link TableBorder}{@link TableBorder} .
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    * @since LibreOffice 3.6
    */
  var TableBorder2: typings.activexLibreoffice.com_.sun.star.table.TableBorder2
  
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
  var UserDefinedAttributes: XNameContainer
  
  /**
    * contains the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: Double
}
object CellProperties {
  
  inline def apply(
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
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    UserDefinedAttributes: XNameContainer,
    VertJustify: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): CellProperties = {
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorder2 = BottomBorder2.asInstanceOf[js.Any], CellBackColor = CellBackColor.asInstanceOf[js.Any], CellInteropGrabBag = CellInteropGrabBag.asInstanceOf[js.Any], CellProtection = CellProtection.asInstanceOf[js.Any], CellStyle = CellStyle.asInstanceOf[js.Any], DiagonalBLTR = DiagonalBLTR.asInstanceOf[js.Any], DiagonalBLTR2 = DiagonalBLTR2.asInstanceOf[js.Any], DiagonalTLBR = DiagonalTLBR.asInstanceOf[js.Any], DiagonalTLBR2 = DiagonalTLBR2.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorder2 = LeftBorder2.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ParaIndent = ParaIndent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorder2 = RightBorder2.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShrinkToFit = ShrinkToFit.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorder2 = TopBorder2.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[CellProperties]
  }
  
  extension [Self <: CellProperties](x: Self) {
    
    inline def setAsianVerticalMode(value: Boolean): Self = StObject.set(x, "AsianVerticalMode", value.asInstanceOf[js.Any])
    
    inline def setBottomBorder(value: BorderLine): Self = StObject.set(x, "BottomBorder", value.asInstanceOf[js.Any])
    
    inline def setBottomBorder2(value: BorderLine2): Self = StObject.set(x, "BottomBorder2", value.asInstanceOf[js.Any])
    
    inline def setCellBackColor(value: Color): Self = StObject.set(x, "CellBackColor", value.asInstanceOf[js.Any])
    
    inline def setCellInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "CellInteropGrabBag", value.asInstanceOf[js.Any])
    
    inline def setCellProtection(value: CellProtection): Self = StObject.set(x, "CellProtection", value.asInstanceOf[js.Any])
    
    inline def setCellStyle(value: String): Self = StObject.set(x, "CellStyle", value.asInstanceOf[js.Any])
    
    inline def setDiagonalBLTR(value: BorderLine): Self = StObject.set(x, "DiagonalBLTR", value.asInstanceOf[js.Any])
    
    inline def setDiagonalBLTR2(value: BorderLine2): Self = StObject.set(x, "DiagonalBLTR2", value.asInstanceOf[js.Any])
    
    inline def setDiagonalTLBR(value: BorderLine): Self = StObject.set(x, "DiagonalTLBR", value.asInstanceOf[js.Any])
    
    inline def setDiagonalTLBR2(value: BorderLine2): Self = StObject.set(x, "DiagonalTLBR2", value.asInstanceOf[js.Any])
    
    inline def setHoriJustify(value: CellHoriJustify): Self = StObject.set(x, "HoriJustify", value.asInstanceOf[js.Any])
    
    inline def setIsCellBackgroundTransparent(value: Boolean): Self = StObject.set(x, "IsCellBackgroundTransparent", value.asInstanceOf[js.Any])
    
    inline def setIsTextWrapped(value: Boolean): Self = StObject.set(x, "IsTextWrapped", value.asInstanceOf[js.Any])
    
    inline def setLeftBorder(value: BorderLine): Self = StObject.set(x, "LeftBorder", value.asInstanceOf[js.Any])
    
    inline def setLeftBorder2(value: BorderLine2): Self = StObject.set(x, "LeftBorder2", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: Double): Self = StObject.set(x, "NumberFormat", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: CellOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParaIndent(value: Double): Self = StObject.set(x, "ParaIndent", value.asInstanceOf[js.Any])
    
    inline def setRightBorder(value: BorderLine): Self = StObject.set(x, "RightBorder", value.asInstanceOf[js.Any])
    
    inline def setRightBorder2(value: BorderLine2): Self = StObject.set(x, "RightBorder2", value.asInstanceOf[js.Any])
    
    inline def setRotateAngle(value: Double): Self = StObject.set(x, "RotateAngle", value.asInstanceOf[js.Any])
    
    inline def setRotateReference(value: Double): Self = StObject.set(x, "RotateReference", value.asInstanceOf[js.Any])
    
    inline def setShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ShadowFormat", value.asInstanceOf[js.Any])
    
    inline def setShrinkToFit(value: Boolean): Self = StObject.set(x, "ShrinkToFit", value.asInstanceOf[js.Any])
    
    inline def setTableBorder(value: TableBorder): Self = StObject.set(x, "TableBorder", value.asInstanceOf[js.Any])
    
    inline def setTableBorder2(value: TableBorder2): Self = StObject.set(x, "TableBorder2", value.asInstanceOf[js.Any])
    
    inline def setTopBorder(value: BorderLine): Self = StObject.set(x, "TopBorder", value.asInstanceOf[js.Any])
    
    inline def setTopBorder2(value: BorderLine2): Self = StObject.set(x, "TopBorder2", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "UserDefinedAttributes", value.asInstanceOf[js.Any])
    
    inline def setVertJustify(value: Double): Self = StObject.set(x, "VertJustify", value.asInstanceOf[js.Any])
  }
}
