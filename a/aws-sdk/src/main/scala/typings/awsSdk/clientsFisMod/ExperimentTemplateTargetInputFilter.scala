package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateTargetInputFilter extends StObject {
  
  /**
    * The attribute path for the filter.
    */
  var path: ExperimentTemplateTargetFilterPath
  
  /**
    * The attribute values for the filter.
    */
  var values: ExperimentTemplateTargetFilterValues
}
object ExperimentTemplateTargetInputFilter {
  
  inline def apply(path: ExperimentTemplateTargetFilterPath, values: ExperimentTemplateTargetFilterValues): ExperimentTemplateTargetInputFilter = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentTemplateTargetInputFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentTemplateTargetInputFilter] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ExperimentTemplateTargetFilterPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValues(value: ExperimentTemplateTargetFilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ExperimentTemplateTargetFilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
