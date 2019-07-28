package typings.awsDashSdk.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTypeInfos extends js.Object {
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * List of activity type information.
    */
  var typeInfos: ActivityTypeInfoList
}

object ActivityTypeInfos {
  @scala.inline
  def apply(typeInfos: ActivityTypeInfoList, nextPageToken: PageToken = null): ActivityTypeInfos = {
    val __obj = js.Dynamic.literal(typeInfos = typeInfos)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ActivityTypeInfos]
  }
}

