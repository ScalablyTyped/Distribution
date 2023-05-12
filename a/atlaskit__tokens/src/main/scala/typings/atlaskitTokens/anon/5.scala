package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`1rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  val attributes: `0`
  
  val value: `1rem`
}
object `5` {
  
  inline def apply(attributes: `0`): `5` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "1rem")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `0`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `1rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
