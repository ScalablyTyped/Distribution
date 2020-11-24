package typings.astTypes.pathVisitorMod

import typings.astTypes.typesMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathVisitorStatics extends js.Object {
  
  def fromMethodsObject(): Visitor = js.native
  def fromMethodsObject(methods: js.Any): Visitor = js.native
  
  def visit[M](node: ASTNode): js.Any = js.native
  def visit[M](node: ASTNode, methods: typings.astTypes.visitorMod.Visitor[M]): js.Any = js.native
}
