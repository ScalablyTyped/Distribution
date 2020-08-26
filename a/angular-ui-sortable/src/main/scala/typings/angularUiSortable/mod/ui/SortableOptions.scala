package typings.angularUiSortable.mod.ui

import typings.angular.JQuery
import typings.angular.JQueryEventObject
import typings.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableOptions[T] extends SortableEvents[T] {
  /**
    * jQuery, Element, Selector or string
    * Default: "parent"
    */
  var appendTo: js.UndefOr[js.Any] = js.native
  /**
    * "X", "Y" or false
    * Default: false
    */
  var axis: js.UndefOr[String | Boolean] = js.native
  /**
    * Selector
    * Default: "input,textarea,button,select,option"
    */
  var cancel: js.UndefOr[String] = js.native
  /**
    * Selector or false
    * Default: false
    */
  var connectWith: js.UndefOr[String | Boolean] = js.native
  /**
    * Element, Selector, string or false
    * Default: false
    */
  var containment: js.UndefOr[js.Any] = js.native
  var cursor: js.UndefOr[String] = js.native
  /**
    * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash using a combination of one or two keys SortableCursorAtOptions: { top, left, right, bottom }
    * Default: false
    */
  var cursorAt: js.UndefOr[SortableCursorAtOptions | Boolean] = js.native
  var delay: js.UndefOr[Double] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var distance: js.UndefOr[Double] = js.native
  var dropOnEmpty: js.UndefOr[Boolean] = js.native
  var forceHelperSize: js.UndefOr[Boolean] = js.native
  var forcePlaceholderSize: js.UndefOr[Boolean] = js.native
  /**
    * Array of numbers or false
    * Default: false
    */
  var grid: js.UndefOr[js.Array[Double] | Boolean] = js.native
  /**
    * Selector or Element
    */
  var handle: js.UndefOr[js.Any] = js.native
  /**
    * "original", "clone" or Function()
    * Default: "original"
    */
  var helper: js.UndefOr[String | SortableHelperFunctionOption] = js.native
  /**
    * Selector
    */
  var items: js.UndefOr[String] = js.native
  /**
    * Number or false
    * Default: false
    */
  var opacity: js.UndefOr[Double | Boolean] = js.native
  /**
    * string or false
    * Default: false
    */
  var placeholder: js.UndefOr[String | Boolean] = js.native
  /**
    * boolean or number
    * Default: false
    */
  var revert: js.UndefOr[Double | Boolean] = js.native
  var scroll: js.UndefOr[Boolean] = js.native
  var scrollSensitivity: js.UndefOr[Double] = js.native
  var scrollSpeed: js.UndefOr[Double] = js.native
  /**
    * "intersect" or "pointer"
    * Default: "intersect"
    */
  var tolerance: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object SortableOptions {
  @scala.inline
  def apply[T](): SortableOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortableOptions[T]]
  }
  @scala.inline
  implicit class SortableOptionsOps[Self <: SortableOptions[_], T] (val x: Self with SortableOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppendTo(value: js.Any): Self = this.set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppendTo: Self = this.set("appendTo", js.undefined)
    @scala.inline
    def setAxis(value: String | Boolean): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setConnectWith(value: String | Boolean): Self = this.set("connectWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectWith: Self = this.set("connectWith", js.undefined)
    @scala.inline
    def setContainment(value: js.Any): Self = this.set("containment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setCursorAt(value: SortableCursorAtOptions | Boolean): Self = this.set("cursorAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorAt: Self = this.set("cursorAt", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setDropOnEmpty(value: Boolean): Self = this.set("dropOnEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropOnEmpty: Self = this.set("dropOnEmpty", js.undefined)
    @scala.inline
    def setForceHelperSize(value: Boolean): Self = this.set("forceHelperSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceHelperSize: Self = this.set("forceHelperSize", js.undefined)
    @scala.inline
    def setForcePlaceholderSize(value: Boolean): Self = this.set("forcePlaceholderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcePlaceholderSize: Self = this.set("forcePlaceholderSize", js.undefined)
    @scala.inline
    def setGridVarargs(value: Double*): Self = this.set("grid", js.Array(value :_*))
    @scala.inline
    def setGrid(value: js.Array[Double] | Boolean): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHandle(value: js.Any): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setHelperFunction2(value: (/* event */ JQueryEventObject, /* ui */ IAugmentedJQuery) => JQuery): Self = this.set("helper", js.Any.fromFunction2(value))
    @scala.inline
    def setHelper(value: String | SortableHelperFunctionOption): Self = this.set("helper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    @scala.inline
    def setItems(value: String): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOpacity(value: Double | Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPlaceholder(value: String | Boolean): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRevert(value: Double | Boolean): Self = this.set("revert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevert: Self = this.set("revert", js.undefined)
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    @scala.inline
    def setTolerance(value: String): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

