package typings
package apolloDashClientLib.coreObservableQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQueryOptions[TVariables] extends js.Object {
  var variables: js.UndefOr[TVariables] = js.undefined
}

object UpdateQueryOptions {
  @scala.inline
  def apply[TVariables](variables: TVariables = null): UpdateQueryOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueryOptions[TVariables]]
  }
}

