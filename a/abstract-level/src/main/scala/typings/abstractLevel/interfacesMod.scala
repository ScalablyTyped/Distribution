package typings.abstractLevel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  type NodeCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[T], Unit]
  
  trait RangeOptions[K] extends StObject {
    
    var gt: js.UndefOr[K] = js.undefined
    
    var gte: js.UndefOr[K] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var lt: js.UndefOr[K] = js.undefined
    
    var lte: js.UndefOr[K] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object RangeOptions {
    
    inline def apply[K](): RangeOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeOptions[K]]
    }
    
    extension [Self <: RangeOptions[?], K](x: Self & RangeOptions[K]) {
      
      inline def setGt(value: K): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      inline def setGte(value: K): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLt(value: K): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      inline def setLte(value: K): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
}
