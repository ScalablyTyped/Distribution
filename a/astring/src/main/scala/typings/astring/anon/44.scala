package typings.astring.anon

import typings.astring.astringStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  var `type`: ThrowStatement
}
object `44` {
  
  inline def apply(): `44` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setType(value: ThrowStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
