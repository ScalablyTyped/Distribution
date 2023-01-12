package typings.activexLibreoffice.com_.sun.star.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the style settings of the border lines of all cells in a cell range.
  *
  * In a queried structure, the flags in TableBorder::Is...LineValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding line should be set or if the old value should be kept.
  */
trait TableBorder extends StObject {
  
  /** determines the line style at the bottom edge. */
  var BottomLine: BorderLine
  
  /** contains the distance between the lines and other contents. */
  var Distance: Double
  
  /** determines the line style of horizontal lines for the inner part of a cell range. */
  var HorizontalLine: BorderLine
  
  /** specifies whether the value of {@link TableBorder.BottomLine} is used. */
  var IsBottomLineValid: Boolean
  
  /** specifies whether the value of {@link TableBorder.Distance} is used. */
  var IsDistanceValid: Boolean
  
  /** specifies whether the value of {@link TableBorder.HorizontalLine} is used. */
  var IsHorizontalLineValid: Boolean
  
  /** specifies whether the value of {@link TableBorder.LeftLine} is used. */
  var IsLeftLineValid: Boolean
  
  /** specifies whether the value of {@link TableBorder.RightLine} is used. */
  var IsRightLineValid: Boolean
  
  /** specifies whether the value of {@link TableBorder.TopLine} is used. */
  var IsTopLineValid: Boolean
  
  /** specifies whether the value of {@link TableBorder.VerticalLine} is used. */
  var IsVerticalLineValid: Boolean
  
  /** determines the line style at the left edge. */
  var LeftLine: BorderLine
  
  /** determines the line style at the right edge. */
  var RightLine: BorderLine
  
  /** determines the line style at the top edge. */
  var TopLine: BorderLine
  
  /** determines the line style of vertical lines for the inner part of a cell range. */
  var VerticalLine: BorderLine
}
object TableBorder {
  
  inline def apply(
    BottomLine: BorderLine,
    Distance: Double,
    HorizontalLine: BorderLine,
    IsBottomLineValid: Boolean,
    IsDistanceValid: Boolean,
    IsHorizontalLineValid: Boolean,
    IsLeftLineValid: Boolean,
    IsRightLineValid: Boolean,
    IsTopLineValid: Boolean,
    IsVerticalLineValid: Boolean,
    LeftLine: BorderLine,
    RightLine: BorderLine,
    TopLine: BorderLine,
    VerticalLine: BorderLine
  ): TableBorder = {
    val __obj = js.Dynamic.literal(BottomLine = BottomLine.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], HorizontalLine = HorizontalLine.asInstanceOf[js.Any], IsBottomLineValid = IsBottomLineValid.asInstanceOf[js.Any], IsDistanceValid = IsDistanceValid.asInstanceOf[js.Any], IsHorizontalLineValid = IsHorizontalLineValid.asInstanceOf[js.Any], IsLeftLineValid = IsLeftLineValid.asInstanceOf[js.Any], IsRightLineValid = IsRightLineValid.asInstanceOf[js.Any], IsTopLineValid = IsTopLineValid.asInstanceOf[js.Any], IsVerticalLineValid = IsVerticalLineValid.asInstanceOf[js.Any], LeftLine = LeftLine.asInstanceOf[js.Any], RightLine = RightLine.asInstanceOf[js.Any], TopLine = TopLine.asInstanceOf[js.Any], VerticalLine = VerticalLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableBorder] (val x: Self) extends AnyVal {
    
    inline def setBottomLine(value: BorderLine): Self = StObject.set(x, "BottomLine", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    inline def setHorizontalLine(value: BorderLine): Self = StObject.set(x, "HorizontalLine", value.asInstanceOf[js.Any])
    
    inline def setIsBottomLineValid(value: Boolean): Self = StObject.set(x, "IsBottomLineValid", value.asInstanceOf[js.Any])
    
    inline def setIsDistanceValid(value: Boolean): Self = StObject.set(x, "IsDistanceValid", value.asInstanceOf[js.Any])
    
    inline def setIsHorizontalLineValid(value: Boolean): Self = StObject.set(x, "IsHorizontalLineValid", value.asInstanceOf[js.Any])
    
    inline def setIsLeftLineValid(value: Boolean): Self = StObject.set(x, "IsLeftLineValid", value.asInstanceOf[js.Any])
    
    inline def setIsRightLineValid(value: Boolean): Self = StObject.set(x, "IsRightLineValid", value.asInstanceOf[js.Any])
    
    inline def setIsTopLineValid(value: Boolean): Self = StObject.set(x, "IsTopLineValid", value.asInstanceOf[js.Any])
    
    inline def setIsVerticalLineValid(value: Boolean): Self = StObject.set(x, "IsVerticalLineValid", value.asInstanceOf[js.Any])
    
    inline def setLeftLine(value: BorderLine): Self = StObject.set(x, "LeftLine", value.asInstanceOf[js.Any])
    
    inline def setRightLine(value: BorderLine): Self = StObject.set(x, "RightLine", value.asInstanceOf[js.Any])
    
    inline def setTopLine(value: BorderLine): Self = StObject.set(x, "TopLine", value.asInstanceOf[js.Any])
    
    inline def setVerticalLine(value: BorderLine): Self = StObject.set(x, "VerticalLine", value.asInstanceOf[js.Any])
  }
}
