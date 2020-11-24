package typings.angularMaterial.mod.angularAugmentingMod.material

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQuery
import typings.angular.mod.IController
import typings.angular.mod.IControllerConstructor
import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import typings.angular.mod.Injectable
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDialogOptions extends js.Object {
  
  var autoWrap: js.UndefOr[Boolean] = js.native
  
  var bindToController: js.UndefOr[Boolean] = js.native
  
   // default: true
  var clickOutsideToClose: js.UndefOr[Boolean] = js.native
  
  var closeTo: js.UndefOr[js.Any] = js.native
  
  var contentElement: js.UndefOr[String | Element] = js.native
  
   // default: true
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
   // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.native
  
   // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.native
  
   // default: true
  var focusOnOpen: js.UndefOr[Boolean] = js.native
  
  var fullscreen: js.UndefOr[Boolean] = js.native
  
   // default: true
  var hasBackdrop: js.UndefOr[Boolean] = js.native
  
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var onComplete: js.UndefOr[js.Function2[/* scope */ IScope, /* element */ JQuery, Unit]] = js.native
  
  var onRemoving: js.UndefOr[js.Function2[/* element */ JQuery, /* removePromise */ IPromise[_], Unit]] = js.native
  
   // default: root node
  var onShowing: js.UndefOr[js.Function2[/* scope */ IScope, /* element */ JQuery, Unit]] = js.native
  
  var openFrom: js.UndefOr[js.Any] = js.native
  
  var parent: js.UndefOr[String | Element | JQuery] = js.native
  
   // default: new child scope
  var preserveScope: js.UndefOr[Boolean] = js.native
  
   // default: false
  var resolve: js.UndefOr[ResolveObject] = js.native
  
  var scope: js.UndefOr[IScope] = js.native
  
  var skipHide: js.UndefOr[Boolean] = js.native
  
   // default: true
  var targetEvent: js.UndefOr[MouseEvent] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
   // default: false
  var title: js.UndefOr[String] = js.native
}
object IDialogOptions {
  
  @scala.inline
  def apply(): IDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDialogOptions]
  }
  
  @scala.inline
  implicit class IDialogOptionsOps[Self <: IDialogOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoWrap(value: Boolean): Self = this.set("autoWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoWrap: Self = this.set("autoWrap", js.undefined)
    
    @scala.inline
    def setBindToController(value: Boolean): Self = this.set("bindToController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindToController: Self = this.set("bindToController", js.undefined)
    
    @scala.inline
    def setClickOutsideToClose(value: Boolean): Self = this.set("clickOutsideToClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickOutsideToClose: Self = this.set("clickOutsideToClose", js.undefined)
    
    @scala.inline
    def setCloseTo(value: js.Any): Self = this.set("closeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseTo: Self = this.set("closeTo", js.undefined)
    
    @scala.inline
    def setContentElement(value: String | Element): Self = this.set("contentElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentElement: Self = this.set("contentElement", js.undefined)
    
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
    def setLocals(value: StringDictionary[js.Any]): Self = this.set("locals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    
    @scala.inline
    def setOnComplete(value: (/* scope */ IScope, /* element */ JQuery) => Unit): Self = this.set("onComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnRemoving(value: (/* element */ JQuery, /* removePromise */ IPromise[_]) => Unit): Self = this.set("onRemoving", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRemoving: Self = this.set("onRemoving", js.undefined)
    
    @scala.inline
    def setOnShowing(value: (/* scope */ IScope, /* element */ JQuery) => Unit): Self = this.set("onShowing", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShowing: Self = this.set("onShowing", js.undefined)
    
    @scala.inline
    def setOpenFrom(value: js.Any): Self = this.set("openFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenFrom: Self = this.set("openFrom", js.undefined)
    
    @scala.inline
    def setParent(value: String | Element | JQuery): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setPreserveScope(value: Boolean): Self = this.set("preserveScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveScope: Self = this.set("preserveScope", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveObject): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setScope(value: IScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSkipHide(value: Boolean): Self = this.set("skipHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipHide: Self = this.set("skipHide", js.undefined)
    
    @scala.inline
    def setTargetEvent(value: MouseEvent): Self = this.set("targetEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetEvent: Self = this.set("targetEvent", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
