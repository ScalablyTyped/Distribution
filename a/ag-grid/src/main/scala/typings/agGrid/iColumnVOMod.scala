package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iColumnVOMod {
  
  trait ColumnVO extends StObject {
    
    var aggFunc: String
    
    var displayName: String
    
    var field: String
    
    var id: String
  }
  object ColumnVO {
    
    inline def apply(aggFunc: String, displayName: String, field: String, id: String): ColumnVO = {
      val __obj = js.Dynamic.literal(aggFunc = aggFunc.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnVO]
    }
    
    extension [Self <: ColumnVO](x: Self) {
      
      inline def setAggFunc(value: String): Self = StObject.set(x, "aggFunc", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
