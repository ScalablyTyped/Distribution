package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkProfileRequest extends StObject {
  
  /**
    * The ARN of the network profile to return information about.
    */
  var arn: AmazonResourceName
}
object GetNetworkProfileRequest {
  
  inline def apply(arn: AmazonResourceName): GetNetworkProfileRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
