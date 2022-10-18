package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainConfigResponse extends StObject {
  
  /**
    * The status of the updated domain.
    */
  var DomainConfig: typings.awsSdk.clientsOpensearchMod.DomainConfig
  
  /**
    * Contains result of DryRun. 
    */
  var DryRunResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DryRunResults] = js.undefined
}
object UpdateDomainConfigResponse {
  
  inline def apply(DomainConfig: DomainConfig): UpdateDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainConfigResponse]
  }
  
  extension [Self <: UpdateDomainConfigResponse](x: Self) {
    
    inline def setDomainConfig(value: DomainConfig): Self = StObject.set(x, "DomainConfig", value.asInstanceOf[js.Any])
    
    inline def setDryRunResults(value: DryRunResults): Self = StObject.set(x, "DryRunResults", value.asInstanceOf[js.Any])
    
    inline def setDryRunResultsUndefined: Self = StObject.set(x, "DryRunResults", js.undefined)
  }
}
