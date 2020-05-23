package typings.apolloGraphql.mod

import typings.apolloGraphql.anon.PreserveStringAndNumericLiterals
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-graphql", "operationRegistrySignature")
@js.native
object operationRegistrySignature extends js.Object {
  def apply(ast: DocumentNode, operationName: String): String = js.native
  def apply(ast: DocumentNode, operationName: String, options: PreserveStringAndNumericLiterals): String = js.native
}

