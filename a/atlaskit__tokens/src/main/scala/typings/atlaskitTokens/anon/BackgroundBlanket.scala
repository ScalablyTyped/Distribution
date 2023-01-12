package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundBlanket extends StObject {
  
  var background: Input
  
  var blanket: Selected
}
object BackgroundBlanket {
  
  inline def apply(background: Input, blanket: Selected): BackgroundBlanket = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], blanket = blanket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundBlanket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundBlanket] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Input): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBlanket(value: Selected): Self = StObject.set(x, "blanket", value.asInstanceOf[js.Any])
  }
}
