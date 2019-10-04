package typings.atApolloReactDashComponents.libTypesMod

import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreWatchQueryOptionsMod.FetchPolicy
import typings.atApolloReactDashCommon.libTypesTypesMod.BaseSubscriptionOptions
import typings.atApolloReactDashCommon.libTypesTypesMod.OnSubscriptionDataOptions
import typings.atApolloReactDashCommon.libTypesTypesMod.SubscriptionResult
import typings.graphql.languageAstMod.DocumentNode
import typings.react.reactMod.Global.JSXNs.Element
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
    children: /* result */ SubscriptionResult[TData] => Element | Null = null,
    client: default[js.Object] = null,
    fetchPolicy: FetchPolicy = null,
    onSubscriptionComplete: () => Unit = null,
    onSubscriptionData: /* options */ OnSubscriptionDataOptions[TData] => _ = null,
    shouldResubscribe: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean]) = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    variables: TVariables = null
  ): SubscriptionComponentOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal(subscription = subscription)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (client != null) __obj.updateDynamic("client")(client)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (onSubscriptionComplete != null) __obj.updateDynamic("onSubscriptionComplete")(js.Any.fromFunction0(onSubscriptionComplete))
    if (onSubscriptionData != null) __obj.updateDynamic("onSubscriptionData")(js.Any.fromFunction1(onSubscriptionData))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(shouldResubscribe.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionComponentOptions[TData, TVariables]]
  }
}

