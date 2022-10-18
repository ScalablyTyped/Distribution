package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentParameterRanges extends StObject {
  
  /**
    * Specified a list of parameters for each category.
    */
  var CategoricalParameterRanges: js.UndefOr[CategoricalParameters] = js.undefined
}
object EnvironmentParameterRanges {
  
  inline def apply(): EnvironmentParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentParameterRanges]
  }
  
  extension [Self <: EnvironmentParameterRanges](x: Self) {
    
    inline def setCategoricalParameterRanges(value: CategoricalParameters): Self = StObject.set(x, "CategoricalParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setCategoricalParameterRangesUndefined: Self = StObject.set(x, "CategoricalParameterRanges", js.undefined)
    
    inline def setCategoricalParameterRangesVarargs(value: CategoricalParameter*): Self = StObject.set(x, "CategoricalParameterRanges", js.Array(value*))
  }
}
