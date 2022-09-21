package typings.ajv.anon

import org.scalablytyped.runtime.TopLevel
import typings.ajv.ajvStrings.array
import typings.ajv.jsonSchemaMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Items[IsPartial /* <: Boolean */, T] extends StObject {
  
  var items: typings.ajv.ajvStrings.Items & TopLevel[Any] & Length[T]
  
  var minItems: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
  
  var `type`: JSONType[array, IsPartial]
}
object Items {
  
  inline def apply[IsPartial /* <: Boolean */, T](
    items: typings.ajv.ajvStrings.Items & TopLevel[Any] & Length[T],
    minItems: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any
  ): Items[IsPartial, T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items[IsPartial, T]]
  }
  
  extension [Self <: Items[?, ?], IsPartial /* <: Boolean */, T](x: Self & (Items[IsPartial, T])) {
    
    inline def setItems(value: typings.ajv.ajvStrings.Items & TopLevel[Any] & Length[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMinItems(value: /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSONType[array, IsPartial]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
