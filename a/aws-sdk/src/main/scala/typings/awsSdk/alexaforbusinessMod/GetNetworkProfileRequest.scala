package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkProfileRequest extends StObject {
  
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: Arn
}
object GetNetworkProfileRequest {
  
  inline def apply(NetworkProfileArn: Arn): GetNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(NetworkProfileArn = NetworkProfileArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkProfileRequest]
  }
  
  extension [Self <: GetNetworkProfileRequest](x: Self) {
    
    inline def setNetworkProfileArn(value: Arn): Self = StObject.set(x, "NetworkProfileArn", value.asInstanceOf[js.Any])
  }
}
