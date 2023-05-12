package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bold19[BaseToken] extends StObject {
  
  var `[default]`: `19`[BaseToken]
  
  var bold: `19`[BaseToken]
}
object Bold19 {
  
  inline def apply[BaseToken](`[default]`: `19`[BaseToken], bold: `19`[BaseToken]): Bold19[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bold19[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bold19[?], BaseToken] (val x: Self & Bold19[BaseToken]) extends AnyVal {
    
    inline def setBold(value: `19`[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: `19`[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
