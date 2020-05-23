package typings.awsSdk.anon

import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudfront.GetInvalidationRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetInvalidationRequestwai extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The distribution's ID.
    */
  var DistributionId: String = js.native
  /**
    * The identifier for the invalidation request, for example, IDFDVBD632BHDS5.
    */
  var Id: String = js.native
}

object GetInvalidationRequestwai {
  @scala.inline
  def apply(DistributionId: String, Id: String, $waiter: WaiterConfiguration = null): GetInvalidationRequestwai = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInvalidationRequestwai]
  }
}

