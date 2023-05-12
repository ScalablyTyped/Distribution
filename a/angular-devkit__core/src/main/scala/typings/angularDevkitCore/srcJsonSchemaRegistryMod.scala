package typings.angularDevkitCore

import typings.ajv.distTypesMod.ValidateFunction
import typings.angularDevkitCore.anon.Context
import typings.angularDevkitCore.srcExceptionMod.BaseException
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaFormat
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaValidator
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaValidatorError
import typings.angularDevkitCore.srcJsonSchemaSchemaMod.JsonSchema
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJsonSchemaRegistryMod {
  
  @JSImport("@angular-devkit/core/src/json/schema/registry", "CoreSchemaRegistry")
  @js.native
  open class CoreSchemaRegistry ()
    extends StObject
       with SchemaRegistry {
    def this(formats: js.Array[SchemaFormat]) = this()
    
    /* private */ var _ajv: Any = js.native
    
    /* private */ var _applyPrompts: Any = js.native
    
    /* private */ var _applySmartDefaults: Any = js.native
    
    /* private */ var _compile: Any = js.native
    
    /* private */ var _currentCompilationSchemaInfo: Any = js.native
    
    /* private */ var _fetch: Any = js.native
    
    /* private */ var _post: Any = js.native
    
    /* private */ var _pre: Any = js.native
    
    /* private */ var _promptProvider: Any = js.native
    
    /* protected */ def _resolver(ref: String): Context = js.native
    /* protected */ def _resolver(ref: String, validate: ValidateFunction[Any]): Context = js.native
    
    /* private */ var _smartDefaultKeyword: Any = js.native
    
    /* private */ var _sourceMap: Any = js.native
    
    /* private */ var _uriCache: Any = js.native
    
    /* private */ var _uriHandlers: Any = js.native
    
    /**
      * Compile and return a validation function for the Schema.
      *
      * @param schema The schema to validate. If a string, will fetch the schema before compiling it
      * (using schema as a URI).
      */
    def compile(schema: JsonSchema): js.Promise[SchemaValidator] = js.native
    
    /* private */ var normalizeDataPathArr: Any = js.native
    
    def registerUriHandler(handler: UriHandler): Unit = js.native
  }
  /* static members */
  object CoreSchemaRegistry {
    
    @JSImport("@angular-devkit/core/src/json/schema/registry", "CoreSchemaRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/core/src/json/schema/registry", "CoreSchemaRegistry._set")
    @js.native
    def _set: Any = js.native
    inline def _set_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_set")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/core/src/json/schema/registry", "SchemaValidationException")
  @js.native
  open class SchemaValidationException () extends BaseException {
    def this(errors: js.Array[SchemaValidatorError]) = this()
    def this(errors: js.Array[SchemaValidatorError], baseMessage: String) = this()
    def this(errors: Unit, baseMessage: String) = this()
    
    val errors: js.Array[SchemaValidatorError] = js.native
  }
  /* static members */
  object SchemaValidationException {
    
    @JSImport("@angular-devkit/core/src/json/schema/registry", "SchemaValidationException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMessages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessages")().asInstanceOf[js.Array[String]]
    inline def createMessages(errors: js.Array[SchemaValidatorError]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessages")(errors.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type UriHandler = (uri : string): rxjs.rxjs.Observable<@angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject> | std.Promise<@angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject> | null | undefined
  }}}
  to avoid circular code involving: 
  - @angular-devkit/core.@angular-devkit/core/src/json/schema/registry.UriHandler
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject
  - @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonValue
  */
  @js.native
  trait UriHandler extends StObject {
    
    def apply(uri: String): js.UndefOr[Observable_[JsonObject] | js.Promise[JsonObject] | Null] = js.native
  }
}
