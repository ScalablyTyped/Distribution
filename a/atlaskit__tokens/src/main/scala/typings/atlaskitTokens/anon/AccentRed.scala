package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentRed extends StObject {
  
  var accent: Red
}
object AccentRed {
  
  inline def apply(accent: Red): AccentRed = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentRed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccentRed] (val x: Self) extends AnyVal {
    
    inline def setAccent(value: Red): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
