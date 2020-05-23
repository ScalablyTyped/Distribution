package typings.awsSdk.anon

import typings.awsSdk.eksMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/eks.DescribeNodegroupRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeNodegroupRequestw extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the Amazon EKS cluster associated with the node group.
    */
  var clusterName: String = js.native
  /**
    * The name of the node group to describe.
    */
  var nodegroupName: String = js.native
}

object DescribeNodegroupRequestw {
  @scala.inline
  def apply(clusterName: String, nodegroupName: String, $waiter: WaiterConfiguration = null): DescribeNodegroupRequestw = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodegroupRequestw]
  }
}

