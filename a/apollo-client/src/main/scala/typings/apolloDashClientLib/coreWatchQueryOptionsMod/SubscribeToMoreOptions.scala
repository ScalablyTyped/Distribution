package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeToMoreOptions[TData, TVariables, TSubscriptionData] extends js.Object {
  var document: graphqlLib.languageAstMod.DocumentNode
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var updateQuery: js.UndefOr[UpdateQueryFn[TData, TVariables, TSubscriptionData]] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object SubscribeToMoreOptions {
  @scala.inline
  def apply[TData, TVariables, TSubscriptionData](
    document: graphqlLib.languageAstMod.DocumentNode,
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit] = null,
    updateQuery: UpdateQueryFn[TData, TVariables, TSubscriptionData] = null,
    variables: TVariables = null
  ): SubscribeToMoreOptions[TData, TVariables, TSubscriptionData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("document")(document)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (updateQuery != null) __obj.updateDynamic("updateQuery")(updateQuery)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeToMoreOptions[TData, TVariables, TSubscriptionData]]
  }
}

