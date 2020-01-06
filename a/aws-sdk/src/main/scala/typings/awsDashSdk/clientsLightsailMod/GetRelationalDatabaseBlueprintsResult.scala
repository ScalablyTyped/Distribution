package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseBlueprintsResult extends js.Object {
  /**
    * An object describing the result of your get relational database blueprints request.
    */
  var blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.native
  /**
    * A token used for advancing to the next page of results of your get relational database blueprints request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetRelationalDatabaseBlueprintsResult {
  @scala.inline
  def apply(blueprints: RelationalDatabaseBlueprintList = null, nextPageToken: String = null): GetRelationalDatabaseBlueprintsResult = {
    val __obj = js.Dynamic.literal()
    if (blueprints != null) __obj.updateDynamic("blueprints")(blueprints.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseBlueprintsResult]
  }
}

