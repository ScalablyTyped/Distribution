package typings.angularCompilerCli

import typings.angularCompilerCli.anon.Decorators
import typings.angularCompilerCli.anon.From
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMember
import typings.std.Map
import typings.typescript.mod.Declaration
import typings.typescript.mod.EntityName
import typings.typescript.mod.Expression
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import typings.typescript.mod.ObjectLiteralExpression
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscReflectionMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection", "ClassMemberKind")
  @js.native
  object ClassMemberKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind & Double] = js.native
    
    /* 0 */ val Constructor: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Constructor & Double = js.native
    
    /* 1 */ val Getter: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Getter & Double = js.native
    
    /* 4 */ val Method: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Method & Double = js.native
    
    /* 3 */ val Property: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Property & Double = js.native
    
    /* 2 */ val Setter: typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassMemberKind.Setter & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection", "TypeScriptReflectionHost")
  @js.native
  open class TypeScriptReflectionHost protected ()
    extends typings.angularCompilerCli.srcNgtscReflectionSrcTypescriptMod.TypeScriptReflectionHost {
    def this(checker: TypeChecker) = this()
  }
  
  inline def filterToMembersWithDecorator(members: js.Array[ClassMember], name: String): js.Array[Decorators] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterToMembersWithDecorator")(members.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[Decorators]]
  inline def filterToMembersWithDecorator(members: js.Array[ClassMember], name: String, module: String): js.Array[Decorators] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterToMembersWithDecorator")(members.asInstanceOf[js.Any], name.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[js.Array[Decorators]]
  
  inline def isDecoratorIdentifier(exp: Expression): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DecoratorIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecoratorIdentifier")(exp.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DecoratorIdentifier */ Boolean]
  
  inline def isNamedClassDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationClassDecl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationClassDecl */ Boolean]
  
  inline def isNamedFunctionDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationFunctionD */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedFunctionDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationFunctionD */ Boolean]
  
  inline def isNamedVariableDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationVariableD */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationVariableD */ Boolean]
  
  inline def reflectIdentifierOfDeclaration(decl: Declaration): Identifier | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectIdentifierOfDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[Identifier | Null]
  
  inline def reflectNameOfDeclaration(decl: Declaration): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectNameOfDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def reflectObjectLiteral(node: ObjectLiteralExpression): Map[String, Expression] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectObjectLiteral")(node.asInstanceOf[js.Any]).asInstanceOf[Map[String, Expression]]
  
  inline def reflectTypeEntityToDeclaration(`type`: EntityName, checker: TypeChecker): From = (^.asInstanceOf[js.Dynamic].applyDynamic("reflectTypeEntityToDeclaration")(`type`.asInstanceOf[js.Any], checker.asInstanceOf[js.Any])).asInstanceOf[From]
  
  inline def typeNodeToValueExpr(node: TypeNode): Expression | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("typeNodeToValueExpr")(node.asInstanceOf[js.Any]).asInstanceOf[Expression | Null]
}
