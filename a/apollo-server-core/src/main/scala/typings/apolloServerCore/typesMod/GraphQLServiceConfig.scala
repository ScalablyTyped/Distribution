package typings.apolloServerCore.typesMod

import typings.apolloServerTypes.mod.GraphQLExecutionResult
import typings.apolloServerTypes.mod.GraphQLExecutor
import typings.apolloServerTypes.mod.GraphQLRequestContextExecutionDidStart
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLServiceConfig extends js.Object {
  @JSName("executor")
  var executor_Original: GraphQLExecutor[Record[String, _]] = js.native
  var schema: GraphQLSchema = js.native
  def executor(requestContext: GraphQLRequestContextExecutionDidStart[Record[String, _]]): ValueOrPromise[GraphQLExecutionResult] = js.native
}

