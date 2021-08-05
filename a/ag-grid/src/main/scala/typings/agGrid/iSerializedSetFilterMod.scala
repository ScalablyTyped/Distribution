package typings.agGrid

import typings.agGrid.iFilterMod.SerializedFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iSerializedSetFilterMod {
  
  trait SerializedSetFilter
    extends StObject
       with SerializedFilter {
    
    var values: js.Array[String]
  }
  object SerializedSetFilter {
    
    inline def apply(filterType: String, values: js.Array[String]): SerializedSetFilter = {
      val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedSetFilter]
    }
    
    extension [Self <: SerializedSetFilter](x: Self) {
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
