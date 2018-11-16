package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MutationOptions[T, TVariables] extends MutationBaseOptions[T, TVariables] {
  var context: js.UndefOr[js.Any] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var mutation: graphqlLib.languageAstMod.DocumentNode
}

