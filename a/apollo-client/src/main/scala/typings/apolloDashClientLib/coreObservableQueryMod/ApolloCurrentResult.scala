package typings
package apolloDashClientLib.coreObservableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloCurrentResult[T] extends js.Object {
  var data: T | js.Object
  var error: js.UndefOr[apolloDashClientLib.errorsApolloErrorMod.ApolloError] = js.undefined
  var errors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var loading: scala.Boolean
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  var partial: js.UndefOr[scala.Boolean] = js.undefined
}

object ApolloCurrentResult {
  @scala.inline
  def apply[T](
    data: T | js.Object,
    loading: scala.Boolean,
    networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus,
    error: apolloDashClientLib.errorsApolloErrorMod.ApolloError = null,
    errors: js.Array[graphqlLib.graphqlMod.GraphQLError] = null,
    partial: js.UndefOr[scala.Boolean] = js.undefined
  ): ApolloCurrentResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("networkStatus")(networkStatus)
    if (error != null) __obj.updateDynamic("error")(error)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial)
    __obj.asInstanceOf[ApolloCurrentResult[T]]
  }
}

