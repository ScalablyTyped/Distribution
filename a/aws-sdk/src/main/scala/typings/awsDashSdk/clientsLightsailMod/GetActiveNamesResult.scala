package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetActiveNamesResult extends js.Object {
  /**
    * The list of active names returned by the get active names request.
    */
  var activeNames: js.UndefOr[StringList] = js.native
  /**
    * A token used for advancing to the next page of results from your get active names request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetActiveNamesResult {
  @scala.inline
  def apply(activeNames: StringList = null, nextPageToken: String = null): GetActiveNamesResult = {
    val __obj = js.Dynamic.literal()
    if (activeNames != null) __obj.updateDynamic("activeNames")(activeNames.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetActiveNamesResult]
  }
}

