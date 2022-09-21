package typings.atlaskitTokens.typesTypesMod

import typings.atlaskitTokens.anon.BorderIconBorder
import typings.atlaskitTokens.anon.CardShadowToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedTokenSchema[BaseToken] extends StObject {
  
  var color: BorderIconBorder[BaseToken]
  
  var shadow: CardShadowToken[BaseToken]
}
object DeprecatedTokenSchema {
  
  inline def apply[BaseToken](color: BorderIconBorder[BaseToken], shadow: CardShadowToken[BaseToken]): DeprecatedTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedTokenSchema[BaseToken]]
  }
  
  extension [Self <: DeprecatedTokenSchema[?], BaseToken](x: Self & DeprecatedTokenSchema[BaseToken]) {
    
    inline def setColor(value: BorderIconBorder[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setShadow(value: CardShadowToken[BaseToken]): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
  }
}
