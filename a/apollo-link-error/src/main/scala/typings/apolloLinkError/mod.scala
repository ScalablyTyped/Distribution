package typings.apolloLinkError

import org.scalablytyped.runtime.StringDictionary
import typings.apolloLink.mod.ApolloLink
import typings.apolloLink.typesMod.FetchResult
import typings.apolloLink.typesMod.NextLink
import typings.apolloLink.typesMod.Operation
import typings.apolloLinkError.mod.ErrorLink.ErrorHandler
import typings.apolloLinkHttpCommon.mod.ServerError
import typings.apolloLinkHttpCommon.mod.ServerParseError
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.mod.GraphQLError
import typings.std.Error
import typings.std.Record
import typings.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    var response: js.UndefOr[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
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

