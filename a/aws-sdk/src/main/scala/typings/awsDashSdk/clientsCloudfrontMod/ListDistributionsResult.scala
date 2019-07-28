package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDistributionsResult extends js.Object {
  /**
    * The DistributionList type. 
    */
  var DistributionList: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.DistributionList] = js.undefined
}

object ListDistributionsResult {
  @scala.inline
  def apply(DistributionList: DistributionList = null): ListDistributionsResult = {
    val __obj = js.Dynamic.literal()
    if (DistributionList != null) __obj.updateDynamic("DistributionList")(DistributionList)
    __obj.asInstanceOf[ListDistributionsResult]
  }
}

