package typings.angularCore

import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/utils/typescript/nodes", JSImport.Namespace)
@js.native
object nodesMod extends js.Object {
  
  def closestNode[T /* <: Node */](node: Node, kind: SyntaxKind): T | Null = js.native
  
  def hasModifier(node: Node, modifierKind: SyntaxKind): Boolean = js.native
}
