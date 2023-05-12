package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionHoveredPaintTokenPressedPaintToken[BaseToken] extends StObject {
  
  var interaction: HoveredPaintTokenPressedPaintToken[BaseToken]
}
object InteractionHoveredPaintTokenPressedPaintToken {
  
  inline def apply[BaseToken](interaction: HoveredPaintTokenPressedPaintToken[BaseToken]): InteractionHoveredPaintTokenPressedPaintToken[BaseToken] = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionHoveredPaintTokenPressedPaintToken[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionHoveredPaintTokenPressedPaintToken[?], BaseToken] (val x: Self & InteractionHoveredPaintTokenPressedPaintToken[BaseToken]) extends AnyVal {
    
    inline def setInteraction(value: HoveredPaintTokenPressedPaintToken[BaseToken]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
