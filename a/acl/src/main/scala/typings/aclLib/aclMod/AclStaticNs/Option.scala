package typings
package aclLib.aclMod.AclStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var buckets: js.UndefOr[BucketsOption] = js.undefined
}

object Option {
  @scala.inline
  def apply(buckets: BucketsOption = null): Option = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    __obj.asInstanceOf[Option]
  }
}

