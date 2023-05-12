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
    * The status of the dry run being performed on the domain, if any.
    */
  var DryRunProgressStatus: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DryRunProgressStatus] = js.undefined
  
  /**
    * Results of the dry run performed in the update domain request.
    */
  var DryRunResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DryRunResults] = js.undefined
}
object UpdateDomainConfigResponse {
  
  inline def apply(DomainConfig: DomainConfig): UpdateDomainConfigResponse = {
    val __obj = js.Dynamic.literal(DomainConfig = DomainConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDomainConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainConfig(value: DomainConfig): Self = StObject.set(x, "DomainConfig", value.asInstanceOf[js.Any])
    
    inline def setDryRunProgressStatus(value: DryRunProgressStatus): Self = StObject.set(x, "DryRunProgressStatus", value.asInstanceOf[js.Any])
    
    inline def setDryRunProgressStatusUndefined: Self = StObject.set(x, "DryRunProgressStatus", js.undefined)
    
    inline def setDryRunResults(value: DryRunResults): Self = StObject.set(x, "DryRunResults", value.asInstanceOf[js.Any])
    
    inline def setDryRunResultsUndefined: Self = StObject.set(x, "DryRunResults", js.undefined)
  }
}
