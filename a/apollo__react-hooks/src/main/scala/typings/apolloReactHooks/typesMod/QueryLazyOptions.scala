package typings.apolloReactHooks.typesMod

import typings.apolloReactCommon.typesMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryLazyOptions[TVariables] extends js.Object {
  var context: js.UndefOr[Context] = js.native
  var variables: js.UndefOr[TVariables] = js.native
}

object QueryLazyOptions {
  @scala.inline
  def apply[TVariables](): QueryLazyOptions[TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLazyOptions[TVariables]]
  }
  @scala.inline
  implicit class QueryLazyOptionsOps[Self <: QueryLazyOptions[_], TVariables] (val x: Self with QueryLazyOptions[TVariables]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: Context): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setVariables(value: TVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

