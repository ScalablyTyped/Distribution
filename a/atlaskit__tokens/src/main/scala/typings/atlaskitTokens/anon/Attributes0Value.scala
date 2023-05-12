package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`0Dot0625rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes0Value extends StObject {
  
  val attributes: `0`
  
  val value: `0Dot0625rem`
}
object Attributes0Value {
  
  inline def apply(attributes: `0`): Attributes0Value = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "0.0625rem")
    __obj.asInstanceOf[Attributes0Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes0Value] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `0`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `0Dot0625rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
