package typings.ajv.anon

import typings.ajv.ajvBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalItems extends StObject {
  
  var additionalItems: `false`
}
object AdditionalItems {
  
  inline def apply(): AdditionalItems = {
    val __obj = js.Dynamic.literal(additionalItems = false)
    __obj.asInstanceOf[AdditionalItems]
  }
  
  extension [Self <: AdditionalItems](x: Self) {
    
    inline def setAdditionalItems(value: `false`): Self = StObject.set(x, "additionalItems", value.asInstanceOf[js.Any])
  }
}
