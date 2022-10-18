package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStudioMemberRequest extends StObject {
  
  /**
    * The principal ID. This currently supports a IAM Identity Center UserId. 
    */
  var principalId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object GetStudioMemberRequest {
  
  inline def apply(principalId: String, studioId: String): GetStudioMemberRequest = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStudioMemberRequest]
  }
  
  extension [Self <: GetStudioMemberRequest](x: Self) {
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
