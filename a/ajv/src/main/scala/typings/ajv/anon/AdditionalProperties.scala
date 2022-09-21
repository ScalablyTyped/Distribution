package typings.ajv.anon

import org.scalablytyped.runtime.TopLevel
import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvStrings.`object`
import typings.ajv.ajvStrings.`type`
import typings.ajv.jsonSchemaMod.JSONType
import typings.ajv.jsonSchemaMod.UncheckedJSONSchemaType
import typings.ajv.jsonSchemaMod.UncheckedPropertiesSchema
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalProperties[IsPartial /* <: Boolean */, T] extends StObject {
  
  var additionalProperties: js.UndefOr[
    Boolean | (UncheckedJSONSchemaType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any, 
      `false`
    ])
  ] = js.undefined
  
  var dependencies: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Readonly<std.Array<keyof T>> | ajv.ajv/dist/types/json-schema.UncheckedPartialSchema<T>}
    */ typings.ajv.ajvStrings.AdditionalProperties & TopLevel[Any]
  ] = js.undefined
  
  var dependentRequired: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? std.Readonly<std.Array<keyof T>>}
    */ typings.ajv.ajvStrings.AdditionalProperties & TopLevel[Any]
  ] = js.undefined
  
  var dependentSchemas: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? ajv.ajv/dist/types/json-schema.UncheckedPartialSchema<T>}
    */ typings.ajv.ajvStrings.AdditionalProperties & TopLevel[Any]
  ] = js.undefined
  
  var maxProperties: js.UndefOr[Double] = js.undefined
  
  var minProperties: js.UndefOr[Double] = js.undefined
  
  var patternProperties: js.UndefOr[
    Record[
      String, 
      UncheckedJSONSchemaType[
        /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any, 
        `false`
      ]
    ]
  ] = js.undefined
  
  var properties: js.UndefOr[UncheckedPropertiesSchema[T] | Partial[UncheckedPropertiesSchema[T]]] = js.undefined
  
  var propertyNames: js.UndefOr[(Omit[UncheckedJSONSchemaType[String, `false`], `type`]) & `2`] = js.undefined
  
  var `type`: JSONType[`object`, IsPartial]
  
  var unevaluatedProperties: js.UndefOr[
    Boolean | (UncheckedJSONSchemaType[
      /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any, 
      `false`
    ])
  ] = js.undefined
}
object AdditionalProperties {
  
  inline def apply[IsPartial /* <: Boolean */, T](): AdditionalProperties[IsPartial, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalProperties[IsPartial, T]]
  }
  
  extension [Self <: AdditionalProperties[?, ?], IsPartial /* <: Boolean */, T](x: Self & (AdditionalProperties[IsPartial, T])) {
    
    inline def setAdditionalProperties(
      value: Boolean | (UncheckedJSONSchemaType[
          /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any, 
          `false`
        ])
    ): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setDependencies(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Readonly<std.Array<keyof T>> | ajv.ajv/dist/types/json-schema.UncheckedPartialSchema<T>}
      */ typings.ajv.ajvStrings.AdditionalProperties & TopLevel[Any]
    ): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependentRequired(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? std.Readonly<std.Array<keyof T>>}
      */ typings.ajv.ajvStrings.AdditionalProperties & TopLevel[Any]
    ): Self = StObject.set(x, "dependentRequired", value.asInstanceOf[js.Any])
    
    inline def setDependentRequiredUndefined: Self = StObject.set(x, "dependentRequired", js.undefined)
    
    inline def setDependentSchemas(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? ajv.ajv/dist/types/json-schema.UncheckedPartialSchema<T>}
      */ typings.ajv.ajvStrings.AdditionalProperties & TopLevel[Any]
    ): Self = StObject.set(x, "dependentSchemas", value.asInstanceOf[js.Any])
    
    inline def setDependentSchemasUndefined: Self = StObject.set(x, "dependentSchemas", js.undefined)
    
    inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    inline def setPatternProperties(
      value: Record[
          String, 
          UncheckedJSONSchemaType[
            /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any, 
            `false`
          ]
        ]
    ): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
    
    inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
    
    inline def setProperties(value: UncheckedPropertiesSchema[T] | Partial[UncheckedPropertiesSchema[T]]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertyNames(value: (Omit[UncheckedJSONSchemaType[String, `false`], `type`]) & `2`): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
    
    inline def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
    
    inline def setType(value: JSONType[`object`, IsPartial]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnevaluatedProperties(
      value: Boolean | (UncheckedJSONSchemaType[
          /* import warning: importer.ImportType#apply Failed type conversion: T[string] */ js.Any, 
          `false`
        ])
    ): Self = StObject.set(x, "unevaluatedProperties", value.asInstanceOf[js.Any])
    
    inline def setUnevaluatedPropertiesUndefined: Self = StObject.set(x, "unevaluatedProperties", js.undefined)
  }
}
