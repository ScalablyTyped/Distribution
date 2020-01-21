package typings.apolloServerCore.typesMod

import typings.apolloServerCore.apolloServerCoreStrings.document
import typings.apolloServerCore.apolloServerCoreStrings.operation
import typings.apolloServerCore.apolloServerCoreStrings.operationName
import typings.apolloServerCore.apolloServerCoreStrings.queryHash
import typings.apolloServerTypes.mod.GraphQLExecutionResult
import typings.apolloServerTypes.mod.GraphQLExecutor
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.apolloServerTypes.mod.ValueOrPromise
import typings.apolloServerTypes.mod.WithRequired
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
  def executor(
    requestContext: WithRequired[
      GraphQLRequestContext[Record[String, _]], 
      document | operationName | operation | queryHash
    ]
  ): ValueOrPromise[GraphQLExecutionResult] = js.native
}

