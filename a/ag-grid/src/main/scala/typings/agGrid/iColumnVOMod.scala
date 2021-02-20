package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iColumnVOMod {
  
  @js.native
  trait ColumnVO extends StObject {
    
    var aggFunc: String = js.native
    
    var displayName: String = js.native
    
    var field: String = js.native
    
    var id: String = js.native
  }
  object ColumnVO {
    
    @scala.inline
    def apply(aggFunc: String, displayName: String, field: String, id: String): ColumnVO = {
      val __obj = js.Dynamic.literal(aggFunc = aggFunc.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnVO]
    }
    
    @scala.inline
    implicit class ColumnVOMutableBuilder[Self <: ColumnVO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggFunc(value: String): Self = StObject.set(x, "aggFunc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
