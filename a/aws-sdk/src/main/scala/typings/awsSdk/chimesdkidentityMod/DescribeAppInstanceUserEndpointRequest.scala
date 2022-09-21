package typings.awsSdk.chimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceUserEndpointRequest extends StObject {
  
  /**
    * The ARN of the AppInstanceUser.
    */
  var AppInstanceUserArn: SensitiveString1600
  
  /**
    * The unique identifier of the AppInstanceUserEndpoint.
    */
  var EndpointId: SensitiveString64
}
object DescribeAppInstanceUserEndpointRequest {
  
  inline def apply(AppInstanceUserArn: SensitiveString1600, EndpointId: SensitiveString64): DescribeAppInstanceUserEndpointRequest = {
    val __obj = js.Dynamic.literal(AppInstanceUserArn = AppInstanceUserArn.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppInstanceUserEndpointRequest]
  }
  
  extension [Self <: DescribeAppInstanceUserEndpointRequest](x: Self) {
    
    inline def setAppInstanceUserArn(value: SensitiveString1600): Self = StObject.set(x, "AppInstanceUserArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: SensitiveString64): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
  }
}
