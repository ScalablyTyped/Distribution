package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateComplianceByConfigRule extends StObject {
  
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AccountId] = js.undefined
  
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AwsRegion] = js.undefined
  
  /**
    * Indicates whether an Amazon Web Services resource or Config rule is compliant and provides the number of contributors that affect the compliance.
    */
  var Compliance: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.Compliance] = js.undefined
  
  /**
    * The name of the Config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConfigRuleName] = js.undefined
}
object AggregateComplianceByConfigRule {
  
  inline def apply(): AggregateComplianceByConfigRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceByConfigRule]
  }
  
  extension [Self <: AggregateComplianceByConfigRule](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setCompliance(value: Compliance): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
  }
}
