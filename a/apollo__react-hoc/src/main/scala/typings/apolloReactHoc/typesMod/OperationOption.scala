package typings.apolloReactHoc.typesMod

import typings.apolloReactCommon.typesMod.BaseMutationOptions
import typings.apolloReactCommon.typesMod.BaseQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationOption[TProps, TData, TGraphQLVariables, TChildProps] extends js.Object {
  var alias: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[
    BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables]) | (js.Function1[
      /* props */ TProps, 
      BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables])
    ])
  ] = js.native
  var props: js.UndefOr[
    js.Function2[
      /* props */ OptionProps[TProps, TData, TGraphQLVariables], 
      /* lastProps */ js.UndefOr[TChildProps | Unit], 
      TChildProps
    ]
  ] = js.native
  var shouldResubscribe: js.UndefOr[js.Function2[/* props */ TProps, /* nextProps */ TProps, Boolean]] = js.native
  var skip: js.UndefOr[Boolean | (js.Function1[/* props */ TProps, Boolean])] = js.native
  var withRef: js.UndefOr[Boolean] = js.native
}

object OperationOption {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables, TChildProps](): OperationOption[TProps, TData, TGraphQLVariables, TChildProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationOption[TProps, TData, TGraphQLVariables, TChildProps]]
  }
  @scala.inline
  implicit class OperationOptionOps[Self <: OperationOption[_, _, _, _], TProps, TData, TGraphQLVariables, TChildProps] (val x: Self with (OperationOption[TProps, TData, TGraphQLVariables, TChildProps])) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionsFunction1(
      value: /* props */ TProps => BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables])
    ): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(
      value: BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables]) | (js.Function1[
          /* props */ TProps, 
          BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables])
        ])
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setProps(
      value: (/* props */ OptionProps[TProps, TData, TGraphQLVariables], /* lastProps */ js.UndefOr[TChildProps | Unit]) => TChildProps
    ): Self = this.set("props", js.Any.fromFunction2(value))
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    @scala.inline
    def setShouldResubscribe(value: (/* props */ TProps, /* nextProps */ TProps) => Boolean): Self = this.set("shouldResubscribe", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShouldResubscribe: Self = this.set("shouldResubscribe", js.undefined)
    @scala.inline
    def setSkipFunction1(value: /* props */ TProps => Boolean): Self = this.set("skip", js.Any.fromFunction1(value))
    @scala.inline
    def setSkip(value: Boolean | (js.Function1[/* props */ TProps, Boolean])): Self = this.set("skip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    @scala.inline
    def setWithRef(value: Boolean): Self = this.set("withRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithRef: Self = this.set("withRef", js.undefined)
  }
  
}

