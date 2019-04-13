package typings
package ascii2mathmlLib.ascii2mathmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var annotate: js.UndefOr[scala.Boolean] = js.undefined
  var bare: js.UndefOr[scala.Boolean] = js.undefined
  var colSep: js.UndefOr[java.lang.String] = js.undefined
  var decimalMark: js.UndefOr[java.lang.String] = js.undefined
  var dir: js.UndefOr[
    ascii2mathmlLib.ascii2mathmlLibStrings.ltr | ascii2mathmlLib.ascii2mathmlLibStrings.rtl
  ] = js.undefined
  var display: js.UndefOr[
    ascii2mathmlLib.ascii2mathmlLibStrings.`inline` | ascii2mathmlLib.ascii2mathmlLibStrings.block
  ] = js.undefined
  var rowSep: js.UndefOr[java.lang.String] = js.undefined
  var standalone: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    annotate: js.UndefOr[scala.Boolean] = js.undefined,
    bare: js.UndefOr[scala.Boolean] = js.undefined,
    colSep: java.lang.String = null,
    decimalMark: java.lang.String = null,
    dir: ascii2mathmlLib.ascii2mathmlLibStrings.ltr | ascii2mathmlLib.ascii2mathmlLibStrings.rtl = null,
    display: ascii2mathmlLib.ascii2mathmlLibStrings.`inline` | ascii2mathmlLib.ascii2mathmlLibStrings.block = null,
    rowSep: java.lang.String = null,
    standalone: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotate)) __obj.updateDynamic("annotate")(annotate)
    if (!js.isUndefined(bare)) __obj.updateDynamic("bare")(bare)
    if (colSep != null) __obj.updateDynamic("colSep")(colSep)
    if (decimalMark != null) __obj.updateDynamic("decimalMark")(decimalMark)
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (rowSep != null) __obj.updateDynamic("rowSep")(rowSep)
    if (!js.isUndefined(standalone)) __obj.updateDynamic("standalone")(standalone)
    __obj.asInstanceOf[Options]
  }
}

