package typings.apolloServer.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IDefaultValueIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "forEachDefaultValue")
@js.native
object forEachDefaultValue extends js.Object {
  def apply(schema: GraphQLSchema, fn: IDefaultValueIteratorFn): Unit = js.native
}

