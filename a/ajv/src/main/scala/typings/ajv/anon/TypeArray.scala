package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeArray[T, IsPartial /* <: Boolean */] extends StObject {
  
  var `type`: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? ajv.ajv/dist/types/json-schema.JSONType<'number' | 'integer', IsPartial> : T extends string ? ajv.ajv/dist/types/json-schema.JSONType<'string', IsPartial> : T extends boolean ? ajv.ajv/dist/types/json-schema.JSONType<'boolean', IsPartial> : never */ js.Any
  ]
}
object TypeArray {
  
  inline def apply[T, IsPartial /* <: Boolean */](
    `type`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? ajv.ajv/dist/types/json-schema.JSONType<'number' | 'integer', IsPartial> : T extends string ? ajv.ajv/dist/types/json-schema.JSONType<'string', IsPartial> : T extends boolean ? ajv.ajv/dist/types/json-schema.JSONType<'boolean', IsPartial> : never */ js.Any
    ]
  ): TypeArray[T, IsPartial] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeArray[T, IsPartial]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeArray[?, ?], T, IsPartial /* <: Boolean */] (val x: Self & (TypeArray[T, IsPartial])) extends AnyVal {
    
    inline def setType(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? ajv.ajv/dist/types/json-schema.JSONType<'number' | 'integer', IsPartial> : T extends string ? ajv.ajv/dist/types/json-schema.JSONType<'string', IsPartial> : T extends boolean ? ajv.ajv/dist/types/json-schema.JSONType<'boolean', IsPartial> : never */ js.Any
        ]
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: T extends number ? ajv.ajv/dist/types/json-schema.JSONType<'number' | 'integer', IsPartial> : T extends string ? ajv.ajv/dist/types/json-schema.JSONType<'string', IsPartial> : T extends boolean ? ajv.ajv/dist/types/json-schema.JSONType<'boolean', IsPartial> : never */ js.Any)*
    ): Self = StObject.set(x, "type", js.Array(value*))
  }
}
