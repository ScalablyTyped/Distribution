package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameSessionDetailsInput extends js.Object {
  /**
    * A unique identifier for an alias associated with the fleet to retrieve all game sessions for. You can use either the alias ID or ARN value.
    */
  var AliasId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.AliasId] = js.native
  /**
    * A unique identifier for a fleet to retrieve all game sessions active on the fleet. You can use either the fleet ID or ARN value.
    */
  var FleetId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.FleetId] = js.native
  /**
    * A unique identifier for the game session to retrieve. 
    */
  var GameSessionId: js.UndefOr[ArnStringModel] = js.native
  /**
    * The maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.native
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Game session status to filter results on. Possible game session statuses include ACTIVE, TERMINATED, ACTIVATING and TERMINATING (the last two are transitory). 
    */
  var StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.native
}

object DescribeGameSessionDetailsInput {
  @scala.inline
  def apply(
    AliasId: AliasId = null,
    FleetId: FleetId = null,
    GameSessionId: ArnStringModel = null,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null,
    StatusFilter: NonZeroAndMaxString = null
  ): DescribeGameSessionDetailsInput = {
    val __obj = js.Dynamic.literal()
    if (AliasId != null) __obj.updateDynamic("AliasId")(AliasId.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StatusFilter != null) __obj.updateDynamic("StatusFilter")(StatusFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGameSessionDetailsInput]
  }
}

