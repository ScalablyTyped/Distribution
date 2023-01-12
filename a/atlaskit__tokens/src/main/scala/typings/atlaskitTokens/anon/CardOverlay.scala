package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.ShadowToken
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardOverlay] (val x: Self) extends AnyVal {
    
    inline def setCard(value: ShadowToken[BaseToken]): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: ShadowToken[BaseToken]): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
  }
}
