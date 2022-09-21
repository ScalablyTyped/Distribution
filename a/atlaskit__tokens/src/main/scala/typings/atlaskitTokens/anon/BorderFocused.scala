package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderFocused extends StObject {
  
  var border: Focused
}
object BorderFocused {
  
  inline def apply(border: Focused): BorderFocused = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderFocused]
  }
  
  extension [Self <: BorderFocused](x: Self) {
    
    inline def setBorder(value: Focused): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
