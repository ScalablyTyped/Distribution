package typings.angularUiRouter.mod.angularAugmentingMod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IState extends js.Object {
  
  var `abstract`: js.UndefOr[Boolean] = js.native
  
  /**
    * Boolean (default true). If false will reload state on everytransitions. Useful for when you'd like to restore all data  to its initial state.
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * String, component name
    */
  var component: js.UndefOr[String] = js.native
  
  /**
    * A controller paired to the state. Function, annotated array or name as String
    */
  var controller: js.UndefOr[Function | String | (js.Array[String | Function])] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
  /**
    * Function (injectable), returns the actual controller function or string.
    */
  var controllerProvider: js.UndefOr[Function | (js.Array[String | Function])] = js.native
  
  /**
    * Arbitrary data object, useful for custom configuration.
    */
  var data: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  /**
    * Callback function for when a state is entered. Good way to trigger an action or dispatch an event, such as opening a dialog.
    * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
    */
  var onEnter: js.UndefOr[Function | (js.Array[String | Function])] = js.native
  
  /**
    * Callback functions for when a state is entered and exited. Good way to trigger an action or dispatch an event, such as opening a dialog.
    * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
    */
  var onExit: js.UndefOr[Function | (js.Array[String | Function])] = js.native
  
  /**
    * A map which optionally configures parameters declared in the url, or defines additional non-url parameters. Only use this within a state if you are not using url. Otherwise you can specify your parameters within the url. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
    */
  var params: js.UndefOr[js.Any] = js.native
  
  /**
    * Specifies the parent state of this state
    */
  var parent: js.UndefOr[String | IState] = js.native
  
  /**
    * string | function | object
    * Synchronously or asynchronously redirects Transitions to a different state/params
    */
  var redirectTo: js.UndefOr[String | Function | IState] = js.native
  
  /**
    * Boolean (default true). If false will not re-trigger the same state just because a search/query parameter has changed. Useful for when you'd like to modify $location.search() without triggering a reload.
    */
  var reloadOnSearch: js.UndefOr[Boolean] = js.native
  
  var resolve: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * String HTML content, or function that returns an HTML string
    */
  var template: js.UndefOr[String | (js.Function1[/* params */ IStateParamsService, String])] = js.native
  
  /**
    * Function, returns HTML content string
    */
  var templateProvider: js.UndefOr[Function | (js.Array[String | Function])] = js.native
  
  /**
    * String URL path to template file OR Function, returns URL path string
    */
  var templateUrl: js.UndefOr[String | (js.Function1[/* params */ IStateParamsService, String])] = js.native
  
  /**
    * A url with optional parameters. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
    */
  var url: js.UndefOr[String | IUrlMatcher] = js.native
  
  /**
    * Use the views property to set up multiple views. If you don't need multiple views within a single state this property is not needed. Tip: remember that often nested views are more useful and powerful than multiple sibling views.
    */
  var views: js.UndefOr[StringDictionary[IState]] = js.native
}
object IState {
  
  @scala.inline
  def apply(): IState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IState]
  }
  
  @scala.inline
  implicit class IStateOps[Self <: IState] (val x: Self) extends AnyVal {
    
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
    def setAbstract(value: Boolean): Self = this.set("abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbstract: Self = this.set("abstract", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setControllerVarargs(value: (String | Function)*): Self = this.set("controller", js.Array(value :_*))
    
    @scala.inline
    def setController(value: Function | String | (js.Array[String | Function])): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setControllerProviderVarargs(value: (String | Function)*): Self = this.set("controllerProvider", js.Array(value :_*))
    
    @scala.inline
    def setControllerProvider(value: Function | (js.Array[String | Function])): Self = this.set("controllerProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerProvider: Self = this.set("controllerProvider", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnEnterVarargs(value: (String | Function)*): Self = this.set("onEnter", js.Array(value :_*))
    
    @scala.inline
    def setOnEnter(value: Function | (js.Array[String | Function])): Self = this.set("onEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    
    @scala.inline
    def setOnExitVarargs(value: (String | Function)*): Self = this.set("onExit", js.Array(value :_*))
    
    @scala.inline
    def setOnExit(value: Function | (js.Array[String | Function])): Self = this.set("onExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnExit: Self = this.set("onExit", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setParent(value: String | IState): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setRedirectTo(value: String | Function | IState): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    
    @scala.inline
    def setReloadOnSearch(value: Boolean): Self = this.set("reloadOnSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReloadOnSearch: Self = this.set("reloadOnSearch", js.undefined)
    
    @scala.inline
    def setResolve(value: StringDictionary[js.Any]): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setTemplateFunction1(value: /* params */ IStateParamsService => String): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplate(value: String | (js.Function1[/* params */ IStateParamsService, String])): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTemplateProviderVarargs(value: (String | Function)*): Self = this.set("templateProvider", js.Array(value :_*))
    
    @scala.inline
    def setTemplateProvider(value: Function | (js.Array[String | Function])): Self = this.set("templateProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateProvider: Self = this.set("templateProvider", js.undefined)
    
    @scala.inline
    def setTemplateUrlFunction1(value: /* params */ IStateParamsService => String): Self = this.set("templateUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplateUrl(value: String | (js.Function1[/* params */ IStateParamsService, String])): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setUrl(value: String | IUrlMatcher): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setViews(value: StringDictionary[IState]): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
