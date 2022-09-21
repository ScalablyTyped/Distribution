package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentPurple extends StObject {
  
  var accent: Purple
}
object AccentPurple {
  
  inline def apply(accent: Purple): AccentPurple = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentPurple]
  }
  
  extension [Self <: AccentPurple](x: Self) {
    
    inline def setAccent(value: Purple): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
