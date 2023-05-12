package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeightRegular[BaseToken] extends StObject {
  
  var weight: Regular[BaseToken]
}
object WeightRegular {
  
  inline def apply[BaseToken](weight: Regular[BaseToken]): WeightRegular[BaseToken] = {
    val __obj = js.Dynamic.literal(weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightRegular[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeightRegular[?], BaseToken] (val x: Self & WeightRegular[BaseToken]) extends AnyVal {
    
    inline def setWeight(value: Regular[BaseToken]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
