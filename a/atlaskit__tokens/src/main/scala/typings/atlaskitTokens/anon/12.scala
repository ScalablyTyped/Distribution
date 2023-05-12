package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`1rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  val attributes: `7`
  
  val value: `1rem`
}
object `12` {
  
  inline def apply(attributes: `7`): `12` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "1rem")
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `12`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `1rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
