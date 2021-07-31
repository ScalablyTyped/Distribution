package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import typings.angularStrap.anon.Hide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Dropdowsn
// see http://mgcrea.github.io/angular-strap/#/dropdowns
///////////////////////////////////////////////////////////////////////////
object dropdown {
  
  trait IDropdown extends StObject {
    
    def destroy(): Unit
    
    def hide(): Unit
    
    def show(): Unit
  }
  object IDropdown {
    
    @scala.inline
    def apply(destroy: () => Unit, hide: () => Unit, show: () => Unit): IDropdown = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
      __obj.asInstanceOf[IDropdown]
    }
    
    @scala.inline
    implicit class IDropdownMutableBuilder[Self <: IDropdown] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    }
  }
  
  trait IDropdownOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* dropdown */ IDropdown, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateUrl: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
  }
  object IDropdownOptions {
    
    @scala.inline
    def apply(): IDropdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDropdownOptions]
    }
    
    @scala.inline
    implicit class IDropdownOptionsMutableBuilder[Self <: IDropdownOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
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
      def setOnBeforeHide(value: /* dropdown */ IDropdown => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* dropdown */ IDropdown => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* dropdown */ IDropdown => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* dropdown */ IDropdown => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
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
      def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  trait IDropdownProvider extends StObject {
    
    var defaults: IDropdownOptions
  }
  object IDropdownProvider {
    
    @scala.inline
    def apply(defaults: IDropdownOptions): IDropdownProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDropdownProvider]
    }
    
    @scala.inline
    implicit class IDropdownProviderMutableBuilder[Self <: IDropdownProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IDropdownOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IDropdownService = js.Function2[/* element */ IAugmentedJQuery, /* config */ IDropdownOptions, IDropdown]
}
