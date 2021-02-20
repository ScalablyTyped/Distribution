package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Aside
// see http://mgcrea.github.io/angular-strap/#/asides
///////////////////////////////////////////////////////////////////////////
object aside {
  
  @js.native
  trait IAside extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit] = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  object IAside {
    
    @scala.inline
    def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): IAside = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[IAside]
    }
    
    @scala.inline
    implicit class IAsideMutableBuilder[Self <: IAside] (val x: Self) extends AnyVal {
      
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
  trait IAsideOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.native
    
    var backdrop: js.UndefOr[Boolean | String] = js.native
    
    var container: js.UndefOr[String | Boolean] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentTemplate: js.UndefOr[String] = js.native
    
    var controller: js.UndefOr[js.Any] = js.native
    
    var controllerAs: js.UndefOr[String] = js.native
    
    var html: js.UndefOr[Boolean] = js.native
    
    var keyboard: js.UndefOr[Boolean] = js.native
    
    var onBeforeHide: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.native
    
    var onBeforeShow: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.native
    
    var onHide: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.native
    
    var onShow: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.native
    
    var placement: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[IScope] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var template: js.UndefOr[String] = js.native
    
    var templateUrl: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object IAsideOptions {
    
    @scala.inline
    def apply(): IAsideOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAsideOptions]
    }
    
    @scala.inline
    implicit class IAsideOptionsMutableBuilder[Self <: IAsideOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
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
      def setController(value: js.Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      @scala.inline
      def setOnBeforeHide(value: /* aside */ IAside => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      @scala.inline
      def setOnBeforeShow(value: /* aside */ IAside => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      @scala.inline
      def setOnHide(value: /* aside */ IAside => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: /* aside */ IAside => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
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
    }
  }
  
  @js.native
  trait IAsideProvider extends StObject {
    
    var defaults: IAsideOptions = js.native
  }
  object IAsideProvider {
    
    @scala.inline
    def apply(defaults: IAsideOptions): IAsideProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAsideProvider]
    }
    
    @scala.inline
    implicit class IAsideProviderMutableBuilder[Self <: IAsideProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(value: IAsideOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IAsideScope extends IRootScopeService {
    
    @JSName("$hide")
    def $hide(): Unit = js.native
    
    @JSName("$show")
    def $show(): Unit = js.native
    
    @JSName("$toggle")
    def $toggle(): Unit = js.native
  }
  
  type IAsideService = js.Function1[/* config */ js.UndefOr[IAsideOptions], IAside]
}
