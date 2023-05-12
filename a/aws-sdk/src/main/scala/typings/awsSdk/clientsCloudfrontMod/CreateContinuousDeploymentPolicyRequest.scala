package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContinuousDeploymentPolicyRequest extends StObject {
  
  /**
    * Contains the configuration for a continuous deployment policy.
    */
  var ContinuousDeploymentPolicyConfig: typings.awsSdk.clientsCloudfrontMod.ContinuousDeploymentPolicyConfig
}
object CreateContinuousDeploymentPolicyRequest {
  
  inline def apply(ContinuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfig): CreateContinuousDeploymentPolicyRequest = {
    val __obj = js.Dynamic.literal(ContinuousDeploymentPolicyConfig = ContinuousDeploymentPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContinuousDeploymentPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateContinuousDeploymentPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setContinuousDeploymentPolicyConfig(value: ContinuousDeploymentPolicyConfig): Self = StObject.set(x, "ContinuousDeploymentPolicyConfig", value.asInstanceOf[js.Any])
  }
}
