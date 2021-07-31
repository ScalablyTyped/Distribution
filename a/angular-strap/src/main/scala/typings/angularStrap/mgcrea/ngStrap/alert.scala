package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Alert
// see http://mgcrea.github.io/angular-strap/#/alerts
///////////////////////////////////////////////////////////////////////////
object alert {
  
  trait IAlert extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit]
    
    def hide(): Unit
    
    def show(): Unit
    
    def toggle(): Unit
  }
  object IAlert {
    
    @scala.inline
    def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): IAlert = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[IAlert]
    }
    
    @scala.inline
    implicit class IAlertMutableBuilder[Self <: IAlert] (val x: Self) extends AnyVal {
      
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
  
  trait IAlertOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var controller: js.UndefOr[js.Any] = js.undefined
    
    var controllerAs: js.UndefOr[String] = js.undefined
    
    var dismissable: js.UndefOr[Boolean] = js.undefined
    
    var duration: js.UndefOr[Double | Boolean] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateUrl: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IAlertOptions {
    
    @scala.inline
    def apply(): IAlertOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAlertOptions]
    }
    
    @scala.inline
    implicit class IAlertOptionsMutableBuilder[Self <: IAlertOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | Boolean): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setOnBeforeHide(value: /* alert */ IAlert => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* alert */ IAlert => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* alert */ IAlert => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* alert */ IAlert => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
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
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IAlertProvider extends StObject {
    
    var defaults: IAlertOptions
  }
  object IAlertProvider {
    
    @scala.inline
    def apply(defaults: IAlertOptions): IAlertProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAlertProvider]
    }
    
    @scala.inline
    implicit class IAlertProviderMutableBuilder[Self <: IAlertProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IAlertOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IAlertScope
    extends StObject
       with IRootScopeService {
    
    @JSName("$hide")
    def $hide(): Unit = js.native
    
    @JSName("$show")
    def $show(): Unit = js.native
    
    @JSName("$toggle")
    def $toggle(): Unit = js.native
  }
  
  type IAlertService = js.Function1[/* config */ js.UndefOr[IAlertOptions], IAlert]
}
