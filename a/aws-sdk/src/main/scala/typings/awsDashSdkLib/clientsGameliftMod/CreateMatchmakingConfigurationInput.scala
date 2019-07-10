package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMatchmakingConfigurationInput extends js.Object {
  /**
    * Flag that determines whether a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
    */
  var AcceptanceRequired: BooleanModel
  /**
    * Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
    */
  var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined
  /**
    * Number of player slots in a match to keep open for future players. For example, if the configuration's rule set specifies a match for a single 12-person team, and the additional player count is set to 2, only 10 players are selected for the match.
    */
  var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined
  /**
    * Method used to backfill game sessions created with this matchmaking configuration. Specify MANUAL when your game manages backfill requests manually or does not use the match backfill feature. Specify AUTOMATIC to have GameLift create a StartMatchBackfill request whenever a game session has one or more open slots. Learn more about manual and automatic backfill in  Backfill Existing Games with FlexMatch. 
    */
  var BackfillMode: js.UndefOr[BackfillMode] = js.undefined
  /**
    * Information to be added to all events related to this matchmaking configuration. 
    */
  var CustomEventData: js.UndefOr[CustomEventData] = js.undefined
  /**
    * Meaningful description of the matchmaking configuration. 
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  /**
    * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. 
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  /**
    * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match.
    */
  var GameSessionData: js.UndefOr[GameSessionData] = js.undefined
  /**
    * Amazon Resource Name (ARN) that is assigned to a game session queue and uniquely identifies it. Format is arn:aws:gamelift:&lt;region&gt;:&lt;aws account&gt;:gamesessionqueue/&lt;queue name&gt;. These queues are used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any region.
    */
  var GameSessionQueueArns: QueueArnsList
  /**
    * Unique identifier for a matchmaking configuration. This name is used to identify the configuration associated with a matchmaking request or ticket.
    */
  var Name: MatchmakingIdStringModel
  /**
    * SNS topic ARN that is set up to receive matchmaking notifications.
    */
  var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined
  /**
    * Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that fail due to timing out can be resubmitted as needed.
    */
  var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger
  /**
    * Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only use rule sets that are defined in the same region.
    */
  var RuleSetName: MatchmakingIdStringModel
}

object CreateMatchmakingConfigurationInput {
  @scala.inline
  def apply(
    AcceptanceRequired: BooleanModel,
    GameSessionQueueArns: QueueArnsList,
    Name: MatchmakingIdStringModel,
    RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger,
    RuleSetName: MatchmakingIdStringModel,
    AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
    AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
    BackfillMode: BackfillMode = null,
    CustomEventData: CustomEventData = null,
    Description: NonZeroAndMaxString = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    NotificationTarget: SnsArnStringModel = null
  ): CreateMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(AcceptanceRequired = AcceptanceRequired, GameSessionQueueArns = GameSessionQueueArns, Name = Name, RequestTimeoutSeconds = RequestTimeoutSeconds, RuleSetName = RuleSetName)
    if (!js.isUndefined(AcceptanceTimeoutSeconds)) __obj.updateDynamic("AcceptanceTimeoutSeconds")(AcceptanceTimeoutSeconds)
    if (!js.isUndefined(AdditionalPlayerCount)) __obj.updateDynamic("AdditionalPlayerCount")(AdditionalPlayerCount)
    if (BackfillMode != null) __obj.updateDynamic("BackfillMode")(BackfillMode.asInstanceOf[js.Any])
    if (CustomEventData != null) __obj.updateDynamic("CustomEventData")(CustomEventData)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties)
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData)
    if (NotificationTarget != null) __obj.updateDynamic("NotificationTarget")(NotificationTarget)
    __obj.asInstanceOf[CreateMatchmakingConfigurationInput]
  }
}

