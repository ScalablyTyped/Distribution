package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseBlueprintsResult extends js.Object {
  /**
    * An object describing the result of your get relational database blueprints request.
    */
  var blueprints: js.UndefOr[RelationalDatabaseBlueprintList] = js.undefined
  /**
    * A token used for advancing to the next page of results of your get relational database blueprints request.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetRelationalDatabaseBlueprintsResult {
  @scala.inline
  def apply(blueprints: RelationalDatabaseBlueprintList = null, nextPageToken: java.lang.String = null): GetRelationalDatabaseBlueprintsResult = {
    val __obj = js.Dynamic.literal()
    if (blueprints != null) __obj.updateDynamic("blueprints")(blueprints)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetRelationalDatabaseBlueprintsResult]
  }
}

