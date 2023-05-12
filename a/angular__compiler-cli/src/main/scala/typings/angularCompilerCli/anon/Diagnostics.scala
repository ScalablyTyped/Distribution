package typings.angularCompilerCli.anon

import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostics extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
  
  var exitCode: Double
}
object Diagnostics {
  
  inline def apply(diagnostics: js.Array[Diagnostic], exitCode: Double): Diagnostics = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Diagnostics] (val x: Self) extends AnyVal {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
  }
}
