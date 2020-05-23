package typings.awsSdk.anon

import typings.awsSdk.iotsitewiseMod.ID
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/iotsitewise.DescribeAssetRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeAssetRequestwaite extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The ID of the asset.
    */
  var assetId: ID = js.native
}

object DescribeAssetRequestwaite {
  @scala.inline
  def apply(assetId: ID, $waiter: WaiterConfiguration = null): DescribeAssetRequestwaite = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssetRequestwaite]
  }
}

