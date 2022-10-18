package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateTargetFilter extends StObject {
  
  /**
    * The attribute path for the filter.
    */
  var path: js.UndefOr[ExperimentTemplateTargetFilterPath] = js.undefined
  
  /**
    * The attribute values for the filter.
    */
  var values: js.UndefOr[ExperimentTemplateTargetFilterValues] = js.undefined
}
object ExperimentTemplateTargetFilter {
  
  inline def apply(): ExperimentTemplateTargetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplateTargetFilter]
  }
  
  extension [Self <: ExperimentTemplateTargetFilter](x: Self) {
    
    inline def setPath(value: ExperimentTemplateTargetFilterPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValues(value: ExperimentTemplateTargetFilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: ExperimentTemplateTargetFilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
