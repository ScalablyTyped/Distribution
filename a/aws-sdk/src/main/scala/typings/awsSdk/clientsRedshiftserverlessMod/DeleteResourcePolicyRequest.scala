package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the policy to delete.
    */
  var resourceArn: String
}
object DeleteResourcePolicyRequest {
  
  inline def apply(resourceArn: String): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  extension [Self <: DeleteResourcePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
