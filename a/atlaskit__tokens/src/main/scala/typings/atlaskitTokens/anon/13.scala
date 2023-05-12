package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`1Dot25rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  val attributes: `7`
  
  val value: `1Dot25rem`
}
object `13` {
  
  inline def apply(attributes: `7`): `13` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "1.25rem")
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `13`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `1Dot25rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
