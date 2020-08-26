package typings.apolloReactHooks.anon

import typings.apolloClient.mod.ApolloError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[TVariables, TData] extends js.Object {
  var data: js.UndefOr[TData] = js.native
  var error: js.UndefOr[ApolloError] = js.native
  var loading: Boolean = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object Data {
  @scala.inline
  def apply[TVariables, TData](loading: Boolean): Data[TVariables, TData] = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TVariables, TData]]
  }
  @scala.inline
  implicit class DataOps[Self <: Data[_, _], TVariables, TData] (val x: Self with (Data[TVariables, TData])) extends AnyVal {
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
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: ApolloError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

