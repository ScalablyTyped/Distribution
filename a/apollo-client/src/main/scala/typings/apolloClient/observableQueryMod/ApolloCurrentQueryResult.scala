package typings.apolloClient.observableQueryMod

import typings.apolloClient.apolloErrorMod.ApolloError
import typings.apolloClient.networkStatusMod.NetworkStatus
import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloCurrentQueryResult[T] extends js.Object {
  var data: js.UndefOr[T] = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var loading: Boolean = js.native
  var networkStatus: NetworkStatus = js.native
  var partial: js.UndefOr[Boolean] = js.native
  var stale: js.UndefOr[Boolean] = js.native
}

object ApolloCurrentQueryResult {
  @scala.inline
  def apply[T](loading: Boolean, networkStatus: NetworkStatus): ApolloCurrentQueryResult[T] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloCurrentQueryResult[T]]
  }
  @scala.inline
  implicit class ApolloCurrentQueryResultOps[Self <: ApolloCurrentQueryResult[_], T] (val x: Self with ApolloCurrentQueryResult[T]) extends AnyVal {
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkStatus(value: NetworkStatus): Self = this.set("networkStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: ApolloError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setPartial(value: Boolean): Self = this.set("partial", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartial: Self = this.set("partial", js.undefined)
    @scala.inline
    def setStale(value: Boolean): Self = this.set("stale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
  }
  
}

