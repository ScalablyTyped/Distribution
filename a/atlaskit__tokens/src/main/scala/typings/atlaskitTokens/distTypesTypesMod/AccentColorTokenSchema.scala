package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.BackgroundBorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentColorTokenSchema[BaseToken] extends StObject {
  
  var color: BackgroundBorder[BaseToken]
}
object AccentColorTokenSchema {
  
  inline def apply[BaseToken](color: BackgroundBorder[BaseToken]): AccentColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentColorTokenSchema[BaseToken]]
  }
  
  extension [Self <: AccentColorTokenSchema[?], BaseToken](x: Self & AccentColorTokenSchema[BaseToken]) {
    
    inline def setColor(value: BackgroundBorder[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
