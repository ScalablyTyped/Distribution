package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramMod {
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var binWidth: js.UndefOr[Double] = js.undefined
    
    var bins: js.UndefOr[Double] = js.undefined
    
    var field: String
    
    var groupBy: js.UndefOr[js.Array[String]] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(field: String): Options = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Tuple2[String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBinWidth(value: Double): Self = StObject.set(x, "binWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinWidthUndefined: Self = StObject.set(x, "binWidth", js.undefined)
      
      @scala.inline
      def setBins(value: Double): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBy(value: js.Array[String]): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setGroupByVarargs(value: String*): Self = StObject.set(x, "groupBy", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
