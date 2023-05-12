package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameSession extends StObject {
  
  /**
    * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique identifier for a player. This ID is used to enforce a resource protection policy (if one exists), that limits the number of game sessions a player can create.
    */
  var CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Number of players currently in the game session.
    */
  var CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The DNS identifier assigned to the instance that is running the game session. Values have the following format:   TLS-enabled fleets: &lt;unique identifier&gt;.&lt;region identifier&gt;.amazongamelift.com.   Non-TLS-enabled fleets: ec2-&lt;unique identifier&gt;.compute.amazonaws.com. (See Amazon EC2 Instance IP Addressing.)   When connecting to a game session that is running on a TLS-enabled fleet, you must use the DNS name, not the IP address.
    */
  var DnsName: js.UndefOr[typings.awsSdk.clientsGameliftMod.DnsName] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet that this game session is running on. 
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet that the game session is running on.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
  
  /**
    * A set of custom properties for a game session, formatted as key:value pairs. These properties are passed to a game server process with a request to start a new game session (see Start a Game Session).
    */
  var GameProperties: js.UndefOr[GamePropertyList] = js.undefined
  
  /**
    * A set of custom game session properties, formatted as a single string value. This data is passed to a game server process with a request to start a new game session (see Start a Game Session).
    */
  var GameSessionData: js.UndefOr[LargeGameSessionData] = js.undefined
  
  /**
    * A unique identifier for the game session. A game session ARN has the following format: arn:aws:gamelift:&lt;region&gt;::gamesession/&lt;fleet ID&gt;/&lt;custom ID string or idempotency token&gt;.
    */
  var GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * The IP address of the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.clientsGameliftMod.IpAddress] = js.undefined
  
  /**
    * The fleet location where the game session is running. This value might specify the fleet's home Region or a remote location. Location is expressed as an Amazon Web Services Region code such as us-west-2. 
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
  
  /**
    * Information about the matchmaking process that was used to create the game session. It is in JSON syntax, formatted as a string. In addition the matchmaking configuration used, it contains data on all players assigned to the match, including player attributes and team assignments. For more details on matchmaker data, see Match Data. Matchmaker data is useful when requesting match backfills, and is updated whenever new players are added during a successful backfill (see StartMatchBackfill). 
    */
  var MatchmakerData: js.UndefOr[typings.awsSdk.clientsGameliftMod.MatchmakerData] = js.undefined
  
  /**
    * The maximum number of players that can be connected simultaneously to the game session.
    */
  var MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * A descriptive label that is associated with a game session. Session names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Indicates whether or not the game session is accepting new players.
    */
  var PlayerSessionCreationPolicy: js.UndefOr[typings.awsSdk.clientsGameliftMod.PlayerSessionCreationPolicy] = js.undefined
  
  /**
    * The port number for the game session. To connect to a Amazon GameLift game server, an app needs both the IP address and port number.
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
    * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as milliseconds (for example "1469498468.057").
    */
  var TerminationTime: js.UndefOr[js.Date] = js.undefined
}
object GameSession {
  
  inline def apply(): GameSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameSession] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCreatorId(value: NonZeroAndMaxString): Self = StObject.set(x, "CreatorId", value.asInstanceOf[js.Any])
    
    inline def setCreatorIdUndefined: Self = StObject.set(x, "CreatorId", js.undefined)
    
    inline def setCurrentPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "CurrentPlayerSessionCount", value.asInstanceOf[js.Any])
    
    inline def setCurrentPlayerSessionCountUndefined: Self = StObject.set(x, "CurrentPlayerSessionCount", js.undefined)
    
    inline def setDnsName(value: DnsName): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setGameProperties(value: GamePropertyList): Self = StObject.set(x, "GameProperties", value.asInstanceOf[js.Any])
    
    inline def setGamePropertiesUndefined: Self = StObject.set(x, "GameProperties", js.undefined)
    
    inline def setGamePropertiesVarargs(value: GameProperty*): Self = StObject.set(x, "GameProperties", js.Array(value*))
    
    inline def setGameSessionData(value: LargeGameSessionData): Self = StObject.set(x, "GameSessionData", value.asInstanceOf[js.Any])
    
    inline def setGameSessionDataUndefined: Self = StObject.set(x, "GameSessionData", js.undefined)
    
    inline def setGameSessionId(value: NonZeroAndMaxString): Self = StObject.set(x, "GameSessionId", value.asInstanceOf[js.Any])
    
    inline def setGameSessionIdUndefined: Self = StObject.set(x, "GameSessionId", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setMatchmakerData(value: MatchmakerData): Self = StObject.set(x, "MatchmakerData", value.asInstanceOf[js.Any])
    
    inline def setMatchmakerDataUndefined: Self = StObject.set(x, "MatchmakerData", js.undefined)
    
    inline def setMaximumPlayerSessionCount(value: WholeNumber): Self = StObject.set(x, "MaximumPlayerSessionCount", value.asInstanceOf[js.Any])
    
    inline def setMaximumPlayerSessionCountUndefined: Self = StObject.set(x, "MaximumPlayerSessionCount", js.undefined)
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPlayerSessionCreationPolicy(value: PlayerSessionCreationPolicy): Self = StObject.set(x, "PlayerSessionCreationPolicy", value.asInstanceOf[js.Any])
    
    inline def setPlayerSessionCreationPolicyUndefined: Self = StObject.set(x, "PlayerSessionCreationPolicy", js.undefined)
    
    inline def setPort(value: PortNumber): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setStatus(value: GameSessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: GameSessionStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTerminationTime(value: js.Date): Self = StObject.set(x, "TerminationTime", value.asInstanceOf[js.Any])
    
    inline def setTerminationTimeUndefined: Self = StObject.set(x, "TerminationTime", js.undefined)
  }
}
