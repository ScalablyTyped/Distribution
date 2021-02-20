package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectangleMod {
  
  @js.native
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple3[String, String, String]] = js.native
    
    var binWidth: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var bins: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var fields: js.Tuple2[String, String] = js.native
    
    var offset: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var sizeByCount: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(fields: js.Tuple2[String, String]): Options = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Tuple3[String, String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBinWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "binWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinWidthUndefined: Self = StObject.set(x, "binWidth", js.undefined)
      
      @scala.inline
      def setBins(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      @scala.inline
      def setFields(value: js.Tuple2[String, String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setSizeByCount(value: Boolean): Self = StObject.set(x, "sizeByCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeByCountUndefined: Self = StObject.set(x, "sizeByCount", js.undefined)
    }
  }
}
