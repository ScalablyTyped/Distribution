package typings.angularCompilerCli

import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscReflectionSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/reflection/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNamedClassDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationClassDecl */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationClassDecl */ Boolean]
  
  inline def isNamedFunctionDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationFunctionD */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedFunctionDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationFunctionD */ Boolean]
  
  inline def isNamedVariableDeclaration(node: Node): /* is @angular/compiler-cli.anon.ClassDeclarationVariableD */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedVariableDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.anon.ClassDeclarationVariableD */ Boolean]
}
