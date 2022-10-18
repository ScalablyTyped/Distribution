package typings.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typings.ajv.distTypesMod.AnySchemaObject
import typings.ajv.distTypesMod.Format
import typings.angularDevkitCore.anon.Label
import typings.angularDevkitCore.srcJsonUtilsMod.JsonArray
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.mod.Observable_
import typings.std.Record
import typings.std.Set
import typings.std.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsonSchemaInterfaceMod {
  
  @js.native
  trait JsonPointer
    extends StObject
       with String {
    
    var __PRIVATE_DEVKIT_JSON_POINTER: Unit = js.native
  }
  
  @js.native
  trait JsonSchemaVisitor extends StObject {
    
    def apply(current: JsonArray, pointer: JsonPointer): Unit = js.native
    def apply(current: JsonArray, pointer: JsonPointer, parentSchema: Unit, index: java.lang.String): Unit = js.native
    def apply(current: JsonArray, pointer: JsonPointer, parentSchema: JsonArray): Unit = js.native
    def apply(current: JsonArray, pointer: JsonPointer, parentSchema: JsonArray, index: java.lang.String): Unit = js.native
    def apply(current: JsonArray, pointer: JsonPointer, parentSchema: JsonObject): Unit = js.native
    def apply(current: JsonArray, pointer: JsonPointer, parentSchema: JsonObject, index: java.lang.String): Unit = js.native
    def apply(current: JsonObject, pointer: JsonPointer): Unit = js.native
    def apply(current: JsonObject, pointer: JsonPointer, parentSchema: Unit, index: java.lang.String): Unit = js.native
    def apply(current: JsonObject, pointer: JsonPointer, parentSchema: JsonArray): Unit = js.native
    def apply(current: JsonObject, pointer: JsonPointer, parentSchema: JsonArray, index: java.lang.String): Unit = js.native
    def apply(current: JsonObject, pointer: JsonPointer, parentSchema: JsonObject): Unit = js.native
    def apply(current: JsonObject, pointer: JsonPointer, parentSchema: JsonObject, index: java.lang.String): Unit = js.native
  }
  
  @js.native
  trait JsonVisitor extends StObject {
    
    def apply(value: JsonValue, pointer: JsonPointer): Observable_[JsonValue] | JsonValue = js.native
    def apply(value: JsonValue, pointer: JsonPointer, schema: Unit, root: JsonArray): Observable_[JsonValue] | JsonValue = js.native
    def apply(value: JsonValue, pointer: JsonPointer, schema: Unit, root: JsonObject): Observable_[JsonValue] | JsonValue = js.native
    def apply(value: JsonValue, pointer: JsonPointer, schema: JsonObject): Observable_[JsonValue] | JsonValue = js.native
    def apply(value: JsonValue, pointer: JsonPointer, schema: JsonObject, root: JsonArray): Observable_[JsonValue] | JsonValue = js.native
    def apply(value: JsonValue, pointer: JsonPointer, schema: JsonObject, root: JsonObject): Observable_[JsonValue] | JsonValue = js.native
  }
  
  trait PromptDefinition extends StObject {
    
    var default: js.UndefOr[java.lang.String | js.Array[java.lang.String] | Double | Boolean | Null] = js.undefined
    
    var id: java.lang.String
    
    var items: js.UndefOr[js.Array[java.lang.String | Label]] = js.undefined
    
    var message: java.lang.String
    
    var multiselect: js.UndefOr[Boolean] = js.undefined
    
    var propertyTypes: Set[java.lang.String]
    
    var raw: js.UndefOr[java.lang.String | JsonObject] = js.undefined
    
    var `type`: java.lang.String
    
    var validator: js.UndefOr[
        js.Function1[
          /* value */ JsonValue, 
          Boolean | java.lang.String | (js.Promise[Boolean | java.lang.String])
        ]
      ] = js.undefined
  }
  object PromptDefinition {
    
    inline def apply(
      id: java.lang.String,
      message: java.lang.String,
      propertyTypes: Set[java.lang.String],
      `type`: java.lang.String
    ): PromptDefinition = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], propertyTypes = propertyTypes.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptDefinition]
    }
    
    extension [Self <: PromptDefinition](x: Self) {
      
      inline def setDefault(value: java.lang.String | js.Array[java.lang.String] | Double | Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultNull: Self = StObject.set(x, "default", null)
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: java.lang.String*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItems(value: js.Array[java.lang.String | Label]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (java.lang.String | Label)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
      
      inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
      
      inline def setPropertyTypes(value: Set[java.lang.String]): Self = StObject.set(x, "propertyTypes", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: java.lang.String | JsonObject): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValidator(
        value: /* value */ JsonValue => Boolean | java.lang.String | (js.Promise[Boolean | java.lang.String])
      ): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
      
      inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
    }
  }
  
  @js.native
  trait PromptProvider extends StObject {
    
    def apply(definitions: js.Array[PromptDefinition]): SubscribableOrPromise[StringDictionary[JsonValue]] = js.native
  }
  
  trait SchemaFormat extends StObject {
    
    var formatter: SchemaFormatter
    
    var name: java.lang.String
  }
  object SchemaFormat {
    
    inline def apply(formatter: SchemaFormatter, name: java.lang.String): SchemaFormat = {
      val __obj = js.Dynamic.literal(formatter = formatter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaFormat]
    }
    
    extension [Self <: SchemaFormat](x: Self) {
      
      inline def setFormatter(value: SchemaFormatter): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterFunction1(value: java.lang.String => Boolean): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type SchemaFormatter = Format
  
  @js.native
  trait SchemaKeywordValidator extends StObject {
    
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: Unit,
      parentProperty: java.lang.String,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: Unit,
      parentProperty: Double,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: Unit,
      parentProperty: Unit,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: JsonArray,
      parentProperty: java.lang.String,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: JsonArray,
      parentProperty: Double,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: JsonArray,
      parentProperty: Unit,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: JsonObject,
      parentProperty: java.lang.String,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: JsonObject,
      parentProperty: Double,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
    def apply(
      data: JsonValue,
      schema: JsonValue,
      parent: JsonObject,
      parentProperty: Unit,
      pointer: JsonPointer,
      rootData: JsonValue
    ): Boolean | Observable_[Boolean] = js.native
  }
  
  @js.native
  trait SchemaRegistry extends StObject {
    
    def addFormat(format: SchemaFormat): Unit = js.native
    
    /**
      * Add a transformation step after the validation of any Json. The JSON will not be validated
      * after the POST, so if transformations are not compatible with the Schema it will not result
      * in an error.
      * @param {JsonVisitor} visitor The visitor to transform every value.
      * @param {JsonVisitor[]} deps A list of other visitors to run before.
      */
    def addPostTransform(visitor: JsonVisitor): Unit = js.native
    def addPostTransform(visitor: JsonVisitor, deps: js.Array[JsonVisitor]): Unit = js.native
    
    /**
      * Add a transformation step before the validation of any Json.
      * @param {JsonVisitor} visitor The visitor to transform every value.
      * @param {JsonVisitor[]} deps A list of other visitors to run before.
      */
    def addPreTransform(visitor: JsonVisitor): Unit = js.native
    def addPreTransform(visitor: JsonVisitor, deps: js.Array[JsonVisitor]): Unit = js.native
    
    def addSmartDefaultProvider[T](source: java.lang.String, provider: SmartDefaultProvider[T]): Unit = js.native
    
    def compile(schema: js.Object): Observable_[SchemaValidator] = js.native
    
    def flatten(schema: java.lang.String): Observable_[JsonObject] = js.native
    /**
      * @deprecated since 11.2 without replacement.
      * Producing a flatten schema document does not in all cases produce a schema with identical behavior to the original.
      * See: https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.appendix.B.2
      */
    def flatten(schema: JsonObject): Observable_[JsonObject] = js.native
    
    def usePromptProvider(provider: PromptProvider): Unit = js.native
    
    def useXDeprecatedProvider(onUsage: js.Function1[/* message */ java.lang.String, Unit]): Unit = js.native
  }
  
  @js.native
  trait SchemaValidator extends StObject {
    
    def apply(data: JsonValue): Observable_[SchemaValidatorResult] = js.native
    def apply(data: JsonValue, options: SchemaValidatorOptions): Observable_[SchemaValidatorResult] = js.native
  }
  
  /* Inlined std.Partial<ajv.ajv.ErrorObject<string, std.Record<string, any>, unknown>> */
  trait SchemaValidatorError extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var instancePath: js.UndefOr[java.lang.String] = js.undefined
    
    var keyword: js.UndefOr[java.lang.String] = js.undefined
    
    var message: js.UndefOr[java.lang.String] = js.undefined
    
    var params: js.UndefOr[Record[java.lang.String, Any]] = js.undefined
    
    var parentSchema: js.UndefOr[AnySchemaObject] = js.undefined
    
    var propertyName: js.UndefOr[java.lang.String] = js.undefined
    
    var schema: js.UndefOr[Any] = js.undefined
    
    var schemaPath: js.UndefOr[java.lang.String] = js.undefined
  }
  object SchemaValidatorError {
    
    inline def apply(): SchemaValidatorError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaValidatorError]
    }
    
    extension [Self <: SchemaValidatorError](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setInstancePath(value: java.lang.String): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
      
      inline def setInstancePathUndefined: Self = StObject.set(x, "instancePath", js.undefined)
      
      inline def setKeyword(value: java.lang.String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
      
      inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setParams(value: Record[java.lang.String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParentSchema(value: AnySchemaObject): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
      
      inline def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
      
      inline def setPropertyName(value: java.lang.String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: java.lang.String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setSchemaPathUndefined: Self = StObject.set(x, "schemaPath", js.undefined)
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    }
  }
  
  trait SchemaValidatorOptions extends StObject {
    
    var applyPostTransforms: js.UndefOr[Boolean] = js.undefined
    
    var applyPreTransforms: js.UndefOr[Boolean] = js.undefined
    
    var withPrompts: js.UndefOr[Boolean] = js.undefined
  }
  object SchemaValidatorOptions {
    
    inline def apply(): SchemaValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaValidatorOptions]
    }
    
    extension [Self <: SchemaValidatorOptions](x: Self) {
      
      inline def setApplyPostTransforms(value: Boolean): Self = StObject.set(x, "applyPostTransforms", value.asInstanceOf[js.Any])
      
      inline def setApplyPostTransformsUndefined: Self = StObject.set(x, "applyPostTransforms", js.undefined)
      
      inline def setApplyPreTransforms(value: Boolean): Self = StObject.set(x, "applyPreTransforms", value.asInstanceOf[js.Any])
      
      inline def setApplyPreTransformsUndefined: Self = StObject.set(x, "applyPreTransforms", js.undefined)
      
      inline def setWithPrompts(value: Boolean): Self = StObject.set(x, "withPrompts", value.asInstanceOf[js.Any])
      
      inline def setWithPromptsUndefined: Self = StObject.set(x, "withPrompts", js.undefined)
    }
  }
  
  trait SchemaValidatorResult extends StObject {
    
    var data: JsonValue
    
    var errors: js.UndefOr[js.Array[SchemaValidatorError]] = js.undefined
    
    var success: Boolean
  }
  object SchemaValidatorResult {
    
    inline def apply(success: Boolean): SchemaValidatorResult = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[SchemaValidatorResult]
    }
    
    extension [Self <: SchemaValidatorResult](x: Self) {
      
      inline def setData(value: JsonValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setErrors(value: js.Array[SchemaValidatorError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: SchemaValidatorError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SmartDefaultProvider[T] extends StObject {
    
    def apply(schema: JsonObject): T | Observable_[T] = js.native
  }
}
