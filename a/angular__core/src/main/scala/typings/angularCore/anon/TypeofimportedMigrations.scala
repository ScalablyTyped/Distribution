package typings.angularCore.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.angularCompilerCli.privateMigrationsMod.PartialEvaluator
import typings.angularCompilerCli.privateMigrationsMod.StaticInterpreter
import typings.angularCompilerCli.privateMigrationsMod.TypeScriptReflectionHost
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcDynamicMod.DynamicValue
import typings.angularCompilerCli.srcNgtscPartialEvaluatorSrcResultMod.ResolvedValue
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ReflectionHost
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
    typings.angularCompilerCli.privateMigrationsMod.PartialEvaluator
  ]
  
  var Reference: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
    typings.angularCompilerCli.privateMigrationsMod.Reference[Node]
  ]
  
  var StaticInterpreter: Instantiable2[
    /* host */ ReflectionHost, 
    /* checker */ TypeChecker, 
    typings.angularCompilerCli.privateMigrationsMod.StaticInterpreter
  ]
  
  var TypeScriptReflectionHost: Instantiable1[
    /* checker */ TypeChecker, 
    typings.angularCompilerCli.privateMigrationsMod.TypeScriptReflectionHost
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
      typings.angularCompilerCli.privateMigrationsMod.Reference[Node]
    ],
    StaticInterpreter: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, StaticInterpreter],
    TypeScriptReflectionHost: Instantiable1[/* checker */ TypeChecker, TypeScriptReflectionHost],
    forwardRefResolver: (Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression], CallExpression, js.Function1[/* expr */ Expression, ResolvedValue], DynamicValue[Any]) => ResolvedValue,
    reflectObjectLiteral: ObjectLiteralExpression => Map[String, Expression]
  ): TypeofimportedMigrations = {
    val __obj = js.Dynamic.literal(DynamicValue = DynamicValue.asInstanceOf[js.Any], PartialEvaluator = PartialEvaluator.asInstanceOf[js.Any], Reference = Reference.asInstanceOf[js.Any], StaticInterpreter = StaticInterpreter.asInstanceOf[js.Any], TypeScriptReflectionHost = TypeScriptReflectionHost.asInstanceOf[js.Any], forwardRefResolver = js.Any.fromFunction4(forwardRefResolver), reflectObjectLiteral = js.Any.fromFunction1(reflectObjectLiteral))
    __obj.asInstanceOf[TypeofimportedMigrations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofimportedMigrations] (val x: Self) extends AnyVal {
    
    inline def setDynamicValue(value: TypeofDynamicValue): Self = StObject.set(x, "DynamicValue", value.asInstanceOf[js.Any])
    
    inline def setForwardRefResolver(
      value: (Reference[FunctionDeclaration | MethodDeclaration | FunctionExpression], CallExpression, js.Function1[/* expr */ Expression, ResolvedValue], DynamicValue[Any]) => ResolvedValue
    ): Self = StObject.set(x, "forwardRefResolver", js.Any.fromFunction4(value))
    
    inline def setPartialEvaluator(value: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, PartialEvaluator]): Self = StObject.set(x, "PartialEvaluator", value.asInstanceOf[js.Any])
    
    inline def setReference(
      value: Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam T */ /* node */ Any, 
          typings.angularCompilerCli.privateMigrationsMod.Reference[Node]
        ]
    ): Self = StObject.set(x, "Reference", value.asInstanceOf[js.Any])
    
    inline def setReflectObjectLiteral(value: ObjectLiteralExpression => Map[String, Expression]): Self = StObject.set(x, "reflectObjectLiteral", js.Any.fromFunction1(value))
    
    inline def setStaticInterpreter(value: Instantiable2[/* host */ ReflectionHost, /* checker */ TypeChecker, StaticInterpreter]): Self = StObject.set(x, "StaticInterpreter", value.asInstanceOf[js.Any])
    
    inline def setTypeScriptReflectionHost(value: Instantiable1[/* checker */ TypeChecker, TypeScriptReflectionHost]): Self = StObject.set(x, "TypeScriptReflectionHost", value.asInstanceOf[js.Any])
  }
}
