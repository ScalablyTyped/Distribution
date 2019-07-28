package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetConfigurationRequest extends js.Object {
  /**
    * The number of instances the Covertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The Convertible Reserved Instance offering ID.
    */
  var OfferingId: String
}

object TargetConfigurationRequest {
  @scala.inline
  def apply(OfferingId: String, InstanceCount: js.UndefOr[Integer] = js.undefined): TargetConfigurationRequest = {
    val __obj = js.Dynamic.literal(OfferingId = OfferingId)
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    __obj.asInstanceOf[TargetConfigurationRequest]
  }
}

