package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreAddressToClassicRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Elastic IP address.
    */
  var PublicIp: String
}
object RestoreAddressToClassicRequest {
  
  inline def apply(PublicIp: String): RestoreAddressToClassicRequest = {
    val __obj = js.Dynamic.literal(PublicIp = PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreAddressToClassicRequest]
  }
  
  extension [Self <: RestoreAddressToClassicRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
  }
}
