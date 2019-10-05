package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchStatus extends js.Object {
  /**
    * The encrypted resource ID for the request.
    */
  var rid: js.UndefOr[String] = js.undefined
  /**
    * How long it took to process the request, in milliseconds.
    */
  var timems: js.UndefOr[Long] = js.undefined
}

object SearchStatus {
  @scala.inline
  def apply(rid: String = null, timems: Int | scala.Double = null): SearchStatus = {
    val __obj = js.Dynamic.literal()
    if (rid != null) __obj.updateDynamic("rid")(rid)
    if (timems != null) __obj.updateDynamic("timems")(timems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchStatus]
  }
}

