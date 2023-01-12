package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateComplianceByConformancePack extends StObject {
  
  /**
    * The 12-digit Amazon Web Services account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AccountId] = js.undefined
  
  /**
    * The source Amazon Web Services Region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AwsRegion] = js.undefined
  
  /**
    * The compliance status of the conformance pack.
    */
  var Compliance: js.UndefOr[AggregateConformancePackCompliance] = js.undefined
  
  /**
    * The name of the conformance pack.
    */
  var ConformancePackName: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ConformancePackName] = js.undefined
}
object AggregateComplianceByConformancePack {
  
  inline def apply(): AggregateComplianceByConformancePack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceByConformancePack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregateComplianceByConformancePack] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setCompliance(value: AggregateConformancePackCompliance): Self = StObject.set(x, "Compliance", value.asInstanceOf[js.Any])
    
    inline def setComplianceUndefined: Self = StObject.set(x, "Compliance", js.undefined)
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setConformancePackNameUndefined: Self = StObject.set(x, "ConformancePackName", js.undefined)
  }
}
