package typings.atlaskitTokens.typesTypesMod

import typings.atlaskitTokens.anon.BorderDefaultDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColorTokenSchema[BaseToken] extends StObject {
  
  var color: BorderDefaultDisabled[BaseToken]
}
object BorderColorTokenSchema {
  
  inline def apply[BaseToken](color: BorderDefaultDisabled[BaseToken]): BorderColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColorTokenSchema[BaseToken]]
  }
  
  extension [Self <: BorderColorTokenSchema[?], BaseToken](x: Self & BorderColorTokenSchema[BaseToken]) {
    
    inline def setColor(value: BorderDefaultDisabled[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
