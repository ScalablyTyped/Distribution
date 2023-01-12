package typings.ajv

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvBooleans.`true`
import typings.ajv.anon.AllOf
import typings.ajv.anon.AnyOf
import typings.ajv.anon.Dictkeyword
import typings.ajv.anon.OneOf
import typings.ajv.anon.TypeArray
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJsonSchemaMod {
  
  type JSONSchemaType[T] = StrictNullChecksWrapper[typings.ajv.ajvStrings.JSONSchemaType, UncheckedJSONSchemaType[T, `false`]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    IsPartial extends true ? T | undefined : T
    }}}
    */
  type JSONType[T /* <: String */, IsPartial /* <: Boolean */] = T
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Known = {[key: string] : ajv.ajv/dist/types/json-schema.Known} | [ajv.ajv/dist/types/json-schema.Known, ...std.Array<ajv.ajv/dist/types/json-schema.Known>] | std.Array<ajv.ajv/dist/types/json-schema.Known> | number | string | boolean | null
  }}}
  to avoid circular code involving: 
  - ajv.ajv/dist/types/json-schema.Known
  */
  type Known = StringDictionary[Any] | Array[Any] | js.Array[Any] | Double | String | Boolean | Null
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    undefined extends T ? {  nullable :true,   const :null | undefined,   enum :std.Readonly<std.Array<T | null>> | undefined,   default :T | null | undefined} : {  nullable :false | undefined,   const :T | undefined,   enum :std.Readonly<std.Array<T>> | undefined,   default :T | undefined}
    }}}
    */
  @js.native
  trait Nullable[T] extends StObject
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberKeywords] (val x: Self) extends AnyVal {
      
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
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SomeJSONSchema = ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<ajv.ajv/dist/types/json-schema.Known, true>
  }}}
  to avoid circular code involving: 
  - ajv.ajv/dist/types/json-schema.Known
  - ajv.ajv/dist/types/json-schema.SomeJSONSchema
  */
  type SomeJSONSchema = UncheckedJSONSchemaType[Any, `true`]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    undefined extends null ? / * template literal string: strictNullChecks must be true in tsconfig to use ${Name} * / string : Type
    }}}
    */
  type StrictNullChecksWrapper[Name /* <: String */, Type] = Type
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringKeywords] (val x: Self) extends AnyVal {
      
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
  
  type UncheckedJSONSchemaType[T, IsPartial /* <: Boolean */] = ((AnyOf[T, IsPartial]) & Dictkeyword) | ((OneOf[T, IsPartial]) & Dictkeyword) | ((TypeArray[T, IsPartial]) & (UnionToIntersection[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends number ? ajv.ajv/dist/types/json-schema.NumberKeywords : T extends string ? ajv.ajv/dist/types/json-schema.StringKeywords : T extends boolean ? {} : never */ js.Any
  ]) & Dictkeyword) | ((/* import warning: importer.ImportType#apply Failed type conversion: T extends number ? {  type :ajv.ajv/dist/types/json-schema.JSONType<'number' | 'integer', IsPartial>} & ajv.ajv/dist/types/json-schema.NumberKeywords : T extends string ? {  type :ajv.ajv/dist/types/json-schema.JSONType<'string', IsPartial>} & ajv.ajv/dist/types/json-schema.StringKeywords : T extends boolean ? {  type :ajv.ajv/dist/types/json-schema.JSONType<'boolean', IsPartial>} : T extends [any, ...std.Array<any>] ? {  maxItems :T['length']} & {  type :ajv.ajv/dist/types/json-schema.JSONType<'array', IsPartial>,   items :{readonly [ K in keyof T ]: -? ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<T[K], false> & ajv.ajv/dist/types/json-schema.Nullable<T[K]>} & {  length :T['length']},   minItems :T['length']} | {  additionalItems :false} & {  type :ajv.ajv/dist/types/json-schema.JSONType<'array', IsPartial>,   items :{readonly [ K in keyof T ]: -? ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<T[K], false> & ajv.ajv/dist/types/json-schema.Nullable<T[K]>} & {  length :T['length']},   minItems :T['length']} : T extends std.Array<any> ? {  type :ajv.ajv/dist/types/json-schema.JSONType<'array', IsPartial>,   items :ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<T[0], false>,   contains :ajv.ajv/dist/types/json-schema.UncheckedPartialSchema<T[0]> | undefined,   minItems :number | undefined,   maxItems :number | undefined,   minContains :number | undefined,   maxContains :number | undefined,   uniqueItems :true | undefined,   additionalItems :never | undefined} : T extends std.Record<string, any> ? {  type :ajv.ajv/dist/types/json-schema.JSONType<'object', IsPartial>,   additionalProperties :boolean | ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<T[string], false> | undefined,   unevaluatedProperties :boolean | ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<T[string], false> | undefined,   properties :IsPartial extends true ? std.Partial<ajv.ajv/dist/types/json-schema.UncheckedPropertiesSchema<T>> : ajv.ajv/dist/types/json-schema.UncheckedPropertiesSchema<T> | undefined,   patternProperties :std.Record<string, ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<T[string], false>> | undefined,   propertyNames :std.Omit<ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<string, false>, 'type'> & {  type :'string' | undefined} | undefined,   dependencies :{[ K in keyof T ]:? std.Readonly<std.Array<keyof T>> | ajv.ajv/dist/types/json-schema.UncheckedPartialSchema<T>} | undefined,   dependentRequired :{[ K in keyof T ]:? std.Readonly<std.Array<keyof T>>} | undefined,   dependentSchemas :{[ K in keyof T ]:? ajv.ajv/dist/types/json-schema.UncheckedPartialSchema<T>} | undefined,   minProperties :number | undefined,   maxProperties :number | undefined} & IsPartial extends true ? {  required :std.Readonly<std.Array<keyof T>>} : [ajv.ajv/dist/types/json-schema.UncheckedRequiredMembers<T>] extends [never] ? {  required :std.Readonly<std.Array<ajv.ajv/dist/types/json-schema.UncheckedRequiredMembers<T>>> | undefined} : {  required :std.Readonly<std.Array<ajv.ajv/dist/types/json-schema.UncheckedRequiredMembers<T>>>} : T extends null ? {  type :ajv.ajv/dist/types/json-schema.JSONType<'null', IsPartial>,   nullable :true} : never */ js.Any) & AllOf[T] & Dictkeyword)
  
  type UncheckedPartialSchema[T] = Partial[UncheckedJSONSchemaType[T, `true`]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: -? ajv.ajv/dist/types/json-schema.UncheckedJSONSchemaType<T[K], false> & ajv.ajv/dist/types/json-schema.Nullable<T[K]> | {  $ref :string}}
    }}}
    */
  @js.native
  trait UncheckedPropertiesSchema[T] extends StObject
  
  type UncheckedRequiredMembers[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? never : K}[keyof T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends any ? (_ : U): void : never extends (_ : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
}
