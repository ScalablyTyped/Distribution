package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketInfo extends js.Object {
  /**
    * A list of the calculated facet values and counts.
    */
  var buckets: js.UndefOr[BucketList] = js.native
}

object BucketInfo {
  @scala.inline
  def apply(buckets: BucketList = null): BucketInfo = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketInfo]
  }
}

