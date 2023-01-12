package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateACLResponse extends StObject {
  
  /**
    * The updated Access Control List
    */
  var ACL: js.UndefOr[typings.awsSdk.clientsMemorydbMod.ACL] = js.undefined
}
object UpdateACLResponse {
  
  inline def apply(): UpdateACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateACLResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateACLResponse] (val x: Self) extends AnyVal {
    
    inline def setACL(value: ACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
  }
}
