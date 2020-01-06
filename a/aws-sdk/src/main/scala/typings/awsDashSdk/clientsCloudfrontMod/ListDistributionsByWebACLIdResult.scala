package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDistributionsByWebACLIdResult extends js.Object {
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.DistributionList] = js.native
}

object ListDistributionsByWebACLIdResult {
  @scala.inline
  def apply(DistributionList: DistributionList = null): ListDistributionsByWebACLIdResult = {
    val __obj = js.Dynamic.literal()
    if (DistributionList != null) __obj.updateDynamic("DistributionList")(DistributionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByWebACLIdResult]
  }
}

