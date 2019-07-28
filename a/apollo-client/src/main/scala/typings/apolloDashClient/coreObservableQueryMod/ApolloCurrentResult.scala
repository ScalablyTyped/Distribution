package typings.apolloDashClient.coreObservableQueryMod

import typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus
import typings.apolloDashClient.errorsApolloErrorMod.ApolloError
import typings.graphql.graphqlMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloCurrentResult[T] extends js.Object {
  var data: T | js.Object
  var error: js.UndefOr[ApolloError] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var loading: Boolean
  var networkStatus: NetworkStatus
  var partial: js.UndefOr[Boolean] = js.undefined
}

object ApolloCurrentResult {
  @scala.inline
  def apply[T](
    data: T | js.Object,
    loading: Boolean,
    networkStatus: NetworkStatus,
    error: ApolloError = null,
    errors: js.Array[GraphQLError] = null,
    partial: js.UndefOr[Boolean] = js.undefined
  ): ApolloCurrentResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], loading = loading, networkStatus = networkStatus)
    if (error != null) __obj.updateDynamic("error")(error)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    __obj.asInstanceOf[ApolloCurrentResult[T]]
  }
}

