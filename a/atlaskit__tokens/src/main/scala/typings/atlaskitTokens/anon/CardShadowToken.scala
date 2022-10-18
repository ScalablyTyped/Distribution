package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.ShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardShadowToken[BaseToken] extends StObject {
  
  var card: ShadowToken[BaseToken]
  
  var overlay: ShadowToken[BaseToken]
}
object CardShadowToken {
  
  inline def apply[BaseToken](card: ShadowToken[BaseToken], overlay: ShadowToken[BaseToken]): CardShadowToken[BaseToken] = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardShadowToken[BaseToken]]
  }
  
  extension [Self <: CardShadowToken[?], BaseToken](x: Self & CardShadowToken[BaseToken]) {
    
    inline def setCard(value: ShadowToken[BaseToken]): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
  }
}
