package typings.angularCore

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.std.Set
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngDeclarationCollectorMod {
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/ng_declaration_collector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/ng_declaration_collector", "NgDeclarationCollector")
  @js.native
  class NgDeclarationCollector protected () extends StObject {
    def this(
      typeChecker: TypeChecker,
      evaluator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PartialEvaluator */ js.Any
    ) = this()
    
    /* private */ var _visitClassDeclaration: js.Any = js.native
    
    /* private */ var _visitNgModuleDecorator: js.Any = js.native
    
    /** List of resolved directives which are decorated. */
    var decoratedDirectives: js.Array[ClassDeclaration] = js.native
    
    /** List of resolved providers which are decorated. */
    var decoratedProviders: js.Array[ClassDeclaration] = js.native
    
    /* private */ var evaluator: js.Any = js.native
    
    var typeChecker: TypeChecker = js.native
    
    /** Set of resolved Angular declarations which are not decorated. */
    var undecoratedDeclarations: Set[ClassDeclaration] = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
  
  inline def getNgClassDecorators(node: ClassDeclaration, typeChecker: TypeChecker): js.Array[NgDecorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNgClassDecorators")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[js.Array[NgDecorator]]
  
  inline def hasDirectiveDecorator(node: ClassDeclaration, typeChecker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDirectiveDecorator")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasDirectiveDecorator(node: ClassDeclaration, typeChecker: TypeChecker, ngDecorators: js.Array[NgDecorator]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasDirectiveDecorator")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any], ngDecorators.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasInjectableDecorator(node: ClassDeclaration, typeChecker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasInjectableDecorator")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasInjectableDecorator(node: ClassDeclaration, typeChecker: TypeChecker, ngDecorators: js.Array[NgDecorator]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasInjectableDecorator")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any], ngDecorators.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasNgDeclarationDecorator(node: ClassDeclaration, typeChecker: TypeChecker): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNgDeclarationDecorator")(node.asInstanceOf[js.Any], typeChecker.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
