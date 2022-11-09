package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpgradeDomainRequest extends StObject {
  
  /**
    * Only supports the override_main_response_version parameter and not other advanced options. You can only include this option when upgrading to an OpenSearch version. Specifies whether the domain reports its version as 7.10 so that it continues to work with Elasticsearch OSS clients and plugins.
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.clientsOpensearchMod.AdvancedOptions] = js.undefined
  
  /**
    * Name of the OpenSearch Service domain that you want to upgrade.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the upgrade.
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * OpenSearch or Elasticsearch version to which you want to upgrade, in the format Opensearch_X.Y or Elasticsearch_X.Y.
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
