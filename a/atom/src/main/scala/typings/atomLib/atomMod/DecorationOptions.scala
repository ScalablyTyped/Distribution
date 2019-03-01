package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationOptions extends SharedDecorationOptions {
  /** The name of the gutter we're decorating, if type is "gutter". */
  var gutterName: js.UndefOr[java.lang.String] = js.undefined
  /** One of several supported decoration types. */
  var `type`: js.UndefOr[
    atomLib.atomLibStrings.line | atomLib.atomLibStrings.`line-number` | atomLib.atomLibStrings.highlight | atomLib.atomLibStrings.overlay | atomLib.atomLibStrings.gutter | atomLib.atomLibStrings.block
  ] = js.undefined
}

object DecorationOptions {
  @scala.inline
  def apply(
    avoidOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    `class`: java.lang.String = null,
    gutterName: java.lang.String = null,
    item: js.Object = null,
    onlyEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    onlyHead: js.UndefOr[scala.Boolean] = js.undefined,
    onlyNonEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    position: atomLib.atomLibStrings.head | atomLib.atomLibStrings.tail | atomLib.atomLibStrings.before | atomLib.atomLibStrings.after = null,
    `type`: atomLib.atomLibStrings.line | atomLib.atomLibStrings.`line-number` | atomLib.atomLibStrings.highlight | atomLib.atomLibStrings.overlay | atomLib.atomLibStrings.gutter | atomLib.atomLibStrings.block = null
  ): DecorationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avoidOverflow)) __obj.updateDynamic("avoidOverflow")(avoidOverflow)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (gutterName != null) __obj.updateDynamic("gutterName")(gutterName)
    if (item != null) __obj.updateDynamic("item")(item)
    if (!js.isUndefined(onlyEmpty)) __obj.updateDynamic("onlyEmpty")(onlyEmpty)
    if (!js.isUndefined(onlyHead)) __obj.updateDynamic("onlyHead")(onlyHead)
    if (!js.isUndefined(onlyNonEmpty)) __obj.updateDynamic("onlyNonEmpty")(onlyNonEmpty)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationOptions]
  }
}

