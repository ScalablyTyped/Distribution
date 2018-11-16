package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SubscriptionOptions[TVariables] extends js.Object {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: js.UndefOr[TVariables] = js.undefined
}

