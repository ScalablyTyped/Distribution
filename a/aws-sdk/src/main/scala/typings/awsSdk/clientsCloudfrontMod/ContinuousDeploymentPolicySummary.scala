package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousDeploymentPolicySummary extends StObject {
  
  /**
    * The continuous deployment policy.
    */
  var ContinuousDeploymentPolicy: typings.awsSdk.clientsCloudfrontMod.ContinuousDeploymentPolicy
}
object ContinuousDeploymentPolicySummary {
  
  inline def apply(ContinuousDeploymentPolicy: ContinuousDeploymentPolicy): ContinuousDeploymentPolicySummary = {
    val __obj = js.Dynamic.literal(ContinuousDeploymentPolicy = ContinuousDeploymentPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentPolicySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousDeploymentPolicySummary] (val x: Self) extends AnyVal {
    
    inline def setContinuousDeploymentPolicy(value: ContinuousDeploymentPolicy): Self = StObject.set(x, "ContinuousDeploymentPolicy", value.asInstanceOf[js.Any])
  }
}
