package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSigningPlatformsRequest extends js.Object {
  /**
    * The category type of a signing platform.
    */
  var category: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of results to be returned by this operation.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Value for specifying the next set of paginated results to return. After you receive a response with truncated results, use this parameter in a subsequent request. Set it to the value of nextToken from the response that you just received.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * Any partner entities connected to a signing platform.
    */
  var partner: js.UndefOr[String] = js.undefined
  /**
    * The validation template that is used by the target signing platform.
    */
  var target: js.UndefOr[String] = js.undefined
}

object ListSigningPlatformsRequest {
  @scala.inline
  def apply(
    category: String = null,
    maxResults: Int | Double = null,
    nextToken: String = null,
    partner: String = null,
    target: String = null
  ): ListSigningPlatformsRequest = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (partner != null) __obj.updateDynamic("partner")(partner)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ListSigningPlatformsRequest]
  }
}

