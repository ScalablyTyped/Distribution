package typings.awsSdk.anon

import typings.awsSdk.emrMod.ClusterId
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/emr.DescribeClusterInput & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeClusterInputwaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The identifier of the cluster to describe.
    */
  var ClusterId: typings.awsSdk.emrMod.ClusterId = js.native
}

object DescribeClusterInputwaite {
  @scala.inline
  def apply(ClusterId: ClusterId, $waiter: WaiterConfiguration = null): DescribeClusterInputwaite = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterInputwaite]
  }
}

