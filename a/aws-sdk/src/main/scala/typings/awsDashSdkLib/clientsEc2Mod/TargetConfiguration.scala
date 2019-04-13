package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetConfiguration extends js.Object {
  /**
    * The number of instances the Convertible Reserved Instance offering can be applied to. This parameter is reserved and cannot be specified in a request
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  /**
    * The ID of the Convertible Reserved Instance offering.
    */
  var OfferingId: js.UndefOr[String] = js.undefined
}

object TargetConfiguration {
  @scala.inline
  def apply(InstanceCount: js.UndefOr[Integer] = js.undefined, OfferingId: String = null): TargetConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InstanceCount)) __obj.updateDynamic("InstanceCount")(InstanceCount)
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId)
    __obj.asInstanceOf[TargetConfiguration]
  }
}

