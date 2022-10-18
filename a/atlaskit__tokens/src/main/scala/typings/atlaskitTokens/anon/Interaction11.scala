package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction11[BaseToken] extends StObject {
  
  var interaction: `11`[BaseToken]
}
object Interaction11 {
  
  inline def apply[BaseToken](interaction: `11`[BaseToken]): Interaction11[BaseToken] = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction11[BaseToken]]
  }
  
  extension [Self <: Interaction11[?], BaseToken](x: Self & Interaction11[BaseToken]) {
    
    inline def setInteraction(value: `11`[BaseToken]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
