package typings.apolloServer.exportsMod

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphqlToolsUtils.anon.Directives
import typings.graphqlToolsUtils.anon.SkipPruning
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "rewireTypes")
@js.native
object rewireTypes extends js.Object {
  def apply(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Directives = js.native
  def apply(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    options: SkipPruning
  ): Directives = js.native
}

