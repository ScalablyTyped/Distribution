package typings.antvComponent

import typings.antvComponent.typesMod.GroupComponentCfg
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlerMod {
  
  @JSImport("@antv/component/lib/slider/handler", JSImport.Default)
  @js.native
  class default () extends Handler
  
  @JSImport("@antv/component/lib/slider/handler", "Handler")
  @js.native
  class Handler ()
    extends typings.antvComponent.groupComponentMod.default[HandlerCfg] {
    
    /* private */ var bindEvents: js.Any = js.native
    
    /* private */ var draw: js.Any = js.native
  }
  
  trait HandlerCfg
    extends StObject
       with GroupComponentCfg {
    
    val height: Double
    
    val style: js.UndefOr[IStyle] = js.undefined
    
    val width: Double
    
    val x: Double
    
    val y: Double
  }
  object HandlerCfg {
    
    inline def apply(container: IGroup, height: Double, width: Double, x: Double, y: Double): HandlerCfg = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandlerCfg]
    }
    
    extension [Self <: HandlerCfg](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: IStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait IStyle extends StObject {
    
    var cursor: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var highLightFill: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
  }
  object IStyle {
    
    inline def apply(): IStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStyle]
    }
    
    extension [Self <: IStyle](x: Self) {
      
      inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setHighLightFill(value: String): Self = StObject.set(x, "highLightFill", value.asInstanceOf[js.Any])
      
      inline def setHighLightFillUndefined: Self = StObject.set(x, "highLightFill", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
}
