package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewCreateInstruction extends js.Object {
  /**
    * Indicates that the view is being created by enhancing existing DOM.
    */
  var enhance: js.UndefOr[Boolean] = js.native
  /**
    * Specifies a key/value lookup of part replacements for the view being created.
    */
  var partReplacements: js.UndefOr[js.Object] = js.native
}

object ViewCreateInstruction {
  @scala.inline
  def apply(): ViewCreateInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewCreateInstruction]
  }
  @scala.inline
  implicit class ViewCreateInstructionOps[Self <: ViewCreateInstruction] (val x: Self) extends AnyVal {
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
    def setEnhance(value: Boolean): Self = this.set("enhance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnhance: Self = this.set("enhance", js.undefined)
    @scala.inline
    def setPartReplacements(value: js.Object): Self = this.set("partReplacements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartReplacements: Self = this.set("partReplacements", js.undefined)
  }
  
}

