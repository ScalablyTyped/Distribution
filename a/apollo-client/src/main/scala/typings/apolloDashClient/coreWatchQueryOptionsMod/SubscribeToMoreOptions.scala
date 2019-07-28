package typings.apolloDashClient.coreWatchQueryOptionsMod

import typings.graphql.languageAstMod.DocumentNode
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData] extends js.Object {
  var document: DocumentNode
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var updateQuery: js.UndefOr[UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData]] = js.undefined
  var variables: js.UndefOr[TSubscriptionVariables] = js.undefined
}

object SubscribeToMoreOptions {
  @scala.inline
  def apply[TData, TSubscriptionVariables, TSubscriptionData](
    document: DocumentNode,
    onError: /* error */ Error => Unit = null,
    updateQuery: UpdateQueryFn[TData, TSubscriptionVariables, TSubscriptionData] = null,
    variables: TSubscriptionVariables = null
  ): SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData] = {
    val __obj = js.Dynamic.literal(document = document)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (updateQuery != null) __obj.updateDynamic("updateQuery")(updateQuery)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToMoreOptions[TData, TSubscriptionVariables, TSubscriptionData]]
  }
}

