package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueMappings extends StObject {
  
  /**
    * The value and display value pairs.
    */
  var values: ValueMappingList
}
object ValueMappings {
  
  inline def apply(values: ValueMappingList): ValueMappings = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueMappings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueMappings] (val x: Self) extends AnyVal {
    
    inline def setValues(value: ValueMappingList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: ValueMapping*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
