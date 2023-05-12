package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousDeploymentPolicy extends StObject {
  
  var ContinuousDeploymentPolicyConfig: typings.awsSdk.clientsCloudfrontMod.ContinuousDeploymentPolicyConfig
  
  /**
    * The identifier of the continuous deployment policy.
    */
  var Id: String
  
  /**
    * The date and time the continuous deployment policy was last modified.
    */
  var LastModifiedTime: js.Date
}
object ContinuousDeploymentPolicy {
  
  inline def apply(
    ContinuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfig,
    Id: String,
    LastModifiedTime: js.Date
  ): ContinuousDeploymentPolicy = {
    val __obj = js.Dynamic.literal(ContinuousDeploymentPolicyConfig = ContinuousDeploymentPolicyConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousDeploymentPolicy] (val x: Self) extends AnyVal {
    
    inline def setContinuousDeploymentPolicyConfig(value: ContinuousDeploymentPolicyConfig): Self = StObject.set(x, "ContinuousDeploymentPolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
