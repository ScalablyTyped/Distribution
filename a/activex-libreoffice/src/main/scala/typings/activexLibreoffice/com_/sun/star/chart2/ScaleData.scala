package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.com_.sun.star.chart.TimeIncrement
import typings.activexLibreoffice.com_.sun.star.chart2.data.XLabeledDataSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleData extends js.Object {
  
  /** if true an {@link AxisType} CATEGORY is interpreted as DATE if the underlying data given in Categories are dates */
  var AutoDateAxis: Boolean = js.native
  
  /**
    * describes the type of the axis.
    *
    * It can be a real number axis or a category axis or something else. {@link AxisType} is one value out of the constant group {@link AxisType} .
    */
  var AxisType: Double = js.native
  
  var Categories: XLabeledDataSequence = js.native
  
  /** increment data to be used for not date-time axis */
  var IncrementData: typings.activexLibreoffice.com_.sun.star.chart2.IncrementData = js.native
  
  /**
    * if the any contains a double value this is used as a fixed minimum. Otherwise, if the any is empty or contains an incompatible type, the minimum is
    * automatic.
    *
    * If the minimum is automatic, this means, each view that represents the model containing this scale, has to calculate a minimum by its own means.
    */
  var Maximum: js.Any = js.native
  
  /**
    * if the any contains a double value this is used as a fixed maximum. Otherwise, if the any is empty or contains an incompatible type, the maximum is
    * automatic.
    *
    * If the maximum is automatic, this means, each view that represents the model containing this scale, has to calculate a maximum by its own means.
    */
  var Minimum: js.Any = js.native
  
  /**
    * {@link Axis} orientation (standard or reversed).
    *
    * If used at the Y axis in pie charts or doughnut charts, specifies the rotation direction of the pie. The value AxisOrientation::MATHEMATICAL rotates
    * the pie counterclockwise, the value AxisOrientation::REVERSE rotates the pie clockwise.
    *
    * Note: Is this a good place for the axis orientation? Two axes may use the same scale, but point into two different directions.
    */
  var Orientation: AxisOrientation = js.native
  
  /**
    * The Origin indicates where other axes cross this axis. If the any contains a double value that value is used. Otherwise an appropriate value has to be
    * calculated by that instances using Origin.
    */
  var Origin: js.Any = js.native
  
  var Scaling: XScaling = js.native
  
  /**
    * describes whether data points on category or date axis are placed between tickmarks or not if true the maximum on the scale will be expanded for one
    * interval
    */
  var ShiftedCategoryPosition: Boolean = js.native
  
  /** increment data to be used in case of date-time axis */
  var TimeIncrement: typings.activexLibreoffice.com_.sun.star.chart.TimeIncrement = js.native
}
object ScaleData {
  
  @scala.inline
  def apply(
    AutoDateAxis: Boolean,
    AxisType: Double,
    Categories: XLabeledDataSequence,
    IncrementData: IncrementData,
    Maximum: js.Any,
    Minimum: js.Any,
    Orientation: AxisOrientation,
    Origin: js.Any,
    Scaling: XScaling,
    ShiftedCategoryPosition: Boolean,
    TimeIncrement: TimeIncrement
  ): ScaleData = {
    val __obj = js.Dynamic.literal(AutoDateAxis = AutoDateAxis.asInstanceOf[js.Any], AxisType = AxisType.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], IncrementData = IncrementData.asInstanceOf[js.Any], Maximum = Maximum.asInstanceOf[js.Any], Minimum = Minimum.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], Scaling = Scaling.asInstanceOf[js.Any], ShiftedCategoryPosition = ShiftedCategoryPosition.asInstanceOf[js.Any], TimeIncrement = TimeIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleData]
  }
  
  @scala.inline
  implicit class ScaleDataOps[Self <: ScaleData] (val x: Self) extends AnyVal {
    
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
    def setAutoDateAxis(value: Boolean): Self = this.set("AutoDateAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisType(value: Double): Self = this.set("AxisType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategories(value: XLabeledDataSequence): Self = this.set("Categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementData(value: IncrementData): Self = this.set("IncrementData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum(value: js.Any): Self = this.set("Maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: js.Any): Self = this.set("Minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: AxisOrientation): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: js.Any): Self = this.set("Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaling(value: XScaling): Self = this.set("Scaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftedCategoryPosition(value: Boolean): Self = this.set("ShiftedCategoryPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeIncrement(value: TimeIncrement): Self = this.set("TimeIncrement", value.asInstanceOf[js.Any])
  }
}
