package typings.antd.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditConfig extends js.Object {
  var editing: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onStart: js.UndefOr[js.Function0[Unit]] = js.native
}

object EditConfig {
  @scala.inline
  def apply(): EditConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditConfig]
  }
  @scala.inline
  implicit class EditConfigOps[Self <: EditConfig] (val x: Self) extends AnyVal {
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
    def setEditing(value: Boolean): Self = this.set("editing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnStart(value: () => Unit): Self = this.set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
  }
  
}

