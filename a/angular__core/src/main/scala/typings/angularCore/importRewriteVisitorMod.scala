package typings.angularCore

import typings.angularCompiler.compilerHostMod.AotCompilerHost
import typings.angularCore.importManagerMod.ImportManager
import typings.std.Error
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TransformationContext
import typings.typescript.mod.Transformer
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object importRewriteVisitorMod {
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/import_rewrite_visitor", "ImportRewriteTransformerFactory")
  @js.native
  class ImportRewriteTransformerFactory protected () extends StObject {
    def this(importManager: ImportManager, typeChecker: TypeChecker, compilerHost: AotCompilerHost) = this()
    
    /**
      * Gets the resolved exports of a given source file. Exports are cached
      * for subsequent calls.
      */
    var _getSourceFileExports: js.Any = js.native
    
    var _recordIdentifierReference: js.Any = js.native
    
    /** Rewrites a module import to be relative to the target file location. */
    var _rewriteModuleImport: js.Any = js.native
    
    var compilerHost: js.Any = js.native
    
    def create[T /* <: Node */](ctx: TransformationContext, newSourceFile: SourceFile): Transformer[T] = js.native
    
    var importManager: js.Any = js.native
    
    var sourceFileExports: js.Any = js.native
    
    var typeChecker: js.Any = js.native
  }
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/import_rewrite_visitor", "UnresolvedIdentifierError")
  @js.native
  class UnresolvedIdentifierError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
