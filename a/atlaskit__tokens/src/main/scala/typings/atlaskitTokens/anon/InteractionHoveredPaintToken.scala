package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionHoveredPaintToken extends StObject {
  
  var interaction: HoveredPaintToken
}
object InteractionHoveredPaintToken {
  
  inline def apply(interaction: HoveredPaintToken): InteractionHoveredPaintToken = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionHoveredPaintToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionHoveredPaintToken] (val x: Self) extends AnyVal {
    
    inline def setInteraction(value: HoveredPaintToken): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
