package typings.ajv.anon

import typings.ajv.typesJtdSchemaMod.StringType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeStringType extends StObject {
  
  var `type`: StringType
}
object TypeStringType {
  
  inline def apply(`type`: StringType): TypeStringType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeStringType]
  }
  
  extension [Self <: TypeStringType](x: Self) {
    
    inline def setType(value: StringType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
