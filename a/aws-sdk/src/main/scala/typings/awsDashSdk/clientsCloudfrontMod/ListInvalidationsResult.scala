package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvalidationsResult extends js.Object {
  /**
    * Information about invalidation batches. 
    */
  var InvalidationList: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.InvalidationList] = js.undefined
}

object ListInvalidationsResult {
  @scala.inline
  def apply(InvalidationList: InvalidationList = null): ListInvalidationsResult = {
    val __obj = js.Dynamic.literal()
    if (InvalidationList != null) __obj.updateDynamic("InvalidationList")(InvalidationList)
    __obj.asInstanceOf[ListInvalidationsResult]
  }
}

