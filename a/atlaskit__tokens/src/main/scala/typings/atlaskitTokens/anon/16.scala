package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`2Dot5rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  val attributes: `7`
  
  val value: `2Dot5rem`
}
object `16` {
  
  inline def apply(attributes: `7`): `16` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "2.5rem")
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `16`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `2Dot5rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
