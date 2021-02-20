package typings.amapJsApi.AMap

import typings.amapJsApi.amapJsApiStrings.circle
import typings.amapJsApi.amapJsApiStrings.poly
import typings.amapJsApi.amapJsApiStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MarkerShape {
  
  @js.native
  trait CircleOptions extends Options {
    
    var coords: js.Tuple3[Double, Double, Double] = js.native
    
    var `type`: circle = js.native
  }
  object CircleOptions {
    
    @scala.inline
    def apply(coords: js.Tuple3[Double, Double, Double], `type`: circle): CircleOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleOptions]
    }
    
    @scala.inline
    implicit class CircleOptionsMutableBuilder[Self <: CircleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoords(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.AMap.MarkerShape.CircleOptions
    - typings.amapJsApi.AMap.MarkerShape.PolyOptions
    - typings.amapJsApi.AMap.MarkerShape.RectOptions
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def CircleOptions(coords: js.Tuple3[Double, Double, Double], `type`: circle): typings.amapJsApi.AMap.MarkerShape.CircleOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApi.AMap.MarkerShape.CircleOptions]
    }
    
    @scala.inline
    def PolyOptions(coords: js.Array[Double], `type`: poly): typings.amapJsApi.AMap.MarkerShape.PolyOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApi.AMap.MarkerShape.PolyOptions]
    }
    
    @scala.inline
    def RectOptions(coords: js.Tuple4[Double, Double, Double, Double], `type`: rect): typings.amapJsApi.AMap.MarkerShape.RectOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApi.AMap.MarkerShape.RectOptions]
    }
  }
  
  @js.native
  trait PolyOptions extends Options {
    
    var coords: js.Array[Double] = js.native
    
    var `type`: poly = js.native
  }
  object PolyOptions {
    
    @scala.inline
    def apply(coords: js.Array[Double], `type`: poly): PolyOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolyOptions]
    }
    
    @scala.inline
    implicit class PolyOptionsMutableBuilder[Self <: PolyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoords(value: js.Array[Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsVarargs(value: Double*): Self = StObject.set(x, "coords", js.Array(value :_*))
      
      @scala.inline
      def setType(value: poly): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RectOptions extends Options {
    
    var coords: js.Tuple4[Double, Double, Double, Double] = js.native
    
    var `type`: rect = js.native
  }
  object RectOptions {
    
    @scala.inline
    def apply(coords: js.Tuple4[Double, Double, Double, Double], `type`: rect): RectOptions = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectOptions]
    }
    
    @scala.inline
    implicit class RectOptionsMutableBuilder[Self <: RectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoords(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: rect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
