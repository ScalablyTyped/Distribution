package typings.ajv.anon

import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvBooleans.`true`
import typings.ajv.ajvStrings.array
import typings.ajv.jsonSchemaMod.JSONType
import typings.ajv.jsonSchemaMod.UncheckedJSONSchemaType
import typings.ajv.jsonSchemaMod.UncheckedPartialSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contains[IsPartial /* <: Boolean */, T] extends StObject {
  
  var additionalItems: js.UndefOr[scala.Nothing] = js.undefined
  
  var contains: js.UndefOr[
    UncheckedPartialSchema[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
    ]
  ] = js.undefined
  
  var items: UncheckedJSONSchemaType[
    /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any, 
    `false`
  ]
  
  var maxContains: js.UndefOr[Double] = js.undefined
  
  var maxItems: js.UndefOr[Double] = js.undefined
  
  var minContains: js.UndefOr[Double] = js.undefined
  
  var minItems: js.UndefOr[Double] = js.undefined
  
  var `type`: JSONType[array, IsPartial]
  
  var uniqueItems: js.UndefOr[`true`] = js.undefined
}
object Contains {
  
  inline def apply[IsPartial /* <: Boolean */, T](
    items: UncheckedJSONSchemaType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any, 
      `false`
    ]
  ): Contains[IsPartial, T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains[IsPartial, T]]
  }
  
  extension [Self <: Contains[?, ?], IsPartial /* <: Boolean */, T](x: Self & (Contains[IsPartial, T])) {
    
    inline def setContains(
      value: UncheckedPartialSchema[
          /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any
        ]
    ): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setItems(
      value: UncheckedJSONSchemaType[
          /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any, 
          `false`
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setMaxContains(value: Double): Self = StObject.set(x, "maxContains", value.asInstanceOf[js.Any])
    
    inline def setMaxContainsUndefined: Self = StObject.set(x, "maxContains", js.undefined)
    
    inline def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMinContains(value: Double): Self = StObject.set(x, "minContains", value.asInstanceOf[js.Any])
    
    inline def setMinContainsUndefined: Self = StObject.set(x, "minContains", js.undefined)
    
    inline def setMinItems(value: Double): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
    
    inline def setMinItemsUndefined: Self = StObject.set(x, "minItems", js.undefined)
    
    inline def setType(value: JSONType[array, IsPartial]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniqueItems(value: `true`): Self = StObject.set(x, "uniqueItems", value.asInstanceOf[js.Any])
    
    inline def setUniqueItemsUndefined: Self = StObject.set(x, "uniqueItems", js.undefined)
  }
}
