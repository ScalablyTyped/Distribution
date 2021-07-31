package typings.angularCore

import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodesMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/nodes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def closestNode[T /* <: Node */](node: Node, kind: SyntaxKind): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("closestNode")(node.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  @scala.inline
  def hasModifier(node: Node, modifierKind: SyntaxKind): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasModifier")(node.asInstanceOf[js.Any], modifierKind.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
