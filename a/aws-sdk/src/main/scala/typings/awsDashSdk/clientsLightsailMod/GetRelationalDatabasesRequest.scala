package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabasesRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object GetRelationalDatabasesRequest {
  @scala.inline
  def apply(pageToken: String = null): GetRelationalDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetRelationalDatabasesRequest]
  }
}

