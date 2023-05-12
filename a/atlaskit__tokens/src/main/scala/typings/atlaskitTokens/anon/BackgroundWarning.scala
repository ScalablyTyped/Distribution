package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundWarning[BaseToken] extends StObject {
  
  var background: Warning[BaseToken]
  
  var blanket: DangerDefault[BaseToken]
}
object BackgroundWarning {
  
  inline def apply[BaseToken](background: Warning[BaseToken], blanket: DangerDefault[BaseToken]): BackgroundWarning[BaseToken] = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], blanket = blanket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundWarning[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundWarning[?], BaseToken] (val x: Self & BackgroundWarning[BaseToken]) extends AnyVal {
    
    inline def setBackground(value: Warning[BaseToken]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBlanket(value: DangerDefault[BaseToken]): Self = StObject.set(x, "blanket", value.asInstanceOf[js.Any])
  }
}
