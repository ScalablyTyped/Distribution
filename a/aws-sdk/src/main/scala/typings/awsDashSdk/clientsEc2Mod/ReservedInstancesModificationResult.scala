package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservedInstancesModificationResult extends js.Object {
  /**
    * The ID for the Reserved Instances that were created as part of the modification request. This field is only available when the modification is fulfilled.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
  /**
    * The target Reserved Instances configurations supplied as part of the modification request.
    */
  var TargetConfiguration: js.UndefOr[ReservedInstancesConfiguration] = js.native
}

object ReservedInstancesModificationResult {
  @scala.inline
  def apply(ReservedInstancesId: String = null, TargetConfiguration: ReservedInstancesConfiguration = null): ReservedInstancesModificationResult = {
    val __obj = js.Dynamic.literal()
    if (ReservedInstancesId != null) __obj.updateDynamic("ReservedInstancesId")(ReservedInstancesId.asInstanceOf[js.Any])
    if (TargetConfiguration != null) __obj.updateDynamic("TargetConfiguration")(TargetConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReservedInstancesModificationResult]
  }
}

