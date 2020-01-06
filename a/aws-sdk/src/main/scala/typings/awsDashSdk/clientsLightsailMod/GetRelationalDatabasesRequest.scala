package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabasesRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetRelationalDatabasesRequest {
  @scala.inline
  def apply(pageToken: String = null): GetRelationalDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabasesRequest]
  }
}

