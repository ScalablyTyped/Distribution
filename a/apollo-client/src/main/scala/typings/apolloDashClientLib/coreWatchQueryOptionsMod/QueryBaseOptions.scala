package typings
package apolloDashClientLib.coreWatchQueryOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryBaseOptions[TVariables] extends js.Object {
  var errorPolicy: js.UndefOr[ErrorPolicy] = js.undefined
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var fetchResults: js.UndefOr[scala.Boolean] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

