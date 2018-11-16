package typings
package angularDashUiDashSortableLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SortableOptions[T] extends SortableEvents[T] {
  /**
               * jQuery, Element, Selector or string
               * Default: "parent"
               */
  var appendTo: js.UndefOr[js.Any] = js.undefined
  /**
               * "X", "Y" or false
               * Default: false
               */
  var axis: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
               * Selector
               * Default: "input,textarea,button,select,option"
               */
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Selector or false
               * Default: false
               */
  var connectWith: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
               * Element, Selector, string or false
               * Default: false
               */
  var containment: js.UndefOr[js.Any] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash using a combination of one or two keys SortableCursorAtOptions: { top, left, right, bottom }
               * Default: false
               */
  var cursorAt: js.UndefOr[SortableCursorAtOptions | scala.Boolean] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var dropOnEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var forceHelperSize: js.UndefOr[scala.Boolean] = js.undefined
  var forcePlaceholderSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Array of numbers or false
               * Default: false
               */
  var grid: js.UndefOr[js.Array[scala.Double] | scala.Boolean] = js.undefined
  /**
               * Selector or Element
               */
  var handle: js.UndefOr[js.Any] = js.undefined
  /**
               * "original", "clone" or Function()
               * Default: "original"
               */
  var helper: js.UndefOr[java.lang.String | SortableHelperFunctionOption] = js.undefined
  /**
               * Selector
               */
  var items: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Number or false
               * Default: false
               */
  var opacity: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
               * string or false
               * Default: false
               */
  var placeholder: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
               * boolean or number
               * Default: false
               */
  var revert: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
  var scrollSensitivity: js.UndefOr[scala.Double] = js.undefined
  var scrollSpeed: js.UndefOr[scala.Double] = js.undefined
  /**
               * "intersect" or "pointer"
               * Default: "intersect"
               */
  var tolerance: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

