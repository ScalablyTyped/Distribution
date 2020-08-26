package typings.apolloServer.exportsMod

import typings.graphql.astMod.ASTNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "compareNodes")
@js.native
object compareNodes extends js.Object {
  def apply(a: ASTNode, b: ASTNode): Double = js.native
  def apply(a: ASTNode, b: ASTNode, customFn: js.Function2[/* a */ js.Any, /* b */ js.Any, Double]): Double = js.native
}

