package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryTrigger extends StObject {
  
  /**
    * The branches to be included in the trigger configuration. If you specify an empty array, the trigger applies to all branches.  Although no content is required in the array, you must include the array itself. 
    */
  var branches: js.UndefOr[BranchNameList] = js.undefined
  
  /**
    * Any custom data associated with the trigger to be included in the information sent to the target of the trigger.
    */
  var customData: js.UndefOr[RepositoryTriggerCustomData] = js.undefined
  
  /**
    * The ARN of the resource that is the target for a trigger (for example, the ARN of a topic in Amazon SNS).
    */
  var destinationArn: Arn
  
  /**
    * The repository events that cause the trigger to run actions in another service, such as sending a notification through Amazon SNS.   The valid value "all" cannot be used with any other values. 
    */
  var events: RepositoryTriggerEventList
  
  /**
    * The name of the trigger.
    */
  var name: RepositoryTriggerName
}
object RepositoryTrigger {
  
  inline def apply(destinationArn: Arn, events: RepositoryTriggerEventList, name: RepositoryTriggerName): RepositoryTrigger = {
    val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryTrigger]
  }
  
  extension [Self <: RepositoryTrigger](x: Self) {
    
    inline def setBranches(value: BranchNameList): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
    
    inline def setBranchesVarargs(value: BranchName*): Self = StObject.set(x, "branches", js.Array(value*))
    
    inline def setCustomData(value: RepositoryTriggerCustomData): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
    
    inline def setDestinationArn(value: Arn): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: RepositoryTriggerEventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: RepositoryTriggerEventEnum*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setName(value: RepositoryTriggerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
