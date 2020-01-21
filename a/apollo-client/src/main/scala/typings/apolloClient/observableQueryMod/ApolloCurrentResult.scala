package typings.apolloClient.observableQueryMod

import typings.apolloClient.apolloErrorMod.ApolloError
import typings.apolloClient.networkStatusMod.NetworkStatus
import typings.graphql.mod.GraphQLError
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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloCurrentResult[T]]
  }
}

