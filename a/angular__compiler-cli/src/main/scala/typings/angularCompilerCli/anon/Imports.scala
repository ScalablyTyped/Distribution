package typings.angularCompilerCli.anon

import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Imports extends StObject {
  
  var diagnostics: js.Array[Diagnostic]
  
  var imports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]
}
object Imports {
  
  inline def apply(diagnostics: js.Array[Diagnostic], imports: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Imports = {
    val __obj = js.Dynamic.literal(diagnostics = diagnostics.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imports]
  }
  
  extension [Self <: Imports](x: Self) {
    
    inline def setDiagnostics(value: js.Array[Diagnostic]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsVarargs(value: Diagnostic*): Self = StObject.set(x, "diagnostics", js.Array(value*))
    
    inline def setImports(value: js.Array[Reference[ClassDeclaration[DeclarationNode]]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsVarargs(value: Reference[ClassDeclaration[DeclarationNode]]*): Self = StObject.set(x, "imports", js.Array(value*))
  }
}
