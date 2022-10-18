package typings.ajv.distTypesMod

import typings.ajv.ajvStrings.full
import typings.ajv.distCompileMod.SchemaObjCxt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FuncKeywordDefinition
  extends StObject
     with KeywordDef
     with KeywordDefinition {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var compile: js.UndefOr[CompileKeywordFunc] = js.undefined
  
  var errors: js.UndefOr[Boolean | full] = js.undefined
  
  var modifying: js.UndefOr[Boolean] = js.undefined
  
  var schema: js.UndefOr[Boolean] = js.undefined
  
  var valid: js.UndefOr[Boolean] = js.undefined
  
  var validate: js.UndefOr[SchemaValidateFunction | DataValidateFunction] = js.undefined
}
object FuncKeywordDefinition {
  
  inline def apply(keyword: String | js.Array[String]): FuncKeywordDefinition = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuncKeywordDefinition]
  }
  
  extension [Self <: FuncKeywordDefinition](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCompile(
      value: (/* schema */ Any, /* parentSchema */ AnySchemaObject, /* it */ SchemaObjCxt) => DataValidateFunction
    ): Self = StObject.set(x, "compile", js.Any.fromFunction3(value))
    
    inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
    
    inline def setErrors(value: Boolean | full): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setModifying(value: Boolean): Self = StObject.set(x, "modifying", value.asInstanceOf[js.Any])
    
    inline def setModifyingUndefined: Self = StObject.set(x, "modifying", js.undefined)
    
    inline def setSchema(value: Boolean): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    
    inline def setValidate(value: SchemaValidateFunction | DataValidateFunction): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
