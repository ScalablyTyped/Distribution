package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blanket extends StObject {
  
  var background: Brand
  
  var blanket: Danger
}
object Blanket {
  
  inline def apply(background: Brand, blanket: Danger): Blanket = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], blanket = blanket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blanket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Blanket] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Brand): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBlanket(value: Danger): Self = StObject.set(x, "blanket", value.asInstanceOf[js.Any])
  }
}
