package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeProgressDetails extends StObject {
  
  /**
    * The unique change identifier associated with a specific domain configuration change.
    */
  var ChangeId: js.UndefOr[GUID] = js.undefined
  
  /**
    * Contains an optional message associated with the domain configuration change.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsOpensearchMod.Message] = js.undefined
}
object ChangeProgressDetails {
  
  inline def apply(): ChangeProgressDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeProgressDetails]
  }
  
  extension [Self <: ChangeProgressDetails](x: Self) {
    
    inline def setChangeId(value: GUID): Self = StObject.set(x, "ChangeId", value.asInstanceOf[js.Any])
    
    inline def setChangeIdUndefined: Self = StObject.set(x, "ChangeId", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
