package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCrossAccountAuthorizationRequest extends StObject {
  
  /**
    * The cross-account authorization.
    */
  var CrossAccountAuthorization: string
}
object DeleteCrossAccountAuthorizationRequest {
  
  inline def apply(CrossAccountAuthorization: string): DeleteCrossAccountAuthorizationRequest = {
    val __obj = js.Dynamic.literal(CrossAccountAuthorization = CrossAccountAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCrossAccountAuthorizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCrossAccountAuthorizationRequest] (val x: Self) extends AnyVal {
    
    inline def setCrossAccountAuthorization(value: string): Self = StObject.set(x, "CrossAccountAuthorization", value.asInstanceOf[js.Any])
  }
}
