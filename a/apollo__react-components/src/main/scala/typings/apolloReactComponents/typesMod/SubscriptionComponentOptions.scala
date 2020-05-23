package typings.apolloReactComponents.typesMod

import typings.apolloClient.mod.default
import typings.apolloClient.watchQueryOptionsMod.FetchPolicy
import typings.apolloReactCommon.typesMod.BaseSubscriptionOptions
import typings.apolloReactCommon.typesMod.OnSubscriptionDataOptions
import typings.apolloReactCommon.typesMod.SubscriptionResult
import typings.graphql.astMod.DocumentNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionComponentOptions[TData, TVariables] extends BaseSubscriptionOptions[TData, TVariables] {
  var children: js.UndefOr[Null | (js.Function1[/* result */ SubscriptionResult[TData], Element | Null])] = js.undefined
  var subscription: DocumentNode
}

object SubscriptionComponentOptions {
  @scala.inline
  def apply[TData, TVariables](
    subscription: DocumentNode,
    children: js.UndefOr[Null | (/* result */ SubscriptionResult[TData] => Element | Null)] = js.undefined,
    client: default[js.Object] = null,
    fetchPolicy: FetchPolicy = null,
    onSubscriptionComplete: () => Unit = null,
    onSubscriptionData: /* options */ OnSubscriptionDataOptions[TData] => _ = null,
    shouldResubscribe: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean]) = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    variables: TVariables = null
  ): SubscriptionComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(if (children != null) js.Any.fromFunction1(children.asInstanceOf[/* result */ SubscriptionResult[TData] => Element | Null]) else null)
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onSubscriptionComplete != null) __obj.updateDynamic("onSubscriptionComplete")(js.Any.fromFunction0(onSubscriptionComplete))
    if (onSubscriptionData != null) __obj.updateDynamic("onSubscriptionData")(js.Any.fromFunction1(onSubscriptionData))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(shouldResubscribe.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionComponentOptions[TData, TVariables]]
  }
}

