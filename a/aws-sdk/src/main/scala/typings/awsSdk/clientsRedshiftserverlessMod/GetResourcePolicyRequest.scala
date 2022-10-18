package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource to return.
    */
  var resourceArn: String
}
object GetResourcePolicyRequest {
  
  inline def apply(resourceArn: String): GetResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyRequest]
  }
  
  extension [Self <: GetResourcePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
