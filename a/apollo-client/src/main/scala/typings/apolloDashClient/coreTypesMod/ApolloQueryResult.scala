package typings.apolloDashClient.coreTypesMod

import typings.apolloDashClient.coreNetworkStatusMod.NetworkStatus
import typings.graphql.graphqlMod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloQueryResult[T] extends js.Object {
  var data: T
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var loading: Boolean
  var networkStatus: NetworkStatus
  var stale: Boolean
}

object ApolloQueryResult {
  @scala.inline
  def apply[T](
    data: T,
    loading: Boolean,
    networkStatus: NetworkStatus,
    stale: Boolean,
    errors: js.Array[GraphQLError] = null
  ): ApolloQueryResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloQueryResult[T]]
  }
}

