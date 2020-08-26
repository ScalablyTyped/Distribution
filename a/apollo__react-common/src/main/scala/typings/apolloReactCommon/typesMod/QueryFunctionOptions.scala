package typings.apolloReactCommon.typesMod

import typings.apolloClient.mod.ApolloError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryFunctionOptions[TData, TVariables] extends BaseQueryOptions[TVariables] {
  var displayName: js.UndefOr[String] = js.native
  var onCompleted: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ ApolloError, Unit]] = js.native
  var skip: js.UndefOr[Boolean] = js.native
}

object QueryFunctionOptions {
  @scala.inline
  def apply[TData, TVariables](): QueryFunctionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFunctionOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryFunctionOptionsOps[Self <: QueryFunctionOptions[_, _], TData, TVariables] (val x: Self with (QueryFunctionOptions[TData, TVariables])) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setOnCompleted(value: /* data */ TData => Unit): Self = this.set("onCompleted", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCompleted: Self = this.set("onCompleted", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ ApolloError => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setSkip(value: Boolean): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
  }
  
}

