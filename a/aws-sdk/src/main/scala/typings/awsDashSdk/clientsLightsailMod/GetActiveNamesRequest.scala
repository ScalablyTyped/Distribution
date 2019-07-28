package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetActiveNamesRequest extends js.Object {
  /**
    * A token used for paginating results from your get active names request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object GetActiveNamesRequest {
  @scala.inline
  def apply(pageToken: String = null): GetActiveNamesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetActiveNamesRequest]
  }
}

