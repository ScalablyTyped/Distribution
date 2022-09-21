package typings.atlaskitTokens.anon

import typings.atlaskitTokens.palettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.typesTypesMod.ShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardOverlay extends StObject {
  
  var card: ShadowToken[BaseToken]
  
  var overlay: ShadowToken[BaseToken]
}
object CardOverlay {
  
  inline def apply(card: ShadowToken[BaseToken], overlay: ShadowToken[BaseToken]): CardOverlay = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardOverlay]
  }
  
  extension [Self <: CardOverlay](x: Self) {
    
    inline def setCard(value: ShadowToken[BaseToken]): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
  }
}
