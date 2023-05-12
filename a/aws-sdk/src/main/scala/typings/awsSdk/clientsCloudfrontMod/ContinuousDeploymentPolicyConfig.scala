package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousDeploymentPolicyConfig extends StObject {
  
  /**
    * A Boolean that indicates whether this continuous deployment policy is enabled (in effect). When this value is true, this policy is enabled and in effect. When this value is false, this policy is not enabled and has no effect.
    */
  var Enabled: Boolean
  
  /**
    * The CloudFront domain name of the staging distribution. For example: d111111abcdef8.cloudfront.net.
    */
  var StagingDistributionDnsNames: typings.awsSdk.clientsCloudfrontMod.StagingDistributionDnsNames
  
  /**
    * Contains the parameters for routing production traffic from your primary to staging distributions.
    */
  var TrafficConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.TrafficConfig] = js.undefined
}
object ContinuousDeploymentPolicyConfig {
  
  inline def apply(Enabled: Boolean, StagingDistributionDnsNames: StagingDistributionDnsNames): ContinuousDeploymentPolicyConfig = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], StagingDistributionDnsNames = StagingDistributionDnsNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousDeploymentPolicyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinuousDeploymentPolicyConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setStagingDistributionDnsNames(value: StagingDistributionDnsNames): Self = StObject.set(x, "StagingDistributionDnsNames", value.asInstanceOf[js.Any])
    
    inline def setTrafficConfig(value: TrafficConfig): Self = StObject.set(x, "TrafficConfig", value.asInstanceOf[js.Any])
    
    inline def setTrafficConfigUndefined: Self = StObject.set(x, "TrafficConfig", js.undefined)
  }
}
