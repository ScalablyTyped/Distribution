package typings.atom.linterMod

import typings.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackSolution extends js.Object {
  var position: Range = js.native
  var priority: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  // tslint:disable-next-line:no-any
  @JSName("apply")
  def apply(): js.Any = js.native
}

object CallbackSolution {
  @scala.inline
  def apply(apply: () => js.Any, position: Range): CallbackSolution = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction0(apply), position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackSolution]
  }
  @scala.inline
  implicit class CallbackSolutionOps[Self <: CallbackSolution] (val x: Self) extends AnyVal {
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
    def setApply(value: () => js.Any): Self = this.set("apply", js.Any.fromFunction0(value))
    @scala.inline
    def setPosition(value: Range): Self = this.set("position", value.asInstanceOf[js.Any])
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

