package typings.apolloReactCommon.typesMod

import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.typesMod.PureQueryOptions
import typings.apolloClient.watchQueryOptionsMod.MutationUpdaterFn
import typings.apolloClient.watchQueryOptionsMod.WatchQueryFetchPolicy
import typings.apolloLink.typesMod.FetchResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationFunctionOptions[TData, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[Context] = js.native
  var fetchPolicy: js.UndefOr[WatchQueryFetchPolicy] = js.native
  var optimisticResponse: js.UndefOr[TData | (js.Function1[/* vars */ TVariables | js.Object, TData])] = js.native
  var refetchQueries: js.UndefOr[(js.Array[String | PureQueryOptions]) | RefetchQueriesFunction] = js.native
  var update: js.UndefOr[MutationUpdaterFn[TData]] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object MutationFunctionOptions {
  @scala.inline
  def apply[TData, TVariables](): MutationFunctionOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationFunctionOptions[TData, TVariables]]
  }
  @scala.inline
  implicit class MutationFunctionOptionsOps[Self <: MutationFunctionOptions[_, _], TData, TVariables] (val x: Self with (MutationFunctionOptions[TData, TVariables])) extends AnyVal {
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
    def setAwaitRefetchQueries(value: Boolean): Self = this.set("awaitRefetchQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitRefetchQueries: Self = this.set("awaitRefetchQueries", js.undefined)
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFetchPolicy(value: WatchQueryFetchPolicy): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchPolicy: Self = this.set("fetchPolicy", js.undefined)
    @scala.inline
    def setOptimisticResponseFunction1(value: /* vars */ TVariables | js.Object => TData): Self = this.set("optimisticResponse", js.Any.fromFunction1(value))
    @scala.inline
    def setOptimisticResponse(value: TData | (js.Function1[/* vars */ TVariables | js.Object, TData])): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    @scala.inline
    def setRefetchQueriesVarargs(value: (String | PureQueryOptions)*): Self = this.set("refetchQueries", js.Array(value :_*))
    @scala.inline
    def setRefetchQueriesFunction1(value: /* repeated */ js.Any => js.Array[String | PureQueryOptions]): Self = this.set("refetchQueries", js.Any.fromFunction1(value))
    @scala.inline
    def setRefetchQueries(value: (js.Array[String | PureQueryOptions]) | RefetchQueriesFunction): Self = this.set("refetchQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefetchQueries: Self = this.set("refetchQueries", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[TData, Record[String, js.Any], Record[String, js.Any]]) => Unit
    ): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

