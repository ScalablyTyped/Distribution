package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import typings.angularStrap.anon.Hide
import typings.angularStrap.anon.Padding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Tooltip
// see http://mgcrea.github.io/angular-strap/#/tooltips
///////////////////////////////////////////////////////////////////////////
object tooltip {
  
  trait ITooltip extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit]
    
    def hide(): Unit
    
    def show(): Unit
    
    def toggle(): Unit
  }
  object ITooltip {
    
    inline def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): ITooltip = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[ITooltip]
    }
    
    extension [Self <: ITooltip](x: Self) {
      
      inline def set$promise(value: IPromise[Unit]): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  trait ITooltipOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var delay: js.UndefOr[Double | Hide] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var prefixEvent: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String | IAugmentedJQuery | Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateUrl: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleTemplate: js.UndefOr[String] = js.undefined
    
    var trigger: js.UndefOr[String] = js.undefined
    
    var viewport: js.UndefOr[String | Padding] = js.undefined
  }
  object ITooltipOptions {
    
    inline def apply(): ITooltipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITooltipOptions]
    }
    
    extension [Self <: ITooltipOptions](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDelay(value: Double | Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnBeforeHide(value: /* tooltip */ ITooltip => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* tooltip */ ITooltip => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* tooltip */ ITooltip => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* tooltip */ ITooltip => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixEvent(value: String): Self = StObject.set(x, "prefixEvent", value.asInstanceOf[js.Any])
      
      inline def setPrefixEventUndefined: Self = StObject.set(x, "prefixEvent", js.undefined)
      
      inline def setTarget(value: String | IAugmentedJQuery | Boolean): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTemplate(value: String): Self = StObject.set(x, "titleTemplate", value.asInstanceOf[js.Any])
      
      inline def setTitleTemplateUndefined: Self = StObject.set(x, "titleTemplate", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      inline def setViewport(value: String | Padding): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  trait ITooltipProvider extends StObject {
    
    var defaults: ITooltipOptions
  }
  object ITooltipProvider {
    
    inline def apply(defaults: ITooltipOptions): ITooltipProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITooltipProvider]
    }
    
    extension [Self <: ITooltipProvider](x: Self) {
      
      inline def setDefaults(value: ITooltipOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITooltipScope
    extends StObject
       with IRootScopeService {
    
    @JSName("$hide")
    def $hide(): Unit = js.native
    
    @JSName("$setEnabled")
    def $setEnabled(isEnabled: Boolean): Unit = js.native
    
    @JSName("$show")
    def $show(): Unit = js.native
    
    @JSName("$toggle")
    def $toggle(): Unit = js.native
  }
  
  type ITooltipService = js.Function2[/* element */ IAugmentedJQuery, /* config */ js.UndefOr[ITooltipOptions], ITooltip]
}
