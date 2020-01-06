package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansDetails extends js.Object {
  /**
    * A group of instance types that Savings Plans applies to.
    */
  var InstanceFamily: js.UndefOr[GenericString] = js.native
  /**
    * The unique ID used to distinguish Savings Plans from one another.
    */
  var OfferingId: js.UndefOr[GenericString] = js.native
  /**
    * A collection of AWS resources in a geographic area. Each AWS Region is isolated and independent of the other Regions.
    */
  var Region: js.UndefOr[GenericString] = js.native
}

object SavingsPlansDetails {
  @scala.inline
  def apply(
    InstanceFamily: GenericString = null,
    OfferingId: GenericString = null,
    Region: GenericString = null
  ): SavingsPlansDetails = {
    val __obj = js.Dynamic.literal()
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    if (OfferingId != null) __obj.updateDynamic("OfferingId")(OfferingId.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansDetails]
  }
}

