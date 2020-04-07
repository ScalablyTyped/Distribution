package typings.awsSdk

import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/cloudfront.GetStreamingDistributionRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait GetStreamingDistributionR extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The streaming distribution's ID.
    */
  var Id: String = js.native
}

object GetStreamingDistributionR {
  @scala.inline
  def apply(Id: String, $waiter: WaiterConfiguration = null): GetStreamingDistributionR = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamingDistributionR]
  }
}

