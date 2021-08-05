package typings.astring.anon

import typings.astring.astringStrings.SwitchCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var `type`: SwitchCase
}
object `16` {
  
  inline def apply(): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[`16`]
  }
  
  extension [Self <: `16`](x: Self) {
    
    inline def setType(value: SwitchCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
