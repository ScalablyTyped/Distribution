package typings.apolloServerExpress.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMerge.mergeSchemasMod.MergeSchemasConfig
import typings.graphqlToolsUtils.interfacesMod.IResolvers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "mergeSchemasAsync")
@js.native
object mergeSchemasAsync extends js.Object {
  def apply(config: MergeSchemasConfig[IResolvers[_, _, Record[String, _], _]]): js.Promise[GraphQLSchema] = js.native
}

