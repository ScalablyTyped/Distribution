package typings.apolloServer.exportsMod

import typings.graphqlToolsGraphqlTagPluck.mod.GraphQLTagPluckOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "gqlPluckFromCodeStringSync")
@js.native
object gqlPluckFromCodeStringSync extends js.Object {
  def apply(filePath: String, code: String): String = js.native
  def apply(filePath: String, code: String, options: GraphQLTagPluckOptions): String = js.native
}

