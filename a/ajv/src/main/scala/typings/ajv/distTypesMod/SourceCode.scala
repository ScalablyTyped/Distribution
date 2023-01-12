package typings.ajv.distTypesMod

import typings.ajv.distCompileCodegenCodeMod.Code
import typings.ajv.distCompileCodegenMod.ValueScopeName
import typings.ajv.distCompileCodegenScopeMod.ScopeValueSets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCode extends StObject {
  
  var evaluated: js.UndefOr[Code] = js.undefined
  
  var scopeValues: ScopeValueSets
  
  var validateCode: String
  
  var validateName: ValueScopeName
}
object SourceCode {
  
  inline def apply(scopeValues: ScopeValueSets, validateCode: String, validateName: ValueScopeName): SourceCode = {
    val __obj = js.Dynamic.literal(scopeValues = scopeValues.asInstanceOf[js.Any], validateCode = validateCode.asInstanceOf[js.Any], validateName = validateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceCode] (val x: Self) extends AnyVal {
    
    inline def setEvaluated(value: Code): Self = StObject.set(x, "evaluated", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedUndefined: Self = StObject.set(x, "evaluated", js.undefined)
    
    inline def setScopeValues(value: ScopeValueSets): Self = StObject.set(x, "scopeValues", value.asInstanceOf[js.Any])
    
    inline def setValidateCode(value: String): Self = StObject.set(x, "validateCode", value.asInstanceOf[js.Any])
    
    inline def setValidateName(value: ValueScopeName): Self = StObject.set(x, "validateName", value.asInstanceOf[js.Any])
  }
}
