package typings.awsSdk.anon

import typings.awsSdk.sagemakerMod.EndpointName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/sagemaker.DescribeEndpointInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeEndpointInputwait extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the endpoint.
    */
  var EndpointName: typings.awsSdk.sagemakerMod.EndpointName = js.native
}

object DescribeEndpointInputwait {
  @scala.inline
  def apply(EndpointName: EndpointName, $waiter: WaiterConfiguration = null): DescribeEndpointInputwait = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointInputwait]
  }
}

