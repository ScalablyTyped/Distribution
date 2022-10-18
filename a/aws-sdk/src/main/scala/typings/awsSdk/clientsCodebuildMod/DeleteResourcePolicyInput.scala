package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyInput extends StObject {
  
  /**
    *  The ARN of the resource that is associated with the resource policy. 
    */
  var resourceArn: NonEmptyString
}
object DeleteResourcePolicyInput {
  
  inline def apply(resourceArn: NonEmptyString): DeleteResourcePolicyInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourcePolicyInput]
  }
  
  extension [Self <: DeleteResourcePolicyInput](x: Self) {
    
    inline def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
