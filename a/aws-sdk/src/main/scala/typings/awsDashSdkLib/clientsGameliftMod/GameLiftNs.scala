package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/gamelift", "GameLift")
@js.native
object GameLiftNs extends js.Object {
  trait AcceptMatchInput extends js.Object {
    /**
      * Player response to the proposed match.
      */
    var AcceptanceType: AcceptanceType
    /**
      * Unique identifier for a player delivering the response. This parameter can include one or multiple player IDs.
      */
    var PlayerIds: StringList
    /**
      * Unique identifier for a matchmaking ticket. The ticket must be in status REQUIRES_ACCEPTANCE; otherwise this request will fail.
      */
    var TicketId: MatchmakingIdStringModel
  }
  
  trait AcceptMatchOutput extends js.Object
  
  trait Alias extends js.Object {
    /**
      * Unique identifier for an alias; alias ARNs are unique across all regions.
      */
    var AliasArn: js.UndefOr[ArnStringModel] = js.undefined
    /**
      * Unique identifier for an alias; alias IDs are unique within a region.
      */
    var AliasId: js.UndefOr[AliasId] = js.undefined
    /**
      * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Human-readable description of an alias.
      */
    var Description: js.UndefOr[FreeText] = js.undefined
    /**
      * Time stamp indicating when this data object was last modified. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Descriptive label that is associated with an alias. Alias names do not need to be unique.
      */
    var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined
    /**
      * Alias configuration for the alias, including routing type and settings.
      */
    var RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined
  }
  
  trait AttributeValue extends js.Object {
    /**
      * For number values, expressed as double.
      */
    var N: js.UndefOr[DoubleObject] = js.undefined
    /**
      * For single string values. Maximum string length is 100 characters.
      */
    var S: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * For a map of up to 10 data type:value pairs. Maximum length for each string value is 100 characters. 
      */
    var SDM: js.UndefOr[StringDoubleMap] = js.undefined
    /**
      * For a list of up to 10 strings. Maximum length for each string is 100 characters. Duplicate values are not recognized; all occurrences of the repeated value after the first of a repeated value are ignored.
      */
    var SL: js.UndefOr[StringList] = js.undefined
  }
  
  trait AwsCredentials extends js.Object {
    /**
      * Temporary key allowing access to the Amazon GameLift S3 account.
      */
    var AccessKeyId: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Temporary secret key allowing access to the Amazon GameLift S3 account.
      */
    var SecretAccessKey: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Token used to associate a specific build ID with the files uploaded using these credentials.
      */
    var SessionToken: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait Build extends js.Object {
    /**
      * Unique identifier for a build.
      */
    var BuildId: js.UndefOr[BuildId] = js.undefined
    /**
      * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Descriptive label that is associated with a build. Build names do not need to be unique. It can be set using CreateBuild or UpdateBuild.
      */
    var Name: js.UndefOr[FreeText] = js.undefined
    /**
      * Operating system that the game server binaries are built to run on. This value determines the type of fleet resources that you can use for this build.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * File size of the uploaded game build, expressed in bytes. When the build status is INITIALIZED, this value is 0.
      */
    var SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined
    /**
      * Current status of the build. Possible build statuses include the following:    INITIALIZED -- A new build has been defined, but no files have been uploaded. You cannot create fleets for builds that are in this status. When a build is successfully created, the build status is set to this value.     READY -- The game build has been successfully uploaded. You can now create new fleets for this build.    FAILED -- The game build upload failed. You cannot create new fleets for this build.   
      */
    var Status: js.UndefOr[BuildStatus] = js.undefined
    /**
      * Version that is associated with this build. Version strings do not need to be unique. This value can be set using CreateBuild or UpdateBuild.
      */
    var Version: js.UndefOr[FreeText] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateAliasInput extends js.Object {
    /**
      * Human-readable description of an alias.
      */
    var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Descriptive label that is associated with an alias. Alias names do not need to be unique.
      */
    var Name: NonBlankAndLengthConstraintString
    /**
      * Object that specifies the fleet and routing type to use for the alias.
      */
    var RoutingStrategy: RoutingStrategy
  }
  
  trait CreateAliasOutput extends js.Object {
    /**
      * Object that describes the newly created alias record.
      */
    var Alias: js.UndefOr[Alias] = js.undefined
  }
  
  trait CreateBuildInput extends js.Object {
    /**
      * Descriptive label that is associated with a build. Build names do not need to be unique. You can use UpdateBuild to change this value later. 
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Operating system that the game server binaries are built to run on. This value determines the type of fleet resources that you can use for this build. If your game build contains multiple executables, they all must run on the same operating system. If an operating system is not specified when creating a build, Amazon GameLift uses the default value (WINDOWS_2012). This value cannot be changed later.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * Information indicating where your game build files are stored. Use this parameter only when creating a build with files stored in an Amazon S3 bucket that you own. The storage location must specify an Amazon S3 bucket name and key, as well as a role ARN that you set up to allow Amazon GameLift to access your Amazon S3 bucket. The S3 bucket must be in the same region that you want to create a new build in.
      */
    var StorageLocation: js.UndefOr[S3Location] = js.undefined
    /**
      * Version that is associated with this build. Version strings do not need to be unique. You can use UpdateBuild to change this value later. 
      */
    var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait CreateBuildOutput extends js.Object {
    /**
      * The newly created build record, including a unique build ID and status. 
      */
    var Build: js.UndefOr[Build] = js.undefined
    /**
      * Amazon S3 location for your game build file, including bucket name and key.
      */
    var StorageLocation: js.UndefOr[S3Location] = js.undefined
    /**
      * This element is returned only when the operation is called without a storage location. It contains credentials to use when you are uploading a build file to an Amazon S3 bucket that is owned by Amazon GameLift. Credentials have a limited life span. To refresh these credentials, call RequestUploadCredentials. 
      */
    var UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
  }
  
  trait CreateFleetInput extends js.Object {
    /**
      * Unique identifier for a build to be deployed on the new fleet. The build must have been successfully uploaded to Amazon GameLift and be in a READY status. This fleet setting cannot be changed once the fleet is created.
      */
    var BuildId: BuildId
    /**
      * Human-readable description of a fleet.
      */
    var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the fleet. If no inbound permissions are set, including both IP address range and port range, the server processes in the fleet cannot accept connections. You can specify one or more sets of permissions for a fleet.
      */
    var EC2InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
    /**
      * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
      */
    var EC2InstanceType: EC2InstanceType
    /**
      * Indicates whether to use on-demand instances or spot instances for this fleet. If empty, the default is ON_DEMAND. Both categories of instances use identical hardware and configurations, based on the instance type selected for this fleet. You can acquire on-demand instances at any time for a fixed price and keep them as long as you need them. Spot instances have lower prices, but spot pricing is variable, and while in use they can be interrupted (with a two-minute notification). Learn more about Amazon GameLift spot instances with at  Set up Access to External Services. 
      */
    var FleetType: js.UndefOr[FleetType] = js.undefined
    /**
      * This parameter is no longer used. Instead, to specify where Amazon GameLift should store log files once a server process shuts down, use the Amazon GameLift server API ProcessReady() and specify one or more directory paths in logParameters. See more information in the Server API Reference. 
      */
    var LogPaths: js.UndefOr[StringList] = js.undefined
    /**
      * Name of an Amazon CloudWatch metric group to add this fleet to. A metric group aggregates the metrics for all fleets in the group. Specify an existing metric group name, or provide a new name to create a new metric group. A fleet can only be included in one metric group at a time. 
      */
    var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
    /**
      * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
      */
    var Name: NonZeroAndMaxString
    /**
      * Game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes, but this change will only affect sessions created after the policy change. You can also set protection for individual instances using UpdateGameSession.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
      */
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
    /**
      * Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your Account ID in the AWS Management Console under account settings. 
      */
    var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets. 
      */
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Policy that limits the number of game sessions an individual player can create over a span of time for this fleet.
      */
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined
    /**
      * Instructions for launching server processes on each instance in the fleet. The run-time configuration for a fleet has a collection of server process configurations, one for each type of server process to run on an instance. A server process configuration specifies the location of the server executable, launch parameters, and the number of concurrent processes with that configuration to maintain on each instance. A CreateFleet request must include a run-time configuration with at least one server process configuration; otherwise the request fails with an invalid request exception. (This parameter replaces the parameters ServerLaunchPath and ServerLaunchParameters; requests that contain values for these parameters instead of a run-time configuration will continue to work.) 
      */
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined
    /**
      * This parameter is no longer used. Instead, specify server launch parameters in the RuntimeConfiguration parameter. (Requests that specify a server launch path and launch parameters instead of a run-time configuration will continue to work.)
      */
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * This parameter is no longer used. Instead, specify a server launch path using the RuntimeConfiguration parameter. (Requests that specify a server launch path and launch parameters instead of a run-time configuration will continue to work.)
      */
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait CreateFleetOutput extends js.Object {
    /**
      * Properties for the newly created fleet.
      */
    var FleetAttributes: js.UndefOr[FleetAttributes] = js.undefined
  }
  
  trait CreateGameSessionInput extends js.Object {
    /**
      * Unique identifier for an alias associated with the fleet to create a game session in. Each request must reference either a fleet ID or alias ID, but not both.
      */
    var AliasId: js.UndefOr[AliasId] = js.undefined
    /**
      * Unique identifier for a player or entity creating the game session. This ID is used to enforce a resource protection policy (if one exists) that limits the number of concurrent active game sessions one player can have.
      */
    var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a fleet to create a game session in. Each request must reference either a fleet ID or alias ID, but not both.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
      */
    var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
    /**
      * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
      */
    var GameSessionData: js.UndefOr[GameSessionData] = js.undefined
    /**
      *  This parameter is no longer preferred. Please use IdempotencyToken instead. Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) 
      */
    var GameSessionId: js.UndefOr[IdStringModel] = js.undefined
    /**
      * Custom string that uniquely identifies a request for a new game session. Maximum token length is 48 characters. If provided, this string is included in the new game session's ID. (A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.) Idempotency tokens remain in use for 30 days after a game session has ended; game session objects are retained for this time period and then deleted.
      */
    var IdempotencyToken: js.UndefOr[IdStringModel] = js.undefined
    /**
      * Maximum number of players that can be connected simultaneously to the game session.
      */
    var MaximumPlayerSessionCount: WholeNumber
    /**
      * Descriptive label that is associated with a game session. Session names do not need to be unique.
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait CreateGameSessionOutput extends js.Object {
    /**
      * Object that describes the newly created game session record.
      */
    var GameSession: js.UndefOr[GameSession] = js.undefined
  }
  
  trait CreateGameSessionQueueInput extends js.Object {
    /**
      * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
      */
    var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined
    /**
      * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
      */
    var Name: GameSessionQueueName
    /**
      * Collection of latency policies to apply when processing game sessions placement requests with player latency information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest latency values. With just one policy, it is enforced at the start of the game session placement for the duration period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of the placement. A player latency policy must set a value for MaximumIndividualPlayerLatencyMilliseconds; if none is set, this API requests will fail.
      */
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined
    /**
      * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
      */
    var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait CreateGameSessionQueueOutput extends js.Object {
    /**
      * Object that describes the newly created game session queue.
      */
    var GameSessionQueue: js.UndefOr[GameSessionQueue] = js.undefined
  }
  
  trait CreateMatchmakingConfigurationInput extends js.Object {
    /**
      * Flag that determines whether or not a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
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
      * Information to attached to all events related to the matchmaking configuration. 
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
      * Amazon Resource Name (ARN) that is assigned to a game session queue and uniquely identifies it. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912. These queues are used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any region.
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
      * Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that time out can be resubmitted as needed.
      */
    var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger
    /**
      * Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only use rule sets that are defined in the same region.
      */
    var RuleSetName: MatchmakingIdStringModel
  }
  
  trait CreateMatchmakingConfigurationOutput extends js.Object {
    /**
      * Object that describes the newly created matchmaking configuration.
      */
    var Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
  }
  
  trait CreateMatchmakingRuleSetInput extends js.Object {
    /**
      * Unique identifier for a matchmaking rule set. A matchmaking configuration identifies the rule set it uses by this name value. (Note: The rule set name is different from the optional "name" field in the rule set body.) 
      */
    var Name: MatchmakingIdStringModel
    /**
      * Collection of matchmaking rules, formatted as a JSON string. Note that comments are not allowed in JSON, but most elements support a description field.
      */
    var RuleSetBody: RuleSetBody
  }
  
  trait CreateMatchmakingRuleSetOutput extends js.Object {
    /**
      * Object that describes the newly created matchmaking rule set.
      */
    var RuleSet: MatchmakingRuleSet
  }
  
  trait CreatePlayerSessionInput extends js.Object {
    /**
      * Unique identifier for the game session to add a player to.
      */
    var GameSessionId: ArnStringModel
    /**
      * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
      */
    var PlayerData: js.UndefOr[PlayerData] = js.undefined
    /**
      * Unique identifier for a player. Player IDs are developer-defined.
      */
    var PlayerId: NonZeroAndMaxString
  }
  
  trait CreatePlayerSessionOutput extends js.Object {
    /**
      * Object that describes the newly created player session record.
      */
    var PlayerSession: js.UndefOr[PlayerSession] = js.undefined
  }
  
  trait CreatePlayerSessionsInput extends js.Object {
    /**
      * Unique identifier for the game session to add players to.
      */
    var GameSessionId: ArnStringModel
    /**
      * Map of string pairs, each specifying a player ID and a set of developer-defined information related to the player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. Player data strings for player IDs not included in the PlayerIds parameter are ignored. 
      */
    var PlayerDataMap: js.UndefOr[PlayerDataMap] = js.undefined
    /**
      * List of unique identifiers for the players to be added.
      */
    var PlayerIds: PlayerIdList
  }
  
  trait CreatePlayerSessionsOutput extends js.Object {
    /**
      * Collection of player session objects created for the added players.
      */
    var PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
  }
  
  trait CreateVpcPeeringAuthorizationInput extends js.Object {
    /**
      * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your Account ID in the AWS Management Console under account settings.
      */
    var GameLiftAwsAccountId: NonZeroAndMaxString
    /**
      * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
      */
    var PeerVpcId: NonZeroAndMaxString
  }
  
  trait CreateVpcPeeringAuthorizationOutput extends js.Object {
    /**
      * Details on the requested VPC peering authorization, including expiration.
      */
    var VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization] = js.undefined
  }
  
  trait CreateVpcPeeringConnectionInput extends js.Object {
    /**
      * Unique identifier for a fleet. This tells Amazon GameLift which GameLift VPC to peer with. 
      */
    var FleetId: FleetId
    /**
      * Unique identifier for the AWS account with the VPC that you want to peer your Amazon GameLift fleet with. You can find your Account ID in the AWS Management Console under account settings.
      */
    var PeerVpcAwsAccountId: NonZeroAndMaxString
    /**
      * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
      */
    var PeerVpcId: NonZeroAndMaxString
  }
  
  trait CreateVpcPeeringConnectionOutput extends js.Object
  
  trait DeleteAliasInput extends js.Object {
    /**
      * Unique identifier for a fleet alias. Specify the alias you want to delete.
      */
    var AliasId: AliasId
  }
  
  trait DeleteBuildInput extends js.Object {
    /**
      * Unique identifier for a build to delete.
      */
    var BuildId: BuildId
  }
  
  trait DeleteFleetInput extends js.Object {
    /**
      * Unique identifier for a fleet to be deleted.
      */
    var FleetId: FleetId
  }
  
  trait DeleteGameSessionQueueInput extends js.Object {
    /**
      * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
      */
    var Name: GameSessionQueueName
  }
  
  trait DeleteGameSessionQueueOutput extends js.Object
  
  trait DeleteMatchmakingConfigurationInput extends js.Object {
    /**
      * Unique identifier for a matchmaking configuration
      */
    var Name: MatchmakingIdStringModel
  }
  
  trait DeleteMatchmakingConfigurationOutput extends js.Object
  
  trait DeleteMatchmakingRuleSetInput extends js.Object {
    /**
      * Unique identifier for a matchmaking rule set to be deleted. (Note: The rule set name is different from the optional "name" field in the rule set body.) 
      */
    var Name: MatchmakingIdStringModel
  }
  
  trait DeleteMatchmakingRuleSetOutput extends js.Object
  
  trait DeleteScalingPolicyInput extends js.Object {
    /**
      * Unique identifier for a fleet to be deleted.
      */
    var FleetId: FleetId
    /**
      * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
      */
    var Name: NonZeroAndMaxString
  }
  
  trait DeleteVpcPeeringAuthorizationInput extends js.Object {
    /**
      * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your Account ID in the AWS Management Console under account settings.
      */
    var GameLiftAwsAccountId: NonZeroAndMaxString
    /**
      * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
      */
    var PeerVpcId: NonZeroAndMaxString
  }
  
  trait DeleteVpcPeeringAuthorizationOutput extends js.Object
  
  trait DeleteVpcPeeringConnectionInput extends js.Object {
    /**
      * Unique identifier for a fleet. This value must match the fleet ID referenced in the VPC peering connection record.
      */
    var FleetId: FleetId
    /**
      * Unique identifier for a VPC peering connection. This value is included in the VpcPeeringConnection object, which can be retrieved by calling DescribeVpcPeeringConnections.
      */
    var VpcPeeringConnectionId: NonZeroAndMaxString
  }
  
  trait DeleteVpcPeeringConnectionOutput extends js.Object
  
  trait DescribeAliasInput extends js.Object {
    /**
      * Unique identifier for a fleet alias. Specify the alias you want to retrieve.
      */
    var AliasId: AliasId
  }
  
  trait DescribeAliasOutput extends js.Object {
    /**
      * Object that contains the requested alias.
      */
    var Alias: js.UndefOr[Alias] = js.undefined
  }
  
  trait DescribeBuildInput extends js.Object {
    /**
      * Unique identifier for a build to retrieve properties for.
      */
    var BuildId: BuildId
  }
  
  trait DescribeBuildOutput extends js.Object {
    /**
      * Set of properties describing the requested build.
      */
    var Build: js.UndefOr[Build] = js.undefined
  }
  
  trait DescribeEC2InstanceLimitsInput extends js.Object {
    /**
      * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions. Leave this parameter blank to retrieve limits for all types.
      */
    var EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
  }
  
  trait DescribeEC2InstanceLimitsOutput extends js.Object {
    /**
      * Object that contains the maximum number of instances for the specified instance type.
      */
    var EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList] = js.undefined
  }
  
  trait DescribeFleetAttributesInput extends js.Object {
    /**
      * Unique identifier for a fleet(s) to retrieve attributes for. To request attributes for all fleets, leave this parameter empty.
      */
    var FleetIds: js.UndefOr[FleetIdList] = js.undefined
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is ignored when the request specifies one or a list of fleet IDs.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value. This parameter is ignored when the request specifies one or a list of fleet IDs.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeFleetAttributesOutput extends js.Object {
    /**
      * Collection of objects containing attribute metadata for each requested fleet ID.
      */
    var FleetAttributes: js.UndefOr[FleetAttributesList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeFleetCapacityInput extends js.Object {
    /**
      * Unique identifier for a fleet(s) to retrieve capacity information for. To request capacity information for all fleets, leave this parameter empty.
      */
    var FleetIds: js.UndefOr[FleetIdList] = js.undefined
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is ignored when the request specifies one or a list of fleet IDs.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value. This parameter is ignored when the request specifies one or a list of fleet IDs.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeFleetCapacityOutput extends js.Object {
    /**
      * Collection of objects containing capacity information for each requested fleet ID. Leave this parameter empty to retrieve capacity information for all fleets.
      */
    var FleetCapacity: js.UndefOr[FleetCapacityList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeFleetEventsInput extends js.Object {
    /**
      * Most recent date to retrieve event logs for. If no end time is specified, this call returns entries from the specified start time up to the present. Format is a number expressed in Unix time as milliseconds (ex: "1469498468.057").
      */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Unique identifier for a fleet to get event logs for.
      */
    var FleetId: FleetId
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Earliest date to retrieve event logs for. If no start time is specified, this call returns entries starting from when the fleet was created to the specified end time. Format is a number expressed in Unix time as milliseconds (ex: "1469498468.057").
      */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait DescribeFleetEventsOutput extends js.Object {
    /**
      * Collection of objects containing event log entries for the specified fleet.
      */
    var Events: js.UndefOr[EventList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeFleetPortSettingsInput extends js.Object {
    /**
      * Unique identifier for a fleet to retrieve port settings for.
      */
    var FleetId: FleetId
  }
  
  trait DescribeFleetPortSettingsOutput extends js.Object {
    /**
      * Object that contains port settings for the requested fleet ID.
      */
    var InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
  }
  
  trait DescribeFleetUtilizationInput extends js.Object {
    /**
      * Unique identifier for a fleet(s) to retrieve utilization data for. To request utilization data for all fleets, leave this parameter empty.
      */
    var FleetIds: js.UndefOr[FleetIdList] = js.undefined
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is ignored when the request specifies one or a list of fleet IDs.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value. This parameter is ignored when the request specifies one or a list of fleet IDs.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeFleetUtilizationOutput extends js.Object {
    /**
      * Collection of objects containing utilization information for each requested fleet ID.
      */
    var FleetUtilization: js.UndefOr[FleetUtilizationList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeGameSessionDetailsInput extends js.Object {
    /**
      * Unique identifier for an alias associated with the fleet to retrieve all game sessions for.
      */
    var AliasId: js.UndefOr[AliasId] = js.undefined
    /**
      * Unique identifier for a fleet to retrieve all game sessions active on the fleet.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Unique identifier for the game session to retrieve.
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
      * Game session status to filter results on. Possible game session statuses include ACTIVE, TERMINATED, ACTIVATING and TERMINATING (the last two are transitory). 
      */
    var StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeGameSessionDetailsOutput extends js.Object {
    /**
      * Collection of objects containing game session properties and the protection policy currently in force for each session matching the request.
      */
    var GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeGameSessionPlacementInput extends js.Object {
    /**
      * Unique identifier for a game session placement to retrieve.
      */
    var PlacementId: IdStringModel
  }
  
  trait DescribeGameSessionPlacementOutput extends js.Object {
    /**
      * Object that describes the requested game session placement.
      */
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
  }
  
  trait DescribeGameSessionQueuesInput extends js.Object {
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * List of queue names to retrieve information for. To request settings for all queues, leave this parameter empty.
      */
    var Names: js.UndefOr[GameSessionQueueNameList] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeGameSessionQueuesOutput extends js.Object {
    /**
      * Collection of objects that describes the requested game session queues.
      */
    var GameSessionQueues: js.UndefOr[GameSessionQueueList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeGameSessionsInput extends js.Object {
    /**
      * Unique identifier for an alias associated with the fleet to retrieve all game sessions for. 
      */
    var AliasId: js.UndefOr[AliasId] = js.undefined
    /**
      * Unique identifier for a fleet to retrieve all game sessions for.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
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
  
  trait DescribeGameSessionsOutput extends js.Object {
    /**
      * Collection of objects containing game session properties for each session matching the request.
      */
    var GameSessions: js.UndefOr[GameSessionList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeInstancesInput extends js.Object {
    /**
      * Unique identifier for a fleet to retrieve instance information for.
      */
    var FleetId: FleetId
    /**
      * Unique identifier for an instance to retrieve. Specify an instance ID or leave blank to retrieve all instances in the fleet.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeInstancesOutput extends js.Object {
    /**
      * Collection of objects containing properties for each instance returned.
      */
    var Instances: js.UndefOr[InstanceList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeMatchmakingConfigurationsInput extends js.Object {
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is limited to 10.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Unique identifier for a matchmaking configuration(s) to retrieve. To request all existing configurations, leave this parameter empty.
      */
    var Names: js.UndefOr[MatchmakingIdList] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a matchmaking rule set. Use this parameter to retrieve all matchmaking configurations that use this rule set.
      */
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
  }
  
  trait DescribeMatchmakingConfigurationsOutput extends js.Object {
    /**
      * Collection of requested matchmaking configuration objects.
      */
    var Configurations: js.UndefOr[MatchmakingConfigurationList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeMatchmakingInput extends js.Object {
    /**
      * Unique identifier for a matchmaking ticket. You can include up to 10 ID values. 
      */
    var TicketIds: MatchmakingIdList
  }
  
  trait DescribeMatchmakingOutput extends js.Object {
    /**
      * Collection of existing matchmaking ticket objects matching the request.
      */
    var TicketList: js.UndefOr[MatchmakingTicketList] = js.undefined
  }
  
  trait DescribeMatchmakingRuleSetsInput extends js.Object {
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
      */
    var Limit: js.UndefOr[RuleSetLimit] = js.undefined
    /**
      * List of one or more matchmaking rule set names to retrieve details for. (Note: The rule set name is different from the optional "name" field in the rule set body.) 
      */
    var Names: js.UndefOr[MatchmakingRuleSetNameList] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribeMatchmakingRuleSetsOutput extends js.Object {
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Collection of requested matchmaking rule set objects. 
      */
    var RuleSets: MatchmakingRuleSetList
  }
  
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
    var PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined
    /**
      * Player session status to filter results on. Possible player session statuses include the following:    RESERVED -- The player session request has been received, but the player has not yet connected to the server process and/or been validated.     ACTIVE -- The player has been validated by the server process and is currently connected.    COMPLETED -- The player connection has been dropped.    TIMEDOUT -- A player session request was received, but the player did not connect and/or was not validated within the timeout limit (60 seconds).  
      */
    var PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait DescribePlayerSessionsOutput extends js.Object {
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Collection of objects containing properties for each player session that matches the request.
      */
    var PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
  }
  
  trait DescribeRuntimeConfigurationInput extends js.Object {
    /**
      * Unique identifier for a fleet to get the run-time configuration for.
      */
    var FleetId: FleetId
  }
  
  trait DescribeRuntimeConfigurationOutput extends js.Object {
    /**
      * Instructions describing how server processes should be launched and maintained on each instance in the fleet.
      */
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined
  }
  
  trait DescribeScalingPoliciesInput extends js.Object {
    /**
      * Unique identifier for a fleet to retrieve scaling policies for.
      */
    var FleetId: FleetId
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Scaling policy status to filter results on. A scaling policy is only in force when in an ACTIVE status.    ACTIVE -- The scaling policy is currently in force.    UPDATEREQUESTED -- A request to update the scaling policy has been received.    UPDATING -- A change is being made to the scaling policy.    DELETEREQUESTED -- A request to delete the scaling policy has been received.    DELETING -- The scaling policy is being deleted.    DELETED -- The scaling policy has been deleted.    ERROR -- An error occurred in creating the policy. It should be removed and recreated.  
      */
    var StatusFilter: js.UndefOr[ScalingStatusType] = js.undefined
  }
  
  trait DescribeScalingPoliciesOutput extends js.Object {
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Collection of objects containing the scaling policies matching the request.
      */
    var ScalingPolicies: js.UndefOr[ScalingPolicyList] = js.undefined
  }
  
  trait DescribeVpcPeeringAuthorizationsInput extends js.Object
  
  trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
    /**
      * Collection of objects that describe all valid VPC peering operations for the current AWS account.
      */
    var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.undefined
  }
  
  trait DescribeVpcPeeringConnectionsInput extends js.Object {
    /**
      * Unique identifier for a fleet.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
  }
  
  trait DescribeVpcPeeringConnectionsOutput extends js.Object {
    /**
      * Collection of VPC peering connection records that match the request.
      */
    var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
  }
  
  trait DesiredPlayerSession extends js.Object {
    /**
      * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
      */
    var PlayerData: js.UndefOr[PlayerData] = js.undefined
    /**
      * Unique identifier for a player to associate with the player session.
      */
    var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait EC2InstanceCounts extends js.Object {
    /**
      * Actual number of active instances in the fleet.
      */
    var ACTIVE: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Ideal number of active instances in the fleet.
      */
    var DESIRED: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Number of active instances in the fleet that are not currently hosting a game session.
      */
    var IDLE: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Maximum value allowed for the fleet's instance count.
      */
    var MAXIMUM: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Minimum value allowed for the fleet's instance count.
      */
    var MINIMUM: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Number of instances in the fleet that are starting but not yet active.
      */
    var PENDING: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Number of instances in the fleet that are no longer active but haven't yet been terminated.
      */
    var TERMINATING: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait EC2InstanceLimit extends js.Object {
    /**
      * Number of instances of the specified type that are currently in use by this AWS account.
      */
    var CurrentInstances: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
      */
    var EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
    /**
      * Number of instances allowed.
      */
    var InstanceLimit: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait Event extends js.Object {
    /**
      * Type of event being logged. The following events are currently in use:  Fleet creation events:    FLEET_CREATED -- A fleet record was successfully created with a status of NEW. Event messaging includes the fleet ID.   FLEET_STATE_DOWNLOADING -- Fleet status changed from NEW to DOWNLOADING. The compressed build has started downloading to a fleet instance for installation.    FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.   FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and the build files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a fleet from moving to ACTIVE status. Logs for this stage display a list of the files that are extracted and saved on the instance. Access the logs by using the URL in PreSignedLogUrl.   FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet from moving to ACTIVE status. Logs for this stage list the installation steps and whether or not the install completed successfully. Access the logs by using the URL in PreSignedLogUrl.    FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is now verifying that the game server launch paths, which are specified in the fleet's run-time configuration, exist. If any listed launch path exists, Amazon GameLift tries to launch a game server process and waits for the process to report ready. Failures in this stage prevent a fleet from moving to ACTIVE status. Logs for this stage list the launch paths in the run-time configuration and indicate whether each is found. Access the logs by using the URL in PreSignedLogUrl.    FLEET_STATE_VALIDATING -- Fleet status changed from DOWNLOADING to VALIDATING.    FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the executable specified in a launch path does not exist on the instance.   FLEET_STATE_BUILDING -- Fleet status changed from VALIDATING to BUILDING.   FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the executable specified in a launch path failed to run on the fleet instance.   FLEET_STATE_ACTIVATING -- Fleet status changed from BUILDING to ACTIVATING.     FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet activation process. This event code indicates that the game build was successfully downloaded to a fleet instance, built, and validated, but was not able to start a server process. A possible reason for failure is that the game server is not reporting "process ready" to the Amazon GameLift service.   FLEET_STATE_ACTIVE -- The fleet's status changed from ACTIVATING to ACTIVE. The fleet is now ready to host game sessions.    VPC peering events:    FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon GameLift fleet and a VPC in your AWS account.   FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information (see DescribeVpcPeeringConnections) provide additional detail. A common reason for peering failure is that the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC in your AWS account. For more information on VPC peering failures, see https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html    FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.    Spot instance events:     INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.    Other fleet events:    FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum scaling limits). Event messaging includes the new capacity settings.   FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection policy setting. Event messaging includes both the old and new policy setting.    FLEET_DELETED -- A request to delete a fleet was initiated.    GENERIC_EVENT -- An unspecified event has occurred.  
      */
    var EventCode: js.UndefOr[EventCode] = js.undefined
    /**
      * Unique identifier for a fleet event.
      */
    var EventId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var EventTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Additional information related to the event.
      */
    var Message: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Location of stored logs with additional detail that is related to the event. This is useful for debugging issues. The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon GameLift console.
      */
    var PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for an event resource, such as a fleet ID.
      */
    var ResourceId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait FleetAttributes extends js.Object {
    /**
      * Unique identifier for a build.
      */
    var BuildId: js.UndefOr[BuildId] = js.undefined
    /**
      * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Human-readable description of the fleet.
      */
    var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Identifier for a fleet that is unique across all regions.
      */
    var FleetArn: js.UndefOr[ArnStringModel] = js.undefined
    /**
      * Unique identifier for a fleet.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a two-minute notification.
      */
    var FleetType: js.UndefOr[FleetType] = js.undefined
    /**
      * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. See Amazon EC2 Instance Types for detailed descriptions.
      */
    var InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
    /**
      * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log files in this location. These logs are in addition to game session logs; see more on game session logs in the Amazon GameLift Developer Guide. If no default log path for a fleet is specified, Amazon GameLift automatically uploads logs that are stored on each instance at C:\game\logs (for Windows) or /local/game/logs (for Linux). Use the Amazon GameLift console to access stored logs. 
      */
    var LogPaths: js.UndefOr[StringList] = js.undefined
    /**
      * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in only one metric group at a time.
      */
    var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
    /**
      * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Type of game session protection to set for all new instances started in the fleet.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
      */
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
    /**
      * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for the build that is deployed on this fleet.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
      */
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined
    /**
      * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch parameters for fleets created after this date are specified in the fleet's RuntimeConfiguration.
      */
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's RuntimeConfiguration.
      */
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Current status of the fleet. Possible fleet statuses include the following:    NEW -- A new fleet has been defined and desired instances is set to 1.     DOWNLOADING/VALIDATING/BUILDING/ACTIVATING -- Amazon GameLift is setting up the new fleet, creating new instances with the game build and starting server processes.    ACTIVE -- Hosts can now accept game sessions.    ERROR -- An error occurred when downloading, validating, building, or activating the fleet.    DELETING -- Hosts are responding to a delete fleet request.    TERMINATED -- The fleet no longer exists.  
      */
    var Status: js.UndefOr[FleetStatus] = js.undefined
    /**
      * List of fleet actions that have been suspended using StopFleetActions. This includes auto-scaling.
      */
    var StoppedActions: js.UndefOr[FleetActionList] = js.undefined
    /**
      * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var TerminationTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait FleetCapacity extends js.Object {
    /**
      * Unique identifier for a fleet.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Current status of fleet capacity.
      */
    var InstanceCounts: js.UndefOr[EC2InstanceCounts] = js.undefined
    /**
      * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
      */
    var InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
  }
  
  trait FleetUtilization extends js.Object {
    /**
      * Number of active game sessions currently being hosted on all instances in the fleet.
      */
    var ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Number of server processes in an ACTIVE status currently running across all instances in the fleet
      */
    var ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Number of active player sessions currently being hosted on all instances in the fleet.
      */
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Unique identifier for a fleet.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Maximum players allowed across all game sessions currently being hosted on all instances in the fleet.
      */
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait GameProperty extends js.Object {
    /**
      * Game property identifier.
      */
    var Key: GamePropertyKey
    /**
      * Game property value.
      */
    var Value: GamePropertyValue
  }
  
  trait GameSession extends js.Object {
    /**
      * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that limits the number of game sessions a player can create.
      */
    var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Number of players currently in the game session.
      */
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Unique identifier for a fleet that the game session is running on.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session). You can search for active game sessions based on this custom data with SearchGameSessions.
      */
    var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
    /**
      * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
      */
    var GameSessionData: js.UndefOr[GameSessionData] = js.undefined
    /**
      * Unique identifier for the game session. A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.
      */
    var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
      */
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * Information about the matchmaking process that was used to create the game session. It is in JSON syntax, formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are added during a successful backfill (see StartMatchBackfill). 
      */
    var MatchmakerData: js.UndefOr[MatchmakerData] = js.undefined
    /**
      * Maximum number of players that can be connected simultaneously to the game session.
      */
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Descriptive label that is associated with a game session. Session names do not need to be unique.
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Indicates whether or not the game session is accepting new players.
      */
    var PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy] = js.undefined
    /**
      * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
      */
    var Port: js.UndefOr[PortNumber] = js.undefined
    /**
      * Current status of the game session. A game session must have an ACTIVE status to have player sessions.
      */
    var Status: js.UndefOr[GameSessionStatus] = js.undefined
    /**
      * Provides additional information about game session status. INTERRUPTED indicates that the game session was hosted on a spot instance that was reclaimed, causing the active game session to be terminated.
      */
    var StatusReason: js.UndefOr[GameSessionStatusReason] = js.undefined
    /**
      * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var TerminationTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait GameSessionConnectionInfo extends js.Object {
    /**
      * Amazon Resource Name (ARN) that is assigned to a game session and uniquely identifies it.
      */
    var GameSessionArn: js.UndefOr[ArnStringModel] = js.undefined
    /**
      * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
      */
    var IpAddress: js.UndefOr[StringModel] = js.undefined
    /**
      * Collection of player session IDs, one for each player ID that was included in the original matchmaking request. 
      */
    var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList] = js.undefined
    /**
      * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
      */
    var Port: js.UndefOr[PositiveInteger] = js.undefined
  }
  
  trait GameSessionDetail extends js.Object {
    /**
      * Object that describes a game session.
      */
    var GameSession: js.UndefOr[GameSession] = js.undefined
    /**
      * Current status of protection for the game session.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
      */
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
  }
  
  trait GameSessionPlacement extends js.Object {
    /**
      * Time stamp indicating when this request was completed, canceled, or timed out.
      */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
      */
    var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
    /**
      * Identifier for the game session created by this placement request. This value is set once the new game session is placed (placement status is FULFILLED). This identifier is unique across all regions. You can use this value as a GameSessionId value as needed.
      */
    var GameSessionArn: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
      */
    var GameSessionData: js.UndefOr[GameSessionData] = js.undefined
    /**
      * Unique identifier for the game session. This value is set once the new game session is placed (placement status is FULFILLED).
      */
    var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Descriptive label that is associated with a game session. Session names do not need to be unique.
      */
    var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
      */
    var GameSessionQueueName: js.UndefOr[GameSessionQueueName] = js.undefined
    /**
      * Name of the region where the game session created by this placement request is running. This value is set once the new game session is placed (placement status is FULFILLED).
      */
    var GameSessionRegion: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number. This value is set once the new game session is placed (placement status is FULFILLED). 
      */
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * Information on the matchmaking process for this game. Data is in JSON syntax, formatted as a string. It identifies the matchmaking configuration used to create the match, and contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data.
      */
    var MatchmakerData: js.UndefOr[MatchmakerData] = js.undefined
    /**
      * Maximum number of players that can be connected simultaneously to the game session.
      */
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Collection of information on player sessions created in response to the game session placement request. These player sessions are created only once a new game session is successfully placed (placement status is FULFILLED). This information includes the player ID (as provided in the placement request) and the corresponding player session ID. Retrieve full player sessions by calling DescribePlayerSessions with the player session ID.
      */
    var PlacedPlayerSessions: js.UndefOr[PlacedPlayerSessionList] = js.undefined
    /**
      * Unique identifier for a game session placement.
      */
    var PlacementId: js.UndefOr[IdStringModel] = js.undefined
    /**
      * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS regions.
      */
    var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined
    /**
      * Port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number. This value is set once the new game session is placed (placement status is FULFILLED).
      */
    var Port: js.UndefOr[PortNumber] = js.undefined
    /**
      * Time stamp indicating when this request was placed in the queue. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Current status of the game session placement request.    PENDING -- The placement request is currently in the queue waiting to be processed.    FULFILLED -- A new game session and player sessions (if requested) have been successfully created. Values for GameSessionArn and GameSessionRegion are available.     CANCELLED -- The placement request was canceled with a call to StopGameSessionPlacement.    TIMED_OUT -- A new game session was not successfully created before the time limit expired. You can resubmit the placement request as needed.  
      */
    var Status: js.UndefOr[GameSessionPlacementState] = js.undefined
  }
  
  trait GameSessionQueue extends js.Object {
    /**
      * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order.
      */
    var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined
    /**
      * Amazon Resource Name (ARN) that is assigned to a game session queue and uniquely identifies it. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912.
      */
    var GameSessionQueueArn: js.UndefOr[ArnStringModel] = js.undefined
    /**
      * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
      */
    var Name: js.UndefOr[GameSessionQueueName] = js.undefined
    /**
      * Collection of latency policies to apply when processing game sessions placement requests with player latency information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest latency values. With just one policy, it is enforced at the start of the game session placement for the duration period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of the placement. 
      */
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined
    /**
      * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
      */
    var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait GameSessionQueueDestination extends js.Object {
    /**
      * Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a region name, provide a unique identifier across all regions. 
      */
    var DestinationArn: js.UndefOr[ArnStringModel] = js.undefined
  }
  
  trait GetGameSessionLogUrlInput extends js.Object {
    /**
      * Unique identifier for the game session to get logs for.
      */
    var GameSessionId: ArnStringModel
  }
  
  trait GetGameSessionLogUrlOutput extends js.Object {
    /**
      * Location of the requested game session logs, available for download. This URL is valid for 15 minutes, after which S3 will reject any download request using this URL. You can request a new URL any time within the 14-day period that the logs are retained.
      */
    var PreSignedUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait GetInstanceAccessInput extends js.Object {
    /**
      * Unique identifier for a fleet that contains the instance you want access to. The fleet can be in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status may be accessible for a short time before they are deleted.
      */
    var FleetId: FleetId
    /**
      * Unique identifier for an instance you want to get access to. You can access an instance in any status.
      */
    var InstanceId: InstanceId
  }
  
  trait GetInstanceAccessOutput extends js.Object {
    /**
      * Object that contains connection information for a fleet instance, including IP address and access credentials.
      */
    var InstanceAccess: js.UndefOr[InstanceAccess] = js.undefined
  }
  
  trait Instance extends js.Object {
    /**
      * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Unique identifier for a fleet that the instance is in.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Unique identifier for an instance.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * IP address assigned to the instance.
      */
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * Operating system that is running on this instance. 
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    /**
      * Current status of the instance. Possible statuses include the following:    PENDING -- The instance is in the process of being created and launching server processes as defined in the fleet's run-time configuration.     ACTIVE -- The instance has been successfully created and at least one server process has successfully launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now considered ready to host game sessions.     TERMINATING -- The instance is in the process of shutting down. This may happen to reduce capacity during a scaling down event or to recycle resources in the event of a problem.  
      */
    var Status: js.UndefOr[InstanceStatus] = js.undefined
    /**
      * EC2 instance type that defines the computing resources of this instance. 
      */
    var Type: js.UndefOr[EC2InstanceType] = js.undefined
  }
  
  trait InstanceAccess extends js.Object {
    /**
      * Credentials required to access the instance.
      */
    var Credentials: js.UndefOr[InstanceCredentials] = js.undefined
    /**
      * Unique identifier for a fleet containing the instance being accessed.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Unique identifier for an instance being accessed.
      */
    var InstanceId: js.UndefOr[InstanceId] = js.undefined
    /**
      * IP address assigned to the instance.
      */
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * Operating system that is running on the instance.
      */
    var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  }
  
  trait InstanceCredentials extends js.Object {
    /**
      * Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For Linux instances, it is a private key (which must be saved as a .pem file) for use with SSH.
      */
    var Secret: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * User login string.
      */
    var UserName: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait IpPermission extends js.Object {
    /**
      * Starting value for a range of allowed port numbers.
      */
    var FromPort: PortNumber
    /**
      * Range of allowed IP addresses. This value must be expressed in CIDR notation. Example: "000.000.000.000/[subnet mask]" or optionally the shortened version "0.0.0.0/[subnet mask]".
      */
    var IpRange: NonBlankString
    /**
      * Network communication protocol used by the fleet.
      */
    var Protocol: IpProtocol
    /**
      * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
      */
    var ToPort: PortNumber
  }
  
  trait LatencyMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[PositiveInteger]
  
  trait ListAliasesInput extends js.Object {
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Descriptive label that is associated with an alias. Alias names do not need to be unique.
      */
    var Name: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Type of routing to filter results on. Use this parameter to retrieve only aliases of a certain type. To retrieve all aliases, leave this parameter empty. Possible routing types include the following:    SIMPLE -- The alias resolves to one specific fleet. Use this type when routing to active fleets.    TERMINAL -- The alias does not resolve to a fleet but instead can be used to display a message to the user. A terminal alias throws a TerminalRoutingStrategyException with the RoutingStrategy message embedded.  
      */
    var RoutingStrategyType: js.UndefOr[RoutingStrategyType] = js.undefined
  }
  
  trait ListAliasesOutput extends js.Object {
    /**
      * Collection of alias records that match the list request.
      */
    var Aliases: js.UndefOr[AliasList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait ListBuildsInput extends js.Object {
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Build status to filter results by. To retrieve all builds, leave this parameter empty. Possible build statuses include the following:    INITIALIZED -- A new build has been defined, but no files have been uploaded. You cannot create fleets for builds that are in this status. When a build is successfully created, the build status is set to this value.     READY -- The game build has been successfully uploaded. You can now create new fleets for this build.    FAILED -- The game build upload failed. You cannot create new fleets for this build.   
      */
    var Status: js.UndefOr[BuildStatus] = js.undefined
  }
  
  trait ListBuildsOutput extends js.Object {
    /**
      * Collection of build records that match the request.
      */
    var Builds: js.UndefOr[BuildList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait ListFleetsInput extends js.Object {
    /**
      * Unique identifier for a build to return fleets for. Use this parameter to return only fleets using the specified build. To retrieve all fleets, leave this parameter empty.
      */
    var BuildId: js.UndefOr[BuildId] = js.undefined
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait ListFleetsOutput extends js.Object {
    /**
      * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by passing this result set to a call to DescribeFleetAttributes, DescribeFleetCapacity, or DescribeFleetUtilization.
      */
    var FleetIds: js.UndefOr[FleetIdList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait MatchedPlayerSession extends js.Object {
    /**
      * Unique identifier for a player 
      */
    var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a player session
      */
    var PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined
  }
  
  trait MatchmakingConfiguration extends js.Object {
    /**
      * Flag that determines whether or not a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
      */
    var AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined
    /**
      * Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
      */
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined
    /**
      * Number of player slots in a match to keep open for future players. For example, if the configuration's rule set specifies a match for a single 12-person team, and the additional player count is set to 2, only 10 players are selected for the match.
      */
    var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Information to attached to all events related to the matchmaking configuration. 
      */
    var CustomEventData: js.UndefOr[CustomEventData] = js.undefined
    /**
      * Descriptive label that is associated with matchmaking configuration.
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
      * Amazon Resource Name (ARN) that is assigned to a game session queue and uniquely identifies it. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912. These queues are used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any region.
      */
    var GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined
    /**
      * Unique identifier for a matchmaking configuration. This name is used to identify the configuration associated with a matchmaking request or ticket.
      */
    var Name: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    /**
      * SNS topic ARN that is set up to receive matchmaking notifications.
      */
    var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined
    /**
      * Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that time out can be resubmitted as needed.
      */
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined
    /**
      * Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only use rule sets that are defined in the same region.
      */
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
  }
  
  trait MatchmakingRuleSet extends js.Object {
    /**
      * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Collection of matchmaking rules, formatted as a JSON string. (Note that comments14 are not allowed in JSON, but most elements support a description field.)
      */
    var RuleSetBody: RuleSetBody
    /**
      * Unique identifier for a matchmaking rule set
      */
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
  }
  
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
      * Current status of the matchmaking request.    QUEUED -- The matchmaking request has been received and is currently waiting to be processed.    SEARCHING -- The matchmaking request is currently being processed.     REQUIRES_ACCEPTANCE -- A match has been proposed and the players must accept the match (see AcceptMatch). This status is used only with requests that use a matchmaking configuration with a player acceptance requirement.    PLACING -- The FlexMatch engine has matched players and is in the process of placing a new game session for the match.    COMPLETED -- Players have been matched and a game session is ready to host the players. A ticket in this state contains the necessary connection information for players.    FAILED -- The matchmaking request was not completed. Tickets with players who fail to accept a proposed match are placed in FAILED status.    CANCELLED -- The matchmaking request was canceled with a call to StopMatchmaking.    TIMED_OUT -- The matchmaking request was not successful within the duration specified in the matchmaking configuration.     Matchmaking requests that fail to successfully complete (statuses FAILED, CANCELLED, TIMED_OUT) can be resubmitted as new requests with new ticket IDs. 
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
  
  trait PlacedPlayerSession extends js.Object {
    /**
      * Unique identifier for a player that is associated with this player session.
      */
    var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a player session.
      */
    var PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined
  }
  
  trait Player extends js.Object {
    /**
      * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS regions. If this property is present, FlexMatch considers placing the match only in regions for which latency is reported.  If a matchmaker has a rule that evaluates player latency, players must report latency in order to be matched. If no latency is reported in this scenario, FlexMatch assumes that no regions are available to the player and the ticket is not matchable. 
      */
    var LatencyInMs: js.UndefOr[LatencyMap] = js.undefined
    /**
      * Collection of key:value pairs containing player information for use in matchmaking. Player attribute keys must match the playerAttributes used in a matchmaking rule set. Example: "PlayerAttributes": {"skill": {"N": "23"}, "gameMode": {"S": "deathmatch"}}.
      */
    var PlayerAttributes: js.UndefOr[PlayerAttributeMap] = js.undefined
    /**
      * Unique identifier for a player
      */
    var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Name of the team that the player is assigned to in a match. Team names are defined in a matchmaking rule set.
      */
    var Team: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait PlayerAttributeMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[AttributeValue]
  
  trait PlayerDataMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[PlayerData]
  
  trait PlayerLatency extends js.Object {
    /**
      * Amount of time that represents the time lag experienced by the player when connected to the specified region.
      */
    var LatencyInMilliseconds: js.UndefOr[Float] = js.undefined
    /**
      * Unique identifier for a player associated with the latency data.
      */
    var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Name of the region that is associated with the latency value.
      */
    var RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait PlayerLatencyPolicy extends js.Object {
    /**
      * The maximum latency value that is allowed for any player, in milliseconds. All policies must have a value set for this property.
      */
    var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.undefined
    /**
      * The length of time, in seconds, that the policy is enforced while placing a new game session. A null value for this property means that the policy is enforced until the queue times out.
      */
    var PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait PlayerSession extends js.Object {
    /**
      * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Unique identifier for a fleet that the player's game session is running on.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Unique identifier for the game session that the player session is connected to.
      */
    var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
      */
    var IpAddress: js.UndefOr[IpAddress] = js.undefined
    /**
      * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game. 
      */
    var PlayerData: js.UndefOr[PlayerData] = js.undefined
    /**
      * Unique identifier for a player that is associated with this player session.
      */
    var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a player session.
      */
    var PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined
    /**
      * Port number for the game session. To connect to a Amazon GameLift server process, an app needs both the IP address and port number.
      */
    var Port: js.UndefOr[PortNumber] = js.undefined
    /**
      * Current status of the player session. Possible player session statuses include the following:    RESERVED -- The player session request has been received, but the player has not yet connected to the server process and/or been validated.     ACTIVE -- The player has been validated by the server process and is currently connected.    COMPLETED -- The player connection has been dropped.    TIMEDOUT -- A player session request was received, but the player did not connect and/or was not validated within the timeout limit (60 seconds).  
      */
    var Status: js.UndefOr[PlayerSessionStatus] = js.undefined
    /**
      * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var TerminationTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  trait PutScalingPolicyInput extends js.Object {
    /**
      * Comparison operator to use when measuring the metric against the threshold value.
      */
    var ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.undefined
    /**
      * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
      */
    var EvaluationPeriods: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Unique identifier for a fleet to apply this policy to. The fleet cannot be in any of the following statuses: ERROR or DELETING.
      */
    var FleetId: FleetId
    /**
      * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed descriptions of fleet metrics, see Monitor Amazon GameLift with Amazon CloudWatch.     ActivatingGameSessions -- Game sessions in the process of being created.    ActiveGameSessions -- Game sessions that are currently running.    ActiveInstances -- Fleet instances that are currently running at least one game session.    AvailableGameSessions -- Additional game sessions that fleet could host simultaneously, given current capacity.    AvailablePlayerSessions -- Empty player slots in currently active game sessions. This includes game sessions that are not currently accepting players. Reserved player slots are not included.    CurrentPlayerSessions -- Player slots in active game sessions that are being used by a player or are reserved for a player.     IdleInstances -- Active instances that are currently hosting zero game sessions.     PercentAvailableGameSessions -- Unused percentage of the total number of game sessions that a fleet could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.    PercentIdleInstances -- Percentage of the total number of active instances that are hosting zero game sessions.    QueueDepth -- Pending game session placement requests, in any queue, where the current fleet is the top-priority destination.    WaitTime -- Current wait time for pending game session placement requests, in any queue, where the current fleet is the top-priority destination.   
      */
    var MetricName: MetricName
    /**
      * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet can have only one scaling policy with the same name.
      */
    var Name: NonZeroAndMaxString
    /**
      * Type of scaling policy to create. For a target-based policy, set the parameter MetricName to 'PercentAvailableGameSessions' and specify a TargetConfiguration. For a rule-based policy set the following parameters: MetricName, ComparisonOperator, Threshold, EvaluationPeriods, ScalingAdjustmentType, and ScalingAdjustment.
      */
    var PolicyType: js.UndefOr[PolicyType] = js.undefined
    /**
      * Amount of adjustment to make, based on the scaling adjustment type.
      */
    var ScalingAdjustment: js.UndefOr[Integer] = js.undefined
    /**
      * Type of adjustment to make to a fleet's instance count (see FleetCapacity):    ChangeInCapacity -- add (or subtract) the scaling adjustment value from the current instance count. Positive values scale up while negative values scale down.    ExactCapacity -- set the instance count to the scaling adjustment value.    PercentChangeInCapacity -- increase or reduce the current instance count by the scaling adjustment, read as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the fleet down by 10%.  
      */
    var ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType] = js.undefined
    /**
      * Object that contains settings for a target-based scaling policy.
      */
    var TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined
    /**
      * Metric value used to trigger a scaling event.
      */
    var Threshold: js.UndefOr[Double] = js.undefined
  }
  
  trait PutScalingPolicyOutput extends js.Object {
    /**
      * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait RequestUploadCredentialsInput extends js.Object {
    /**
      * Unique identifier for a build to get credentials for.
      */
    var BuildId: BuildId
  }
  
  trait RequestUploadCredentialsOutput extends js.Object {
    /**
      * Amazon S3 path and key, identifying where the game build files are stored.
      */
    var StorageLocation: js.UndefOr[S3Location] = js.undefined
    /**
      * AWS credentials required when uploading a game build to the storage location. These credentials have a limited lifespan and are valid only for the build they were issued for.
      */
    var UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
  }
  
  trait ResolveAliasInput extends js.Object {
    /**
      * Unique identifier for the alias you want to resolve.
      */
    var AliasId: AliasId
  }
  
  trait ResolveAliasOutput extends js.Object {
    /**
      * Fleet identifier that is associated with the requested alias.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
  }
  
  trait ResourceCreationLimitPolicy extends js.Object {
    /**
      * Maximum number of game sessions that an individual can create during the policy period. 
      */
    var NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Time span used in evaluating the resource creation limit policy. 
      */
    var PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait RoutingStrategy extends js.Object {
    /**
      * Unique identifier for a fleet that the alias points to.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Message text to be used with a terminal routing strategy.
      */
    var Message: js.UndefOr[FreeText] = js.undefined
    /**
      * Type of routing strategy. Possible routing types include the following:    SIMPLE -- The alias resolves to one specific fleet. Use this type when routing to active fleets.    TERMINAL -- The alias does not resolve to a fleet but instead can be used to display a message to the user. A terminal alias throws a TerminalRoutingStrategyException with the RoutingStrategy message embedded.  
      */
    var Type: js.UndefOr[RoutingStrategyType] = js.undefined
  }
  
  trait RuntimeConfiguration extends js.Object {
    /**
      * Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
      */
    var GameSessionActivationTimeoutSeconds: js.UndefOr[GameSessionActivationTimeoutSeconds] = js.undefined
    /**
      * Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting limits the amount of instance resources that can be used for new game activations at any one time.
      */
    var MaxConcurrentGameSessionActivations: js.UndefOr[MaxConcurrentGameSessionActivations] = js.undefined
    /**
      * Collection of server process configurations that describe which server processes to run on each instance in a fleet.
      */
    var ServerProcesses: js.UndefOr[ServerProcessList] = js.undefined
  }
  
  trait S3Location extends js.Object {
    /**
      * Amazon S3 bucket identifier. This is the name of your S3 bucket.
      */
    var Bucket: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Name of the zip file containing your build files. 
      */
    var Key: js.UndefOr[NonEmptyString] = js.undefined
    /**
      * Amazon Resource Name (ARN) for the access role that allows Amazon GameLift to access your S3 bucket.
      */
    var RoleArn: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait ScalingPolicy extends js.Object {
    /**
      * Comparison operator to use when measuring a metric against the threshold value.
      */
    var ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.undefined
    /**
      * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
      */
    var EvaluationPeriods: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Unique identifier for a fleet that is associated with this scaling policy.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed descriptions of fleet metrics, see Monitor Amazon GameLift with Amazon CloudWatch.     ActivatingGameSessions -- Game sessions in the process of being created.    ActiveGameSessions -- Game sessions that are currently running.    ActiveInstances -- Fleet instances that are currently running at least one game session.    AvailableGameSessions -- Additional game sessions that fleet could host simultaneously, given current capacity.    AvailablePlayerSessions -- Empty player slots in currently active game sessions. This includes game sessions that are not currently accepting players. Reserved player slots are not included.    CurrentPlayerSessions -- Player slots in active game sessions that are being used by a player or are reserved for a player.     IdleInstances -- Active instances that are currently hosting zero game sessions.     PercentAvailableGameSessions -- Unused percentage of the total number of game sessions that a fleet could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.    PercentIdleInstances -- Percentage of the total number of active instances that are hosting zero game sessions.    QueueDepth -- Pending game session placement requests, in any queue, where the current fleet is the top-priority destination.    WaitTime -- Current wait time for pending game session placement requests, in any queue, where the current fleet is the top-priority destination.   
      */
    var MetricName: js.UndefOr[MetricName] = js.undefined
    /**
      * Descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Type of scaling policy to create. For a target-based policy, set the parameter MetricName to 'PercentAvailableGameSessions' and specify a TargetConfiguration. For a rule-based policy set the following parameters: MetricName, ComparisonOperator, Threshold, EvaluationPeriods, ScalingAdjustmentType, and ScalingAdjustment.
      */
    var PolicyType: js.UndefOr[PolicyType] = js.undefined
    /**
      * Amount of adjustment to make, based on the scaling adjustment type.
      */
    var ScalingAdjustment: js.UndefOr[Integer] = js.undefined
    /**
      * Type of adjustment to make to a fleet's instance count (see FleetCapacity):    ChangeInCapacity -- add (or subtract) the scaling adjustment value from the current instance count. Positive values scale up while negative values scale down.    ExactCapacity -- set the instance count to the scaling adjustment value.    PercentChangeInCapacity -- increase or reduce the current instance count by the scaling adjustment, read as a percentage. Positive values scale up while negative values scale down.  
      */
    var ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType] = js.undefined
    /**
      * Current status of the scaling policy. The scaling policy can be in force only when in an ACTIVE status. Scaling policies can be suspended for individual fleets (see StopFleetActions; if suspended for a fleet, the policy status does not change. View a fleet's stopped actions by calling DescribeFleetCapacity.    ACTIVE -- The scaling policy can be used for auto-scaling a fleet.    UPDATE_REQUESTED -- A request to update the scaling policy has been received.    UPDATING -- A change is being made to the scaling policy.    DELETE_REQUESTED -- A request to delete the scaling policy has been received.    DELETING -- The scaling policy is being deleted.    DELETED -- The scaling policy has been deleted.    ERROR -- An error occurred in creating the policy. It should be removed and recreated.  
      */
    var Status: js.UndefOr[ScalingStatusType] = js.undefined
    /**
      * Object that contains settings for a target-based scaling policy.
      */
    var TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined
    /**
      * Metric value used to trigger a scaling event.
      */
    var Threshold: js.UndefOr[Double] = js.undefined
  }
  
  trait SearchGameSessionsInput extends js.Object {
    /**
      * Unique identifier for an alias associated with the fleet to search for active game sessions. Each request must reference either a fleet ID or alias ID, but not both.
      */
    var AliasId: js.UndefOr[AliasId] = js.undefined
    /**
      * String containing the search criteria for the session search. If no filter expression is included, the request returns results for all game sessions in the fleet that are in ACTIVE status. A filter expression can contain one or multiple conditions. Each condition consists of the following:    Operand -- Name of a game session attribute. Valid values are gameSessionName, gameSessionId, gameSessionProperties, maximumSessions, creationTimeMillis, playerSessionCount, hasAvailablePlayerSessions.    Comparator -- Valid comparators are: =, &lt;&gt;, &lt;, &gt;, &lt;=, &gt;=.     Value -- Value to be searched for. Values may be numbers, boolean values (true/false) or strings depending on the operand. String values are case sensitive and must be enclosed in single quotes. Special characters must be escaped. Boolean and string values can only be used with the comparators = and &lt;&gt;. For example, the following filter expression searches on gameSessionName: "FilterExpression": "gameSessionName = 'Matt\\'s Awesome Game 1'".    To chain multiple conditions in a single expression, use the logical keywords AND, OR, and NOT and parentheses as needed. For example: x AND y AND NOT z, NOT (x OR y). Session search evaluates conditions from left to right using the following precedence rules:    =, &lt;&gt;, &lt;, &gt;, &lt;=, &gt;=    Parentheses   NOT   AND   OR   For example, this filter expression retrieves game sessions hosting at least ten players that have an open player slot: "maximumSessions&gt;=10 AND hasAvailablePlayerSessions=true". 
      */
    var FilterExpression: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a fleet to search for active game sessions. Each request must reference either a fleet ID or alias ID, but not both.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. The maximum number of results returned is 20, even if this value is not set or is set higher than 20. 
      */
    var Limit: js.UndefOr[PositiveInteger] = js.undefined
    /**
      * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Instructions on how to sort the search results. If no sort expression is included, the request returns results in random order. A sort expression consists of the following elements:    Operand -- Name of a game session attribute. Valid values are gameSessionName, gameSessionId, gameSessionProperties, maximumSessions, creationTimeMillis, playerSessionCount, hasAvailablePlayerSessions.    Order -- Valid sort orders are ASC (ascending) and DESC (descending).   For example, this sort expression returns the oldest active sessions first: "SortExpression": "creationTimeMillis ASC". Results with a null value for the sort operand are returned at the end of the list.
      */
    var SortExpression: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait SearchGameSessionsOutput extends js.Object {
    /**
      * Collection of objects containing game session properties for each session matching the request.
      */
    var GameSessions: js.UndefOr[GameSessionList] = js.undefined
    /**
      * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
      */
    var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait ServerProcess extends js.Object {
    /**
      * Number of server processes using this configuration to run concurrently on an instance.
      */
    var ConcurrentExecutions: PositiveInteger
    /**
      * Location of the server executable in a game build. All game builds are installed on instances at the root : for Windows instances C:\game, and for Linux instances /local/game. A Windows game build with an executable file located at MyGame\latest\server.exe must have a launch path of "C:\game\MyGame\latest\server.exe". A Linux game build with an executable file located at MyGame/latest/server.exe must have a launch path of "/local/game/MyGame/latest/server.exe". 
      */
    var LaunchPath: NonZeroAndMaxString
    /**
      * Optional list of parameters to pass to the server executable on launch.
      */
    var Parameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait StartFleetActionsInput extends js.Object {
    /**
      * List of actions to restart on the fleet.
      */
    var Actions: FleetActionList
    /**
      * Unique identifier for a fleet
      */
    var FleetId: FleetId
  }
  
  trait StartFleetActionsOutput extends js.Object
  
  trait StartGameSessionPlacementInput extends js.Object {
    /**
      * Set of information on each player to create a player session for.
      */
    var DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList] = js.undefined
    /**
      * Set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
      */
    var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
    /**
      * Set of custom game session properties, formatted as a single string value. This data is passed to a game server process in the GameSession object with a request to start a new game session (see Start a Game Session).
      */
    var GameSessionData: js.UndefOr[GameSessionData] = js.undefined
    /**
      * Descriptive label that is associated with a game session. Session names do not need to be unique.
      */
    var GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Name of the queue to use to place the new game session.
      */
    var GameSessionQueueName: GameSessionQueueName
    /**
      * Maximum number of players that can be connected simultaneously to the game session.
      */
    var MaximumPlayerSessionCount: WholeNumber
    /**
      * Unique identifier to assign to the new game session placement. This value is developer-defined. The value must be unique across all regions and cannot be reused unless you are resubmitting a canceled or timed-out placement request.
      */
    var PlacementId: IdStringModel
    /**
      * Set of values, expressed in milliseconds, indicating the amount of latency that a player experiences when connected to AWS regions. This information is used to try to place the new game session where it can offer the best possible gameplay experience for the players. 
      */
    var PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined
  }
  
  trait StartGameSessionPlacementOutput extends js.Object {
    /**
      * Object that describes the newly created game session placement. This object includes all the information provided in the request, as well as start/end time stamps and placement status. 
      */
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
  }
  
  trait StartMatchBackfillInput extends js.Object {
    /**
      * Name of the matchmaker to use for this request. The name of the matchmaker that was used with the original game session is listed in the GameSession object, MatchmakerData property. This property contains a matchmaking configuration ARN value, which includes the matchmaker name. (In the ARN value "arn:aws:gamelift:us-west-2:111122223333:matchmakingconfiguration/MM-4v4", the matchmaking configuration name is "MM-4v4".) Use only the name for this parameter.
      */
    var ConfigurationName: MatchmakingIdStringModel
    /**
      * Amazon Resource Name (ARN) that is assigned to a game session and uniquely identifies it. 
      */
    var GameSessionArn: ArnStringModel
    /**
      * Match information on all players that are currently assigned to the game session. This information is used by the matchmaker to find new players and add them to the existing game.   PlayerID, PlayerAttributes, Team -\\- This information is maintained in the GameSession object, MatchmakerData property, for all players who are currently assigned to the game session. The matchmaker data is in JSON syntax, formatted as a string. For more details, see  Match Data.    LatencyInMs -\\- If the matchmaker uses player latency, include a latency value, in milliseconds, for the region that the game session is currently in. Do not include latency values for any other region.  
      */
    var Players: PlayerList
    /**
      * Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the match backfill ticket status and retrieve match results.
      */
    var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
  }
  
  trait StartMatchBackfillOutput extends js.Object {
    /**
      * Ticket representing the backfill matchmaking request. This object includes the information in the request, ticket status, and match results as generated during the matchmaking process.
      */
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined
  }
  
  trait StartMatchmakingInput extends js.Object {
    /**
      * Name of the matchmaking configuration to use for this request. Matchmaking configurations must exist in the same region as this request.
      */
    var ConfigurationName: MatchmakingIdStringModel
    /**
      * Information on each player to be matched. This information must include a player ID, and may contain player attributes and latency data to be used in the matchmaking process. After a successful match, Player objects contain the name of the team the player is assigned to.
      */
    var Players: PlayerList
    /**
      * Unique identifier for a matchmaking ticket. If no ticket ID is specified here, Amazon GameLift will generate one in the form of a UUID. Use this identifier to track the matchmaking ticket status and retrieve match results.
      */
    var TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
  }
  
  trait StartMatchmakingOutput extends js.Object {
    /**
      * Ticket representing the matchmaking request. This object include the information included in the request, ticket status, and match results as generated during the matchmaking process.
      */
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined
  }
  
  trait StopFleetActionsInput extends js.Object {
    /**
      * List of actions to suspend on the fleet. 
      */
    var Actions: FleetActionList
    /**
      * Unique identifier for a fleet
      */
    var FleetId: FleetId
  }
  
  trait StopFleetActionsOutput extends js.Object
  
  trait StopGameSessionPlacementInput extends js.Object {
    /**
      * Unique identifier for a game session placement to cancel.
      */
    var PlacementId: IdStringModel
  }
  
  trait StopGameSessionPlacementOutput extends js.Object {
    /**
      * Object that describes the canceled game session placement, with CANCELLED status and an end time stamp. 
      */
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
  }
  
  trait StopMatchmakingInput extends js.Object {
    /**
      * Unique identifier for a matchmaking ticket.
      */
    var TicketId: MatchmakingIdStringModel
  }
  
  trait StopMatchmakingOutput extends js.Object
  
  trait StringDoubleMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[DoubleObject]
  
  trait TargetConfiguration extends js.Object {
    /**
      * Desired value to use with a target-based scaling policy. The value must be relevant for whatever metric the scaling policy is using. For example, in a policy using the metric PercentAvailableGameSessions, the target value should be the preferred size of the fleet's buffer (the percent of capacity that should be idle and ready for new game sessions).
      */
    var TargetValue: Double
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may require player acceptance; if so, then matches built with that configuration cannot be completed unless all players accept the proposed match within a specified time limit.  When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status REQUIRES_ACCEPTANCE. This is a trigger for your game to get acceptance from all players in the ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an error. To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have registered acceptance, the matchmaking tickets advance to status PLACING, where a new game session is created for the match.  If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where all players accepted the match, the ticket status is returned to SEARCHING to find a new match. For tickets where one or more players failed to accept the match, the ticket status is set to FAILED, and processing is terminated. A new matchmaking request for these players can be submitted as needed.     StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def acceptMatch(): awsDashSdkLib.libRequestMod.Request[AcceptMatchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptMatch(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptMatchOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptMatchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may require player acceptance; if so, then matches built with that configuration cannot be completed unless all players accept the proposed match within a specified time limit.  When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status REQUIRES_ACCEPTANCE. This is a trigger for your game to get acceptance from all players in the ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an error. To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have registered acceptance, the matchmaking tickets advance to status PLACING, where a new game session is created for the match.  If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where all players accepted the match, the ticket status is returned to SEARCHING to find a new match. For tickets where one or more players failed to accept the match, the ticket status is set to FAILED, and processing is terminated. A new matchmaking request for these players can be submitted as needed.     StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def acceptMatch(params: AcceptMatchInput): awsDashSdkLib.libRequestMod.Request[AcceptMatchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def acceptMatch(
      params: AcceptMatchInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AcceptMatchOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AcceptMatchOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. By using a fleet alias instead of a specific fleet ID, you can switch gameplay and players to a new fleet without changing your game client or other game components. For example, for games in production, using an alias allows you to seamlessly redirect your player base to a new game server update.  Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you want to direct players to an upgrade site.  To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned, including an alias ID, which you can reference when creating a game session. You can reassign an alias to another fleet by calling UpdateAlias.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def createAlias(): awsDashSdkLib.libRequestMod.Request[CreateAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAliasOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. By using a fleet alias instead of a specific fleet ID, you can switch gameplay and players to a new fleet without changing your game client or other game components. For example, for games in production, using an alias allows you to seamlessly redirect your player base to a new game server update.  Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you want to direct players to an upgrade site.  To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned, including an alias ID, which you can reference when creating a game session. You can reassign an alias to another fleet by calling UpdateAlias.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def createAlias(params: CreateAliasInput): awsDashSdkLib.libRequestMod.Request[CreateAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAlias(
      params: CreateAliasInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAliasOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon GameLift build record for your game server binary files and points to the location of your game server build files in an Amazon Simple Storage Service (Amazon S3) location.  Game server binaries must be combined into a .zip file for use with Amazon GameLift. See Uploading Your Game for more information.   To create new builds quickly and easily, use the AWS CLI command  upload-build . This helper command uploads your build and creates a new build record in one step, and automatically handles the necessary permissions. See  Upload Build Files to Amazon GameLift for more help.  The CreateBuild operation should be used only when you need to manually upload your build files, as in the following scenarios:   Store a build file in an Amazon S3 bucket under your own AWS account. To use this option, you must first give Amazon GameLift access to that Amazon S3 bucket. See  Create a Build with Files in Amazon S3 for detailed help. To create a new build record using files in your Amazon S3 bucket, call CreateBuild and specify a build name, operating system, and the storage location of your game build.   Upload a build file directly to Amazon GameLift's Amazon S3 account. To use this option, you first call CreateBuild with a build name and operating system. This action creates a new build record and returns an Amazon S3 storage location (bucket and key only) and temporary access credentials. Use the credentials to manually upload your build file to the storage location (see the Amazon S3 topic Uploading Objects). You can upload files to a location only once.    If successful, this operation creates a new build record with a unique build ID and places it in INITIALIZED status. You can use DescribeBuild to check the status of your build. A build must be in READY status before it can be used to create fleets.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def createBuild(): awsDashSdkLib.libRequestMod.Request[CreateBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBuild(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBuildOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new Amazon GameLift build record for your game server binary files and points to the location of your game server build files in an Amazon Simple Storage Service (Amazon S3) location.  Game server binaries must be combined into a .zip file for use with Amazon GameLift. See Uploading Your Game for more information.   To create new builds quickly and easily, use the AWS CLI command  upload-build . This helper command uploads your build and creates a new build record in one step, and automatically handles the necessary permissions. See  Upload Build Files to Amazon GameLift for more help.  The CreateBuild operation should be used only when you need to manually upload your build files, as in the following scenarios:   Store a build file in an Amazon S3 bucket under your own AWS account. To use this option, you must first give Amazon GameLift access to that Amazon S3 bucket. See  Create a Build with Files in Amazon S3 for detailed help. To create a new build record using files in your Amazon S3 bucket, call CreateBuild and specify a build name, operating system, and the storage location of your game build.   Upload a build file directly to Amazon GameLift's Amazon S3 account. To use this option, you first call CreateBuild with a build name and operating system. This action creates a new build record and returns an Amazon S3 storage location (bucket and key only) and temporary access credentials. Use the credentials to manually upload your build file to the storage location (see the Amazon S3 topic Uploading Objects). You can upload files to a location only once.    If successful, this operation creates a new build record with a unique build ID and places it in INITIALIZED status. You can use DescribeBuild to check the status of your build. A build must be in READY status before it can be used to create fleets.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def createBuild(params: CreateBuildInput): awsDashSdkLib.libRequestMod.Request[CreateBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBuild(
      params: CreateBuildInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBuildOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new fleet to run your game servers. A fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances, each of which can run multiple server processes to host game sessions. You set up a fleet to use instances with certain hardware specifications (see Amazon EC2 Instance Types), and deploy your game build to the fleet.  To create a new fleet, you must provide the following: (1) a fleet name, (2) an EC2 instance type, (3) the build ID for your game build, and (4) a run-time configuration, which specifies the server processes to run on each instance in the fleet. If fleet type is not set, the new fleet will use on-demand instances by default. If the CreateFleet call is successful, Amazon GameLift performs the following tasks. You can track the process of a fleet by checking the fleet status or by monitoring fleet creation events:   Creates a fleet record. Status: NEW.   Begins writing events to the fleet event log, which can be accessed in the Amazon GameLift console. Sets the fleet's target capacity to 1 (desired instances), which triggers Amazon GameLift to start one new EC2 instance.   Downloads the game build to the new instance and installs it. Statuses: DOWNLOADING, VALIDATING, BUILDING.    Starts launching server processes on the instance. If the fleet is configured to run multiple server processes per instance, Amazon GameLift staggers each launch by a few seconds. Status: ACTIVATING.   Sets the fleet's status to ACTIVE as soon as one server process is ready to host a game session.    Learn more  See Amazon GameLift Developer Guide topics in  Working with Fleets.  Related operations     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def createFleet(): awsDashSdkLib.libRequestMod.Request[CreateFleetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFleetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFleetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new fleet to run your game servers. A fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances, each of which can run multiple server processes to host game sessions. You set up a fleet to use instances with certain hardware specifications (see Amazon EC2 Instance Types), and deploy your game build to the fleet.  To create a new fleet, you must provide the following: (1) a fleet name, (2) an EC2 instance type, (3) the build ID for your game build, and (4) a run-time configuration, which specifies the server processes to run on each instance in the fleet. If fleet type is not set, the new fleet will use on-demand instances by default. If the CreateFleet call is successful, Amazon GameLift performs the following tasks. You can track the process of a fleet by checking the fleet status or by monitoring fleet creation events:   Creates a fleet record. Status: NEW.   Begins writing events to the fleet event log, which can be accessed in the Amazon GameLift console. Sets the fleet's target capacity to 1 (desired instances), which triggers Amazon GameLift to start one new EC2 instance.   Downloads the game build to the new instance and installs it. Statuses: DOWNLOADING, VALIDATING, BUILDING.    Starts launching server processes on the instance. If the fleet is configured to run multiple server processes per instance, Amazon GameLift staggers each launch by a few seconds. Status: ACTIVATING.   Sets the fleet's status to ACTIVE as soon as one server process is ready to host a game session.    Learn more  See Amazon GameLift Developer Guide topics in  Working with Fleets.  Related operations     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def createFleet(params: CreateFleetInput): awsDashSdkLib.libRequestMod.Request[CreateFleetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFleet(
      params: CreateFleetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFleetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFleetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a multiplayer game session for players. This action creates a game session record and assigns an available server process in the specified fleet to host the game session. A fleet must have an ACTIVE status before a game session can be created in it. To create a game session, specify either fleet ID or alias ID and indicate a maximum number of players to allow in the game session. You can also provide a name and game-specific properties for this game session. If successful, a GameSession object is returned containing the game session properties and other settings you specified.  Idempotency tokens. You can add a token that uniquely identifies game session requests. This is useful for ensuring that game session requests are idempotent. Multiple requests with the same idempotency token are processed only once; subsequent requests return the original result. All response values are the same with the exception of game session status, which may change.  Resource creation limits. If you are creating a game session on a fleet with a resource creation limit policy in force, then you must specify a creator ID. Without this ID, Amazon GameLift has no way to evaluate the policy for this new game session request.  Player acceptance policy. By default, newly created game sessions are open to new players. You can restrict new player access by using UpdateGameSession to change the game session's player session creation policy.  Game session logs. Logs are retained for all active game sessions for 14 days. To access the logs, call GetGameSessionLogUrl to download the log files.  Available in Amazon GameLift Local.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def createGameSession(): awsDashSdkLib.libRequestMod.Request[CreateGameSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGameSession(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGameSessionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGameSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a multiplayer game session for players. This action creates a game session record and assigns an available server process in the specified fleet to host the game session. A fleet must have an ACTIVE status before a game session can be created in it. To create a game session, specify either fleet ID or alias ID and indicate a maximum number of players to allow in the game session. You can also provide a name and game-specific properties for this game session. If successful, a GameSession object is returned containing the game session properties and other settings you specified.  Idempotency tokens. You can add a token that uniquely identifies game session requests. This is useful for ensuring that game session requests are idempotent. Multiple requests with the same idempotency token are processed only once; subsequent requests return the original result. All response values are the same with the exception of game session status, which may change.  Resource creation limits. If you are creating a game session on a fleet with a resource creation limit policy in force, then you must specify a creator ID. Without this ID, Amazon GameLift has no way to evaluate the policy for this new game session request.  Player acceptance policy. By default, newly created game sessions are open to new players. You can restrict new player access by using UpdateGameSession to change the game session's player session creation policy.  Game session logs. Logs are retained for all active game sessions for 14 days. To access the logs, call GetGameSessionLogUrl to download the log files.  Available in Amazon GameLift Local.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def createGameSession(params: CreateGameSessionInput): awsDashSdkLib.libRequestMod.Request[CreateGameSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGameSession(
      params: CreateGameSessionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGameSessionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGameSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Establishes a new queue for processing requests to place new game sessions. A queue identifies where new game sessions can be hosted -- by specifying a list of destinations (fleets or aliases) -- and how long requests can wait in the queue before timing out. You can set up a queue to try to place game sessions on fleets in multiple regions. To add placement requests to a queue, call StartGameSessionPlacement and reference the queue name.  Destination order. When processing a request for a game session, Amazon GameLift tries each destination in order until it finds one with available resources to host the new game session. A queue's default order is determined by how destinations are listed. The default order is overridden when a game session placement request provides player latency information. Player latency information enables Amazon GameLift to prioritize destinations where players report the lowest average latency, as a result placing the new game session where the majority of players will have the best possible gameplay experience.  Player latency policies. For placement requests containing player latency information, use player latency policies to protect individual players from very high latencies. With a latency cap, even when a destination can deliver a low latency for most players, the game is not placed where any individual player is reporting latency higher than a policy's maximum. A queue can have multiple latency policies, which are enforced consecutively starting with the policy with the lowest latency cap. Use multiple policies to gradually relax latency controls; for example, you might set a policy with a low latency cap for the first 60 seconds, a second policy with a higher cap for the next 60 seconds, etc.  To create a new queue, provide a name, timeout value, a list of destinations and, if desired, a set of latency policies. If successful, a new queue object is returned.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
      */
    def createGameSessionQueue(): awsDashSdkLib.libRequestMod.Request[CreateGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGameSessionQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGameSessionQueueOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Establishes a new queue for processing requests to place new game sessions. A queue identifies where new game sessions can be hosted -- by specifying a list of destinations (fleets or aliases) -- and how long requests can wait in the queue before timing out. You can set up a queue to try to place game sessions on fleets in multiple regions. To add placement requests to a queue, call StartGameSessionPlacement and reference the queue name.  Destination order. When processing a request for a game session, Amazon GameLift tries each destination in order until it finds one with available resources to host the new game session. A queue's default order is determined by how destinations are listed. The default order is overridden when a game session placement request provides player latency information. Player latency information enables Amazon GameLift to prioritize destinations where players report the lowest average latency, as a result placing the new game session where the majority of players will have the best possible gameplay experience.  Player latency policies. For placement requests containing player latency information, use player latency policies to protect individual players from very high latencies. With a latency cap, even when a destination can deliver a low latency for most players, the game is not placed where any individual player is reporting latency higher than a policy's maximum. A queue can have multiple latency policies, which are enforced consecutively starting with the policy with the lowest latency cap. Use multiple policies to gradually relax latency controls; for example, you might set a policy with a low latency cap for the first 60 seconds, a second policy with a higher cap for the next 60 seconds, etc.  To create a new queue, provide a name, timeout value, a list of destinations and, if desired, a set of latency policies. If successful, a new queue object is returned.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
      */
    def createGameSessionQueue(params: CreateGameSessionQueueInput): awsDashSdkLib.libRequestMod.Request[CreateGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createGameSessionQueue(
      params: CreateGameSessionQueueInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateGameSessionQueueOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Defines a new matchmaking configuration for use with FlexMatch. A matchmaking configuration sets out guidelines for matching players and getting the matches into games. You can set up multiple matchmaking configurations to handle the scenarios needed for your game. Each matchmaking ticket (StartMatchmaking or StartMatchBackfill) specifies a configuration for the match and provides player attributes to support the configuration being used.  To create a matchmaking configuration, at a minimum you must specify the following: configuration name; a rule set that governs how to evaluate players and find acceptable matches; a game session queue to use when placing a new game session for the match; and the maximum time allowed for a matchmaking attempt.  Player acceptance -- In each configuration, you have the option to require that all players accept participation in a proposed match. To enable this feature, set AcceptanceRequired to true and specify a time limit for player acceptance. Players have the option to accept or reject a proposed match, and a match does not move ahead to game session placement unless all matched players accept.   Matchmaking status notification -- There are two ways to track the progress of matchmaking tickets: (1) polling ticket status with DescribeMatchmaking; or (2) receiving notifications with Amazon Simple Notification Service (SNS). To use notifications, you first need to set up an SNS topic to receive the notifications, and provide the topic ARN in the matchmaking configuration (see  Setting up Notifications for Matchmaking). Since notifications promise only "best effort" delivery, we recommend calling DescribeMatchmaking if no notifications are received within 30 seconds.    CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def createMatchmakingConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMatchmakingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMatchmakingConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Defines a new matchmaking configuration for use with FlexMatch. A matchmaking configuration sets out guidelines for matching players and getting the matches into games. You can set up multiple matchmaking configurations to handle the scenarios needed for your game. Each matchmaking ticket (StartMatchmaking or StartMatchBackfill) specifies a configuration for the match and provides player attributes to support the configuration being used.  To create a matchmaking configuration, at a minimum you must specify the following: configuration name; a rule set that governs how to evaluate players and find acceptable matches; a game session queue to use when placing a new game session for the match; and the maximum time allowed for a matchmaking attempt.  Player acceptance -- In each configuration, you have the option to require that all players accept participation in a proposed match. To enable this feature, set AcceptanceRequired to true and specify a time limit for player acceptance. Players have the option to accept or reject a proposed match, and a match does not move ahead to game session placement unless all matched players accept.   Matchmaking status notification -- There are two ways to track the progress of matchmaking tickets: (1) polling ticket status with DescribeMatchmaking; or (2) receiving notifications with Amazon Simple Notification Service (SNS). To use notifications, you first need to set up an SNS topic to receive the notifications, and provide the topic ARN in the matchmaking configuration (see  Setting up Notifications for Matchmaking). Since notifications promise only "best effort" delivery, we recommend calling DescribeMatchmaking if no notifications are received within 30 seconds.    CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def createMatchmakingConfiguration(params: CreateMatchmakingConfigurationInput): awsDashSdkLib.libRequestMod.Request[CreateMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMatchmakingConfiguration(
      params: CreateMatchmakingConfigurationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMatchmakingConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the number and size of teams, and sets the parameters for acceptable player matches, such as minimum skill level or character type. A rule set is used by a MatchmakingConfiguration.  To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets must be defined in the same region as the matchmaking configuration they will be used with. Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using ValidateMatchmakingRuleSet before creating a new rule set.  Learn more     Build a Rule Set     Design a Matchmaker     Matchmaking with FlexMatch     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def createMatchmakingRuleSet(): awsDashSdkLib.libRequestMod.Request[CreateMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMatchmakingRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMatchmakingRuleSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the number and size of teams, and sets the parameters for acceptable player matches, such as minimum skill level or character type. A rule set is used by a MatchmakingConfiguration.  To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets must be defined in the same region as the matchmaking configuration they will be used with. Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using ValidateMatchmakingRuleSet before creating a new rule set.  Learn more     Build a Rule Set     Design a Matchmaker     Matchmaking with FlexMatch     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def createMatchmakingRuleSet(params: CreateMatchmakingRuleSetInput): awsDashSdkLib.libRequestMod.Request[CreateMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createMatchmakingRuleSet(
      params: CreateMatchmakingRuleSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateMatchmakingRuleSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a player to a game session and creates a player session record. Before a player can be added, a game session must have an ACTIVE status, have a creation policy of ALLOW_ALL, and have an open player slot. To add a group of players to a game session, use CreatePlayerSessions. To create a player session, specify a game session ID, player ID, and optionally a string of player data. If successful, the player is added to the game session and a new PlayerSession object is returned. Player sessions cannot be updated.   Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def createPlayerSession(): awsDashSdkLib.libRequestMod.Request[CreatePlayerSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPlayerSession(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePlayerSessionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePlayerSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a player to a game session and creates a player session record. Before a player can be added, a game session must have an ACTIVE status, have a creation policy of ALLOW_ALL, and have an open player slot. To add a group of players to a game session, use CreatePlayerSessions. To create a player session, specify a game session ID, player ID, and optionally a string of player data. If successful, the player is added to the game session and a new PlayerSession object is returned. Player sessions cannot be updated.   Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def createPlayerSession(params: CreatePlayerSessionInput): awsDashSdkLib.libRequestMod.Request[CreatePlayerSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPlayerSession(
      params: CreatePlayerSessionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePlayerSessionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePlayerSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a group of players to a game session. This action is useful with a team matching feature. Before players can be added, a game session must have an ACTIVE status, have a creation policy of ALLOW_ALL, and have an open player slot. To add a single player to a game session, use CreatePlayerSession. To create player sessions, specify a game session ID, a list of player IDs, and optionally a set of player data strings. If successful, the players are added to the game session and a set of new PlayerSession objects is returned. Player sessions cannot be updated.  Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def createPlayerSessions(): awsDashSdkLib.libRequestMod.Request[CreatePlayerSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPlayerSessions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePlayerSessionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePlayerSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a group of players to a game session. This action is useful with a team matching feature. Before players can be added, a game session must have an ACTIVE status, have a creation policy of ALLOW_ALL, and have an open player slot. To add a single player to a game session, use CreatePlayerSession. To create player sessions, specify a game session ID, a list of player IDs, and optionally a set of player data strings. If successful, the players are added to the game session and a set of new PlayerSession objects is returned. Player sessions cannot be updated.  Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def createPlayerSessions(params: CreatePlayerSessionsInput): awsDashSdkLib.libRequestMod.Request[CreatePlayerSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createPlayerSessions(
      params: CreatePlayerSessionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePlayerSessionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePlayerSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to communicate directly with other AWS resources. Once you've received authorization, call CreateVpcPeeringConnection to establish the peering connection. For more information, see VPC Peering with Amazon GameLift Fleets. You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. To request authorization to create a connection, call this operation from the AWS account with the VPC that you want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If successful, VPC peering is authorized for the specified VPC.  To request authorization to delete a connection, call this operation from the AWS account with the VPC that is peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.  The authorization remains valid for 24 hours unless it is canceled by a call to DeleteVpcPeeringAuthorization. You must create or delete the peering connection while the authorization is valid.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def createVpcPeeringAuthorization(): awsDashSdkLib.libRequestMod.Request[CreateVpcPeeringAuthorizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVpcPeeringAuthorization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVpcPeeringAuthorizationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVpcPeeringAuthorizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to communicate directly with other AWS resources. Once you've received authorization, call CreateVpcPeeringConnection to establish the peering connection. For more information, see VPC Peering with Amazon GameLift Fleets. You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. To request authorization to create a connection, call this operation from the AWS account with the VPC that you want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If successful, VPC peering is authorized for the specified VPC.  To request authorization to delete a connection, call this operation from the AWS account with the VPC that is peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.  The authorization remains valid for 24 hours unless it is canceled by a call to DeleteVpcPeeringAuthorization. You must create or delete the peering connection while the authorization is valid.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def createVpcPeeringAuthorization(params: CreateVpcPeeringAuthorizationInput): awsDashSdkLib.libRequestMod.Request[CreateVpcPeeringAuthorizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVpcPeeringAuthorization(
      params: CreateVpcPeeringAuthorizationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVpcPeeringAuthorizationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVpcPeeringAuthorizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. For more information, see VPC Peering with Amazon GameLift Fleets. Before calling this operation to establish the peering connection, you first need to call CreateVpcPeeringAuthorization and identify the VPC you want to peer with. Once the authorization for the specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks necessary to peer the two VPCs, including acceptance, updating routing tables, etc.  To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer with. This operation is asynchronous. If successful, a VpcPeeringConnection request is created. You can use continuous polling to track the request's status using DescribeVpcPeeringConnections, or by monitoring fleet events for success or failure using DescribeFleetEvents.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def createVpcPeeringConnection(): awsDashSdkLib.libRequestMod.Request[CreateVpcPeeringConnectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVpcPeeringConnection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVpcPeeringConnectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVpcPeeringConnectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. For more information, see VPC Peering with Amazon GameLift Fleets. Before calling this operation to establish the peering connection, you first need to call CreateVpcPeeringAuthorization and identify the VPC you want to peer with. Once the authorization for the specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks necessary to peer the two VPCs, including acceptance, updating routing tables, etc.  To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer with. This operation is asynchronous. If successful, a VpcPeeringConnection request is created. You can use continuous polling to track the request's status using DescribeVpcPeeringConnections, or by monitoring fleet events for success or failure using DescribeFleetEvents.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def createVpcPeeringConnection(params: CreateVpcPeeringConnectionInput): awsDashSdkLib.libRequestMod.Request[CreateVpcPeeringConnectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createVpcPeeringConnection(
      params: CreateVpcPeeringConnectionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateVpcPeeringConnectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateVpcPeeringConnectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an alias. This action removes all record of the alias. Game clients attempting to access a server process using the deleted alias receive an error. To delete an alias, specify the alias ID to be deleted.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def deleteAlias(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAlias(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an alias. This action removes all record of the alias. Game clients attempting to access a server process using the deleted alias receive an error. To delete an alias, specify the alias ID to be deleted.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def deleteAlias(params: DeleteAliasInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAlias(
      params: DeleteAliasInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a build. This action permanently deletes the build record and any uploaded build files. To delete a build, specify its ID. Deleting a build does not affect the status of any active fleets using the build, but you can no longer create new fleets with the deleted build.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def deleteBuild(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBuild(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a build. This action permanently deletes the build record and any uploaded build files. To delete a build, specify its ID. Deleting a build does not affect the status of any active fleets using the build, but you can no longer create new fleets with the deleted build.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def deleteBuild(params: DeleteBuildInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBuild(
      params: DeleteBuildInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes everything related to a fleet. Before deleting a fleet, you must set the fleet's desired capacity to zero. See UpdateFleetCapacity. This action removes the fleet's resources and the fleet record. Once a fleet is deleted, you can no longer use that fleet.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def deleteFleet(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFleet(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes everything related to a fleet. Before deleting a fleet, you must set the fleet's desired capacity to zero. See UpdateFleetCapacity. This action removes the fleet's resources and the fleet record. Once a fleet is deleted, you can no longer use that fleet.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def deleteFleet(params: DeleteFleetInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFleet(
      params: DeleteFleetInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a game session queue. This action means that any StartGameSessionPlacement requests that reference this queue will fail. To delete a queue, specify the queue name.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
      */
    def deleteGameSessionQueue(): awsDashSdkLib.libRequestMod.Request[DeleteGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGameSessionQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGameSessionQueueOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a game session queue. This action means that any StartGameSessionPlacement requests that reference this queue will fail. To delete a queue, specify the queue name.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
      */
    def deleteGameSessionQueue(params: DeleteGameSessionQueueInput): awsDashSdkLib.libRequestMod.Request[DeleteGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteGameSessionQueue(
      params: DeleteGameSessionQueueInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteGameSessionQueueOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.    CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def deleteMatchmakingConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMatchmakingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMatchmakingConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.    CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def deleteMatchmakingConfiguration(params: DeleteMatchmakingConfigurationInput): awsDashSdkLib.libRequestMod.Request[DeleteMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMatchmakingConfiguration(
      params: DeleteMatchmakingConfigurationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMatchmakingConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing matchmaking rule set. To delete the rule set, provide the rule set name. Rule sets cannot be deleted if they are currently being used by a matchmaking configuration.   Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def deleteMatchmakingRuleSet(): awsDashSdkLib.libRequestMod.Request[DeleteMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMatchmakingRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMatchmakingRuleSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an existing matchmaking rule set. To delete the rule set, provide the rule set name. Rule sets cannot be deleted if they are currently being used by a matchmaking configuration.   Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def deleteMatchmakingRuleSet(params: DeleteMatchmakingRuleSetInput): awsDashSdkLib.libRequestMod.Request[DeleteMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteMatchmakingRuleSet(
      params: DeleteMatchmakingRuleSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteMatchmakingRuleSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a fleet scaling policy. This action means that the policy is no longer in force and removes all record of it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated with. To temporarily suspend scaling policies, call StopFleetActions. This operation suspends all policies for the fleet.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def deleteScalingPolicy(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteScalingPolicy(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a fleet scaling policy. This action means that the policy is no longer in force and removes all record of it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated with. To temporarily suspend scaling policies, call StopFleetActions. This operation suspends all policies for the fleet.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def deleteScalingPolicy(params: DeleteScalingPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteScalingPolicy(
      params: DeleteScalingPolicyInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a pending VPC peering authorization for the specified VPC. If the authorization has already been used to create a peering connection, call DeleteVpcPeeringConnection to remove the connection.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def deleteVpcPeeringAuthorization(): awsDashSdkLib.libRequestMod.Request[DeleteVpcPeeringAuthorizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVpcPeeringAuthorization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVpcPeeringAuthorizationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVpcPeeringAuthorizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a pending VPC peering authorization for the specified VPC. If the authorization has already been used to create a peering connection, call DeleteVpcPeeringConnection to remove the connection.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def deleteVpcPeeringAuthorization(params: DeleteVpcPeeringAuthorizationInput): awsDashSdkLib.libRequestMod.Request[DeleteVpcPeeringAuthorizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVpcPeeringAuthorization(
      params: DeleteVpcPeeringAuthorizationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVpcPeeringAuthorizationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVpcPeeringAuthorizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC peering connection that you want to delete. You can check for an authorization by calling DescribeVpcPeeringAuthorizations or request a new one using CreateVpcPeeringAuthorization.  Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the connection is removed.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def deleteVpcPeeringConnection(): awsDashSdkLib.libRequestMod.Request[DeleteVpcPeeringConnectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVpcPeeringConnection(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVpcPeeringConnectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVpcPeeringConnectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC peering connection that you want to delete. You can check for an authorization by calling DescribeVpcPeeringAuthorizations or request a new one using CreateVpcPeeringAuthorization.  Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the connection is removed.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionInput): awsDashSdkLib.libRequestMod.Request[DeleteVpcPeeringConnectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteVpcPeeringConnection(
      params: DeleteVpcPeeringConnectionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteVpcPeeringConnectionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteVpcPeeringConnectionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's target fleet ID only, use ResolveAlias.  To get alias properties, specify the alias ID. If successful, the requested alias record is returned.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def describeAlias(): awsDashSdkLib.libRequestMod.Request[DescribeAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAliasOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's target fleet ID only, use ResolveAlias.  To get alias properties, specify the alias ID. If successful, the requested alias record is returned.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def describeAlias(params: DescribeAliasInput): awsDashSdkLib.libRequestMod.Request[DescribeAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeAlias(
      params: DescribeAliasInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeAliasOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties for a build. To request a build record, specify a build ID. If successful, an object containing the build properties is returned.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def describeBuild(): awsDashSdkLib.libRequestMod.Request[DescribeBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBuild(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBuildOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties for a build. To request a build record, specify a build ID. If successful, an object containing the build properties is returned.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def describeBuild(params: DescribeBuildInput): awsDashSdkLib.libRequestMod.Request[DescribeBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeBuild(
      params: DescribeBuildInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeBuildOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the following information for the specified EC2 instance type:   maximum number of instances allowed per AWS account (service limit)   current usage level for the AWS account   Service limits vary depending on region. Available regions for Amazon GameLift can be found in the AWS Management Console for Amazon GameLift (see the drop-down list in the upper right corner).    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeEC2InstanceLimits(): awsDashSdkLib.libRequestMod.Request[DescribeEC2InstanceLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEC2InstanceLimits(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEC2InstanceLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEC2InstanceLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the following information for the specified EC2 instance type:   maximum number of instances allowed per AWS account (service limit)   current usage level for the AWS account   Service limits vary depending on region. Available regions for Amazon GameLift can be found in the AWS Management Console for Amazon GameLift (see the drop-down list in the upper right corner).    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeEC2InstanceLimits(params: DescribeEC2InstanceLimitsInput): awsDashSdkLib.libRequestMod.Request[DescribeEC2InstanceLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeEC2InstanceLimits(
      params: DescribeEC2InstanceLimitsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEC2InstanceLimitsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEC2InstanceLimitsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets. You can request attributes for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetAttributes object is returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetAttributes(): awsDashSdkLib.libRequestMod.Request[DescribeFleetAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets. You can request attributes for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetAttributes object is returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetAttributes(params: DescribeFleetAttributesInput): awsDashSdkLib.libRequestMod.Request[DescribeFleetAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetAttributes(
      params: DescribeFleetAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current status of fleet capacity for one or more fleets. This information includes the number of instances that have been requested for the fleet and the number currently active. You can request capacity for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetCapacity object is returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetCapacity(): awsDashSdkLib.libRequestMod.Request[DescribeFleetCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetCapacity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetCapacityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current status of fleet capacity for one or more fleets. This information includes the number of instances that have been requested for the fleet and the number currently active. You can request capacity for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetCapacity object is returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetCapacity(params: DescribeFleetCapacityInput): awsDashSdkLib.libRequestMod.Request[DescribeFleetCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetCapacity(
      params: DescribeFleetCapacityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetCapacityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves entries from the specified fleet's event log. You can specify a time range to limit the result set. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a collection of event log entries matching the request are returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetEvents(): awsDashSdkLib.libRequestMod.Request[DescribeFleetEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetEventsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves entries from the specified fleet's event log. You can specify a time range to limit the result set. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a collection of event log entries matching the request are returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetEvents(params: DescribeFleetEventsInput): awsDashSdkLib.libRequestMod.Request[DescribeFleetEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetEvents(
      params: DescribeFleetEventsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetEventsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetEventsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the inbound connection permissions for a fleet. Connection permissions include a range of IP addresses and port settings that incoming traffic can use to access server processes in the fleet. To get a fleet's inbound connection permissions, specify a fleet ID. If successful, a collection of IpPermission objects is returned for the requested fleet ID. If the requested fleet has been deleted, the result set is empty.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetPortSettings(): awsDashSdkLib.libRequestMod.Request[DescribeFleetPortSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetPortSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetPortSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetPortSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the inbound connection permissions for a fleet. Connection permissions include a range of IP addresses and port settings that incoming traffic can use to access server processes in the fleet. To get a fleet's inbound connection permissions, specify a fleet ID. If successful, a collection of IpPermission objects is returned for the requested fleet ID. If the requested fleet has been deleted, the result set is empty.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetPortSettings(params: DescribeFleetPortSettingsInput): awsDashSdkLib.libRequestMod.Request[DescribeFleetPortSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetPortSettings(
      params: DescribeFleetPortSettingsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetPortSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetPortSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves utilization statistics for one or more fleets. You can request utilization data for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetUtilization object is returned for each requested fleet ID. When specifying a list of fleet IDs, utilization objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetUtilization(): awsDashSdkLib.libRequestMod.Request[DescribeFleetUtilizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetUtilization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetUtilizationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetUtilizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves utilization statistics for one or more fleets. You can request utilization data for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetUtilization object is returned for each requested fleet ID. When specifying a list of fleet IDs, utilization objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeFleetUtilization(params: DescribeFleetUtilizationInput): awsDashSdkLib.libRequestMod.Request[DescribeFleetUtilizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleetUtilization(
      params: DescribeFleetUtilizationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetUtilizationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetUtilizationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties, including the protection policy in force, for one or more game sessions. This action can be used in several ways: (1) provide a GameSessionId or GameSessionArn to request details for a specific game session; (2) provide either a FleetId or an AliasId to request properties for all game sessions running on a fleet.  To get game session record(s), specify just one of the following: game session ID, fleet ID, or alias ID. You can filter this request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSessionDetail object is returned for each session matching the request.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def describeGameSessionDetails(): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGameSessionDetails(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGameSessionDetailsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties, including the protection policy in force, for one or more game sessions. This action can be used in several ways: (1) provide a GameSessionId or GameSessionArn to request details for a specific game session; (2) provide either a FleetId or an AliasId to request properties for all game sessions running on a fleet.  To get game session record(s), specify just one of the following: game session ID, fleet ID, or alias ID. You can filter this request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSessionDetail object is returned for each session matching the request.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def describeGameSessionDetails(params: DescribeGameSessionDetailsInput): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGameSessionDetails(
      params: DescribeGameSessionDetailsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGameSessionDetailsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionDetailsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties and current status of a game session placement request. To get game session placement details, specify the placement ID. If successful, a GameSessionPlacement object is returned.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def describeGameSessionPlacement(): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGameSessionPlacement(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGameSessionPlacementOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties and current status of a game session placement request. To get game session placement details, specify the placement ID. If successful, a GameSessionPlacement object is returned.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def describeGameSessionPlacement(params: DescribeGameSessionPlacementInput): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGameSessionPlacement(
      params: DescribeGameSessionPlacementInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGameSessionPlacementOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSessionQueue object is returned for each requested queue. When specifying a list of queues, objects are returned only for queues that currently exist in the region.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
      */
    def describeGameSessionQueues(): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionQueuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGameSessionQueues(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGameSessionQueuesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionQueuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSessionQueue object is returned for each requested queue. When specifying a list of queues, objects are returned only for queues that currently exist in the region.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
      */
    def describeGameSessionQueues(params: DescribeGameSessionQueuesInput): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionQueuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGameSessionQueues(
      params: DescribeGameSessionQueuesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGameSessionQueuesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionQueuesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a set of one or more game sessions. Request a specific game session or request all game sessions on a fleet. Alternatively, use SearchGameSessions to request a set of active game sessions that are filtered by certain criteria. To retrieve protection policy settings for game sessions, use DescribeGameSessionDetails. To get game sessions, specify one of the following: game session ID, fleet ID, or alias ID. You can filter this request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSession object is returned for each game session matching the request.  Available in Amazon GameLift Local.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def describeGameSessions(): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGameSessions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGameSessionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a set of one or more game sessions. Request a specific game session or request all game sessions on a fleet. Alternatively, use SearchGameSessions to request a set of active game sessions that are filtered by certain criteria. To retrieve protection policy settings for game sessions, use DescribeGameSessionDetails. To get game sessions, specify one of the following: game session ID, fleet ID, or alias ID. You can filter this request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSession object is returned for each game session matching the request.  Available in Amazon GameLift Local.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def describeGameSessions(params: DescribeGameSessionsInput): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeGameSessions(
      params: DescribeGameSessionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeGameSessionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeGameSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a fleet's instances, including instance IDs. Use this action to get details on all instances in the fleet or get details on one specific instance. To get a specific instance, specify fleet ID and instance ID. To get all instances in a fleet, specify a fleet ID only. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, an Instance object is returned for each result.
      */
    def describeInstances(): awsDashSdkLib.libRequestMod.Request[DescribeInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information about a fleet's instances, including instance IDs. Use this action to get details on all instances in the fleet or get details on one specific instance. To get a specific instance, specify fleet ID and instance ID. To get all instances in a fleet, specify a fleet ID only. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, an Instance object is returned for each result.
      */
    def describeInstances(params: DescribeInstancesInput): awsDashSdkLib.libRequestMod.Request[DescribeInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeInstances(
      params: DescribeInstancesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeInstancesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeInstancesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves one or more matchmaking tickets. Use this operation to retrieve ticket information, including status and--once a successful match is made--acquire connection information for the resulting new game session.  You can use this operation to track the progress of matchmaking requests (through polling) as an alternative to using event notifications. See more details on tracking matchmaking requests through polling or notifications in StartMatchmaking.  To request matchmaking tickets, provide a list of up to 10 ticket IDs. If the request is successful, a ticket object is returned for each requested ID that currently exists.    StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def describeMatchmaking(): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMatchmaking(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMatchmakingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves one or more matchmaking tickets. Use this operation to retrieve ticket information, including status and--once a successful match is made--acquire connection information for the resulting new game session.  You can use this operation to track the progress of matchmaking requests (through polling) as an alternative to using event notifications. See more details on tracking matchmaking requests through polling or notifications in StartMatchmaking.  To request matchmaking tickets, provide a list of up to 10 ticket IDs. If the request is successful, a ticket object is returned for each requested ID that currently exists.    StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def describeMatchmaking(params: DescribeMatchmakingInput): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMatchmaking(
      params: DescribeMatchmakingInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMatchmakingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the details of FlexMatch matchmaking configurations. with this operation, you have the following options: (1) retrieve all existing configurations, (2) provide the names of one or more configurations to retrieve, or (3) retrieve all configurations that use a specified rule set name. When requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a configuration is returned for each requested name. When specifying a list of names, only configurations that currently exist are returned.     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def describeMatchmakingConfigurations(): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMatchmakingConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMatchmakingConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the details of FlexMatch matchmaking configurations. with this operation, you have the following options: (1) retrieve all existing configurations, (2) provide the names of one or more configurations to retrieve, or (3) retrieve all configurations that use a specified rule set name. When requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a configuration is returned for each requested name. When specifying a list of names, only configurations that currently exist are returned.     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def describeMatchmakingConfigurations(params: DescribeMatchmakingConfigurationsInput): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMatchmakingConfigurations(
      params: DescribeMatchmakingConfigurationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMatchmakingConfigurationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingConfigurationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the region, or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.   Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def describeMatchmakingRuleSets(): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingRuleSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMatchmakingRuleSets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMatchmakingRuleSetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingRuleSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the region, or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.   Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def describeMatchmakingRuleSets(params: DescribeMatchmakingRuleSetsInput): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingRuleSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeMatchmakingRuleSets(
      params: DescribeMatchmakingRuleSetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeMatchmakingRuleSetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeMatchmakingRuleSetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties for one or more player sessions. This action can be used in several ways: (1) provide a PlayerSessionId to request properties for a specific player session; (2) provide a GameSessionId to request properties for all player sessions in the specified game session; (3) provide a PlayerId to request properties for all player sessions of a specified player.  To get game session record(s), specify only one of the following: a player session ID, a game session ID, or a player ID. You can filter this request by player session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a PlayerSession object is returned for each session matching the request.  Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def describePlayerSessions(): awsDashSdkLib.libRequestMod.Request[DescribePlayerSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePlayerSessions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePlayerSessionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePlayerSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves properties for one or more player sessions. This action can be used in several ways: (1) provide a PlayerSessionId to request properties for a specific player session; (2) provide a GameSessionId to request properties for all player sessions in the specified game session; (3) provide a PlayerId to request properties for all player sessions of a specified player.  To get game session record(s), specify only one of the following: a player session ID, a game session ID, or a player ID. You can filter this request by player session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a PlayerSession object is returned for each session matching the request.  Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def describePlayerSessions(params: DescribePlayerSessionsInput): awsDashSdkLib.libRequestMod.Request[DescribePlayerSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describePlayerSessions(
      params: DescribePlayerSessionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribePlayerSessionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribePlayerSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current run-time configuration for the specified fleet. The run-time configuration tells Amazon GameLift how to launch server processes on instances in the fleet.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeRuntimeConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeRuntimeConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRuntimeConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRuntimeConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRuntimeConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the current run-time configuration for the specified fleet. The run-time configuration tells Amazon GameLift how to launch server processes on instances in the fleet.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeRuntimeConfiguration(params: DescribeRuntimeConfigurationInput): awsDashSdkLib.libRequestMod.Request[DescribeRuntimeConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRuntimeConfiguration(
      params: DescribeRuntimeConfigurationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRuntimeConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRuntimeConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all scaling policies applied to a fleet. To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, set of ScalingPolicy objects is returned for the fleet. A fleet may have all of its scaling policies suspended (StopFleetActions). This action does not affect the status of the scaling policies, which remains ACTIVE. To see whether a fleet's scaling policies are in force or suspended, call DescribeFleetAttributes and check the stopped actions.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeScalingPolicies(): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeScalingPolicies(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPoliciesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all scaling policies applied to a fleet. To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, set of ScalingPolicy objects is returned for the fleet. A fleet may have all of its scaling policies suspended (StopFleetActions). This action does not affect the status of the scaling policies, which remains ACTIVE. To see whether a fleet's scaling policies are in force or suspended, call DescribeFleetAttributes and check the stopped actions.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def describeScalingPolicies(params: DescribeScalingPoliciesInput): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeScalingPolicies(
      params: DescribeScalingPoliciesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeScalingPoliciesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeScalingPoliciesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC peering authorizations and requests for peering. This includes those initiated and received by this account.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def describeVpcPeeringAuthorizations(): awsDashSdkLib.libRequestMod.Request[DescribeVpcPeeringAuthorizationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVpcPeeringAuthorizations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVpcPeeringAuthorizationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVpcPeeringAuthorizationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC peering authorizations and requests for peering. This includes those initiated and received by this account.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def describeVpcPeeringAuthorizations(params: DescribeVpcPeeringAuthorizationsInput): awsDashSdkLib.libRequestMod.Request[DescribeVpcPeeringAuthorizationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVpcPeeringAuthorizations(
      params: DescribeVpcPeeringAuthorizationsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVpcPeeringAuthorizationsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVpcPeeringAuthorizationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or for one specific fleet ID.  To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If successful, the retrieved information includes both active and pending connections. Active connections identify the IpV4 CIDR block that the VPC uses to connect.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def describeVpcPeeringConnections(): awsDashSdkLib.libRequestMod.Request[DescribeVpcPeeringConnectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVpcPeeringConnections(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVpcPeeringConnectionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVpcPeeringConnectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or for one specific fleet ID.  To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If successful, the retrieved information includes both active and pending connections. Active connections identify the IpV4 CIDR block that the VPC uses to connect.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
      */
    def describeVpcPeeringConnections(params: DescribeVpcPeeringConnectionsInput): awsDashSdkLib.libRequestMod.Request[DescribeVpcPeeringConnectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeVpcPeeringConnections(
      params: DescribeVpcPeeringConnectionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeVpcPeeringConnectionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeVpcPeeringConnectionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the location of stored game session logs for a specified game session. When a game session is terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL to download the logs.  See the AWS Service Limits page for maximum log file sizes. Log files that exceed this limit are not saved.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def getGameSessionLogUrl(): awsDashSdkLib.libRequestMod.Request[GetGameSessionLogUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGameSessionLogUrl(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGameSessionLogUrlOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGameSessionLogUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the location of stored game session logs for a specified game session. When a game session is terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL to download the logs.  See the AWS Service Limits page for maximum log file sizes. Log files that exceed this limit are not saved.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def getGameSessionLogUrl(params: GetGameSessionLogUrlInput): awsDashSdkLib.libRequestMod.Request[GetGameSessionLogUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getGameSessionLogUrl(
      params: GetGameSessionLogUrlInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetGameSessionLogUrlOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetGameSessionLogUrlOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data, or watching activity in real time.  Access requires credentials that match the operating system of the instance. For a Windows instance, Amazon GameLift returns a user name and password as strings for use with a Windows Remote Desktop client. For a Linux instance, Amazon GameLift returns a user name and RSA private key, also as strings, for use with an SSH client. The private key must be saved in the proper format to a .pem file before using. If you're making this request using the AWS CLI, saving the secret can be handled as part of the GetInstanceAccess request. (See the example later in this topic). For more information on remote access, see Remotely Accessing an Instance. To request access to a specific instance, specify the IDs of both the instance and the fleet it belongs to. You can retrieve a fleet's instance IDs by calling DescribeInstances. If successful, an InstanceAccess object is returned containing the instance's IP address and a set of credentials.
      */
    def getInstanceAccess(): awsDashSdkLib.libRequestMod.Request[GetInstanceAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInstanceAccess(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstanceAccessOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data, or watching activity in real time.  Access requires credentials that match the operating system of the instance. For a Windows instance, Amazon GameLift returns a user name and password as strings for use with a Windows Remote Desktop client. For a Linux instance, Amazon GameLift returns a user name and RSA private key, also as strings, for use with an SSH client. The private key must be saved in the proper format to a .pem file before using. If you're making this request using the AWS CLI, saving the secret can be handled as part of the GetInstanceAccess request. (See the example later in this topic). For more information on remote access, see Remotely Accessing an Instance. To request access to a specific instance, specify the IDs of both the instance and the fleet it belongs to. You can retrieve a fleet's instance IDs by calling DescribeInstances. If successful, an InstanceAccess object is returned containing the instance's IP address and a set of credentials.
      */
    def getInstanceAccess(params: GetInstanceAccessInput): awsDashSdkLib.libRequestMod.Request[GetInstanceAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInstanceAccess(
      params: GetInstanceAccessInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInstanceAccessOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInstanceAccessOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy type. Use the pagination parameters to retrieve results in sequential pages.  Returned aliases are not listed in any particular order.     CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def listAliases(): awsDashSdkLib.libRequestMod.Request[ListAliasesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAliases(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy type. Use the pagination parameters to retrieve results in sequential pages.  Returned aliases are not listed in any particular order.     CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def listAliases(params: ListAliasesInput): awsDashSdkLib.libRequestMod.Request[ListAliasesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listAliases(
      params: ListAliasesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListAliasesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListAliasesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves build records for all builds associated with the AWS account in use. You can limit results to builds that are in a specific status by using the Status parameter. Use the pagination parameters to retrieve results in a set of sequential pages.   Build records are not listed in any particular order.     CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def listBuilds(): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBuilds(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBuildsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves build records for all builds associated with the AWS account in use. You can limit results to builds that are in a specific status by using the Status parameter. Use the pagination parameters to retrieve results in a set of sequential pages.   Build records are not listed in any particular order.     CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def listBuilds(params: ListBuildsInput): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBuilds(
      params: ListBuildsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBuildsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a collection of fleet records for this AWS account. You can filter the result set by build ID. Use the pagination parameters to retrieve results in sequential pages.  Fleet records are not listed in any particular order.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def listFleets(): awsDashSdkLib.libRequestMod.Request[ListFleetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFleets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFleetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFleetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a collection of fleet records for this AWS account. You can filter the result set by build ID. Use the pagination parameters to retrieve results in sequential pages.  Fleet records are not listed in any particular order.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def listFleets(params: ListFleetsInput): awsDashSdkLib.libRequestMod.Request[ListFleetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFleets(
      params: ListFleetsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFleetsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFleetsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a scaling policy for a fleet. Scaling policies are used to automatically scale a fleet's hosting capacity to meet player demand. An active scaling policy instructs Amazon GameLift to track a fleet metric and automatically change the fleet's capacity when a certain threshold is reached. There are two types of scaling policies: target-based and rule-based. Use a target-based policy to quickly and efficiently manage fleet scaling; this option is the most commonly used. Use rule-based policies when you need to exert fine-grained control over auto-scaling.  Fleets can have multiple scaling policies of each type in force at the same time; you can have one target-based policy, one or multiple rule-based scaling policies, or both. We recommend caution, however, because multiple auto-scaling policies can have unintended consequences. You can temporarily suspend all scaling policies for a fleet by calling StopFleetActions with the fleet action AUTO_SCALING. To resume scaling policies, call StartFleetActions with the same fleet action. To stop just one scaling policy--or to permanently remove it, you must delete the policy with DeleteScalingPolicy. Learn more about how to work with auto-scaling in Set Up Fleet Automatic Scaling.  Target-based policy  A target-based policy tracks a single metric: PercentAvailableGameSessions. This metric tells us how much of a fleet's hosting capacity is ready to host game sessions but is not currently in use. This is the fleet's buffer; it measures the additional player demand that the fleet could handle at current capacity. With a target-based policy, you set your ideal buffer size and leave it to Amazon GameLift to take whatever action is needed to maintain that target.  For example, you might choose to maintain a 10% buffer for a fleet that has the capacity to host 100 simultaneous game sessions. This policy tells Amazon GameLift to take action whenever the fleet's available capacity falls below or rises above 10 game sessions. Amazon GameLift will start new instances or stop unused instances in order to return to the 10% buffer.  To create or update a target-based policy, specify a fleet ID and name, and set the policy type to "TargetBased". Specify the metric to track (PercentAvailableGameSessions) and reference a TargetConfiguration object with your desired buffer value. Exclude all other parameters. On a successful request, the policy name is returned. The scaling policy is automatically in force as soon as it's successfully created. If the fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.  Rule-based policy  A rule-based policy tracks specified fleet metric, sets a threshold value, and specifies the type of action to initiate when triggered. With a rule-based policy, you can select from several available fleet metrics. Each policy specifies whether to scale up or scale down (and by how much), so you need one policy for each type of action.  For example, a policy may make the following statement: "If the percentage of idle instances is greater than 20% for more than 15 minutes, then reduce the fleet capacity by 10%." A policy's rule statement has the following structure: If [MetricName] is [ComparisonOperator] [Threshold] for [EvaluationPeriods] minutes, then [ScalingAdjustmentType] to/by [ScalingAdjustment]. To implement the example, the rule statement would look like this: If [PercentIdleInstances] is [GreaterThanThreshold] [20] for [15] minutes, then [PercentChangeInCapacity] to/by [10]. To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the policy type to "RuleBased". Specify the parameter values for a policy rule statement. On a successful request, the policy name is returned. Scaling policies are automatically in force as soon as they're successfully created. If the fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def putScalingPolicy(): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putScalingPolicy(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutScalingPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates or updates a scaling policy for a fleet. Scaling policies are used to automatically scale a fleet's hosting capacity to meet player demand. An active scaling policy instructs Amazon GameLift to track a fleet metric and automatically change the fleet's capacity when a certain threshold is reached. There are two types of scaling policies: target-based and rule-based. Use a target-based policy to quickly and efficiently manage fleet scaling; this option is the most commonly used. Use rule-based policies when you need to exert fine-grained control over auto-scaling.  Fleets can have multiple scaling policies of each type in force at the same time; you can have one target-based policy, one or multiple rule-based scaling policies, or both. We recommend caution, however, because multiple auto-scaling policies can have unintended consequences. You can temporarily suspend all scaling policies for a fleet by calling StopFleetActions with the fleet action AUTO_SCALING. To resume scaling policies, call StartFleetActions with the same fleet action. To stop just one scaling policy--or to permanently remove it, you must delete the policy with DeleteScalingPolicy. Learn more about how to work with auto-scaling in Set Up Fleet Automatic Scaling.  Target-based policy  A target-based policy tracks a single metric: PercentAvailableGameSessions. This metric tells us how much of a fleet's hosting capacity is ready to host game sessions but is not currently in use. This is the fleet's buffer; it measures the additional player demand that the fleet could handle at current capacity. With a target-based policy, you set your ideal buffer size and leave it to Amazon GameLift to take whatever action is needed to maintain that target.  For example, you might choose to maintain a 10% buffer for a fleet that has the capacity to host 100 simultaneous game sessions. This policy tells Amazon GameLift to take action whenever the fleet's available capacity falls below or rises above 10 game sessions. Amazon GameLift will start new instances or stop unused instances in order to return to the 10% buffer.  To create or update a target-based policy, specify a fleet ID and name, and set the policy type to "TargetBased". Specify the metric to track (PercentAvailableGameSessions) and reference a TargetConfiguration object with your desired buffer value. Exclude all other parameters. On a successful request, the policy name is returned. The scaling policy is automatically in force as soon as it's successfully created. If the fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.  Rule-based policy  A rule-based policy tracks specified fleet metric, sets a threshold value, and specifies the type of action to initiate when triggered. With a rule-based policy, you can select from several available fleet metrics. Each policy specifies whether to scale up or scale down (and by how much), so you need one policy for each type of action.  For example, a policy may make the following statement: "If the percentage of idle instances is greater than 20% for more than 15 minutes, then reduce the fleet capacity by 10%." A policy's rule statement has the following structure: If [MetricName] is [ComparisonOperator] [Threshold] for [EvaluationPeriods] minutes, then [ScalingAdjustmentType] to/by [ScalingAdjustment]. To implement the example, the rule statement would look like this: If [PercentIdleInstances] is [GreaterThanThreshold] [20] for [15] minutes, then [PercentChangeInCapacity] to/by [10]. To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the policy type to "RuleBased". Specify the parameter values for a policy rule statement. On a successful request, the policy name is returned. Scaling policies are automatically in force as soon as they're successfully created. If the fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def putScalingPolicy(params: PutScalingPolicyInput): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putScalingPolicy(
      params: PutScalingPolicyInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutScalingPolicyOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutScalingPolicyOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a fresh set of credentials for use when uploading a new set of game build files to Amazon GameLift's Amazon S3. This is done as part of the build creation process; see CreateBuild. To request new credentials, specify the build ID as returned with an initial CreateBuild request. If successful, a new set of credentials are returned, along with the S3 storage location associated with the build ID.
      */
    def requestUploadCredentials(): awsDashSdkLib.libRequestMod.Request[RequestUploadCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def requestUploadCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RequestUploadCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RequestUploadCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves a fresh set of credentials for use when uploading a new set of game build files to Amazon GameLift's Amazon S3. This is done as part of the build creation process; see CreateBuild. To request new credentials, specify the build ID as returned with an initial CreateBuild request. If successful, a new set of credentials are returned, along with the S3 storage location associated with the build ID.
      */
    def requestUploadCredentials(params: RequestUploadCredentialsInput): awsDashSdkLib.libRequestMod.Request[RequestUploadCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def requestUploadCredentials(
      params: RequestUploadCredentialsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RequestUploadCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RequestUploadCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the fleet ID that a specified alias is currently pointing to.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def resolveAlias(): awsDashSdkLib.libRequestMod.Request[ResolveAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resolveAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResolveAliasOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResolveAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the fleet ID that a specified alias is currently pointing to.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def resolveAlias(params: ResolveAliasInput): awsDashSdkLib.libRequestMod.Request[ResolveAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resolveAlias(
      params: ResolveAliasInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResolveAliasOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResolveAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all active game sessions that match a set of search criteria and sorts them in a specified order. You can search or sort by the following game session attributes:    gameSessionId -- Unique identifier for the game session. You can use either a GameSessionId or GameSessionArn value.     gameSessionName -- Name assigned to a game session. This value is set when requesting a new game session with CreateGameSession or updating with UpdateGameSession. Game session names do not need to be unique to a game session.    gameSessionProperties -- Custom data defined in a game session's GameProperty parameter. GameProperty values are stored as key:value pairs; the filter expression must indicate the key and a string to search the data values for. For example, to search for game sessions with custom data containing the key:value pair "gameMode:brawl", specify the following: gameSessionProperties.gameMode = "brawl". All custom data values are searched as strings.    maximumSessions -- Maximum number of player sessions allowed for a game session. This value is set when requesting a new game session with CreateGameSession or updating with UpdateGameSession.    creationTimeMillis -- Value indicating when a game session was created. It is expressed in Unix time as milliseconds.    playerSessionCount -- Number of players currently connected to a game session. This value changes rapidly as players join the session or drop out.    hasAvailablePlayerSessions -- Boolean value indicating whether a game session has reached its maximum number of players. It is highly recommended that all search requests include this filter attribute to optimize search performance and return only sessions that players can join.     Returned values for playerSessionCount and hasAvailablePlayerSessions change quickly as players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh search results often, and handle sessions that fill up before a player can join.   To search or sort, specify either a fleet ID or an alias ID, and provide a search filter expression, a sort expression, or both. If successful, a collection of GameSession objects matching the request is returned. Use the pagination parameters to retrieve results as a set of sequential pages.  You can search for game sessions one fleet at a time only. To find game sessions across multiple fleets, you must search each fleet separately and combine the results. This search feature finds only game sessions that are in ACTIVE status. To locate games in statuses other than active, use DescribeGameSessionDetails.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def searchGameSessions(): awsDashSdkLib.libRequestMod.Request[SearchGameSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchGameSessions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchGameSessionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchGameSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves all active game sessions that match a set of search criteria and sorts them in a specified order. You can search or sort by the following game session attributes:    gameSessionId -- Unique identifier for the game session. You can use either a GameSessionId or GameSessionArn value.     gameSessionName -- Name assigned to a game session. This value is set when requesting a new game session with CreateGameSession or updating with UpdateGameSession. Game session names do not need to be unique to a game session.    gameSessionProperties -- Custom data defined in a game session's GameProperty parameter. GameProperty values are stored as key:value pairs; the filter expression must indicate the key and a string to search the data values for. For example, to search for game sessions with custom data containing the key:value pair "gameMode:brawl", specify the following: gameSessionProperties.gameMode = "brawl". All custom data values are searched as strings.    maximumSessions -- Maximum number of player sessions allowed for a game session. This value is set when requesting a new game session with CreateGameSession or updating with UpdateGameSession.    creationTimeMillis -- Value indicating when a game session was created. It is expressed in Unix time as milliseconds.    playerSessionCount -- Number of players currently connected to a game session. This value changes rapidly as players join the session or drop out.    hasAvailablePlayerSessions -- Boolean value indicating whether a game session has reached its maximum number of players. It is highly recommended that all search requests include this filter attribute to optimize search performance and return only sessions that players can join.     Returned values for playerSessionCount and hasAvailablePlayerSessions change quickly as players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh search results often, and handle sessions that fill up before a player can join.   To search or sort, specify either a fleet ID or an alias ID, and provide a search filter expression, a sort expression, or both. If successful, a collection of GameSession objects matching the request is returned. Use the pagination parameters to retrieve results as a set of sequential pages.  You can search for game sessions one fleet at a time only. To find game sessions across multiple fleets, you must search each fleet separately and combine the results. This search feature finds only game sessions that are in ACTIVE status. To locate games in statuses other than active, use DescribeGameSessionDetails.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def searchGameSessions(params: SearchGameSessionsInput): awsDashSdkLib.libRequestMod.Request[SearchGameSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchGameSessions(
      params: SearchGameSessionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchGameSessionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchGameSessionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resumes activity on a fleet that was suspended with StopFleetActions. Currently, this operation is used to restart a fleet's auto-scaling activity.  To start fleet actions, specify the fleet ID and the type of actions to restart. When auto-scaling fleet actions are restarted, Amazon GameLift once again initiates scaling events as triggered by the fleet's scaling policies. If actions on the fleet were never stopped, this operation will have no effect. You can view a fleet's stopped actions using DescribeFleetAttributes.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def startFleetActions(): awsDashSdkLib.libRequestMod.Request[StartFleetActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startFleetActions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartFleetActionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartFleetActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resumes activity on a fleet that was suspended with StopFleetActions. Currently, this operation is used to restart a fleet's auto-scaling activity.  To start fleet actions, specify the fleet ID and the type of actions to restart. When auto-scaling fleet actions are restarted, Amazon GameLift once again initiates scaling events as triggered by the fleet's scaling policies. If actions on the fleet were never stopped, this operation will have no effect. You can view a fleet's stopped actions using DescribeFleetAttributes.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def startFleetActions(params: StartFleetActionsInput): awsDashSdkLib.libRequestMod.Request[StartFleetActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startFleetActions(
      params: StartFleetActionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartFleetActionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartFleetActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Places a request for a new game session in a queue (see CreateGameSessionQueue). When processing a placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each until it finds resources or the placement request times out. A game session placement request can also request player sessions. When a new game session is successfully created, Amazon GameLift creates a player session for each player included in the request. When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the queue configuration. Ideally, a queue's destinations are listed in preference order. Alternatively, when requesting a game session with players, you can also provide latency data for each player in relevant regions. Latency data indicates the performance lag a player experiences when connected to a fleet in the region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each region's average lag for all players and reorders to get the best game play across all players.  To place a new game session request, specify the following:   The queue name and a set of game session properties and settings   A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request   (Optional) A set of player data and a unique player ID for each player that you are joining to the new game session (player data is optional, but if you include it, you must also provide a unique ID for each player)   Latency data for all players (if you want to optimize game play for the players)   If successful, a new game session placement is created. To track the status of a placement request, call DescribeGameSessionPlacement and check the request's status. If the status is FULFILLED, a new game session has been created and a game session ARN and region are referenced. If the placement request times out, you can resubmit the request or retry it with a different queue.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def startGameSessionPlacement(): awsDashSdkLib.libRequestMod.Request[StartGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startGameSessionPlacement(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartGameSessionPlacementOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Places a request for a new game session in a queue (see CreateGameSessionQueue). When processing a placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each until it finds resources or the placement request times out. A game session placement request can also request player sessions. When a new game session is successfully created, Amazon GameLift creates a player session for each player included in the request. When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the queue configuration. Ideally, a queue's destinations are listed in preference order. Alternatively, when requesting a game session with players, you can also provide latency data for each player in relevant regions. Latency data indicates the performance lag a player experiences when connected to a fleet in the region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each region's average lag for all players and reorders to get the best game play across all players.  To place a new game session request, specify the following:   The queue name and a set of game session properties and settings   A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request   (Optional) A set of player data and a unique player ID for each player that you are joining to the new game session (player data is optional, but if you include it, you must also provide a unique ID for each player)   Latency data for all players (if you want to optimize game play for the players)   If successful, a new game session placement is created. To track the status of a placement request, call DescribeGameSessionPlacement and check the request's status. If the status is FULFILLED, a new game session has been created and a game session ARN and region are referenced. If the placement request times out, you can resubmit the request or retry it with a different queue.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def startGameSessionPlacement(params: StartGameSessionPlacementInput): awsDashSdkLib.libRequestMod.Request[StartGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startGameSessionPlacement(
      params: StartGameSessionPlacementInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartGameSessionPlacementOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Finds new players to fill open slots in an existing game session. This operation can be used to add players to matched games that start with fewer than the maximum number of players or to replace players when they drop out. By backfilling with the same matchmaker used to create the original match, you ensure that new players meet the match criteria and maintain a consistent experience throughout the game session. You can backfill a match anytime after a game session has been created.  To request a match backfill, specify a unique ticket ID, the existing game session's ARN, a matchmaking configuration, and a set of data that describes all current players in the game session. If successful, a match backfill ticket is created and returned with status set to QUEUED. The ticket is placed in the matchmaker's ticket pool and processed. Track the status of the ticket to respond as needed. For more detail how to set up backfilling, see  Backfill Existing Games with FlexMatch.  The process of finding backfill matches is essentially identical to the initial matchmaking process. The matchmaker searches the pool and groups tickets together to form potential matches, allowing only one backfill ticket per potential match. Once the a match is formed, the matchmaker creates player sessions for the new players. All tickets in the match are updated with the game session's connection information, and the GameSession object is updated to include matchmaker data on the new players. For more detail on how match backfill requests are processed, see  How Amazon GameLift FlexMatch Works.     StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def startMatchBackfill(): awsDashSdkLib.libRequestMod.Request[StartMatchBackfillOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startMatchBackfill(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartMatchBackfillOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartMatchBackfillOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Finds new players to fill open slots in an existing game session. This operation can be used to add players to matched games that start with fewer than the maximum number of players or to replace players when they drop out. By backfilling with the same matchmaker used to create the original match, you ensure that new players meet the match criteria and maintain a consistent experience throughout the game session. You can backfill a match anytime after a game session has been created.  To request a match backfill, specify a unique ticket ID, the existing game session's ARN, a matchmaking configuration, and a set of data that describes all current players in the game session. If successful, a match backfill ticket is created and returned with status set to QUEUED. The ticket is placed in the matchmaker's ticket pool and processed. Track the status of the ticket to respond as needed. For more detail how to set up backfilling, see  Backfill Existing Games with FlexMatch.  The process of finding backfill matches is essentially identical to the initial matchmaking process. The matchmaker searches the pool and groups tickets together to form potential matches, allowing only one backfill ticket per potential match. Once the a match is formed, the matchmaker creates player sessions for the new players. All tickets in the match are updated with the game session's connection information, and the GameSession object is updated to include matchmaker data on the new players. For more detail on how match backfill requests are processed, see  How Amazon GameLift FlexMatch Works.     StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def startMatchBackfill(params: StartMatchBackfillInput): awsDashSdkLib.libRequestMod.Request[StartMatchBackfillOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startMatchBackfill(
      params: StartMatchBackfillInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartMatchBackfillOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartMatchBackfillOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules, and starts a new game for the matched players. Each matchmaking request specifies the type of match to build (team configuration, rules for an acceptable match, etc.). The request also specifies the players to find a match for and where to host the new game session for optimal performance. A matchmaking request might start with a single player or a group of players who want to play together. FlexMatch finds additional players as needed to fill the match. Match type, rules, and the queue used to place a new game session are defined in a MatchmakingConfiguration. For complete information on setting up and using FlexMatch, see the topic  Adding FlexMatch to Your Game. To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to be matched. You must also include a set of player attributes relevant for the matchmaking configuration. If successful, a matchmaking ticket is returned with status set to QUEUED. Track the status of the ticket to respond as needed and acquire game session connection information for successfully completed matches.  Tracking ticket status -- A couple of options are available for tracking the status of matchmaking requests:    Polling -- Call DescribeMatchmaking. This operation returns the full ticket object, including current status and (for completed tickets) game session connection info. We recommend polling no more than once every 10 seconds.   Notifications -- Get event notifications for changes in ticket status using Amazon Simple Notification Service (SNS). Notifications are easy to set up (see CreateMatchmakingConfiguration) and typically deliver match status changes faster and more efficiently than polling. We recommend that you use polling to back up to notifications (since delivery is not guaranteed) and call DescribeMatchmaking only when notifications are not received within 30 seconds.    Processing a matchmaking request -- FlexMatch handles a matchmaking request as follows:    Your client code submits a StartMatchmaking request for one or more players and tracks the status of the request ticket.    FlexMatch uses this ticket and others in process to build an acceptable match. When a potential match is identified, all tickets in the proposed match are advanced to the next status.    If the match requires player acceptance (set in the matchmaking configuration), the tickets move into status REQUIRES_ACCEPTANCE. This status triggers your client code to solicit acceptance from all players in every ticket involved in the match, and then call AcceptMatch for each player. If any player rejects or fails to accept the match before a specified timeout, the proposed match is dropped (see AcceptMatch for more details).   Once a match is proposed and accepted, the matchmaking tickets move into status PLACING. FlexMatch locates resources for a new game session using the game session queue (set in the matchmaking configuration) and creates the game session based on the match data.    When the match is successfully placed, the matchmaking tickets move into COMPLETED status. Connection information (including game session endpoint and player session) is added to the matchmaking tickets. Matched players can use the connection information to join the game.       StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def startMatchmaking(): awsDashSdkLib.libRequestMod.Request[StartMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startMatchmaking(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartMatchmakingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules, and starts a new game for the matched players. Each matchmaking request specifies the type of match to build (team configuration, rules for an acceptable match, etc.). The request also specifies the players to find a match for and where to host the new game session for optimal performance. A matchmaking request might start with a single player or a group of players who want to play together. FlexMatch finds additional players as needed to fill the match. Match type, rules, and the queue used to place a new game session are defined in a MatchmakingConfiguration. For complete information on setting up and using FlexMatch, see the topic  Adding FlexMatch to Your Game. To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to be matched. You must also include a set of player attributes relevant for the matchmaking configuration. If successful, a matchmaking ticket is returned with status set to QUEUED. Track the status of the ticket to respond as needed and acquire game session connection information for successfully completed matches.  Tracking ticket status -- A couple of options are available for tracking the status of matchmaking requests:    Polling -- Call DescribeMatchmaking. This operation returns the full ticket object, including current status and (for completed tickets) game session connection info. We recommend polling no more than once every 10 seconds.   Notifications -- Get event notifications for changes in ticket status using Amazon Simple Notification Service (SNS). Notifications are easy to set up (see CreateMatchmakingConfiguration) and typically deliver match status changes faster and more efficiently than polling. We recommend that you use polling to back up to notifications (since delivery is not guaranteed) and call DescribeMatchmaking only when notifications are not received within 30 seconds.    Processing a matchmaking request -- FlexMatch handles a matchmaking request as follows:    Your client code submits a StartMatchmaking request for one or more players and tracks the status of the request ticket.    FlexMatch uses this ticket and others in process to build an acceptable match. When a potential match is identified, all tickets in the proposed match are advanced to the next status.    If the match requires player acceptance (set in the matchmaking configuration), the tickets move into status REQUIRES_ACCEPTANCE. This status triggers your client code to solicit acceptance from all players in every ticket involved in the match, and then call AcceptMatch for each player. If any player rejects or fails to accept the match before a specified timeout, the proposed match is dropped (see AcceptMatch for more details).   Once a match is proposed and accepted, the matchmaking tickets move into status PLACING. FlexMatch locates resources for a new game session using the game session queue (set in the matchmaking configuration) and creates the game session based on the match data.    When the match is successfully placed, the matchmaking tickets move into COMPLETED status. Connection information (including game session endpoint and player session) is added to the matchmaking tickets. Matched players can use the connection information to join the game.       StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def startMatchmaking(params: StartMatchmakingInput): awsDashSdkLib.libRequestMod.Request[StartMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startMatchmaking(
      params: StartMatchmakingInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartMatchmakingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Suspends activity on a fleet. Currently, this operation is used to stop a fleet's auto-scaling activity. It is used to temporarily stop scaling events triggered by the fleet's scaling policies. The policies can be retained and auto-scaling activity can be restarted using StartFleetActions. You can view a fleet's stopped actions using DescribeFleetAttributes. To stop fleet actions, specify the fleet ID and the type of actions to suspend. When auto-scaling fleet actions are stopped, Amazon GameLift no longer initiates scaling events except to maintain the fleet's desired instances setting (FleetCapacity. Changes to the fleet's capacity must be done manually using UpdateFleetCapacity. 
      */
    def stopFleetActions(): awsDashSdkLib.libRequestMod.Request[StopFleetActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopFleetActions(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopFleetActionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopFleetActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Suspends activity on a fleet. Currently, this operation is used to stop a fleet's auto-scaling activity. It is used to temporarily stop scaling events triggered by the fleet's scaling policies. The policies can be retained and auto-scaling activity can be restarted using StartFleetActions. You can view a fleet's stopped actions using DescribeFleetAttributes. To stop fleet actions, specify the fleet ID and the type of actions to suspend. When auto-scaling fleet actions are stopped, Amazon GameLift no longer initiates scaling events except to maintain the fleet's desired instances setting (FleetCapacity. Changes to the fleet's capacity must be done manually using UpdateFleetCapacity. 
      */
    def stopFleetActions(params: StopFleetActionsInput): awsDashSdkLib.libRequestMod.Request[StopFleetActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopFleetActions(
      params: StopFleetActionsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopFleetActionsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopFleetActionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a game session placement that is in PENDING status. To stop a placement, provide the placement ID values. If successful, the placement is moved to CANCELLED status.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def stopGameSessionPlacement(): awsDashSdkLib.libRequestMod.Request[StopGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopGameSessionPlacement(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopGameSessionPlacementOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a game session placement that is in PENDING status. To stop a placement, provide the placement ID values. If successful, the placement is moved to CANCELLED status.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def stopGameSessionPlacement(params: StopGameSessionPlacementInput): awsDashSdkLib.libRequestMod.Request[StopGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopGameSessionPlacement(
      params: StopGameSessionPlacementInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopGameSessionPlacementOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopGameSessionPlacementOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a matchmaking ticket that is currently being processed. To stop the matchmaking operation, specify the ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed to CANCELLED.    StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def stopMatchmaking(): awsDashSdkLib.libRequestMod.Request[StopMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopMatchmaking(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopMatchmakingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels a matchmaking ticket that is currently being processed. To stop the matchmaking operation, specify the ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed to CANCELLED.    StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
      */
    def stopMatchmaking(params: StopMatchmakingInput): awsDashSdkLib.libRequestMod.Request[StopMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def stopMatchmaking(
      params: StopMatchmakingInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StopMatchmakingOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StopMatchmakingOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If successful, the updated alias record is returned.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def updateAlias(): awsDashSdkLib.libRequestMod.Request[UpdateAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAlias(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAliasOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If successful, the updated alias record is returned.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
      */
    def updateAlias(params: UpdateAliasInput): awsDashSdkLib.libRequestMod.Request[UpdateAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAlias(
      params: UpdateAliasInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAliasOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAliasOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates metadata in a build record, including the build name and version. To update the metadata, specify the build ID to update and provide the new values. If successful, a build object containing the updated metadata is returned.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def updateBuild(): awsDashSdkLib.libRequestMod.Request[UpdateBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBuild(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBuildOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates metadata in a build record, including the build name and version. To update the metadata, specify the build ID to update and provide the new values. If successful, a build object containing the updated metadata is returned.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
      */
    def updateBuild(params: UpdateBuildInput): awsDashSdkLib.libRequestMod.Request[UpdateBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBuild(
      params: UpdateBuildInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBuildOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates fleet properties, including name and description, for a fleet. To update metadata, specify the fleet ID and the property values that you want to change. If successful, the fleet ID for the updated fleet is returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def updateFleetAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateFleetAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFleetAttributes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFleetAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFleetAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates fleet properties, including name and description, for a fleet. To update metadata, specify the fleet ID and the property values that you want to change. If successful, the fleet ID for the updated fleet is returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def updateFleetAttributes(params: UpdateFleetAttributesInput): awsDashSdkLib.libRequestMod.Request[UpdateFleetAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFleetAttributes(
      params: UpdateFleetAttributesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFleetAttributesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFleetAttributesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates capacity settings for a fleet. Use this action to specify the number of EC2 instances (hosts) that you want this fleet to contain. Before calling this action, you may want to call DescribeEC2InstanceLimits to get the maximum capacity based on the fleet's EC2 instance type. Specify minimum and maximum number of instances. Amazon GameLift will not change fleet capacity to values fall outside of this range. This is particularly important when using auto-scaling (see PutScalingPolicy) to allow capacity to adjust based on player demand while imposing limits on automatic adjustments. To update fleet capacity, specify the fleet ID and the number of instances you want the fleet to host. If successful, Amazon GameLift starts or terminates instances so that the fleet's active instance count matches the desired instance count. You can view a fleet's current capacity information by calling DescribeFleetCapacity. If the desired instance count is higher than the instance type's limit, the "Limit Exceeded" exception occurs.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def updateFleetCapacity(): awsDashSdkLib.libRequestMod.Request[UpdateFleetCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFleetCapacity(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFleetCapacityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFleetCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates capacity settings for a fleet. Use this action to specify the number of EC2 instances (hosts) that you want this fleet to contain. Before calling this action, you may want to call DescribeEC2InstanceLimits to get the maximum capacity based on the fleet's EC2 instance type. Specify minimum and maximum number of instances. Amazon GameLift will not change fleet capacity to values fall outside of this range. This is particularly important when using auto-scaling (see PutScalingPolicy) to allow capacity to adjust based on player demand while imposing limits on automatic adjustments. To update fleet capacity, specify the fleet ID and the number of instances you want the fleet to host. If successful, Amazon GameLift starts or terminates instances so that the fleet's active instance count matches the desired instance count. You can view a fleet's current capacity information by calling DescribeFleetCapacity. If the desired instance count is higher than the instance type's limit, the "Limit Exceeded" exception occurs.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def updateFleetCapacity(params: UpdateFleetCapacityInput): awsDashSdkLib.libRequestMod.Request[UpdateFleetCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFleetCapacity(
      params: UpdateFleetCapacityInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFleetCapacityOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFleetCapacityOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates port settings for a fleet. To update settings, specify the fleet ID to be updated and list the permissions you want to update. List the permissions you want to add in InboundPermissionAuthorizations, and permissions you want to remove in InboundPermissionRevocations. Permissions to be removed must match existing fleet permissions. If successful, the fleet ID for the updated fleet is returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def updateFleetPortSettings(): awsDashSdkLib.libRequestMod.Request[UpdateFleetPortSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFleetPortSettings(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFleetPortSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFleetPortSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates port settings for a fleet. To update settings, specify the fleet ID to be updated and list the permissions you want to update. List the permissions you want to add in InboundPermissionAuthorizations, and permissions you want to remove in InboundPermissionRevocations. Permissions to be removed must match existing fleet permissions. If successful, the fleet ID for the updated fleet is returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def updateFleetPortSettings(params: UpdateFleetPortSettingsInput): awsDashSdkLib.libRequestMod.Request[UpdateFleetPortSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateFleetPortSettings(
      params: UpdateFleetPortSettingsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateFleetPortSettingsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateFleetPortSettingsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates game session properties. This includes the session name, maximum player count, protection policy, which controls whether or not an active game session can be terminated during a scale-down event, and the player session creation policy, which controls whether or not new players can join the session. To update a game session, specify the game session ID and the values you want to change. If successful, an updated GameSession object is returned.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def updateGameSession(): awsDashSdkLib.libRequestMod.Request[UpdateGameSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGameSession(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGameSessionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGameSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates game session properties. This includes the session name, maximum player count, protection policy, which controls whether or not an active game session can be terminated during a scale-down event, and the player session creation policy, which controls whether or not new players can join the session. To update a game session, specify the game session ID and the values you want to change. If successful, an updated GameSession object is returned.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
      */
    def updateGameSession(params: UpdateGameSessionInput): awsDashSdkLib.libRequestMod.Request[UpdateGameSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGameSession(
      params: UpdateGameSessionInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGameSessionOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGameSessionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates settings for a game session queue, which determines how new game session requests in the queue are processed. To update settings, specify the queue name to be updated and provide the new settings. When updating destinations, provide a complete list of destinations.     CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
      */
    def updateGameSessionQueue(): awsDashSdkLib.libRequestMod.Request[UpdateGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGameSessionQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGameSessionQueueOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates settings for a game session queue, which determines how new game session requests in the queue are processed. To update settings, specify the queue name to be updated and provide the new settings. When updating destinations, provide a complete list of destinations.     CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
      */
    def updateGameSessionQueue(params: UpdateGameSessionQueueInput): awsDashSdkLib.libRequestMod.Request[UpdateGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateGameSessionQueue(
      params: UpdateGameSessionQueueInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateGameSessionQueueOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateGameSessionQueueOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates settings for a FlexMatch matchmaking configuration. To update settings, specify the configuration name to be updated and provide the new settings.     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def updateMatchmakingConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMatchmakingConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMatchmakingConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates settings for a FlexMatch matchmaking configuration. To update settings, specify the configuration name to be updated and provide the new settings.     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def updateMatchmakingConfiguration(params: UpdateMatchmakingConfigurationInput): awsDashSdkLib.libRequestMod.Request[UpdateMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateMatchmakingConfiguration(
      params: UpdateMatchmakingConfigurationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateMatchmakingConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateMatchmakingConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the current run-time configuration for the specified fleet, which tells Amazon GameLift how to launch server processes on instances in the fleet. You can update a fleet's run-time configuration at any time after the fleet is created; it does not need to be in an ACTIVE status. To update run-time configuration, specify the fleet ID and provide a RuntimeConfiguration object with the updated collection of server process configurations. Each instance in a Amazon GameLift fleet checks regularly for an updated run-time configuration and changes how it launches server processes to comply with the latest version. Existing server processes are not affected by the update; they continue to run until they end, while Amazon GameLift simply adds new server processes to fit the current run-time configuration. As a result, the run-time configuration changes are applied gradually as existing processes shut down and new processes are launched in Amazon GameLift's normal process recycling activity.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def updateRuntimeConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateRuntimeConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRuntimeConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRuntimeConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRuntimeConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the current run-time configuration for the specified fleet, which tells Amazon GameLift how to launch server processes on instances in the fleet. You can update a fleet's run-time configuration at any time after the fleet is created; it does not need to be in an ACTIVE status. To update run-time configuration, specify the fleet ID and provide a RuntimeConfiguration object with the updated collection of server process configurations. Each instance in a Amazon GameLift fleet checks regularly for an updated run-time configuration and changes how it launches server processes to comply with the latest version. Existing server processes are not affected by the update; they continue to run until they end, while Amazon GameLift simply adds new server processes to fit the current run-time configuration. As a result, the run-time configuration changes are applied gradually as existing processes shut down and new processes are launched in Amazon GameLift's normal process recycling activity.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
      */
    def updateRuntimeConfiguration(params: UpdateRuntimeConfigurationInput): awsDashSdkLib.libRequestMod.Request[UpdateRuntimeConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRuntimeConfiguration(
      params: UpdateRuntimeConfigurationInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRuntimeConfigurationOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRuntimeConfigurationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set is using syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a rule set JSON string.  Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def validateMatchmakingRuleSet(): awsDashSdkLib.libRequestMod.Request[ValidateMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validateMatchmakingRuleSet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ValidateMatchmakingRuleSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ValidateMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set is using syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a rule set JSON string.  Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
      */
    def validateMatchmakingRuleSet(params: ValidateMatchmakingRuleSetInput): awsDashSdkLib.libRequestMod.Request[ValidateMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def validateMatchmakingRuleSet(
      params: ValidateMatchmakingRuleSetInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ValidateMatchmakingRuleSetOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ValidateMatchmakingRuleSetOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateAliasInput extends js.Object {
    /**
      * Unique identifier for a fleet alias. Specify the alias you want to update.
      */
    var AliasId: AliasId
    /**
      * Human-readable description of an alias.
      */
    var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Descriptive label that is associated with an alias. Alias names do not need to be unique.
      */
    var Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined
    /**
      * Object that specifies the fleet and routing type to use for the alias.
      */
    var RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined
  }
  
  trait UpdateAliasOutput extends js.Object {
    /**
      * Object that contains the updated alias configuration.
      */
    var Alias: js.UndefOr[Alias] = js.undefined
  }
  
  trait UpdateBuildInput extends js.Object {
    /**
      * Unique identifier for a build to update.
      */
    var BuildId: BuildId
    /**
      * Descriptive label that is associated with a build. Build names do not need to be unique. 
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Version that is associated with this build. Version strings do not need to be unique.
      */
    var Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait UpdateBuildOutput extends js.Object {
    /**
      * Object that contains the updated build record.
      */
    var Build: js.UndefOr[Build] = js.undefined
  }
  
  trait UpdateFleetAttributesInput extends js.Object {
    /**
      * Human-readable description of a fleet.
      */
    var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a fleet to update attribute metadata for.
      */
    var FleetId: FleetId
    /**
      * Names of metric groups to include this fleet in. Amazon CloudWatch uses a fleet metric group is to aggregate metrics from multiple fleets. Use an existing metric group name to add this fleet to the group. Or use a new name to create a new metric group. A fleet can only be included in one metric group at a time.
      */
    var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
    /**
      * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Game session protection policy to apply to all new instances created in this fleet. Instances that already exist are not affected. You can set protection for individual instances using UpdateGameSession.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
      */
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
    /**
      * Policy that limits the number of game sessions an individual player can create over a span of time. 
      */
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined
  }
  
  trait UpdateFleetAttributesOutput extends js.Object {
    /**
      * Unique identifier for a fleet that was updated.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
  }
  
  trait UpdateFleetCapacityInput extends js.Object {
    /**
      * Number of EC2 instances you want this fleet to host.
      */
    var DesiredInstances: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Unique identifier for a fleet to update capacity for.
      */
    var FleetId: FleetId
    /**
      * Maximum value allowed for the fleet's instance count. Default if not set is 1.
      */
    var MaxSize: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Minimum value allowed for the fleet's instance count. Default if not set is 0.
      */
    var MinSize: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait UpdateFleetCapacityOutput extends js.Object {
    /**
      * Unique identifier for a fleet that was updated.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
  }
  
  trait UpdateFleetPortSettingsInput extends js.Object {
    /**
      * Unique identifier for a fleet to update port settings for.
      */
    var FleetId: FleetId
    /**
      * Collection of port settings to be added to the fleet record.
      */
    var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.undefined
    /**
      * Collection of port settings to be removed from the fleet record.
      */
    var InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.undefined
  }
  
  trait UpdateFleetPortSettingsOutput extends js.Object {
    /**
      * Unique identifier for a fleet that was updated.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
  }
  
  trait UpdateGameSessionInput extends js.Object {
    /**
      * Unique identifier for the game session to update.
      */
    var GameSessionId: ArnStringModel
    /**
      * Maximum number of players that can be connected simultaneously to the game session.
      */
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Descriptive label that is associated with a game session. Session names do not need to be unique.
      */
    var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Policy determining whether or not the game session accepts new players.
      */
    var PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy] = js.undefined
    /**
      * Game session protection policy to apply to this game session only.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
      */
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
  }
  
  trait UpdateGameSessionOutput extends js.Object {
    /**
      * Object that contains the updated game session metadata.
      */
    var GameSession: js.UndefOr[GameSession] = js.undefined
  }
  
  trait UpdateGameSessionQueueInput extends js.Object {
    /**
      * List of fleets that can be used to fulfill game session placement requests in the queue. Fleets are identified by either a fleet ARN or a fleet alias ARN. Destinations are listed in default preference order. When updating this list, provide a complete list of destinations.
      */
    var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined
    /**
      * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
      */
    var Name: GameSessionQueueName
    /**
      * Collection of latency policies to apply when processing game sessions placement requests with player latency information. Multiple policies are evaluated in order of the maximum latency value, starting with the lowest latency values. With just one policy, it is enforced at the start of the game session placement for the duration period. With multiple policies, each policy is enforced consecutively for its duration period. For example, a queue might enforce a 60-second policy followed by a 120-second policy, and then no policy for the remainder of the placement. When updating policies, provide a complete collection of policies.
      */
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined
    /**
      * Maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
      */
    var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
  }
  
  trait UpdateGameSessionQueueOutput extends js.Object {
    /**
      * Object that describes the newly updated game session queue.
      */
    var GameSessionQueue: js.UndefOr[GameSessionQueue] = js.undefined
  }
  
  trait UpdateMatchmakingConfigurationInput extends js.Object {
    /**
      * Flag that determines whether or not a match that was created with this configuration must be accepted by the matched players. To require acceptance, set to TRUE.
      */
    var AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined
    /**
      * Length of time (in seconds) to wait for players to accept a proposed match. If any player rejects the match or fails to accept before the timeout, the ticket continues to look for an acceptable match.
      */
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined
    /**
      * Number of player slots in a match to keep open for future players. For example, if the configuration's rule set specifies a match for a single 12-person team, and the additional player count is set to 2, only 10 players are selected for the match.
      */
    var AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined
    /**
      * Information to attached to all events related to the matchmaking configuration. 
      */
    var CustomEventData: js.UndefOr[CustomEventData] = js.undefined
    /**
      * Descriptive label that is associated with matchmaking configuration.
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
      * Amazon Resource Name (ARN) that is assigned to a game session queue and uniquely identifies it. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912. These queues are used when placing game sessions for matches that are created with this matchmaking configuration. Queues can be located in any region.
      */
    var GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined
    /**
      * Unique identifier for a matchmaking configuration to update.
      */
    var Name: MatchmakingIdStringModel
    /**
      * SNS topic ARN that is set up to receive matchmaking notifications. See  Setting up Notifications for Matchmaking for more information.
      */
    var NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined
    /**
      * Maximum duration, in seconds, that a matchmaking ticket can remain in process before timing out. Requests that time out can be resubmitted as needed.
      */
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined
    /**
      * Unique identifier for a matchmaking rule set to use with this configuration. A matchmaking configuration can only use rule sets that are defined in the same region.
      */
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
  }
  
  trait UpdateMatchmakingConfigurationOutput extends js.Object {
    /**
      * Object that describes the updated matchmaking configuration.
      */
    var Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
  }
  
  trait UpdateRuntimeConfigurationInput extends js.Object {
    /**
      * Unique identifier for a fleet to update run-time configuration for.
      */
    var FleetId: FleetId
    /**
      * Instructions for launching server processes on each instance in the fleet. The run-time configuration for a fleet has a collection of server process configurations, one for each type of server process to run on an instance. A server process configuration specifies the location of the server executable, launch parameters, and the number of concurrent processes with that configuration to maintain on each instance.
      */
    var RuntimeConfiguration: RuntimeConfiguration
  }
  
  trait UpdateRuntimeConfigurationOutput extends js.Object {
    /**
      * The run-time configuration currently in force. If the update was successful, this object matches the one in the request.
      */
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined
  }
  
  trait ValidateMatchmakingRuleSetInput extends js.Object {
    /**
      * Collection of matchmaking rules to validate, formatted as a JSON string.
      */
    var RuleSetBody: RuleSetBody
  }
  
  trait ValidateMatchmakingRuleSetOutput extends js.Object {
    /**
      * Response indicating whether or not the rule set is valid.
      */
    var Valid: js.UndefOr[BooleanModel] = js.undefined
  }
  
  trait VpcPeeringAuthorization extends js.Object {
    /**
      * Time stamp indicating when this authorization was issued. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var CreationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Time stamp indicating when this authorization expires (24 hours after issuance). Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
      */
    var ExpirationTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * Unique identifier for the AWS account that you use to manage your Amazon GameLift fleet. You can find your Account ID in the AWS Management Console under account settings.
      */
    var GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * 
      */
    var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
      */
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait VpcPeeringConnection extends js.Object {
    /**
      * Unique identifier for a fleet. This ID determines the ID of the Amazon GameLift VPC for your fleet.
      */
    var FleetId: js.UndefOr[FleetId] = js.undefined
    /**
      * Unique identifier for the VPC that contains the Amazon GameLift fleet for this connection. This VPC is managed by Amazon GameLift and does not appear in your AWS account. 
      */
    var GameLiftVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * CIDR block of IPv4 addresses assigned to the VPC peering connection for the GameLift VPC. The peered VPC also has an IPv4 CIDR block associated with it; these blocks cannot overlap or the peering connection cannot be created. 
      */
    var IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the same region where your fleet is deployed. Look up a VPC ID using the VPC Dashboard in the AWS Management Console. Learn more about VPC peering in VPC Peering with Amazon GameLift Fleets.
      */
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Object that contains status information about the connection. Status indicates if a connection is pending, successful, or failed.
      */
    var Status: js.UndefOr[VpcPeeringConnectionStatus] = js.undefined
    /**
      * Unique identifier that is automatically assigned to the connection record. This ID is referenced in VPC peering connection events, and is used when deleting a connection with DeleteVpcPeeringConnection. 
      */
    var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait VpcPeeringConnectionStatus extends js.Object {
    /**
      * Code indicating the status of a VPC peering connection.
      */
    var Code: js.UndefOr[NonZeroAndMaxString] = js.undefined
    /**
      * Additional messaging associated with the connection status. 
      */
    var Message: js.UndefOr[NonZeroAndMaxString] = js.undefined
  }
  
  trait _AcceptanceType extends js.Object
  
  trait _BuildStatus extends js.Object
  
  trait _ComparisonOperatorType extends js.Object
  
  trait _EC2InstanceType extends js.Object
  
  trait _EventCode extends js.Object
  
  trait _FleetStatus extends js.Object
  
  trait _FleetType extends js.Object
  
  trait _GameSessionPlacementState extends js.Object
  
  trait _GameSessionStatus extends js.Object
  
  trait _InstanceStatus extends js.Object
  
  trait _IpProtocol extends js.Object
  
  trait _MatchmakingConfigurationStatus extends js.Object
  
  trait _MetricName extends js.Object
  
  trait _OperatingSystem extends js.Object
  
  trait _PlayerSessionCreationPolicy extends js.Object
  
  trait _PlayerSessionStatus extends js.Object
  
  trait _PolicyType extends js.Object
  
  trait _ProtectionPolicy extends js.Object
  
  trait _RoutingStrategyType extends js.Object
  
  trait _ScalingAdjustmentType extends js.Object
  
  trait _ScalingStatusType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AcceptanceType = _AcceptanceType | java.lang.String
  type AliasId = java.lang.String
  type AliasList = js.Array[Alias]
  type ArnStringModel = java.lang.String
  type BooleanModel = scala.Boolean
  type BuildId = java.lang.String
  type BuildList = js.Array[Build]
  type BuildStatus = _BuildStatus | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComparisonOperatorType = _ComparisonOperatorType | java.lang.String
  type CustomEventData = java.lang.String
  type DesiredPlayerSessionList = js.Array[DesiredPlayerSession]
  type Double = scala.Double
  type DoubleObject = scala.Double
  type EC2InstanceLimitList = js.Array[EC2InstanceLimit]
  type EC2InstanceType = _EC2InstanceType | java.lang.String
  type EventCode = _EventCode | java.lang.String
  type EventList = js.Array[Event]
  type FleetAction = awsDashSdkLib.awsDashSdkLibStrings.AUTO_SCALING | java.lang.String
  type FleetActionList = js.Array[FleetAction]
  type FleetAttributesList = js.Array[FleetAttributes]
  type FleetCapacityList = js.Array[FleetCapacity]
  type FleetId = java.lang.String
  type FleetIdList = js.Array[FleetId]
  type FleetStatus = _FleetStatus | java.lang.String
  type FleetType = _FleetType | java.lang.String
  type FleetUtilizationList = js.Array[FleetUtilization]
  type Float = scala.Double
  type FreeText = java.lang.String
  type GamePropertyKey = java.lang.String
  type GamePropertyList = js.Array[GameProperty]
  type GamePropertyValue = java.lang.String
  type GameSessionActivationTimeoutSeconds = scala.Double
  type GameSessionData = java.lang.String
  type GameSessionDetailList = js.Array[GameSessionDetail]
  type GameSessionList = js.Array[GameSession]
  type GameSessionPlacementState = _GameSessionPlacementState | java.lang.String
  type GameSessionQueueDestinationList = js.Array[GameSessionQueueDestination]
  type GameSessionQueueList = js.Array[GameSessionQueue]
  type GameSessionQueueName = java.lang.String
  type GameSessionQueueNameList = js.Array[GameSessionQueueName]
  type GameSessionStatus = _GameSessionStatus | java.lang.String
  type GameSessionStatusReason = awsDashSdkLib.awsDashSdkLibStrings.INTERRUPTED | java.lang.String
  type IdStringModel = java.lang.String
  type InstanceId = java.lang.String
  type InstanceList = js.Array[Instance]
  type InstanceStatus = _InstanceStatus | java.lang.String
  type Integer = scala.Double
  type IpAddress = java.lang.String
  type IpPermissionsList = js.Array[IpPermission]
  type IpProtocol = _IpProtocol | java.lang.String
  type MatchedPlayerSessionList = js.Array[MatchedPlayerSession]
  type MatchmakerData = java.lang.String
  type MatchmakingAcceptanceTimeoutInteger = scala.Double
  type MatchmakingConfigurationList = js.Array[MatchmakingConfiguration]
  type MatchmakingConfigurationStatus = _MatchmakingConfigurationStatus | java.lang.String
  type MatchmakingIdList = js.Array[MatchmakingIdStringModel]
  type MatchmakingIdStringModel = java.lang.String
  type MatchmakingRequestTimeoutInteger = scala.Double
  type MatchmakingRuleSetList = js.Array[MatchmakingRuleSet]
  type MatchmakingRuleSetNameList = js.Array[MatchmakingIdStringModel]
  type MatchmakingTicketList = js.Array[MatchmakingTicket]
  type MaxConcurrentGameSessionActivations = scala.Double
  type MetricGroup = java.lang.String
  type MetricGroupList = js.Array[MetricGroup]
  type MetricName = _MetricName | java.lang.String
  type NonBlankAndLengthConstraintString = java.lang.String
  type NonBlankString = java.lang.String
  type NonEmptyString = java.lang.String
  type NonZeroAndMaxString = java.lang.String
  type OperatingSystem = _OperatingSystem | java.lang.String
  type PlacedPlayerSessionList = js.Array[PlacedPlayerSession]
  type PlayerData = java.lang.String
  type PlayerIdList = js.Array[NonZeroAndMaxString]
  type PlayerLatencyList = js.Array[PlayerLatency]
  type PlayerLatencyPolicyList = js.Array[PlayerLatencyPolicy]
  type PlayerList = js.Array[Player]
  type PlayerSessionCreationPolicy = _PlayerSessionCreationPolicy | java.lang.String
  type PlayerSessionId = java.lang.String
  type PlayerSessionList = js.Array[PlayerSession]
  type PlayerSessionStatus = _PlayerSessionStatus | java.lang.String
  type PolicyType = _PolicyType | java.lang.String
  type PortNumber = scala.Double
  type PositiveInteger = scala.Double
  type PositiveLong = scala.Double
  type ProtectionPolicy = _ProtectionPolicy | java.lang.String
  type QueueArnsList = js.Array[ArnStringModel]
  type RoutingStrategyType = _RoutingStrategyType | java.lang.String
  type RuleSetBody = java.lang.String
  type RuleSetLimit = scala.Double
  type ScalingAdjustmentType = _ScalingAdjustmentType | java.lang.String
  type ScalingPolicyList = js.Array[ScalingPolicy]
  type ScalingStatusType = _ScalingStatusType | java.lang.String
  type ServerProcessList = js.Array[ServerProcess]
  type SnsArnStringModel = java.lang.String
  type StringList = js.Array[NonZeroAndMaxString]
  type StringModel = java.lang.String
  type Timestamp = stdLib.Date
  type VpcPeeringAuthorizationList = js.Array[VpcPeeringAuthorization]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  type WholeNumber = scala.Double
  type apiVersion = _apiVersion | java.lang.String
}

