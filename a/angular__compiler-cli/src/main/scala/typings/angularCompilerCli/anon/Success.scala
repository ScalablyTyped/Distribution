package typings.angularCompilerCli.anon

import typings.angularCompilerCli.angularCompilerCliBooleans.`false`
import typings.angularCompilerCli.ngccSrcPackagesTransformerMod.TransformResult
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success
  extends StObject
     with TransformResult {
  
  var diagnostics: js.Array[Diagnostic]
  
  var success: `false`
}
object Success {
  
  inline def apply(diagnostics: js.Array[Diagnostic]): Success = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], success = false)
    __obj.asInstanceOf[Success]
  }
  
  extension [Self <: Success](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
