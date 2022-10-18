package typings.ajv

import typings.ajv.distCompileJtdTypesMod.JTDForm
import typings.ajv.distCompileRulesMod.JSONType
import typings.ajv.distTypesJtdSchemaMod.NumberType
import typings.ajv.distTypesJtdSchemaMod.StringType
import typings.ajv.distVocabulariesJtdPropertiesMod.PropKeyword
import typings.ajv.distVocabulariesJtdTypeMod.IntType
import typings.ajv.distVocabulariesJtdTypeMod.JTDType
import typings.ajv.distVocabulariesValidationLimitNumberMod.Comparison
import typings.ajv.distVocabulariesValidationLimitNumberMod.Kwd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ajvStrings {
  
  @js.native
  sealed trait $id extends StObject
  inline def $id: $id = "$id".asInstanceOf[$id]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with Comparison
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with Comparison
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait JSONSchemaType extends StObject
  inline def JSONSchemaType: JSONSchemaType = "JSONSchemaType".asInstanceOf[JSONSchemaType]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with Comparison
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with Comparison
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait PartialSchema extends StObject
  inline def PartialSchema: PartialSchema = "PartialSchema".asInstanceOf[PartialSchema]
  
  @js.native
  sealed trait PropertiesSchema extends StObject
  inline def PropertiesSchema: PropertiesSchema = "PropertiesSchema".asInstanceOf[PropertiesSchema]
  
  @js.native
  sealed trait RequiredMembers extends StObject
  inline def RequiredMembers: RequiredMembers = "RequiredMembers".asInstanceOf[RequiredMembers]
  
  @js.native
  sealed trait additionalItems extends StObject
  inline def additionalItems: additionalItems = "additionalItems".asInstanceOf[additionalItems]
  
  @js.native
  sealed trait additionalProperties extends StObject
  inline def additionalProperties: additionalProperties = "additionalProperties".asInstanceOf[additionalProperties]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait anyOf extends StObject
  inline def anyOf: anyOf = "anyOf".asInstanceOf[anyOf]
  
  @js.native
  sealed trait array
    extends StObject
       with JSONType
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait boolean
    extends StObject
       with JSONType
       with JTDType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait const extends StObject
  inline def const: const = "const".asInstanceOf[const]
  
  @js.native
  sealed trait contains extends StObject
  inline def contains: contains = "contains".asInstanceOf[contains]
  
  @js.native
  sealed trait date extends StObject
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait dependencies extends StObject
  inline def dependencies: dependencies = "dependencies".asInstanceOf[dependencies]
  
  @js.native
  sealed trait dependentRequired extends StObject
  inline def dependentRequired: dependentRequired = "dependentRequired".asInstanceOf[dependentRequired]
  
  @js.native
  sealed trait discriminator
    extends StObject
       with JTDForm
  inline def discriminator: discriminator = "discriminator".asInstanceOf[discriminator]
  
  @js.native
  sealed trait elements
    extends StObject
       with JTDForm
  inline def elements: elements = "elements".asInstanceOf[elements]
  
  @js.native
  sealed trait empty extends StObject
  inline def empty: empty = "empty".asInstanceOf[empty]
  
  @js.native
  sealed trait `enum`
    extends StObject
       with JTDForm
  inline def `enum`: `enum` = "enum".asInstanceOf[`enum`]
  
  @js.native
  sealed trait exclusiveMaximum
    extends StObject
       with Kwd
  inline def exclusiveMaximum: exclusiveMaximum = "exclusiveMaximum".asInstanceOf[exclusiveMaximum]
  
  @js.native
  sealed trait exclusiveMinimum
    extends StObject
       with Kwd
  inline def exclusiveMinimum: exclusiveMinimum = "exclusiveMinimum".asInstanceOf[exclusiveMinimum]
  
  @js.native
  sealed trait failing extends StObject
  inline def failing: failing = "failing".asInstanceOf[failing]
  
  @js.native
  sealed trait `false schema` extends StObject
  inline def `false schema`: `false schema` = ("false schema").asInstanceOf[`false schema`]
  
  @js.native
  sealed trait float32
    extends StObject
       with JTDType
       with NumberType
  inline def float32: float32 = "float32".asInstanceOf[float32]
  
  @js.native
  sealed trait float64
    extends StObject
       with JTDType
       with NumberType
  inline def float64: float64 = "float64".asInstanceOf[float64]
  
  @js.native
  sealed trait format extends StObject
  inline def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait full extends StObject
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait id extends StObject
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait `if` extends StObject
  inline def `if`: `if` = "if".asInstanceOf[`if`]
  
  @js.native
  sealed trait int16
    extends StObject
       with IntType
       with JTDType
       with NumberType
  inline def int16: int16 = "int16".asInstanceOf[int16]
  
  @js.native
  sealed trait int32
    extends StObject
       with IntType
       with JTDType
       with NumberType
  inline def int32: int32 = "int32".asInstanceOf[int32]
  
  @js.native
  sealed trait int8
    extends StObject
       with IntType
       with JTDType
       with NumberType
  inline def int8: int8 = "int8".asInstanceOf[int8]
  
  @js.native
  sealed trait integer
    extends StObject
       with JSONType
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait items extends StObject
  inline def items: items = "items".asInstanceOf[items]
  
  @js.native
  sealed trait log extends StObject
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait maxItems extends StObject
  inline def maxItems: maxItems = "maxItems".asInstanceOf[maxItems]
  
  @js.native
  sealed trait maxLength extends StObject
  inline def maxLength: maxLength = "maxLength".asInstanceOf[maxLength]
  
  @js.native
  sealed trait maxProperties extends StObject
  inline def maxProperties: maxProperties = "maxProperties".asInstanceOf[maxProperties]
  
  @js.native
  sealed trait maximum
    extends StObject
       with Kwd
  inline def maximum: maximum = "maximum".asInstanceOf[maximum]
  
  @js.native
  sealed trait minItems extends StObject
  inline def minItems: minItems = "minItems".asInstanceOf[minItems]
  
  @js.native
  sealed trait minLength extends StObject
  inline def minLength: minLength = "minLength".asInstanceOf[minLength]
  
  @js.native
  sealed trait minProperties extends StObject
  inline def minProperties: minProperties = "minProperties".asInstanceOf[minProperties]
  
  @js.native
  sealed trait minimum
    extends StObject
       with Kwd
  inline def minimum: minimum = "minimum".asInstanceOf[minimum]
  
  @js.native
  sealed trait multipleOf extends StObject
  inline def multipleOf: multipleOf = "multipleOf".asInstanceOf[multipleOf]
  
  @js.native
  sealed trait not extends StObject
  inline def not: not = "not".asInstanceOf[not]
  
  @js.native
  sealed trait `null`
    extends StObject
       with JSONType
  inline def `null`: `null` = "null".asInstanceOf[`null`]
  
  @js.native
  sealed trait number
    extends StObject
       with JSONType
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait `object`
    extends StObject
       with JSONType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait oneOf extends StObject
  inline def oneOf: oneOf = "oneOf".asInstanceOf[oneOf]
  
  @js.native
  sealed trait optionalProperties
    extends StObject
       with JTDForm
       with PropKeyword
  inline def optionalProperties: optionalProperties = "optionalProperties".asInstanceOf[optionalProperties]
  
  @js.native
  sealed trait pattern extends StObject
  inline def pattern: pattern = "pattern".asInstanceOf[pattern]
  
  @js.native
  sealed trait properties
    extends StObject
       with JTDForm
       with PropKeyword
  inline def properties: properties = "properties".asInstanceOf[properties]
  
  @js.native
  sealed trait propertyNames extends StObject
  inline def propertyNames: propertyNames = "propertyNames".asInstanceOf[propertyNames]
  
  @js.native
  sealed trait ref
    extends StObject
       with JTDForm
  inline def ref: ref = "ref".asInstanceOf[ref]
  
  @js.native
  sealed trait required extends StObject
  inline def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait string
    extends StObject
       with JSONType
       with JTDType
       with StringType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait timestamp
    extends StObject
       with JTDType
       with StringType
  inline def timestamp: timestamp = "timestamp".asInstanceOf[timestamp]
  
  @js.native
  sealed trait `type`
    extends StObject
       with JTDForm
  inline def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait uint16
    extends StObject
       with IntType
       with JTDType
       with NumberType
  inline def uint16: uint16 = "uint16".asInstanceOf[uint16]
  
  @js.native
  sealed trait uint32
    extends StObject
       with IntType
       with JTDType
       with NumberType
  inline def uint32: uint32 = "uint32".asInstanceOf[uint32]
  
  @js.native
  sealed trait uint8
    extends StObject
       with IntType
       with JTDType
       with NumberType
  inline def uint8: uint8 = "uint8".asInstanceOf[uint8]
  
  @js.native
  sealed trait unevaluatedItems extends StObject
  inline def unevaluatedItems: unevaluatedItems = "unevaluatedItems".asInstanceOf[unevaluatedItems]
  
  @js.native
  sealed trait unevaluatedProperties extends StObject
  inline def unevaluatedProperties: unevaluatedProperties = "unevaluatedProperties".asInstanceOf[unevaluatedProperties]
  
  @js.native
  sealed trait uniqueItems extends StObject
  inline def uniqueItems: uniqueItems = "uniqueItems".asInstanceOf[uniqueItems]
  
  @js.native
  sealed trait values
    extends StObject
       with JTDForm
  inline def values: values = "values".asInstanceOf[values]
}
