package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContinuousDeploymentPolicyConfigResult extends StObject {
  
  var ContinuousDeploymentPolicyConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ContinuousDeploymentPolicyConfig] = js.undefined
  
  /**
    * The version identifier for the current version of the continuous deployment policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object GetContinuousDeploymentPolicyConfigResult {
  
  inline def apply(): GetContinuousDeploymentPolicyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContinuousDeploymentPolicyConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContinuousDeploymentPolicyConfigResult] (val x: Self) extends AnyVal {
    
    inline def setContinuousDeploymentPolicyConfig(value: ContinuousDeploymentPolicyConfig): Self = StObject.set(x, "ContinuousDeploymentPolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setContinuousDeploymentPolicyConfigUndefined: Self = StObject.set(x, "ContinuousDeploymentPolicyConfig", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
