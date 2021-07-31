package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IPromise
import typings.angularStrap.anon.Hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Typeahead
// see http://mgcrea.github.io/angular-strap/#/typeaheads
///////////////////////////////////////////////////////////////////////////
object typeahead {
  
  trait ITypeahead extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit]
    
    def hide(): Unit
    
    def show(): Unit
    
    def toggle(): Unit
  }
  object ITypeahead {
    
    @scala.inline
    def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): ITypeahead = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[ITypeahead]
    }
    
    @scala.inline
    implicit class ITypeaheadMutableBuilder[Self <: ITypeahead] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$promise(value: IPromise[Unit]): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  trait ITypeaheadOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var autoSelect: js.UndefOr[Boolean] = js.undefined
    
    var comparator: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var trimValue: js.UndefOr[Boolean] = js.undefined
    
    var watchOptions: js.UndefOr[Boolean] = js.undefined
  }
  object ITypeaheadOptions {
    
    @scala.inline
    def apply(): ITypeaheadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITypeaheadOptions]
    }
    
    @scala.inline
    implicit class ITypeaheadOptionsMutableBuilder[Self <: ITypeaheadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      @scala.inline
      def setComparator(value: String): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      @scala.inline
      def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setOnBeforeHide(value: /* typeahead */ ITypeahead => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* typeahead */ ITypeahead => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* typeahead */ ITypeahead => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* typeahead */ ITypeahead => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* typeahead */ ITypeahead => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setTrimValue(value: Boolean): Self = StObject.set(x, "trimValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimValueUndefined: Self = StObject.set(x, "trimValue", js.undefined)
      
      @scala.inline
      def setWatchOptions(value: Boolean): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    }
  }
  
  trait ITypeaheadProvider extends StObject {
    
    var defaults: ITypeaheadOptions
  }
  object ITypeaheadProvider {
    
    @scala.inline
    def apply(defaults: ITypeaheadOptions): ITypeaheadProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITypeaheadProvider]
    }
    
    @scala.inline
    implicit class ITypeaheadProviderMutableBuilder[Self <: ITypeaheadProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: ITypeaheadOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type ITypeaheadService = js.Function3[
    /* element */ IAugmentedJQuery, 
    /* controller */ js.Any, 
    /* config */ js.UndefOr[ITypeaheadOptions], 
    ITypeahead
  ]
}
