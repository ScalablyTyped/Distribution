package typings.airbnbPropTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Gt extends StObject {
    
    var gt: js.UndefOr[Double] = js.undefined
    
    var gte: js.UndefOr[Double] = js.undefined
    
    var lt: js.UndefOr[Double] = js.undefined
    
    var lte: js.UndefOr[Double] = js.undefined
  }
  object Gt {
    
    inline def apply(): Gt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gt]
    }
    
    extension [Self <: Gt](x: Self) {
      
      inline def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      inline def setGte(value: Double): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      inline def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      inline def setLte(value: Double): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
    }
  }
  
  trait StripHOCs extends StObject {
    
    var stripHOCs: js.Array[String]
  }
  object StripHOCs {
    
    inline def apply(stripHOCs: js.Array[String]): StripHOCs = {
      val __obj = js.Dynamic.literal(stripHOCs = stripHOCs.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripHOCs]
    }
    
    extension [Self <: StripHOCs](x: Self) {
      
      inline def setStripHOCs(value: js.Array[String]): Self = StObject.set(x, "stripHOCs", value.asInstanceOf[js.Any])
      
      inline def setStripHOCsVarargs(value: String*): Self = StObject.set(x, "stripHOCs", js.Array(value*))
    }
  }
}
