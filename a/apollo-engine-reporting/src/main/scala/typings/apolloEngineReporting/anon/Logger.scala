package typings.apolloEngineReporting.anon

import typings.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var logger: js.UndefOr[typings.apolloServerTypes.mod.Logger] = js.native
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.native
}

object Logger {
  @scala.inline
  def apply(): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
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
    def setLogger(value: typings.apolloServerTypes.mod.Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setRewriteError(value: /* err */ GraphQLError => GraphQLError | Null): Self = this.set("rewriteError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRewriteError: Self = this.set("rewriteError", js.undefined)
  }
  
}

