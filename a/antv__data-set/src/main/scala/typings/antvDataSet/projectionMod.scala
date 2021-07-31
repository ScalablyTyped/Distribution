package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectionMod {
  
  trait Options extends StObject {
    
    var as: js.UndefOr[js.Array[String]] = js.undefined
    
    var projection: String
  }
  object Options {
    
    @scala.inline
    def apply(projection: String): Options = {
      val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value :_*))
      
      @scala.inline
      def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    }
  }
}
