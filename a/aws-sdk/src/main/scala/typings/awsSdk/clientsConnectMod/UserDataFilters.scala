package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDataFilters extends StObject {
  
  /**
    * A filter for the user data based on the contact information that is associated to the user. It contains a list of contact states. 
    */
  var ContactFilter: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactFilter] = js.undefined
  
  /**
    * Contains information about a queue resource for which metrics are returned.
    */
  var Queues: js.UndefOr[typings.awsSdk.clientsConnectMod.Queues] = js.undefined
}
object UserDataFilters {
  
  inline def apply(): UserDataFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDataFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserDataFilters] (val x: Self) extends AnyVal {
    
    inline def setContactFilter(value: ContactFilter): Self = StObject.set(x, "ContactFilter", value.asInstanceOf[js.Any])
    
    inline def setContactFilterUndefined: Self = StObject.set(x, "ContactFilter", js.undefined)
    
    inline def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: QueueId*): Self = StObject.set(x, "Queues", js.Array(value*))
  }
}
