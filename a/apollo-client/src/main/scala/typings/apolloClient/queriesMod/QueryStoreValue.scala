package typings.apolloClient.queriesMod

import typings.apolloClient.networkStatusMod.NetworkStatus
import typings.graphql.astMod.DocumentNode
import typings.graphql.mod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStoreValue extends js.Object {
  var document: DocumentNode = js.native
  var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var metadata: js.Any = js.native
  var networkError: js.UndefOr[Error | Null] = js.native
  var networkStatus: NetworkStatus = js.native
  var previousVariables: js.UndefOr[js.Object | Null] = js.native
  var variables: js.Object = js.native
}

object QueryStoreValue {
  @scala.inline
  def apply(document: DocumentNode, metadata: js.Any, networkStatus: NetworkStatus, variables: js.Object): QueryStoreValue = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryStoreValue]
  }
  @scala.inline
  implicit class QueryStoreValueOps[Self <: QueryStoreValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: js.Any): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkStatus(value: NetworkStatus): Self = this.set("networkStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: js.Object): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphQLErrorsVarargs(value: GraphQLError*): Self = this.set("graphQLErrors", js.Array(value :_*))
    @scala.inline
    def setGraphQLErrors(value: js.Array[GraphQLError]): Self = this.set("graphQLErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphQLErrors: Self = this.set("graphQLErrors", js.undefined)
    @scala.inline
    def setNetworkError(value: Error): Self = this.set("networkError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkError: Self = this.set("networkError", js.undefined)
    @scala.inline
    def setNetworkErrorNull: Self = this.set("networkError", null)
    @scala.inline
    def setPreviousVariables(value: js.Object): Self = this.set("previousVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousVariables: Self = this.set("previousVariables", js.undefined)
    @scala.inline
    def setPreviousVariablesNull: Self = this.set("previousVariables", null)
  }
  
}

