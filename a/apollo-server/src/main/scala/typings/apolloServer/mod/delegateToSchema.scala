package typings.apolloServer.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.IDelegateToSchemaOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "delegateToSchema")
@js.native
object delegateToSchema extends js.Object {
  def apply(options: GraphQLSchema): js.Any = js.native
  def apply(options: IDelegateToSchemaOptions[Record[String, _], Record[String, _]]): js.Any = js.native
}

