package typings.ajv.distTypesMod

import typings.ajv.codeMod.Code
import typings.ajv.codegenMod.ValueScopeName
import typings.ajv.scopeMod.ScopeValueSets
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
  
  extension [Self <: SourceCode](x: Self) {
    
    inline def setEvaluated(value: Code): Self = StObject.set(x, "evaluated", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedUndefined: Self = StObject.set(x, "evaluated", js.undefined)
    
    inline def setScopeValues(value: ScopeValueSets): Self = StObject.set(x, "scopeValues", value.asInstanceOf[js.Any])
    
    inline def setValidateCode(value: String): Self = StObject.set(x, "validateCode", value.asInstanceOf[js.Any])
    
    inline def setValidateName(value: ValueScopeName): Self = StObject.set(x, "validateName", value.asInstanceOf[js.Any])
  }
}
