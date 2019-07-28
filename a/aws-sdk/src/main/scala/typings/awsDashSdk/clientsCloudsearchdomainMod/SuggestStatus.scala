package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestStatus extends js.Object {
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.undefined
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.undefined
}

object SuggestStatus {
  @scala.inline
  def apply(rid: String = null, timems: js.UndefOr[Long] = js.undefined): SuggestStatus = {
    val __obj = js.Dynamic.literal()
    if (rid != null) __obj.updateDynamic("rid")(rid)
    if (!js.isUndefined(timems)) __obj.updateDynamic("timems")(timems)
    __obj.asInstanceOf[SuggestStatus]
  }
}

