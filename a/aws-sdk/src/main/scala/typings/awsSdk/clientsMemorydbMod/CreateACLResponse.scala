package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateACLResponse extends StObject {
  
  /**
    * The newly-created Access Control List.
    */
  var ACL: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ACL] = js.undefined
}
object CreateACLResponse {
  
  inline def apply(): CreateACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateACLResponse]
  }
  
  extension [Self <: CreateACLResponse](x: Self) {
    
    inline def setACL(value: ACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
  }
}
