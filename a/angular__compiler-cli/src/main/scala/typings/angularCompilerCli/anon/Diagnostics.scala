package typings.angularCompilerCli.anon

import typings.angularCompilerCli.angularCompilerCliBooleans.`true`
import typings.angularCompilerCli.ngccSrcPackagesTransformerMod.TransformResult
import typings.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diagnostics
  extends StObject
     with TransformResult {
  
  var diagnostics: js.Array[Diagnostic]
  
  var success: `true`
  
  var transformedFiles: js.Array[FileToWrite]
}
object Diagnostics {
  
  inline def apply(diagnostics: js.Array[Diagnostic], transformedFiles: js.Array[FileToWrite]): Diagnostics = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], success = true, transformedFiles = transformedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diagnostics]
  }
  
  extension [Self <: Diagnostics](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTransformedFiles(value: js.Array[FileToWrite]): Self = StObject.set(x, "transformedFiles", value.asInstanceOf[js.Any])
    
    inline def setTransformedFilesVarargs(value: FileToWrite*): Self = StObject.set(x, "transformedFiles", js.Array(value*))
  }
}
