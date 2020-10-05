package typings.angularCore

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.std.Set
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/ng_declaration_collector", JSImport.Namespace)
@js.native
object ngDeclarationCollectorMod extends js.Object {
  @js.native
  class NgDeclarationCollector protected () extends js.Object {
    def this(
      typeChecker: TypeChecker,
      evaluator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialEvaluator */ js.Any
    ) = this()
    var _visitClassDeclaration: js.Any = js.native
    var _visitNgModuleDecorator: js.Any = js.native
    /** List of resolved directives which are decorated. */
    var decoratedDirectives: js.Array[ClassDeclaration] = js.native
    /** List of resolved providers which are decorated. */
    var decoratedProviders: js.Array[ClassDeclaration] = js.native
    var evaluator: js.Any = js.native
    var typeChecker: TypeChecker = js.native
    /** Set of resolved Angular declarations which are not decorated. */
    var undecoratedDeclarations: Set[ClassDeclaration] = js.native
    def visitNode(node: Node): Unit = js.native
  }
  
  def getNgClassDecorators(node: ClassDeclaration, typeChecker: TypeChecker): js.Array[NgDecorator] = js.native
  def hasDirectiveDecorator(node: ClassDeclaration, typeChecker: TypeChecker): Boolean = js.native
  def hasDirectiveDecorator(node: ClassDeclaration, typeChecker: TypeChecker, ngDecorators: js.Array[NgDecorator]): Boolean = js.native
  def hasInjectableDecorator(node: ClassDeclaration, typeChecker: TypeChecker): Boolean = js.native
  def hasInjectableDecorator(node: ClassDeclaration, typeChecker: TypeChecker, ngDecorators: js.Array[NgDecorator]): Boolean = js.native
  def hasNgDeclarationDecorator(node: ClassDeclaration, typeChecker: TypeChecker): Boolean = js.native
}

