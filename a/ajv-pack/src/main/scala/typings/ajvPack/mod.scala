package typings.ajvPack

import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.KeywordDefinition
import typings.ajv.distTypesMod.ValidateFunction
import typings.ajv.mod.Ajv
import typings.ajvPack.ajvPackStrings.log
import typings.ajvPack.anon.FnCall
import typings.ajvPack.anon.FnCallKwdOrDefDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(ajv: Ajv, validate: ValidateFunction[Any]): String = (^.asInstanceOf[js.Dynamic].apply(ajv.asInstanceOf[js.Any], validate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ajv-pack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instance(ajv: Ajv): AjvPack = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(ajv.asInstanceOf[js.Any]).asInstanceOf[AjvPack]
  
  trait AjvPack extends StObject {
    
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(kwdOrDef: String): typings.ajv.coreMod.Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(kwdOrDef: String, `def`: KeywordDefinition): typings.ajv.coreMod.Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(kwdOrDef: KeywordDefinition): typings.ajv.coreMod.Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    def addKeyword(kwdOrDef: KeywordDefinition, `def`: KeywordDefinition): typings.ajv.coreMod.Ajv
    /**
      * add custom keyword to the instance
      * @return result from ajv instance
      */
    @JSName("addKeyword")
    var addKeyword_Original: FnCallKwdOrDefDef
    
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: js.Array[AnySchema]): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: js.Array[AnySchema], // If array is passed, `key` will be ignored
    key: String): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: AnySchema): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(schema: AnySchema, // If array is passed, `key` will be ignored
    key: String): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    var addSchema_Original: FnCall
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typings.ajv.coreMod.Ajv
    /**
      * add schema to the instance
      * @return result from ajv instance
      */
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): typings.ajv.coreMod.Ajv
    
    /**
      * compile the schema and require the module
      * @param  schema JSON-schema
      * @return validation function
      */
    def compile(schema: js.Object): ValidateFunction[Any]
    
    /**
      * validate data against the schema
      * @param schema JSON-schema
      * @param data data to validate
      * @return validation result
      */
    def validate(schema: js.Object, data: Any): Boolean
  }
  object AjvPack {
    
    inline def apply(
      addKeyword: FnCallKwdOrDefDef,
      addSchema: FnCall,
      compile: js.Object => ValidateFunction[Any],
      validate: (js.Object, Any) => Boolean
    ): AjvPack = {
      val __obj = js.Dynamic.literal(addKeyword = addKeyword.asInstanceOf[js.Any], addSchema = addSchema.asInstanceOf[js.Any], compile = js.Any.fromFunction1(compile), validate = js.Any.fromFunction2(validate))
      __obj.asInstanceOf[AjvPack]
    }
    
    extension [Self <: AjvPack](x: Self) {
      
      inline def setAddKeyword(value: FnCallKwdOrDefDef): Self = StObject.set(x, "addKeyword", value.asInstanceOf[js.Any])
      
      inline def setAddSchema(value: FnCall): Self = StObject.set(x, "addSchema", value.asInstanceOf[js.Any])
      
      inline def setCompile(value: js.Object => ValidateFunction[Any]): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
      
      inline def setValidate(value: (js.Object, Any) => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    }
  }
}
