package typings.angularCore

import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Identifier
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classDeclarationMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/class_declaration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findParentClassDeclaration(node: Node): ClassDeclaration | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findParentClassDeclaration")(node.asInstanceOf[js.Any]).asInstanceOf[ClassDeclaration | Null]
  
  @scala.inline
  def getBaseTypeIdentifiers(node: ClassDeclaration): js.Array[Identifier] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseTypeIdentifiers")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[Identifier] | Null]
  
  @scala.inline
  def hasExplicitConstructor(node: ClassDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasExplicitConstructor")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
