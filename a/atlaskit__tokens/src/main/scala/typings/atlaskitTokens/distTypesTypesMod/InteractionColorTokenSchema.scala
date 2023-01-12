package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Interaction10
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionColorTokenSchema[BaseToken] extends StObject {
  
  var color: Interaction10[BaseToken]
}
object InteractionColorTokenSchema {
  
  inline def apply[BaseToken](color: Interaction10[BaseToken]): InteractionColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionColorTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionColorTokenSchema[?], BaseToken] (val x: Self & InteractionColorTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setColor(value: Interaction10[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
