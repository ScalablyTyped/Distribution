package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentOrange extends StObject {
  
  var accent: Orange
}
object AccentOrange {
  
  inline def apply(accent: Orange): AccentOrange = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentOrange]
  }
  
  extension [Self <: AccentOrange](x: Self) {
    
    inline def setAccent(value: Orange): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
