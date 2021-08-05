package typings.ajv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordDefinition extends StObject {
  
  @JSName("$data")
  var $data: js.UndefOr[Boolean] = js.undefined
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var compile: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      ValidateFunction
    ]
  ] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  var errors: js.UndefOr[Boolean | String] = js.undefined
  
  var `inline`: js.UndefOr[
    js.Function4[
      /* it */ CompilationContext, 
      /* keyword */ String, 
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      String
    ]
  ] = js.undefined
  
  var `macro`: js.UndefOr[
    js.Function3[
      /* schema */ js.Any, 
      /* parentSchema */ js.Object, 
      /* it */ CompilationContext, 
      js.Object | Boolean
    ]
  ] = js.undefined
  
  var metaSchema: js.UndefOr[js.Object] = js.undefined
  
  var modifying: js.UndefOr[Boolean] = js.undefined
  
  // schema: false makes validate not to expect schema (ValidateFunction)
  var schema: js.UndefOr[Boolean] = js.undefined
  
  var statements: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var valid: js.UndefOr[Boolean] = js.undefined
  
  // one and only one of the following properties should be present
  var validate: js.UndefOr[SchemaValidateFunction | ValidateFunction] = js.undefined
}
object KeywordDefinition {
  
  inline def apply(): KeywordDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeywordDefinition]
  }
  
  extension [Self <: KeywordDefinition](x: Self) {
    
    inline def set$data(value: Boolean): Self = StObject.set(x, "$data", value.asInstanceOf[js.Any])
    
    inline def set$dataUndefined: Self = StObject.set(x, "$data", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCompile(
      value: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => ValidateFunction
    ): Self = StObject.set(x, "compile", js.Any.fromFunction3(value))
    
    inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    inline def setErrors(value: Boolean | String): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setInline(
      value: (/* it */ CompilationContext, /* keyword */ String, /* schema */ js.Any, /* parentSchema */ js.Object) => String
    ): Self = StObject.set(x, "inline", js.Any.fromFunction4(value))
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setMacro(
      value: (/* schema */ js.Any, /* parentSchema */ js.Object, /* it */ CompilationContext) => js.Object | Boolean
    ): Self = StObject.set(x, "macro", js.Any.fromFunction3(value))
    
    inline def setMacroUndefined: Self = StObject.set(x, "macro", js.undefined)
    
    inline def setMetaSchema(value: js.Object): Self = StObject.set(x, "metaSchema", value.asInstanceOf[js.Any])
    
    inline def setMetaSchemaUndefined: Self = StObject.set(x, "metaSchema", js.undefined)
    
    inline def setModifying(value: Boolean): Self = StObject.set(x, "modifying", value.asInstanceOf[js.Any])
    
    inline def setModifyingUndefined: Self = StObject.set(x, "modifying", js.undefined)
    
    inline def setSchema(value: Boolean): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setStatements(value: Boolean): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValidate(value: SchemaValidateFunction | ValidateFunction): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
