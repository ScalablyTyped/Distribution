package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction12[BaseToken] extends StObject {
  
  var interaction: `12`[BaseToken]
}
object Interaction12 {
  
  inline def apply[BaseToken](interaction: `12`[BaseToken]): Interaction12[BaseToken] = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction12[BaseToken]]
  }
  
  extension [Self <: Interaction12[?], BaseToken](x: Self & Interaction12[BaseToken]) {
    
    inline def setInteraction(value: `12`[BaseToken]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
