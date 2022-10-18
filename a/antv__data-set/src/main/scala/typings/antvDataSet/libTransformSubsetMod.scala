package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransformSubsetMod {
  
  trait Options extends StObject {
    
    var endRowIndex: js.UndefOr[Double] = js.undefined
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    var startRowIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEndRowIndex(value: Double): Self = StObject.set(x, "endRowIndex", value.asInstanceOf[js.Any])
      
      inline def setEndRowIndexUndefined: Self = StObject.set(x, "endRowIndex", js.undefined)
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setStartRowIndex(value: Double): Self = StObject.set(x, "startRowIndex", value.asInstanceOf[js.Any])
      
      inline def setStartRowIndexUndefined: Self = StObject.set(x, "startRowIndex", js.undefined)
    }
  }
}
