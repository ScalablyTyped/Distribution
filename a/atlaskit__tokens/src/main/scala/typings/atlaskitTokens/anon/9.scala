package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`0Dot375rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  val attributes: `7`
  
  val value: `0Dot375rem`
}
object `9` {
  
  inline def apply(attributes: `7`): `9` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "0.375rem")
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `0Dot375rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
