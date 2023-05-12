package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`0Dot125rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  val attributes: `0`
  
  val value: `0Dot125rem`
}
object `1` {
  
  inline def apply(attributes: `0`): `1` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "0.125rem")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `0`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `0Dot125rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
