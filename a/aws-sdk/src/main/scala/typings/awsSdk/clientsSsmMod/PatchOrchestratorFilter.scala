package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchOrchestratorFilter extends StObject {
  
  /**
    * The key for the filter.
    */
  var Key: js.UndefOr[PatchOrchestratorFilterKey] = js.undefined
  
  /**
    * The value for the filter.
    */
  var Values: js.UndefOr[PatchOrchestratorFilterValues] = js.undefined
}
object PatchOrchestratorFilter {
  
  inline def apply(): PatchOrchestratorFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchOrchestratorFilter]
  }
  
  extension [Self <: PatchOrchestratorFilter](x: Self) {
    
    inline def setKey(value: PatchOrchestratorFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValues(value: PatchOrchestratorFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: PatchOrchestratorFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
