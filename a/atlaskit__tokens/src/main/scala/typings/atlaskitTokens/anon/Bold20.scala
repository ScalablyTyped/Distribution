package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bold20[BaseToken] extends StObject {
  
  var `[default]`: `20`[BaseToken]
  
  var bold: `20`[BaseToken]
}
object Bold20 {
  
  inline def apply[BaseToken](`[default]`: `20`[BaseToken], bold: `20`[BaseToken]): Bold20[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bold20[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bold20[?], BaseToken] (val x: Self & Bold20[BaseToken]) extends AnyVal {
    
    inline def setBold(value: `20`[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: `20`[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
