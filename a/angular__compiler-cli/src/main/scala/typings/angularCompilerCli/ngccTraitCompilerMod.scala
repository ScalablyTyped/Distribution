package typings.angularCompilerCli

import typings.angularCompilerCli.ngccHostMod.NgccReflectionHost
import typings.angularCompilerCli.ngtscTransformMod.TraitCompiler
import typings.angularCompilerCli.semanticGraphMod.SemanticSymbol
import typings.angularCompilerCli.srcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcHostMod.DeclarationNode
import typings.angularCompilerCli.srcHostMod.Decorator
import typings.angularCompilerCli.traitMod.Trait
import typings.angularCompilerCli.transformSrcApiMod.DecoratorHandler
import typings.angularCompilerCli.transformSrcApiMod.HandlerFlags
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccTraitCompilerMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/analysis/ngcc_trait_compiler", "NgccTraitCompiler")
  @js.native
  open class NgccTraitCompiler protected () extends TraitCompiler {
    def this(
      handlers: js.Array[DecoratorHandler[Any, Any, SemanticSymbol | Null, Any]],
      ngccReflector: NgccReflectionHost
    ) = this()
    
    /**
      * Analyzes the source file in search for classes to process. For any class that is found in the
      * file, a `ClassRecord` is created and the source file is included in the `analyzedFiles` array.
      */
    def analyzeFile(sf: SourceFile): Unit = js.native
    
    def analyzedFiles: js.Array[SourceFile] = js.native
    
    /**
      * Returns all decorators that have been recognized for the provided class, including any
      * synthetically injected decorators.
      * @param clazz the declaration for which the decorators are returned.
      */
    def getAllDecorators(clazz: ClassDeclaration[DeclarationNode]): js.Array[Decorator] | Null = js.native
    
    /**
      * Associate a new synthesized decorator, which did not appear in the original source, with a
      * given class.
      * @param clazz the class to receive the new decorator.
      * @param decorator the decorator to inject.
      * @param flags optional bitwise flag to influence the compilation of the decorator.
      */
    def injectSyntheticDecorator(clazz: ClassDeclaration[DeclarationNode], decorator: Decorator): js.Array[Trait[Any, Any, SemanticSymbol | Null, Any]] = js.native
    def injectSyntheticDecorator(clazz: ClassDeclaration[DeclarationNode], decorator: Decorator, flags: HandlerFlags): js.Array[Trait[Any, Any, SemanticSymbol | Null, Any]] = js.native
    
    /* private */ var ngccReflector: Any = js.native
  }
}
