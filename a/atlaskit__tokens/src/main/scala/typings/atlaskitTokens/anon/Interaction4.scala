package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction4[BaseToken] extends StObject {
  
  var interaction: `4`[BaseToken]
}
object Interaction4 {
  
  inline def apply[BaseToken](interaction: `4`[BaseToken]): Interaction4[BaseToken] = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction4[BaseToken]]
  }
  
  extension [Self <: Interaction4[?], BaseToken](x: Self & Interaction4[BaseToken]) {
    
    inline def setInteraction(value: `4`[BaseToken]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
