package typings.ajv.anon

import typings.ajv.typesJtdSchemaMod.NumberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeNumberType extends StObject {
  
  var `type`: NumberType
}
object TypeNumberType {
  
  inline def apply(`type`: NumberType): TypeNumberType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeNumberType]
  }
  
  extension [Self <: TypeNumberType](x: Self) {
    
    inline def setType(value: NumberType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
