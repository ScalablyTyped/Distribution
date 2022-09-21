package typings.angularCompilerCli

import typings.angularCompilerCli.declarationScopeMod.DeclarationScope
import typings.babelTypes.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelDeclarationScopeMod {
  
  @JSImport("@angular/compiler-cli/linker/babel/src/babel_declaration_scope", "BabelDeclarationScope")
  @js.native
  open class BabelDeclarationScope protected ()
    extends StObject
       with DeclarationScope[ConstantScopePath, Expression] {
    /**
      * Construct a new `BabelDeclarationScope`.
      *
      * @param declarationScope the Babel scope containing the declaration call expression.
      */
    def this(declarationScope: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scope */ Any) = this()
    
    /* private */ var declarationScope: Any = js.native
    
    /**
      * Get a `TSharedConstantScope` object that can be used to reference the lexical scope where any
      * shared constant statements would be inserted.
      *
      * This object is generic because different AST implementations will need different
      * `TConstantScope` types to be able to insert shared constant statements. For example in Babel
      * this would be a `NodePath` object; in TS it would just be a `Node` object.
      *
      * If it is not possible to find such a shared scope, then constant statements will be wrapped up
      * with their generated linked definition expression, in the form of an IIFE.
      *
      * @param expression the expression that points to the Angular core framework import.
      * @returns a reference to a reference object for where the shared constant statements will be
      *     inserted, or `null` if it is not possible to have a shared scope.
      */
    /* CompleteClass */
    override def getConstantScopeRef(expression: Expression): ConstantScopePath | Null = js.native
  }
  
  type ConstantScopePath = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodePath<t.FunctionDeclaration> */ Any
}
