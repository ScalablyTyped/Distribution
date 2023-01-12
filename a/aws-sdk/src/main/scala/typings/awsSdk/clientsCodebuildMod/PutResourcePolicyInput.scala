package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyInput extends StObject {
  
  /**
    *  A JSON-formatted resource policy. For more information, see Sharing a Project and Sharing a Report Group in the CodeBuild User Guide. 
    */
  var policy: NonEmptyString
  
  /**
    *  The ARN of the Project or ReportGroup resource you want to associate with a resource policy. 
    */
  var resourceArn: NonEmptyString
}
object PutResourcePolicyInput {
  
  inline def apply(policy: NonEmptyString, resourceArn: NonEmptyString): PutResourcePolicyInput = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyInput] (val x: Self) extends AnyVal {
    
    inline def setPolicy(value: NonEmptyString): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setResourceArn(value: NonEmptyString): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
