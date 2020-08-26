package typings.apolloClient.observableQueryMod

import typings.apolloClient.anon.FetchMoreResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchMoreOptions[TData, TVariables] extends js.Object {
  def updateQuery(previousQueryResult: TData, options: FetchMoreResult[TData, TVariables]): TData = js.native
}

object FetchMoreOptions {
  @scala.inline
  def apply[TData, TVariables](updateQuery: (TData, FetchMoreResult[TData, TVariables]) => TData): FetchMoreOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(updateQuery = js.Any.fromFunction2(updateQuery))
    __obj.asInstanceOf[FetchMoreOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class FetchMoreOptionsOps[Self <: FetchMoreOptions[_, _], TData, TVariables] (val x: Self with (FetchMoreOptions[TData, TVariables])) extends AnyVal {
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
    def setUpdateQuery(value: (TData, FetchMoreResult[TData, TVariables]) => TData): Self = this.set("updateQuery", js.Any.fromFunction2(value))
  }
  
}

