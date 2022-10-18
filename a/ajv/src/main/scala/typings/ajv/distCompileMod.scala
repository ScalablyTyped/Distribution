package typings.ajv

import typings.ajv.ajvStrings.$id
import typings.ajv.ajvStrings.id
import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenMod.CodeGen
import typings.ajv.distCompileCodegenMod.Name
import typings.ajv.distCompileCodegenMod.ValueScopeName
import typings.ajv.distCompileResolveMod.LocalRefs
import typings.ajv.distCompileRulesMod.JSONType
import typings.ajv.distCoreMod.InstanceOptions
import typings.ajv.distCoreMod.default
import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.AnySchemaObject
import typings.ajv.distTypesMod.AnyValidateFunction
import typings.ajv.distTypesMod.EvaluatedItems
import typings.ajv.distTypesMod.EvaluatedProperties
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileMod {
  
  @JSImport("ajv/dist/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ajv/dist/compile", "SchemaEnv")
  @js.native
  open class SchemaEnv protected ()
    extends StObject
       with SchemaEnvArgs {
    def this(env: SchemaEnvArgs) = this()
    
    @JSName("$async")
    val $async: js.UndefOr[Boolean] = js.native
    
    @JSName("baseId")
    var baseId_SchemaEnv: String = js.native
    
    val dynamicAnchors: /* import warning: importer.ImportType#apply Failed type conversion: {[ Ref in string ]:? true} */ js.Any = js.native
    
    var parse: js.UndefOr[js.Function1[/* data */ String, Any]] = js.native
    
    var parseName: js.UndefOr[ValueScopeName] = js.native
    
    val refs: SchemaRefs = js.native
    
    @JSName("root")
    val root_SchemaEnv: SchemaEnv = js.native
    
    /* CompleteClass */
    override val schema: AnySchema = js.native
    
    var serialize: js.UndefOr[js.Function1[/* data */ Any, String]] = js.native
    
    var serializeName: js.UndefOr[ValueScopeName] = js.native
    
    var validate: js.UndefOr[AnyValidateFunction[Any]] = js.native
    
    var validateName: js.UndefOr[ValueScopeName] = js.native
  }
  
  inline def compileSchema(sch: SchemaEnv): SchemaEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("compileSchema")(sch.asInstanceOf[js.Any]).asInstanceOf[SchemaEnv]
  
  inline def getCompilingSchema(schEnv: SchemaEnv): SchemaEnv | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilingSchema")(schEnv.asInstanceOf[js.Any]).asInstanceOf[SchemaEnv | Unit]
  
  inline def resolveRef(root: SchemaEnv, baseId: String, ref: String): js.UndefOr[AnySchema | SchemaEnv] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveRef")(root.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[AnySchema | SchemaEnv]]
  
  inline def resolveSchema(
    root: SchemaEnv,
    // root object with properties schema, refs TODO below SchemaEnv is assigned to it
  ref: String
  ): js.UndefOr[SchemaEnv] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSchema")(root.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SchemaEnv]]
  
  trait SchemaCxt extends StObject {
    
    val ValidationError: js.UndefOr[Name] = js.undefined
    
    val allErrors: js.UndefOr[Boolean] = js.undefined
    
    var baseId: String
    
    val compositeRule: js.UndefOr[Boolean] = js.undefined
    
    val createErrors: js.UndefOr[Boolean] = js.undefined
    
    val data: Name
    
    val dataLevel: Double
    
    val dataNames: js.Array[Name]
    
    val dataPathArr: js.Array[Code | Double]
    
    var dataTypes: js.Array[JSONType]
    
    var definedProperties: Set[String]
    
    val errSchemaPath: String
    
    val errorPath: Code
    
    var evaluated: js.UndefOr[Name] = js.undefined
    
    val gen: CodeGen
    
    var items: js.UndefOr[EvaluatedItems | Name] = js.undefined
    
    var jtdDiscriminator: js.UndefOr[String] = js.undefined
    
    var jtdMetadata: js.UndefOr[Boolean] = js.undefined
    
    val opts: InstanceOptions
    
    val parentData: Name
    
    val parentDataProperty: Code | Double
    
    val propertyName: js.UndefOr[Name] = js.undefined
    
    var props: js.UndefOr[EvaluatedProperties | Name] = js.undefined
    
    val rootId: String
    
    val schema: AnySchema
    
    val schemaEnv: SchemaEnv
    
    val schemaPath: Code
    
    val self: default
    
    val topSchemaRef: Code
    
    val validateName: Name
  }
  object SchemaCxt {
    
    inline def apply(
      baseId: String,
      data: Name,
      dataLevel: Double,
      dataNames: js.Array[Name],
      dataPathArr: js.Array[Code | Double],
      dataTypes: js.Array[JSONType],
      definedProperties: Set[String],
      errSchemaPath: String,
      errorPath: Code,
      gen: CodeGen,
      opts: InstanceOptions,
      parentData: Name,
      parentDataProperty: Code | Double,
      rootId: String,
      schema: AnySchema,
      schemaEnv: SchemaEnv,
      schemaPath: Code,
      self: default,
      topSchemaRef: Code,
      validateName: Name
    ): SchemaCxt = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataLevel = dataLevel.asInstanceOf[js.Any], dataNames = dataNames.asInstanceOf[js.Any], dataPathArr = dataPathArr.asInstanceOf[js.Any], dataTypes = dataTypes.asInstanceOf[js.Any], definedProperties = definedProperties.asInstanceOf[js.Any], errSchemaPath = errSchemaPath.asInstanceOf[js.Any], errorPath = errorPath.asInstanceOf[js.Any], gen = gen.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], parentData = parentData.asInstanceOf[js.Any], parentDataProperty = parentDataProperty.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaEnv = schemaEnv.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], topSchemaRef = topSchemaRef.asInstanceOf[js.Any], validateName = validateName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaCxt]
    }
    
    extension [Self <: SchemaCxt](x: Self) {
      
      inline def setAllErrors(value: Boolean): Self = StObject.set(x, "allErrors", value.asInstanceOf[js.Any])
      
      inline def setAllErrorsUndefined: Self = StObject.set(x, "allErrors", js.undefined)
      
      inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      inline def setCompositeRule(value: Boolean): Self = StObject.set(x, "compositeRule", value.asInstanceOf[js.Any])
      
      inline def setCompositeRuleUndefined: Self = StObject.set(x, "compositeRule", js.undefined)
      
      inline def setCreateErrors(value: Boolean): Self = StObject.set(x, "createErrors", value.asInstanceOf[js.Any])
      
      inline def setCreateErrorsUndefined: Self = StObject.set(x, "createErrors", js.undefined)
      
      inline def setData(value: Name): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataLevel(value: Double): Self = StObject.set(x, "dataLevel", value.asInstanceOf[js.Any])
      
      inline def setDataNames(value: js.Array[Name]): Self = StObject.set(x, "dataNames", value.asInstanceOf[js.Any])
      
      inline def setDataNamesVarargs(value: Name*): Self = StObject.set(x, "dataNames", js.Array(value*))
      
      inline def setDataPathArr(value: js.Array[Code | Double]): Self = StObject.set(x, "dataPathArr", value.asInstanceOf[js.Any])
      
      inline def setDataPathArrVarargs(value: (Code | Double)*): Self = StObject.set(x, "dataPathArr", js.Array(value*))
      
      inline def setDataTypes(value: js.Array[JSONType]): Self = StObject.set(x, "dataTypes", value.asInstanceOf[js.Any])
      
      inline def setDataTypesVarargs(value: JSONType*): Self = StObject.set(x, "dataTypes", js.Array(value*))
      
      inline def setDefinedProperties(value: Set[String]): Self = StObject.set(x, "definedProperties", value.asInstanceOf[js.Any])
      
      inline def setErrSchemaPath(value: String): Self = StObject.set(x, "errSchemaPath", value.asInstanceOf[js.Any])
      
      inline def setErrorPath(value: Code): Self = StObject.set(x, "errorPath", value.asInstanceOf[js.Any])
      
      inline def setEvaluated(value: Name): Self = StObject.set(x, "evaluated", value.asInstanceOf[js.Any])
      
      inline def setEvaluatedUndefined: Self = StObject.set(x, "evaluated", js.undefined)
      
      inline def setGen(value: CodeGen): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
      
      inline def setItems(value: EvaluatedItems | Name): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setJtdDiscriminator(value: String): Self = StObject.set(x, "jtdDiscriminator", value.asInstanceOf[js.Any])
      
      inline def setJtdDiscriminatorUndefined: Self = StObject.set(x, "jtdDiscriminator", js.undefined)
      
      inline def setJtdMetadata(value: Boolean): Self = StObject.set(x, "jtdMetadata", value.asInstanceOf[js.Any])
      
      inline def setJtdMetadataUndefined: Self = StObject.set(x, "jtdMetadata", js.undefined)
      
      inline def setOpts(value: InstanceOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      inline def setParentData(value: Name): Self = StObject.set(x, "parentData", value.asInstanceOf[js.Any])
      
      inline def setParentDataProperty(value: Code | Double): Self = StObject.set(x, "parentDataProperty", value.asInstanceOf[js.Any])
      
      inline def setPropertyName(value: Name): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setProps(value: EvaluatedProperties | Name): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRootId(value: String): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      inline def setSchema(value: AnySchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaEnv(value: SchemaEnv): Self = StObject.set(x, "schemaEnv", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: Code): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setSelf(value: default): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
      
      inline def setTopSchemaRef(value: Code): Self = StObject.set(x, "topSchemaRef", value.asInstanceOf[js.Any])
      
      inline def setValidateName(value: Name): Self = StObject.set(x, "validateName", value.asInstanceOf[js.Any])
      
      inline def setValidationError(value: Name): Self = StObject.set(x, "ValidationError", value.asInstanceOf[js.Any])
      
      inline def setValidationErrorUndefined: Self = StObject.set(x, "ValidationError", js.undefined)
    }
  }
  
  trait SchemaEnvArgs extends StObject {
    
    val baseId: js.UndefOr[String] = js.undefined
    
    val localRefs: js.UndefOr[LocalRefs] = js.undefined
    
    val meta: js.UndefOr[Boolean] = js.undefined
    
    val root: js.UndefOr[SchemaEnv] = js.undefined
    
    val schema: AnySchema
    
    val schemaId: js.UndefOr[$id | id] = js.undefined
    
    val schemaPath: js.UndefOr[String] = js.undefined
  }
  object SchemaEnvArgs {
    
    inline def apply(schema: AnySchema): SchemaEnvArgs = {
      val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaEnvArgs]
    }
    
    extension [Self <: SchemaEnvArgs](x: Self) {
      
      inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
      
      inline def setBaseIdUndefined: Self = StObject.set(x, "baseId", js.undefined)
      
      inline def setLocalRefs(value: LocalRefs): Self = StObject.set(x, "localRefs", value.asInstanceOf[js.Any])
      
      inline def setLocalRefsUndefined: Self = StObject.set(x, "localRefs", js.undefined)
      
      inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setRoot(value: SchemaEnv): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSchema(value: AnySchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaId(value: $id | id): Self = StObject.set(x, "schemaId", value.asInstanceOf[js.Any])
      
      inline def setSchemaIdUndefined: Self = StObject.set(x, "schemaId", js.undefined)
      
      inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setSchemaPathUndefined: Self = StObject.set(x, "schemaPath", js.undefined)
    }
  }
  
  trait SchemaObjCxt
    extends StObject
       with SchemaCxt {
    
    @JSName("schema")
    val schema_SchemaObjCxt: AnySchemaObject
  }
  object SchemaObjCxt {
    
    inline def apply(
      baseId: String,
      data: Name,
      dataLevel: Double,
      dataNames: js.Array[Name],
      dataPathArr: js.Array[Code | Double],
      dataTypes: js.Array[JSONType],
      definedProperties: Set[String],
      errSchemaPath: String,
      errorPath: Code,
      gen: CodeGen,
      opts: InstanceOptions,
      parentData: Name,
      parentDataProperty: Code | Double,
      rootId: String,
      schema: AnySchemaObject,
      schemaEnv: SchemaEnv,
      schemaPath: Code,
      self: default,
      topSchemaRef: Code,
      validateName: Name
    ): SchemaObjCxt = {
      val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataLevel = dataLevel.asInstanceOf[js.Any], dataNames = dataNames.asInstanceOf[js.Any], dataPathArr = dataPathArr.asInstanceOf[js.Any], dataTypes = dataTypes.asInstanceOf[js.Any], definedProperties = definedProperties.asInstanceOf[js.Any], errSchemaPath = errSchemaPath.asInstanceOf[js.Any], errorPath = errorPath.asInstanceOf[js.Any], gen = gen.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], parentData = parentData.asInstanceOf[js.Any], parentDataProperty = parentDataProperty.asInstanceOf[js.Any], rootId = rootId.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaEnv = schemaEnv.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any], topSchemaRef = topSchemaRef.asInstanceOf[js.Any], validateName = validateName.asInstanceOf[js.Any])
      __obj.asInstanceOf[SchemaObjCxt]
    }
    
    extension [Self <: SchemaObjCxt](x: Self) {
      
      inline def setSchema(value: AnySchemaObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Ref in string ]:? ajv.ajv/dist/compile.SchemaEnv | ajv.ajv/dist/types.AnySchema}
    }}}
    */
  @js.native
  trait SchemaRefs extends StObject
}
