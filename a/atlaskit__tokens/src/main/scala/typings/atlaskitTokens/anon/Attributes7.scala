package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes7 extends StObject {
  
  val attributes: `7`
  
  val value: typings.atlaskitTokens.atlaskitTokensStrings.`0`
}
object Attributes7 {
  
  inline def apply(attributes: `7`): Attributes7 = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "0")
    __obj.asInstanceOf[Attributes7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes7] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: typings.atlaskitTokens.atlaskitTokensStrings.`0`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
