package typings.ajv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvBooleans.`true`
import typings.ajv.anon.AdditionalItems
import typings.ajv.anon.AdditionalProperties
import typings.ajv.anon.AllOf
import typings.ajv.anon.AnyOf
import typings.ajv.anon.Contains
import typings.ajv.anon.Dictkeyword
import typings.ajv.anon.Items
import typings.ajv.anon.MaxItems
import typings.ajv.anon.OneOf
import typings.ajv.anon.Required
import typings.ajv.anon.RequiredReadonly
import typings.ajv.anon.TypeArray
import typings.ajv.anon.TypeJSONType
import typings.ajv.anon.`0`
import typings.ajv.anon.`1`
import typings.ajv.anon.`3`
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonSchemaMod {
  
  type JSONSchemaType[T] = StrictNullChecksWrapper[typings.ajv.ajvStrings.JSONSchemaType, UncheckedJSONSchemaType[T, `false`]]
  
  type JSONType[T /* <: String */, IsPartial /* <: Boolean */] = js.UndefOr[T]
  
  type Known = StringDictionary[Any] | Array[Any] | js.Array[Any] | Double | String | Boolean | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.anon.Default[T]
    - typings.ajv.anon.Const[T]
  */
  trait Nullable[T] extends StObject
  object Nullable {
    
    inline def Const[T](): typings.ajv.anon.Const[T] = {
      val __obj = js.Dynamic.literal(nullable = true)
      __obj.asInstanceOf[typings.ajv.anon.Const[T]]
    }
    
    inline def Default[T](): typings.ajv.anon.Default[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ajv.anon.Default[T]]
    }
  }
  
  trait NumberKeywords extends StObject {
    
    var exclusiveMaximum: js.UndefOr[Double] = js.undefined
    
    var exclusiveMinimum: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var maximum: js.UndefOr[Double] = js.undefined
    
    var minimum: js.UndefOr[Double] = js.undefined
    
    var multipleOf: js.UndefOr[Double] = js.undefined
  }
  object NumberKeywords {
    
    inline def apply(): NumberKeywords = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberKeywords]
    }
    
    extension [Self <: NumberKeywords](x: Self) {
      
      inline def setExclusiveMaximum(value: Double): Self = StObject.set(x, "exclusiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMaximumUndefined: Self = StObject.set(x, "exclusiveMaximum", js.undefined)
      
      inline def setExclusiveMinimum(value: Double): Self = StObject.set(x, "exclusiveMinimum", value.asInstanceOf[js.Any])
      
      inline def setExclusiveMinimumUndefined: Self = StObject.set(x, "exclusiveMinimum", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setMultipleOf(value: Double): Self = StObject.set(x, "multipleOf", value.asInstanceOf[js.Any])
      
      inline def setMultipleOfUndefined: Self = StObject.set(x, "multipleOf", js.undefined)
    }
  }
  
  type PartialSchema[T] = StrictNullChecksWrapper[typings.ajv.ajvStrings.PartialSchema, UncheckedPartialSchema[T]]
  
  type PropertiesSchema[T] = StrictNullChecksWrapper[typings.ajv.ajvStrings.PropertiesSchema, UncheckedPropertiesSchema[T]]
  
  type RequiredMembers[T] = StrictNullChecksWrapper[typings.ajv.ajvStrings.RequiredMembers, UncheckedRequiredMembers[T]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped ajv.anon.AnyOf<ajv.ajv/dist/types/json-schema.Known, true> & ajv.anon.Dictkeyword | ajv.anon.OneOf<ajv.ajv/dist/types/json-schema.Known, true> & ajv.anon.Dictkeyword | ajv.anon.TypeArray<ajv.ajv/dist/types/json-schema.Known, true> & ajv.ajv/dist/types/json-schema.UnionToIntersection<ajv.ajv/dist/types/json-schema.Known extends number ? ajv.ajv/dist/types/json-schema.NumberKeywords : ajv.ajv/dist/types/json-schema.Known extends string ? ajv.ajv/dist/types/json-schema.StringKeywords : ajv.ajv/dist/types/json-schema.Known extends boolean ? {} : never> & ajv.anon.Dictkeyword | ajv.ajv/dist/types/json-schema.Known extends number ? ajv.anon.TypeJSONType<true> & ajv.ajv/dist/types/json-schema.NumberKeywords : ajv.ajv/dist/types/json-schema.Known extends string ? ajv.anon.0<true> & ajv.ajv/dist/types/json-schema.StringKeywords : ajv.ajv/dist/types/json-schema.Known extends boolean ? ajv.anon.1<true> : ajv.ajv/dist/types/json-schema.Known extends [any, ...std.Array<any>] ? ajv.anon.MaxItems<ajv.ajv/dist/types/json-schema.Known> & ajv.anon.Items<true, ajv.ajv/dist/types/json-schema.Known> | ajv.anon.AdditionalItems & ajv.anon.Items<true, ajv.ajv/dist/types/json-schema.Known> : ajv.ajv/dist/types/json-schema.Known extends std.Array<any> ? ajv.anon.Contains<true, ajv.ajv/dist/types/json-schema.Known> : ajv.ajv/dist/types/json-schema.Known extends std.Record<string, any> ? ajv.anon.AdditionalProperties<true, ajv.ajv/dist/types/json-schema.Known> & true extends true ? ajv.anon.Required<ajv.ajv/dist/types/json-schema.Known> : [ajv.ajv/dist/types/json-schema.UncheckedRequiredMembers<ajv.ajv/dist/types/json-schema.Known>] extends [never] ? ajv.anon.3<ajv.ajv/dist/types/json-schema.Known> : ajv.anon.RequiredReadonly<ajv.ajv/dist/types/json-schema.Known> : ajv.ajv/dist/types/json-schema.Known extends null ? ajv.anon.Nullable<true> : never & ajv.anon.AllOf<ajv.ajv/dist/types/json-schema.Known> & ajv.anon.Dictkeyword */ trait SomeJSONSchema extends StObject
  
  type StrictNullChecksWrapper[Name /* <: String */, Type] = Type | (/* template literal string: strictNullChecks must be true in tsconfig to use ${Name} */ String)
  
  trait StringKeywords extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
  }
  object StringKeywords {
    
    inline def apply(): StringKeywords = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringKeywords]
    }
    
    extension [Self <: StringKeywords](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
  
  type UncheckedJSONSchemaType[T, IsPartial /* <: Boolean */] = ((AnyOf[T, IsPartial]) & Dictkeyword) | ((OneOf[T, IsPartial]) & Dictkeyword) | ((TypeArray[T, IsPartial]) & (UnionToIntersection[js.Object | StringKeywords | NumberKeywords]) & Dictkeyword) | ((typings.ajv.anon.Nullable[IsPartial] | ((AdditionalProperties[IsPartial, T]) & (RequiredReadonly[T] | `3`[T] | Required[T])) | (Contains[IsPartial, T]) | (MaxItems[T] & (Items[IsPartial, T])) | (AdditionalItems & (Items[IsPartial, T])) | `1`[IsPartial] | (`0`[IsPartial] & StringKeywords) | (TypeJSONType[IsPartial] & NumberKeywords)) & AllOf[T] & Dictkeyword)
  
  type UncheckedPartialSchema[T] = Partial[UncheckedJSONSchemaType[T, `true`]]
  
  type UncheckedPropertiesSchema[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: -? ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<T[K], false> & ajv.ajv/dist/types/json-schema.Nullable<T[K]> | {  $ref :string}}
    */ typings.ajv.ajvStrings.UncheckedPropertiesSchema & TopLevel[Any]
  
  type UncheckedRequiredMembers[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? never : K}[keyof T] */ js.Any
  
  type UnionToIntersection[U] = Any
}
