package typings.apolloDashLinkDashError

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.apolloDashLink.libTypesMod.FetchResult
import typings.apolloDashLink.libTypesMod.NextLink
import typings.apolloDashLink.libTypesMod.Operation
import typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod.ErrorLink.ErrorHandler
import typings.apolloDashLinkDashError.apolloDashLinkDashErrorMod.ErrorResponse
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

@JSImport("apollo-link-error", JSImport.Namespace)
@js.native
object apolloDashLinkDashErrorMod extends js.Object {
  @js.native
  class ErrorLink protected () extends ApolloLink {
    def this(errorHandler: ErrorHandler) = this()
    var link: js.Any = js.native
  }
  
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
  
  def onError(errorHandler: ErrorHandler): ApolloLink = js.native
  @js.native
  object ErrorLink extends js.Object {
    type ErrorHandler = js.Function1[
        /* error */ ErrorResponse, 
        (Observable[
          FetchResult[StringDictionary[js.Any], Record[String, js.Any], Record[String, js.Any]]
        ]) | Unit
      ]
  }
  
}

