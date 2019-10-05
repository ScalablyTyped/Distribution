package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFleetsInput extends js.Object {
  /**
    * Unique identifier for a build to return fleets for. Use this parameter to return only fleets using the specified build. To retrieve all fleets, leave this parameter empty.
    */
  var BuildId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.BuildId] = js.undefined
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a Realtime script to return fleets for. Use this parameter to return only fleets using the specified script. To retrieve all fleets, leave this parameter empty.
    */
  var ScriptId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.ScriptId] = js.undefined
}

object ListFleetsInput {
  @scala.inline
  def apply(
    BuildId: BuildId = null,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null,
    ScriptId: ScriptId = null
  ): ListFleetsInput = {
    val __obj = js.Dynamic.literal()
    if (BuildId != null) __obj.updateDynamic("BuildId")(BuildId)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ScriptId != null) __obj.updateDynamic("ScriptId")(ScriptId)
    __obj.asInstanceOf[ListFleetsInput]
  }
}

