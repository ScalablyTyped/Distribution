package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTargetFilter extends StObject {
  
  /**
    * The attribute path for the filter.
    */
  var path: js.UndefOr[ExperimentTargetFilterPath] = js.undefined
  
  /**
    * The attribute values for the filter.
    */
  var values: js.UndefOr[ExperimentTargetFilterValues] = js.undefined
}
object ExperimentTargetFilter {
  
  inline def apply(): ExperimentTargetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTargetFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentTargetFilter] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ExperimentTargetFilterPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValues(value: ExperimentTargetFilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: ExperimentTargetFilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
