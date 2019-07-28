package typings.awsDashSdk.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestResponse extends js.Object {
  /**
    * The status of a SuggestRequest. Contains the resource ID (rid) and how long it took to process the request (timems).
    */
  var status: js.UndefOr[SuggestStatus] = js.undefined
  /**
    * Container for the matching search suggestion information.
    */
  var suggest: js.UndefOr[SuggestModel] = js.undefined
}

object SuggestResponse {
  @scala.inline
  def apply(status: SuggestStatus = null, suggest: SuggestModel = null): SuggestResponse = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status)
    if (suggest != null) __obj.updateDynamic("suggest")(suggest)
    __obj.asInstanceOf[SuggestResponse]
  }
}

