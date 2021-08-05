package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object voronoiMod {
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Tuple2[String, String]] = js.undefined
    
    var extend: js.UndefOr[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.undefined
    
    var fields: js.Tuple2[String, String]
    
    var size: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  }
  object Options {
    
    inline def apply(fields: js.Tuple2[String, String]): Options = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAs(value: js.Tuple2[String, String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setExtend(value: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
      
      inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
      
      inline def setFields(value: js.Tuple2[String, String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setSize(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
