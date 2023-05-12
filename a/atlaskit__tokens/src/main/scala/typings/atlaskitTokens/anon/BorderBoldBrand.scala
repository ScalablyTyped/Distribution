package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderBoldBrand[BaseToken] extends StObject {
  
  var border: BoldBrand[BaseToken]
}
object BorderBoldBrand {
  
  inline def apply[BaseToken](border: BoldBrand[BaseToken]): BorderBoldBrand[BaseToken] = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderBoldBrand[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderBoldBrand[?], BaseToken] (val x: Self & BorderBoldBrand[BaseToken]) extends AnyVal {
    
    inline def setBorder(value: BoldBrand[BaseToken]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
