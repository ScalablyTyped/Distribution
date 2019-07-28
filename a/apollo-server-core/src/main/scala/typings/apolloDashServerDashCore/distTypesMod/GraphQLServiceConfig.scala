package typings.apolloDashServerDashCore.distTypesMod

import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.document
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.operation
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.operationName
import typings.apolloDashServerDashCore.apolloDashServerDashCoreStrings.queryHash
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLExecutionResult
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLExecutor
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.ValueOrPromise
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.WithRequired
import typings.graphql.graphqlMod.GraphQLSchema
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

