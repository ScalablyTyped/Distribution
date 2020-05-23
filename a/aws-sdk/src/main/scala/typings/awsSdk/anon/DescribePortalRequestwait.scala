package typings.awsSdk.anon

import typings.awsSdk.iotsitewiseMod.ID
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/iotsitewise.DescribePortalRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
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
  def apply(portalId: ID, $waiter: WaiterConfiguration = null): DescribePortalRequestwait = {
    val __obj = js.Dynamic.literal(portalId = portalId.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePortalRequestwait]
  }
}

