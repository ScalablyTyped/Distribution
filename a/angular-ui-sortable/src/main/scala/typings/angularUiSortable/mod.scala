package typings.angularUiSortable

import typings.angular.JQuery
import typings.angular.JQueryEventObject
import typings.angular.JQueryStatic
import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IScope
import typings.angular.mod.auto.IInjectorService
import typings.angularUiSortable.angularUiSortableStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object ui {
    
    // Base Sortable //////////////////////////////////////////////////
    @js.native
    trait SortableCursorAtOptions extends StObject {
      
      var bottom: js.UndefOr[Double] = js.native
      
      var left: js.UndefOr[Double] = js.native
      
      var right: js.UndefOr[Double] = js.native
      
      var top: js.UndefOr[Double] = js.native
    }
    object SortableCursorAtOptions {
      
      @scala.inline
      def apply(): SortableCursorAtOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SortableCursorAtOptions]
      }
      
      @scala.inline
      implicit class SortableCursorAtOptionsMutableBuilder[Self <: SortableCursorAtOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        @scala.inline
        def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
    
    type SortableEvent[T] = js.Function2[/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T], Unit]
    
    @js.native
    trait SortableEvents[T] extends StObject {
      
      var activate: js.UndefOr[SortableEvent[T]] = js.native
      
      var beforeStop: js.UndefOr[SortableEvent[T]] = js.native
      
      var change: js.UndefOr[SortableEvent[T]] = js.native
      
      var deactivate: js.UndefOr[SortableEvent[T]] = js.native
      
      var out: js.UndefOr[SortableEvent[T]] = js.native
      
      var over: js.UndefOr[SortableEvent[T]] = js.native
      
      var receive: js.UndefOr[SortableEvent[T]] = js.native
      
      var remove: js.UndefOr[SortableEvent[T]] = js.native
      
      var sort: js.UndefOr[SortableEvent[T]] = js.native
      
      var start: js.UndefOr[SortableEvent[T]] = js.native
      
      var stop: js.UndefOr[SortableEvent[T]] = js.native
      
      var update: js.UndefOr[SortableEvent[T]] = js.native
    }
    object SortableEvents {
      
      @scala.inline
      def apply[T](): SortableEvents[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SortableEvents[T]]
      }
      
      @scala.inline
      implicit class SortableEventsMutableBuilder[Self <: SortableEvents[_], T] (val x: Self with SortableEvents[T]) extends AnyVal {
        
        @scala.inline
        def setActivate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction2(value))
        
        @scala.inline
        def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
        
        @scala.inline
        def setBeforeStop(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "beforeStop", js.Any.fromFunction2(value))
        
        @scala.inline
        def setBeforeStopUndefined: Self = StObject.set(x, "beforeStop", js.undefined)
        
        @scala.inline
        def setChange(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
        
        @scala.inline
        def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
        
        @scala.inline
        def setDeactivate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDeactivateUndefined: Self = StObject.set(x, "deactivate", js.undefined)
        
        @scala.inline
        def setOut(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "out", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
        
        @scala.inline
        def setOver(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "over", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOverUndefined: Self = StObject.set(x, "over", js.undefined)
        
        @scala.inline
        def setReceive(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "receive", js.Any.fromFunction2(value))
        
        @scala.inline
        def setReceiveUndefined: Self = StObject.set(x, "receive", js.undefined)
        
        @scala.inline
        def setRemove(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
        
        @scala.inline
        def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
        
        @scala.inline
        def setSort(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
        
        @scala.inline
        def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
        
        @scala.inline
        def setStart(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        @scala.inline
        def setStop(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
        
        @scala.inline
        def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
        
        @scala.inline
        def setUpdate(value: (/* event */ JQueryEventObject, /* ui */ UISortableUIParams[T]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
        
        @scala.inline
        def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
      }
    }
    
    type SortableHelperFunctionOption = js.Function2[/* event */ JQueryEventObject, /* ui */ IAugmentedJQuery, JQuery]
    
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
      implicit class SortableOptionsMutableBuilder[Self <: SortableOptions[_], T] (val x: Self with SortableOptions[T]) extends AnyVal {
        
        @scala.inline
        def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
        
        @scala.inline
        def setAxis(value: String | Boolean): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
        
        @scala.inline
        def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
        
        @scala.inline
        def setConnectWith(value: String | Boolean): Self = StObject.set(x, "connectWith", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectWithUndefined: Self = StObject.set(x, "connectWith", js.undefined)
        
        @scala.inline
        def setContainment(value: js.Any): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
        
        @scala.inline
        def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCursorAt(value: SortableCursorAtOptions | Boolean): Self = StObject.set(x, "cursorAt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCursorAtUndefined: Self = StObject.set(x, "cursorAt", js.undefined)
        
        @scala.inline
        def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
        
        @scala.inline
        def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
        
        @scala.inline
        def setDropOnEmpty(value: Boolean): Self = StObject.set(x, "dropOnEmpty", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDropOnEmptyUndefined: Self = StObject.set(x, "dropOnEmpty", js.undefined)
        
        @scala.inline
        def setForceHelperSize(value: Boolean): Self = StObject.set(x, "forceHelperSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceHelperSizeUndefined: Self = StObject.set(x, "forceHelperSize", js.undefined)
        
        @scala.inline
        def setForcePlaceholderSize(value: Boolean): Self = StObject.set(x, "forcePlaceholderSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForcePlaceholderSizeUndefined: Self = StObject.set(x, "forcePlaceholderSize", js.undefined)
        
        @scala.inline
        def setGrid(value: js.Array[Double] | Boolean): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
        
        @scala.inline
        def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value :_*))
        
        @scala.inline
        def setHandle(value: js.Any): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
        
        @scala.inline
        def setHelper(value: String | SortableHelperFunctionOption): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHelperFunction2(value: (/* event */ JQueryEventObject, /* ui */ IAugmentedJQuery) => JQuery): Self = StObject.set(x, "helper", js.Any.fromFunction2(value))
        
        @scala.inline
        def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
        
        @scala.inline
        def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setOpacity(value: Double | Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        @scala.inline
        def setPlaceholder(value: String | Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
        
        @scala.inline
        def setRevert(value: Double | Boolean): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevertUndefined: Self = StObject.set(x, "revert", js.undefined)
        
        @scala.inline
        def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
        
        @scala.inline
        def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
        
        @scala.inline
        def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
        
        @scala.inline
        def setTolerance(value: String): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
        
        @scala.inline
        def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      }
    }
    
    @js.native
    trait SortableUIParams extends StObject {
      
      var helper: IAugmentedJQuery = js.native
      
      var item: IAugmentedJQuery = js.native
      
      var offset: js.Any = js.native
      
      var originalPosition: js.Any = js.native
      
      var placeholder: IAugmentedJQuery = js.native
      
      var position: js.Any = js.native
      
      var sender: IAugmentedJQuery = js.native
    }
    object SortableUIParams {
      
      @scala.inline
      def apply(
        helper: IAugmentedJQuery,
        item: IAugmentedJQuery,
        offset: js.Any,
        originalPosition: js.Any,
        placeholder: IAugmentedJQuery,
        position: js.Any,
        sender: IAugmentedJQuery
      ): SortableUIParams = {
        val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
        __obj.asInstanceOf[SortableUIParams]
      }
      
      @scala.inline
      implicit class SortableUIParamsMutableBuilder[Self <: SortableUIParams] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHelper(value: IAugmentedJQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItem(value: IAugmentedJQuery): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholder(value: IAugmentedJQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSender(value: IAugmentedJQuery): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait UISortableOptions[T] extends SortableOptions[T] {
      
      var `ui-floating`: js.UndefOr[auto | Boolean] = js.native
    }
    object UISortableOptions {
      
      @scala.inline
      def apply[T](): UISortableOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UISortableOptions[T]]
      }
      
      @scala.inline
      implicit class UISortableOptionsMutableBuilder[Self <: UISortableOptions[_], T] (val x: Self with UISortableOptions[T]) extends AnyVal {
        
        @scala.inline
        def `setUi-floating`(value: auto | Boolean): Self = StObject.set(x, "ui-floating", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setUi-floatingUndefined`: Self = StObject.set(x, "ui-floating", js.undefined)
      }
    }
    
    @js.native
    trait UISortableProperties[T] extends StObject {
      
      /**
        * Can be called inside the `update` callback, in order to prevent/revert a sorting.
        * Should be used instead of the [jquery-ui-sortable cancel()](http://api.jqueryui.com/sortable/#method-cancel) method.
        */
      def cancel(): Unit = js.native
      
      /**
        * Holds the index of the drop target that the dragged item was dropped.
        */
      var dropindex: Double = js.native
      
      /**
        * Holds the ui-sortable element that the dragged item was dropped on.
        */
      var droptarget: Double = js.native
      
      /**
        * Holds the array that is specified by the `ng-model` attribute of the [`droptarget`](#droptarget) ui-sortable element.
        */
      var droptargetModel: js.Array[T] = js.native
      
      /**
        * Holds the original index of the item dragged.
        */
      var index: Double = js.native
      
      /**
        * Returns whether the current sorting is marked as canceled, by an earlier call to [`ui.item.sortable.cancel()`](#cancel).
        */
      def isCanceled(): Boolean = js.native
      
      /**
        * Returns whether the [`helper`](http://api.jqueryui.com/sortable/#option-helper) element used for the current sorting, is one of the original ui-sortable list elements.
        */
      def isCustomHelperUsed(): Boolean = js.native
      
      /**
        * Holds the JavaScript object that is used as the model of the dragged item, as specified by the ng-repeat of the [`source`](#source) ui-sortable element and the item's [`index`](#index).
        */
      var model: T = js.native
      
      /**
        * Holds the model of the dragged item only when a sorting happens between two connected ui-sortable elements.
        * In other words: `'moved' in ui.item.sortable` will return false only when a sorting is withing the same ui-sortable element ([`source`](#source) equals to the [`droptarget`](#droptarget)).
        */
      var moved: js.UndefOr[T] = js.native
      
      /**
        * When sorting between two connected sortables, it will be set to true inside the `update` callback of the [`droptarget`](#droptarget).
        */
      var received: Boolean = js.native
      
      /**
        * Holds the ui-sortable element that the dragged item originated from.
        */
      var source: IAugmentedJQuery = js.native
      
      /**
        * Holds the array that is specified by the `ng-model` of the [`source`](#source) ui-sortable element.
        */
      var sourceModel: js.Array[T] = js.native
    }
    object UISortableProperties {
      
      @scala.inline
      def apply[T](
        cancel: () => Unit,
        dropindex: Double,
        droptarget: Double,
        droptargetModel: js.Array[T],
        index: Double,
        isCanceled: () => Boolean,
        isCustomHelperUsed: () => Boolean,
        model: T,
        received: Boolean,
        source: IAugmentedJQuery,
        sourceModel: js.Array[T]
      ): UISortableProperties[T] = {
        val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dropindex = dropindex.asInstanceOf[js.Any], droptarget = droptarget.asInstanceOf[js.Any], droptargetModel = droptargetModel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isCanceled = js.Any.fromFunction0(isCanceled), isCustomHelperUsed = js.Any.fromFunction0(isCustomHelperUsed), model = model.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceModel = sourceModel.asInstanceOf[js.Any])
        __obj.asInstanceOf[UISortableProperties[T]]
      }
      
      @scala.inline
      implicit class UISortablePropertiesMutableBuilder[Self <: UISortableProperties[_], T] (val x: Self with UISortableProperties[T]) extends AnyVal {
        
        @scala.inline
        def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDropindex(value: Double): Self = StObject.set(x, "dropindex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDroptarget(value: Double): Self = StObject.set(x, "droptarget", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDroptargetModel(value: js.Array[T]): Self = StObject.set(x, "droptargetModel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDroptargetModelVarargs(value: T*): Self = StObject.set(x, "droptargetModel", js.Array(value :_*))
        
        @scala.inline
        def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsCanceled(value: () => Boolean): Self = StObject.set(x, "isCanceled", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsCustomHelperUsed(value: () => Boolean): Self = StObject.set(x, "isCustomHelperUsed", js.Any.fromFunction0(value))
        
        @scala.inline
        def setModel(value: T): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMoved(value: T): Self = StObject.set(x, "moved", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
        
        @scala.inline
        def setReceived(value: Boolean): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSource(value: IAugmentedJQuery): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceModel(value: js.Array[T]): Self = StObject.set(x, "sourceModel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceModelVarargs(value: T*): Self = StObject.set(x, "sourceModel", js.Array(value :_*))
      }
    }
    
    /* Inlined parent std.Omit<angular.angular.IAugmentedJQuery, 'sortable'> */
    @js.native
    trait UISortableUIItem[T] extends StObject {
      
      def addClass(className: String): this.type = js.native
      @JSName("addClass")
      var addClass_Original: js.Function1[/* className */ String, this.type] = js.native
      
      def after(content1: JQuery, content2: js.Any*): this.type = js.native
      @JSName("after")
      var after_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type] = js.native
      
      def append(content1: JQuery, content2: js.Any*): this.type = js.native
      @JSName("append")
      var append_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type] = js.native
      
      def attr(attributeName: String): String = js.native
      @JSName("attr")
      var attr_Original: js.Function1[/* attributeName */ String, String] = js.native
      
      def bind(eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): this.type = js.native
      @JSName("bind")
      var bind_Original: js.Function2[
            /* eventType */ String, 
            /* handler */ js.Function1[/* eventObject */ JQueryEventObject, _], 
            this.type
          ] = js.native
      
      def children(): this.type = js.native
      @JSName("children")
      var children_Original: js.Function0[this.type] = js.native
      
      @JSName("clone")
      var clone_Original: js.Function0[this.type] = js.native
      
      def contents(): this.type = js.native
      @JSName("contents")
      var contents_Original: js.Function0[this.type] = js.native
      
      def controller(): js.Any = js.native
      @JSName("controller")
      var controller_Original: js.Function0[_] = js.native
      
      def css(propertyName: String): String = js.native
      @JSName("css")
      var css_Original: js.Function1[/* propertyName */ String, String] = js.native
      
      def data(key: String, value: js.Any): this.type = js.native
      @JSName("data")
      var data_Original: js.Function2[/* key */ String, /* value */ js.Any, this.type] = js.native
      
      def detach(): this.type = js.native
      @JSName("detach")
      var detach_Original: js.Function0[this.type] = js.native
      
      def empty(): this.type = js.native
      @JSName("empty")
      var empty_Original: js.Function0[this.type] = js.native
      
      def eq(index: Double): this.type = js.native
      @JSName("eq")
      var eq_Original: js.Function1[/* index */ Double, this.type] = js.native
      
      def find(selector: String): this.type = js.native
      @JSName("find")
      var find_Original: js.Function1[/* selector */ String, this.type] = js.native
      
      def hasClass(className: String): Boolean = js.native
      @JSName("hasClass")
      var hasClass_Original: js.Function1[/* className */ String, Boolean] = js.native
      
      def html(): String = js.native
      @JSName("html")
      var html_Original: js.Function0[String] = js.native
      
      def inheritedData(key: String, value: js.Any): this.type = js.native
      @JSName("inheritedData")
      var inheritedData_Original: js.Function2[/* key */ String, /* value */ js.Any, this.type] = js.native
      
      def injector(): IInjectorService = js.native
      @JSName("injector")
      var injector_Original: js.Function0[IInjectorService] = js.native
      
      def isolateScope[T /* <: IScope */](): T = js.native
      @JSName("isolateScope")
      var isolateScope_Original: js.Function0[IScope] = js.native
      
      var length: Double = js.native
      
      def next(): this.type = js.native
      @JSName("next")
      var next_Original: js.Function0[this.type] = js.native
      
      def off(): this.type = js.native
      @JSName("off")
      var off_Original: js.Function0[this.type] = js.native
      
      def on(
        events: String,
        handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _]
      ): this.type = js.native
      @JSName("on")
      var on_Original: js.Function2[
            /* events */ String, 
            /* handler */ js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, _], 
            this.type
          ] = js.native
      
      def one(events: String, handler: js.Function1[/* eventObject */ JQueryEventObject, _]): this.type = js.native
      @JSName("one")
      var one_Original: js.Function2[
            /* events */ String, 
            /* handler */ js.Function1[/* eventObject */ JQueryEventObject, _], 
            this.type
          ] = js.native
      
      def parent(): this.type = js.native
      @JSName("parent")
      var parent_Original: js.Function0[this.type] = js.native
      
      def prepend(content1: JQuery, content2: js.Any*): this.type = js.native
      @JSName("prepend")
      var prepend_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type] = js.native
      
      def prop(propertyName: String): js.Any = js.native
      @JSName("prop")
      var prop_Original: js.Function1[/* propertyName */ String, _] = js.native
      
      def ready(handler: js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], _]): this.type = js.native
      @JSName("ready")
      var ready_Original: js.Function1[
            /* handler */ js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], _], 
            this.type
          ] = js.native
      
      def remove(): this.type = js.native
      
      def removeAttr(attributeName: String): this.type = js.native
      @JSName("removeAttr")
      var removeAttr_Original: js.Function1[/* attributeName */ String, this.type] = js.native
      
      def removeClass(): this.type = js.native
      @JSName("removeClass")
      var removeClass_Original: js.Function0[this.type] = js.native
      
      def removeData(name: String): this.type = js.native
      @JSName("removeData")
      var removeData_Original: js.Function1[/* name */ String, this.type] = js.native
      
      @JSName("remove")
      var remove_Original: js.Function0[this.type] = js.native
      
      def replaceWith(newContent: JQuery): this.type = js.native
      @JSName("replaceWith")
      var replaceWith_Original: js.Function1[/* newContent */ JQuery, this.type] = js.native
      
      def scope[T /* <: IScope */](): T = js.native
      @JSName("scope")
      var scope_Original: js.Function0[IScope] = js.native
      
      var sortable: UISortableProperties[T] = js.native
      
      def text(): String = js.native
      @JSName("text")
      var text_Original: js.Function0[String] = js.native
      
      def toggleClass(className: String): this.type = js.native
      @JSName("toggleClass")
      var toggleClass_Original: js.Function1[/* className */ String, this.type] = js.native
      
      def triggerHandler(eventType: String, extraParameters: js.Any*): js.Object = js.native
      @JSName("triggerHandler")
      var triggerHandler_Original: js.Function2[/* eventType */ String, /* repeated */ js.Any, js.Object] = js.native
      
      def unbind(): this.type = js.native
      @JSName("unbind")
      var unbind_Original: js.Function0[this.type] = js.native
      
      def `val`(): js.Any = js.native
      @JSName("val")
      var val_Original: js.Function0[_] = js.native
      
      def wrap(wrappingElement: JQuery): this.type = js.native
      @JSName("wrap")
      var wrap_Original: js.Function1[/* wrappingElement */ JQuery, this.type] = js.native
    }
    
    /* Inlined parent std.Omit<angular-ui-sortable.angular.ui.SortableUIParams, 'item'> */
    @js.native
    trait UISortableUIParams[T] extends StObject {
      
      var helper: IAugmentedJQuery = js.native
      
      var item: UISortableUIItem[T] = js.native
      
      var offset: js.Any = js.native
      
      var originalPosition: js.Any = js.native
      
      var placeholder: IAugmentedJQuery = js.native
      
      var position: js.Any = js.native
      
      var sender: IAugmentedJQuery = js.native
    }
    object UISortableUIParams {
      
      @scala.inline
      def apply[T](
        helper: IAugmentedJQuery,
        item: UISortableUIItem[T],
        offset: js.Any,
        originalPosition: js.Any,
        placeholder: IAugmentedJQuery,
        position: js.Any,
        sender: IAugmentedJQuery
      ): UISortableUIParams[T] = {
        val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], originalPosition = originalPosition.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
        __obj.asInstanceOf[UISortableUIParams[T]]
      }
      
      @scala.inline
      implicit class UISortableUIParamsMutableBuilder[Self <: UISortableUIParams[_], T] (val x: Self with UISortableUIParams[T]) extends AnyVal {
        
        @scala.inline
        def setHelper(value: IAugmentedJQuery): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItem(value: UISortableUIItem[T]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginalPosition(value: js.Any): Self = StObject.set(x, "originalPosition", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlaceholder(value: IAugmentedJQuery): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSender(value: IAugmentedJQuery): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      }
    }
  }
}
