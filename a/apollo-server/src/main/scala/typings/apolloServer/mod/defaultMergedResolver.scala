package typings.apolloServer.mod

import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "defaultMergedResolver")
@js.native
object defaultMergedResolver extends js.Object {
  def apply(
    parent: Record[String, _],
    args: Record[String, _],
    context: Record[String, _],
    info: GraphQLResolveInfo
  ): js.Any = js.native
}

