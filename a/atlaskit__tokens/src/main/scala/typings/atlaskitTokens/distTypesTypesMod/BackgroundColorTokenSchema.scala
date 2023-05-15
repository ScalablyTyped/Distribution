package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.BackgroundInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorTokenSchema[BaseToken] extends StObject {
  
  var color: BackgroundInput[BaseToken]
}
object BackgroundColorTokenSchema {
  
  inline def apply[BaseToken](color: BackgroundInput[BaseToken]): BackgroundColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundColorTokenSchema[?], BaseToken] (val x: Self & BackgroundColorTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setColor(value: BackgroundInput[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
