package typings.astring.anon

import typings.astring.astringStrings.NewExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var `type`: NewExpression
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setType(value: NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
