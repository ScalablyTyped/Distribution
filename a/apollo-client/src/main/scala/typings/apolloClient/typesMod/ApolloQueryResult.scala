package typings.apolloClient.typesMod

import typings.apolloClient.networkStatusMod.NetworkStatus
import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloQueryResult[T] extends js.Object {
  var data: T = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var loading: Boolean = js.native
  var networkStatus: NetworkStatus = js.native
  var stale: Boolean = js.native
}

object ApolloQueryResult {
  @scala.inline
  def apply[T](data: T, loading: Boolean, networkStatus: NetworkStatus, stale: Boolean): ApolloQueryResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloQueryResult[T]]
  }
  @scala.inline
  implicit class ApolloQueryResultOps[Self <: ApolloQueryResult[_], T] (val x: Self with ApolloQueryResult[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkStatus(value: NetworkStatus): Self = this.set("networkStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

