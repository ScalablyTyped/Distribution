package typings.atom.atomMod

import typings.atom.atomStrings.after
import typings.atom.atomStrings.before
import typings.atom.atomStrings.head
import typings.atom.atomStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedDecorationOptions extends js.Object {
  /**
    *  Only applicable to decorations of type overlay. Determines whether the decoration
    *  adjusts its horizontal or vertical position to remain fully visible when it would
    *  otherwise overflow the editor. Defaults to true.
    */
  var avoidOverflow: js.UndefOr[Boolean] = js.undefined
  /**
    *  This CSS class will be applied to the decorated line number, line, highlight,
    *  or overlay.
    */
  var `class`: js.UndefOr[String] = js.undefined
  /**
    *  An HTMLElement or a model Object with a corresponding view registered. Only
    *  applicable to the gutter, overlay and block types.
    */
  var item: js.UndefOr[js.Object] = js.undefined
  /**
    *  If false, the decoration will be applied to the last row of a non-empty
    *  range, even if it ends at column 0. Defaults to true. Only applicable
    *  to the gutter, line, and line-number decoration types.
    */
  var omitEmptyLastRow: js.UndefOr[Boolean] = js.undefined
  /**
    *  If true, the decoration will only be applied if the associated DisplayMarker
    *  is empty. Only applicable to the gutter, line, and line-number types.
    */
  var onlyEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    *  If true, the decoration will only be applied to the head of the DisplayMarker.
    *  Only applicable to the line and line-number types.
    */
  var onlyHead: js.UndefOr[Boolean] = js.undefined
  /**
    *  If true, the decoration will only be applied if the associated DisplayMarker
    *  is non-empty. Only applicable to the gutter, line, and line-number types.
    */
  var onlyNonEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    *  Only applicable to decorations of type block. Controls where the view is
    *  positioned relative to other block decorations at the same screen row.
    *  If unspecified, block decorations render oldest to newest.
    */
  var order: js.UndefOr[Double] = js.undefined
  /**
    *  Only applicable to decorations of type overlay and block. Controls where the
    *  view is positioned relative to the TextEditorMarker. Values can be
    *  'head' (the default) or 'tail' for overlay decorations, and 'before' (the default)
    *  or 'after' for block decorations.
    */
  var position: js.UndefOr[head | tail | before | after] = js.undefined
  /**
    *  An Object containing CSS style properties to apply to the relevant DOM
    *  node. Currently this only works with a type of cursor or text.
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object SharedDecorationOptions {
  @scala.inline
  def apply(
    avoidOverflow: js.UndefOr[Boolean] = js.undefined,
    `class`: String = null,
    item: js.Object = null,
    omitEmptyLastRow: js.UndefOr[Boolean] = js.undefined,
    onlyEmpty: js.UndefOr[Boolean] = js.undefined,
    onlyHead: js.UndefOr[Boolean] = js.undefined,
    onlyNonEmpty: js.UndefOr[Boolean] = js.undefined,
    order: Int | Double = null,
    position: head | tail | before | after = null,
    style: js.Object = null
  ): SharedDecorationOptions = {
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
    __obj.asInstanceOf[SharedDecorationOptions]
  }
}

