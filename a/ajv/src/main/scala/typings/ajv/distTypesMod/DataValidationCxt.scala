package typings.ajv.distTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataValidationCxt[T /* <: String | Double */] extends StObject {
  
  var dynamicAnchors: /* import warning: importer.ImportType#apply Failed type conversion: {[ Ref in string ]:? ajv.ajv/dist/types.ValidateFunction<unknown>} */ js.Any
  
  var instancePath: String
  
  var parentData: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]: any} */ js.Any
  
  var parentDataProperty: T
  
  var rootData: (Record[String, Any]) | js.Array[Any]
}
object DataValidationCxt {
  
  inline def apply[T /* <: String | Double */](
    dynamicAnchors: /* import warning: importer.ImportType#apply Failed type conversion: {[ Ref in string ]:? ajv.ajv/dist/types.ValidateFunction<unknown>} */ js.Any,
    instancePath: String,
    parentData: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]: any} */ js.Any,
    parentDataProperty: T,
    rootData: (Record[String, Any]) | js.Array[Any]
  ): DataValidationCxt[T] = {
    val __obj = js.Dynamic.literal(dynamicAnchors = dynamicAnchors.asInstanceOf[js.Any], instancePath = instancePath.asInstanceOf[js.Any], parentData = parentData.asInstanceOf[js.Any], parentDataProperty = parentDataProperty.asInstanceOf[js.Any], rootData = rootData.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValidationCxt[T]]
  }
  
  extension [Self <: DataValidationCxt[?], T /* <: String | Double */](x: Self & DataValidationCxt[T]) {
    
    inline def setDynamicAnchors(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ Ref in string ]:? ajv.ajv/dist/types.ValidateFunction<unknown>} */ js.Any
    ): Self = StObject.set(x, "dynamicAnchors", value.asInstanceOf[js.Any])
    
    inline def setInstancePath(value: String): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
    
    inline def setParentData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T ]: any} */ js.Any
    ): Self = StObject.set(x, "parentData", value.asInstanceOf[js.Any])
    
    inline def setParentDataProperty(value: T): Self = StObject.set(x, "parentDataProperty", value.asInstanceOf[js.Any])
    
    inline def setRootData(value: (Record[String, Any]) | js.Array[Any]): Self = StObject.set(x, "rootData", value.asInstanceOf[js.Any])
    
    inline def setRootDataVarargs(value: Any*): Self = StObject.set(x, "rootData", js.Array(value*))
  }
}
