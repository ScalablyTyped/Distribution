package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`0Dot75rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  val attributes: `0`
  
  val value: `0Dot75rem`
}
object `4` {
  
  inline def apply(attributes: `0`): `4` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "0.75rem")
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `0`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `0Dot75rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
