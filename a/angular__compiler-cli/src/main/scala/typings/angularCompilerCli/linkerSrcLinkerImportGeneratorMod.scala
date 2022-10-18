package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.ImportGenerator
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.NamedImport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcLinkerImportGeneratorMod {
  
  @JSImport("@angular/compiler-cli/linker/src/linker_import_generator", "LinkerImportGenerator")
  @js.native
  open class LinkerImportGenerator[TExpression] protected ()
    extends StObject
       with ImportGenerator[TExpression] {
    def this(ngImport: TExpression) = this()
    
    /* private */ var assertModuleName: Any = js.native
    
    /* CompleteClass */
    override def generateNamedImport(moduleName: String, originalSymbol: String): NamedImport[TExpression] = js.native
    
    /* CompleteClass */
    override def generateNamespaceImport(moduleName: String): TExpression = js.native
    
    /* private */ var ngImport: Any = js.native
  }
}
