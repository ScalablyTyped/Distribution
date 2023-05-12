package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDataFilters extends StObject {
  
  /**
    * A list of up to 100 agent IDs or ARNs.
    */
  var Agents: js.UndefOr[AgentsMinOneMaxHundred] = js.undefined
  
  /**
    * A filter for the user data based on the contact information that is associated to the user. It contains a list of contact states. 
    */
  var ContactFilter: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFilter] = js.undefined
  
  /**
    * A list of up to 100 queues or ARNs.
    */
  var Queues: js.UndefOr[typings.awsSdk.clientsConnectMod.Queues] = js.undefined
  
  /**
    * A list of up to 100 routing profile IDs or ARNs.
    */
  var RoutingProfiles: js.UndefOr[typings.awsSdk.clientsConnectMod.RoutingProfiles] = js.undefined
  
  /**
    * A UserHierarchyGroup ID or ARN.
    */
  var UserHierarchyGroups: js.UndefOr[UserDataHierarchyGroups] = js.undefined
}
object UserDataFilters {
  
  inline def apply(): UserDataFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDataFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserDataFilters] (val x: Self) extends AnyVal {
    
    inline def setAgents(value: AgentsMinOneMaxHundred): Self = StObject.set(x, "Agents", value.asInstanceOf[js.Any])
    
    inline def setAgentsUndefined: Self = StObject.set(x, "Agents", js.undefined)
    
    inline def setAgentsVarargs(value: UserId*): Self = StObject.set(x, "Agents", js.Array(value*))
    
    inline def setContactFilter(value: ContactFilter): Self = StObject.set(x, "ContactFilter", value.asInstanceOf[js.Any])
    
    inline def setContactFilterUndefined: Self = StObject.set(x, "ContactFilter", js.undefined)
    
    inline def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: QueueId*): Self = StObject.set(x, "Queues", js.Array(value*))
    
    inline def setRoutingProfiles(value: RoutingProfiles): Self = StObject.set(x, "RoutingProfiles", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfilesUndefined: Self = StObject.set(x, "RoutingProfiles", js.undefined)
    
    inline def setRoutingProfilesVarargs(value: RoutingProfileId*): Self = StObject.set(x, "RoutingProfiles", js.Array(value*))
    
    inline def setUserHierarchyGroups(value: UserDataHierarchyGroups): Self = StObject.set(x, "UserHierarchyGroups", value.asInstanceOf[js.Any])
    
    inline def setUserHierarchyGroupsUndefined: Self = StObject.set(x, "UserHierarchyGroups", js.undefined)
    
    inline def setUserHierarchyGroupsVarargs(value: HierarchyGroupId*): Self = StObject.set(x, "UserHierarchyGroups", js.Array(value*))
  }
}
