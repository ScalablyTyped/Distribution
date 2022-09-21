package typings.angularDevkitBuildWebpack

import typings.ajv.distTypesMod.ValidateFunction
import typings.angularDevkitBuildWebpack.anon.Context
import typings.angularDevkitBuildWebpack.exceptionMod.BaseException
import typings.angularDevkitBuildWebpack.interfaceMod.SchemaFormat
import typings.angularDevkitBuildWebpack.interfaceMod.SchemaRegistry
import typings.angularDevkitBuildWebpack.interfaceMod.SchemaValidatorError
import typings.angularDevkitBuildWebpack.schemaSchemaMod.JsonSchema
import typings.angularDevkitBuildWebpack.utilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registryMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/json/schema/registry", "CoreSchemaRegistry")
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
    
    /* private */ var _flatten: Any = js.native
    
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
      * @returns An Observable of the Validation function.
      */
    def compile(schema: JsonSchema): Any = js.native
    
    /* private */ var normalizeDataPathArr: Any = js.native
    
    def registerUriHandler(handler: UriHandler): Unit = js.native
  }
  /* static members */
  object CoreSchemaRegistry {
    
    @JSImport("@angular-devkit/build-webpack/core/src/json/schema/registry", "CoreSchemaRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular-devkit/build-webpack/core/src/json/schema/registry", "CoreSchemaRegistry._set")
    @js.native
    def _set: Any = js.native
    inline def _set_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_set")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/json/schema/registry", "SchemaValidationException")
  @js.native
  open class SchemaValidationException () extends BaseException {
    def this(errors: js.Array[SchemaValidatorError]) = this()
    def this(errors: js.Array[SchemaValidatorError], baseMessage: String) = this()
    def this(errors: Unit, baseMessage: String) = this()
    
    val errors: js.Array[SchemaValidatorError] = js.native
  }
  /* static members */
  object SchemaValidationException {
    
    @JSImport("@angular-devkit/build-webpack/core/src/json/schema/registry", "SchemaValidationException")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createMessages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessages")().asInstanceOf[js.Array[String]]
    inline def createMessages(errors: js.Array[SchemaValidatorError]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessages")(errors.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  }
  
  @js.native
  trait UriHandler extends StObject {
    
    def apply(uri: String): js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<JsonObject> */ Any) | js.Promise[JsonObject] | Null
      ] = js.native
  }
}
