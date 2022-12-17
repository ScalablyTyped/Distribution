package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction10[BaseToken] extends StObject {
  
  var interaction: `10`[BaseToken]
}
object Interaction10 {
  
  inline def apply[BaseToken](interaction: `10`[BaseToken]): Interaction10[BaseToken] = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction10[BaseToken]]
  }
  
  extension [Self <: Interaction10[?], BaseToken](x: Self & Interaction10[BaseToken]) {
    
    inline def setInteraction(value: `10`[BaseToken]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
