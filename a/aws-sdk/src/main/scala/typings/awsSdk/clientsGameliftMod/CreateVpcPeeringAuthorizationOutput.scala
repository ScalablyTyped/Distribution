package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcPeeringAuthorizationOutput extends StObject {
  
  /**
    * Details on the requested VPC peering authorization, including expiration.
    */
  var VpcPeeringAuthorization: js.UndefOr[typings.awsSdk.clientsGameliftMod.VpcPeeringAuthorization] = js.undefined
}
object CreateVpcPeeringAuthorizationOutput {
  
  inline def apply(): CreateVpcPeeringAuthorizationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcPeeringAuthorizationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcPeeringAuthorizationOutput] (val x: Self) extends AnyVal {
    
    inline def setVpcPeeringAuthorization(value: VpcPeeringAuthorization): Self = StObject.set(x, "VpcPeeringAuthorization", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringAuthorizationUndefined: Self = StObject.set(x, "VpcPeeringAuthorization", js.undefined)
  }
}
