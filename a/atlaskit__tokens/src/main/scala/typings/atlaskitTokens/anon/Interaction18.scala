package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction18[BaseToken] extends StObject {
  
  var interaction: `18`[BaseToken]
}
object Interaction18 {
  
  inline def apply[BaseToken](interaction: `18`[BaseToken]): Interaction18[BaseToken] = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interaction18[BaseToken]]
  }
  
  extension [Self <: Interaction18[?], BaseToken](x: Self & Interaction18[BaseToken]) {
    
    inline def setInteraction(value: `18`[BaseToken]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
  }
}
