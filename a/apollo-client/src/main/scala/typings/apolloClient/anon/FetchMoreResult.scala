package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMoreResult[TData, TVariables] extends js.Object {
  var fetchMoreResult: js.UndefOr[TData] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object FetchMoreResult {
  @scala.inline
  def apply[TData, TVariables](): FetchMoreResult[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchMoreResult[TData, TVariables]]
  }
  @scala.inline
  implicit class FetchMoreResultOps[Self <: FetchMoreResult[_, _], TData, TVariables] (val x: Self with (FetchMoreResult[TData, TVariables])) extends AnyVal {
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
    def setFetchMoreResult(value: TData): Self = this.set("fetchMoreResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchMoreResult: Self = this.set("fetchMoreResult", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

