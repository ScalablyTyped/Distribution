package typings.airbnbPropTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Gt extends StObject {
    
    var gt: js.UndefOr[Double] = js.native
    
    var gte: js.UndefOr[Double] = js.native
    
    var lt: js.UndefOr[Double] = js.native
    
    var lte: js.UndefOr[Double] = js.native
  }
  object Gt {
    
    @scala.inline
    def apply(): Gt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Gt]
    }
    
    @scala.inline
    implicit class GtMutableBuilder[Self <: Gt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGt(value: Double): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      @scala.inline
      def setGte(value: Double): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      @scala.inline
      def setLt(value: Double): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      @scala.inline
      def setLte(value: Double): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
    }
  }
  
  @js.native
  trait StripHOCs extends StObject {
    
    var stripHOCs: js.Array[String] = js.native
  }
  object StripHOCs {
    
    @scala.inline
    def apply(stripHOCs: js.Array[String]): StripHOCs = {
      val __obj = js.Dynamic.literal(stripHOCs = stripHOCs.asInstanceOf[js.Any])
      __obj.asInstanceOf[StripHOCs]
    }
    
    @scala.inline
    implicit class StripHOCsMutableBuilder[Self <: StripHOCs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStripHOCs(value: js.Array[String]): Self = StObject.set(x, "stripHOCs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripHOCsVarargs(value: String*): Self = StObject.set(x, "stripHOCs", js.Array(value :_*))
    }
  }
}
