package typings.apolloServerExpress.mod

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphqlToolsUtils.anon.SkipPruning
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "healTypes")
@js.native
object healTypes extends js.Object {
  def apply(originalTypeMap: Record[String, GraphQLNamedType | Null], directives: js.Array[GraphQLDirective]): Unit = js.native
  def apply(
    originalTypeMap: Record[String, GraphQLNamedType | Null],
    directives: js.Array[GraphQLDirective],
    config: SkipPruning
  ): Unit = js.native
}

