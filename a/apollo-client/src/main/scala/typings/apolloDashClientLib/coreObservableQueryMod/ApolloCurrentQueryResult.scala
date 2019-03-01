package typings
package apolloDashClientLib.coreObservableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloCurrentQueryResult[T] extends js.Object {
  var data: js.UndefOr[T]
  var error: js.UndefOr[apolloDashClientLib.errorsApolloErrorMod.ApolloError] = js.undefined
  var errors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var loading: scala.Boolean
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  var partial: js.UndefOr[scala.Boolean] = js.undefined
  var stale: js.UndefOr[scala.Boolean] = js.undefined
}

object ApolloCurrentQueryResult {
  @scala.inline
  def apply[T](
    loading: scala.Boolean,
    networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus,
    data: T = null,
    error: apolloDashClientLib.errorsApolloErrorMod.ApolloError = null,
    errors: js.Array[graphqlLib.graphqlMod.GraphQLError] = null,
    partial: js.UndefOr[scala.Boolean] = js.undefined,
    stale: js.UndefOr[scala.Boolean] = js.undefined
  ): ApolloCurrentQueryResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("networkStatus")(networkStatus)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    __obj.asInstanceOf[ApolloCurrentQueryResult[T]]
  }
}

