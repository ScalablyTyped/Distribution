package typings.astring.anon

import typings.astring.astringStrings.ArrayExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var `type`: ArrayExpression
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setType(value: ArrayExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
