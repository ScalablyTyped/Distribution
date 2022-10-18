package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerDeclarationScopeMod {
  
  trait DeclarationScope[TSharedConstantScope, TExpression] extends StObject {
    
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
    def getConstantScopeRef(expression: TExpression): TSharedConstantScope | Null
  }
  object DeclarationScope {
    
    inline def apply[TSharedConstantScope, TExpression](getConstantScopeRef: TExpression => TSharedConstantScope | Null): DeclarationScope[TSharedConstantScope, TExpression] = {
      val __obj = js.Dynamic.literal(getConstantScopeRef = js.Any.fromFunction1(getConstantScopeRef))
      __obj.asInstanceOf[DeclarationScope[TSharedConstantScope, TExpression]]
    }
    
    extension [Self <: DeclarationScope[?, ?], TSharedConstantScope, TExpression](x: Self & (DeclarationScope[TSharedConstantScope, TExpression])) {
      
      inline def setGetConstantScopeRef(value: TExpression => TSharedConstantScope | Null): Self = StObject.set(x, "getConstantScopeRef", js.Any.fromFunction1(value))
    }
  }
}
