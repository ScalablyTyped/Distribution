package typings.angularWizard.mod.mgoAngularWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WzStep extends js.Object {
  var description: String = js.native
  var selected: Boolean = js.native
  var title: String = js.native
  var wzData: js.Any = js.native
  var wzTitle: String = js.native
  def canenter(args: js.Any*): Boolean = js.native
  def canexit(args: js.Any*): Boolean = js.native
}

object WzStep {
  @scala.inline
  def apply(
    canenter: /* repeated */ js.Any => Boolean,
    canexit: /* repeated */ js.Any => Boolean,
    description: String,
    selected: Boolean,
    title: String,
    wzData: js.Any,
    wzTitle: String
  ): WzStep = {
    val __obj = js.Dynamic.literal(canenter = js.Any.fromFunction1(canenter), canexit = js.Any.fromFunction1(canexit), description = description.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wzData = wzData.asInstanceOf[js.Any], wzTitle = wzTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WzStep]
  }
  @scala.inline
  implicit class WzStepOps[Self <: WzStep] (val x: Self) extends AnyVal {
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
    def setCanenter(value: /* repeated */ js.Any => Boolean): Self = this.set("canenter", js.Any.fromFunction1(value))
    @scala.inline
    def setCanexit(value: /* repeated */ js.Any => Boolean): Self = this.set("canexit", js.Any.fromFunction1(value))
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setWzData(value: js.Any): Self = this.set("wzData", value.asInstanceOf[js.Any])
    @scala.inline
    def setWzTitle(value: String): Self = this.set("wzTitle", value.asInstanceOf[js.Any])
  }
  
}

