package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlueprintsResult extends js.Object {
  /**
    * An array of key-value pairs that contains information about the available blueprints.
    */
  var blueprints: js.UndefOr[BlueprintList] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get blueprints request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GetBlueprintsResult {
  @scala.inline
  def apply(blueprints: BlueprintList = null, nextPageToken: String = null): GetBlueprintsResult = {
    val __obj = js.Dynamic.literal()
    if (blueprints != null) __obj.updateDynamic("blueprints")(blueprints)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GetBlueprintsResult]
  }
}

