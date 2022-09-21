package typings.angularCompilerCli.anon

import typings.std.Set
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreForDiagnostics extends StObject {
  
  var ignoreForDiagnostics: Set[SourceFile]
  
  var ignoreForEmit: Set[SourceFile]
}
object IgnoreForDiagnostics {
  
  inline def apply(ignoreForDiagnostics: Set[SourceFile], ignoreForEmit: Set[SourceFile]): IgnoreForDiagnostics = {
    val __obj = js.Dynamic.literal(ignoreForDiagnostics = ignoreForDiagnostics.asInstanceOf[js.Any], ignoreForEmit = ignoreForEmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreForDiagnostics]
  }
  
  extension [Self <: IgnoreForDiagnostics](x: Self) {
    
    inline def setIgnoreForDiagnostics(value: Set[SourceFile]): Self = StObject.set(x, "ignoreForDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setIgnoreForEmit(value: Set[SourceFile]): Self = StObject.set(x, "ignoreForEmit", value.asInstanceOf[js.Any])
  }
}
