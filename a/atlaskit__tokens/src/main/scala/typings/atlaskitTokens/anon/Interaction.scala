package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction extends StObject {
  
  var interaction: Hovered
}
object Interaction {
  
  inline def apply(interaction: Hovered): Interaction = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction]
  }
  
  extension [Self <: Interaction](x: Self) {
    
    inline def setInteraction(value: Hovered): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
