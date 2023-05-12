package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`1Dot5rem`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  val attributes: `7`
  
  val value: `1Dot5rem`
}
object `14` {
  
  inline def apply(attributes: `7`): `14` = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = "1.5rem")
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `1Dot5rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
