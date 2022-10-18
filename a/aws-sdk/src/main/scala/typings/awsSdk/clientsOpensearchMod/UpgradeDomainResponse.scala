package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeDomainResponse extends StObject {
  
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AdvancedOptions] = js.undefined
  
  var ChangeProgressDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ChangeProgressDetails] = js.undefined
  
  var DomainName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
  
  /**
    *  When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of OpenSearch that you intend to upgrade the domain to.
    */
  var TargetVersion: js.UndefOr[VersionString] = js.undefined
  
  var UpgradeId: js.UndefOr[String] = js.undefined
}
object UpgradeDomainResponse {
  
  inline def apply(): UpgradeDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpgradeDomainResponse]
  }
  
  extension [Self <: UpgradeDomainResponse](x: Self) {
    
    inline def setAdvancedOptions(value: AdvancedOptions): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setChangeProgressDetails(value: ChangeProgressDetails): Self = StObject.set(x, "ChangeProgressDetails", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressDetailsUndefined: Self = StObject.set(x, "ChangeProgressDetails", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setPerformCheckOnly(value: Boolean): Self = StObject.set(x, "PerformCheckOnly", value.asInstanceOf[js.Any])
    
    inline def setPerformCheckOnlyUndefined: Self = StObject.set(x, "PerformCheckOnly", js.undefined)
    
    inline def setTargetVersion(value: VersionString): Self = StObject.set(x, "TargetVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetVersionUndefined: Self = StObject.set(x, "TargetVersion", js.undefined)
    
    inline def setUpgradeId(value: String): Self = StObject.set(x, "UpgradeId", value.asInstanceOf[js.Any])
    
    inline def setUpgradeIdUndefined: Self = StObject.set(x, "UpgradeId", js.undefined)
  }
}
