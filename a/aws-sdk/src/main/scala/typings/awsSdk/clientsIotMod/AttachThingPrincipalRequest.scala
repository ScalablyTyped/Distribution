package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachThingPrincipalRequest extends StObject {
  
  /**
    * The principal, which can be a certificate ARN (as returned from the CreateCertificate operation) or an Amazon Cognito ID.
    */
  var principal: Principal
  
  /**
    * The name of the thing.
    */
  var thingName: ThingName
}
object AttachThingPrincipalRequest {
  
  inline def apply(principal: Principal, thingName: ThingName): AttachThingPrincipalRequest = {
    val __obj = js.Dynamic.literal(principal = principal.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachThingPrincipalRequest]
  }
  
  extension [Self <: AttachThingPrincipalRequest](x: Self) {
    
    inline def setPrincipal(value: Principal): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
