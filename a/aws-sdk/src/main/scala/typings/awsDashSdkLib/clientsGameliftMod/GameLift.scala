package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GameLift
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_GameLift: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsGameliftMod.GameLiftNs.ClientConfiguration = js.native
  /**
    * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may require player acceptance; if so, then matches built with that configuration cannot be completed unless all players accept the proposed match within a specified time limit.  When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status REQUIRES_ACCEPTANCE. This is a trigger for your game to get acceptance from all players in the ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an error. To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have registered acceptance, the matchmaking tickets advance to status PLACING, where a new game session is created for the match.  If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where all players accepted the match, the ticket status is returned to SEARCHING to find a new match. For tickets where one or more players failed to accept the match, the ticket status is set to FAILED, and processing is terminated. A new matchmaking request for these players can be submitted as needed.     StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def acceptMatch(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.AcceptMatchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptMatch(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.AcceptMatchOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.AcceptMatchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may require player acceptance; if so, then matches built with that configuration cannot be completed unless all players accept the proposed match within a specified time limit.  When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status REQUIRES_ACCEPTANCE. This is a trigger for your game to get acceptance from all players in the ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an error. To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have registered acceptance, the matchmaking tickets advance to status PLACING, where a new game session is created for the match.  If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where all players accepted the match, the ticket status is returned to SEARCHING to find a new match. For tickets where one or more players failed to accept the match, the ticket status is set to FAILED, and processing is terminated. A new matchmaking request for these players can be submitted as needed.     StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def acceptMatch(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.AcceptMatchInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.AcceptMatchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def acceptMatch(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.AcceptMatchInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.AcceptMatchOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.AcceptMatchOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. By using a fleet alias instead of a specific fleet ID, you can switch gameplay and players to a new fleet without changing your game client or other game components. For example, for games in production, using an alias allows you to seamlessly redirect your player base to a new game server update.  Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you want to direct players to an upgrade site.  To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned, including an alias ID, which you can reference when creating a game session. You can reassign an alias to another fleet by calling UpdateAlias.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def createAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateAliasOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. By using a fleet alias instead of a specific fleet ID, you can switch gameplay and players to a new fleet without changing your game client or other game components. For example, for games in production, using an alias allows you to seamlessly redirect your player base to a new game server update.  Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you want to direct players to an upgrade site.  To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned, including an alias ID, which you can reference when creating a game session. You can reassign an alias to another fleet by calling UpdateAlias.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def createAlias(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateAliasInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAlias(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateAliasInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateAliasOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon GameLift build record for your game server binary files and points to the location of your game server build files in an Amazon Simple Storage Service (Amazon S3) location.  Game server binaries must be combined into a .zip file for use with Amazon GameLift. See Uploading Your Game for more information.   To create new builds quickly and easily, use the AWS CLI command  upload-build . This helper command uploads your build and creates a new build record in one step, and automatically handles the necessary permissions. See  Upload Build Files to Amazon GameLift for more help.  The CreateBuild operation should be used only when you need to manually upload your build files, as in the following scenarios:   Store a build file in an Amazon S3 bucket under your own AWS account. To use this option, you must first give Amazon GameLift access to that Amazon S3 bucket. See  Create a Build with Files in Amazon S3 for detailed help. To create a new build record using files in your Amazon S3 bucket, call CreateBuild and specify a build name, operating system, and the storage location of your game build.   Upload a build file directly to Amazon GameLift's Amazon S3 account. To use this option, you first call CreateBuild with a build name and operating system. This action creates a new build record and returns an Amazon S3 storage location (bucket and key only) and temporary access credentials. Use the credentials to manually upload your build file to the storage location (see the Amazon S3 topic Uploading Objects). You can upload files to a location only once.    If successful, this operation creates a new build record with a unique build ID and places it in INITIALIZED status. You can use DescribeBuild to check the status of your build. A build must be in READY status before it can be used to create fleets.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
    */
  def createBuild(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBuild(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon GameLift build record for your game server binary files and points to the location of your game server build files in an Amazon Simple Storage Service (Amazon S3) location.  Game server binaries must be combined into a .zip file for use with Amazon GameLift. See Uploading Your Game for more information.   To create new builds quickly and easily, use the AWS CLI command  upload-build . This helper command uploads your build and creates a new build record in one step, and automatically handles the necessary permissions. See  Upload Build Files to Amazon GameLift for more help.  The CreateBuild operation should be used only when you need to manually upload your build files, as in the following scenarios:   Store a build file in an Amazon S3 bucket under your own AWS account. To use this option, you must first give Amazon GameLift access to that Amazon S3 bucket. See  Create a Build with Files in Amazon S3 for detailed help. To create a new build record using files in your Amazon S3 bucket, call CreateBuild and specify a build name, operating system, and the storage location of your game build.   Upload a build file directly to Amazon GameLift's Amazon S3 account. To use this option, you first call CreateBuild with a build name and operating system. This action creates a new build record and returns an Amazon S3 storage location (bucket and key only) and temporary access credentials. Use the credentials to manually upload your build file to the storage location (see the Amazon S3 topic Uploading Objects). You can upload files to a location only once.    If successful, this operation creates a new build record with a unique build ID and places it in INITIALIZED status. You can use DescribeBuild to check the status of your build. A build must be in READY status before it can be used to create fleets.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
    */
  def createBuild(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateBuildInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createBuild(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateBuildInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new fleet to run your game servers. A fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances, each of which can run multiple server processes to host game sessions. You set up a fleet to use instances with certain hardware specifications (see Amazon EC2 Instance Types), and deploy your game build to the fleet.  To create a new fleet, you must provide the following: (1) a fleet name, (2) an EC2 instance type, (3) the build ID for your game build, and (4) a run-time configuration, which specifies the server processes to run on each instance in the fleet. If fleet type is not set, the new fleet will use on-demand instances by default. If the CreateFleet call is successful, Amazon GameLift performs the following tasks. You can track the process of a fleet by checking the fleet status or by monitoring fleet creation events:   Creates a fleet record. Status: NEW.   Begins writing events to the fleet event log, which can be accessed in the Amazon GameLift console. Sets the fleet's target capacity to 1 (desired instances), which triggers Amazon GameLift to start one new EC2 instance.   Downloads the game build to the new instance and installs it. Statuses: DOWNLOADING, VALIDATING, BUILDING.    Starts launching server processes on the instance. If the fleet is configured to run multiple server processes per instance, Amazon GameLift staggers each launch by a few seconds. Status: ACTIVATING.   Sets the fleet's status to ACTIVE as soon as one server process is ready to host a game session.    Learn more  See Amazon GameLift Developer Guide topics in  Working with Fleets.  Related operations     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def createFleet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateFleetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateFleetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateFleetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new fleet to run your game servers. A fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances, each of which can run multiple server processes to host game sessions. You set up a fleet to use instances with certain hardware specifications (see Amazon EC2 Instance Types), and deploy your game build to the fleet.  To create a new fleet, you must provide the following: (1) a fleet name, (2) an EC2 instance type, (3) the build ID for your game build, and (4) a run-time configuration, which specifies the server processes to run on each instance in the fleet. If fleet type is not set, the new fleet will use on-demand instances by default. If the CreateFleet call is successful, Amazon GameLift performs the following tasks. You can track the process of a fleet by checking the fleet status or by monitoring fleet creation events:   Creates a fleet record. Status: NEW.   Begins writing events to the fleet event log, which can be accessed in the Amazon GameLift console. Sets the fleet's target capacity to 1 (desired instances), which triggers Amazon GameLift to start one new EC2 instance.   Downloads the game build to the new instance and installs it. Statuses: DOWNLOADING, VALIDATING, BUILDING.    Starts launching server processes on the instance. If the fleet is configured to run multiple server processes per instance, Amazon GameLift staggers each launch by a few seconds. Status: ACTIVATING.   Sets the fleet's status to ACTIVE as soon as one server process is ready to host a game session.    Learn more  See Amazon GameLift Developer Guide topics in  Working with Fleets.  Related operations     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def createFleet(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateFleetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateFleetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createFleet(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateFleetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateFleetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateFleetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a multiplayer game session for players. This action creates a game session record and assigns an available server process in the specified fleet to host the game session. A fleet must have an ACTIVE status before a game session can be created in it. To create a game session, specify either fleet ID or alias ID and indicate a maximum number of players to allow in the game session. You can also provide a name and game-specific properties for this game session. If successful, a GameSession object is returned containing the game session properties and other settings you specified.  Idempotency tokens. You can add a token that uniquely identifies game session requests. This is useful for ensuring that game session requests are idempotent. Multiple requests with the same idempotency token are processed only once; subsequent requests return the original result. All response values are the same with the exception of game session status, which may change.  Resource creation limits. If you are creating a game session on a fleet with a resource creation limit policy in force, then you must specify a creator ID. Without this ID, Amazon GameLift has no way to evaluate the policy for this new game session request.  Player acceptance policy. By default, newly created game sessions are open to new players. You can restrict new player access by using UpdateGameSession to change the game session's player session creation policy.  Game session logs. Logs are retained for all active game sessions for 14 days. To access the logs, call GetGameSessionLogUrl to download the log files.  Available in Amazon GameLift Local.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def createGameSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGameSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a multiplayer game session for players. This action creates a game session record and assigns an available server process in the specified fleet to host the game session. A fleet must have an ACTIVE status before a game session can be created in it. To create a game session, specify either fleet ID or alias ID and indicate a maximum number of players to allow in the game session. You can also provide a name and game-specific properties for this game session. If successful, a GameSession object is returned containing the game session properties and other settings you specified.  Idempotency tokens. You can add a token that uniquely identifies game session requests. This is useful for ensuring that game session requests are idempotent. Multiple requests with the same idempotency token are processed only once; subsequent requests return the original result. All response values are the same with the exception of game session status, which may change.  Resource creation limits. If you are creating a game session on a fleet with a resource creation limit policy in force, then you must specify a creator ID. Without this ID, Amazon GameLift has no way to evaluate the policy for this new game session request.  Player acceptance policy. By default, newly created game sessions are open to new players. You can restrict new player access by using UpdateGameSession to change the game session's player session creation policy.  Game session logs. Logs are retained for all active game sessions for 14 days. To access the logs, call GetGameSessionLogUrl to download the log files.  Available in Amazon GameLift Local.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def createGameSession(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGameSession(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Establishes a new queue for processing requests to place new game sessions. A queue identifies where new game sessions can be hosted -- by specifying a list of destinations (fleets or aliases) -- and how long requests can wait in the queue before timing out. You can set up a queue to try to place game sessions on fleets in multiple regions. To add placement requests to a queue, call StartGameSessionPlacement and reference the queue name.  Destination order. When processing a request for a game session, Amazon GameLift tries each destination in order until it finds one with available resources to host the new game session. A queue's default order is determined by how destinations are listed. The default order is overridden when a game session placement request provides player latency information. Player latency information enables Amazon GameLift to prioritize destinations where players report the lowest average latency, as a result placing the new game session where the majority of players will have the best possible gameplay experience.  Player latency policies. For placement requests containing player latency information, use player latency policies to protect individual players from very high latencies. With a latency cap, even when a destination can deliver a low latency for most players, the game is not placed where any individual player is reporting latency higher than a policy's maximum. A queue can have multiple latency policies, which are enforced consecutively starting with the policy with the lowest latency cap. Use multiple policies to gradually relax latency controls; for example, you might set a policy with a low latency cap for the first 60 seconds, a second policy with a higher cap for the next 60 seconds, etc.  To create a new queue, provide a name, timeout value, a list of destinations and, if desired, a set of latency policies. If successful, a new queue object is returned.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
    */
  def createGameSessionQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGameSessionQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionQueueOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Establishes a new queue for processing requests to place new game sessions. A queue identifies where new game sessions can be hosted -- by specifying a list of destinations (fleets or aliases) -- and how long requests can wait in the queue before timing out. You can set up a queue to try to place game sessions on fleets in multiple regions. To add placement requests to a queue, call StartGameSessionPlacement and reference the queue name.  Destination order. When processing a request for a game session, Amazon GameLift tries each destination in order until it finds one with available resources to host the new game session. A queue's default order is determined by how destinations are listed. The default order is overridden when a game session placement request provides player latency information. Player latency information enables Amazon GameLift to prioritize destinations where players report the lowest average latency, as a result placing the new game session where the majority of players will have the best possible gameplay experience.  Player latency policies. For placement requests containing player latency information, use player latency policies to protect individual players from very high latencies. With a latency cap, even when a destination can deliver a low latency for most players, the game is not placed where any individual player is reporting latency higher than a policy's maximum. A queue can have multiple latency policies, which are enforced consecutively starting with the policy with the lowest latency cap. Use multiple policies to gradually relax latency controls; for example, you might set a policy with a low latency cap for the first 60 seconds, a second policy with a higher cap for the next 60 seconds, etc.  To create a new queue, provide a name, timeout value, a list of destinations and, if desired, a set of latency policies. If successful, a new queue object is returned.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
    */
  def createGameSessionQueue(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionQueueInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGameSessionQueue(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionQueueInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionQueueOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Defines a new matchmaking configuration for use with FlexMatch. A matchmaking configuration sets out guidelines for matching players and getting the matches into games. You can set up multiple matchmaking configurations to handle the scenarios needed for your game. Each matchmaking ticket (StartMatchmaking or StartMatchBackfill) specifies a configuration for the match and provides player attributes to support the configuration being used.  To create a matchmaking configuration, at a minimum you must specify the following: configuration name; a rule set that governs how to evaluate players and find acceptable matches; a game session queue to use when placing a new game session for the match; and the maximum time allowed for a matchmaking attempt.  Player acceptance -- In each configuration, you have the option to require that all players accept participation in a proposed match. To enable this feature, set AcceptanceRequired to true and specify a time limit for player acceptance. Players have the option to accept or reject a proposed match, and a match does not move ahead to game session placement unless all matched players accept.   Matchmaking status notification -- There are two ways to track the progress of matchmaking tickets: (1) polling ticket status with DescribeMatchmaking; or (2) receiving notifications with Amazon Simple Notification Service (SNS). To use notifications, you first need to set up an SNS topic to receive the notifications, and provide the topic ARN in the matchmaking configuration (see  Setting up Notifications for Matchmaking). Since notifications promise only "best effort" delivery, we recommend calling DescribeMatchmaking if no notifications are received within 30 seconds.    CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def createMatchmakingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMatchmakingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Defines a new matchmaking configuration for use with FlexMatch. A matchmaking configuration sets out guidelines for matching players and getting the matches into games. You can set up multiple matchmaking configurations to handle the scenarios needed for your game. Each matchmaking ticket (StartMatchmaking or StartMatchBackfill) specifies a configuration for the match and provides player attributes to support the configuration being used.  To create a matchmaking configuration, at a minimum you must specify the following: configuration name; a rule set that governs how to evaluate players and find acceptable matches; a game session queue to use when placing a new game session for the match; and the maximum time allowed for a matchmaking attempt.  Player acceptance -- In each configuration, you have the option to require that all players accept participation in a proposed match. To enable this feature, set AcceptanceRequired to true and specify a time limit for player acceptance. Players have the option to accept or reject a proposed match, and a match does not move ahead to game session placement unless all matched players accept.   Matchmaking status notification -- There are two ways to track the progress of matchmaking tickets: (1) polling ticket status with DescribeMatchmaking; or (2) receiving notifications with Amazon Simple Notification Service (SNS). To use notifications, you first need to set up an SNS topic to receive the notifications, and provide the topic ARN in the matchmaking configuration (see  Setting up Notifications for Matchmaking). Since notifications promise only "best effort" delivery, we recommend calling DescribeMatchmaking if no notifications are received within 30 seconds.    CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def createMatchmakingConfiguration(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingConfigurationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMatchmakingConfiguration(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingConfigurationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the number and size of teams, and sets the parameters for acceptable player matches, such as minimum skill level or character type. A rule set is used by a MatchmakingConfiguration.  To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets must be defined in the same region as the matchmaking configuration they will be used with. Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using ValidateMatchmakingRuleSet before creating a new rule set.  Learn more     Build a Rule Set     Design a Matchmaker     Matchmaking with FlexMatch     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def createMatchmakingRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMatchmakingRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingRuleSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the number and size of teams, and sets the parameters for acceptable player matches, such as minimum skill level or character type. A rule set is used by a MatchmakingConfiguration.  To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets must be defined in the same region as the matchmaking configuration they will be used with. Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using ValidateMatchmakingRuleSet before creating a new rule set.  Learn more     Build a Rule Set     Design a Matchmaker     Matchmaking with FlexMatch     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def createMatchmakingRuleSet(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingRuleSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createMatchmakingRuleSet(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingRuleSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingRuleSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a player to a game session and creates a player session record. Before a player can be added, a game session must have an ACTIVE status, have a creation policy of ALLOW_ALL, and have an open player slot. To add a group of players to a game session, use CreatePlayerSessions. To create a player session, specify a game session ID, player ID, and optionally a string of player data. If successful, the player is added to the game session and a new PlayerSession object is returned. Player sessions cannot be updated.   Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def createPlayerSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPlayerSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a player to a game session and creates a player session record. Before a player can be added, a game session must have an ACTIVE status, have a creation policy of ALLOW_ALL, and have an open player slot. To add a group of players to a game session, use CreatePlayerSessions. To create a player session, specify a game session ID, player ID, and optionally a string of player data. If successful, the player is added to the game session and a new PlayerSession object is returned. Player sessions cannot be updated.   Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def createPlayerSession(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPlayerSession(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a group of players to a game session. This action is useful with a team matching feature. Before players can be added, a game session must have an ACTIVE status, have a creation policy of ALLOW_ALL, and have an open player slot. To add a single player to a game session, use CreatePlayerSession. To create player sessions, specify a game session ID, a list of player IDs, and optionally a set of player data strings. If successful, the players are added to the game session and a set of new PlayerSession objects is returned. Player sessions cannot be updated.  Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def createPlayerSessions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPlayerSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds a group of players to a game session. This action is useful with a team matching feature. Before players can be added, a game session must have an ACTIVE status, have a creation policy of ALLOW_ALL, and have an open player slot. To add a single player to a game session, use CreatePlayerSession. To create player sessions, specify a game session ID, a list of player IDs, and optionally a set of player data strings. If successful, the players are added to the game session and a set of new PlayerSession objects is returned. Player sessions cannot be updated.  Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def createPlayerSessions(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPlayerSessions(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreatePlayerSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to communicate directly with other AWS resources. Once you've received authorization, call CreateVpcPeeringConnection to establish the peering connection. For more information, see VPC Peering with Amazon GameLift Fleets. You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. To request authorization to create a connection, call this operation from the AWS account with the VPC that you want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If successful, VPC peering is authorized for the specified VPC.  To request authorization to delete a connection, call this operation from the AWS account with the VPC that is peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.  The authorization remains valid for 24 hours unless it is canceled by a call to DeleteVpcPeeringAuthorization. You must create or delete the peering connection while the authorization is valid.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def createVpcPeeringAuthorization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringAuthorizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcPeeringAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringAuthorizationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringAuthorizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to communicate directly with other AWS resources. Once you've received authorization, call CreateVpcPeeringConnection to establish the peering connection. For more information, see VPC Peering with Amazon GameLift Fleets. You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. To request authorization to create a connection, call this operation from the AWS account with the VPC that you want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If successful, VPC peering is authorized for the specified VPC.  To request authorization to delete a connection, call this operation from the AWS account with the VPC that is peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.  The authorization remains valid for 24 hours unless it is canceled by a call to DeleteVpcPeeringAuthorization. You must create or delete the peering connection while the authorization is valid.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def createVpcPeeringAuthorization(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringAuthorizationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringAuthorizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcPeeringAuthorization(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringAuthorizationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringAuthorizationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringAuthorizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. For more information, see VPC Peering with Amazon GameLift Fleets. Before calling this operation to establish the peering connection, you first need to call CreateVpcPeeringAuthorization and identify the VPC you want to peer with. Once the authorization for the specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks necessary to peer the two VPCs, including acceptance, updating routing tables, etc.  To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer with. This operation is asynchronous. If successful, a VpcPeeringConnection request is created. You can use continuous polling to track the request's status using DescribeVpcPeeringConnections, or by monitoring fleet events for success or failure using DescribeFleetEvents.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def createVpcPeeringConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringConnectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcPeeringConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringConnectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringConnectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different regions. For more information, see VPC Peering with Amazon GameLift Fleets. Before calling this operation to establish the peering connection, you first need to call CreateVpcPeeringAuthorization and identify the VPC you want to peer with. Once the authorization for the specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks necessary to peer the two VPCs, including acceptance, updating routing tables, etc.  To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer with. This operation is asynchronous. If successful, a VpcPeeringConnection request is created. You can use continuous polling to track the request's status using DescribeVpcPeeringConnections, or by monitoring fleet events for success or failure using DescribeFleetEvents.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def createVpcPeeringConnection(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringConnectionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringConnectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVpcPeeringConnection(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringConnectionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringConnectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.CreateVpcPeeringConnectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteAlias(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteAliasInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAlias(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteAliasInput,
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
  def deleteBuild(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteBuildInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteBuild(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteBuildInput,
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
  def deleteFleet(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteFleetInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFleet(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteFleetInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a game session queue. This action means that any StartGameSessionPlacement requests that reference this queue will fail. To delete a queue, specify the queue name.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
    */
  def deleteGameSessionQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteGameSessionQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteGameSessionQueueOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a game session queue. This action means that any StartGameSessionPlacement requests that reference this queue will fail. To delete a queue, specify the queue name.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
    */
  def deleteGameSessionQueue(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteGameSessionQueueInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteGameSessionQueue(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteGameSessionQueueInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteGameSessionQueueOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.    CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def deleteMatchmakingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMatchmakingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.    CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def deleteMatchmakingConfiguration(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingConfigurationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMatchmakingConfiguration(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingConfigurationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing matchmaking rule set. To delete the rule set, provide the rule set name. Rule sets cannot be deleted if they are currently being used by a matchmaking configuration.   Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def deleteMatchmakingRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMatchmakingRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingRuleSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing matchmaking rule set. To delete the rule set, provide the rule set name. Rule sets cannot be deleted if they are currently being used by a matchmaking configuration.   Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def deleteMatchmakingRuleSet(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingRuleSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteMatchmakingRuleSet(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingRuleSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingRuleSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteScalingPolicy(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteScalingPolicyInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteScalingPolicy(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteScalingPolicyInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Cancels a pending VPC peering authorization for the specified VPC. If the authorization has already been used to create a peering connection, call DeleteVpcPeeringConnection to remove the connection.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def deleteVpcPeeringAuthorization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringAuthorizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcPeeringAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringAuthorizationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringAuthorizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a pending VPC peering authorization for the specified VPC. If the authorization has already been used to create a peering connection, call DeleteVpcPeeringConnection to remove the connection.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def deleteVpcPeeringAuthorization(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringAuthorizationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringAuthorizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcPeeringAuthorization(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringAuthorizationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringAuthorizationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringAuthorizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC peering connection that you want to delete. You can check for an authorization by calling DescribeVpcPeeringAuthorizations or request a new one using CreateVpcPeeringAuthorization.  Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the connection is removed.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def deleteVpcPeeringConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringConnectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcPeeringConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringConnectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringConnectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC peering connection that you want to delete. You can check for an authorization by calling DescribeVpcPeeringAuthorizations or request a new one using CreateVpcPeeringAuthorization.  Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the connection is removed.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def deleteVpcPeeringConnection(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringConnectionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringConnectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteVpcPeeringConnection(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringConnectionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringConnectionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DeleteVpcPeeringConnectionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's target fleet ID only, use ResolveAlias.  To get alias properties, specify the alias ID. If successful, the requested alias record is returned.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def describeAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeAliasOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's target fleet ID only, use ResolveAlias.  To get alias properties, specify the alias ID. If successful, the requested alias record is returned.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def describeAlias(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeAliasInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeAlias(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeAliasInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeAliasOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties for a build. To request a build record, specify a build ID. If successful, an object containing the build properties is returned.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
    */
  def describeBuild(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBuild(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties for a build. To request a build record, specify a build ID. If successful, an object containing the build properties is returned.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
    */
  def describeBuild(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeBuildInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeBuild(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeBuildInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the following information for the specified EC2 instance type:   maximum number of instances allowed per AWS account (service limit)   current usage level for the AWS account   Service limits vary depending on region. Available regions for Amazon GameLift can be found in the AWS Management Console for Amazon GameLift (see the drop-down list in the upper right corner).    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeEC2InstanceLimits(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeEC2InstanceLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEC2InstanceLimits(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeEC2InstanceLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeEC2InstanceLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the following information for the specified EC2 instance type:   maximum number of instances allowed per AWS account (service limit)   current usage level for the AWS account   Service limits vary depending on region. Available regions for Amazon GameLift can be found in the AWS Management Console for Amazon GameLift (see the drop-down list in the upper right corner).    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeEC2InstanceLimits(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeEC2InstanceLimitsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeEC2InstanceLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeEC2InstanceLimits(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeEC2InstanceLimitsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeEC2InstanceLimitsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeEC2InstanceLimitsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets. You can request attributes for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetAttributes object is returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets. You can request attributes for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetAttributes object is returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetAttributes(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetAttributes(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the current status of fleet capacity for one or more fleets. This information includes the number of instances that have been requested for the fleet and the number currently active. You can request capacity for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetCapacity object is returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetCapacity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetCapacityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetCapacity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetCapacityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetCapacityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the current status of fleet capacity for one or more fleets. This information includes the number of instances that have been requested for the fleet and the number currently active. You can request capacity for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetCapacity object is returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetCapacity(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetCapacityInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetCapacityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetCapacity(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetCapacityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetCapacityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetCapacityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves entries from the specified fleet's event log. You can specify a time range to limit the result set. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a collection of event log entries matching the request are returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetEventsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves entries from the specified fleet's event log. You can specify a time range to limit the result set. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a collection of event log entries matching the request are returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetEvents(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetEventsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetEvents(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetEventsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetEventsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetEventsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the inbound connection permissions for a fleet. Connection permissions include a range of IP addresses and port settings that incoming traffic can use to access server processes in the fleet. To get a fleet's inbound connection permissions, specify a fleet ID. If successful, a collection of IpPermission objects is returned for the requested fleet ID. If the requested fleet has been deleted, the result set is empty.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetPortSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetPortSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetPortSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetPortSettingsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetPortSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the inbound connection permissions for a fleet. Connection permissions include a range of IP addresses and port settings that incoming traffic can use to access server processes in the fleet. To get a fleet's inbound connection permissions, specify a fleet ID. If successful, a collection of IpPermission objects is returned for the requested fleet ID. If the requested fleet has been deleted, the result set is empty.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetPortSettings(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetPortSettingsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetPortSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetPortSettings(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetPortSettingsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetPortSettingsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetPortSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves utilization statistics for one or more fleets. You can request utilization data for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetUtilization object is returned for each requested fleet ID. When specifying a list of fleet IDs, utilization objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetUtilization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetUtilizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetUtilization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetUtilizationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetUtilizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves utilization statistics for one or more fleets. You can request utilization data for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a FleetUtilization object is returned for each requested fleet ID. When specifying a list of fleet IDs, utilization objects are returned only for fleets that currently exist.   Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the request fails and the error message includes the maximum allowed.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeFleetUtilization(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetUtilizationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetUtilizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeFleetUtilization(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetUtilizationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetUtilizationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeFleetUtilizationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties, including the protection policy in force, for one or more game sessions. This action can be used in several ways: (1) provide a GameSessionId or GameSessionArn to request details for a specific game session; (2) provide either a FleetId or an AliasId to request properties for all game sessions running on a fleet.  To get game session record(s), specify just one of the following: game session ID, fleet ID, or alias ID. You can filter this request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSessionDetail object is returned for each session matching the request.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def describeGameSessionDetails(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGameSessionDetails(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionDetailsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties, including the protection policy in force, for one or more game sessions. This action can be used in several ways: (1) provide a GameSessionId or GameSessionArn to request details for a specific game session; (2) provide either a FleetId or an AliasId to request properties for all game sessions running on a fleet.  To get game session record(s), specify just one of the following: game session ID, fleet ID, or alias ID. You can filter this request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSessionDetail object is returned for each session matching the request.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def describeGameSessionDetails(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionDetailsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGameSessionDetails(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionDetailsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionDetailsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionDetailsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties and current status of a game session placement request. To get game session placement details, specify the placement ID. If successful, a GameSessionPlacement object is returned.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def describeGameSessionPlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGameSessionPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionPlacementOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties and current status of a game session placement request. To get game session placement details, specify the placement ID. If successful, a GameSessionPlacement object is returned.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def describeGameSessionPlacement(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionPlacementInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGameSessionPlacement(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionPlacementInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionPlacementOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSessionQueue object is returned for each requested queue. When specifying a list of queues, objects are returned only for queues that currently exist in the region.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
    */
  def describeGameSessionQueues(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionQueuesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGameSessionQueues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionQueuesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionQueuesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSessionQueue object is returned for each requested queue. When specifying a list of queues, objects are returned only for queues that currently exist in the region.    CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
    */
  def describeGameSessionQueues(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionQueuesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionQueuesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGameSessionQueues(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionQueuesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionQueuesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionQueuesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a set of one or more game sessions. Request a specific game session or request all game sessions on a fleet. Alternatively, use SearchGameSessions to request a set of active game sessions that are filtered by certain criteria. To retrieve protection policy settings for game sessions, use DescribeGameSessionDetails. To get game sessions, specify one of the following: game session ID, fleet ID, or alias ID. You can filter this request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSession object is returned for each game session matching the request.  Available in Amazon GameLift Local.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def describeGameSessions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGameSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a set of one or more game sessions. Request a specific game session or request all game sessions on a fleet. Alternatively, use SearchGameSessions to request a set of active game sessions that are filtered by certain criteria. To retrieve protection policy settings for game sessions, use DescribeGameSessionDetails. To get game sessions, specify one of the following: game session ID, fleet ID, or alias ID. You can filter this request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a GameSession object is returned for each game session matching the request.  Available in Amazon GameLift Local.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def describeGameSessions(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeGameSessions(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeGameSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a fleet's instances, including instance IDs. Use this action to get details on all instances in the fleet or get details on one specific instance. To get a specific instance, specify fleet ID and instance ID. To get all instances in a fleet, specify a fleet ID only. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, an Instance object is returned for each result.
    */
  def describeInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a fleet's instances, including instance IDs. Use this action to get details on all instances in the fleet or get details on one specific instance. To get a specific instance, specify fleet ID and instance ID. To get all instances in a fleet, specify a fleet ID only. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, an Instance object is returned for each result.
    */
  def describeInstances(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeInstancesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeInstances(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeInstancesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeInstancesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeInstancesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves one or more matchmaking tickets. Use this operation to retrieve ticket information, including status and--once a successful match is made--acquire connection information for the resulting new game session.  You can use this operation to track the progress of matchmaking requests (through polling) as an alternative to using event notifications. See more details on tracking matchmaking requests through polling or notifications in StartMatchmaking.  To request matchmaking tickets, provide a list of up to 10 ticket IDs. If the request is successful, a ticket object is returned for each requested ID that currently exists.    StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def describeMatchmaking(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMatchmaking(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves one or more matchmaking tickets. Use this operation to retrieve ticket information, including status and--once a successful match is made--acquire connection information for the resulting new game session.  You can use this operation to track the progress of matchmaking requests (through polling) as an alternative to using event notifications. See more details on tracking matchmaking requests through polling or notifications in StartMatchmaking.  To request matchmaking tickets, provide a list of up to 10 ticket IDs. If the request is successful, a ticket object is returned for each requested ID that currently exists.    StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def describeMatchmaking(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMatchmaking(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the details of FlexMatch matchmaking configurations. with this operation, you have the following options: (1) retrieve all existing configurations, (2) provide the names of one or more configurations to retrieve, or (3) retrieve all configurations that use a specified rule set name. When requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a configuration is returned for each requested name. When specifying a list of names, only configurations that currently exist are returned.     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def describeMatchmakingConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMatchmakingConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the details of FlexMatch matchmaking configurations. with this operation, you have the following options: (1) retrieve all existing configurations, (2) provide the names of one or more configurations to retrieve, or (3) retrieve all configurations that use a specified rule set name. When requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a configuration is returned for each requested name. When specifying a list of names, only configurations that currently exist are returned.     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def describeMatchmakingConfigurations(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingConfigurationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMatchmakingConfigurations(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingConfigurationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingConfigurationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingConfigurationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the region, or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.   Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def describeMatchmakingRuleSets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingRuleSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMatchmakingRuleSets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingRuleSetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingRuleSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the region, or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.   Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def describeMatchmakingRuleSets(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingRuleSetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingRuleSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeMatchmakingRuleSets(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingRuleSetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingRuleSetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeMatchmakingRuleSetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties for one or more player sessions. This action can be used in several ways: (1) provide a PlayerSessionId to request properties for a specific player session; (2) provide a GameSessionId to request properties for all player sessions in the specified game session; (3) provide a PlayerId to request properties for all player sessions of a specified player.  To get game session record(s), specify only one of the following: a player session ID, a game session ID, or a player ID. You can filter this request by player session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a PlayerSession object is returned for each session matching the request.  Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def describePlayerSessions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribePlayerSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePlayerSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribePlayerSessionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribePlayerSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves properties for one or more player sessions. This action can be used in several ways: (1) provide a PlayerSessionId to request properties for a specific player session; (2) provide a GameSessionId to request properties for all player sessions in the specified game session; (3) provide a PlayerId to request properties for all player sessions of a specified player.  To get game session record(s), specify only one of the following: a player session ID, a game session ID, or a player ID. You can filter this request by player session status. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, a PlayerSession object is returned for each session matching the request.  Available in Amazon GameLift Local.     CreatePlayerSession     CreatePlayerSessions     DescribePlayerSessions    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def describePlayerSessions(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribePlayerSessionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribePlayerSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describePlayerSessions(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribePlayerSessionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribePlayerSessionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribePlayerSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the current run-time configuration for the specified fleet. The run-time configuration tells Amazon GameLift how to launch server processes on instances in the fleet.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeRuntimeConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeRuntimeConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRuntimeConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeRuntimeConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeRuntimeConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the current run-time configuration for the specified fleet. The run-time configuration tells Amazon GameLift how to launch server processes on instances in the fleet.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeRuntimeConfiguration(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeRuntimeConfigurationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeRuntimeConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRuntimeConfiguration(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeRuntimeConfigurationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeRuntimeConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeRuntimeConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all scaling policies applied to a fleet. To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, set of ScalingPolicy objects is returned for the fleet. A fleet may have all of its scaling policies suspended (StopFleetActions). This action does not affect the status of the scaling policies, which remains ACTIVE. To see whether a fleet's scaling policies are in force or suspended, call DescribeFleetAttributes and check the stopped actions.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeScalingPolicies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeScalingPoliciesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScalingPolicies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeScalingPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeScalingPoliciesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all scaling policies applied to a fleet. To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, set of ScalingPolicy objects is returned for the fleet. A fleet may have all of its scaling policies suspended (StopFleetActions). This action does not affect the status of the scaling policies, which remains ACTIVE. To see whether a fleet's scaling policies are in force or suspended, call DescribeFleetAttributes and check the stopped actions.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def describeScalingPolicies(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeScalingPoliciesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeScalingPoliciesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeScalingPolicies(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeScalingPoliciesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeScalingPoliciesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeScalingPoliciesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC peering authorizations and requests for peering. This includes those initiated and received by this account.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def describeVpcPeeringAuthorizations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringAuthorizationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcPeeringAuthorizations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringAuthorizationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringAuthorizationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC peering authorizations and requests for peering. This includes those initiated and received by this account.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def describeVpcPeeringAuthorizations(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringAuthorizationsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringAuthorizationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcPeeringAuthorizations(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringAuthorizationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringAuthorizationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringAuthorizationsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or for one specific fleet ID.  To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If successful, the retrieved information includes both active and pending connections. Active connections identify the IpV4 CIDR block that the VPC uses to connect.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def describeVpcPeeringConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringConnectionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcPeeringConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringConnectionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringConnectionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or for one specific fleet ID.  To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If successful, the retrieved information includes both active and pending connections. Active connections identify the IpV4 CIDR block that the VPC uses to connect.     CreateVpcPeeringAuthorization     DescribeVpcPeeringAuthorizations     DeleteVpcPeeringAuthorization     CreateVpcPeeringConnection     DescribeVpcPeeringConnections     DeleteVpcPeeringConnection   
    */
  def describeVpcPeeringConnections(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringConnectionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringConnectionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeVpcPeeringConnections(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringConnectionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringConnectionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.DescribeVpcPeeringConnectionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the location of stored game session logs for a specified game session. When a game session is terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL to download the logs.  See the AWS Service Limits page for maximum log file sizes. Log files that exceed this limit are not saved.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def getGameSessionLogUrl(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetGameSessionLogUrlOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGameSessionLogUrl(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetGameSessionLogUrlOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetGameSessionLogUrlOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the location of stored game session logs for a specified game session. When a game session is terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL to download the logs.  See the AWS Service Limits page for maximum log file sizes. Log files that exceed this limit are not saved.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def getGameSessionLogUrl(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetGameSessionLogUrlInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetGameSessionLogUrlOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGameSessionLogUrl(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetGameSessionLogUrlInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetGameSessionLogUrlOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetGameSessionLogUrlOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data, or watching activity in real time.  Access requires credentials that match the operating system of the instance. For a Windows instance, Amazon GameLift returns a user name and password as strings for use with a Windows Remote Desktop client. For a Linux instance, Amazon GameLift returns a user name and RSA private key, also as strings, for use with an SSH client. The private key must be saved in the proper format to a .pem file before using. If you're making this request using the AWS CLI, saving the secret can be handled as part of the GetInstanceAccess request. (See the example later in this topic). For more information on remote access, see Remotely Accessing an Instance. To request access to a specific instance, specify the IDs of both the instance and the fleet it belongs to. You can retrieve a fleet's instance IDs by calling DescribeInstances. If successful, an InstanceAccess object is returned containing the instance's IP address and a set of credentials.
    */
  def getInstanceAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetInstanceAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetInstanceAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetInstanceAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data, or watching activity in real time.  Access requires credentials that match the operating system of the instance. For a Windows instance, Amazon GameLift returns a user name and password as strings for use with a Windows Remote Desktop client. For a Linux instance, Amazon GameLift returns a user name and RSA private key, also as strings, for use with an SSH client. The private key must be saved in the proper format to a .pem file before using. If you're making this request using the AWS CLI, saving the secret can be handled as part of the GetInstanceAccess request. (See the example later in this topic). For more information on remote access, see Remotely Accessing an Instance. To request access to a specific instance, specify the IDs of both the instance and the fleet it belongs to. You can retrieve a fleet's instance IDs by calling DescribeInstances. If successful, an InstanceAccess object is returned containing the instance's IP address and a set of credentials.
    */
  def getInstanceAccess(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetInstanceAccessInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetInstanceAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getInstanceAccess(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetInstanceAccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetInstanceAccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.GetInstanceAccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy type. Use the pagination parameters to retrieve results in sequential pages.  Returned aliases are not listed in any particular order.     CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def listAliases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListAliasesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAliases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListAliasesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListAliasesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy type. Use the pagination parameters to retrieve results in sequential pages.  Returned aliases are not listed in any particular order.     CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def listAliases(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListAliasesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListAliasesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAliases(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListAliasesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListAliasesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListAliasesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves build records for all builds associated with the AWS account in use. You can limit results to builds that are in a specific status by using the Status parameter. Use the pagination parameters to retrieve results in a set of sequential pages.   Build records are not listed in any particular order.     CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
    */
  def listBuilds(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBuilds(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves build records for all builds associated with the AWS account in use. You can limit results to builds that are in a specific status by using the Status parameter. Use the pagination parameters to retrieve results in a set of sequential pages.   Build records are not listed in any particular order.     CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
    */
  def listBuilds(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListBuildsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listBuilds(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListBuildsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListBuildsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListBuildsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a collection of fleet records for this AWS account. You can filter the result set by build ID. Use the pagination parameters to retrieve results in sequential pages.  Fleet records are not listed in any particular order.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def listFleets(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListFleetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFleets(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListFleetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListFleetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a collection of fleet records for this AWS account. You can filter the result set by build ID. Use the pagination parameters to retrieve results in sequential pages.  Fleet records are not listed in any particular order.     CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def listFleets(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListFleetsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListFleetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listFleets(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListFleetsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListFleetsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ListFleetsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates or updates a scaling policy for a fleet. Scaling policies are used to automatically scale a fleet's hosting capacity to meet player demand. An active scaling policy instructs Amazon GameLift to track a fleet metric and automatically change the fleet's capacity when a certain threshold is reached. There are two types of scaling policies: target-based and rule-based. Use a target-based policy to quickly and efficiently manage fleet scaling; this option is the most commonly used. Use rule-based policies when you need to exert fine-grained control over auto-scaling.  Fleets can have multiple scaling policies of each type in force at the same time; you can have one target-based policy, one or multiple rule-based scaling policies, or both. We recommend caution, however, because multiple auto-scaling policies can have unintended consequences. You can temporarily suspend all scaling policies for a fleet by calling StopFleetActions with the fleet action AUTO_SCALING. To resume scaling policies, call StartFleetActions with the same fleet action. To stop just one scaling policy--or to permanently remove it, you must delete the policy with DeleteScalingPolicy. Learn more about how to work with auto-scaling in Set Up Fleet Automatic Scaling.  Target-based policy  A target-based policy tracks a single metric: PercentAvailableGameSessions. This metric tells us how much of a fleet's hosting capacity is ready to host game sessions but is not currently in use. This is the fleet's buffer; it measures the additional player demand that the fleet could handle at current capacity. With a target-based policy, you set your ideal buffer size and leave it to Amazon GameLift to take whatever action is needed to maintain that target.  For example, you might choose to maintain a 10% buffer for a fleet that has the capacity to host 100 simultaneous game sessions. This policy tells Amazon GameLift to take action whenever the fleet's available capacity falls below or rises above 10 game sessions. Amazon GameLift will start new instances or stop unused instances in order to return to the 10% buffer.  To create or update a target-based policy, specify a fleet ID and name, and set the policy type to "TargetBased". Specify the metric to track (PercentAvailableGameSessions) and reference a TargetConfiguration object with your desired buffer value. Exclude all other parameters. On a successful request, the policy name is returned. The scaling policy is automatically in force as soon as it's successfully created. If the fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.  Rule-based policy  A rule-based policy tracks specified fleet metric, sets a threshold value, and specifies the type of action to initiate when triggered. With a rule-based policy, you can select from several available fleet metrics. Each policy specifies whether to scale up or scale down (and by how much), so you need one policy for each type of action.  For example, a policy may make the following statement: "If the percentage of idle instances is greater than 20% for more than 15 minutes, then reduce the fleet capacity by 10%." A policy's rule statement has the following structure: If [MetricName] is [ComparisonOperator] [Threshold] for [EvaluationPeriods] minutes, then [ScalingAdjustmentType] to/by [ScalingAdjustment]. To implement the example, the rule statement would look like this: If [PercentIdleInstances] is [GreaterThanThreshold] [20] for [15] minutes, then [PercentChangeInCapacity] to/by [10]. To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the policy type to "RuleBased". Specify the parameter values for a policy rule statement. On a successful request, the policy name is returned. Scaling policies are automatically in force as soon as they're successfully created. If the fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def putScalingPolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.PutScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putScalingPolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.PutScalingPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.PutScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates or updates a scaling policy for a fleet. Scaling policies are used to automatically scale a fleet's hosting capacity to meet player demand. An active scaling policy instructs Amazon GameLift to track a fleet metric and automatically change the fleet's capacity when a certain threshold is reached. There are two types of scaling policies: target-based and rule-based. Use a target-based policy to quickly and efficiently manage fleet scaling; this option is the most commonly used. Use rule-based policies when you need to exert fine-grained control over auto-scaling.  Fleets can have multiple scaling policies of each type in force at the same time; you can have one target-based policy, one or multiple rule-based scaling policies, or both. We recommend caution, however, because multiple auto-scaling policies can have unintended consequences. You can temporarily suspend all scaling policies for a fleet by calling StopFleetActions with the fleet action AUTO_SCALING. To resume scaling policies, call StartFleetActions with the same fleet action. To stop just one scaling policy--or to permanently remove it, you must delete the policy with DeleteScalingPolicy. Learn more about how to work with auto-scaling in Set Up Fleet Automatic Scaling.  Target-based policy  A target-based policy tracks a single metric: PercentAvailableGameSessions. This metric tells us how much of a fleet's hosting capacity is ready to host game sessions but is not currently in use. This is the fleet's buffer; it measures the additional player demand that the fleet could handle at current capacity. With a target-based policy, you set your ideal buffer size and leave it to Amazon GameLift to take whatever action is needed to maintain that target.  For example, you might choose to maintain a 10% buffer for a fleet that has the capacity to host 100 simultaneous game sessions. This policy tells Amazon GameLift to take action whenever the fleet's available capacity falls below or rises above 10 game sessions. Amazon GameLift will start new instances or stop unused instances in order to return to the 10% buffer.  To create or update a target-based policy, specify a fleet ID and name, and set the policy type to "TargetBased". Specify the metric to track (PercentAvailableGameSessions) and reference a TargetConfiguration object with your desired buffer value. Exclude all other parameters. On a successful request, the policy name is returned. The scaling policy is automatically in force as soon as it's successfully created. If the fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.  Rule-based policy  A rule-based policy tracks specified fleet metric, sets a threshold value, and specifies the type of action to initiate when triggered. With a rule-based policy, you can select from several available fleet metrics. Each policy specifies whether to scale up or scale down (and by how much), so you need one policy for each type of action.  For example, a policy may make the following statement: "If the percentage of idle instances is greater than 20% for more than 15 minutes, then reduce the fleet capacity by 10%." A policy's rule statement has the following structure: If [MetricName] is [ComparisonOperator] [Threshold] for [EvaluationPeriods] minutes, then [ScalingAdjustmentType] to/by [ScalingAdjustment]. To implement the example, the rule statement would look like this: If [PercentIdleInstances] is [GreaterThanThreshold] [20] for [15] minutes, then [PercentChangeInCapacity] to/by [10]. To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the policy type to "RuleBased". Specify the parameter values for a policy rule statement. On a successful request, the policy name is returned. Scaling policies are automatically in force as soon as they're successfully created. If the fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def putScalingPolicy(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.PutScalingPolicyInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.PutScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putScalingPolicy(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.PutScalingPolicyInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.PutScalingPolicyOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.PutScalingPolicyOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a fresh set of credentials for use when uploading a new set of game build files to Amazon GameLift's Amazon S3. This is done as part of the build creation process; see CreateBuild. To request new credentials, specify the build ID as returned with an initial CreateBuild request. If successful, a new set of credentials are returned, along with the S3 storage location associated with the build ID.
    */
  def requestUploadCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.RequestUploadCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def requestUploadCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.RequestUploadCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.RequestUploadCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a fresh set of credentials for use when uploading a new set of game build files to Amazon GameLift's Amazon S3. This is done as part of the build creation process; see CreateBuild. To request new credentials, specify the build ID as returned with an initial CreateBuild request. If successful, a new set of credentials are returned, along with the S3 storage location associated with the build ID.
    */
  def requestUploadCredentials(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.RequestUploadCredentialsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.RequestUploadCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def requestUploadCredentials(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.RequestUploadCredentialsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.RequestUploadCredentialsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.RequestUploadCredentialsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the fleet ID that a specified alias is currently pointing to.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def resolveAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ResolveAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resolveAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ResolveAliasOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ResolveAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the fleet ID that a specified alias is currently pointing to.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def resolveAlias(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ResolveAliasInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ResolveAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resolveAlias(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ResolveAliasInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ResolveAliasOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ResolveAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all active game sessions that match a set of search criteria and sorts them in a specified order. You can search or sort by the following game session attributes:    gameSessionId -- Unique identifier for the game session. You can use either a GameSessionId or GameSessionArn value.     gameSessionName -- Name assigned to a game session. This value is set when requesting a new game session with CreateGameSession or updating with UpdateGameSession. Game session names do not need to be unique to a game session.    gameSessionProperties -- Custom data defined in a game session's GameProperty parameter. GameProperty values are stored as key:value pairs; the filter expression must indicate the key and a string to search the data values for. For example, to search for game sessions with custom data containing the key:value pair "gameMode:brawl", specify the following: gameSessionProperties.gameMode = "brawl". All custom data values are searched as strings.    maximumSessions -- Maximum number of player sessions allowed for a game session. This value is set when requesting a new game session with CreateGameSession or updating with UpdateGameSession.    creationTimeMillis -- Value indicating when a game session was created. It is expressed in Unix time as milliseconds.    playerSessionCount -- Number of players currently connected to a game session. This value changes rapidly as players join the session or drop out.    hasAvailablePlayerSessions -- Boolean value indicating whether a game session has reached its maximum number of players. It is highly recommended that all search requests include this filter attribute to optimize search performance and return only sessions that players can join.     Returned values for playerSessionCount and hasAvailablePlayerSessions change quickly as players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh search results often, and handle sessions that fill up before a player can join.   To search or sort, specify either a fleet ID or an alias ID, and provide a search filter expression, a sort expression, or both. If successful, a collection of GameSession objects matching the request is returned. Use the pagination parameters to retrieve results as a set of sequential pages.  You can search for game sessions one fleet at a time only. To find game sessions across multiple fleets, you must search each fleet separately and combine the results. This search feature finds only game sessions that are in ACTIVE status. To locate games in statuses other than active, use DescribeGameSessionDetails.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def searchGameSessions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.SearchGameSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchGameSessions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.SearchGameSessionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.SearchGameSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all active game sessions that match a set of search criteria and sorts them in a specified order. You can search or sort by the following game session attributes:    gameSessionId -- Unique identifier for the game session. You can use either a GameSessionId or GameSessionArn value.     gameSessionName -- Name assigned to a game session. This value is set when requesting a new game session with CreateGameSession or updating with UpdateGameSession. Game session names do not need to be unique to a game session.    gameSessionProperties -- Custom data defined in a game session's GameProperty parameter. GameProperty values are stored as key:value pairs; the filter expression must indicate the key and a string to search the data values for. For example, to search for game sessions with custom data containing the key:value pair "gameMode:brawl", specify the following: gameSessionProperties.gameMode = "brawl". All custom data values are searched as strings.    maximumSessions -- Maximum number of player sessions allowed for a game session. This value is set when requesting a new game session with CreateGameSession or updating with UpdateGameSession.    creationTimeMillis -- Value indicating when a game session was created. It is expressed in Unix time as milliseconds.    playerSessionCount -- Number of players currently connected to a game session. This value changes rapidly as players join the session or drop out.    hasAvailablePlayerSessions -- Boolean value indicating whether a game session has reached its maximum number of players. It is highly recommended that all search requests include this filter attribute to optimize search performance and return only sessions that players can join.     Returned values for playerSessionCount and hasAvailablePlayerSessions change quickly as players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh search results often, and handle sessions that fill up before a player can join.   To search or sort, specify either a fleet ID or an alias ID, and provide a search filter expression, a sort expression, or both. If successful, a collection of GameSession objects matching the request is returned. Use the pagination parameters to retrieve results as a set of sequential pages.  You can search for game sessions one fleet at a time only. To find game sessions across multiple fleets, you must search each fleet separately and combine the results. This search feature finds only game sessions that are in ACTIVE status. To locate games in statuses other than active, use DescribeGameSessionDetails.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def searchGameSessions(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.SearchGameSessionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.SearchGameSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchGameSessions(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.SearchGameSessionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.SearchGameSessionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.SearchGameSessionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resumes activity on a fleet that was suspended with StopFleetActions. Currently, this operation is used to restart a fleet's auto-scaling activity.  To start fleet actions, specify the fleet ID and the type of actions to restart. When auto-scaling fleet actions are restarted, Amazon GameLift once again initiates scaling events as triggered by the fleet's scaling policies. If actions on the fleet were never stopped, this operation will have no effect. You can view a fleet's stopped actions using DescribeFleetAttributes.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def startFleetActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartFleetActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFleetActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartFleetActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartFleetActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resumes activity on a fleet that was suspended with StopFleetActions. Currently, this operation is used to restart a fleet's auto-scaling activity.  To start fleet actions, specify the fleet ID and the type of actions to restart. When auto-scaling fleet actions are restarted, Amazon GameLift once again initiates scaling events as triggered by the fleet's scaling policies. If actions on the fleet were never stopped, this operation will have no effect. You can view a fleet's stopped actions using DescribeFleetAttributes.    DescribeFleetCapacity     UpdateFleetCapacity     DescribeEC2InstanceLimits    Manage scaling policies:    PutScalingPolicy (auto-scaling)    DescribeScalingPolicies (auto-scaling)    DeleteScalingPolicy (auto-scaling)     Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def startFleetActions(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartFleetActionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartFleetActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startFleetActions(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartFleetActionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartFleetActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartFleetActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Places a request for a new game session in a queue (see CreateGameSessionQueue). When processing a placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each until it finds resources or the placement request times out. A game session placement request can also request player sessions. When a new game session is successfully created, Amazon GameLift creates a player session for each player included in the request. When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the queue configuration. Ideally, a queue's destinations are listed in preference order. Alternatively, when requesting a game session with players, you can also provide latency data for each player in relevant regions. Latency data indicates the performance lag a player experiences when connected to a fleet in the region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each region's average lag for all players and reorders to get the best game play across all players.  To place a new game session request, specify the following:   The queue name and a set of game session properties and settings   A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request   (Optional) A set of player data and a unique player ID for each player that you are joining to the new game session (player data is optional, but if you include it, you must also provide a unique ID for each player)   Latency data for all players (if you want to optimize game play for the players)   If successful, a new game session placement is created. To track the status of a placement request, call DescribeGameSessionPlacement and check the request's status. If the status is FULFILLED, a new game session has been created and a game session ARN and region are referenced. If the placement request times out, you can resubmit the request or retry it with a different queue.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def startGameSessionPlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startGameSessionPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartGameSessionPlacementOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Places a request for a new game session in a queue (see CreateGameSessionQueue). When processing a placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each until it finds resources or the placement request times out. A game session placement request can also request player sessions. When a new game session is successfully created, Amazon GameLift creates a player session for each player included in the request. When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the queue configuration. Ideally, a queue's destinations are listed in preference order. Alternatively, when requesting a game session with players, you can also provide latency data for each player in relevant regions. Latency data indicates the performance lag a player experiences when connected to a fleet in the region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each region's average lag for all players and reorders to get the best game play across all players.  To place a new game session request, specify the following:   The queue name and a set of game session properties and settings   A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request   (Optional) A set of player data and a unique player ID for each player that you are joining to the new game session (player data is optional, but if you include it, you must also provide a unique ID for each player)   Latency data for all players (if you want to optimize game play for the players)   If successful, a new game session placement is created. To track the status of a placement request, call DescribeGameSessionPlacement and check the request's status. If the status is FULFILLED, a new game session has been created and a game session ARN and region are referenced. If the placement request times out, you can resubmit the request or retry it with a different queue.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def startGameSessionPlacement(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartGameSessionPlacementInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startGameSessionPlacement(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartGameSessionPlacementInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartGameSessionPlacementOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Finds new players to fill open slots in an existing game session. This operation can be used to add players to matched games that start with fewer than the maximum number of players or to replace players when they drop out. By backfilling with the same matchmaker used to create the original match, you ensure that new players meet the match criteria and maintain a consistent experience throughout the game session. You can backfill a match anytime after a game session has been created.  To request a match backfill, specify a unique ticket ID, the existing game session's ARN, a matchmaking configuration, and a set of data that describes all current players in the game session. If successful, a match backfill ticket is created and returned with status set to QUEUED. The ticket is placed in the matchmaker's ticket pool and processed. Track the status of the ticket to respond as needed. For more detail how to set up backfilling, see  Backfill Existing Games with FlexMatch.  The process of finding backfill matches is essentially identical to the initial matchmaking process. The matchmaker searches the pool and groups tickets together to form potential matches, allowing only one backfill ticket per potential match. Once the a match is formed, the matchmaker creates player sessions for the new players. All tickets in the match are updated with the game session's connection information, and the GameSession object is updated to include matchmaker data on the new players. For more detail on how match backfill requests are processed, see  How Amazon GameLift FlexMatch Works.     StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def startMatchBackfill(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchBackfillOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startMatchBackfill(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchBackfillOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchBackfillOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Finds new players to fill open slots in an existing game session. This operation can be used to add players to matched games that start with fewer than the maximum number of players or to replace players when they drop out. By backfilling with the same matchmaker used to create the original match, you ensure that new players meet the match criteria and maintain a consistent experience throughout the game session. You can backfill a match anytime after a game session has been created.  To request a match backfill, specify a unique ticket ID, the existing game session's ARN, a matchmaking configuration, and a set of data that describes all current players in the game session. If successful, a match backfill ticket is created and returned with status set to QUEUED. The ticket is placed in the matchmaker's ticket pool and processed. Track the status of the ticket to respond as needed. For more detail how to set up backfilling, see  Backfill Existing Games with FlexMatch.  The process of finding backfill matches is essentially identical to the initial matchmaking process. The matchmaker searches the pool and groups tickets together to form potential matches, allowing only one backfill ticket per potential match. Once the a match is formed, the matchmaker creates player sessions for the new players. All tickets in the match are updated with the game session's connection information, and the GameSession object is updated to include matchmaker data on the new players. For more detail on how match backfill requests are processed, see  How Amazon GameLift FlexMatch Works.     StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def startMatchBackfill(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchBackfillInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchBackfillOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startMatchBackfill(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchBackfillInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchBackfillOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchBackfillOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules, and starts a new game for the matched players. Each matchmaking request specifies the type of match to build (team configuration, rules for an acceptable match, etc.). The request also specifies the players to find a match for and where to host the new game session for optimal performance. A matchmaking request might start with a single player or a group of players who want to play together. FlexMatch finds additional players as needed to fill the match. Match type, rules, and the queue used to place a new game session are defined in a MatchmakingConfiguration. For complete information on setting up and using FlexMatch, see the topic  Adding FlexMatch to Your Game. To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to be matched. You must also include a set of player attributes relevant for the matchmaking configuration. If successful, a matchmaking ticket is returned with status set to QUEUED. Track the status of the ticket to respond as needed and acquire game session connection information for successfully completed matches.  Tracking ticket status -- A couple of options are available for tracking the status of matchmaking requests:    Polling -- Call DescribeMatchmaking. This operation returns the full ticket object, including current status and (for completed tickets) game session connection info. We recommend polling no more than once every 10 seconds.   Notifications -- Get event notifications for changes in ticket status using Amazon Simple Notification Service (SNS). Notifications are easy to set up (see CreateMatchmakingConfiguration) and typically deliver match status changes faster and more efficiently than polling. We recommend that you use polling to back up to notifications (since delivery is not guaranteed) and call DescribeMatchmaking only when notifications are not received within 30 seconds.    Processing a matchmaking request -- FlexMatch handles a matchmaking request as follows:    Your client code submits a StartMatchmaking request for one or more players and tracks the status of the request ticket.    FlexMatch uses this ticket and others in process to build an acceptable match. When a potential match is identified, all tickets in the proposed match are advanced to the next status.    If the match requires player acceptance (set in the matchmaking configuration), the tickets move into status REQUIRES_ACCEPTANCE. This status triggers your client code to solicit acceptance from all players in every ticket involved in the match, and then call AcceptMatch for each player. If any player rejects or fails to accept the match before a specified timeout, the proposed match is dropped (see AcceptMatch for more details).   Once a match is proposed and accepted, the matchmaking tickets move into status PLACING. FlexMatch locates resources for a new game session using the game session queue (set in the matchmaking configuration) and creates the game session based on the match data.    When the match is successfully placed, the matchmaking tickets move into COMPLETED status. Connection information (including game session endpoint and player session) is added to the matchmaking tickets. Matched players can use the connection information to join the game.       StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def startMatchmaking(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startMatchmaking(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchmakingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules, and starts a new game for the matched players. Each matchmaking request specifies the type of match to build (team configuration, rules for an acceptable match, etc.). The request also specifies the players to find a match for and where to host the new game session for optimal performance. A matchmaking request might start with a single player or a group of players who want to play together. FlexMatch finds additional players as needed to fill the match. Match type, rules, and the queue used to place a new game session are defined in a MatchmakingConfiguration. For complete information on setting up and using FlexMatch, see the topic  Adding FlexMatch to Your Game. To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to be matched. You must also include a set of player attributes relevant for the matchmaking configuration. If successful, a matchmaking ticket is returned with status set to QUEUED. Track the status of the ticket to respond as needed and acquire game session connection information for successfully completed matches.  Tracking ticket status -- A couple of options are available for tracking the status of matchmaking requests:    Polling -- Call DescribeMatchmaking. This operation returns the full ticket object, including current status and (for completed tickets) game session connection info. We recommend polling no more than once every 10 seconds.   Notifications -- Get event notifications for changes in ticket status using Amazon Simple Notification Service (SNS). Notifications are easy to set up (see CreateMatchmakingConfiguration) and typically deliver match status changes faster and more efficiently than polling. We recommend that you use polling to back up to notifications (since delivery is not guaranteed) and call DescribeMatchmaking only when notifications are not received within 30 seconds.    Processing a matchmaking request -- FlexMatch handles a matchmaking request as follows:    Your client code submits a StartMatchmaking request for one or more players and tracks the status of the request ticket.    FlexMatch uses this ticket and others in process to build an acceptable match. When a potential match is identified, all tickets in the proposed match are advanced to the next status.    If the match requires player acceptance (set in the matchmaking configuration), the tickets move into status REQUIRES_ACCEPTANCE. This status triggers your client code to solicit acceptance from all players in every ticket involved in the match, and then call AcceptMatch for each player. If any player rejects or fails to accept the match before a specified timeout, the proposed match is dropped (see AcceptMatch for more details).   Once a match is proposed and accepted, the matchmaking tickets move into status PLACING. FlexMatch locates resources for a new game session using the game session queue (set in the matchmaking configuration) and creates the game session based on the match data.    When the match is successfully placed, the matchmaking tickets move into COMPLETED status. Connection information (including game session endpoint and player session) is added to the matchmaking tickets. Matched players can use the connection information to join the game.       StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def startMatchmaking(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchmakingInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startMatchmaking(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchmakingInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchmakingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StartMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Suspends activity on a fleet. Currently, this operation is used to stop a fleet's auto-scaling activity. It is used to temporarily stop scaling events triggered by the fleet's scaling policies. The policies can be retained and auto-scaling activity can be restarted using StartFleetActions. You can view a fleet's stopped actions using DescribeFleetAttributes. To stop fleet actions, specify the fleet ID and the type of actions to suspend. When auto-scaling fleet actions are stopped, Amazon GameLift no longer initiates scaling events except to maintain the fleet's desired instances setting (FleetCapacity. Changes to the fleet's capacity must be done manually using UpdateFleetCapacity. 
    */
  def stopFleetActions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopFleetActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopFleetActions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopFleetActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopFleetActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Suspends activity on a fleet. Currently, this operation is used to stop a fleet's auto-scaling activity. It is used to temporarily stop scaling events triggered by the fleet's scaling policies. The policies can be retained and auto-scaling activity can be restarted using StartFleetActions. You can view a fleet's stopped actions using DescribeFleetAttributes. To stop fleet actions, specify the fleet ID and the type of actions to suspend. When auto-scaling fleet actions are stopped, Amazon GameLift no longer initiates scaling events except to maintain the fleet's desired instances setting (FleetCapacity. Changes to the fleet's capacity must be done manually using UpdateFleetCapacity. 
    */
  def stopFleetActions(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopFleetActionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopFleetActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopFleetActions(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopFleetActionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopFleetActionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopFleetActionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a game session placement that is in PENDING status. To stop a placement, provide the placement ID values. If successful, the placement is moved to CANCELLED status.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def stopGameSessionPlacement(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopGameSessionPlacement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopGameSessionPlacementOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a game session placement that is in PENDING status. To stop a placement, provide the placement ID values. If successful, the placement is moved to CANCELLED status.    CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def stopGameSessionPlacement(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopGameSessionPlacementInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopGameSessionPlacement(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopGameSessionPlacementInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopGameSessionPlacementOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopGameSessionPlacementOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a matchmaking ticket that is currently being processed. To stop the matchmaking operation, specify the ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed to CANCELLED.    StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def stopMatchmaking(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopMatchmaking(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopMatchmakingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Cancels a matchmaking ticket that is currently being processed. To stop the matchmaking operation, specify the ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed to CANCELLED.    StartMatchmaking     DescribeMatchmaking     StopMatchmaking     AcceptMatch     StartMatchBackfill   
    */
  def stopMatchmaking(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopMatchmakingInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopMatchmaking(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopMatchmakingInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopMatchmakingOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.StopMatchmakingOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If successful, the updated alias record is returned.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def updateAlias(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAlias(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateAliasOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If successful, the updated alias record is returned.    CreateAlias     ListAliases     DescribeAlias     UpdateAlias     DeleteAlias     ResolveAlias   
    */
  def updateAlias(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateAliasInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAlias(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateAliasInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateAliasOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateAliasOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates metadata in a build record, including the build name and version. To update the metadata, specify the build ID to update and provide the new values. If successful, a build object containing the updated metadata is returned.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
    */
  def updateBuild(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBuild(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates metadata in a build record, including the build name and version. To update the metadata, specify the build ID to update and provide the new values. If successful, a build object containing the updated metadata is returned.    CreateBuild     ListBuilds     DescribeBuild     UpdateBuild     DeleteBuild   
    */
  def updateBuild(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateBuildInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateBuild(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateBuildInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateBuildOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateBuildOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates fleet properties, including name and description, for a fleet. To update metadata, specify the fleet ID and the property values that you want to change. If successful, the fleet ID for the updated fleet is returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def updateFleetAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleetAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates fleet properties, including name and description, for a fleet. To update metadata, specify the fleet ID and the property values that you want to change. If successful, the fleet ID for the updated fleet is returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def updateFleetAttributes(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetAttributesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleetAttributes(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetAttributesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetAttributesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetAttributesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates capacity settings for a fleet. Use this action to specify the number of EC2 instances (hosts) that you want this fleet to contain. Before calling this action, you may want to call DescribeEC2InstanceLimits to get the maximum capacity based on the fleet's EC2 instance type. Specify minimum and maximum number of instances. Amazon GameLift will not change fleet capacity to values fall outside of this range. This is particularly important when using auto-scaling (see PutScalingPolicy) to allow capacity to adjust based on player demand while imposing limits on automatic adjustments. To update fleet capacity, specify the fleet ID and the number of instances you want the fleet to host. If successful, Amazon GameLift starts or terminates instances so that the fleet's active instance count matches the desired instance count. You can view a fleet's current capacity information by calling DescribeFleetCapacity. If the desired instance count is higher than the instance type's limit, the "Limit Exceeded" exception occurs.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def updateFleetCapacity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetCapacityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleetCapacity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetCapacityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetCapacityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates capacity settings for a fleet. Use this action to specify the number of EC2 instances (hosts) that you want this fleet to contain. Before calling this action, you may want to call DescribeEC2InstanceLimits to get the maximum capacity based on the fleet's EC2 instance type. Specify minimum and maximum number of instances. Amazon GameLift will not change fleet capacity to values fall outside of this range. This is particularly important when using auto-scaling (see PutScalingPolicy) to allow capacity to adjust based on player demand while imposing limits on automatic adjustments. To update fleet capacity, specify the fleet ID and the number of instances you want the fleet to host. If successful, Amazon GameLift starts or terminates instances so that the fleet's active instance count matches the desired instance count. You can view a fleet's current capacity information by calling DescribeFleetCapacity. If the desired instance count is higher than the instance type's limit, the "Limit Exceeded" exception occurs.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def updateFleetCapacity(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetCapacityInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetCapacityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleetCapacity(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetCapacityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetCapacityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetCapacityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates port settings for a fleet. To update settings, specify the fleet ID to be updated and list the permissions you want to update. List the permissions you want to add in InboundPermissionAuthorizations, and permissions you want to remove in InboundPermissionRevocations. Permissions to be removed must match existing fleet permissions. If successful, the fleet ID for the updated fleet is returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def updateFleetPortSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetPortSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleetPortSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetPortSettingsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetPortSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates port settings for a fleet. To update settings, specify the fleet ID to be updated and list the permissions you want to update. List the permissions you want to add in InboundPermissionAuthorizations, and permissions you want to remove in InboundPermissionRevocations. Permissions to be removed must match existing fleet permissions. If successful, the fleet ID for the updated fleet is returned.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def updateFleetPortSettings(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetPortSettingsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetPortSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateFleetPortSettings(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetPortSettingsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetPortSettingsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateFleetPortSettingsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates game session properties. This includes the session name, maximum player count, protection policy, which controls whether or not an active game session can be terminated during a scale-down event, and the player session creation policy, which controls whether or not new players can join the session. To update a game session, specify the game session ID and the values you want to change. If successful, an updated GameSession object is returned.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def updateGameSession(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGameSession(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates game session properties. This includes the session name, maximum player count, protection policy, which controls whether or not an active game session can be terminated during a scale-down event, and the player session creation policy, which controls whether or not new players can join the session. To update a game session, specify the game session ID and the values you want to change. If successful, an updated GameSession object is returned.     CreateGameSession     DescribeGameSessions     DescribeGameSessionDetails     SearchGameSessions     UpdateGameSession     GetGameSessionLogUrl    Game session placements    StartGameSessionPlacement     DescribeGameSessionPlacement     StopGameSessionPlacement     
    */
  def updateGameSession(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGameSession(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates settings for a game session queue, which determines how new game session requests in the queue are processed. To update settings, specify the queue name to be updated and provide the new settings. When updating destinations, provide a complete list of destinations.     CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
    */
  def updateGameSessionQueue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGameSessionQueue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionQueueOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates settings for a game session queue, which determines how new game session requests in the queue are processed. To update settings, specify the queue name to be updated and provide the new settings. When updating destinations, provide a complete list of destinations.     CreateGameSessionQueue     DescribeGameSessionQueues     UpdateGameSessionQueue     DeleteGameSessionQueue   
    */
  def updateGameSessionQueue(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionQueueInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGameSessionQueue(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionQueueInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionQueueOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateGameSessionQueueOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates settings for a FlexMatch matchmaking configuration. To update settings, specify the configuration name to be updated and provide the new settings.     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def updateMatchmakingConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMatchmakingConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateMatchmakingConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates settings for a FlexMatch matchmaking configuration. To update settings, specify the configuration name to be updated and provide the new settings.     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def updateMatchmakingConfiguration(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateMatchmakingConfigurationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateMatchmakingConfiguration(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateMatchmakingConfigurationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateMatchmakingConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateMatchmakingConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the current run-time configuration for the specified fleet, which tells Amazon GameLift how to launch server processes on instances in the fleet. You can update a fleet's run-time configuration at any time after the fleet is created; it does not need to be in an ACTIVE status. To update run-time configuration, specify the fleet ID and provide a RuntimeConfiguration object with the updated collection of server process configurations. Each instance in a Amazon GameLift fleet checks regularly for an updated run-time configuration and changes how it launches server processes to comply with the latest version. Existing server processes are not affected by the update; they continue to run until they end, while Amazon GameLift simply adds new server processes to fit the current run-time configuration. As a result, the run-time configuration changes are applied gradually as existing processes shut down and new processes are launched in Amazon GameLift's normal process recycling activity.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def updateRuntimeConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateRuntimeConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRuntimeConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateRuntimeConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateRuntimeConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the current run-time configuration for the specified fleet, which tells Amazon GameLift how to launch server processes on instances in the fleet. You can update a fleet's run-time configuration at any time after the fleet is created; it does not need to be in an ACTIVE status. To update run-time configuration, specify the fleet ID and provide a RuntimeConfiguration object with the updated collection of server process configurations. Each instance in a Amazon GameLift fleet checks regularly for an updated run-time configuration and changes how it launches server processes to comply with the latest version. Existing server processes are not affected by the update; they continue to run until they end, while Amazon GameLift simply adds new server processes to fit the current run-time configuration. As a result, the run-time configuration changes are applied gradually as existing processes shut down and new processes are launched in Amazon GameLift's normal process recycling activity.    CreateFleet     ListFleets     DeleteFleet    Describe fleets:    DescribeFleetAttributes     DescribeFleetCapacity     DescribeFleetPortSettings     DescribeFleetUtilization     DescribeRuntimeConfiguration     DescribeEC2InstanceLimits     DescribeFleetEvents      Update fleets:    UpdateFleetAttributes     UpdateFleetCapacity     UpdateFleetPortSettings     UpdateRuntimeConfiguration      Manage fleet actions:    StartFleetActions     StopFleetActions     
    */
  def updateRuntimeConfiguration(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateRuntimeConfigurationInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateRuntimeConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateRuntimeConfiguration(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateRuntimeConfigurationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateRuntimeConfigurationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.UpdateRuntimeConfigurationOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set is using syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a rule set JSON string.  Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def validateMatchmakingRuleSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ValidateMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def validateMatchmakingRuleSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ValidateMatchmakingRuleSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ValidateMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set is using syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a rule set JSON string.  Learn more     Build a Rule Set     Related operations     CreateMatchmakingConfiguration     DescribeMatchmakingConfigurations     UpdateMatchmakingConfiguration     DeleteMatchmakingConfiguration     CreateMatchmakingRuleSet     DescribeMatchmakingRuleSets     ValidateMatchmakingRuleSet     DeleteMatchmakingRuleSet   
    */
  def validateMatchmakingRuleSet(params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ValidateMatchmakingRuleSetInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ValidateMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def validateMatchmakingRuleSet(
    params: awsDashSdkLib.clientsGameliftMod.GameLiftNs.ValidateMatchmakingRuleSetInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGameliftMod.GameLiftNs.ValidateMatchmakingRuleSetOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGameliftMod.GameLiftNs.ValidateMatchmakingRuleSetOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

