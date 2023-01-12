package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentGreen extends StObject {
  
  var accent: Green
}
object AccentGreen {
  
  inline def apply(accent: Green): AccentGreen = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentGreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccentGreen] (val x: Self) extends AnyVal {
    
    inline def setAccent(value: Green): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
