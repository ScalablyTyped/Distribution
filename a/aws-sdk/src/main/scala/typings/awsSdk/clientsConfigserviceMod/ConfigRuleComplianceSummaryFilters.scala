package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRuleComplianceSummaryFilters extends StObject {
  
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AccountId] = js.undefined
  
  /**
    * The source region where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AwsRegion] = js.undefined
}
object ConfigRuleComplianceSummaryFilters {
  
  inline def apply(): ConfigRuleComplianceSummaryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleComplianceSummaryFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigRuleComplianceSummaryFilters] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
  }
}
