package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDryRunProgressRequest extends StObject {
  
  /**
    * The name of the domain.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * The unique identifier of the dry run.
    */
  var DryRunId: js.UndefOr[GUID] = js.undefined
  
  /**
    * Whether to include the configuration of the dry run in the response. The configuration specifies the updates that you're planning to make on the domain.
    */
  var LoadDryRunConfig: js.UndefOr[Boolean] = js.undefined
}
object DescribeDryRunProgressRequest {
  
  inline def apply(DomainName: DomainName): DescribeDryRunProgressRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDryRunProgressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDryRunProgressRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDryRunId(value: GUID): Self = StObject.set(x, "DryRunId", value.asInstanceOf[js.Any])
    
    inline def setDryRunIdUndefined: Self = StObject.set(x, "DryRunId", js.undefined)
    
    inline def setLoadDryRunConfig(value: Boolean): Self = StObject.set(x, "LoadDryRunConfig", value.asInstanceOf[js.Any])
    
    inline def setLoadDryRunConfigUndefined: Self = StObject.set(x, "LoadDryRunConfig", js.undefined)
  }
}
