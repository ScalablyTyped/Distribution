package typings.antvGLite

import typings.antvGLite.anon.Points
import typings.antvGLite.mod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csspropertypointsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.anon.Points, @antv/g-lite.anon.Points> ]:? @antv/g-lite.@antv/g-lite/dist/css/CSSProperty.CSSProperty<@antv/g-lite.anon.Points, @antv/g-lite.anon.Points>[P]} */ @JSImport("@antv/g-lite/dist/css/properties/CSSPropertyPoints", "CSSPropertyPoints")
  @js.native
  open class CSSPropertyPoints () extends StObject {
    
    def parser(pointsOrStr: String, `object`: DisplayObject[Any, Any]): Points = js.native
    def parser(pointsOrStr: js.Array[js.Tuple2[Double, Double]], `object`: DisplayObject[Any, Any]): Points = js.native
    @JSName("parser")
    var parser_Original: js.Function2[
        /* pointsOrStr */ String | (js.Array[js.Tuple2[Double, Double]]), 
        /* object */ DisplayObject[Any, Any], 
        Points
      ] = js.native
    
    /**
      * update local position
      */
    def postProcessor(`object`: typings.antvGLite.displayObjectsMod.DisplayObject[Any, Any]): Unit = js.native
  }
}
