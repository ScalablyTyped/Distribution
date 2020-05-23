package typings.apolloReactHoc.typesMod

import typings.apolloReactCommon.typesMod.BaseMutationOptions
import typings.apolloReactCommon.typesMod.BaseQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOption[TProps, TData, TGraphQLVariables, TChildProps] extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[
    BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables]) | (js.Function1[
      /* props */ TProps, 
      BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables])
    ])
  ] = js.undefined
  var props: js.UndefOr[
    js.Function2[
      /* props */ OptionProps[TProps, TData, TGraphQLVariables], 
      /* lastProps */ js.UndefOr[TChildProps | Unit], 
      TChildProps
    ]
  ] = js.undefined
  var shouldResubscribe: js.UndefOr[js.Function2[/* props */ TProps, /* nextProps */ TProps, Boolean]] = js.undefined
  var skip: js.UndefOr[Boolean | (js.Function1[/* props */ TProps, Boolean])] = js.undefined
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object OperationOption {
  @scala.inline
  def apply[TProps, TData, TGraphQLVariables, TChildProps](
    alias: String = null,
    name: String = null,
    options: BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables]) | (js.Function1[
      /* props */ TProps, 
      BaseQueryOptions[TGraphQLVariables] | (BaseMutationOptions[TData, TGraphQLVariables])
    ]) = null,
    props: (/* props */ OptionProps[TProps, TData, TGraphQLVariables], /* lastProps */ js.UndefOr[TChildProps | Unit]) => TChildProps = null,
    shouldResubscribe: (/* props */ TProps, /* nextProps */ TProps) => Boolean = null,
    skip: Boolean | (js.Function1[/* props */ TProps, Boolean]) = null,
    withRef: js.UndefOr[Boolean] = js.undefined
  ): OperationOption[TProps, TData, TGraphQLVariables, TChildProps] = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(js.Any.fromFunction2(props))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(js.Any.fromFunction2(shouldResubscribe))
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationOption[TProps, TData, TGraphQLVariables, TChildProps]]
  }
}

