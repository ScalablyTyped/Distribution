package typings.atom.linterMod

import typings.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplacementSolution extends js.Object {
  var currentText: js.UndefOr[String] = js.native
  var position: Range = js.native
  var priority: js.UndefOr[Double] = js.native
  var replaceWith: String = js.native
  var title: js.UndefOr[String] = js.native
}

object ReplacementSolution {
  @scala.inline
  def apply(position: Range, replaceWith: String): ReplacementSolution = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], replaceWith = replaceWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementSolution]
  }
  @scala.inline
  implicit class ReplacementSolutionOps[Self <: ReplacementSolution] (val x: Self) extends AnyVal {
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
    def setPosition(value: Range): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplaceWith(value: String): Self = this.set("replaceWith", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentText(value: String): Self = this.set("currentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentText: Self = this.set("currentText", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

