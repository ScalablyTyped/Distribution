package typings.awsSdk.anon

import typings.awsSdk.medialiveMod.string
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/medialive.DescribeInputRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeInputRequestwaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Unique ID of the input
    */
  var InputId: string = js.native
}

object DescribeInputRequestwaite {
  @scala.inline
  def apply(InputId: string, $waiter: WaiterConfiguration = null): DescribeInputRequestwaite = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInputRequestwaite]
  }
}

