package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContinuousDeploymentPolicyRequest extends StObject {
  
  /**
    * The identifier of the continuous deployment policy that you are getting.
    */
  var Id: String
}
object GetContinuousDeploymentPolicyRequest {
  
  inline def apply(Id: String): GetContinuousDeploymentPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContinuousDeploymentPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContinuousDeploymentPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
