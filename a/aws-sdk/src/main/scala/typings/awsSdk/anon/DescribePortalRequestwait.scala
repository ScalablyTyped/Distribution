package typings.awsSdk.anon

import typings.awsSdk.iotsitewiseMod.ID
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/iotsitewise.DescribePortalRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribePortalRequestwait extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The ID of the portal.
    */
  var portalId: ID = js.native
}

object DescribePortalRequestwait {
  @scala.inline
  def apply(portalId: ID): DescribePortalRequestwait = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalRequestwait]
  }
  @scala.inline
  implicit class DescribePortalRequestwaitOps[Self <: DescribePortalRequestwait] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPortalId(value: ID): Self = this.set("portalId", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

