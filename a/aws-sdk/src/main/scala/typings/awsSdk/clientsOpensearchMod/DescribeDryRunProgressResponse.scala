package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDryRunProgressResponse extends StObject {
  
  /**
    * Details about the changes you're planning to make on the domain.
    */
  var DryRunConfig: js.UndefOr[DomainStatus] = js.undefined
  
  /**
    * The current status of the dry run, including any validation errors.
    */
  var DryRunProgressStatus: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DryRunProgressStatus] = js.undefined
  
  /**
    * The results of the dry run. 
    */
  var DryRunResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DryRunResults] = js.undefined
}
object DescribeDryRunProgressResponse {
  
  inline def apply(): DescribeDryRunProgressResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDryRunProgressResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDryRunProgressResponse] (val x: Self) extends AnyVal {
    
    inline def setDryRunConfig(value: DomainStatus): Self = StObject.set(x, "DryRunConfig", value.asInstanceOf[js.Any])
    
    inline def setDryRunConfigUndefined: Self = StObject.set(x, "DryRunConfig", js.undefined)
    
    inline def setDryRunProgressStatus(value: DryRunProgressStatus): Self = StObject.set(x, "DryRunProgressStatus", value.asInstanceOf[js.Any])
    
    inline def setDryRunProgressStatusUndefined: Self = StObject.set(x, "DryRunProgressStatus", js.undefined)
    
    inline def setDryRunResults(value: DryRunResults): Self = StObject.set(x, "DryRunResults", value.asInstanceOf[js.Any])
    
    inline def setDryRunResultsUndefined: Self = StObject.set(x, "DryRunResults", js.undefined)
  }
}
