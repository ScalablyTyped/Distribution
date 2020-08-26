package typings.awsSdk.anon

import typings.awsSdk.eksMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/eks.DescribeNodegroupRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
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
  def apply(clusterName: String, nodegroupName: String): DescribeNodegroupRequestw = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], nodegroupName = nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodegroupRequestw]
  }
  @scala.inline
  implicit class DescribeNodegroupRequestwOps[Self <: DescribeNodegroupRequestw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodegroupName(value: String): Self = this.set("nodegroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

