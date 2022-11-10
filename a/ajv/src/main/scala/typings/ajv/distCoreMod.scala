package typings.ajv

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.ajv.ajvBooleans.`false`
import typings.ajv.ajvBooleans.`true`
import typings.ajv.ajvStrings.$id
import typings.ajv.ajvStrings.all
import typings.ajv.ajvStrings.array
import typings.ajv.ajvStrings.date
import typings.ajv.ajvStrings.empty
import typings.ajv.ajvStrings.failing
import typings.ajv.ajvStrings.id
import typings.ajv.ajvStrings.log
import typings.ajv.ajvStrings.string
import typings.ajv.anon.PartialErrorObjectstringR
import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenCodeMod.CodeArg
import typings.ajv.distCompileCodegenCodeMod._Code
import typings.ajv.distCompileCodegenMod.CodeGenOptions
import typings.ajv.distCompileCodegenScopeMod.ValueScope
import typings.ajv.distCompileMod.SchemaEnv
import typings.ajv.distCompileMod.SchemaObjCxt
import typings.ajv.distCompileRulesMod.ValidationRules
import typings.ajv.distTypesJsonSchemaMod.JSONSchemaType
import typings.ajv.distTypesJtdSchemaMod.JTDDataType
import typings.ajv.distTypesJtdSchemaMod.JTDSchemaType
import typings.ajv.distTypesJtdSchemaMod.SomeJTDSchemaType
import typings.ajv.distTypesMod.AddedKeywordDefinition
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.AnySchemaObject
import typings.ajv.distTypesMod.AnyValidateFunction
import typings.ajv.distTypesMod.AsyncSchema
import typings.ajv.distTypesMod.AsyncValidateFunction
import typings.ajv.distTypesMod.ErrorObject
import typings.ajv.distTypesMod.Format
import typings.ajv.distTypesMod.KeywordDefinition
import typings.ajv.distTypesMod.RegExpEngine
import typings.ajv.distTypesMod.RegExpLike
import typings.ajv.distTypesMod.Schema
import typings.ajv.distTypesMod.SchemaObject
import typings.ajv.distTypesMod.UriResolver
import typings.ajv.distTypesMod.ValidateFunction
import typings.ajv.distTypesMod.Vocabulary
import typings.std.NonNullable
import typings.std.Record
import typings.std.Set
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMod {
  
  @JSImport("ajv/dist/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/core", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Ajv {
    def this(opts: Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("ajv/dist/core", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/core", "default.MissingRefError")
    @js.native
    def MissingRefError: Instantiable4[
        /* resolver */ UriResolver, 
        /* baseId */ String, 
        /* ref */ String, 
        /* msg */ js.UndefOr[String], 
        typings.ajv.distCompileRefErrorMod.default
      ] = js.native
    inline def MissingRefError_=(
      x: Instantiable4[
          /* resolver */ UriResolver, 
          /* baseId */ String, 
          /* ref */ String, 
          /* msg */ js.UndefOr[String], 
          typings.ajv.distCompileRefErrorMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MissingRefError")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/core", "default.ValidationError")
    @js.native
    def ValidationError: Instantiable1[
        /* errors */ js.Array[PartialErrorObjectstringR], 
        typings.ajv.distRuntimeValidationErrorMod.default
      ] = js.native
    inline def ValidationError_=(
      x: Instantiable1[
          /* errors */ js.Array[PartialErrorObjectstringR], 
          typings.ajv.distRuntimeValidationErrorMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValidationError")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("ajv/dist/core", "CodeGen")
  @js.native
  open class CodeGen protected ()
    extends typings.ajv.distCompileCodegenMod.CodeGen {
    def this(extScope: ValueScope) = this()
    def this(extScope: ValueScope, opts: CodeGenOptions) = this()
  }
  
  @JSImport("ajv/dist/core", "KeywordCxt")
  @js.native
  open class KeywordCxt protected ()
    extends typings.ajv.distCompileValidateMod.KeywordCxt {
    def this(it: SchemaObjCxt, `def`: AddedKeywordDefinition, keyword: String) = this()
  }
  
  @JSImport("ajv/dist/core", "Name")
  @js.native
  open class Name protected ()
    extends typings.ajv.distCompileCodegenCodeMod.Name {
    def this(s: String) = this()
  }
  
  inline def _underscore(strs: TemplateStringsArray, args: CodeArg*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("_")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  @JSImport("ajv/dist/core", "nil")
  @js.native
  val nil: _Code = js.native
  
  inline def str(strs: TemplateStringsArray, args: (CodeArg | js.Array[String])*): _Code = ^.asInstanceOf[js.Dynamic].applyDynamic("str")(scala.List(strs.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[_Code]
  
  inline def stringify(x: Any): Code = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(x.asInstanceOf[js.Any]).asInstanceOf[Code]
  
  @js.native
  trait Ajv extends StObject {
    
    @JSName("$dataMetaSchema")
    def $dataMetaSchema(metaSchema: AnySchemaObject, keywordsJsonPointers: js.Array[String]): AnySchemaObject = js.native
    
    val RULES: ValidationRules = js.native
    
    def _addDefaultMetaSchema(): Unit = js.native
    
    def _addSchema(schema: AnySchema): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Boolean, baseId: String): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Boolean, baseId: String, validateSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Boolean, baseId: String, validateSchema: Boolean, addSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Boolean, baseId: String, validateSchema: Unit, addSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Boolean, baseId: Unit, validateSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Boolean, baseId: Unit, validateSchema: Boolean, addSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Boolean, baseId: Unit, validateSchema: Unit, addSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Unit, baseId: String): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Unit, baseId: String, validateSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Unit, baseId: String, validateSchema: Boolean, addSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Unit, baseId: String, validateSchema: Unit, addSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Unit, baseId: Unit, validateSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Unit, baseId: Unit, validateSchema: Boolean, addSchema: Boolean): SchemaEnv = js.native
    def _addSchema(schema: AnySchema, meta: Unit, baseId: Unit, validateSchema: Unit, addSchema: Boolean): SchemaEnv = js.native
    @JSName("_addSchema")
    def _addSchema_log(schema: AnySchema, meta: Boolean, baseId: String, validateSchema: log): SchemaEnv = js.native
    @JSName("_addSchema")
    def _addSchema_log(schema: AnySchema, meta: Boolean, baseId: String, validateSchema: log, addSchema: Boolean): SchemaEnv = js.native
    @JSName("_addSchema")
    def _addSchema_log(schema: AnySchema, meta: Boolean, baseId: Unit, validateSchema: log): SchemaEnv = js.native
    @JSName("_addSchema")
    def _addSchema_log(schema: AnySchema, meta: Boolean, baseId: Unit, validateSchema: log, addSchema: Boolean): SchemaEnv = js.native
    @JSName("_addSchema")
    def _addSchema_log(schema: AnySchema, meta: Unit, baseId: String, validateSchema: log): SchemaEnv = js.native
    @JSName("_addSchema")
    def _addSchema_log(schema: AnySchema, meta: Unit, baseId: String, validateSchema: log, addSchema: Boolean): SchemaEnv = js.native
    @JSName("_addSchema")
    def _addSchema_log(schema: AnySchema, meta: Unit, baseId: Unit, validateSchema: log): SchemaEnv = js.native
    @JSName("_addSchema")
    def _addSchema_log(schema: AnySchema, meta: Unit, baseId: Unit, validateSchema: log, addSchema: Boolean): SchemaEnv = js.native
    
    def _addVocabularies(): Unit = js.native
    
    /* private */ val _cache: Any = js.native
    
    /* private */ var _checkUnique: Any = js.native
    
    val _compilations: Set[SchemaEnv] = js.native
    
    /* private */ var _compileMetaSchema: Any = js.native
    
    /* private */ var _compileSchemaEnv: Any = js.native
    
    /* private */ val _loading: Any = js.native
    
    /* private */ val _metaOpts: Any = js.native
    
    /* private */ var _removeAllSchemas: Any = js.native
    
    def addFormat(name: String, format: Format): Ajv = js.native
    
    def addKeyword(kwdOrDef: String): Ajv = js.native
    def addKeyword(kwdOrDef: String, `def`: KeywordDefinition): Ajv = js.native
    def addKeyword(kwdOrDef: KeywordDefinition): Ajv = js.native
    def addKeyword(kwdOrDef: KeywordDefinition, `def`: KeywordDefinition): Ajv = js.native
    
    def addMetaSchema(schema: AnySchemaObject): Ajv = js.native
    def addMetaSchema(schema: AnySchemaObject, key: String): Ajv = js.native
    def addMetaSchema(schema: AnySchemaObject, key: String, // schema key
    _validateSchema: Boolean): Ajv = js.native
    def addMetaSchema(schema: AnySchemaObject, key: Unit, // schema key
    _validateSchema: Boolean): Ajv = js.native
    @JSName("addMetaSchema")
    def addMetaSchema_log(schema: AnySchemaObject, key: String, // schema key
    _validateSchema: log): Ajv = js.native
    @JSName("addMetaSchema")
    def addMetaSchema_log(schema: AnySchemaObject, key: Unit, // schema key
    _validateSchema: log): Ajv = js.native
    
    def addSchema(schema: js.Array[AnySchema]): Ajv = js.native
    def addSchema(schema: js.Array[AnySchema], // If array is passed, `key` will be ignored
    key: String): Ajv = js.native
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): Ajv = js.native
    def addSchema(schema: AnySchema): Ajv = js.native
    def addSchema(schema: AnySchema, // If array is passed, `key` will be ignored
    key: String): Ajv = js.native
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): Ajv = js.native
    def addSchema(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: Boolean
    ): Ajv = js.native
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): Ajv = js.native
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): Ajv = js.native
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): Ajv = js.native
    @JSName("addSchema")
    def addSchema_log(
      schema: js.Array[AnySchema],
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): Ajv = js.native
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): Ajv = js.native
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: String,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): Ajv = js.native
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Boolean,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): Ajv = js.native
    @JSName("addSchema")
    def addSchema_log(
      schema: AnySchema,
      // If array is passed, `key` will be ignored
    key: Unit,
      // Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    _meta: Unit,
      // true if schema is a meta-schema. Used internally, addMetaSchema should be used instead.
    _validateSchema: log
    ): Ajv = js.native
    
    def addVocabulary(definitions: Vocabulary): Ajv = js.native
    
    def compile[T](schema: JSONSchemaType[T] | (JTDSchemaType[T, Record[String, scala.Nothing]])): ValidateFunction[T] = js.native
    def compile[T](schema: JSONSchemaType[T] | (JTDSchemaType[T, Record[String, scala.Nothing]]), _meta: Boolean): ValidateFunction[T] = js.native
    def compile[T](schema: AsyncSchema): AsyncValidateFunction[T] = js.native
    def compile[T](schema: AsyncSchema, _meta: Boolean): AsyncValidateFunction[T] = js.native
    def compile[T](schema: Schema): ValidateFunction[T] = js.native
    def compile[T](schema: Schema, _meta: Boolean): ValidateFunction[T] = js.native
    
    def compileAsync[T](schema: JSONSchemaType[T] | (JTDSchemaType[T, Record[String, scala.Nothing]])): js.Promise[ValidateFunction[T]] = js.native
    def compileAsync[T](schema: JSONSchemaType[T] | (JTDSchemaType[T, Record[String, scala.Nothing]]), _meta: Boolean): js.Promise[ValidateFunction[T]] = js.native
    def compileAsync[T](schema: AnySchemaObject): js.Promise[AnyValidateFunction[T]] = js.native
    def compileAsync[T](schema: AnySchemaObject, meta: Boolean): js.Promise[AnyValidateFunction[T]] = js.native
    def compileAsync[T](schema: AsyncSchema): js.Promise[AsyncValidateFunction[T]] = js.native
    def compileAsync[T](schema: AsyncSchema, meta: Boolean): js.Promise[AsyncValidateFunction[T]] = js.native
    def compileAsync[T](schema: SchemaObject): js.Promise[ValidateFunction[T]] = js.native
    def compileAsync[T](schema: SchemaObject, _meta: Boolean): js.Promise[ValidateFunction[T]] = js.native
    
    @JSName("compile")
    def compile_NT[N /* <: scala.Nothing */, T /* <: SomeJTDSchemaType */](schema: T): ValidateFunction[JTDDataType[T]] = js.native
    @JSName("compile")
    def compile_NT[N /* <: scala.Nothing */, T /* <: SomeJTDSchemaType */](schema: T, _meta: Boolean): ValidateFunction[JTDDataType[T]] = js.native
    @JSName("compile")
    def compile_T_AnyValidateFunction[T](schema: AnySchema): AnyValidateFunction[T] = js.native
    @JSName("compile")
    def compile_T_AnyValidateFunction[T](schema: AnySchema, _meta: Boolean): AnyValidateFunction[T] = js.native
    
    def defaultMeta(): js.UndefOr[String | AnySchemaObject] = js.native
    
    var errors: js.UndefOr[(js.Array[ErrorObject[String, Record[String, Any], Any]]) | Null] = js.native
    
    def errorsText(): String = js.native
    def errorsText(errors: js.Array[ErrorObject[String, Record[String, Any], Any]]): String = js.native
    def errorsText(
      errors: js.Array[ErrorObject[String, Record[String, Any], Any]],
      // optional array of validation errors
    param1: ErrorsTextOptions
    ): String = js.native
    def errorsText(errors: Null, // optional array of validation errors
    param1: ErrorsTextOptions): String = js.native
    def errorsText(errors: Unit, // optional array of validation errors
    param1: ErrorsTextOptions): String = js.native
    
    val formats: /* import warning: importer.ImportType#apply Failed type conversion: {[ Name in string ]:? ajv.ajv/dist/types.AddedFormat} */ js.Any = js.native
    
    def getKeyword(keyword: String): AddedKeywordDefinition | Boolean = js.native
    
    def getSchema[T](keyRef: String): js.UndefOr[AnyValidateFunction[T]] = js.native
    
    var logger: Logger = js.native
    
    var opts: InstanceOptions = js.native
    
    val refs: /* import warning: importer.ImportType#apply Failed type conversion: {[ Ref in string ]:? ajv.ajv/dist/compile.SchemaEnv | string} */ js.Any = js.native
    
    def removeKeyword(keyword: String): Ajv = js.native
    
    def removeSchema(): Ajv = js.native
    def removeSchema(schemaKeyRef: String): Ajv = js.native
    def removeSchema(schemaKeyRef: js.RegExp): Ajv = js.native
    def removeSchema(schemaKeyRef: AnySchema): Ajv = js.native
    
    val schemas: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? ajv.ajv/dist/compile.SchemaEnv} */ js.Any = js.native
    
    val scope: typings.ajv.distCompileCodegenMod.ValueScope = js.native
    
    def validate(schemaKeyRef: String, data: Any): Boolean | js.Promise[Any] = js.native
    def validate(schemaKeyRef: AnySchema, data: Any): Boolean | js.Promise[Any] = js.native
    def validate[T](schema: JSONSchemaType[T] | (JTDSchemaType[T, Record[String, scala.Nothing]]), data: Any): /* is T */ Boolean = js.native
    def validate[T](schema: AsyncSchema, data: Any | T): js.Promise[T] = js.native
    
    def validateSchema(schema: AnySchema): Boolean | js.Promise[Any] = js.native
    def validateSchema(schema: AnySchema, throwOrLogError: Boolean): Boolean | js.Promise[Any] = js.native
    
    @JSName("validate")
    def validate_Boolean(schema: String, data: Any): Boolean = js.native
    @JSName("validate")
    def validate_Boolean(schema: Schema, data: Any): Boolean = js.native
    @JSName("validate")
    def validate_NT_Boolean[N /* <: scala.Nothing */, T /* <: SomeJTDSchemaType */](schema: T, data: Any): /* is ajv.ajv/dist/types/jtd-schema.JTDDataType<T> */ Boolean = js.native
    @JSName("validate")
    def validate_T_Boolean[T](schema: AnySchema | Schema, data: Any): /* is T */ Boolean = js.native
    @JSName("validate")
    def validate_T_Boolean[T](schema: String, data: Any): /* is T */ Boolean = js.native
  }
  
  trait CodeOptions extends StObject {
    
    var es5: js.UndefOr[Boolean] = js.undefined
    
    var esm: js.UndefOr[Boolean] = js.undefined
    
    var formats: js.UndefOr[Code] = js.undefined
    
    var lines: js.UndefOr[Boolean] = js.undefined
    
    var optimize: js.UndefOr[Boolean | Double] = js.undefined
    
    var process: js.UndefOr[js.Function2[/* code */ String, /* schema */ js.UndefOr[SchemaEnv], String]] = js.undefined
    
    var regExp: js.UndefOr[RegExpEngine] = js.undefined
    
    var source: js.UndefOr[Boolean] = js.undefined
  }
  object CodeOptions {
    
    inline def apply(): CodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeOptions]
    }
    
    extension [Self <: CodeOptions](x: Self) {
      
      inline def setEs5(value: Boolean): Self = StObject.set(x, "es5", value.asInstanceOf[js.Any])
      
      inline def setEs5Undefined: Self = StObject.set(x, "es5", js.undefined)
      
      inline def setEsm(value: Boolean): Self = StObject.set(x, "esm", value.asInstanceOf[js.Any])
      
      inline def setEsmUndefined: Self = StObject.set(x, "esm", js.undefined)
      
      inline def setFormats(value: Code): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setLines(value: Boolean): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setOptimize(value: Boolean | Double): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
      
      inline def setProcess(value: (/* code */ String, /* schema */ js.UndefOr[SchemaEnv]) => String): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
      
      inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
      
      inline def setRegExp(value: RegExpEngine): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setRegExpUndefined: Self = StObject.set(x, "regExp", js.undefined)
      
      inline def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  trait CurrentOptions extends StObject {
    
    @JSName("$comment")
    var $comment: js.UndefOr[
        `true` | (js.Function3[
          /* comment */ String, 
          /* schemaPath */ js.UndefOr[String], 
          /* rootSchema */ js.UndefOr[AnySchemaObject], 
          Any
        ])
      ] = js.undefined
    
    @JSName("$data")
    var $data: js.UndefOr[Boolean] = js.undefined
    
    var addUsedSchema: js.UndefOr[Boolean] = js.undefined
    
    var allErrors: js.UndefOr[Boolean] = js.undefined
    
    var allowDate: js.UndefOr[Boolean] = js.undefined
    
    var allowMatchingProperties: js.UndefOr[Boolean] = js.undefined
    
    var allowUnionTypes: js.UndefOr[Boolean] = js.undefined
    
    var code: js.UndefOr[CodeOptions] = js.undefined
    
    var coerceTypes: js.UndefOr[Boolean | array] = js.undefined
    
    var defaultMeta: js.UndefOr[String | AnySchemaObject] = js.undefined
    
    var discriminator: js.UndefOr[Boolean] = js.undefined
    
    var dynamicRef: js.UndefOr[Boolean] = js.undefined
    
    var formats: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ Name in string ]:? ajv.ajv/dist/types.Format} */ js.Any
      ] = js.undefined
    
    var inlineRefs: js.UndefOr[Boolean | Double] = js.undefined
    
    var int32range: js.UndefOr[Boolean] = js.undefined
    
    var jtd: js.UndefOr[Boolean] = js.undefined
    
    var keywords: js.UndefOr[Vocabulary] = js.undefined
    
    var loadSchema: js.UndefOr[js.Function1[/* uri */ String, js.Promise[AnySchemaObject]]] = js.undefined
    
    var logger: js.UndefOr[Logger | `false`] = js.undefined
    
    var loopEnum: js.UndefOr[Double] = js.undefined
    
    var loopRequired: js.UndefOr[Double] = js.undefined
    
    var messages: js.UndefOr[Boolean] = js.undefined
    
    var meta: js.UndefOr[SchemaObject | Boolean] = js.undefined
    
    var multipleOfPrecision: js.UndefOr[Double] = js.undefined
    
    var next: js.UndefOr[Boolean] = js.undefined
    
    var ownProperties: js.UndefOr[Boolean] = js.undefined
    
    var parseDate: js.UndefOr[Boolean] = js.undefined
    
    var passContext: js.UndefOr[Boolean] = js.undefined
    
    var removeAdditional: js.UndefOr[Boolean | all | failing] = js.undefined
    
    var schemaId: js.UndefOr[id | $id] = js.undefined
    
    var schemas: js.UndefOr[
        js.Array[AnySchema] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? ajv.ajv/dist/types.AnySchema} */ js.Any)
      ] = js.undefined
    
    var strict: js.UndefOr[Boolean | log] = js.undefined
    
    var strictNumbers: js.UndefOr[Boolean | log] = js.undefined
    
    var strictRequired: js.UndefOr[Boolean | log] = js.undefined
    
    var strictSchema: js.UndefOr[Boolean | log] = js.undefined
    
    var strictTuples: js.UndefOr[Boolean | log] = js.undefined
    
    var strictTypes: js.UndefOr[Boolean | log] = js.undefined
    
    var timestamp: js.UndefOr[string | date] = js.undefined
    
    var unevaluated: js.UndefOr[Boolean] = js.undefined
    
    var unicodeRegExp: js.UndefOr[Boolean] = js.undefined
    
    var uriResolver: js.UndefOr[UriResolver] = js.undefined
    
    var useDefaults: js.UndefOr[Boolean | empty] = js.undefined
    
    var validateFormats: js.UndefOr[Boolean] = js.undefined
    
    var validateSchema: js.UndefOr[Boolean | log] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object CurrentOptions {
    
    inline def apply(): CurrentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentOptions]
    }
    
    extension [Self <: CurrentOptions](x: Self) {
      
      inline def set$comment(
        value: `true` | (js.Function3[
              /* comment */ String, 
              /* schemaPath */ js.UndefOr[String], 
              /* rootSchema */ js.UndefOr[AnySchemaObject], 
              Any
            ])
      ): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
      
      inline def set$commentFunction3(
        value: (/* comment */ String, /* schemaPath */ js.UndefOr[String], /* rootSchema */ js.UndefOr[AnySchemaObject]) => Any
      ): Self = StObject.set(x, "$comment", js.Any.fromFunction3(value))
      
      inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
      
      inline def set$data(value: Boolean): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
      
      inline def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
      
      inline def setAddUsedSchema(value: Boolean): Self = StObject.set(x, "addUsedSchema", value.asInstanceOf[js.Any])
      
      inline def setAddUsedSchemaUndefined: Self = StObject.set(x, "addUsedSchema", js.undefined)
      
      inline def setAllErrors(value: Boolean): Self = StObject.set(x, "allErrors", value.asInstanceOf[js.Any])
      
      inline def setAllErrorsUndefined: Self = StObject.set(x, "allErrors", js.undefined)
      
      inline def setAllowDate(value: Boolean): Self = StObject.set(x, "allowDate", value.asInstanceOf[js.Any])
      
      inline def setAllowDateUndefined: Self = StObject.set(x, "allowDate", js.undefined)
      
      inline def setAllowMatchingProperties(value: Boolean): Self = StObject.set(x, "allowMatchingProperties", value.asInstanceOf[js.Any])
      
      inline def setAllowMatchingPropertiesUndefined: Self = StObject.set(x, "allowMatchingProperties", js.undefined)
      
      inline def setAllowUnionTypes(value: Boolean): Self = StObject.set(x, "allowUnionTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowUnionTypesUndefined: Self = StObject.set(x, "allowUnionTypes", js.undefined)
      
      inline def setCode(value: CodeOptions): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setCoerceTypes(value: Boolean | array): Self = StObject.set(x, "coerceTypes", value.asInstanceOf[js.Any])
      
      inline def setCoerceTypesUndefined: Self = StObject.set(x, "coerceTypes", js.undefined)
      
      inline def setDefaultMeta(value: String | AnySchemaObject): Self = StObject.set(x, "defaultMeta", value.asInstanceOf[js.Any])
      
      inline def setDefaultMetaUndefined: Self = StObject.set(x, "defaultMeta", js.undefined)
      
      inline def setDiscriminator(value: Boolean): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
      
      inline def setDynamicRef(value: Boolean): Self = StObject.set(x, "dynamicRef", value.asInstanceOf[js.Any])
      
      inline def setDynamicRefUndefined: Self = StObject.set(x, "dynamicRef", js.undefined)
      
      inline def setFormats(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ Name in string ]:? ajv.ajv/dist/types.Format} */ js.Any
      ): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setInlineRefs(value: Boolean | Double): Self = StObject.set(x, "inlineRefs", value.asInstanceOf[js.Any])
      
      inline def setInlineRefsUndefined: Self = StObject.set(x, "inlineRefs", js.undefined)
      
      inline def setInt32range(value: Boolean): Self = StObject.set(x, "int32range", value.asInstanceOf[js.Any])
      
      inline def setInt32rangeUndefined: Self = StObject.set(x, "int32range", js.undefined)
      
      inline def setJtd(value: Boolean): Self = StObject.set(x, "jtd", value.asInstanceOf[js.Any])
      
      inline def setJtdUndefined: Self = StObject.set(x, "jtd", js.undefined)
      
      inline def setKeywords(value: Vocabulary): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: (KeywordDefinition | String)*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLoadSchema(value: /* uri */ String => js.Promise[AnySchemaObject]): Self = StObject.set(x, "loadSchema", js.Any.fromFunction1(value))
      
      inline def setLoadSchemaUndefined: Self = StObject.set(x, "loadSchema", js.undefined)
      
      inline def setLogger(value: Logger | `false`): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setLoopEnum(value: Double): Self = StObject.set(x, "loopEnum", value.asInstanceOf[js.Any])
      
      inline def setLoopEnumUndefined: Self = StObject.set(x, "loopEnum", js.undefined)
      
      inline def setLoopRequired(value: Double): Self = StObject.set(x, "loopRequired", value.asInstanceOf[js.Any])
      
      inline def setLoopRequiredUndefined: Self = StObject.set(x, "loopRequired", js.undefined)
      
      inline def setMessages(value: Boolean): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMeta(value: SchemaObject | Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setMultipleOfPrecision(value: Double): Self = StObject.set(x, "multipleOfPrecision", value.asInstanceOf[js.Any])
      
      inline def setMultipleOfPrecisionUndefined: Self = StObject.set(x, "multipleOfPrecision", js.undefined)
      
      inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
      
      inline def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
      
      inline def setParseDate(value: Boolean): Self = StObject.set(x, "parseDate", value.asInstanceOf[js.Any])
      
      inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      inline def setPassContext(value: Boolean): Self = StObject.set(x, "passContext", value.asInstanceOf[js.Any])
      
      inline def setPassContextUndefined: Self = StObject.set(x, "passContext", js.undefined)
      
      inline def setRemoveAdditional(value: Boolean | all | failing): Self = StObject.set(x, "removeAdditional", value.asInstanceOf[js.Any])
      
      inline def setRemoveAdditionalUndefined: Self = StObject.set(x, "removeAdditional", js.undefined)
      
      inline def setSchemaId(value: id | $id): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
      
      inline def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
      
      inline def setSchemas(
        value: js.Array[AnySchema] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? ajv.ajv/dist/types.AnySchema} */ js.Any)
      ): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      inline def setSchemasVarargs(value: AnySchema*): Self = StObject.set(x, "schemas", js.Array(value*))
      
      inline def setStrict(value: Boolean | log): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictNumbers(value: Boolean | log): Self = StObject.set(x, "strictNumbers", value.asInstanceOf[js.Any])
      
      inline def setStrictNumbersUndefined: Self = StObject.set(x, "strictNumbers", js.undefined)
      
      inline def setStrictRequired(value: Boolean | log): Self = StObject.set(x, "strictRequired", value.asInstanceOf[js.Any])
      
      inline def setStrictRequiredUndefined: Self = StObject.set(x, "strictRequired", js.undefined)
      
      inline def setStrictSchema(value: Boolean | log): Self = StObject.set(x, "strictSchema", value.asInstanceOf[js.Any])
      
      inline def setStrictSchemaUndefined: Self = StObject.set(x, "strictSchema", js.undefined)
      
      inline def setStrictTuples(value: Boolean | log): Self = StObject.set(x, "strictTuples", value.asInstanceOf[js.Any])
      
      inline def setStrictTuplesUndefined: Self = StObject.set(x, "strictTuples", js.undefined)
      
      inline def setStrictTypes(value: Boolean | log): Self = StObject.set(x, "strictTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictTypesUndefined: Self = StObject.set(x, "strictTypes", js.undefined)
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTimestamp(value: string | date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUnevaluated(value: Boolean): Self = StObject.set(x, "unevaluated", value.asInstanceOf[js.Any])
      
      inline def setUnevaluatedUndefined: Self = StObject.set(x, "unevaluated", js.undefined)
      
      inline def setUnicodeRegExp(value: Boolean): Self = StObject.set(x, "unicodeRegExp", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRegExpUndefined: Self = StObject.set(x, "unicodeRegExp", js.undefined)
      
      inline def setUriResolver(value: UriResolver): Self = StObject.set(x, "uriResolver", value.asInstanceOf[js.Any])
      
      inline def setUriResolverUndefined: Self = StObject.set(x, "uriResolver", js.undefined)
      
      inline def setUseDefaults(value: Boolean | empty): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
      
      inline def setValidateFormats(value: Boolean): Self = StObject.set(x, "validateFormats", value.asInstanceOf[js.Any])
      
      inline def setValidateFormatsUndefined: Self = StObject.set(x, "validateFormats", js.undefined)
      
      inline def setValidateSchema(value: Boolean | log): Self = StObject.set(x, "validateSchema", value.asInstanceOf[js.Any])
      
      inline def setValidateSchemaUndefined: Self = StObject.set(x, "validateSchema", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait DeprecatedOptions extends StObject {
    
    /** @deprecated */
    var ignoreKeywordsWithRef: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated */
    var jsPropertySyntax: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated */
    var unicode: js.UndefOr[Boolean] = js.undefined
  }
  object DeprecatedOptions {
    
    inline def apply(): DeprecatedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedOptions]
    }
    
    extension [Self <: DeprecatedOptions](x: Self) {
      
      inline def setIgnoreKeywordsWithRef(value: Boolean): Self = StObject.set(x, "ignoreKeywordsWithRef", value.asInstanceOf[js.Any])
      
      inline def setIgnoreKeywordsWithRefUndefined: Self = StObject.set(x, "ignoreKeywordsWithRef", js.undefined)
      
      inline def setJsPropertySyntax(value: Boolean): Self = StObject.set(x, "jsPropertySyntax", value.asInstanceOf[js.Any])
      
      inline def setJsPropertySyntaxUndefined: Self = StObject.set(x, "jsPropertySyntax", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
  
  trait ErrorsTextOptions extends StObject {
    
    var dataVar: js.UndefOr[String] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
  }
  object ErrorsTextOptions {
    
    inline def apply(): ErrorsTextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorsTextOptions]
    }
    
    extension [Self <: ErrorsTextOptions](x: Self) {
      
      inline def setDataVar(value: String): Self = StObject.set(x, "dataVar", value.asInstanceOf[js.Any])
      
      inline def setDataVarUndefined: Self = StObject.set(x, "dataVar", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    }
  }
  
  trait InstanceCodeOptions
    extends StObject
       with CodeOptions {
    
    @JSName("optimize")
    var optimize_InstanceCodeOptions: Double
    
    @JSName("regExp")
    def regExp_MInstanceCodeOptions(pattern: String, u: String): RegExpLike
    @JSName("regExp")
    var regExp_Original: RegExpEngine
  }
  object InstanceCodeOptions {
    
    inline def apply(optimize: Double, regExp: RegExpEngine): InstanceCodeOptions = {
      val __obj = js.Dynamic.literal(optimize = optimize.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceCodeOptions]
    }
    
    extension [Self <: InstanceCodeOptions](x: Self) {
      
      inline def setOptimize(value: Double): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExpEngine): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined ajv.ajv/dist/core.Options & ajv.ajv/dist/core.RequiredInstanceOptions */
  trait InstanceOptions extends StObject {
    
    @JSName("$comment")
    var $comment: js.UndefOr[
        `true` | (js.Function3[
          /* comment */ String, 
          /* schemaPath */ js.UndefOr[String], 
          /* rootSchema */ js.UndefOr[AnySchemaObject], 
          Any
        ])
      ] = js.undefined
    
    @JSName("$data")
    var $data: js.UndefOr[Boolean] = js.undefined
    
    var addUsedSchema: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]
    
    var allErrors: js.UndefOr[Boolean] = js.undefined
    
    var allowDate: js.UndefOr[Boolean] = js.undefined
    
    var allowMatchingProperties: js.UndefOr[Boolean] = js.undefined
    
    var allowUnionTypes: js.UndefOr[Boolean] = js.undefined
    
    var code: js.UndefOr[CodeOptions] & InstanceCodeOptions
    
    var coerceTypes: js.UndefOr[Boolean | array] = js.undefined
    
    var defaultMeta: js.UndefOr[String | AnySchemaObject] = js.undefined
    
    var discriminator: js.UndefOr[Boolean] = js.undefined
    
    var dynamicRef: js.UndefOr[Boolean] = js.undefined
    
    var formats: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ Name in string ]:? ajv.ajv/dist/types.Format} */ js.Any
      ] = js.undefined
    
    /** @deprecated */
    var ignoreKeywordsWithRef: js.UndefOr[Boolean] = js.undefined
    
    var inlineRefs: (js.UndefOr[Boolean | Double]) & (NonNullable[js.UndefOr[Boolean | Double]])
    
    var int32range: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]
    
    /** @deprecated */
    var jsPropertySyntax: js.UndefOr[Boolean] = js.undefined
    
    var jtd: js.UndefOr[Boolean] = js.undefined
    
    var keywords: js.UndefOr[Vocabulary] = js.undefined
    
    var loadSchema: js.UndefOr[js.Function1[/* uri */ String, js.Promise[AnySchemaObject]]] = js.undefined
    
    var logger: js.UndefOr[Logger | `false`] = js.undefined
    
    var loopEnum: js.UndefOr[Double] & NonNullable[js.UndefOr[Double]]
    
    var loopRequired: js.UndefOr[Double] & NonNullable[js.UndefOr[Double]]
    
    var messages: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]
    
    var meta: (js.UndefOr[SchemaObject | Boolean]) & (NonNullable[js.UndefOr[SchemaObject | Boolean]])
    
    var multipleOfPrecision: js.UndefOr[Double] = js.undefined
    
    var next: js.UndefOr[Boolean] = js.undefined
    
    var ownProperties: js.UndefOr[Boolean] = js.undefined
    
    var parseDate: js.UndefOr[Boolean] = js.undefined
    
    var passContext: js.UndefOr[Boolean] = js.undefined
    
    var removeAdditional: js.UndefOr[Boolean | all | failing] = js.undefined
    
    var schemaId: (js.UndefOr[id | $id]) & (NonNullable[js.UndefOr[id | $id]])
    
    var schemas: js.UndefOr[
        js.Array[AnySchema] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? ajv.ajv/dist/types.AnySchema} */ js.Any)
      ] = js.undefined
    
    var strict: js.UndefOr[Boolean | log] = js.undefined
    
    var strictNumbers: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])
    
    var strictRequired: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])
    
    var strictSchema: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])
    
    var strictTuples: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])
    
    var strictTypes: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])
    
    var timestamp: js.UndefOr[string | date] = js.undefined
    
    var unevaluated: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated */
    var unicode: js.UndefOr[Boolean] = js.undefined
    
    var unicodeRegExp: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]
    
    var uriResolver: js.UndefOr[UriResolver] & NonNullable[js.UndefOr[UriResolver]]
    
    var useDefaults: js.UndefOr[Boolean | empty] = js.undefined
    
    var validateFormats: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]
    
    var validateSchema: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object InstanceOptions {
    
    inline def apply(
      addUsedSchema: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]],
      code: js.UndefOr[CodeOptions] & InstanceCodeOptions,
      inlineRefs: (js.UndefOr[Boolean | Double]) & (NonNullable[js.UndefOr[Boolean | Double]]),
      int32range: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]],
      loopEnum: js.UndefOr[Double] & NonNullable[js.UndefOr[Double]],
      loopRequired: js.UndefOr[Double] & NonNullable[js.UndefOr[Double]],
      messages: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]],
      meta: (js.UndefOr[SchemaObject | Boolean]) & (NonNullable[js.UndefOr[SchemaObject | Boolean]]),
      schemaId: (js.UndefOr[id | $id]) & (NonNullable[js.UndefOr[id | $id]]),
      strictNumbers: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]]),
      strictRequired: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]]),
      strictSchema: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]]),
      strictTuples: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]]),
      strictTypes: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]]),
      unicodeRegExp: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]],
      uriResolver: js.UndefOr[UriResolver] & NonNullable[js.UndefOr[UriResolver]],
      validateFormats: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]],
      validateSchema: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])
    ): InstanceOptions = {
      val __obj = js.Dynamic.literal(addUsedSchema = addUsedSchema.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], inlineRefs = inlineRefs.asInstanceOf[js.Any], int32range = int32range.asInstanceOf[js.Any], loopEnum = loopEnum.asInstanceOf[js.Any], loopRequired = loopRequired.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], schemaId = schemaId.asInstanceOf[js.Any], strictNumbers = strictNumbers.asInstanceOf[js.Any], strictRequired = strictRequired.asInstanceOf[js.Any], strictSchema = strictSchema.asInstanceOf[js.Any], strictTuples = strictTuples.asInstanceOf[js.Any], strictTypes = strictTypes.asInstanceOf[js.Any], unicodeRegExp = unicodeRegExp.asInstanceOf[js.Any], uriResolver = uriResolver.asInstanceOf[js.Any], validateFormats = validateFormats.asInstanceOf[js.Any], validateSchema = validateSchema.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstanceOptions]
    }
    
    extension [Self <: InstanceOptions](x: Self) {
      
      inline def set$comment(
        value: `true` | (js.Function3[
              /* comment */ String, 
              /* schemaPath */ js.UndefOr[String], 
              /* rootSchema */ js.UndefOr[AnySchemaObject], 
              Any
            ])
      ): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
      
      inline def set$commentFunction3(
        value: (/* comment */ String, /* schemaPath */ js.UndefOr[String], /* rootSchema */ js.UndefOr[AnySchemaObject]) => Any
      ): Self = StObject.set(x, "$comment", js.Any.fromFunction3(value))
      
      inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
      
      inline def set$data(value: Boolean): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
      
      inline def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
      
      inline def setAddUsedSchema(value: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "addUsedSchema", value.asInstanceOf[js.Any])
      
      inline def setAllErrors(value: Boolean): Self = StObject.set(x, "allErrors", value.asInstanceOf[js.Any])
      
      inline def setAllErrorsUndefined: Self = StObject.set(x, "allErrors", js.undefined)
      
      inline def setAllowDate(value: Boolean): Self = StObject.set(x, "allowDate", value.asInstanceOf[js.Any])
      
      inline def setAllowDateUndefined: Self = StObject.set(x, "allowDate", js.undefined)
      
      inline def setAllowMatchingProperties(value: Boolean): Self = StObject.set(x, "allowMatchingProperties", value.asInstanceOf[js.Any])
      
      inline def setAllowMatchingPropertiesUndefined: Self = StObject.set(x, "allowMatchingProperties", js.undefined)
      
      inline def setAllowUnionTypes(value: Boolean): Self = StObject.set(x, "allowUnionTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowUnionTypesUndefined: Self = StObject.set(x, "allowUnionTypes", js.undefined)
      
      inline def setCode(value: js.UndefOr[CodeOptions] & InstanceCodeOptions): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCoerceTypes(value: Boolean | array): Self = StObject.set(x, "coerceTypes", value.asInstanceOf[js.Any])
      
      inline def setCoerceTypesUndefined: Self = StObject.set(x, "coerceTypes", js.undefined)
      
      inline def setDefaultMeta(value: String | AnySchemaObject): Self = StObject.set(x, "defaultMeta", value.asInstanceOf[js.Any])
      
      inline def setDefaultMetaUndefined: Self = StObject.set(x, "defaultMeta", js.undefined)
      
      inline def setDiscriminator(value: Boolean): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
      
      inline def setDynamicRef(value: Boolean): Self = StObject.set(x, "dynamicRef", value.asInstanceOf[js.Any])
      
      inline def setDynamicRefUndefined: Self = StObject.set(x, "dynamicRef", js.undefined)
      
      inline def setFormats(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ Name in string ]:? ajv.ajv/dist/types.Format} */ js.Any
      ): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setIgnoreKeywordsWithRef(value: Boolean): Self = StObject.set(x, "ignoreKeywordsWithRef", value.asInstanceOf[js.Any])
      
      inline def setIgnoreKeywordsWithRefUndefined: Self = StObject.set(x, "ignoreKeywordsWithRef", js.undefined)
      
      inline def setInlineRefs(value: (js.UndefOr[Boolean | Double]) & (NonNullable[js.UndefOr[Boolean | Double]])): Self = StObject.set(x, "inlineRefs", value.asInstanceOf[js.Any])
      
      inline def setInt32range(value: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "int32range", value.asInstanceOf[js.Any])
      
      inline def setJsPropertySyntax(value: Boolean): Self = StObject.set(x, "jsPropertySyntax", value.asInstanceOf[js.Any])
      
      inline def setJsPropertySyntaxUndefined: Self = StObject.set(x, "jsPropertySyntax", js.undefined)
      
      inline def setJtd(value: Boolean): Self = StObject.set(x, "jtd", value.asInstanceOf[js.Any])
      
      inline def setJtdUndefined: Self = StObject.set(x, "jtd", js.undefined)
      
      inline def setKeywords(value: Vocabulary): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setKeywordsVarargs(value: (KeywordDefinition | String)*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setLoadSchema(value: /* uri */ String => js.Promise[AnySchemaObject]): Self = StObject.set(x, "loadSchema", js.Any.fromFunction1(value))
      
      inline def setLoadSchemaUndefined: Self = StObject.set(x, "loadSchema", js.undefined)
      
      inline def setLogger(value: Logger | `false`): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setLoopEnum(value: js.UndefOr[Double] & NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "loopEnum", value.asInstanceOf[js.Any])
      
      inline def setLoopRequired(value: js.UndefOr[Double] & NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "loopRequired", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: (js.UndefOr[SchemaObject | Boolean]) & (NonNullable[js.UndefOr[SchemaObject | Boolean]])): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMultipleOfPrecision(value: Double): Self = StObject.set(x, "multipleOfPrecision", value.asInstanceOf[js.Any])
      
      inline def setMultipleOfPrecisionUndefined: Self = StObject.set(x, "multipleOfPrecision", js.undefined)
      
      inline def setNext(value: Boolean): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      inline def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
      
      inline def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
      
      inline def setParseDate(value: Boolean): Self = StObject.set(x, "parseDate", value.asInstanceOf[js.Any])
      
      inline def setParseDateUndefined: Self = StObject.set(x, "parseDate", js.undefined)
      
      inline def setPassContext(value: Boolean): Self = StObject.set(x, "passContext", value.asInstanceOf[js.Any])
      
      inline def setPassContextUndefined: Self = StObject.set(x, "passContext", js.undefined)
      
      inline def setRemoveAdditional(value: Boolean | all | failing): Self = StObject.set(x, "removeAdditional", value.asInstanceOf[js.Any])
      
      inline def setRemoveAdditionalUndefined: Self = StObject.set(x, "removeAdditional", js.undefined)
      
      inline def setSchemaId(value: (js.UndefOr[id | $id]) & (NonNullable[js.UndefOr[id | $id]])): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
      
      inline def setSchemas(
        value: js.Array[AnySchema] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in string ]:? ajv.ajv/dist/types.AnySchema} */ js.Any)
      ): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
      
      inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
      
      inline def setSchemasVarargs(value: AnySchema*): Self = StObject.set(x, "schemas", js.Array(value*))
      
      inline def setStrict(value: Boolean | log): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictNumbers(value: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])): Self = StObject.set(x, "strictNumbers", value.asInstanceOf[js.Any])
      
      inline def setStrictRequired(value: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])): Self = StObject.set(x, "strictRequired", value.asInstanceOf[js.Any])
      
      inline def setStrictSchema(value: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])): Self = StObject.set(x, "strictSchema", value.asInstanceOf[js.Any])
      
      inline def setStrictTuples(value: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])): Self = StObject.set(x, "strictTuples", value.asInstanceOf[js.Any])
      
      inline def setStrictTypes(value: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])): Self = StObject.set(x, "strictTypes", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTimestamp(value: string | date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUnevaluated(value: Boolean): Self = StObject.set(x, "unevaluated", value.asInstanceOf[js.Any])
      
      inline def setUnevaluatedUndefined: Self = StObject.set(x, "unevaluated", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRegExp(value: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "unicodeRegExp", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
      
      inline def setUriResolver(value: js.UndefOr[UriResolver] & NonNullable[js.UndefOr[UriResolver]]): Self = StObject.set(x, "uriResolver", value.asInstanceOf[js.Any])
      
      inline def setUseDefaults(value: Boolean | empty): Self = StObject.set(x, "useDefaults", value.asInstanceOf[js.Any])
      
      inline def setUseDefaultsUndefined: Self = StObject.set(x, "useDefaults", js.undefined)
      
      inline def setValidateFormats(value: js.UndefOr[Boolean] & NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "validateFormats", value.asInstanceOf[js.Any])
      
      inline def setValidateSchema(value: (js.UndefOr[Boolean | log]) & (NonNullable[js.UndefOr[Boolean | log]])): Self = StObject.set(x, "validateSchema", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Logger extends StObject {
    
    def error(args: Any*): Any
    
    def log(args: Any*): Any
    
    def warn(args: Any*): Any
  }
  object Logger {
    
    inline def apply(error: /* repeated */ Any => Any, log: /* repeated */ Any => Any, warn: /* repeated */ Any => Any): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: /* repeated */ Any => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setLog(value: /* repeated */ Any => Any): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait Options
    extends StObject
       with CurrentOptions
       with DeprecatedOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  @js.native
  trait Plugin[Opts]
    extends StObject
       with /* x */ StringDictionary[Any] {
    
    def apply(ajv: Ajv): Ajv = js.native
    def apply(ajv: Ajv, options: Opts): Ajv = js.native
  }
  
  /* Inlined {[ K in 'strictSchema' | 'strictNumbers' | 'strictTypes' | 'strictTuples' | 'strictRequired' | 'inlineRefs' | 'loopRequired' | 'loopEnum' | 'meta' | 'messages' | 'schemaId' | 'addUsedSchema' | 'validateSchema' | 'validateFormats' | 'int32range' | 'unicodeRegExp' | 'uriResolver' ]: std.NonNullable<ajv.ajv/dist/core.Options[K]>} & {  code :ajv.ajv/dist/core.InstanceCodeOptions} */
  trait RequiredInstanceOptions extends StObject {
    
    var addUsedSchema: NonNullable[js.UndefOr[Boolean]]
    
    var code: InstanceCodeOptions
    
    var inlineRefs: NonNullable[js.UndefOr[Boolean | Double]]
    
    var int32range: NonNullable[js.UndefOr[Boolean]]
    
    var loopEnum: NonNullable[js.UndefOr[Double]]
    
    var loopRequired: NonNullable[js.UndefOr[Double]]
    
    var messages: NonNullable[js.UndefOr[Boolean]]
    
    var meta: NonNullable[js.UndefOr[SchemaObject | Boolean]]
    
    var schemaId: NonNullable[js.UndefOr[id | $id]]
    
    var strictNumbers: NonNullable[js.UndefOr[Boolean | log]]
    
    var strictRequired: NonNullable[js.UndefOr[Boolean | log]]
    
    var strictSchema: NonNullable[js.UndefOr[Boolean | log]]
    
    var strictTuples: NonNullable[js.UndefOr[Boolean | log]]
    
    var strictTypes: NonNullable[js.UndefOr[Boolean | log]]
    
    var unicodeRegExp: NonNullable[js.UndefOr[Boolean]]
    
    var uriResolver: NonNullable[js.UndefOr[UriResolver]]
    
    var validateFormats: NonNullable[js.UndefOr[Boolean]]
    
    var validateSchema: NonNullable[js.UndefOr[Boolean | log]]
  }
  object RequiredInstanceOptions {
    
    inline def apply(
      addUsedSchema: NonNullable[js.UndefOr[Boolean]],
      code: InstanceCodeOptions,
      inlineRefs: NonNullable[js.UndefOr[Boolean | Double]],
      int32range: NonNullable[js.UndefOr[Boolean]],
      loopEnum: NonNullable[js.UndefOr[Double]],
      loopRequired: NonNullable[js.UndefOr[Double]],
      messages: NonNullable[js.UndefOr[Boolean]],
      meta: NonNullable[js.UndefOr[SchemaObject | Boolean]],
      schemaId: NonNullable[js.UndefOr[id | $id]],
      strictNumbers: NonNullable[js.UndefOr[Boolean | log]],
      strictRequired: NonNullable[js.UndefOr[Boolean | log]],
      strictSchema: NonNullable[js.UndefOr[Boolean | log]],
      strictTuples: NonNullable[js.UndefOr[Boolean | log]],
      strictTypes: NonNullable[js.UndefOr[Boolean | log]],
      unicodeRegExp: NonNullable[js.UndefOr[Boolean]],
      uriResolver: NonNullable[js.UndefOr[UriResolver]],
      validateFormats: NonNullable[js.UndefOr[Boolean]],
      validateSchema: NonNullable[js.UndefOr[Boolean | log]]
    ): RequiredInstanceOptions = {
      val __obj = js.Dynamic.literal(addUsedSchema = addUsedSchema.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], inlineRefs = inlineRefs.asInstanceOf[js.Any], int32range = int32range.asInstanceOf[js.Any], loopEnum = loopEnum.asInstanceOf[js.Any], loopRequired = loopRequired.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], schemaId = schemaId.asInstanceOf[js.Any], strictNumbers = strictNumbers.asInstanceOf[js.Any], strictRequired = strictRequired.asInstanceOf[js.Any], strictSchema = strictSchema.asInstanceOf[js.Any], strictTuples = strictTuples.asInstanceOf[js.Any], strictTypes = strictTypes.asInstanceOf[js.Any], unicodeRegExp = unicodeRegExp.asInstanceOf[js.Any], uriResolver = uriResolver.asInstanceOf[js.Any], validateFormats = validateFormats.asInstanceOf[js.Any], validateSchema = validateSchema.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredInstanceOptions]
    }
    
    extension [Self <: RequiredInstanceOptions](x: Self) {
      
      inline def setAddUsedSchema(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "addUsedSchema", value.asInstanceOf[js.Any])
      
      inline def setCode(value: InstanceCodeOptions): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setInlineRefs(value: NonNullable[js.UndefOr[Boolean | Double]]): Self = StObject.set(x, "inlineRefs", value.asInstanceOf[js.Any])
      
      inline def setInt32range(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "int32range", value.asInstanceOf[js.Any])
      
      inline def setLoopEnum(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "loopEnum", value.asInstanceOf[js.Any])
      
      inline def setLoopRequired(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "loopRequired", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: NonNullable[js.UndefOr[SchemaObject | Boolean]]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setSchemaId(value: NonNullable[js.UndefOr[id | $id]]): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
      
      inline def setStrictNumbers(value: NonNullable[js.UndefOr[Boolean | log]]): Self = StObject.set(x, "strictNumbers", value.asInstanceOf[js.Any])
      
      inline def setStrictRequired(value: NonNullable[js.UndefOr[Boolean | log]]): Self = StObject.set(x, "strictRequired", value.asInstanceOf[js.Any])
      
      inline def setStrictSchema(value: NonNullable[js.UndefOr[Boolean | log]]): Self = StObject.set(x, "strictSchema", value.asInstanceOf[js.Any])
      
      inline def setStrictTuples(value: NonNullable[js.UndefOr[Boolean | log]]): Self = StObject.set(x, "strictTuples", value.asInstanceOf[js.Any])
      
      inline def setStrictTypes(value: NonNullable[js.UndefOr[Boolean | log]]): Self = StObject.set(x, "strictTypes", value.asInstanceOf[js.Any])
      
      inline def setUnicodeRegExp(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "unicodeRegExp", value.asInstanceOf[js.Any])
      
      inline def setUriResolver(value: NonNullable[js.UndefOr[UriResolver]]): Self = StObject.set(x, "uriResolver", value.asInstanceOf[js.Any])
      
      inline def setValidateFormats(value: NonNullable[js.UndefOr[Boolean]]): Self = StObject.set(x, "validateFormats", value.asInstanceOf[js.Any])
      
      inline def setValidateSchema(value: NonNullable[js.UndefOr[Boolean | log]]): Self = StObject.set(x, "validateSchema", value.asInstanceOf[js.Any])
    }
  }
}
