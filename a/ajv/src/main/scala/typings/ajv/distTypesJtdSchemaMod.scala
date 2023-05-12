package typings.ajv

import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvBooleans.`true`
import typings.ajv.ajvStrings.boolean
import typings.ajv.anon.Definitions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJtdSchemaMod {
  
  /** gets only the string literals of a type or null if a type isn't a string literal */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [never] ? null : T extends string ? string extends T ? null : T : null
    }}}
    */
  type EnumString[T] = T
  
  /** true only if all types are array types (not tuples) */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    false extends ajv.ajv/dist/types/jtd-schema.IsUnion<T> ? [T] extends [std.Array<unknown>] ? undefined extends T[0.5] ? false : true : false : false
    }}}
    */
  type IsElements[T] = `false`
  
  /** true if type represents an empty record */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [std.Record<string, never>] ? [T] extends [never] ? false : true : false
    }}}
    */
  type IsEmptyRecord[T] = `false`
  
  /** true if type is a union of string literals */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    null extends ajv.ajv/dist/types/jtd-schema.EnumString<T> ? false : true
    }}}
    */
  type IsEnum[T] = `false`
  
  /** true if type is a properties type and Union is false, or type is a discriminator type and Union is true */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Union extends ajv.ajv/dist/types/jtd-schema.IsUnion<T> ? null extends ajv.ajv/dist/types/jtd-schema.EnumString<keyof T> ? false : true : false
    }}}
    */
  type IsRecord[T, Union /* <: Boolean */] = `false`
  
  type IsUnion[T] = IsUnion_[T, T]
  
  /** type is true if T is a union type */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    false extends T extends unknown ? [U] extends [T] ? false : true : never ? false : true
    }}}
    */
  type IsUnion_[T, U /* <: T */] = `false`
  
  /** true if the the type is a values type */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    false extends ajv.ajv/dist/types/jtd-schema.IsUnion<T> ? ajv.ajv/dist/types/jtd-schema.TypeEquality<keyof T, string> : false
    }}}
    */
  type IsValues[T] = `true`
  
  type JTDDataDef[S, D /* <: Record[String, Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: S extends {  ref :string} ? D extends {[ K in S['ref'] ]: infer V} ? ajv.ajv/dist/types/jtd-schema.JTDDataDef<V, D> : never : S extends {  type :ajv.ajv/dist/types/jtd-schema.NumberType} ? number : S extends {  type :'boolean'} ? boolean : S extends {  type :'string'} ? string : S extends {  type :'timestamp'} ? string | std.Date : S extends {  enum :std.Array<infer E>} ? string extends E ? never : [E] extends [string] ? E : never : S extends {  elements :infer E} ? std.Array<ajv.ajv/dist/types/jtd-schema.JTDDataDef<E, D>> : S extends {  properties :std.Record<string, unknown>,   optionalProperties :std.Record<string, unknown> | undefined,   additionalProperties :boolean | undefined} ? {-readonly [ K in keyof S['properties'] ]: -? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['properties'][K], D>} & {-readonly [ K in keyof S['optionalProperties'] ]:? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['optionalProperties'][K], D>} & [S['additionalProperties']] extends [true] ? std.Record<string, unknown> : unknown : S extends {  properties :std.Record<string, unknown> | undefined,   optionalProperties :std.Record<string, unknown>,   additionalProperties :boolean | undefined} ? {-readonly [ K in keyof S['properties'] ]: -? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['properties'][K], D>} & {-readonly [ K in keyof S['optionalProperties'] ]:? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['optionalProperties'][K], D>} & [S['additionalProperties']] extends [true] ? std.Record<string, unknown> : unknown : S extends {  values :infer V} ? std.Record<string, ajv.ajv/dist/types/jtd-schema.JTDDataDef<V, D>> : S extends {  discriminator :infer M,   mapping :std.Record<string, unknown>} ? [M] extends [string] ? {[ K in keyof S['mapping'] ]: ajv.ajv/dist/types/jtd-schema.JTDDataDef<S['mapping'][K], D> & {[ KM in M ]: K}}[keyof S['mapping']] : never : unknown */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    S extends {  definitions :std.Record<string, unknown>} ? ajv.ajv/dist/types/jtd-schema.JTDDataDef<S, S['definitions']> : ajv.ajv/dist/types/jtd-schema.JTDDataDef<S, std.Record<string, never>>
    }}}
    */
  type JTDDataType[S] = JTDDataDef[
    S, 
    /* import warning: importer.ImportType#apply Failed type conversion: S['definitions'] */ js.Any
  ]
  
  type JTDSchemaType[T, D /* <: Record[String, Any] */] = (/* import warning: importer.ImportType#apply Failed type conversion: null extends ajv.ajv/dist/types/jtd-schema.EnumString<keyof D> ? never : {[ K in keyof D ]: [T] extends [D[K]]? {  ref :K} : never}[keyof D] & {  nullable :false | undefined} | null extends T ? {[ K in keyof D ]: [std.Exclude<T, null>] extends [std.Exclude<D[K], null>]? {  ref :K} : never}[keyof D] & {  nullable :true} : never */ js.Any) & Definitions[D]
  
  /** type is true if T or null is identically E or null*/
  type NullTypeEquality[T, E] = TypeEquality[T | Null, E | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvStrings.float32
    - typings.ajv.ajvStrings.float64
    - typings.ajv.ajvStrings.int8
    - typings.ajv.ajvStrings.uint8
    - typings.ajv.ajvStrings.int16
    - typings.ajv.ajvStrings.uint16
    - typings.ajv.ajvStrings.int32
    - typings.ajv.ajvStrings.uint32
  */
  trait NumberType extends StObject
  object NumberType {
    
    inline def float32: typings.ajv.ajvStrings.float32 = "float32".asInstanceOf[typings.ajv.ajvStrings.float32]
    
    inline def float64: typings.ajv.ajvStrings.float64 = "float64".asInstanceOf[typings.ajv.ajvStrings.float64]
    
    inline def int16: typings.ajv.ajvStrings.int16 = "int16".asInstanceOf[typings.ajv.ajvStrings.int16]
    
    inline def int32: typings.ajv.ajvStrings.int32 = "int32".asInstanceOf[typings.ajv.ajvStrings.int32]
    
    inline def int8: typings.ajv.ajvStrings.int8 = "int8".asInstanceOf[typings.ajv.ajvStrings.int8]
    
    inline def uint16: typings.ajv.ajvStrings.uint16 = "uint16".asInstanceOf[typings.ajv.ajvStrings.uint16]
    
    inline def uint32: typings.ajv.ajvStrings.uint32 = "uint32".asInstanceOf[typings.ajv.ajvStrings.uint32]
    
    inline def uint8: typings.ajv.ajvStrings.uint8 = "uint8".asInstanceOf[typings.ajv.ajvStrings.uint8]
  }
  
  /** optional or undifined-able keys of an object */
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  
  /** required keys of an object, not undefined */
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? never : K}[keyof T] */ js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.anon.refstringnullablebooleanu
    - typings.ajv.anon.typeNumberTypeStringTypeb
    - typings.ajv.anon.enumArraystringnullablebo
    - typings.ajv.anon.elementsSomeJTDSchemaType
    - typings.ajv.anon.valuesSomeJTDSchemaTypenu
    - typings.ajv.anon.propertiesRecordstringSom
    - typings.ajv.anon.propertiesRecordstringSomAdditionalProperties
    - typings.ajv.anon.discriminatorstringmappin
    - typings.ajv.anon.nullablebooleanundefinedm
  */
  trait SomeJTDSchemaType extends StObject
  object SomeJTDSchemaType {
    
    inline def discriminatorstringmappin(discriminator: String, mapping: Record[String, SomeJTDSchemaType]): typings.ajv.anon.discriminatorstringmappin = {
      val __obj = js.Dynamic.literal(discriminator = discriminator.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.anon.discriminatorstringmappin]
    }
    
    inline def elementsSomeJTDSchemaType(elements: SomeJTDSchemaType): typings.ajv.anon.elementsSomeJTDSchemaType = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.anon.elementsSomeJTDSchemaType]
    }
    
    inline def enumArraystringnullablebo(`enum`: js.Array[String]): typings.ajv.anon.enumArraystringnullablebo = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.anon.enumArraystringnullablebo]
    }
    
    inline def nullablebooleanundefinedm(): typings.ajv.anon.nullablebooleanundefinedm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ajv.anon.nullablebooleanundefinedm]
    }
    
    inline def propertiesRecordstringSom(properties: Record[String, SomeJTDSchemaType]): typings.ajv.anon.propertiesRecordstringSom = {
      val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.anon.propertiesRecordstringSom]
    }
    
    inline def propertiesRecordstringSomAdditionalProperties(optionalProperties: Record[String, SomeJTDSchemaType]): typings.ajv.anon.propertiesRecordstringSomAdditionalProperties = {
      val __obj = js.Dynamic.literal(optionalProperties = optionalProperties.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.anon.propertiesRecordstringSomAdditionalProperties]
    }
    
    inline def refstringnullablebooleanu(ref: String): typings.ajv.anon.refstringnullablebooleanu = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.anon.refstringnullablebooleanu]
    }
    
    inline def typeNumberTypeStringTypeb(`type`: NumberType | StringType | boolean): typings.ajv.anon.typeNumberTypeStringTypeb = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.anon.typeNumberTypeStringTypeb]
    }
    
    inline def valuesSomeJTDSchemaTypenu(values: SomeJTDSchemaType): typings.ajv.anon.valuesSomeJTDSchemaTypenu = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ajv.anon.valuesSomeJTDSchemaTypenu]
    }
  }
  
  /** string strings */
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvStrings.string
    - typings.ajv.ajvStrings.timestamp
  */
  trait StringType extends StObject
  object StringType {
    
    inline def string: typings.ajv.ajvStrings.string = "string".asInstanceOf[typings.ajv.ajvStrings.string]
    
    inline def timestamp: typings.ajv.ajvStrings.timestamp = "timestamp".asInstanceOf[typings.ajv.ajvStrings.timestamp]
  }
  
  /** type is true if T is identically E */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [E] ? [E] extends [T] ? true : false : false
    }}}
    */
  type TypeEquality[T, E] = `true`
}
