package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the network.
    */
  var networkArn: Arn
}
object GetNetworkRequest {
  
  inline def apply(networkArn: Arn): GetNetworkRequest = {
    val __obj = js.Dynamic.literal(networkArn = networkArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkRequest] (val x: Self) extends AnyVal {
    
    inline def setNetworkArn(value: Arn): Self = StObject.set(x, "networkArn", value.asInstanceOf[js.Any])
  }
}
