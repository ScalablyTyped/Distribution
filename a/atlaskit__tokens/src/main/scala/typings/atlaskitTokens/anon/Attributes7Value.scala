package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`0Dot125rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes7Value extends StObject {
  
  val attributes: `7`
  
  val value: `0Dot125rem`
}
object Attributes7Value {
  
  inline def apply(attributes: `7`): Attributes7Value = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "0.125rem")
    __obj.asInstanceOf[Attributes7Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes7Value] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `0Dot125rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
