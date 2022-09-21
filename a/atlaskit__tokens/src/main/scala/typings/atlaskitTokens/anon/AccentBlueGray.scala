package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentBlueGray[BaseToken] extends StObject {
  
  var accent: BlueGray[BaseToken]
}
object AccentBlueGray {
  
  inline def apply[BaseToken](accent: BlueGray[BaseToken]): AccentBlueGray[BaseToken] = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentBlueGray[BaseToken]]
  }
  
  extension [Self <: AccentBlueGray[?], BaseToken](x: Self & AccentBlueGray[BaseToken]) {
    
    inline def setAccent(value: BlueGray[BaseToken]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
