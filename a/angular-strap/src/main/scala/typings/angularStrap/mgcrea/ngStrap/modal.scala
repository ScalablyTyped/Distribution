package typings.angularStrap.mgcrea.ngStrap

import typings.angular.mod.IPromise
import typings.angular.mod.IRootScopeService
import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Modal
// see http://mgcrea.github.io/angular-strap/#/modals
///////////////////////////////////////////////////////////////////////////
object modal {
  
  trait IModal extends StObject {
    
    @JSName("$promise")
    var $promise: IPromise[Unit]
    
    def hide(): Unit
    
    def show(): Unit
    
    def toggle(): Unit
  }
  object IModal {
    
    inline def apply($promise: IPromise[Unit], hide: () => Unit, show: () => Unit, toggle: () => Unit): IModal = {
      val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[IModal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModal] (val x: Self) extends AnyVal {
      
      inline def set$promise(value: IPromise[Unit]): Self = StObject.set(x, "$promise", value.asInstanceOf[js.Any])
      
      inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
      
      inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  trait IModalOptions extends StObject {
    
    var animation: js.UndefOr[String] = js.undefined
    
    var backdrop: js.UndefOr[Boolean | String] = js.undefined
    
    var backdropAnimation: js.UndefOr[String] = js.undefined
    
    var container: js.UndefOr[String | Boolean] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentTemplate: js.UndefOr[String] = js.undefined
    
    var controller: js.UndefOr[Any] = js.undefined
    
    var controllerAs: js.UndefOr[String] = js.undefined
    
    var html: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var keyboard: js.UndefOr[Boolean] = js.undefined
    
    var locals: js.UndefOr[Any] = js.undefined
    
    var onBeforeHide: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.undefined
    
    var onBeforeShow: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.undefined
    
    var placement: js.UndefOr[String] = js.undefined
    
    var prefixEvent: js.UndefOr[String] = js.undefined
    
    var resolve: js.UndefOr[Any] = js.undefined
    
    var scope: js.UndefOr[IScope] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
    
    var templateUrl: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object IModalOptions {
    
    inline def apply(): IModalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModalOptions] (val x: Self) extends AnyVal {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBackdrop(value: Boolean | String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBackdropAnimation(value: String): Self = StObject.set(x, "backdropAnimation", value.asInstanceOf[js.Any])
      
      inline def setBackdropAnimationUndefined: Self = StObject.set(x, "backdropAnimation", js.undefined)
      
      inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
      
      inline def setContainer(value: String | Boolean): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentTemplate(value: String): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
      
      inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setController(value: Any): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
      
      inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKeyboard(value: Boolean): Self = StObject.set(x, "keyboard", value.asInstanceOf[js.Any])
      
      inline def setKeyboardUndefined: Self = StObject.set(x, "keyboard", js.undefined)
      
      inline def setLocals(value: Any): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setOnBeforeHide(value: /* modal */ IModal => Unit): Self = StObject.set(x, "onBeforeHide", js.Any.fromFunction1(value))
      
      inline def setOnBeforeHideUndefined: Self = StObject.set(x, "onBeforeHide", js.undefined)
      
      inline def setOnBeforeShow(value: /* modal */ IModal => Unit): Self = StObject.set(x, "onBeforeShow", js.Any.fromFunction1(value))
      
      inline def setOnBeforeShowUndefined: Self = StObject.set(x, "onBeforeShow", js.undefined)
      
      inline def setOnHide(value: /* modal */ IModal => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: /* modal */ IModal => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setPrefixEvent(value: String): Self = StObject.set(x, "prefixEvent", value.asInstanceOf[js.Any])
      
      inline def setPrefixEventUndefined: Self = StObject.set(x, "prefixEvent", js.undefined)
      
      inline def setResolve(value: Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      inline def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
      
      inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait IModalProvider extends StObject {
    
    var defaults: IModalOptions
  }
  object IModalProvider {
    
    inline def apply(defaults: IModalOptions): IModalProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModalProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IModalProvider] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: IModalOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IModalScope
    extends StObject
       with IRootScopeService {
    
    @JSName("$hide")
    def $hide(): Unit = js.native
    
    @JSName("$show")
    def $show(): Unit = js.native
    
    @JSName("$toggle")
    def $toggle(): Unit = js.native
  }
  
  type IModalService = js.Function1[/* config */ js.UndefOr[IModalOptions], IModal]
}
