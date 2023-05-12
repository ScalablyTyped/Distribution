package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContinuousDeploymentPolicyConfigRequest extends StObject {
  
  /**
    * The identifier of the continuous deployment policy whose configuration you are getting.
    */
  var Id: String
}
object GetContinuousDeploymentPolicyConfigRequest {
  
  inline def apply(Id: String): GetContinuousDeploymentPolicyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContinuousDeploymentPolicyConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContinuousDeploymentPolicyConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
