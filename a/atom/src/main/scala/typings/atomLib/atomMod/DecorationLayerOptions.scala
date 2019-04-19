package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationLayerOptions extends SharedDecorationOptions {
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[
    atomLib.atomLibStrings.line | atomLib.atomLibStrings.`line-number` | atomLib.atomLibStrings.text | atomLib.atomLibStrings.highlight | atomLib.atomLibStrings.block | atomLib.atomLibStrings.cursor
  ] = js.undefined
}

object DecorationLayerOptions {
  @scala.inline
  def apply(
    avoidOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    `class`: java.lang.String = null,
    item: js.Object = null,
    omitEmptyLastRow: js.UndefOr[scala.Boolean] = js.undefined,
    onlyEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    onlyHead: js.UndefOr[scala.Boolean] = js.undefined,
    onlyNonEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    order: scala.Int | scala.Double = null,
    position: atomLib.atomLibStrings.head | atomLib.atomLibStrings.tail | atomLib.atomLibStrings.before | atomLib.atomLibStrings.after = null,
    style: js.Object = null,
    `type`: atomLib.atomLibStrings.line | atomLib.atomLibStrings.`line-number` | atomLib.atomLibStrings.text | atomLib.atomLibStrings.highlight | atomLib.atomLibStrings.block | atomLib.atomLibStrings.cursor = null
  ): DecorationLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidOverflow)) __obj.updateDynamic("avoidOverflow")(avoidOverflow)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (item != null) __obj.updateDynamic("item")(item)
    if (!js.isUndefined(omitEmptyLastRow)) __obj.updateDynamic("omitEmptyLastRow")(omitEmptyLastRow)
    if (!js.isUndefined(onlyEmpty)) __obj.updateDynamic("onlyEmpty")(onlyEmpty)
    if (!js.isUndefined(onlyHead)) __obj.updateDynamic("onlyHead")(onlyHead)
    if (!js.isUndefined(onlyNonEmpty)) __obj.updateDynamic("onlyNonEmpty")(onlyNonEmpty)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationLayerOptions]
  }
}

