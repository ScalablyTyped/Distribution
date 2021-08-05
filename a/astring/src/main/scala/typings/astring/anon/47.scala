package typings.astring.anon

import typings.astring.astringStrings.MethodDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var `type`: MethodDefinition
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MethodDefinition")
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setType(value: MethodDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
