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

trait AnserJsonEntry extends js.Object {
  /** The background color. */
  var bg: String
  /** The background true color (if 16m color is enabled). */
  var bg_truecolor: String
  /** `true` if a carriageReturn \r was fount at end of line. */
  var clearLine: Boolean
  /** The text. */
  var content: String
  var decoration: Null | bold | dim | italic | underline | blink | reverse | hidden | strikethrough
  /** The foreground color. */
  var fg: String
  /** The foreground true color (if 16m color is enabled). */
  var fg_truecolor: String
  /** `true` if the colors were processed, `false` otherwise. */
  var was_processed: Boolean
  /** A function returning `true` if the content is empty, or `false` otherwise. */
  def isEmpty(): Boolean
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
    was_processed: Boolean,
    decoration: bold | dim | italic | underline | blink | reverse | hidden | strikethrough = null
  ): AnserJsonEntry = {
    val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], bg_truecolor = bg_truecolor.asInstanceOf[js.Any], clearLine = clearLine.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], fg_truecolor = fg_truecolor.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), was_processed = was_processed.asInstanceOf[js.Any], decoration = decoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnserJsonEntry]
  }
}

