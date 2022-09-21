package typings.ajv

import org.scalablytyped.runtime.TopLevel
import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvStrings.boolean
import typings.ajv.anon.Definitions
import typings.ajv.anon.ElementsJTDSchemaType
import typings.ajv.anon.EnumArray
import typings.ajv.anon.TypeNumberType
import typings.ajv.anon.TypeStringType
import typings.ajv.anon.ValuesJTDSchemaType
import typings.ajv.anon.`10`
import typings.ajv.anon.`11`
import typings.ajv.anon.`12`
import typings.ajv.anon.`13`
import typings.ajv.anon.`14`
import typings.ajv.anon.`4`
import typings.ajv.anon.`6`
import typings.ajv.anon.`7`
import typings.ajv.anon.`8`
import typings.ajv.anon.`9`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesJtdSchemaMod {
  
  /** gets only the string literals of a type or null if a type isn't a string literal */
  type EnumString[T] = Null | T
  
  /** true only if all types are array types (not tuples) */
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvBooleans.`false`
    - typings.ajv.ajvBooleans.`true`
  */
  trait IsElements[T] extends StObject
  
  /** true if type is a union of string literals */
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvBooleans.`true`
    - typings.ajv.ajvBooleans.`false`
  */
  trait IsEnum[T] extends StObject
  
  /** true if type is a proeprties type and Union is false, or type is a discriminator type and Union is true */
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvBooleans.`false`
    - typings.ajv.ajvBooleans.`true`
  */
  trait IsRecord[T, Union /* <: Boolean */] extends StObject
  
  type IsUnion[T] = IsUnion_[T, T]
  
  /** type is true if T is a union type */
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvBooleans.`true`
    - typings.ajv.ajvBooleans.`false`
  */
  trait IsUnion_[T, U /* <: T */] extends StObject
  
  /** true if the the type is a values type */
  type IsValues[T] = `false` | (TypeEquality[/* keyof std.Exclude<T, null> */ String, String])
  
  type JTDDataDef[S, D /* <: Record[String, Any] */] = Any | (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof S['mapping'] ]: any & {[ KM in any ]: K}}[keyof S['mapping']] */ js.Any) | (Record[String, Any]) | (typings.ajv.ajvStrings.JTDDataDef & TopLevel[Any] & (Any | (Record[String, Any]))) | js.Array[Any] | String | js.Date | Boolean | Double | Null
  
  type JTDDataType[S] = Any
  
  type JTDSchemaType[T, D /* <: Record[String, Any] */] = ((((/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof D ]: [T] extends [D[K]]? {  ref :K} : never}[keyof D] */ js.Any) & `8`) | ((/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof D ]: [std.Exclude<T, null>] extends [std.Exclude<D[K], null>]? {  ref :K} : never}[keyof D] */ js.Any) & `7`)) & Definitions[D]) | (`9` & Definitions[D]) | (((/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof std.Exclude<T, null> ]: -? std.Exclude<T, null>[K] extends string? {  discriminator :K,   mapping :{[ M in std.Exclude<T, null>[K] ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<std.Omit<T extends {[ C in K ]: M}? T : never, K>, D>}} : never}[keyof std.Exclude<T, null>] */ js.Any) | (((`11`[T, D]) | `10`) & ((`13`[T, D]) | `12`) & `14`) | ValuesJTDSchemaType[D] | ElementsJTDSchemaType[D] | EnumArray[T] | `6` | TypeStringType | `4` | TypeNumberType) & (`8` | `7`) & Definitions[D])
  
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
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvBooleans.`false`
    - typings.ajv.ajvBooleans.`true`
  */
  trait TypeEquality[T, E] extends StObject
}
