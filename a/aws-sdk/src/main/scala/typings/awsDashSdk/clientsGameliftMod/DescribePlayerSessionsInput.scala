package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePlayerSessionsInput extends js.Object {
  /**
    * Unique identifier for the game session to retrieve player sessions for.
    */
  var GameSessionId: js.UndefOr[ArnStringModel] = js.undefined
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. If a player session ID is specified, this parameter is ignored.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value. If a player session ID is specified, this parameter is ignored.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a player to retrieve player sessions for.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Unique identifier for a player session to retrieve.
    */
  var PlayerSessionId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerSessionId] = js.undefined
  /**
    * Player session status to filter results on. Possible player session statuses include the following:    RESERVED -- The player session request has been received, but the player has not yet connected to the server process and/or been validated.     ACTIVE -- The player has been validated by the server process and is currently connected.    COMPLETED -- The player connection has been dropped.    TIMEDOUT -- A player session request was received, but the player did not connect and/or was not validated within the timeout limit (60 seconds).  
    */
  var PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribePlayerSessionsInput {
  @scala.inline
  def apply(
    GameSessionId: ArnStringModel = null,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null,
    PlayerId: NonZeroAndMaxString = null,
    PlayerSessionId: PlayerSessionId = null,
    PlayerSessionStatusFilter: NonZeroAndMaxString = null
  ): DescribePlayerSessionsInput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionId != null) __obj.updateDynamic("GameSessionId")(GameSessionId)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PlayerId != null) __obj.updateDynamic("PlayerId")(PlayerId)
    if (PlayerSessionId != null) __obj.updateDynamic("PlayerSessionId")(PlayerSessionId)
    if (PlayerSessionStatusFilter != null) __obj.updateDynamic("PlayerSessionStatusFilter")(PlayerSessionStatusFilter)
    __obj.asInstanceOf[DescribePlayerSessionsInput]
  }
}

