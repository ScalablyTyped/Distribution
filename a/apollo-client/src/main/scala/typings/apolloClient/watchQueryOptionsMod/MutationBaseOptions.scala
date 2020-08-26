package typings.apolloClient.watchQueryOptionsMod

import typings.apolloCache.dataProxyMod.DataProxy
import typings.apolloClient.typesMod.MutationQueryReducersMap
import typings.apolloClient.typesMod.PureQueryOptions
import typings.apolloLink.typesMod.FetchResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationBaseOptions[T, TVariables] extends js.Object {
  var awaitRefetchQueries: js.UndefOr[Boolean] = js.native
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.native
  var optimisticResponse: js.UndefOr[T | (js.Function1[/* vars */ TVariables, T])] = js.native
  var refetchQueries: js.UndefOr[
    (js.Function1[
      /* result */ FetchResult[T, Record[String, _], Record[String, _]], 
      RefetchQueryDescription
    ]) | RefetchQueryDescription
  ] = js.native
  var update: js.UndefOr[MutationUpdaterFn[T]] = js.native
  var updateQueries: js.UndefOr[MutationQueryReducersMap[T]] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object MutationBaseOptions {
  @scala.inline
  def apply[T, TVariables](): MutationBaseOptions[T, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationBaseOptions[T, TVariables]]
  }
  @scala.inline
  implicit class MutationBaseOptionsOps[Self <: MutationBaseOptions[_, _], T, TVariables] (val x: Self with (MutationBaseOptions[T, TVariables])) extends AnyVal {
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
    def setErrorPolicy(value: ErrorPolicy): Self = this.set("errorPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorPolicy: Self = this.set("errorPolicy", js.undefined)
    @scala.inline
    def setOptimisticResponseFunction1(value: /* vars */ TVariables => T): Self = this.set("optimisticResponse", js.Any.fromFunction1(value))
    @scala.inline
    def setOptimisticResponse(value: T | (js.Function1[/* vars */ TVariables, T])): Self = this.set("optimisticResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimisticResponse: Self = this.set("optimisticResponse", js.undefined)
    @scala.inline
    def setRefetchQueriesVarargs(value: (String | PureQueryOptions)*): Self = this.set("refetchQueries", js.Array(value :_*))
    @scala.inline
    def setRefetchQueriesFunction1(
      value: /* result */ FetchResult[T, Record[String, _], Record[String, _]] => RefetchQueryDescription
    ): Self = this.set("refetchQueries", js.Any.fromFunction1(value))
    @scala.inline
    def setRefetchQueries(
      value: (js.Function1[
          /* result */ FetchResult[T, Record[String, _], Record[String, _]], 
          RefetchQueryDescription
        ]) | RefetchQueryDescription
    ): Self = this.set("refetchQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefetchQueries: Self = this.set("refetchQueries", js.undefined)
    @scala.inline
    def setUpdate(
      value: (/* proxy */ DataProxy, /* mutationResult */ FetchResult[T, Record[String, js.Any], Record[String, js.Any]]) => Unit
    ): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpdateQueries(value: MutationQueryReducersMap[T]): Self = this.set("updateQueries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateQueries: Self = this.set("updateQueries", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

