package typings.awsSdk

import typings.awsSdk.medialiveMod.string
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/medialive.DescribeMultiplexRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeMultiplexRequestw extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The ID of the multiplex.
    */
  var MultiplexId: string = js.native
}

object DescribeMultiplexRequestw {
  @scala.inline
  def apply(MultiplexId: string, $waiter: WaiterConfiguration = null): DescribeMultiplexRequestw = {
    val __obj = js.Dynamic.literal(MultiplexId = MultiplexId.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMultiplexRequestw]
  }
}

