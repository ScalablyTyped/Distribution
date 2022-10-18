package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeDomainRequest extends StObject {
  
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AdvancedOptions] = js.undefined
  
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    *  When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of OpenSearch you intend to upgrade the domain to.
    */
  var TargetVersion: VersionString
}
object UpgradeDomainRequest {
  
  inline def apply(DomainName: DomainName, TargetVersion: VersionString): UpgradeDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TargetVersion = TargetVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeDomainRequest]
  }
  
  extension [Self <: UpgradeDomainRequest](x: Self) {
    
    inline def setAdvancedOptions(value: AdvancedOptions): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setPerformCheckOnly(value: Boolean): Self = StObject.set(x, "PerformCheckOnly", value.asInstanceOf[js.Any])
    
    inline def setPerformCheckOnlyUndefined: Self = StObject.set(x, "PerformCheckOnly", js.undefined)
    
    inline def setTargetVersion(value: VersionString): Self = StObject.set(x, "TargetVersion", value.asInstanceOf[js.Any])
  }
}
