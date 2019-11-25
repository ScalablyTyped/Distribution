package typings.apolloDashClient.coreObservableQueryMod

import typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus
import typings.apolloDashClient.errorsApolloErrorMod.ApolloError
import typings.graphql.graphqlMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloCurrentQueryResult[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var error: js.UndefOr[ApolloError] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var loading: Boolean
  var networkStatus: NetworkStatus
  var partial: js.UndefOr[Boolean] = js.undefined
  var stale: js.UndefOr[Boolean] = js.undefined
}

object ApolloCurrentQueryResult {
  @scala.inline
  def apply[T](
    loading: Boolean,
    networkStatus: NetworkStatus,
    data: T = null,
    error: ApolloError = null,
    errors: js.Array[GraphQLError] = null,
    partial: js.UndefOr[Boolean] = js.undefined,
    stale: js.UndefOr[Boolean] = js.undefined
  ): ApolloCurrentQueryResult[T] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloCurrentQueryResult[T]]
  }
}

