package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.ShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Card extends StObject {
  
  var card: ShadowToken[BaseToken]
  
  var overlay: ShadowToken[BaseToken]
}
object Card {
  
  inline def apply(card: ShadowToken[BaseToken], overlay: ShadowToken[BaseToken]): Card = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
  
  extension [Self <: Card](x: Self) {
    
    inline def setCard(value: ShadowToken[BaseToken]): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
  }
}
