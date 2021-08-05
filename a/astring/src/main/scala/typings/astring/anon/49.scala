package typings.astring.anon

import typings.astring.astringStrings.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var `type`: Program
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setType(value: Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
