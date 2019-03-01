package typings
package apolloDashClientLib.coreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloQueryResult[T] extends js.Object {
  var data: T
  var errors: js.UndefOr[js.Array[graphqlLib.graphqlMod.GraphQLError]] = js.undefined
  var loading: scala.Boolean
  var networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus
  var stale: scala.Boolean
}

object ApolloQueryResult {
  @scala.inline
  def apply[T](
    data: T,
    loading: scala.Boolean,
    networkStatus: apolloDashClientLib.coreNetworkStatusMod.NetworkStatus,
    stale: scala.Boolean,
    errors: js.Array[graphqlLib.graphqlMod.GraphQLError] = null
  ): ApolloQueryResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("loading")(loading)
    __obj.updateDynamic("networkStatus")(networkStatus)
    __obj.updateDynamic("stale")(stale)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[ApolloQueryResult[T]]
  }
}

