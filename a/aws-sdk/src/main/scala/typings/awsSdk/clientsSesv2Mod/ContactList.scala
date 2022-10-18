package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactList extends StObject {
  
  /**
    * The name of the contact list.
    */
  var ContactListName: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ContactListName] = js.undefined
  
  /**
    * A timestamp noting the last time the contact list was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object ContactList {
  
  inline def apply(): ContactList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactList]
  }
  
  extension [Self <: ContactList](x: Self) {
    
    inline def setContactListName(value: ContactListName): Self = StObject.set(x, "ContactListName", value.asInstanceOf[js.Any])
    
    inline def setContactListNameUndefined: Self = StObject.set(x, "ContactListName", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
  }
}
