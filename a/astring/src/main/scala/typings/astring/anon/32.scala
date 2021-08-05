package typings.astring.anon

import typings.astring.astringStrings.UpdateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `32` extends StObject {
  
  var `type`: UpdateExpression
}
object `32` {
  
  inline def apply(): `32` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[`32`]
  }
  
  extension [Self <: `32`](x: Self) {
    
    inline def setType(value: UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
