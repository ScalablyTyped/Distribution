package typings.apolloDashClient.dataQueriesMod

import typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.languageAstMod.DocumentNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStoreValue extends js.Object {
  var document: DocumentNode
  var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var metadata: js.Any
  var networkError: js.UndefOr[Error | Null] = js.undefined
  var networkStatus: NetworkStatus
  var previousVariables: js.UndefOr[js.Object | Null] = js.undefined
  var variables: js.Object
}

object QueryStoreValue {
  @scala.inline
  def apply(
    document: DocumentNode,
    metadata: js.Any,
    networkStatus: NetworkStatus,
    variables: js.Object,
    graphQLErrors: js.Array[GraphQLError] = null,
    networkError: Error = null,
    previousVariables: js.Object = null
  ): QueryStoreValue = {
    val __obj = js.Dynamic.literal(document = document, metadata = metadata, networkStatus = networkStatus, variables = variables)
    if (graphQLErrors != null) __obj.updateDynamic("graphQLErrors")(graphQLErrors)
    if (networkError != null) __obj.updateDynamic("networkError")(networkError)
    if (previousVariables != null) __obj.updateDynamic("previousVariables")(previousVariables)
    __obj.asInstanceOf[QueryStoreValue]
  }
}

