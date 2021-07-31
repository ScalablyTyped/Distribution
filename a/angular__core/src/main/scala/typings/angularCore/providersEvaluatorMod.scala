package typings.angularCore

import typings.angularCore.anon.Literals
import typings.typescript.mod.Expression
import typings.typescript.mod.ObjectLiteralExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersEvaluatorMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StaticInterpreter * / any */ @JSImport("@angular/core/schematics/migrations/missing-injectable/providers_evaluator", "ProvidersEvaluator")
  @js.native
  class ProvidersEvaluator () extends StObject {
    
    var _providerLiterals: js.Any = js.native
    
    /**
      * Evaluates the given expression and returns its statically resolved value
      * and a list of object literals which define Angular providers.
      */
    def evaluate(expr: Expression): Literals = js.native
    
    def visitObjectLiteralExpression(node: ObjectLiteralExpression, context: js.Any): js.Any = js.native
  }
  
  trait ProviderLiteral extends StObject {
    
    var node: ObjectLiteralExpression
    
    var resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
  }
  object ProviderLiteral {
    
    @scala.inline
    def apply(
      node: ObjectLiteralExpression,
      resolvedValue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
    ): ProviderLiteral = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], resolvedValue = resolvedValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderLiteral]
    }
    
    @scala.inline
    implicit class ProviderLiteralMutableBuilder[Self <: ProviderLiteral] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: ObjectLiteralExpression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvedValue(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResolvedValue */ js.Any
      ): Self = StObject.set(x, "resolvedValue", value.asInstanceOf[js.Any])
    }
  }
}
