package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCrossAccountAuthorizationRequest extends StObject {
  
  /**
    * The cross-account authorization.
    */
  var CrossAccountAuthorization: typings.awsSdk.clientsRoute53recoveryreadinessMod.CrossAccountAuthorization
}
object CreateCrossAccountAuthorizationRequest {
  
  inline def apply(CrossAccountAuthorization: CrossAccountAuthorization): CreateCrossAccountAuthorizationRequest = {
    val __obj = js.Dynamic.literal(CrossAccountAuthorization = CrossAccountAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCrossAccountAuthorizationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCrossAccountAuthorizationRequest] (val x: Self) extends AnyVal {
    
    inline def setCrossAccountAuthorization(value: CrossAccountAuthorization): Self = StObject.set(x, "CrossAccountAuthorization", value.asInstanceOf[js.Any])
  }
}
