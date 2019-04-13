package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetCapacitySpecification extends js.Object {
  /**
    * The default TotalTargetCapacity, which is either Spot or On-Demand.
    */
  var DefaultTargetCapacityType: js.UndefOr[DefaultTargetCapacityType] = js.undefined
  /**
    * The number of On-Demand units to request.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  /**
    * The maximum number of Spot units to launch.
    */
  var SpotTargetCapacity: js.UndefOr[Integer] = js.undefined
  /**
    * The number of units to request, filled using DefaultTargetCapacityType.
    */
  var TotalTargetCapacity: js.UndefOr[Integer] = js.undefined
}

object TargetCapacitySpecification {
  @scala.inline
  def apply(
    DefaultTargetCapacityType: DefaultTargetCapacityType = null,
    OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined,
    SpotTargetCapacity: js.UndefOr[Integer] = js.undefined,
    TotalTargetCapacity: js.UndefOr[Integer] = js.undefined
  ): TargetCapacitySpecification = {
    val __obj = js.Dynamic.literal()
    if (DefaultTargetCapacityType != null) __obj.updateDynamic("DefaultTargetCapacityType")(DefaultTargetCapacityType.asInstanceOf[js.Any])
    if (!js.isUndefined(OnDemandTargetCapacity)) __obj.updateDynamic("OnDemandTargetCapacity")(OnDemandTargetCapacity)
    if (!js.isUndefined(SpotTargetCapacity)) __obj.updateDynamic("SpotTargetCapacity")(SpotTargetCapacity)
    if (!js.isUndefined(TotalTargetCapacity)) __obj.updateDynamic("TotalTargetCapacity")(TotalTargetCapacity)
    __obj.asInstanceOf[TargetCapacitySpecification]
  }
}

