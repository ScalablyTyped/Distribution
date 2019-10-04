package typings.atApolloReactDashHooks.libTypesMod

import typings.apolloDashClient.apolloDashClientMod.default
import typings.apolloDashClient.coreWatchQueryOptionsMod.FetchPolicy
import typings.atApolloReactDashCommon.libTypesTypesMod.BaseSubscriptionOptions
import typings.atApolloReactDashCommon.libTypesTypesMod.OnSubscriptionDataOptions
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionHookOptions[TData, TVariables] extends BaseSubscriptionOptions[TData, TVariables] {
  var subscription: js.UndefOr[DocumentNode] = js.undefined
}

object SubscriptionHookOptions {
  @scala.inline
  def apply[TData, TVariables](
    client: default[js.Object] = null,
    fetchPolicy: FetchPolicy = null,
    onSubscriptionComplete: () => Unit = null,
    onSubscriptionData: /* options */ OnSubscriptionDataOptions[TData] => _ = null,
    shouldResubscribe: Boolean | (js.Function1[/* options */ BaseSubscriptionOptions[TData, TVariables], Boolean]) = null,
    skip: js.UndefOr[Boolean] = js.undefined,
    subscription: DocumentNode = null,
    variables: TVariables = null
  ): SubscriptionHookOptions[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (onSubscriptionComplete != null) __obj.updateDynamic("onSubscriptionComplete")(js.Any.fromFunction0(onSubscriptionComplete))
    if (onSubscriptionData != null) __obj.updateDynamic("onSubscriptionData")(js.Any.fromFunction1(onSubscriptionData))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(shouldResubscribe.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionHookOptions[TData, TVariables]]
  }
}

