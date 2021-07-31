package typings.activexLibreoffice.com_.sun.star.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the distance settings of the border lines of all cells in a cell range.
  *
  * In a queried structure, the flags in TableBorderDistances::Is...DistanceValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding distance should be set or if the old value should be kept.
  */
trait TableBorderDistances extends StObject {
  
  /** contains the distance between the bottom lines and other contents. */
  var BottomDistance: Double
  
  /** specifies whether the value of TableBorder::BottomDistance is used. */
  var IsBottomDistanceValid: Boolean
  
  /** specifies whether the value of TableBorder::LeftDistance is used. */
  var IsLeftDistanceValid: Boolean
  
  /** specifies whether the value of TableBorder::RightDistance is used. */
  var IsRightDistanceValid: Boolean
  
  /** specifies whether the value of TableBorder::TopDistance is used. */
  var IsTopDistanceValid: Boolean
  
  /** contains the distance between the left lines and other contents. */
  var LeftDistance: Double
  
  /** contains the distance between the right lines and other contents. */
  var RightDistance: Double
  
  /** contains the distance between the top lines and other contents. */
  var TopDistance: Double
}
object TableBorderDistances {
  
  @scala.inline
  def apply(
    BottomDistance: Double,
    IsBottomDistanceValid: Boolean,
    IsLeftDistanceValid: Boolean,
    IsRightDistanceValid: Boolean,
    IsTopDistanceValid: Boolean,
    LeftDistance: Double,
    RightDistance: Double,
    TopDistance: Double
  ): TableBorderDistances = {
    val __obj = js.Dynamic.literal(BottomDistance = BottomDistance.asInstanceOf[js.Any], IsBottomDistanceValid = IsBottomDistanceValid.asInstanceOf[js.Any], IsLeftDistanceValid = IsLeftDistanceValid.asInstanceOf[js.Any], IsRightDistanceValid = IsRightDistanceValid.asInstanceOf[js.Any], IsTopDistanceValid = IsTopDistanceValid.asInstanceOf[js.Any], LeftDistance = LeftDistance.asInstanceOf[js.Any], RightDistance = RightDistance.asInstanceOf[js.Any], TopDistance = TopDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorderDistances]
  }
  
  @scala.inline
  implicit class TableBorderDistancesMutableBuilder[Self <: TableBorderDistances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomDistance(value: Double): Self = StObject.set(x, "BottomDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBottomDistanceValid(value: Boolean): Self = StObject.set(x, "IsBottomDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeftDistanceValid(value: Boolean): Self = StObject.set(x, "IsLeftDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRightDistanceValid(value: Boolean): Self = StObject.set(x, "IsRightDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTopDistanceValid(value: Boolean): Self = StObject.set(x, "IsTopDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftDistance(value: Double): Self = StObject.set(x, "LeftDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDistance(value: Double): Self = StObject.set(x, "RightDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopDistance(value: Double): Self = StObject.set(x, "TopDistance", value.asInstanceOf[js.Any])
  }
}
