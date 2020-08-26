package typings.anser.mod

import typings.anser.anserStrings.blink
import typings.anser.anserStrings.bold
import typings.anser.anserStrings.dim
import typings.anser.anserStrings.hidden
import typings.anser.anserStrings.italic
import typings.anser.anserStrings.reverse
import typings.anser.anserStrings.strikethrough
import typings.anser.anserStrings.underline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnserJsonEntry extends js.Object {
  /** The background color. */
  var bg: String = js.native
  /** The background true color (if 16m color is enabled). */
  var bg_truecolor: String = js.native
  /** `true` if a carriageReturn \r was fount at end of line. */
  var clearLine: Boolean = js.native
  /** The text. */
  var content: String = js.native
  var decoration: Null | bold | dim | italic | underline | blink | reverse | hidden | strikethrough = js.native
  /** The foreground color. */
  var fg: String = js.native
  /** The foreground true color (if 16m color is enabled). */
  var fg_truecolor: String = js.native
  /** `true` if the colors were processed, `false` otherwise. */
  var was_processed: Boolean = js.native
  /** A function returning `true` if the content is empty, or `false` otherwise. */
  def isEmpty(): Boolean = js.native
}

object AnserJsonEntry {
  @scala.inline
  def apply(
    bg: String,
    bg_truecolor: String,
    clearLine: Boolean,
    content: String,
    fg: String,
    fg_truecolor: String,
    isEmpty: () => Boolean,
    was_processed: Boolean
  ): AnserJsonEntry = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], bg_truecolor = bg_truecolor.asInstanceOf[js.Any], clearLine = clearLine.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], fg_truecolor = fg_truecolor.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), was_processed = was_processed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnserJsonEntry]
  }
  @scala.inline
  implicit class AnserJsonEntryOps[Self <: AnserJsonEntry] (val x: Self) extends AnyVal {
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
    def setBg(value: String): Self = this.set("bg", value.asInstanceOf[js.Any])
    @scala.inline
    def setBg_truecolor(value: String): Self = this.set("bg_truecolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearLine(value: Boolean): Self = this.set("clearLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setFg(value: String): Self = this.set("fg", value.asInstanceOf[js.Any])
    @scala.inline
    def setFg_truecolor(value: String): Self = this.set("fg_truecolor", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setWas_processed(value: Boolean): Self = this.set("was_processed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoration(value: bold | dim | italic | underline | blink | reverse | hidden | strikethrough): Self = this.set("decoration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecorationNull: Self = this.set("decoration", null)
  }
  
}

