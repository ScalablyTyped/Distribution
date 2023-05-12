package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistentChat extends StObject {
  
  /**
    * The contactId that is used for rehydration depends on the rehydration type. RehydrationType is required for persistent chat.     ENTIRE_PAST_SESSION: Rehydrates a chat from the most recently terminated past chat contact of the specified past ended chat session. To use this type, provide the initialContactId of the past ended chat session in the sourceContactId field. In this type, Amazon Connect determines the most recent chat contact on the specified chat session that has ended, and uses it to start a persistent chat.     FROM_SEGMENT: Rehydrates a chat from the past chat contact that is specified in the sourceContactId field.    The actual contactId used for rehydration is provided in the response of this API. 
    */
  var RehydrationType: js.UndefOr[typings.awsSdk.clientsConnectMod.RehydrationType] = js.undefined
  
  /**
    * The contactId from which a persistent chat session must be started.
    */
  var SourceContactId: js.UndefOr[ContactId] = js.undefined
}
object PersistentChat {
  
  inline def apply(): PersistentChat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentChat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PersistentChat] (val x: Self) extends AnyVal {
    
    inline def setRehydrationType(value: RehydrationType): Self = StObject.set(x, "RehydrationType", value.asInstanceOf[js.Any])
    
    inline def setRehydrationTypeUndefined: Self = StObject.set(x, "RehydrationType", js.undefined)
    
    inline def setSourceContactId(value: ContactId): Self = StObject.set(x, "SourceContactId", value.asInstanceOf[js.Any])
    
    inline def setSourceContactIdUndefined: Self = StObject.set(x, "SourceContactId", js.undefined)
  }
}
