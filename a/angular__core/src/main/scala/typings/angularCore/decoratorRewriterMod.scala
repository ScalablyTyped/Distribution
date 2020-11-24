package typings.angularCore

import typings.angularCompiler.mod.AotCompiler
import typings.angularCore.importManagerMod.ImportManager
import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.Decorator
import typings.typescript.mod.ObjectLiteralElementLike
import typings.typescript.mod.SourceFile
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/decorator_rewriter", JSImport.Namespace)
@js.native
object decoratorRewriterMod extends js.Object {
  
  @js.native
  class DecoratorRewriter protected () extends js.Object {
    def this(
      importManager: ImportManager,
      typeChecker: TypeChecker,
      evaluator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialEvaluator */ js.Any,
      compiler: AotCompiler
    ) = this()
    
    /** Creates a new decorator with the given expression. */
    var _createDecorator: js.Any = js.native
    
    /**
      * Sanitizes a metadata property by ensuring that all contained identifiers
      * are imported in the target source file.
      */
    var _sanitizeMetadataProperty: js.Any = js.native
    
    var compiler: js.Any = js.native
    
    var evaluator: js.Any = js.native
    
    var importManager: js.Any = js.native
    
    var importRewriterFactory: js.Any = js.native
    
    var newProperties: js.Array[ObjectLiteralElementLike] = js.native
    
    var newSourceFile: SourceFile | Null = js.native
    
    var nonCopyableProperties: js.Array[ObjectLiteralElementLike] = js.native
    
    var previousSourceFile: SourceFile | Null = js.native
    
    def rewrite(ngDecorator: NgDecorator, newSourceFile: SourceFile): Decorator = js.native
    
    var typeChecker: js.Any = js.native
  }
}
