package typings.ascii2mathml.mod

import typings.ascii2mathml.ascii2mathmlStrings.`inline`
import typings.ascii2mathml.ascii2mathmlStrings.block
import typings.ascii2mathml.ascii2mathmlStrings.ltr
import typings.ascii2mathml.ascii2mathmlStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var annotate: js.UndefOr[Boolean] = js.undefined
  var bare: js.UndefOr[Boolean] = js.undefined
  var colSep: js.UndefOr[String] = js.undefined
  var decimalMark: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[ltr | rtl] = js.undefined
  var display: js.UndefOr[`inline` | block] = js.undefined
  var rowSep: js.UndefOr[String] = js.undefined
  var standalone: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    annotate: js.UndefOr[Boolean] = js.undefined,
    bare: js.UndefOr[Boolean] = js.undefined,
    colSep: String = null,
    decimalMark: String = null,
    dir: ltr | rtl = null,
    display: `inline` | block = null,
    rowSep: String = null,
    standalone: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotate)) __obj.updateDynamic("annotate")(annotate.asInstanceOf[js.Any])
    if (!js.isUndefined(bare)) __obj.updateDynamic("bare")(bare.asInstanceOf[js.Any])
    if (colSep != null) __obj.updateDynamic("colSep")(colSep.asInstanceOf[js.Any])
    if (decimalMark != null) __obj.updateDynamic("decimalMark")(decimalMark.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (rowSep != null) __obj.updateDynamic("rowSep")(rowSep.asInstanceOf[js.Any])
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

