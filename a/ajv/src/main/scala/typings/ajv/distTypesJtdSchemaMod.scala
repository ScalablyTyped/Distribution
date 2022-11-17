package typings.ajv

import typings.ajv.anon.Definitions
import typings.ajv.anon.discriminatorstringmappin
import typings.ajv.anon.elementsSomeJTDSchemaType
import typings.ajv.anon.enumArraystringnullablebo
import typings.ajv.anon.nullablebooleanundefinedm
import typings.ajv.anon.propertiesRecordstringSom
import typings.ajv.anon.propertiesRecordstringSomAdditionalProperties
import typings.ajv.anon.refstringnullablebooleanu
import typings.ajv.anon.typeNumberTypeStringTypeb
import typings.ajv.anon.valuesSomeJTDSchemaTypenu
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
  type IsElements[T] = false
  
  /** true if type is a union of string literals */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    null extends ajv.ajv/dist/types/jtd-schema.EnumString<std.Exclude<T, null>> ? false : true
    }}}
    */
  type IsEnum[T] = false
  
  /** true if type is a proeprties type and Union is false, or type is a discriminator type and Union is true */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Union extends ajv.ajv/dist/types/jtd-schema.IsUnion<std.Exclude<T, null>> ? null extends ajv.ajv/dist/types/jtd-schema.EnumString<keyof std.Exclude<T, null>> ? false : true : false
    }}}
    */
  type IsRecord[T, Union /* <: Boolean */] = false
  
  type IsUnion[T] = IsUnion_[T, T]
  
  /** type is true if T is a union type */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    false extends T extends unknown ? [U] extends [T] ? false : true : never ? false : true
    }}}
    */
  type IsUnion_[T, U /* <: T */] = false
  
  /** true if the the type is a values type */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    false extends ajv.ajv/dist/types/jtd-schema.IsUnion<std.Exclude<T, null>> ? ajv.ajv/dist/types/jtd-schema.TypeEquality<keyof std.Exclude<T, null>, string> : false
    }}}
    */
  type IsValues[T] = true
  
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
  
  object NumberType {
    
    inline def float32: "float32" = "float32".asInstanceOf["float32"]
    
    inline def float64: "float64" = "float64".asInstanceOf["float64"]
    
    inline def int16: "int16" = "int16".asInstanceOf["int16"]
    
    inline def int32: "int32" = "int32".asInstanceOf["int32"]
    
    inline def int8: "int8" = "int8".asInstanceOf["int8"]
    
    inline def uint16: "uint16" = "uint16".asInstanceOf["uint16"]
    
    inline def uint32: "uint32" = "uint32".asInstanceOf["uint32"]
    
    inline def uint8: "uint8" = "uint8".asInstanceOf["uint8"]
  }
  type NumberType = "float32" | "float64" | "int8" | "uint8" | "int16" | "uint16" | "int32" | "uint32"
  
  /** optional or undifined-able keys of an object */
  type OptionalKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? K : never}[keyof T] */ js.Any
  
  /** required keys of an object, not undefined */
  type RequiredKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: -? undefined extends T[K]? never : K}[keyof T] */ js.Any
  
  type SomeJTDSchemaType = refstringnullablebooleanu | typeNumberTypeStringTypeb | enumArraystringnullablebo | elementsSomeJTDSchemaType | valuesSomeJTDSchemaTypenu | propertiesRecordstringSom | propertiesRecordstringSomAdditionalProperties | discriminatorstringmappin | nullablebooleanundefinedm
  
  object StringType {
    
    inline def string: "string" = "string".asInstanceOf["string"]
    
    inline def timestamp: "timestamp" = "timestamp".asInstanceOf["timestamp"]
  }
  /** string strings */
  type StringType = "string" | "timestamp"
  
  /** type is true if T is identically E */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [E] ? [E] extends [T] ? true : false : false
    }}}
    */
  type TypeEquality[T, E] = true
}
