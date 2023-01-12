package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundDangerDisabled[BaseToken] extends StObject {
  
  var background: DangerDisabled[BaseToken]
  
  var blanket: DangerDefault[BaseToken]
}
object BackgroundDangerDisabled {
  
  inline def apply[BaseToken](background: DangerDisabled[BaseToken], blanket: DangerDefault[BaseToken]): BackgroundDangerDisabled[BaseToken] = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], blanket = blanket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundDangerDisabled[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundDangerDisabled[?], BaseToken] (val x: Self & BackgroundDangerDisabled[BaseToken]) extends AnyVal {
    
    inline def setBackground(value: DangerDisabled[BaseToken]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBlanket(value: DangerDefault[BaseToken]): Self = StObject.set(x, "blanket", value.asInstanceOf[js.Any])
  }
}
