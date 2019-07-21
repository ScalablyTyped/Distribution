package typings
package apolloDashServerDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLServiceConfig extends js.Object {
  @JSName("executor")
  var executor_Original: apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLExecutor[stdLib.Record[java.lang.String, _]] = js.native
  var schema: graphqlLib.graphqlMod.GraphQLSchema = js.native
  def executor(
    requestContext: apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.WithRequired[
      apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[stdLib.Record[java.lang.String, _]], 
      apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.document | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.operationName | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.operation | apolloDashServerDashCoreLib.apolloDashServerDashCoreLibStrings.queryHash
    ]
  ): apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.ValueOrPromise[apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLExecutionResult] = js.native
}

