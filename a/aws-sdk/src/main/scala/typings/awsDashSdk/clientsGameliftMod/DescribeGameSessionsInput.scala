package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGameSessionsInput extends js.Object {
  /**
    * Unique identifier for an alias associated with the fleet to retrieve all game sessions for. 
    */
  var AliasId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.AliasId] = js.undefined
  /**
    * Unique identifier for a fleet to retrieve all game sessions for.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.undefined
  /**
    * Unique identifier for the game session to retrieve. You can use either a GameSessionId or GameSessionArn value. 
    */
  var GameSessionId: js.UndefOr[ArnStringModel] = js.undefined
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Game session status to filter results on. Possible game session statuses include ACTIVE, TERMINATED, ACTIVATING, and TERMINATING (the last two are transitory). 
    */
  var StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeGameSessionsInput {
  @scala.inline
  def apply(
    AliasId: AliasId = null,
    FleetId: FleetId = null,
    GameSessionId: ArnStringModel = null,
    Limit: js.UndefOr[PositiveInteger] = js.undefined,
    NextToken: NonZeroAndMaxString = null,
    StatusFilter: NonZeroAndMaxString = null
  ): DescribeGameSessionsInput = {
    val __obj = js.Dynamic.literal()
    if (AliasId != null) __obj.updateDynamic("AliasId")(AliasId)
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId)
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StatusFilter != null) __obj.updateDynamic("StatusFilter")(StatusFilter)
    __obj.asInstanceOf[DescribeGameSessionsInput]
  }
}

