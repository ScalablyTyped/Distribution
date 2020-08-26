package typings.apolloServerErrors.anon

import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphql.mod.GraphQLError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Debug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.native
  var formatter: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.native
}

object Debug {
  @scala.inline
  def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  @scala.inline
  implicit class DebugOps[Self <: Debug] (val x: Self) extends AnyVal {
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setFormatter(value: /* error */ GraphQLError => GraphQLFormattedError[Record[String, _]]): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
  }
  
}

