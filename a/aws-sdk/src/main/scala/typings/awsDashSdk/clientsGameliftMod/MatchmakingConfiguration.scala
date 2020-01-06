package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchmakingConfiguration extends js.Object {
  /**
    * A flag that indicates whether a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
    */
  var AcceptanceRequired: js.UndefOr[BooleanModel] = js.native
  /**
    * The length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
    */
  var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.native
  /**
    * The number of player slots in a match to keep open for future players. For example, assume that the configuration's rule set specifies a match for a single 12-person team. If the additional player count is set to 2, only 10 players are initially selected for the match.
    */
  var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.native
  /**
    * The method used to backfill game sessions created with this matchmaking configuration. MANUAL indicates that the game makes backfill requests or does not use the match backfill feature. AUTOMATIC indicates that GameLift creates StartMatchBackfill requests whenever a game session has one or more open slots. Learn more about manual and automatic backfill in Backfill Existing Games with FlexMatch.
    */
  var BackfillMode: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.BackfillMode] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift matchmaking configuration resource and uniquely identifies it. ARNs are unique across all Regions. In a GameLift configuration ARN, the resource ID matches the Name value.
    */
  var ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn] = js.native
  /**
    * The time stamp indicating when this data object was created. The format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    * Information to attach to all events related to the matchmaking configuration. 
    */
  var CustomEventData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.CustomEventData] = js.native
  /**
    * A descriptive label that is associated with matchmaking configuration.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * A set of custom properties for a game session, formatted as key-value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. 
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.native
  /**
    * A set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). This information is added to the new GameSession object that is created for a successful match. 
    */
  var GameSessionData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionData] = js.native
  /**
    * Amazon Resource Name (ARN) that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions. GameLift uses the listed queues when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any Region.
    */
  var GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.native
  /**
    * A unique identifier for a matchmaking configuration. This name is used to identify the configuration associated with a matchmaking request or ticket.
    */
  var Name: js.UndefOr[MatchmakingIdStringModel] = js.native
  /**
    * An SNS topic ARN that is set up to receive matchmaking notifications.
    */
  var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.native
  /**
    * The maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that fail due to timing out can be resubmitted as needed.
    */
  var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.native
  /**
    * The Amazon Resource Name (ARN) associated with the GameLift matchmaking rule set resource that this configuration uses.
    */
  var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.native
  /**
    * A unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only use rule sets that are defined in the same Region.
    */
  var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.native
}

object MatchmakingConfiguration {
  @scala.inline
  def apply(
    AcceptanceRequired: js.UndefOr[Boolean] = js.undefined,
    AcceptanceTimeoutSeconds: Int | scala.Double = null,
    AdditionalPlayerCount: Int | scala.Double = null,
    BackfillMode: BackfillMode = null,
    ConfigurationArn: MatchmakingConfigurationArn = null,
    CreationTime: Timestamp = null,
    CustomEventData: CustomEventData = null,
    Description: NonZeroAndMaxString = null,
    GameProperties: GamePropertyList = null,
    GameSessionData: GameSessionData = null,
    GameSessionQueueArns: QueueArnsList = null,
    Name: MatchmakingIdStringModel = null,
    NotificationTarget: SnsArnStringModel = null,
    RequestTimeoutSeconds: Int | scala.Double = null,
    RuleSetArn: MatchmakingRuleSetArn = null,
    RuleSetName: MatchmakingIdStringModel = null
  ): MatchmakingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AcceptanceRequired)) __obj.updateDynamic("AcceptanceRequired")(AcceptanceRequired.asInstanceOf[js.Any])
    if (AcceptanceTimeoutSeconds != null) __obj.updateDynamic("AcceptanceTimeoutSeconds")(AcceptanceTimeoutSeconds.asInstanceOf[js.Any])
    if (AdditionalPlayerCount != null) __obj.updateDynamic("AdditionalPlayerCount")(AdditionalPlayerCount.asInstanceOf[js.Any])
    if (BackfillMode != null) __obj.updateDynamic("BackfillMode")(BackfillMode.asInstanceOf[js.Any])
    if (ConfigurationArn != null) __obj.updateDynamic("ConfigurationArn")(ConfigurationArn.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (CustomEventData != null) __obj.updateDynamic("CustomEventData")(CustomEventData.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GameProperties != null) __obj.updateDynamic("GameProperties")(GameProperties.asInstanceOf[js.Any])
    if (GameSessionData != null) __obj.updateDynamic("GameSessionData")(GameSessionData.asInstanceOf[js.Any])
    if (GameSessionQueueArns != null) __obj.updateDynamic("GameSessionQueueArns")(GameSessionQueueArns.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NotificationTarget != null) __obj.updateDynamic("NotificationTarget")(NotificationTarget.asInstanceOf[js.Any])
    if (RequestTimeoutSeconds != null) __obj.updateDynamic("RequestTimeoutSeconds")(RequestTimeoutSeconds.asInstanceOf[js.Any])
    if (RuleSetArn != null) __obj.updateDynamic("RuleSetArn")(RuleSetArn.asInstanceOf[js.Any])
    if (RuleSetName != null) __obj.updateDynamic("RuleSetName")(RuleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchmakingConfiguration]
  }
}

