package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import typings.angularCompiler.r3FactoryMod.R3DependencyMetadata
import typings.angularCompiler.render3UtilMod.R3Reference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectableCompiler2Mod {
  
  @JSImport("@angular/compiler/src/injectable_compiler_2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileInjectable(meta: R3InjectableMetadata): InjectableDef = ^.asInstanceOf[js.Dynamic].applyDynamic("compileInjectable")(meta.asInstanceOf[js.Any]).asInstanceOf[InjectableDef]
  
  trait InjectableDef extends StObject {
    
    var expression: Expression
    
    var statements: js.Array[Statement]
    
    var `type`: Type
  }
  object InjectableDef {
    
    inline def apply(expression: Expression, statements: js.Array[Statement], `type`: Type): InjectableDef = {
      val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InjectableDef]
    }
    
    extension [Self <: InjectableDef](x: Self) {
      
      inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value :_*))
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait R3InjectableMetadata extends StObject {
    
    var internalType: Expression
    
    var name: String
    
    var providedIn: Expression
    
    var `type`: R3Reference
    
    var typeArgumentCount: Double
    
    var useClass: js.UndefOr[Expression] = js.undefined
    
    var useExisting: js.UndefOr[Expression] = js.undefined
    
    var useFactory: js.UndefOr[Expression] = js.undefined
    
    var useValue: js.UndefOr[Expression] = js.undefined
    
    var userDeps: js.UndefOr[js.Array[R3DependencyMetadata]] = js.undefined
  }
  object R3InjectableMetadata {
    
    inline def apply(
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
    
    extension [Self <: R3InjectableMetadata](x: Self) {
      
      inline def setInternalType(value: Expression): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProvidedIn(value: Expression): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
      
      inline def setType(value: R3Reference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeArgumentCount(value: Double): Self = StObject.set(x, "typeArgumentCount", value.asInstanceOf[js.Any])
      
      inline def setUseClass(value: Expression): Self = StObject.set(x, "useClass", value.asInstanceOf[js.Any])
      
      inline def setUseClassUndefined: Self = StObject.set(x, "useClass", js.undefined)
      
      inline def setUseExisting(value: Expression): Self = StObject.set(x, "useExisting", value.asInstanceOf[js.Any])
      
      inline def setUseExistingUndefined: Self = StObject.set(x, "useExisting", js.undefined)
      
      inline def setUseFactory(value: Expression): Self = StObject.set(x, "useFactory", value.asInstanceOf[js.Any])
      
      inline def setUseFactoryUndefined: Self = StObject.set(x, "useFactory", js.undefined)
      
      inline def setUseValue(value: Expression): Self = StObject.set(x, "useValue", value.asInstanceOf[js.Any])
      
      inline def setUseValueUndefined: Self = StObject.set(x, "useValue", js.undefined)
      
      inline def setUserDeps(value: js.Array[R3DependencyMetadata]): Self = StObject.set(x, "userDeps", value.asInstanceOf[js.Any])
      
      inline def setUserDepsUndefined: Self = StObject.set(x, "userDeps", js.undefined)
      
      inline def setUserDepsVarargs(value: R3DependencyMetadata*): Self = StObject.set(x, "userDeps", js.Array(value :_*))
    }
  }
}
