package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseBlueprintsRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get relational database blueprints request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object GetRelationalDatabaseBlueprintsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetRelationalDatabaseBlueprintsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetRelationalDatabaseBlueprintsRequest]
  }
}

