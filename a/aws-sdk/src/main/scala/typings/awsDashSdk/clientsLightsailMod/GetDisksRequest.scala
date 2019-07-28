package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDisksRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your GetDisks request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object GetDisksRequest {
  @scala.inline
  def apply(pageToken: String = null): GetDisksRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetDisksRequest]
  }
}

