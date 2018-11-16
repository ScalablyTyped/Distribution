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

