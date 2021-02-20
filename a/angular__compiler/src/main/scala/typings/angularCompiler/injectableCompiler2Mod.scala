package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectableCompiler2Mod {
  
  @JSImport("@angular/compiler/src/injectable_compiler_2", "compileInjectable")
  @js.native
  def compileInjectable(meta: R3InjectableMetadata): InjectableDef = js.native
  
  @js.native
  trait InjectableDef extends StObject {
    
    var expression: Expression = js.native
    
    var statements: js.Array[Statement] = js.native
    
    var `type`: Type = js.native
  }
  object InjectableDef {
    
    @scala.inline
    def apply(expression: Expression, statements: js.Array[Statement], `type`: Type): InjectableDef = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectableDef]
    }
    
    @scala.inline
    implicit class InjectableDefMutableBuilder[Self <: InjectableDef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait R3InjectableMetadata extends StObject {
    
    var internalType: Expression = js.native
    
    var name: String = js.native
    
    var providedIn: Expression = js.native
    
    var `type`: R3Reference = js.native
    
    var typeArgumentCount: Double = js.native
    
    var useClass: js.UndefOr[Expression] = js.native
    
    var useExisting: js.UndefOr[Expression] = js.native
    
    var useFactory: js.UndefOr[Expression] = js.native
    
    var useValue: js.UndefOr[Expression] = js.native
    
    var userDeps: js.UndefOr[js.Array[R3DependencyMetadata]] = js.native
  }
  object R3InjectableMetadata {
    
    @scala.inline
    def apply(
      internalType: Expression,
      name: String,
      providedIn: Expression,
      `type`: R3Reference,
      typeArgumentCount: Double
    ): R3InjectableMetadata = {
      val __obj = js.Dynamic.literal(internalType = internalType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providedIn = providedIn.asInstanceOf[js.Any], typeArgumentCount = typeArgumentCount.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[R3InjectableMetadata]
    }
    
    @scala.inline
    implicit class R3InjectableMetadataMutableBuilder[Self <: R3InjectableMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidedIn(value: Expression): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseClass(value: Expression): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
      
      @scala.inline
      def setUseExisting(value: Expression): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
      
      @scala.inline
      def setUseFactory(value: Expression): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
      
      @scala.inline
      def setUseValue(value: Expression): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
      
      @scala.inline
      def setUserDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "userDeps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserDepsUndefined: Self = StObject.set(x, "userDeps", js.undefined)
      
      @scala.inline
      def setUserDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "userDeps", js.Array(value :_*))
    }
  }
}
