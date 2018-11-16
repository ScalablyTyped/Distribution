package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SharedDecorationOptions extends js.Object {
  /**
       *  Only applicable to decorations of type overlay. Determines whether the decoration
       *  adjusts its horizontal or vertical position to remain fully visible when it would
       *  otherwise overflow the editor. Defaults to true.
       */
  var avoidOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  This CSS class will be applied to the decorated line number, line, highlight,
       *  or overlay.
       */
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  /**
       *  An HTMLElement or a model Object with a corresponding view registered. Only
       *  applicable to the gutter, overlay and block types.
       */
  var item: js.UndefOr[js.Object] = js.undefined
  /**
       *  If true, the decoration will only be applied if the associated DisplayMarker
       *  is empty. Only applicable to the gutter, line, and line-number types.
       */
  var onlyEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  If true, the decoration will only be applied to the head of the DisplayMarker.
       *  Only applicable to the line and line-number types.
       */
  var onlyHead: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  If true, the decoration will only be applied if the associated DisplayMarker
       *  is non-empty. Only applicable to the gutter, line, and line-number types.
       */
  var onlyNonEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
       *  Only applicable to decorations of type overlay and block. Controls where the
       *  view is positioned relative to the TextEditorMarker. Values can be
       *  'head' (the default) or 'tail' for overlay decorations, and 'before' (the default)
       *  or 'after' for block decorations.
       */
  var position: js.UndefOr[
    atomLib.atomLibStrings.head | atomLib.atomLibStrings.tail | atomLib.atomLibStrings.before | atomLib.atomLibStrings.after
  ] = js.undefined
}

