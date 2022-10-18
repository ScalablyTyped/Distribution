package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteACLResponse extends StObject {
  
  /**
    * The Access Control List object that has been deleted.
    */
  var ACL: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ACL] = js.undefined
}
object DeleteACLResponse {
  
  inline def apply(): DeleteACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteACLResponse]
  }
  
  extension [Self <: DeleteACLResponse](x: Self) {
    
    inline def setACL(value: ACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
  }
}
