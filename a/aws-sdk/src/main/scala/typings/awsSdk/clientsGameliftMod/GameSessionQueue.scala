package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameSessionQueue extends StObject {
  
  /**
    *  Information that is added to all events that are related to this game session queue.
    */
  var CustomEventData: js.UndefOr[QueueCustomEventData] = js.undefined
  
  /**
    * A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the queue. Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of placement preference.
    */
  var Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined
  
  /**
    * A list of locations where a queue is allowed to place new game sessions. Locations are specified in the form of Amazon Web Services Region codes, such as us-west-2. If this parameter is not set, game sessions can be placed in any queue location. 
    */
  var FilterConfiguration: js.UndefOr[typings.awsSdk.clientsGameliftMod.FilterConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a Amazon GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;. In a Amazon GameLift game session queue ARN, the resource ID matches the Name value.
    */
  var GameSessionQueueArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameSessionQueueArn] = js.undefined
  
  /**
    * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
    */
  var Name: js.UndefOr[GameSessionQueueName] = js.undefined
  
  /**
    * An SNS topic ARN that is set up to receive game session placement notifications. See  Setting up notifications for game session placement.
    */
  var NotificationTarget: js.UndefOr[QueueSnsArnStringModel] = js.undefined
  
  /**
    * A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for most players in a game session. These policies ensure that no individual player can be placed into a game with unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a time. Multiple policies are applied based on their maximum allowed latency, starting with the lowest value. 
    */
  var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined
  
  /**
    * Custom settings to use when prioritizing destinations and locations for game session placements. This configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly named will be automatically applied at the end of the prioritization process. 
    */
  var PriorityConfiguration: js.UndefOr[typings.awsSdk.clientsGameliftMod.PriorityConfiguration] = js.undefined
  
  /**
    * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request exceeds this time, the game session placement changes to a TIMED_OUT status.
    */
  var TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
}
object GameSessionQueue {
  
  inline def apply(): GameSessionQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameSessionQueue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameSessionQueue] (val x: Self) extends AnyVal {
    
    inline def setCustomEventData(value: QueueCustomEventData): Self = StObject.set(x, "CustomEventData", value.asInstanceOf[js.Any])
    
    inline def setCustomEventDataUndefined: Self = StObject.set(x, "CustomEventData", js.undefined)
    
    inline def setDestinations(value: GameSessionQueueDestinationList): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: GameSessionQueueDestination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setFilterConfiguration(value: FilterConfiguration): Self = StObject.set(x, "FilterConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFilterConfigurationUndefined: Self = StObject.set(x, "FilterConfiguration", js.undefined)
    
    inline def setGameSessionQueueArn(value: GameSessionQueueArn): Self = StObject.set(x, "GameSessionQueueArn", value.asInstanceOf[js.Any])
    
    inline def setGameSessionQueueArnUndefined: Self = StObject.set(x, "GameSessionQueueArn", js.undefined)
    
    inline def setName(value: GameSessionQueueName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNotificationTarget(value: QueueSnsArnStringModel): Self = StObject.set(x, "NotificationTarget", value.asInstanceOf[js.Any])
    
    inline def setNotificationTargetUndefined: Self = StObject.set(x, "NotificationTarget", js.undefined)
    
    inline def setPlayerLatencyPolicies(value: PlayerLatencyPolicyList): Self = StObject.set(x, "PlayerLatencyPolicies", value.asInstanceOf[js.Any])
    
    inline def setPlayerLatencyPoliciesUndefined: Self = StObject.set(x, "PlayerLatencyPolicies", js.undefined)
    
    inline def setPlayerLatencyPoliciesVarargs(value: PlayerLatencyPolicy*): Self = StObject.set(x, "PlayerLatencyPolicies", js.Array(value*))
    
    inline def setPriorityConfiguration(value: PriorityConfiguration): Self = StObject.set(x, "PriorityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPriorityConfigurationUndefined: Self = StObject.set(x, "PriorityConfiguration", js.undefined)
    
    inline def setTimeoutInSeconds(value: WholeNumber): Self = StObject.set(x, "TimeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "TimeoutInSeconds", js.undefined)
  }
}
