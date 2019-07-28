package typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.apolloDashLink.libTypesMod.NextLink
import typings.apolloDashLink.libTypesMod.Operation
import typings.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod.ServerError
import typings.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod.ServerParseError
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.executionExecuteMod.ExecutionResultDataDefault
import typings.graphql.graphqlMod.GraphQLError
import typings.std.Error
import typings.std.Record
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorResponse extends js.Object {
  @JSName("forward")
  var forward_Original: NextLink = js.native
  var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var networkError: js.UndefOr[Error | ServerError | ServerParseError] = js.native
  var operation: Operation = js.native
  var response: js.UndefOr[ExecutionResult[ExecutionResultDataDefault]] = js.native
  def forward(operation: Operation): Observable[FetchResult[StringDictionary[_], Record[String, _], Record[String, _]]] = js.native
}

