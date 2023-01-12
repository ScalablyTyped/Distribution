package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCognitoEventsRequest extends StObject {
  
  /**
    * The Cognito Identity Pool ID for the request
    */
  var IdentityPoolId: typings.awsSdk.clientsCognitosyncMod.IdentityPoolId
}
object GetCognitoEventsRequest {
  
  inline def apply(IdentityPoolId: IdentityPoolId): GetCognitoEventsRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCognitoEventsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCognitoEventsRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
  }
}
