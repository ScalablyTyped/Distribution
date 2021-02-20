package typings.angularCore

import typings.typescript.mod.Node
import typings.typescript.mod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodesMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/nodes", "closestNode")
  @js.native
  def closestNode[T /* <: Node */](node: Node, kind: SyntaxKind): T | Null = js.native
  
  @JSImport("@angular/core/schematics/utils/typescript/nodes", "hasModifier")
  @js.native
  def hasModifier(node: Node, modifierKind: SyntaxKind): Boolean = js.native
}
