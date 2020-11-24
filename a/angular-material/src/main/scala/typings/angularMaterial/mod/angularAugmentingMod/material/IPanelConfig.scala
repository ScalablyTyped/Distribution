package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IController
import typings.angular.mod.IControllerConstructor
import typings.angular.mod.Injectable
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanelConfig extends js.Object {
  
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
  implicit class IPanelConfigOps[Self <: IPanelConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimation(value: IPanelAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAttachTo(value: String | JQuery | Element): Self = this.set("attachTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachTo: Self = this.set("attachTo", js.undefined)
    
    @scala.inline
    def setBindToController(value: Boolean): Self = this.set("bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindToController: Self = this.set("bindToController", js.undefined)
    
    @scala.inline
    def setClickOutsideToClose(value: Boolean): Self = this.set("clickOutsideToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickOutsideToClose: Self = this.set("clickOutsideToClose", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: (String | IControllerConstructor)*): Self = this.set("controller", js.Array(value :_*))
    
    @scala.inline
    def setControllerFunction1(value: /* repeated */ js.Any => Unit | IController): Self = this.set("controller", js.Any.fromFunction1(value))
    
    @scala.inline
    def setController(value: String | Injectable[IControllerConstructor]): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setDisableParentScroll(value: Boolean): Self = this.set("disableParentScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableParentScroll: Self = this.set("disableParentScroll", js.undefined)
    
    @scala.inline
    def setEscapeToClose(value: Boolean): Self = this.set("escapeToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeToClose: Self = this.set("escapeToClose", js.undefined)
    
    @scala.inline
    def setFocusOnOpen(value: Boolean): Self = this.set("focusOnOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusOnOpen: Self = this.set("focusOnOpen", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setHasBackdrop(value: Boolean): Self = this.set("hasBackdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasBackdrop: Self = this.set("hasBackdrop", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocals(value: StringDictionary[js.Any]): Self = this.set("locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    
    @scala.inline
    def setOnCloseSuccess(value: (/* panel */ IPanelRef, /* closeReason */ String) => _): Self = this.set("onCloseSuccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCloseSuccess: Self = this.set("onCloseSuccess", js.undefined)
    
    @scala.inline
    def setOnDomAdded(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = this.set("onDomAdded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDomAdded: Self = this.set("onDomAdded", js.undefined)
    
    @scala.inline
    def setOnDomRemoved(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = this.set("onDomRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDomRemoved: Self = this.set("onDomRemoved", js.undefined)
    
    @scala.inline
    def setOnOpenComplete(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = this.set("onOpenComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnOpenComplete: Self = this.set("onOpenComplete", js.undefined)
    
    @scala.inline
    def setOnRemoving(value: /* repeated */ js.Any => js.Thenable[Unit] | Unit): Self = this.set("onRemoving", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRemoving: Self = this.set("onRemoving", js.undefined)
    
    @scala.inline
    def setOrigin(value: String | JQuery | Element): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPanelClass(value: String): Self = this.set("panelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanelClass: Self = this.set("panelClass", js.undefined)
    
    @scala.inline
    def setPosition(value: IPanelPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setPropagateContainerEvents(value: Boolean): Self = this.set("propagateContainerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagateContainerEvents: Self = this.set("propagateContainerEvents", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveObject): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setTrapFocus(value: Boolean): Self = this.set("trapFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrapFocus: Self = this.set("trapFocus", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
