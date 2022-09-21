package typings.ajv.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var optionalProperties: js.UndefOr[Record[String, scala.Nothing]] = js.undefined
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setOptionalProperties(value: Record[String, scala.Nothing]): Self = StObject.set(x, "optionalProperties", value.asInstanceOf[js.Any])
    
    inline def setOptionalPropertiesUndefined: Self = StObject.set(x, "optionalProperties", js.undefined)
  }
}
