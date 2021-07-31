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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object ui {
    
    // Base Sortable //////////////////////////////////////////////////
    trait SortableCursorAtOptions extends StObject {
      
      var bottom: js.UndefOr[Double] = js.undefined
      
      var left: js.UndefOr[Double] = js.undefined
      
      var right: js.UndefOr[Double] = js.undefined
      
      var top: js.UndefOr[Double] = js.undefined
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
    
    trait SortableEvents[T] extends StObject {
      
      var activate: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var beforeStop: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var change: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var deactivate: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var out: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var over: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var receive: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var remove: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var sort: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var start: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var stop: js.UndefOr[SortableEvent[T]] = js.undefined
      
      var update: js.UndefOr[SortableEvent[T]] = js.undefined
    }
    object SortableEvents {
      
      @scala.inline
      def apply[T](): SortableEvents[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SortableEvents[T]]
      }
      
      @scala.inline
      implicit class SortableEventsMutableBuilder[Self <: SortableEvents[?], T] (val x: Self & SortableEvents[T]) extends AnyVal {
        
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
    
    trait SortableOptions[T]
      extends StObject
         with SortableEvents[T] {
      
      /**
        * jQuery, Element, Selector or string
        * Default: "parent"
        */
      var appendTo: js.UndefOr[js.Any] = js.undefined
      
      /**
        * "X", "Y" or false
        * Default: false
        */
      var axis: js.UndefOr[String | Boolean] = js.undefined
      
      /**
        * Selector
        * Default: "input,textarea,button,select,option"
        */
      var cancel: js.UndefOr[String] = js.undefined
      
      /**
        * Selector or false
        * Default: false
        */
      var connectWith: js.UndefOr[String | Boolean] = js.undefined
      
      /**
        * Element, Selector, string or false
        * Default: false
        */
      var containment: js.UndefOr[js.Any] = js.undefined
      
      var cursor: js.UndefOr[String] = js.undefined
      
      /**
        * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash using a combination of one or two keys SortableCursorAtOptions: { top, left, right, bottom }
        * Default: false
        */
      var cursorAt: js.UndefOr[SortableCursorAtOptions | Boolean] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var disabled: js.UndefOr[Boolean] = js.undefined
      
      var distance: js.UndefOr[Double] = js.undefined
      
      var dropOnEmpty: js.UndefOr[Boolean] = js.undefined
      
      var forceHelperSize: js.UndefOr[Boolean] = js.undefined
      
      var forcePlaceholderSize: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Array of numbers or false
        * Default: false
        */
      var grid: js.UndefOr[js.Array[Double] | Boolean] = js.undefined
      
      /**
        * Selector or Element
        */
      var handle: js.UndefOr[js.Any] = js.undefined
      
      /**
        * "original", "clone" or Function()
        * Default: "original"
        */
      var helper: js.UndefOr[String | SortableHelperFunctionOption] = js.undefined
      
      /**
        * Selector
        */
      var items: js.UndefOr[String] = js.undefined
      
      /**
        * Number or false
        * Default: false
        */
      var opacity: js.UndefOr[Double | Boolean] = js.undefined
      
      /**
        * string or false
        * Default: false
        */
      var placeholder: js.UndefOr[String | Boolean] = js.undefined
      
      /**
        * boolean or number
        * Default: false
        */
      var revert: js.UndefOr[Double | Boolean] = js.undefined
      
      var scroll: js.UndefOr[Boolean] = js.undefined
      
      var scrollSensitivity: js.UndefOr[Double] = js.undefined
      
      var scrollSpeed: js.UndefOr[Double] = js.undefined
      
      /**
        * "intersect" or "pointer"
        * Default: "intersect"
        */
      var tolerance: js.UndefOr[String] = js.undefined
      
      var zIndex: js.UndefOr[Double] = js.undefined
    }
    object SortableOptions {
      
      @scala.inline
      def apply[T](): SortableOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SortableOptions[T]]
      }
      
      @scala.inline
      implicit class SortableOptionsMutableBuilder[Self <: SortableOptions[?], T] (val x: Self & SortableOptions[T]) extends AnyVal {
        
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
    
    trait SortableUIParams extends StObject {
      
      var helper: IAugmentedJQuery
      
      var item: IAugmentedJQuery
      
      var offset: js.Any
      
      var originalPosition: js.Any
      
      var placeholder: IAugmentedJQuery
      
      var position: js.Any
      
      var sender: IAugmentedJQuery
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
    
    trait UISortableOptions[T]
      extends StObject
         with SortableOptions[T] {
      
      var `ui-floating`: js.UndefOr[auto | Boolean] = js.undefined
    }
    object UISortableOptions {
      
      @scala.inline
      def apply[T](): UISortableOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UISortableOptions[T]]
      }
      
      @scala.inline
      implicit class UISortableOptionsMutableBuilder[Self <: UISortableOptions[?], T] (val x: Self & UISortableOptions[T]) extends AnyVal {
        
        @scala.inline
        def `setUi-floating`(value: auto | Boolean): Self = StObject.set(x, "ui-floating", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setUi-floatingUndefined`: Self = StObject.set(x, "ui-floating", js.undefined)
      }
    }
    
    trait UISortableProperties[T] extends StObject {
      
      /**
        * Can be called inside the `update` callback, in order to prevent/revert a sorting.
        * Should be used instead of the [jquery-ui-sortable cancel()](http://api.jqueryui.com/sortable/#method-cancel) method.
        */
      def cancel(): Unit
      
      /**
        * Holds the index of the drop target that the dragged item was dropped.
        */
      var dropindex: Double
      
      /**
        * Holds the ui-sortable element that the dragged item was dropped on.
        */
      var droptarget: Double
      
      /**
        * Holds the array that is specified by the `ng-model` attribute of the [`droptarget`](#droptarget) ui-sortable element.
        */
      var droptargetModel: js.Array[T]
      
      /**
        * Holds the original index of the item dragged.
        */
      var index: Double
      
      /**
        * Returns whether the current sorting is marked as canceled, by an earlier call to [`ui.item.sortable.cancel()`](#cancel).
        */
      def isCanceled(): Boolean
      
      /**
        * Returns whether the [`helper`](http://api.jqueryui.com/sortable/#option-helper) element used for the current sorting, is one of the original ui-sortable list elements.
        */
      def isCustomHelperUsed(): Boolean
      
      /**
        * Holds the JavaScript object that is used as the model of the dragged item, as specified by the ng-repeat of the [`source`](#source) ui-sortable element and the item's [`index`](#index).
        */
      var model: T
      
      /**
        * Holds the model of the dragged item only when a sorting happens between two connected ui-sortable elements.
        * In other words: `'moved' in ui.item.sortable` will return false only when a sorting is withing the same ui-sortable element ([`source`](#source) equals to the [`droptarget`](#droptarget)).
        */
      var moved: js.UndefOr[T] = js.undefined
      
      /**
        * When sorting between two connected sortables, it will be set to true inside the `update` callback of the [`droptarget`](#droptarget).
        */
      var received: Boolean
      
      /**
        * Holds the ui-sortable element that the dragged item originated from.
        */
      var source: IAugmentedJQuery
      
      /**
        * Holds the array that is specified by the `ng-model` of the [`source`](#source) ui-sortable element.
        */
      var sourceModel: js.Array[T]
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
      implicit class UISortablePropertiesMutableBuilder[Self <: UISortableProperties[?], T] (val x: Self & UISortableProperties[T]) extends AnyVal {
        
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
    trait UISortableUIItem[T] extends StObject {
      
      def addClass(className: String): this.type
      @JSName("addClass")
      var addClass_Original: js.Function1[/* className */ String, this.type]
      
      def after(content1: JQuery, content2: js.Any*): this.type
      @JSName("after")
      var after_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type]
      
      def append(content1: JQuery, content2: js.Any*): this.type
      @JSName("append")
      var append_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type]
      
      def attr(attributeName: String): String
      @JSName("attr")
      var attr_Original: js.Function1[/* attributeName */ String, String]
      
      def bind(eventType: String, handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]): this.type
      @JSName("bind")
      var bind_Original: js.Function2[
            /* eventType */ String, 
            /* handler */ js.Function1[/* eventObject */ JQueryEventObject, js.Any], 
            this.type
          ]
      
      def children(): this.type
      @JSName("children")
      var children_Original: js.Function0[this.type]
      
      @JSName("clone")
      var clone_Original: js.Function0[this.type]
      
      def contents(): this.type
      @JSName("contents")
      var contents_Original: js.Function0[this.type]
      
      def controller(): js.Any
      @JSName("controller")
      var controller_Original: js.Function0[js.Any]
      
      def css(propertyName: String): String
      @JSName("css")
      var css_Original: js.Function1[/* propertyName */ String, String]
      
      def data(key: String, value: js.Any): this.type
      @JSName("data")
      var data_Original: js.Function2[/* key */ String, /* value */ js.Any, this.type]
      
      def detach(): this.type
      @JSName("detach")
      var detach_Original: js.Function0[this.type]
      
      def empty(): this.type
      @JSName("empty")
      var empty_Original: js.Function0[this.type]
      
      def eq(index: Double): this.type
      @JSName("eq")
      var eq_Original: js.Function1[/* index */ Double, this.type]
      
      def find(selector: String): this.type
      @JSName("find")
      var find_Original: js.Function1[/* selector */ String, this.type]
      
      def hasClass(className: String): Boolean
      @JSName("hasClass")
      var hasClass_Original: js.Function1[/* className */ String, Boolean]
      
      def html(): String
      @JSName("html")
      var html_Original: js.Function0[String]
      
      def inheritedData(key: String, value: js.Any): this.type
      @JSName("inheritedData")
      var inheritedData_Original: js.Function2[/* key */ String, /* value */ js.Any, this.type]
      
      def injector(): IInjectorService
      @JSName("injector")
      var injector_Original: js.Function0[IInjectorService]
      
      def isolateScope[T /* <: IScope */](): T
      @JSName("isolateScope")
      var isolateScope_Original: js.Function0[IScope]
      
      var length: Double
      
      def next(): this.type
      @JSName("next")
      var next_Original: js.Function0[this.type]
      
      def off(): this.type
      @JSName("off")
      var off_Original: js.Function0[this.type]
      
      def on(
        events: String,
        handler: js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, js.Any]
      ): this.type
      @JSName("on")
      var on_Original: js.Function2[
            /* events */ String, 
            /* handler */ js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, js.Any], 
            this.type
          ]
      
      def one(events: String, handler: js.Function1[/* eventObject */ JQueryEventObject, js.Any]): this.type
      @JSName("one")
      var one_Original: js.Function2[
            /* events */ String, 
            /* handler */ js.Function1[/* eventObject */ JQueryEventObject, js.Any], 
            this.type
          ]
      
      def parent(): this.type
      @JSName("parent")
      var parent_Original: js.Function0[this.type]
      
      def prepend(content1: JQuery, content2: js.Any*): this.type
      @JSName("prepend")
      var prepend_Original: js.Function2[/* content1 */ JQuery, /* repeated */ js.Any, this.type]
      
      def prop(propertyName: String): js.Any
      @JSName("prop")
      var prop_Original: js.Function1[/* propertyName */ String, js.Any]
      
      def ready(handler: js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], js.Any]): this.type
      @JSName("ready")
      var ready_Original: js.Function1[
            /* handler */ js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], js.Any], 
            this.type
          ]
      
      def remove(): this.type
      
      def removeAttr(attributeName: String): this.type
      @JSName("removeAttr")
      var removeAttr_Original: js.Function1[/* attributeName */ String, this.type]
      
      def removeClass(): this.type
      @JSName("removeClass")
      var removeClass_Original: js.Function0[this.type]
      
      def removeData(name: String): this.type
      @JSName("removeData")
      var removeData_Original: js.Function1[/* name */ String, this.type]
      
      @JSName("remove")
      var remove_Original: js.Function0[this.type]
      
      def replaceWith(newContent: JQuery): this.type
      @JSName("replaceWith")
      var replaceWith_Original: js.Function1[/* newContent */ JQuery, this.type]
      
      def scope[T /* <: IScope */](): T
      @JSName("scope")
      var scope_Original: js.Function0[IScope]
      
      var sortable: UISortableProperties[T]
      
      def text(): String
      @JSName("text")
      var text_Original: js.Function0[String]
      
      def toggleClass(className: String): this.type
      @JSName("toggleClass")
      var toggleClass_Original: js.Function1[/* className */ String, this.type]
      
      def triggerHandler(eventType: String, extraParameters: js.Any*): js.Object
      @JSName("triggerHandler")
      var triggerHandler_Original: js.Function2[/* eventType */ String, /* repeated */ js.Any, js.Object]
      
      def unbind(): this.type
      @JSName("unbind")
      var unbind_Original: js.Function0[this.type]
      
      def `val`(): js.Any
      @JSName("val")
      var val_Original: js.Function0[js.Any]
      
      def wrap(wrappingElement: JQuery): this.type
      @JSName("wrap")
      var wrap_Original: js.Function1[/* wrappingElement */ JQuery, this.type]
    }
    object UISortableUIItem {
      
      @scala.inline
      def apply[T](
        addClass: /* className */ String => UISortableUIItem[T],
        after: (/* content1 */ JQuery, /* repeated */ js.Any) => UISortableUIItem[T],
        append: (/* content1 */ JQuery, /* repeated */ js.Any) => UISortableUIItem[T],
        attr: /* attributeName */ String => String,
        bind: (/* eventType */ String, /* handler */ js.Function1[/* eventObject */ JQueryEventObject, js.Any]) => UISortableUIItem[T],
        children: () => UISortableUIItem[T],
        clone_ : () => UISortableUIItem[T],
        contents: () => UISortableUIItem[T],
        controller: () => js.Any,
        css: /* propertyName */ String => String,
        data: (/* key */ String, /* value */ js.Any) => UISortableUIItem[T],
        detach: () => UISortableUIItem[T],
        empty: () => UISortableUIItem[T],
        eq_ : /* index */ Double => UISortableUIItem[T],
        find: /* selector */ String => UISortableUIItem[T],
        hasClass: /* className */ String => Boolean,
        html: () => String,
        inheritedData: (/* key */ String, /* value */ js.Any) => UISortableUIItem[T],
        injector: () => IInjectorService,
        isolateScope: () => IScope,
        length: Double,
        next: () => UISortableUIItem[T],
        off: () => UISortableUIItem[T],
        on: (/* events */ String, /* handler */ js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, js.Any]) => UISortableUIItem[T],
        one: (/* events */ String, /* handler */ js.Function1[/* eventObject */ JQueryEventObject, js.Any]) => UISortableUIItem[T],
        parent: () => UISortableUIItem[T],
        prepend: (/* content1 */ JQuery, /* repeated */ js.Any) => UISortableUIItem[T],
        prop: /* propertyName */ String => js.Any,
        ready: /* handler */ js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], js.Any] => UISortableUIItem[T],
        remove: () => UISortableUIItem[T],
        removeAttr: /* attributeName */ String => UISortableUIItem[T],
        removeClass: () => UISortableUIItem[T],
        removeData: /* name */ String => UISortableUIItem[T],
        replaceWith: /* newContent */ JQuery => UISortableUIItem[T],
        scope: () => IScope,
        sortable: UISortableProperties[T],
        text: () => String,
        toggleClass: /* className */ String => UISortableUIItem[T],
        triggerHandler: (/* eventType */ String, /* repeated */ js.Any) => js.Object,
        unbind: () => UISortableUIItem[T],
        `val`: () => js.Any,
        wrap: /* wrappingElement */ JQuery => UISortableUIItem[T]
      ): UISortableUIItem[T] = {
        val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1(addClass), after = js.Any.fromFunction2(after), append = js.Any.fromFunction2(append), attr = js.Any.fromFunction1(attr), bind = js.Any.fromFunction2(bind), children = js.Any.fromFunction0(children), contents = js.Any.fromFunction0(contents), controller = js.Any.fromFunction0(controller), css = js.Any.fromFunction1(css), data = js.Any.fromFunction2(data), detach = js.Any.fromFunction0(detach), empty = js.Any.fromFunction0(empty), find = js.Any.fromFunction1(find), hasClass = js.Any.fromFunction1(hasClass), html = js.Any.fromFunction0(html), inheritedData = js.Any.fromFunction2(inheritedData), injector = js.Any.fromFunction0(injector), isolateScope = js.Any.fromFunction0(isolateScope), length = length.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), off = js.Any.fromFunction0(off), on = js.Any.fromFunction2(on), one = js.Any.fromFunction2(one), parent = js.Any.fromFunction0(parent), prepend = js.Any.fromFunction2(prepend), prop = js.Any.fromFunction1(prop), ready = js.Any.fromFunction1(ready), remove = js.Any.fromFunction0(remove), removeAttr = js.Any.fromFunction1(removeAttr), removeClass = js.Any.fromFunction0(removeClass), removeData = js.Any.fromFunction1(removeData), replaceWith = js.Any.fromFunction1(replaceWith), scope = js.Any.fromFunction0(scope), sortable = sortable.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), toggleClass = js.Any.fromFunction1(toggleClass), triggerHandler = js.Any.fromFunction2(triggerHandler), unbind = js.Any.fromFunction0(unbind), wrap = js.Any.fromFunction1(wrap))
        __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
        __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
        __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
        __obj.asInstanceOf[UISortableUIItem[T]]
      }
      
      @scala.inline
      implicit class UISortableUIItemMutableBuilder[Self <: UISortableUIItem[?], T] (val x: Self & UISortableUIItem[T]) extends AnyVal {
        
        @scala.inline
        def setAddClass(value: /* className */ String => UISortableUIItem[T]): Self = StObject.set(x, "addClass", js.Any.fromFunction1(value))
        
        @scala.inline
        def setAfter(value: (/* content1 */ JQuery, /* repeated */ js.Any) => UISortableUIItem[T]): Self = StObject.set(x, "after", js.Any.fromFunction2(value))
        
        @scala.inline
        def setAppend(value: (/* content1 */ JQuery, /* repeated */ js.Any) => UISortableUIItem[T]): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
        
        @scala.inline
        def setAttr(value: /* attributeName */ String => String): Self = StObject.set(x, "attr", js.Any.fromFunction1(value))
        
        @scala.inline
        def setBind(
          value: (/* eventType */ String, /* handler */ js.Function1[/* eventObject */ JQueryEventObject, js.Any]) => UISortableUIItem[T]
        ): Self = StObject.set(x, "bind", js.Any.fromFunction2(value))
        
        @scala.inline
        def setChildren(value: () => UISortableUIItem[T]): Self = StObject.set(x, "children", js.Any.fromFunction0(value))
        
        @scala.inline
        def setClone_(value: () => UISortableUIItem[T]): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
        
        @scala.inline
        def setContents(value: () => UISortableUIItem[T]): Self = StObject.set(x, "contents", js.Any.fromFunction0(value))
        
        @scala.inline
        def setController(value: () => js.Any): Self = StObject.set(x, "controller", js.Any.fromFunction0(value))
        
        @scala.inline
        def setCss(value: /* propertyName */ String => String): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
        
        @scala.inline
        def setData(value: (/* key */ String, /* value */ js.Any) => UISortableUIItem[T]): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
        
        @scala.inline
        def setDetach(value: () => UISortableUIItem[T]): Self = StObject.set(x, "detach", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEmpty(value: () => UISortableUIItem[T]): Self = StObject.set(x, "empty", js.Any.fromFunction0(value))
        
        @scala.inline
        def setEq_(value: /* index */ Double => UISortableUIItem[T]): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFind(value: /* selector */ String => UISortableUIItem[T]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHasClass(value: /* className */ String => Boolean): Self = StObject.set(x, "hasClass", js.Any.fromFunction1(value))
        
        @scala.inline
        def setHtml(value: () => String): Self = StObject.set(x, "html", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInheritedData(value: (/* key */ String, /* value */ js.Any) => UISortableUIItem[T]): Self = StObject.set(x, "inheritedData", js.Any.fromFunction2(value))
        
        @scala.inline
        def setInjector(value: () => IInjectorService): Self = StObject.set(x, "injector", js.Any.fromFunction0(value))
        
        @scala.inline
        def setIsolateScope(value: () => IScope): Self = StObject.set(x, "isolateScope", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNext(value: () => UISortableUIItem[T]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOff(value: () => UISortableUIItem[T]): Self = StObject.set(x, "off", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOn(
          value: (/* events */ String, /* handler */ js.Function2[/* eventObject */ JQueryEventObject, /* repeated */ js.Any, js.Any]) => UISortableUIItem[T]
        ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOne(
          value: (/* events */ String, /* handler */ js.Function1[/* eventObject */ JQueryEventObject, js.Any]) => UISortableUIItem[T]
        ): Self = StObject.set(x, "one", js.Any.fromFunction2(value))
        
        @scala.inline
        def setParent(value: () => UISortableUIItem[T]): Self = StObject.set(x, "parent", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPrepend(value: (/* content1 */ JQuery, /* repeated */ js.Any) => UISortableUIItem[T]): Self = StObject.set(x, "prepend", js.Any.fromFunction2(value))
        
        @scala.inline
        def setProp(value: /* propertyName */ String => js.Any): Self = StObject.set(x, "prop", js.Any.fromFunction1(value))
        
        @scala.inline
        def setReady(
          value: /* handler */ js.Function1[/* jQueryAlias */ js.UndefOr[JQueryStatic], js.Any] => UISortableUIItem[T]
        ): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemove(value: () => UISortableUIItem[T]): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRemoveAttr(value: /* attributeName */ String => UISortableUIItem[T]): Self = StObject.set(x, "removeAttr", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRemoveClass(value: () => UISortableUIItem[T]): Self = StObject.set(x, "removeClass", js.Any.fromFunction0(value))
        
        @scala.inline
        def setRemoveData(value: /* name */ String => UISortableUIItem[T]): Self = StObject.set(x, "removeData", js.Any.fromFunction1(value))
        
        @scala.inline
        def setReplaceWith(value: /* newContent */ JQuery => UISortableUIItem[T]): Self = StObject.set(x, "replaceWith", js.Any.fromFunction1(value))
        
        @scala.inline
        def setScope(value: () => IScope): Self = StObject.set(x, "scope", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSortable(value: UISortableProperties[T]): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setText(value: () => String): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
        
        @scala.inline
        def setToggleClass(value: /* className */ String => UISortableUIItem[T]): Self = StObject.set(x, "toggleClass", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTriggerHandler(value: (/* eventType */ String, /* repeated */ js.Any) => js.Object): Self = StObject.set(x, "triggerHandler", js.Any.fromFunction2(value))
        
        @scala.inline
        def setUnbind(value: () => UISortableUIItem[T]): Self = StObject.set(x, "unbind", js.Any.fromFunction0(value))
        
        @scala.inline
        def setVal(value: () => js.Any): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
        
        @scala.inline
        def setWrap(value: /* wrappingElement */ JQuery => UISortableUIItem[T]): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
      }
    }
    
    /* Inlined parent std.Omit<angular-ui-sortable.angular.ui.SortableUIParams, 'item'> */
    trait UISortableUIParams[T] extends StObject {
      
      var helper: IAugmentedJQuery
      
      var item: UISortableUIItem[T]
      
      var offset: js.Any
      
      var originalPosition: js.Any
      
      var placeholder: IAugmentedJQuery
      
      var position: js.Any
      
      var sender: IAugmentedJQuery
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
      implicit class UISortableUIParamsMutableBuilder[Self <: UISortableUIParams[?], T] (val x: Self & UISortableUIParams[T]) extends AnyVal {
        
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
