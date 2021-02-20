package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IController
import typings.angular.mod.IControllerConstructor
import typings.angular.mod.Injectable
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelConfig extends StObject {
  
  // default: false
  var animation: js.UndefOr[IPanelAnimation] = js.native
  
  var attachTo: js.UndefOr[String | JQuery | Element] = js.native
  
  var bindToController: js.UndefOr[Boolean] = js.native
  
  var clickOutsideToClose: js.UndefOr[Boolean] = js.native
  
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
  // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.native
  
  // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.native
  
  // default: false
  var focusOnOpen: js.UndefOr[Boolean] = js.native
  
  // default: true
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  // default: true
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onCloseSuccess: js.UndefOr[js.Function2[/* panel */ IPanelRef, /* closeReason */ String, _]] = js.native
  
  // default: false
  var onDomAdded: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.native
  
  var onDomRemoved: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.native
  
  var onOpenComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.native
  
  var onRemoving: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.native
  
  var origin: js.UndefOr[String | JQuery | Element] = js.native
  
  var panelClass: js.UndefOr[String] = js.native
  
  // default: 80
  var position: js.UndefOr[IPanelPosition] = js.native
  
  var propagateContainerEvents: js.UndefOr[Boolean] = js.native
  
  var resolve: js.UndefOr[ResolveObject] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
  // default: false
  var trapFocus: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object IPanelConfig {
  
  @scala.inline
  def apply(): IPanelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelConfig]
  }
  
  @scala.inline
  implicit class IPanelConfigMutableBuilder[Self <: IPanelConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: IPanelAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAttachTo(value: String | JQuery | Element): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
    
    @scala.inline
    def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
    @scala.inline
    def setClickOutsideToClose(value: Boolean): Self = StObject.set(x, "clickOutsideToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickOutsideToCloseUndefined: Self = StObject.set(x, "clickOutsideToClose", js.undefined)
    
    @scala.inline
    def setController(value: String | Injectable[IControllerConstructor]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    @scala.inline
    def setControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
    
    @scala.inline
    def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: (String | IControllerConstructor)*): Self = StObject.set(x, "controller", js.Array(value :_*))
    
    @scala.inline
    def setDisableParentScroll(value: Boolean): Self = StObject.set(x, "disableParentScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableParentScrollUndefined: Self = StObject.set(x, "disableParentScroll", js.undefined)
    
    @scala.inline
    def setEscapeToClose(value: Boolean): Self = StObject.set(x, "escapeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeToCloseUndefined: Self = StObject.set(x, "escapeToClose", js.undefined)
    
    @scala.inline
    def setFocusOnOpen(value: Boolean): Self = StObject.set(x, "focusOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusOnOpenUndefined: Self = StObject.set(x, "focusOnOpen", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocals(value: StringDictionary[js.Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    @scala.inline
    def setOnCloseSuccess(value: (/* panel */ IPanelRef, /* closeReason */ String) => _): Self = StObject.set(x, "onCloseSuccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCloseSuccessUndefined: Self = StObject.set(x, "onCloseSuccess", js.undefined)
    
    @scala.inline
    def setOnDomAdded(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = StObject.set(x, "onDomAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDomAddedUndefined: Self = StObject.set(x, "onDomAdded", js.undefined)
    
    @scala.inline
    def setOnDomRemoved(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = StObject.set(x, "onDomRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDomRemovedUndefined: Self = StObject.set(x, "onDomRemoved", js.undefined)
    
    @scala.inline
    def setOnOpenComplete(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = StObject.set(x, "onOpenComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenCompleteUndefined: Self = StObject.set(x, "onOpenComplete", js.undefined)
    
    @scala.inline
    def setOnRemoving(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = StObject.set(x, "onRemoving", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemovingUndefined: Self = StObject.set(x, "onRemoving", js.undefined)
    
    @scala.inline
    def setOrigin(value: String | JQuery | Element): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPanelClass(value: String): Self = StObject.set(x, "panelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelClassUndefined: Self = StObject.set(x, "panelClass", js.undefined)
    
    @scala.inline
    def setPosition(value: IPanelPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPropagateContainerEvents(value: Boolean): Self = StObject.set(x, "propagateContainerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagateContainerEventsUndefined: Self = StObject.set(x, "propagateContainerEvents", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveObject): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
