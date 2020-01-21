package typings.apolloReactHooks.typesMod

import typings.apolloReactCommon.typesMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLazyOptions[TVariables] extends js.Object {
  var context: js.UndefOr[Context] = js.undefined
  var variables: js.UndefOr[TVariables] = js.undefined
}

object QueryLazyOptions {
  @scala.inline
  def apply[TVariables](context: Context = null, variables: TVariables = null): QueryLazyOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLazyOptions[TVariables]]
  }
}

