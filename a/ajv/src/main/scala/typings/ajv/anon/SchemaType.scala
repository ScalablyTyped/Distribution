package typings.ajv.anon

import typings.ajv.distCompileRulesMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaType extends StObject {
  
  var schemaType: js.Array[JSONType]
  
  var `type`: js.Array[JSONType]
}
object SchemaType {
  
  inline def apply(schemaType: js.Array[JSONType], `type`: js.Array[JSONType]): SchemaType = {
    val __obj = js.Dynamic.literal(schemaType = schemaType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaType] (val x: Self) extends AnyVal {
    
    inline def setSchemaType(value: js.Array[JSONType]): Self = StObject.set(x, "schemaType", value.asInstanceOf[js.Any])
    
    inline def setSchemaTypeVarargs(value: JSONType*): Self = StObject.set(x, "schemaType", js.Array(value*))
    
    inline def setType(value: js.Array[JSONType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: JSONType*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
