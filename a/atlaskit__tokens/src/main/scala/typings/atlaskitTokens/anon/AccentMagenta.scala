package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentMagenta extends StObject {
  
  var accent: Magenta
}
object AccentMagenta {
  
  inline def apply(accent: Magenta): AccentMagenta = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentMagenta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccentMagenta] (val x: Self) extends AnyVal {
    
    inline def setAccent(value: Magenta): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
