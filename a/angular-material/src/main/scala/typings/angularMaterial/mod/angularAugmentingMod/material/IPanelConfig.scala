package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IController
import typings.angular.mod.IControllerConstructor
import typings.angular.mod.Injectable
import typings.std.Element
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanelConfig extends StObject {
  
  // default: false
  var animation: js.UndefOr[IPanelAnimation] = js.undefined
  
  var attachTo: js.UndefOr[String | JQuery | Element] = js.undefined
  
  var bindToController: js.UndefOr[Boolean] = js.undefined
  
  var clickOutsideToClose: js.UndefOr[Boolean] = js.undefined
  
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  
  var controllerAs: js.UndefOr[String] = js.undefined
  
  // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.undefined
  
  // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.undefined
  
  // default: false
  var focusOnOpen: js.UndefOr[Boolean] = js.undefined
  
  // default: true
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  // default: true
  var locals: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var onCloseSuccess: js.UndefOr[js.Function2[/* panel */ IPanelRef, /* closeReason */ String, Any]] = js.undefined
  
  // default: false
  var onDomAdded: js.UndefOr[js.Function1[/* repeated */ Any, PromiseLike[Unit] | Unit]] = js.undefined
  
  var onDomRemoved: js.UndefOr[js.Function1[/* repeated */ Any, PromiseLike[Unit] | Unit]] = js.undefined
  
  var onOpenComplete: js.UndefOr[js.Function1[/* repeated */ Any, PromiseLike[Unit] | Unit]] = js.undefined
  
  var onRemoving: js.UndefOr[js.Function1[/* repeated */ Any, PromiseLike[Unit] | Unit]] = js.undefined
  
  var origin: js.UndefOr[String | JQuery | Element] = js.undefined
  
  var panelClass: js.UndefOr[String] = js.undefined
  
  // default: 80
  var position: js.UndefOr[IPanelPosition] = js.undefined
  
  var propagateContainerEvents: js.UndefOr[Boolean] = js.undefined
  
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var templateUrl: js.UndefOr[String] = js.undefined
  
  // default: false
  var trapFocus: js.UndefOr[Boolean] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object IPanelConfig {
  
  inline def apply(): IPanelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanelConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPanelConfig] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: IPanelAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAttachTo(value: String | JQuery | Element): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
    
    inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
    
    inline def setBindToController(value: Boolean): Self = StObject.set(x, "bindToController", value.asInstanceOf[js.Any])
    
    inline def setBindToControllerUndefined: Self = StObject.set(x, "bindToController", js.undefined)
    
    inline def setClickOutsideToClose(value: Boolean): Self = StObject.set(x, "clickOutsideToClose", value.asInstanceOf[js.Any])
    
    inline def setClickOutsideToCloseUndefined: Self = StObject.set(x, "clickOutsideToClose", js.undefined)
    
    inline def setController(value: String | Injectable[IControllerConstructor]): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
    
    inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
    
    inline def setControllerFunction1(value: /* repeated */ Any => Unit | IController): Self = StObject.set(x, "controller", js.Any.fromFunction1(value))
    
    inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
    
    inline def setControllerVarargs(value: (String | IControllerConstructor)*): Self = StObject.set(x, "controller", js.Array(value*))
    
    inline def setDisableParentScroll(value: Boolean): Self = StObject.set(x, "disableParentScroll", value.asInstanceOf[js.Any])
    
    inline def setDisableParentScrollUndefined: Self = StObject.set(x, "disableParentScroll", js.undefined)
    
    inline def setEscapeToClose(value: Boolean): Self = StObject.set(x, "escapeToClose", value.asInstanceOf[js.Any])
    
    inline def setEscapeToCloseUndefined: Self = StObject.set(x, "escapeToClose", js.undefined)
    
    inline def setFocusOnOpen(value: Boolean): Self = StObject.set(x, "focusOnOpen", value.asInstanceOf[js.Any])
    
    inline def setFocusOnOpenUndefined: Self = StObject.set(x, "focusOnOpen", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setHasBackdrop(value: Boolean): Self = StObject.set(x, "hasBackdrop", value.asInstanceOf[js.Any])
    
    inline def setHasBackdropUndefined: Self = StObject.set(x, "hasBackdrop", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocals(value: StringDictionary[Any]): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    inline def setOnCloseSuccess(value: (/* panel */ IPanelRef, /* closeReason */ String) => Any): Self = StObject.set(x, "onCloseSuccess", js.Any.fromFunction2(value))
    
    inline def setOnCloseSuccessUndefined: Self = StObject.set(x, "onCloseSuccess", js.undefined)
    
    inline def setOnDomAdded(value: /* repeated */ Any => PromiseLike[Unit] | Unit): Self = StObject.set(x, "onDomAdded", js.Any.fromFunction1(value))
    
    inline def setOnDomAddedUndefined: Self = StObject.set(x, "onDomAdded", js.undefined)
    
    inline def setOnDomRemoved(value: /* repeated */ Any => PromiseLike[Unit] | Unit): Self = StObject.set(x, "onDomRemoved", js.Any.fromFunction1(value))
    
    inline def setOnDomRemovedUndefined: Self = StObject.set(x, "onDomRemoved", js.undefined)
    
    inline def setOnOpenComplete(value: /* repeated */ Any => PromiseLike[Unit] | Unit): Self = StObject.set(x, "onOpenComplete", js.Any.fromFunction1(value))
    
    inline def setOnOpenCompleteUndefined: Self = StObject.set(x, "onOpenComplete", js.undefined)
    
    inline def setOnRemoving(value: /* repeated */ Any => PromiseLike[Unit] | Unit): Self = StObject.set(x, "onRemoving", js.Any.fromFunction1(value))
    
    inline def setOnRemovingUndefined: Self = StObject.set(x, "onRemoving", js.undefined)
    
    inline def setOrigin(value: String | JQuery | Element): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPanelClass(value: String): Self = StObject.set(x, "panelClass", value.asInstanceOf[js.Any])
    
    inline def setPanelClassUndefined: Self = StObject.set(x, "panelClass", js.undefined)
    
    inline def setPosition(value: IPanelPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPropagateContainerEvents(value: Boolean): Self = StObject.set(x, "propagateContainerEvents", value.asInstanceOf[js.Any])
    
    inline def setPropagateContainerEventsUndefined: Self = StObject.set(x, "propagateContainerEvents", js.undefined)
    
    inline def setResolve(value: ResolveObject): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setTrapFocus(value: Boolean): Self = StObject.set(x, "trapFocus", value.asInstanceOf[js.Any])
    
    inline def setTrapFocusUndefined: Self = StObject.set(x, "trapFocus", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
