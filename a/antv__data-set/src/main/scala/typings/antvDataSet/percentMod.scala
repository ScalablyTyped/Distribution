package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object percentMod {
  
  @js.native
  trait Options extends StObject {
    
    var as: js.UndefOr[String] = js.native
    
    var dimension: String = js.native
    
    var field: String = js.native
    
    var groupBy: js.UndefOr[js.Array[String]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(dimension: String, field: String): Options = {
      val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBy(value: js.Array[String]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value :_*))
    }
  }
}
