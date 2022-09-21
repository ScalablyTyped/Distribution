package typings.angularCore.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.angularCompilerCli.dynamicMod.DynamicValue
import typings.angularCompilerCli.migrationsMod.PartialEvaluator
import typings.angularCompilerCli.migrationsMod.StaticInterpreter
import typings.angularCompilerCli.migrationsMod.TypeScriptReflectionHost
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.angularCompilerCli.resultMod.ResolvedValue
import typings.angularCompilerCli.srcHostMod.ReflectionHost
import typings.std.Map
import typings.typescript.mod.CallExpression
import typings.typescript.mod.Expression
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.FunctionExpression
import typings.typescript.mod.MethodDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofimportedMigrations extends StObject {
  
  var DynamicValue: TypeofDynamicValue
  
  var PartialEvaluator: Instantiable2[
    /* host */ ReflectionHost, 
    /* checker */ TypeChecker, 
    typings.angularCompilerCli.migrationsMod.PartialEvaluator
  ]
  
  var Reference: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
    typings.angularCompilerCli.migrationsMod.Reference[Node]
  ]
  
  var StaticInterpreter: Instantiable2[
    /* host */ ReflectionHost, 
    /* checker */ TypeChecker, 
    typings.angularCompilerCli.migrationsMod.StaticInterpreter
  ]
  
  var TypeScriptReflectionHost: Instantiable1[
    /* checker */ TypeChecker, 
    typings.angularCompilerCli.migrationsMod.TypeScriptReflectionHost
  ]
  
  def forwardRefResolver(
    fn: Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression],
    callExpr: CallExpression,
    resolve: js.Function1[/* expr */ Expression, ResolvedValue],
    unresolvable: DynamicValue[Any]
  ): ResolvedValue
  
  def reflectObjectLiteral(node: ObjectLiteralExpression): Map[String, Expression]
}
object TypeofimportedMigrations {
  
  inline def apply(
    DynamicValue: TypeofDynamicValue,
    PartialEvaluator: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, PartialEvaluator],
    Reference: Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
      typings.angularCompilerCli.migrationsMod.Reference[Node]
    ],
    StaticInterpreter: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, StaticInterpreter],
    TypeScriptReflectionHost: Instantiable1[/* checker */ TypeChecker, TypeScriptReflectionHost],
    forwardRefResolver: (Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression], CallExpression, js.Function1[/* expr */ Expression, ResolvedValue], DynamicValue[Any]) => ResolvedValue,
    reflectObjectLiteral: ObjectLiteralExpression => Map[String, Expression]
  ): TypeofimportedMigrations = {
    val __obj = js.Dynamic.literal(DynamicValue = DynamicValue.asInstanceOf[js.Any], PartialEvaluator = PartialEvaluator.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], StaticInterpreter = StaticInterpreter.asInstanceOf[js.Any], TypeScriptReflectionHost = TypeScriptReflectionHost.asInstanceOf[js.Any], forwardRefResolver = js.Any.fromFunction4(forwardRefResolver), reflectObjectLiteral = js.Any.fromFunction1(reflectObjectLiteral))
    __obj.asInstanceOf[TypeofimportedMigrations]
  }
  
  extension [Self <: TypeofimportedMigrations](x: Self) {
    
    inline def setDynamicValue(value: TypeofDynamicValue): Self = StObject.set(x, "DynamicValue", value.asInstanceOf[js.Any])
    
    inline def setForwardRefResolver(
      value: (Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression], CallExpression, js.Function1[/* expr */ Expression, ResolvedValue], DynamicValue[Any]) => ResolvedValue
    ): Self = StObject.set(x, "forwardRefResolver", js.Any.fromFunction4(value))
    
    inline def setPartialEvaluator(value: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, PartialEvaluator]): Self = StObject.set(x, "PartialEvaluator", value.asInstanceOf[js.Any])
    
    inline def setReference(
      value: Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
          typings.angularCompilerCli.migrationsMod.Reference[Node]
        ]
    ): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    inline def setReflectObjectLiteral(value: ObjectLiteralExpression => Map[String, Expression]): Self = StObject.set(x, "reflectObjectLiteral", js.Any.fromFunction1(value))
    
    inline def setStaticInterpreter(value: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, StaticInterpreter]): Self = StObject.set(x, "StaticInterpreter", value.asInstanceOf[js.Any])
    
    inline def setTypeScriptReflectionHost(value: Instantiable1[/* checker */ TypeChecker, TypeScriptReflectionHost]): Self = StObject.set(x, "TypeScriptReflectionHost", value.asInstanceOf[js.Any])
  }
}
