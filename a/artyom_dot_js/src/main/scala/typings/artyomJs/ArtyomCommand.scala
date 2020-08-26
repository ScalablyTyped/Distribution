package typings.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtyomCommand extends js.Object {
  var action: js.Function = js.native
  var description: js.UndefOr[String] = js.native
  var indexes: js.Array[_] = js.native
  var smart: js.UndefOr[Boolean] = js.native
}

object ArtyomCommand {
  @scala.inline
  def apply(action: js.Function, indexes: js.Array[_]): ArtyomCommand = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtyomCommand]
  }
  @scala.inline
  implicit class ArtyomCommandOps[Self <: ArtyomCommand] (val x: Self) extends AnyVal {
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
    def setAction(value: js.Function): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexesVarargs(value: js.Any*): Self = this.set("indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[_]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setSmart(value: Boolean): Self = this.set("smart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmart: Self = this.set("smart", js.undefined)
  }
  
}

