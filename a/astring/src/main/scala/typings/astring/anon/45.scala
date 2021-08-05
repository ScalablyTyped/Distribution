package typings.astring.anon

import typings.astring.astringStrings.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var `type`: Property
}
object `45` {
  
  inline def apply(): `45` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Property")
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setType(value: Property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
