package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeight400[BaseToken] extends StObject {
  
  var lineHeight: `400`[BaseToken]
}
object LineHeight400 {
  
  inline def apply[BaseToken](lineHeight: `400`[BaseToken]): LineHeight400[BaseToken] = {
    val __obj = js.Dynamic.literal(lineHeight = lineHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeight400[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineHeight400[?], BaseToken] (val x: Self & LineHeight400[BaseToken]) extends AnyVal {
    
    inline def setLineHeight(value: `400`[BaseToken]): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
  }
}
