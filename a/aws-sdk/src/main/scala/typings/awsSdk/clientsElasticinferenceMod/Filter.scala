package typings.awsSdk.clientsElasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    *  The filter name for the Elastic Inference Accelerator list. It can assume the following values: accelerator-type: the type of Elastic Inference Accelerator to filter for. instance-id: an EC2 instance id to filter for. 
    */
  var name: js.UndefOr[FilterName] = js.undefined
  
  /**
    *  The values for the filter of the Elastic Inference Accelerator list. 
    */
  var values: js.UndefOr[ValueStringList] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: ValueStringList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
