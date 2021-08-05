package typings.astring.anon

import typings.astring.astringStrings.Literal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var `type`: Literal
}
object `48` {
  
  inline def apply(): `48` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Literal")
    __obj.asInstanceOf[`48`]
  }
  
  extension [Self <: `48`](x: Self) {
    
    inline def setType(value: Literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
