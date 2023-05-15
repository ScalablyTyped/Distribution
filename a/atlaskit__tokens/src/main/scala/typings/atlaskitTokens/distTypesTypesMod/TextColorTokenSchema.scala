package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Link19
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColorTokenSchema[BaseToken] extends StObject {
  
  var color: Link19[BaseToken]
}
object TextColorTokenSchema {
  
  inline def apply[BaseToken](color: Link19[BaseToken]): TextColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColorTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextColorTokenSchema[?], BaseToken] (val x: Self & TextColorTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setColor(value: Link19[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
