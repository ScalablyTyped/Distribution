package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accent extends StObject {
  
  var accent: Blue
}
object Accent {
  
  inline def apply(accent: Blue): Accent = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accent]
  }
  
  extension [Self <: Accent](x: Self) {
    
    inline def setAccent(value: Blue): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
