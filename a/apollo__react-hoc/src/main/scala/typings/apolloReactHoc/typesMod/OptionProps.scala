package typings.apolloReactHoc.typesMod

import typings.apolloReactCommon.typesMod.MutationFetchResult
import typings.apolloReactCommon.typesMod.MutationFunction
import typings.apolloReactCommon.typesMod.MutationFunctionOptions
import typings.apolloReactCommon.typesMod.MutationResult
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@apollo/react-hoc.@apollo/react-hoc/lib/types.DataProps<TData, TGraphQLVariables>> */
/* Inlined parent std.Partial<@apollo/react-hoc.@apollo/react-hoc/lib/types.MutateProps<TData, TGraphQLVariables>> */
@js.native
trait OptionProps[TProps, TData, TGraphQLVariables] extends js.Object {
  var data: js.UndefOr[DataValue[TData, TGraphQLVariables]] = js.native
  var mutate: js.UndefOr[MutationFunction[TData, TGraphQLVariables]] = js.native
  var ownProps: TProps = js.native
  var result: js.UndefOr[MutationResult[TData]] = js.native
}

object OptionProps {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables](ownProps: TProps): OptionProps[TProps, TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(ownProps = ownProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProps[TProps, TData, TGraphQLVariables]]
  }
  @scala.inline
  implicit class OptionPropsOps[Self <: OptionProps[_, _, _], TProps, TData, TGraphQLVariables] (val x: Self with (OptionProps[TProps, TData, TGraphQLVariables])) extends AnyVal {
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
    def setOwnProps(value: TProps): Self = this.set("ownProps", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: DataValue[TData, TGraphQLVariables]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setMutate(
      value: /* options */ js.UndefOr[MutationFunctionOptions[TData, TGraphQLVariables]] => js.Promise[MutationFetchResult[TData, Record[String, js.Any], Record[String, js.Any]]]
    ): Self = this.set("mutate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMutate: Self = this.set("mutate", js.undefined)
    @scala.inline
    def setResult(value: MutationResult[TData]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

