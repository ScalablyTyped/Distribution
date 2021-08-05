package typings.astring.anon

import typings.astring.astringStrings.ObjectPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var `type`: ObjectPattern
}
object `62` {
  
  inline def apply(): `62` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setType(value: ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
