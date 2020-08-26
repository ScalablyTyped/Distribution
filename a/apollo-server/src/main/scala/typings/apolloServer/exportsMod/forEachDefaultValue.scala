package typings.apolloServer.exportsMod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.IDefaultValueIteratorFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "forEachDefaultValue")
@js.native
object forEachDefaultValue extends js.Object {
  def apply(schema: GraphQLSchema, fn: IDefaultValueIteratorFn): Unit = js.native
}

