package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`3rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  val attributes: `7`
  
  val value: `3rem`
}
object `17` {
  
  inline def apply(attributes: `7`): `17` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "3rem")
    __obj.asInstanceOf[`17`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `17`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `3rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
