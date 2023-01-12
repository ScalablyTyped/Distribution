package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.ImportGenerator
import typings.angularCompilerCli.srcNgtscTranslatorSrcApiImportGeneratorMod.NamedImport
import typings.typescript.mod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorSrcImportManagerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/translator/src/import_manager", "ImportManager")
  @js.native
  open class ImportManager ()
    extends StObject
       with ImportGenerator[Identifier] {
    def this(rewriter: ImportRewriter) = this()
    def this(rewriter: Unit, prefix: String) = this()
    def this(rewriter: ImportRewriter, prefix: String) = this()
    
    /* CompleteClass */
    override def generateNamedImport(moduleName: String, originalSymbol: String): NamedImport[Identifier] = js.native
    
    /* CompleteClass */
    override def generateNamespaceImport(moduleName: String): Identifier = js.native
    
    def getAllImports(contextPath: String): js.Array[Import] = js.native
    
    /* private */ var nextIndex: Any = js.native
    
    /* private */ var prefix: Any = js.native
    
    /* protected */ var rewriter: ImportRewriter = js.native
    
    /* private */ var specifierToIdentifier: Any = js.native
  }
  
  trait Import extends StObject {
    
    /** The `ts.Identifier` by which the imported module is known. */
    var qualifier: Identifier
    
    /** The name of the module that has been imported. */
    var specifier: String
  }
  object Import {
    
    inline def apply(qualifier: Identifier, specifier: String): Import = {
      val __obj = js.Dynamic.literal(qualifier = qualifier.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[Import]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Import] (val x: Self) extends AnyVal {
      
      inline def setQualifier(value: Identifier): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
      
      inline def setSpecifier(value: String): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
    }
  }
}
