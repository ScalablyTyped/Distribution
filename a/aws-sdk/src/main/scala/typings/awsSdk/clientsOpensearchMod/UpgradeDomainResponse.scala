package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeDomainResponse extends StObject {
  
  /**
    * The advanced options configuration for the domain.
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AdvancedOptions] = js.undefined
  
  /**
    * Container for information about a configuration change happening on a domain.
    */
  var ChangeProgressDetails: js.UndefOr[typings.awsSdk.clientsOpensearchMod.ChangeProgressDetails] = js.undefined
  
  /**
    * The name of the domain that was upgraded.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainName] = js.undefined
  
  /**
    * When true, indicates that an upgrade eligibility check was performed.
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * OpenSearch or Elasticsearch version that the domain was upgraded to.
    */
  var TargetVersion: js.UndefOr[VersionString] = js.undefined
  
  /**
    * The unique identifier of the domain upgrade.
    */
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
