package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.WeightRegular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeightTokenSchema[BaseToken] extends StObject {
  
  var font: WeightRegular[BaseToken]
}
object FontWeightTokenSchema {
  
  inline def apply[BaseToken](font: WeightRegular[BaseToken]): FontWeightTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontWeightTokenSchema[?], BaseToken] (val x: Self & FontWeightTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setFont(value: WeightRegular[BaseToken]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
  }
}
