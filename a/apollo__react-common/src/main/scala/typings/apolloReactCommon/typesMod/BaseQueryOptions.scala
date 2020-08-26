package typings.apolloReactCommon.typesMod

import typings.apolloClient.mod.default
import typings.apolloClient.watchQueryOptionsMod.ErrorPolicy
import typings.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQueryOptions[TVariables] extends js.Object {
  var client: js.UndefOr[default[_]] = js.native
  var context: js.UndefOr[Context] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.native
  var notifyOnNetworkStatusChange: js.UndefOr[Boolean] = js.native
  var partialRefetch: js.UndefOr[Boolean] = js.native
  var pollInterval: js.UndefOr[Double] = js.native
  var returnPartialData: js.UndefOr[Boolean] = js.native
  var ssr: js.UndefOr[Boolean] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object BaseQueryOptions {
  @scala.inline
  def apply[TVariables](): BaseQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseQueryOptions[TVariables]]
  }
  @scala.inline
  implicit class BaseQueryOptionsOps[Self <: BaseQueryOptions[_], TVariables] (val x: Self with BaseQueryOptions[TVariables]) extends AnyVal {
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
    def setClient(value: default[_]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setErrorPolicy(value: ErrorPolicy): Self = this.set("errorPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorPolicy: Self = this.set("errorPolicy", js.undefined)
    @scala.inline
    def setFetchPolicy(value: WatchQueryFetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    @scala.inline
    def setNotifyOnNetworkStatusChange(value: Boolean): Self = this.set("notifyOnNetworkStatusChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifyOnNetworkStatusChange: Self = this.set("notifyOnNetworkStatusChange", js.undefined)
    @scala.inline
    def setPartialRefetch(value: Boolean): Self = this.set("partialRefetch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialRefetch: Self = this.set("partialRefetch", js.undefined)
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    @scala.inline
    def setReturnPartialData(value: Boolean): Self = this.set("returnPartialData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnPartialData: Self = this.set("returnPartialData", js.undefined)
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

