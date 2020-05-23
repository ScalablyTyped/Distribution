package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.Range
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ace-builds.ace-builds.Ace.SearchOptions> */
trait PartialSearchOptions extends js.Object {
  var backwards: js.UndefOr[Boolean] = js.undefined
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var needle: js.UndefOr[String | RegExp] = js.undefined
  var preserveCase: js.UndefOr[Boolean] = js.undefined
  var preventScroll: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
  var regExp: js.UndefOr[RegExp] = js.undefined
  var skipCurrent: js.UndefOr[Boolean] = js.undefined
  var start: js.UndefOr[Range] = js.undefined
  var wholeWord: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object PartialSearchOptions {
  @scala.inline
  def apply(
    backwards: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    needle: String | RegExp = null,
    preserveCase: js.UndefOr[Boolean] = js.undefined,
    preventScroll: js.UndefOr[Boolean] = js.undefined,
    range: Range = null,
    regExp: RegExp = null,
    skipCurrent: js.UndefOr[Boolean] = js.undefined,
    start: Range = null,
    wholeWord: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): PartialSearchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backwards)) __obj.updateDynamic("backwards")(backwards.get.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (needle != null) __obj.updateDynamic("needle")(needle.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveCase)) __obj.updateDynamic("preserveCase")(preserveCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preventScroll)) __obj.updateDynamic("preventScroll")(preventScroll.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (regExp != null) __obj.updateDynamic("regExp")(regExp.asInstanceOf[js.Any])
    if (!js.isUndefined(skipCurrent)) __obj.updateDynamic("skipCurrent")(skipCurrent.get.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (wholeWord != null) __obj.updateDynamic("wholeWord")(wholeWord.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSearchOptions]
  }
}

