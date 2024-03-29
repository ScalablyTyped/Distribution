package typings.awsSdk.clientsRoute53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCrossAccountAuthorizationResponse extends StObject {
  
  /**
    * The cross-account authorization.
    */
  var CrossAccountAuthorization: js.UndefOr[typings.awsSdk.clientsRoute53recoveryreadinessMod.CrossAccountAuthorization] = js.undefined
}
object CreateCrossAccountAuthorizationResponse {
  
  inline def apply(): CreateCrossAccountAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCrossAccountAuthorizationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCrossAccountAuthorizationResponse] (val x: Self) extends AnyVal {
    
    inline def setCrossAccountAuthorization(value: CrossAccountAuthorization): Self = StObject.set(x, "CrossAccountAuthorization", value.asInstanceOf[js.Any])
    
    inline def setCrossAccountAuthorizationUndefined: Self = StObject.set(x, "CrossAccountAuthorization", js.undefined)
  }
}
