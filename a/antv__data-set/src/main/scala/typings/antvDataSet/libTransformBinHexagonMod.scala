package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformBinHexagonMod {
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple3[String, String, String]] = js.undefined
    
    var binWidth: js.UndefOr[js.Array[Double]] = js.undefined
    
    var bins: js.UndefOr[js.Array[Double]] = js.undefined
    
    var fields: js.Tuple2[String, String]
    
    var offset: js.UndefOr[js.Array[Double]] = js.undefined
    
    var sizeByCount: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(fields: js.Tuple2[String, String]): Options = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAs(value: js.Tuple3[String, String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBinWidth(value: js.Array[Double]): Self = StObject.set(x, "binWidth", value.asInstanceOf[js.Any])
      
      inline def setBinWidthUndefined: Self = StObject.set(x, "binWidth", js.undefined)
      
      inline def setBinWidthVarargs(value: Double*): Self = StObject.set(x, "binWidth", js.Array(value*))
      
      inline def setBins(value: js.Array[Double]): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
      
      inline def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
      
      inline def setBinsVarargs(value: Double*): Self = StObject.set(x, "bins", js.Array(value*))
      
      inline def setFields(value: js.Tuple2[String, String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value*))
      
      inline def setSizeByCount(value: Boolean): Self = StObject.set(x, "sizeByCount", value.asInstanceOf[js.Any])
      
      inline def setSizeByCountUndefined: Self = StObject.set(x, "sizeByCount", js.undefined)
    }
  }
}
