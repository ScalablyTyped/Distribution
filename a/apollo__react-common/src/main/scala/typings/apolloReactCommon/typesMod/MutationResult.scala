package typings.apolloReactCommon.typesMod

import typings.apolloClient.mod.ApolloError
import typings.apolloClient.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationResult[TData] extends js.Object {
  var called: Boolean = js.native
  var client: js.UndefOr[default[js.Object]] = js.native
  var data: js.UndefOr[TData] = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
}

object MutationResult {
  @scala.inline
  def apply[TData](called: Boolean, loading: Boolean): MutationResult[TData] = {
    val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult[TData]]
  }
  @scala.inline
  implicit class MutationResultOps[Self <: MutationResult[_], TData] (val x: Self with MutationResult[TData]) extends AnyVal {
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
    def setCalled(value: Boolean): Self = this.set("called", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setClient(value: default[js.Object]): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: ApolloError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

