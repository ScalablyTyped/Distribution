package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.BorderWarning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorTokenSchema[BaseToken] extends StObject {
  
  var color: BorderWarning[BaseToken]
}
object BorderColorTokenSchema {
  
  inline def apply[BaseToken](color: BorderWarning[BaseToken]): BorderColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderColorTokenSchema[?], BaseToken] (val x: Self & BorderColorTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setColor(value: BorderWarning[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
