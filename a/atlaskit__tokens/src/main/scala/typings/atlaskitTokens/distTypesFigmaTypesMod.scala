package typings.atlaskitTokens

import typings.atlaskitTokens.anon.A
import typings.atlaskitTokens.anon.B
import typings.atlaskitTokens.anon.X
import typings.atlaskitTokens.atlaskitTokensStrings.DROP_SHADOW
import typings.atlaskitTokens.atlaskitTokensStrings.INNER_SHADOW
import typings.atlaskitTokens.atlaskitTokensStrings.NORMAL
import typings.atlaskitTokens.atlaskitTokensStrings.SOLID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFigmaTypesMod {
  
  trait FigmaEffect extends StObject {
    
    var blendMode: NORMAL
    
    var color: A
    
    var offset: X
    
    var radius: Double
    
    var spread: js.UndefOr[Double] = js.undefined
    
    var `type`: DROP_SHADOW | INNER_SHADOW
    
    var visible: Boolean
  }
  object FigmaEffect {
    
    inline def apply(color: A, offset: X, radius: Double, `type`: DROP_SHADOW | INNER_SHADOW, visible: Boolean): FigmaEffect = {
      val __obj = js.Dynamic.literal(blendMode = "NORMAL", color = color.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FigmaEffect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FigmaEffect] (val x: Self) extends AnyVal {
      
      inline def setBlendMode(value: NORMAL): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setColor(value: A): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setSpread(value: Double): Self = StObject.set(x, "spread", value.asInstanceOf[js.Any])
      
      inline def setSpreadUndefined: Self = StObject.set(x, "spread", js.undefined)
      
      inline def setType(value: DROP_SHADOW | INNER_SHADOW): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait FigmaEffectStyle extends StObject {
    
    var description: String
    
    var effects: js.Array[FigmaEffect]
    
    var name: String
    
    def remove(): Unit
  }
  object FigmaEffectStyle {
    
    inline def apply(description: String, effects: js.Array[FigmaEffect], name: String, remove: () => Unit): FigmaEffectStyle = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[FigmaEffectStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FigmaEffectStyle] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEffects(value: js.Array[FigmaEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsVarargs(value: FigmaEffect*): Self = StObject.set(x, "effects", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
  
  trait FigmaPaint extends StObject {
    
    var blendMode: NORMAL
    
    var color: B
    
    var opacity: Double
    
    var `type`: SOLID
    
    var visible: Boolean
  }
  object FigmaPaint {
    
    inline def apply(color: B, opacity: Double, visible: Boolean): FigmaPaint = {
      val __obj = js.Dynamic.literal(blendMode = "NORMAL", color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SOLID")
      __obj.asInstanceOf[FigmaPaint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FigmaPaint] (val x: Self) extends AnyVal {
      
      inline def setBlendMode(value: NORMAL): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      inline def setColor(value: B): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setType(value: SOLID): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  trait FigmaPaintStyle extends StObject {
    
    var description: String
    
    var name: String
    
    var paints: js.Array[FigmaPaint]
    
    def remove(): Unit
  }
  object FigmaPaintStyle {
    
    inline def apply(description: String, name: String, paints: js.Array[FigmaPaint], remove: () => Unit): FigmaPaintStyle = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paints = paints.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove))
      __obj.asInstanceOf[FigmaPaintStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FigmaPaintStyle] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPaints(value: js.Array[FigmaPaint]): Self = StObject.set(x, "paints", value.asInstanceOf[js.Any])
      
      inline def setPaintsVarargs(value: FigmaPaint*): Self = StObject.set(x, "paints", js.Array(value*))
      
      inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    }
  }
}
