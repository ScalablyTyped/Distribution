package typings.aceBuilds.mod.Ace

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var backwards: Boolean
  var caseSensitive: Boolean
  var needle: String | RegExp
  var preserveCase: Boolean
  var preventScroll: Boolean
  var range: Range
  var regExp: RegExp
  var skipCurrent: Boolean
  var start: Range
  var wholeWord: String
  var wrap: Boolean
}

object SearchOptions {
  @scala.inline
  def apply(
    backwards: Boolean,
    caseSensitive: Boolean,
    needle: String | RegExp,
    preserveCase: Boolean,
    preventScroll: Boolean,
    range: Range,
    regExp: RegExp,
    skipCurrent: Boolean,
    start: Range,
    wholeWord: String,
    wrap: Boolean
  ): SearchOptions = {
    val __obj = js.Dynamic.literal(backwards = backwards.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], needle = needle.asInstanceOf[js.Any], preserveCase = preserveCase.asInstanceOf[js.Any], preventScroll = preventScroll.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], skipCurrent = skipCurrent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], wholeWord = wholeWord.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

