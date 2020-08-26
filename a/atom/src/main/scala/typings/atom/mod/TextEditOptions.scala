package typings.atom.mod

import typings.atom.atomStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEditOptions extends js.Object {
  /** If true, all line endings will be normalized to match the editor's current mode. */
  var normalizeLineEndings: js.UndefOr[Boolean] = js.native
  /**
    * If skip, skips the undo stack for this operation.
    * @deprecated Call groupLastChanges() on the TextBuffer afterward instead.
    */
  var undo: js.UndefOr[skip] = js.native
}

object TextEditOptions {
  @scala.inline
  def apply(): TextEditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextEditOptions]
  }
  @scala.inline
  implicit class TextEditOptionsOps[Self <: TextEditOptions] (val x: Self) extends AnyVal {
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
    def setNormalizeLineEndings(value: Boolean): Self = this.set("normalizeLineEndings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizeLineEndings: Self = this.set("normalizeLineEndings", js.undefined)
    @scala.inline
    def setUndo(value: skip): Self = this.set("undo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
  }
  
}

