package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18`[BaseToken] extends StObject {
  
  var bold: DefaultPaintTokenHoveredPaintToken[BaseToken]
}
object `18` {
  
  inline def apply[BaseToken](bold: DefaultPaintTokenHoveredPaintToken[BaseToken]): `18`[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `18`[?], BaseToken] (val x: Self & `18`[BaseToken]) extends AnyVal {
    
    inline def setBold(value: DefaultPaintTokenHoveredPaintToken[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
  }
}
