package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchmakingTicket extends js.Object {
  /**
    * Name of the MatchmakingConfiguration that is used with this ticket. Matchmaking configurations determine how players are grouped into a match and how a new game session is created for the match.
    */
  var ConfigurationName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
  /**
    * Time stamp indicating when this matchmaking request stopped being processed due to success, failure, or cancellation. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var EndTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Average amount of time (in seconds) that players are currently waiting for a match. If there is not enough recent data, this property may be empty.
    */
  var EstimatedWaitTime: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Identifier and connection information of the game session created for the match. This information is added to the ticket only after the matchmaking request has been successfully completed.
    */
  var GameSessionConnectionInfo: js.UndefOr[GameSessionConnectionInfo] = js.undefined
  /**
    * A set of Player objects, each representing a player to find matches for. Players are identified by a unique player ID and may include latency data for use during matchmaking. If the ticket is in status COMPLETED, the Player objects include the team the players were assigned to in the resulting match.
    */
  var Players: js.UndefOr[PlayerList] = js.undefined
  /**
    * Time stamp indicating when this matchmaking request was received. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Current status of the matchmaking request.    QUEUED -- The matchmaking request has been received and is currently waiting to be processed.    SEARCHING -- The matchmaking request is currently being processed.     REQUIRES_ACCEPTANCE -- A match has been proposed and the players must accept the match (see AcceptMatch). This status is used only with requests that use a matchmaking configuration with a player acceptance requirement.    PLACING -- The FlexMatch engine has matched players and is in the process of placing a new game session for the match.    COMPLETED -- Players have been matched and a game session is ready to host the players. A ticket in this state contains the necessary connection information for players.    FAILED -- The matchmaking request was not completed.    CANCELLED -- The matchmaking request was canceled. This may be the result of a call to StopMatchmaking or a proposed match that one or more players failed to accept.    TIMED_OUT -- The matchmaking request was not successful within the duration specified in the matchmaking configuration.     Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be resubmitted as new requests with new ticket IDs. 
    */
  var Status: js.UndefOr[MatchmakingConfigurationStatus] = js.undefined
  /**
    * Additional information about the current status.
    */
  var StatusMessage: js.UndefOr[StringModel] = js.undefined
  /**
    * Code to explain the current status. For example, a status reason may indicate when a ticket has returned to SEARCHING status after a proposed match fails to receive player acceptances.
    */
  var StatusReason: js.UndefOr[StringModel] = js.undefined
  /**
    * Unique identifier for a matchmaking ticket.
    */
  var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
}

object MatchmakingTicket {
  @scala.inline
  def apply(
    ConfigurationName: MatchmakingIdStringModel = null,
    EndTime: Timestamp = null,
    EstimatedWaitTime: js.UndefOr[WholeNumber] = js.undefined,
    GameSessionConnectionInfo: GameSessionConnectionInfo = null,
    Players: PlayerList = null,
    StartTime: Timestamp = null,
    Status: MatchmakingConfigurationStatus = null,
    StatusMessage: StringModel = null,
    StatusReason: StringModel = null,
    TicketId: MatchmakingIdStringModel = null
  ): MatchmakingTicket = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationName != null) __obj.updateDynamic("ConfigurationName")(ConfigurationName)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (!js.isUndefined(EstimatedWaitTime)) __obj.updateDynamic("EstimatedWaitTime")(EstimatedWaitTime)
    if (GameSessionConnectionInfo != null) __obj.updateDynamic("GameSessionConnectionInfo")(GameSessionConnectionInfo)
    if (Players != null) __obj.updateDynamic("Players")(Players)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason)
    if (TicketId != null) __obj.updateDynamic("TicketId")(TicketId)
    __obj.asInstanceOf[MatchmakingTicket]
  }
}

