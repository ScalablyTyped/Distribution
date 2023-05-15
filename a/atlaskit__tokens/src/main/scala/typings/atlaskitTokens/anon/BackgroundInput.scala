package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundInput[BaseToken] extends StObject {
  
  var background: Input[BaseToken]
  
  var blanket: DangerDefault[BaseToken]
}
object BackgroundInput {
  
  inline def apply[BaseToken](background: Input[BaseToken], blanket: DangerDefault[BaseToken]): BackgroundInput[BaseToken] = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], blanket = blanket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundInput[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundInput[?], BaseToken] (val x: Self & BackgroundInput[BaseToken]) extends AnyVal {
    
    inline def setBackground(value: Input[BaseToken]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBlanket(value: DangerDefault[BaseToken]): Self = StObject.set(x, "blanket", value.asInstanceOf[js.Any])
  }
}
