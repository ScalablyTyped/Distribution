package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContinuousDeploymentPolicyResult extends StObject {
  
  /**
    * A continuous deployment policy.
    */
  var ContinuousDeploymentPolicy: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ContinuousDeploymentPolicy] = js.undefined
  
  /**
    * The version identifier for the current version of the continuous deployment policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
}
object UpdateContinuousDeploymentPolicyResult {
  
  inline def apply(): UpdateContinuousDeploymentPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContinuousDeploymentPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateContinuousDeploymentPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setContinuousDeploymentPolicy(value: ContinuousDeploymentPolicy): Self = StObject.set(x, "ContinuousDeploymentPolicy", value.asInstanceOf[js.Any])
    
    inline def setContinuousDeploymentPolicyUndefined: Self = StObject.set(x, "ContinuousDeploymentPolicy", js.undefined)
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
  }
}
