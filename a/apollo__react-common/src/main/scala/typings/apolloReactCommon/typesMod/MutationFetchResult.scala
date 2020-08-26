package typings.apolloReactCommon.typesMod

import typings.graphql.mod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @apollo/react-common.@apollo/react-common/lib/types/types.ExecutionResult<TData> & {  extensions :E | undefined,   context :C | undefined} */
@js.native
trait MutationFetchResult[TData, C, E] extends js.Object {
  var context: js.UndefOr[C] = js.native
  var data: js.UndefOr[TData] = js.native
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.native
  var extensions: (js.UndefOr[Record[String, _]]) with js.UndefOr[E] = js.native
}

object MutationFetchResult {
  @scala.inline
  def apply[TData, C, E](extensions: (js.UndefOr[Record[String, _]]) with js.UndefOr[E]): MutationFetchResult[TData, C, E] = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationFetchResult[TData, C, E]]
  }
  @scala.inline
  implicit class MutationFetchResultOps[Self <: MutationFetchResult[_, _, _], TData, C, E] (val x: Self with (MutationFetchResult[TData, C, E])) extends AnyVal {
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
    def setExtensions(value: (js.UndefOr[Record[String, _]]) with js.UndefOr[E]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: C): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setData(value: TData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: GraphQLError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

