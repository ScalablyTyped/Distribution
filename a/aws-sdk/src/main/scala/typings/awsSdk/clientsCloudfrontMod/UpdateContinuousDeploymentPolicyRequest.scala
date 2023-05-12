package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContinuousDeploymentPolicyRequest extends StObject {
  
  /**
    * The continuous deployment policy configuration.
    */
  var ContinuousDeploymentPolicyConfig: typings.awsSdk.clientsCloudfrontMod.ContinuousDeploymentPolicyConfig
  
  /**
    * The identifier of the continuous deployment policy that you are updating.
    */
  var Id: String
  
  /**
    * The current version (ETag value) of the continuous deployment policy that you are updating.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object UpdateContinuousDeploymentPolicyRequest {
  
  inline def apply(ContinuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfig, Id: String): UpdateContinuousDeploymentPolicyRequest = {
    val __obj = js.Dynamic.literal(ContinuousDeploymentPolicyConfig = ContinuousDeploymentPolicyConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContinuousDeploymentPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContinuousDeploymentPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setContinuousDeploymentPolicyConfig(value: ContinuousDeploymentPolicyConfig): Self = StObject.set(x, "ContinuousDeploymentPolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
