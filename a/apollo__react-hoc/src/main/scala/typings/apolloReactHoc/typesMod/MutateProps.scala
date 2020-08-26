package typings.apolloReactHoc.typesMod

import typings.apolloReactCommon.typesMod.MutationFetchResult
import typings.apolloReactCommon.typesMod.MutationFunction
import typings.apolloReactCommon.typesMod.MutationFunctionOptions
import typings.apolloReactCommon.typesMod.MutationResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutateProps[TData, TGraphQLVariables] extends js.Object {
  var mutate: MutationFunction[TData, TGraphQLVariables] = js.native
  var result: MutationResult[TData] = js.native
}

object MutateProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](
    mutate: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]],
    result: MutationResult[TData]
  ): MutateProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(mutate = js.Any.fromFunction1(mutate), result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutateProps[TData, TGraphQLVariables]]
  }
  @scala.inline
  implicit class MutatePropsOps[Self <: MutateProps[_, _], TData, TGraphQLVariables] (val x: Self with (MutateProps[TData, TGraphQLVariables])) extends AnyVal {
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
    def setMutate(
      value: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]]
    ): Self = this.set("mutate", js.Any.fromFunction1(value))
    @scala.inline
    def setResult(value: MutationResult[TData]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

