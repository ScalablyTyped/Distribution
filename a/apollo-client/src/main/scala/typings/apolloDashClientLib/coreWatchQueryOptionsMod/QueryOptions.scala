package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryOptions[TVariables] extends QueryBaseOptions[TVariables] {
  var context: js.UndefOr[js.Any] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
}

