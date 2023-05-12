package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSuccess extends StObject {
  
  var icon: Success
}
object IconSuccess {
  
  inline def apply(icon: Success): IconSuccess = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconSuccess] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: Success): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
