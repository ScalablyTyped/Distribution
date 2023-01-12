package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachThingPrincipalRequest extends StObject {
  
  /**
    * If the principal is a certificate, this value must be ARN of the certificate. If the principal is an Amazon Cognito identity, this value must be the ID of the Amazon Cognito identity.
    */
  var principal: Principal
  
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}
object DetachThingPrincipalRequest {
  
  inline def apply(principal: Principal, thingName: ThingName): DetachThingPrincipalRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachThingPrincipalRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetachThingPrincipalRequest] (val x: Self) extends AnyVal {
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
