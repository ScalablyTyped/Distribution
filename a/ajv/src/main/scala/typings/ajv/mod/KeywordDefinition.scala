package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeywordDefinition extends StObject {
  
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.native
  
  var async: js.UndefOr[Boolean] = js.native
  
  var compile: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      ValidateFunction
    ]
  ] = js.native
  
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  
  var errors: js.UndefOr[Boolean | String] = js.native
  
  var `inline`: js.UndefOr[
    js.Function4[
      /* it */ CompilationContext, 
      /* keyword */ String, 
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      String
    ]
  ] = js.native
  
  var `macro`: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      js.Object | Boolean
    ]
  ] = js.native
  
  var metaSchema: js.UndefOr[js.Object] = js.native
  
  var modifying: js.UndefOr[Boolean] = js.native
  
  // schema: false makes validate not to expect schema (ValidateFunction)
  var schema: js.UndefOr[Boolean] = js.native
  
  var statements: js.UndefOr[Boolean] = js.native
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  
  var valid: js.UndefOr[Boolean] = js.native
  
  // one and only one of the following properties should be present
  var validate: js.UndefOr[SchemaValidateFunction | ValidateFunction] = js.native
}
object KeywordDefinition {
  
  @scala.inline
  def apply(): KeywordDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordDefinition]
  }
  
  @scala.inline
  implicit class KeywordDefinitionMutableBuilder[Self <: KeywordDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$data(value: Boolean): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setCompile(
      value: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => ValidateFunction
    ): Self = StObject.set(x, "compile", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: Boolean | String): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setInline(
      value: (/* it */ CompilationContext, /* keyword */ String, /* schema */ js.Any, /* parentSchema */ js.Object) => String
    ): Self = StObject.set(x, "inline", js.Any.fromFunction4(value))
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setMacro(
      value: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => js.Object | Boolean
    ): Self = StObject.set(x, "macro", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMacroUndefined: Self = StObject.set(x, "macro", js.undefined)
    
    @scala.inline
    def setMetaSchema(value: js.Object): Self = StObject.set(x, "metaSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaSchemaUndefined: Self = StObject.set(x, "metaSchema", js.undefined)
    
    @scala.inline
    def setModifying(value: Boolean): Self = StObject.set(x, "modifying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyingUndefined: Self = StObject.set(x, "modifying", js.undefined)
    
    @scala.inline
    def setSchema(value: Boolean): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setStatements(value: Boolean): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    @scala.inline
    def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    @scala.inline
    def setValidate(value: SchemaValidateFunction | ValidateFunction): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
