package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.LineHeight400
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineHeightTokenSchema[BaseToken] extends StObject {
  
  var font: LineHeight400[BaseToken]
}
object LineHeightTokenSchema {
  
  inline def apply[BaseToken](font: LineHeight400[BaseToken]): LineHeightTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineHeightTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineHeightTokenSchema[?], BaseToken] (val x: Self & LineHeightTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setFont(value: LineHeight400[BaseToken]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
  }
}
