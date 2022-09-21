package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccentGrayGreen[BaseToken] extends StObject {
  
  var accent: GrayGreen[BaseToken]
}
object AccentGrayGreen {
  
  inline def apply[BaseToken](accent: GrayGreen[BaseToken]): AccentGrayGreen[BaseToken] = {
    val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccentGrayGreen[BaseToken]]
  }
  
  extension [Self <: AccentGrayGreen[?], BaseToken](x: Self & AccentGrayGreen[BaseToken]) {
    
    inline def setAccent(value: GrayGreen[BaseToken]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
  }
}
