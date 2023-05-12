package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceSyncBlockerInput extends StObject {
  
  /**
    * The ID of the service sync blocker.
    */
  var id: String
  
  /**
    * The reason the service sync blocker was resolved.
    */
  var resolvedReason: String
}
object UpdateServiceSyncBlockerInput {
  
  inline def apply(id: String, resolvedReason: String): UpdateServiceSyncBlockerInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resolvedReason = resolvedReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSyncBlockerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceSyncBlockerInput] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setResolvedReason(value: String): Self = StObject.set(x, "resolvedReason", value.asInstanceOf[js.Any])
  }
}
