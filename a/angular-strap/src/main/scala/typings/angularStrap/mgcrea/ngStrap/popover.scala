package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import typings.angularStrap.anon.Hide
import typings.angularStrap.anon.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Popover
// see http://mgcrea.github.io/angular-strap/#/popovers
///////////////////////////////////////////////////////////////////////////
object popover {
  
  @js.native
  trait IPopover extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit] = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  object IPopover {
    
    @scala.inline
    def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): IPopover = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[IPopover]
    }
    
    @scala.inline
    implicit class IPopoverMutableBuilder[Self <: IPopover] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait IPopoverOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.native
    
    var autoClose: js.UndefOr[Boolean] = js.native
    
    var container: js.UndefOr[String | Boolean] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentTemplate: js.UndefOr[String] = js.native
    
    var delay: js.UndefOr[Double | Hide] = js.native
    
    var html: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var onBeforeHide: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.native
    
    var onBeforeShow: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.native
    
    var onHide: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.native
    
    var onShow: js.UndefOr[js.Function1[/* popover */ IPopover, Unit]] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String | IAugmentedJQuery | Boolean] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var templateUrl: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[String] = js.native
    
    var viewport: js.UndefOr[String | Padding] = js.native
  }
  object IPopoverOptions {
    
    @scala.inline
    def apply(): IPopoverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPopoverOptions]
    }
    
    @scala.inline
    implicit class IPopoverOptionsMutableBuilder[Self <: IPopoverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTemplate(value: String): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
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
      def setOnBeforeHide(value: /* popover */ IPopover => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* popover */ IPopover => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* popover */ IPopover => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* popover */ IPopover => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setTarget(value: String | IAugmentedJQuery | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setViewport(value: String | Padding): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  @js.native
  trait IPopoverProvider extends StObject {
    
    var defaults: IPopoverOptions = js.native
  }
  object IPopoverProvider {
    
    @scala.inline
    def apply(defaults: IPopoverOptions): IPopoverProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPopoverProvider]
    }
    
    @scala.inline
    implicit class IPopoverProviderMutableBuilder[Self <: IPopoverProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IPopoverOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPopoverScope extends IRootScopeService {
    
    @JSName("$hide")
    def $hide(): Unit = js.native
    
    @JSName("$show")
    def $show(): Unit = js.native
    
    @JSName("$toggle")
    def $toggle(): Unit = js.native
  }
  
  type IPopoverService = js.Function2[/* element */ IAugmentedJQuery, /* config */ js.UndefOr[IPopoverOptions], IPopover]
}
