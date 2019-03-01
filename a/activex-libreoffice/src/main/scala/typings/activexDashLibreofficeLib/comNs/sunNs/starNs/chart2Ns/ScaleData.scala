package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleData extends js.Object {
  /** if true an {@link AxisType} CATEGORY is interpreted as DATE if the underlying data given in Categories are dates */
  var AutoDateAxis: scala.Boolean
  /**
    * describes the type of the axis.
    *
    * It can be a real number axis or a category axis or something else. {@link AxisType} is one value out of the constant group {@link AxisType} .
    */
  var AxisType: scala.Double
  var Categories: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence
  /** increment data to be used for not date-time axis */
  var IncrementData: IncrementData
  /**
    * if the any contains a double value this is used as a fixed minimum. Otherwise, if the any is empty or contains an incompatible type, the minimum is
    * automatic.
    *
    * If the minimum is automatic, this means, each view that represents the model containing this scale, has to calculate a minimum by its own means.
    */
  var Maximum: js.Any
  /**
    * if the any contains a double value this is used as a fixed maximum. Otherwise, if the any is empty or contains an incompatible type, the maximum is
    * automatic.
    *
    * If the maximum is automatic, this means, each view that represents the model containing this scale, has to calculate a maximum by its own means.
    */
  var Minimum: js.Any
  /**
    * {@link Axis} orientation (standard or reversed).
    *
    * If used at the Y axis in pie charts or doughnut charts, specifies the rotation direction of the pie. The value AxisOrientation::MATHEMATICAL rotates
    * the pie counterclockwise, the value AxisOrientation::REVERSE rotates the pie clockwise.
    *
    * Note: Is this a good place for the axis orientation? Two axes may use the same scale, but point into two different directions.
    */
  var Orientation: AxisOrientation
  /**
    * The Origin indicates where other axes cross this axis. If the any contains a double value that value is used. Otherwise an appropriate value has to be
    * calculated by that instances using Origin.
    */
  var Origin: js.Any
  var Scaling: XScaling
  /**
    * describes whether data points on category or date axis are placed between tickmarks or not if true the maximum on the scale will be expanded for one
    * interval
    */
  var ShiftedCategoryPosition: scala.Boolean
  /** increment data to be used in case of date-time axis */
  var TimeIncrement: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.TimeIncrement
}

object ScaleData {
  @scala.inline
  def apply(
    AutoDateAxis: scala.Boolean,
    AxisType: scala.Double,
    Categories: activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.dataNs.XLabeledDataSequence,
    IncrementData: IncrementData,
    Maximum: js.Any,
    Minimum: js.Any,
    Orientation: AxisOrientation,
    Origin: js.Any,
    Scaling: XScaling,
    ShiftedCategoryPosition: scala.Boolean,
    TimeIncrement: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.TimeIncrement
  ): ScaleData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AutoDateAxis")(AutoDateAxis)
    __obj.updateDynamic("AxisType")(AxisType)
    __obj.updateDynamic("Categories")(Categories)
    __obj.updateDynamic("IncrementData")(IncrementData)
    __obj.updateDynamic("Maximum")(Maximum)
    __obj.updateDynamic("Minimum")(Minimum)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("Origin")(Origin)
    __obj.updateDynamic("Scaling")(Scaling)
    __obj.updateDynamic("ShiftedCategoryPosition")(ShiftedCategoryPosition)
    __obj.updateDynamic("TimeIncrement")(TimeIncrement)
    __obj.asInstanceOf[ScaleData]
  }
}

