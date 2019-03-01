package typings
package apolloDashClientLib.dataQueriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStoreValue extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var graphQLErrors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var metadata: js.Any
  var networkError: js.UndefOr[stdLib.Error | scala.Null] = js.undefined
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  var previousVariables: js.UndefOr[js.Object | scala.Null] = js.undefined
  var variables: js.Object
}

object QueryStoreValue {
  @scala.inline
  def apply(
    document: graphqlLib.languageAstMod.DocumentNode,
    metadata: js.Any,
    networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus,
    variables: js.Object,
    graphQLErrors: js.Array[graphqlLib.graphqlMod.GraphQLError] = null,
    networkError: stdLib.Error = null,
    previousVariables: js.Object = null
  ): QueryStoreValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("networkStatus")(networkStatus)
    __obj.updateDynamic("variables")(variables)
    if (graphQLErrors != null) __obj.updateDynamic("graphQLErrors")(graphQLErrors)
    if (networkError != null) __obj.updateDynamic("networkError")(networkError)
    if (previousVariables != null) __obj.updateDynamic("previousVariables")(previousVariables)
    __obj.asInstanceOf[QueryStoreValue]
  }
}

