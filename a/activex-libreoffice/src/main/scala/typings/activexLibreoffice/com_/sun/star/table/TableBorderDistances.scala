package typings.activexLibreoffice.com_.sun.star.table

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the distance settings of the border lines of all cells in a cell range.
  *
  * In a queried structure, the flags in TableBorderDistances::Is...DistanceValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding distance should be set or if the old value should be kept.
  */
@js.native
trait TableBorderDistances extends js.Object {
  
  /** contains the distance between the bottom lines and other contents. */
  var BottomDistance: Double = js.native
  
  /** specifies whether the value of TableBorder::BottomDistance is used. */
  var IsBottomDistanceValid: Boolean = js.native
  
  /** specifies whether the value of TableBorder::LeftDistance is used. */
  var IsLeftDistanceValid: Boolean = js.native
  
  /** specifies whether the value of TableBorder::RightDistance is used. */
  var IsRightDistanceValid: Boolean = js.native
  
  /** specifies whether the value of TableBorder::TopDistance is used. */
  var IsTopDistanceValid: Boolean = js.native
  
  /** contains the distance between the left lines and other contents. */
  var LeftDistance: Double = js.native
  
  /** contains the distance between the right lines and other contents. */
  var RightDistance: Double = js.native
  
  /** contains the distance between the top lines and other contents. */
  var TopDistance: Double = js.native
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
  implicit class TableBorderDistancesOps[Self <: TableBorderDistances] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBottomDistance(value: Double): Self = this.set("BottomDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBottomDistanceValid(value: Boolean): Self = this.set("IsBottomDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeftDistanceValid(value: Boolean): Self = this.set("IsLeftDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRightDistanceValid(value: Boolean): Self = this.set("IsRightDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTopDistanceValid(value: Boolean): Self = this.set("IsTopDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftDistance(value: Double): Self = this.set("LeftDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightDistance(value: Double): Self = this.set("RightDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopDistance(value: Double): Self = this.set("TopDistance", value.asInstanceOf[js.Any])
  }
}
