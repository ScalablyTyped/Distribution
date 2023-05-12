package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`2rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  val attributes: `7`
  
  val value: `2rem`
}
object `15` {
  
  inline def apply(attributes: `7`): `15` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "2rem")
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `15`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `2rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
