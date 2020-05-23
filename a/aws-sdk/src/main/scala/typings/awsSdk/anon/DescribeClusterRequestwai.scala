package typings.awsSdk.anon

import typings.awsSdk.eksMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/eks.DescribeClusterRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeClusterRequestwai extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the cluster to describe.
    */
  var name: String = js.native
}

object DescribeClusterRequestwai {
  @scala.inline
  def apply(name: String, $waiter: WaiterConfiguration = null): DescribeClusterRequestwai = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterRequestwai]
  }
}

