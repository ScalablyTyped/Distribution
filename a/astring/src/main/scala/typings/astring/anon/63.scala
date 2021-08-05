package typings.astring.anon

import typings.astring.astringStrings.ClassBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  var `type`: ClassBody
}
object `63` {
  
  inline def apply(): `63` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[`63`]
  }
  
  extension [Self <: `63`](x: Self) {
    
    inline def setType(value: ClassBody): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
