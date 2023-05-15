package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionPressedPaintToken extends StObject {
  
  var interaction: PressedPaintToken
}
object InteractionPressedPaintToken {
  
  inline def apply(interaction: PressedPaintToken): InteractionPressedPaintToken = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionPressedPaintToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionPressedPaintToken] (val x: Self) extends AnyVal {
    
    inline def setInteraction(value: PressedPaintToken): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
