package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserData extends StObject {
  
  /**
    *  A map of active slots by channel. The key is a channel name. The value is an integer: the number of active slots. 
    */
  var ActiveSlotsByChannel: js.UndefOr[ChannelToCountMap] = js.undefined
  
  /**
    * A map of available slots by channel. The key is a channel name. The value is an integer: the available number of slots. 
    */
  var AvailableSlotsByChannel: js.UndefOr[ChannelToCountMap] = js.undefined
  
  /**
    * A list of contact reference information.
    */
  var Contacts: js.UndefOr[AgentContactReferenceList] = js.undefined
  
  /**
    * Contains information about the levels of a hierarchy group assigned to a user.
    */
  var HierarchyPath: js.UndefOr[HierarchyPathReference] = js.undefined
  
  /**
    * A map of maximum slots by channel. The key is a channel name. The value is an integer: the maximum number of slots. This is calculated from MediaConcurrency of the RoutingProfile assigned to the agent. 
    */
  var MaxSlotsByChannel: js.UndefOr[ChannelToCountMap] = js.undefined
  
  /**
    * Information about the routing profile that is assigned to the user.
    */
  var RoutingProfile: js.UndefOr[RoutingProfileReference] = js.undefined
  
  /**
    * The status of the agent that they manually set in their Contact Control Panel (CCP), or that the supervisor manually changes in the real-time metrics report.
    */
  var Status: js.UndefOr[AgentStatusReference] = js.undefined
  
  /**
    * Information about the user for the data that is returned. It contains the resourceId and ARN of the user. 
    */
  var User: js.UndefOr[UserReference] = js.undefined
}
object UserData {
  
  inline def apply(): UserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserData] (val x: Self) extends AnyVal {
    
    inline def setActiveSlotsByChannel(value: ChannelToCountMap): Self = StObject.set(x, "ActiveSlotsByChannel", value.asInstanceOf[js.Any])
    
    inline def setActiveSlotsByChannelUndefined: Self = StObject.set(x, "ActiveSlotsByChannel", js.undefined)
    
    inline def setAvailableSlotsByChannel(value: ChannelToCountMap): Self = StObject.set(x, "AvailableSlotsByChannel", value.asInstanceOf[js.Any])
    
    inline def setAvailableSlotsByChannelUndefined: Self = StObject.set(x, "AvailableSlotsByChannel", js.undefined)
    
    inline def setContacts(value: AgentContactReferenceList): Self = StObject.set(x, "Contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "Contacts", js.undefined)
    
    inline def setContactsVarargs(value: AgentContactReference*): Self = StObject.set(x, "Contacts", js.Array(value*))
    
    inline def setHierarchyPath(value: HierarchyPathReference): Self = StObject.set(x, "HierarchyPath", value.asInstanceOf[js.Any])
    
    inline def setHierarchyPathUndefined: Self = StObject.set(x, "HierarchyPath", js.undefined)
    
    inline def setMaxSlotsByChannel(value: ChannelToCountMap): Self = StObject.set(x, "MaxSlotsByChannel", value.asInstanceOf[js.Any])
    
    inline def setMaxSlotsByChannelUndefined: Self = StObject.set(x, "MaxSlotsByChannel", js.undefined)
    
    inline def setRoutingProfile(value: RoutingProfileReference): Self = StObject.set(x, "RoutingProfile", value.asInstanceOf[js.Any])
    
    inline def setRoutingProfileUndefined: Self = StObject.set(x, "RoutingProfile", js.undefined)
    
    inline def setStatus(value: AgentStatusReference): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUser(value: UserReference): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
