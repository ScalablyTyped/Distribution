package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the network resource.
    */
  var networkResourceArn: Arn
}
object GetNetworkResourceRequest {
  
  inline def apply(networkResourceArn: Arn): GetNetworkResourceRequest = {
    val __obj = js.Dynamic.literal(networkResourceArn = networkResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkResourceRequest]
  }
  
  extension [Self <: GetNetworkResourceRequest](x: Self) {
    
    inline def setNetworkResourceArn(value: Arn): Self = StObject.set(x, "networkResourceArn", value.asInstanceOf[js.Any])
  }
}
