package typings
package awsDashSdkLib.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketInfo extends js.Object {
  /**
    * A list of the calculated facet values and counts.
    */
  var buckets: js.UndefOr[BucketList] = js.undefined
}

object BucketInfo {
  @scala.inline
  def apply(buckets: BucketList = null): BucketInfo = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    __obj.asInstanceOf[BucketInfo]
  }
}

