package typings.angularUiRouter

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angular.mod.IServiceProvider
import typings.angular.mod.global.Function
import typings.angularUiRouter.angularUiRouterStrings.uiDotrouter
import typings.angularUiRouter.anon.Globals
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-ui-router", JSImport.Default)
  @js.native
  val default: uiDotrouter = js.native
  
  type IHrefOptions = typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
  
  type IResolvedState = typings.angularUiRouter.mod.angularAugmentingMod.ui.IResolvedState
  
  type IState = typings.angularUiRouter.mod.angularAugmentingMod.ui.IState
  
  type IStateOptions = typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
  
  type IStateParamsService = typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService
  
  type IStateProvider = typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateProvider
  
  type IStateService = typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateService
  
  type IType = typings.angularUiRouter.mod.angularAugmentingMod.ui.IType
  
  type IUiViewScrollProvider = typings.angularUiRouter.mod.angularAugmentingMod.ui.IUiViewScrollProvider
  
  type IUrlMatcher = typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher
  
  type IUrlRouterProvider = typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider
  
  type IUrlRouterService = typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterService
  
  type _To = uiDotrouter
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: uiDotrouter = default
  
  /* augmented module */
  object angularAugmentingMod {
    
    object ui {
      
      trait IHrefOptions extends StObject {
        
        var absolute: js.UndefOr[Boolean] = js.undefined
        
        var inherit: js.UndefOr[Boolean] = js.undefined
        
        var lossy: js.UndefOr[Boolean] = js.undefined
        
        var relative: js.UndefOr[typings.angularUiRouter.mod.angularAugmentingMod.ui.IState] = js.undefined
      }
      object IHrefOptions {
        
        inline def apply(): typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions]
        }
        
        extension [Self <: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions](x: Self) {
          
          inline def setAbsolute(value: Boolean): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
          
          inline def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
          
          inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
          
          inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
          
          inline def setLossy(value: Boolean): Self = StObject.set(x, "lossy", value.asInstanceOf[js.Any])
          
          inline def setLossyUndefined: Self = StObject.set(x, "lossy", js.undefined)
          
          inline def setRelative(value: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
          
          inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
        }
      }
      
      trait IResolvedState extends StObject {
        
        var locals: Globals
      }
      object IResolvedState {
        
        inline def apply(locals: Globals): typings.angularUiRouter.mod.angularAugmentingMod.ui.IResolvedState = {
          val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.angularUiRouter.mod.angularAugmentingMod.ui.IResolvedState]
        }
        
        extension [Self <: typings.angularUiRouter.mod.angularAugmentingMod.ui.IResolvedState](x: Self) {
          
          inline def setLocals(value: Globals): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
        }
      }
      
      trait IState extends StObject {
        
        var `abstract`: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Boolean (default true). If false will reload state on everytransitions. Useful for when you'd like to restore all data  to its initial state.
          */
        var cache: js.UndefOr[Boolean] = js.undefined
        
        /**
          * String, component name
          */
        var component: js.UndefOr[String] = js.undefined
        
        /**
          * A controller paired to the state. Function, annotated array or name as String
          */
        var controller: js.UndefOr[Function | String | (js.Array[String | Function])] = js.undefined
        
        var controllerAs: js.UndefOr[String] = js.undefined
        
        /**
          * Function (injectable), returns the actual controller function or string.
          */
        var controllerProvider: js.UndefOr[Function | (js.Array[String | Function])] = js.undefined
        
        /**
          * Arbitrary data object, useful for custom configuration.
          */
        var data: js.UndefOr[js.Any] = js.undefined
        
        var name: js.UndefOr[String] = js.undefined
        
        /**
          * Callback function for when a state is entered. Good way to trigger an action or dispatch an event, such as opening a dialog.
          * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
          */
        var onEnter: js.UndefOr[Function | (js.Array[String | Function])] = js.undefined
        
        /**
          * Callback functions for when a state is entered and exited. Good way to trigger an action or dispatch an event, such as opening a dialog.
          * If minifying your scripts, make sure to explicitly annotate this function, because it won't be automatically annotated by your build tools.
          */
        var onExit: js.UndefOr[Function | (js.Array[String | Function])] = js.undefined
        
        /**
          * A map which optionally configures parameters declared in the url, or defines additional non-url parameters. Only use this within a state if you are not using url. Otherwise you can specify your parameters within the url. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
          */
        var params: js.UndefOr[js.Any] = js.undefined
        
        /**
          * Specifies the parent state of this state
          */
        var parent: js.UndefOr[String | typings.angularUiRouter.mod.angularAugmentingMod.ui.IState] = js.undefined
        
        /**
          * string | function | object
          * Synchronously or asynchronously redirects Transitions to a different state/params
          */
        var redirectTo: js.UndefOr[String | Function | typings.angularUiRouter.mod.angularAugmentingMod.ui.IState] = js.undefined
        
        /**
          * Boolean (default true). If false will not re-trigger the same state just because a search/query parameter has changed. Useful for when you'd like to modify $location.search() without triggering a reload.
          */
        var reloadOnSearch: js.UndefOr[Boolean] = js.undefined
        
        var resolve: js.UndefOr[StringDictionary[js.Any]] = js.undefined
        
        /**
          * String HTML content, or function that returns an HTML string
          */
        var template: js.UndefOr[
                String | (js.Function1[
                  /* params */ typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService, 
                  String
                ])
              ] = js.undefined
        
        /**
          * Function, returns HTML content string
          */
        var templateProvider: js.UndefOr[Function | (js.Array[String | Function])] = js.undefined
        
        /**
          * String URL path to template file OR Function, returns URL path string
          */
        var templateUrl: js.UndefOr[
                String | (js.Function1[
                  /* params */ typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService, 
                  String
                ])
              ] = js.undefined
        
        /**
          * A url with optional parameters. When a state is navigated or transitioned to, the $stateParams service will be populated with any parameters that were passed.
          */
        var url: js.UndefOr[String | typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher] = js.undefined
        
        /**
          * Use the views property to set up multiple views. If you don't need multiple views within a single state this property is not needed. Tip: remember that often nested views are more useful and powerful than multiple sibling views.
          */
        var views: js.UndefOr[StringDictionary[typings.angularUiRouter.mod.angularAugmentingMod.ui.IState]] = js.undefined
      }
      object IState {
        
        inline def apply(): typings.angularUiRouter.mod.angularAugmentingMod.ui.IState = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularUiRouter.mod.angularAugmentingMod.ui.IState]
        }
        
        extension [Self <: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState](x: Self) {
          
          inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
          
          inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
          
          inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
          
          inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
          
          inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
          
          inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
          
          inline def setController(value: Function | String | (js.Array[String | Function])): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
          
          inline def setControllerAs(value: String): Self = StObject.set(x, "controllerAs", value.asInstanceOf[js.Any])
          
          inline def setControllerAsUndefined: Self = StObject.set(x, "controllerAs", js.undefined)
          
          inline def setControllerProvider(value: Function | (js.Array[String | Function])): Self = StObject.set(x, "controllerProvider", value.asInstanceOf[js.Any])
          
          inline def setControllerProviderUndefined: Self = StObject.set(x, "controllerProvider", js.undefined)
          
          inline def setControllerProviderVarargs(value: (String | Function)*): Self = StObject.set(x, "controllerProvider", js.Array(value :_*))
          
          inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
          
          inline def setControllerVarargs(value: (String | Function)*): Self = StObject.set(x, "controller", js.Array(value :_*))
          
          inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
          
          inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setOnEnter(value: Function | (js.Array[String | Function])): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
          
          inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
          
          inline def setOnEnterVarargs(value: (String | Function)*): Self = StObject.set(x, "onEnter", js.Array(value :_*))
          
          inline def setOnExit(value: Function | (js.Array[String | Function])): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
          
          inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
          
          inline def setOnExitVarargs(value: (String | Function)*): Self = StObject.set(x, "onExit", js.Array(value :_*))
          
          inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
          
          inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
          
          inline def setParent(value: String | typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
          
          inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
          
          inline def setRedirectTo(value: String | Function | typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
          
          inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
          
          inline def setReloadOnSearch(value: Boolean): Self = StObject.set(x, "reloadOnSearch", value.asInstanceOf[js.Any])
          
          inline def setReloadOnSearchUndefined: Self = StObject.set(x, "reloadOnSearch", js.undefined)
          
          inline def setResolve(value: StringDictionary[js.Any]): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
          
          inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
          
          inline def setTemplate(
            value: String | (js.Function1[
                      /* params */ typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService, 
                      String
                    ])
          ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
          
          inline def setTemplateFunction1(
            value: /* params */ typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService => String
          ): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
          
          inline def setTemplateProvider(value: Function | (js.Array[String | Function])): Self = StObject.set(x, "templateProvider", value.asInstanceOf[js.Any])
          
          inline def setTemplateProviderUndefined: Self = StObject.set(x, "templateProvider", js.undefined)
          
          inline def setTemplateProviderVarargs(value: (String | Function)*): Self = StObject.set(x, "templateProvider", js.Array(value :_*))
          
          inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
          
          inline def setTemplateUrl(
            value: String | (js.Function1[
                      /* params */ typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService, 
                      String
                    ])
          ): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
          
          inline def setTemplateUrlFunction1(
            value: /* params */ typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService => String
          ): Self = StObject.set(x, "templateUrl", js.Any.fromFunction1(value))
          
          inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
          
          inline def setUrl(value: String | typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
          
          inline def setViews(value: StringDictionary[typings.angularUiRouter.mod.angularAugmentingMod.ui.IState]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
          
          inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
        }
      }
      
      trait IStateOptions extends StObject {
        
        /**
          *  {boolean=true}, If true will inherit url parameters from current url.
          */
        var inherit: js.UndefOr[Boolean] = js.undefined
        
        /**
          * {boolean=true|string=} - If true will update the url in the location bar, if false will not. If string, must be "replace", which will update url and also replace last history record.
          */
        var location: js.UndefOr[Boolean | String] = js.undefined
        
        /**
          * {boolean=true}, If true will broadcast $stateChangeStart and $stateChangeSuccess events.
          */
        @JSName("notify")
        var notify_FIStateOptions: js.UndefOr[Boolean] = js.undefined
        
        /**
          * {object=$state.$current}, When transitioning with relative path (e.g '^'), defines which state to be relative from.
          */
        var relative: js.UndefOr[typings.angularUiRouter.mod.angularAugmentingMod.ui.IState] = js.undefined
        
        /**
          * {boolean=false|string|IState}, If true will force transition even if the state or params have not changed, aka a reload of the same state. It differs from reloadOnSearch because you'd use this when you want to force a reload when everything is the same, including search params.
          */
        var reload: js.UndefOr[Boolean | String | typings.angularUiRouter.mod.angularAugmentingMod.ui.IState] = js.undefined
      }
      object IStateOptions {
        
        inline def apply(): typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions]
        }
        
        extension [Self <: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions](x: Self) {
          
          inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
          
          inline def setInheritUndefined: Self = StObject.set(x, "inherit", js.undefined)
          
          inline def setLocation(value: Boolean | String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
          
          inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
          
          inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
          
          inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
          
          inline def setRelative(value: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
          
          inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
          
          inline def setReload(value: Boolean | String | typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
          
          inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
        }
      }
      
      type IStateParamsService = StringDictionary[js.Any]
      
      @js.native
      trait IStateProvider
        extends StObject
           with IServiceProvider {
        
        def decorator(): js.Any = js.native
        def decorator(name: String): js.Any = js.native
        def decorator(
          name: String,
          decorator: js.Function2[
                  /* state */ typings.angularUiRouter.mod.angularAugmentingMod.ui.IState, 
                  /* parent */ Function, 
                  js.Any
                ]
        ): js.Any = js.native
        def decorator(
          name: Unit,
          decorator: js.Function2[
                  /* state */ typings.angularUiRouter.mod.angularAugmentingMod.ui.IState, 
                  /* parent */ Function, 
                  js.Any
                ]
        ): js.Any = js.native
        
        def state(config: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateProvider = js.native
        def state(name: String, config: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateProvider = js.native
      }
      
      @js.native
      trait IStateService extends StObject {
        
        @JSName("$current")
        var $current: typings.angularUiRouter.mod.angularAugmentingMod.ui.IResolvedState = js.native
        
        /** A reference to the state's config object. However you passed it in. Useful for accessing custom data. */
        var current: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState = js.native
        
        def get(): js.Array[typings.angularUiRouter.mod.angularAugmentingMod.ui.IState] = js.native
        def get(state: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IState = js.native
        def get(state: String, context: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IState = js.native
        def get(state: String, context: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): typings.angularUiRouter.mod.angularAugmentingMod.ui.IState = js.native
        def get(state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): typings.angularUiRouter.mod.angularAugmentingMod.ui.IState = js.native
        def get(state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState, context: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IState = js.native
        def get(
          state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          context: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState
        ): typings.angularUiRouter.mod.angularAugmentingMod.ui.IState = js.native
        
        /**
          * Convenience method for transitioning to a new state. $state.go calls $state.transitionTo internally but automatically sets options to { location: true, inherit: true, relative: $state.$current, notify: true }. This allows you to easily use an absolute or relative to path and specify only the parameters you'd like to update (while letting unspecified parameters inherit from the currently active ancestor states).
          *
          * @param to Absolute state name or relative state path. Some examples:
          *
          * $state.go('contact.detail') - will go to the contact.detail state
          * $state.go('^') - will go to a parent state
          * $state.go('^.sibling') - will go to a sibling state
          * $state.go('.child.grandchild') - will go to grandchild state
          *
          * @param params A map of the parameters that will be sent to the state, will populate $stateParams. Any parameters that are not specified will be inherited from currently defined parameters. This allows, for example, going to a sibling state that shares parameters specified in a parent state. Parameter inheritance only works between common ancestor states, I.e. transitioning to a sibling will get you the parameters for all parents, transitioning to a child will get you all current parameters, etc.
          *
          * @param options Options object.
          */
        def go(to: String): IPromise[js.Any] = js.native
        def go(to: String, params: js.Object): IPromise[js.Any] = js.native
        def go(
          to: String,
          params: js.Object,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        ): IPromise[js.Any] = js.native
        def go(
          to: String,
          params: Unit,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        ): IPromise[js.Any] = js.native
        def go(to: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): IPromise[js.Any] = js.native
        def go(to: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState, params: js.Object): IPromise[js.Any] = js.native
        def go(
          to: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          params: js.Object,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        ): IPromise[js.Any] = js.native
        def go(
          to: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          params: Unit,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        ): IPromise[js.Any] = js.native
        
        def href(state: String): String = js.native
        def href(state: String, params: js.Object): String = js.native
        def href(
          state: String,
          params: js.Object,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
        ): String = js.native
        def href(
          state: String,
          params: Unit,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
        ): String = js.native
        def href(state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): String = js.native
        def href(state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState, params: js.Object): String = js.native
        def href(
          state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          params: js.Object,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
        ): String = js.native
        def href(
          state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          params: Unit,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
        ): String = js.native
        
        def includes(state: String): Boolean = js.native
        def includes(state: String, params: js.Object): Boolean = js.native
        def includes(state: String, params: js.Object, options: js.Any): Boolean = js.native
        def includes(state: String, params: Unit, options: js.Any): Boolean = js.native
        
        def is(state: String): Boolean = js.native
        def is(state: String, params: js.Object): Boolean = js.native
        def is(state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): Boolean = js.native
        def is(state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState, params: js.Object): Boolean = js.native
        
        /** A param object, e.g. {sectionId: section.id)}, that you'd like to test against the current active state. */
        var params: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService = js.native
        
        def reload(): IPromise[js.Any] = js.native
        def reload(reloadState: String): IPromise[js.Any] = js.native
        def reload(reloadState: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): IPromise[js.Any] = js.native
        
        /** Currently pending transition. A promise that'll resolve or reject. */
        var transition: IPromise[js.Object] = js.native
        
        def transitionTo(state: String): IPromise[js.Any] = js.native
        def transitionTo(state: String, params: js.Object): IPromise[js.Any] = js.native
        def transitionTo(
          state: String,
          params: js.Object,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        ): IPromise[js.Any] = js.native
        def transitionTo(state: String, params: js.Object, updateLocation: Boolean): IPromise[js.Any] = js.native
        def transitionTo(
          state: String,
          params: Unit,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        ): IPromise[js.Any] = js.native
        def transitionTo(state: String, params: Unit, updateLocation: Boolean): IPromise[js.Any] = js.native
        def transitionTo(state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState): IPromise[js.Any] = js.native
        def transitionTo(state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState, params: js.Object): IPromise[js.Any] = js.native
        def transitionTo(
          state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          params: js.Object,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        ): IPromise[js.Any] = js.native
        def transitionTo(
          state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          params: js.Object,
          updateLocation: Boolean
        ): IPromise[js.Any] = js.native
        def transitionTo(
          state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          params: Unit,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        ): IPromise[js.Any] = js.native
        def transitionTo(
          state: typings.angularUiRouter.mod.angularAugmentingMod.ui.IState,
          params: Unit,
          updateLocation: Boolean
        ): IPromise[js.Any] = js.native
      }
      
      trait IType extends StObject {
        
        /**
          * Converts a parameter value (from URL string or transition param) to a custom/native value.
          *
          * @param val {string} The URL parameter value to decode.
          * @param key {string} The name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
          *
          * @returns {any} Returns a custom representation of the URL parameter value.
          */
        def decode(`val`: String, key: String): js.Any
        
        /**
          * Encodes a custom/native type value to a string that can be embedded in a URL. Note that the return value does not need to be URL-safe (i.e. passed through encodeURIComponent()), it only needs to be a representation of val that has been coerced to a string.
          *
          * @param val {any} The value to encode.
          * @param key {string} The name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
          *
          * @returns {string} Returns a string representation of val that can be encoded in a URL.
          */
        def encode(`val`: js.Any, key: String): String
        
        /**
          * Determines whether two decoded values are equivalent.
          *
          * @param a {any} A value to compare against.
          * @param b {any} A value to compare against.
          *
          * @returns {boolean} Returns true if the values are equivalent/equal, otherwise false.
          */
        @JSName("equals")
        var equals_FIType: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]] = js.undefined
        
        /**
          * Detects whether a value is of a particular type. Accepts a native (decoded) value and determines whether it matches the current Type object.
          *
          * @param val {any} The value to check.
          * @param key {any} Optional. If the type check is happening in the context of a specific UrlMatcher object, this is the name of the parameter in which val is stored. Can be used for meta-programming of Type objects.
          *
          * @returns {boolean} Returns true if the value matches the type, otherwise false.
          */
        def is(`val`: js.Any, key: String): Boolean
        
        /**
          * The regular expression pattern used to match values of this type when coming from a substring of a URL.
          */
        var pattern: js.UndefOr[RegExp] = js.undefined
      }
      object IType {
        
        inline def apply(
          decode: (String, String) => js.Any,
          encode: (js.Any, String) => String,
          is: (js.Any, String) => Boolean
        ): typings.angularUiRouter.mod.angularAugmentingMod.ui.IType = {
          val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction2(encode), is = js.Any.fromFunction2(is))
          __obj.asInstanceOf[typings.angularUiRouter.mod.angularAugmentingMod.ui.IType]
        }
        
        extension [Self <: typings.angularUiRouter.mod.angularAugmentingMod.ui.IType](x: Self) {
          
          inline def setDecode(value: (String, String) => js.Any): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
          
          inline def setEncode(value: (js.Any, String) => String): Self = StObject.set(x, "encode", js.Any.fromFunction2(value))
          
          inline def setEquals_(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
          
          inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
          
          inline def setIs(value: (js.Any, String) => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction2(value))
          
          inline def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
          
          inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        }
      }
      
      trait IUiViewScrollProvider extends StObject {
        
        /*
          * Reverts back to using the core $anchorScroll service for scrolling
          * based on the url anchor.
          */
        def useAnchorScroll(): Unit
      }
      object IUiViewScrollProvider {
        
        inline def apply(useAnchorScroll: () => Unit): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUiViewScrollProvider = {
          val __obj = js.Dynamic.literal(useAnchorScroll = js.Any.fromFunction0(useAnchorScroll))
          __obj.asInstanceOf[typings.angularUiRouter.mod.angularAugmentingMod.ui.IUiViewScrollProvider]
        }
        
        extension [Self <: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUiViewScrollProvider](x: Self) {
          
          inline def setUseAnchorScroll(value: () => Unit): Self = StObject.set(x, "useAnchorScroll", js.Any.fromFunction0(value))
        }
      }
      
      trait IUnfoundState extends StObject {
        
        var options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions
        
        var to: String
      }
      object IUnfoundState {
        
        inline def apply(options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions, to: String): IUnfoundState = {
          val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
          __obj.asInstanceOf[IUnfoundState]
        }
        
        extension [Self <: IUnfoundState](x: Self) {
          
          inline def setOptions(value: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
          
          inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IUrlMatcher extends StObject {
        
        def concat(pattern: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher = js.native
        
        def exec(path: String): js.Object = js.native
        def exec(path: String, search: js.Any): js.Object = js.native
        def exec(path: String, search: js.Any, hash: String): js.Object = js.native
        def exec(path: String, search: js.Any, hash: String, options: js.Any): js.Object = js.native
        def exec(path: String, search: js.Any, hash: Unit, options: js.Any): js.Object = js.native
        def exec(path: String, search: Unit, hash: String): js.Object = js.native
        def exec(path: String, search: Unit, hash: String, options: js.Any): js.Object = js.native
        def exec(path: String, search: Unit, hash: Unit, options: js.Any): js.Object = js.native
        
        def format(values: js.Object): String = js.native
        
        def parameters(): js.Array[String] = js.native
      }
      
      @js.native
      trait IUrlMatcherFactory extends StObject {
        
        /**
          * Defines whether URL matching should be case sensitive (the default behavior), or not.
          *
          * @param value {boolean} false to match URL in a case sensitive manner; otherwise true;
          *
          * @returns {boolean} the current value of caseInsensitive
          */
        def caseInsensitive(): Boolean = js.native
        def caseInsensitive(value: Boolean): Boolean = js.native
        
        /**
          * Creates a UrlMatcher for the specified pattern.
          *
          * @param pattern {string} The URL pattern.
          *
          * @returns {IUrlMatcher} The UrlMatcher.
          */
        def compile(pattern: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher = js.native
        
        /**
          * Sets the default behavior when generating or matching URLs with default parameter values
          *
          * @param value {string} A string that defines the default parameter URL squashing behavior. nosquash: When generating an href with a default parameter value, do not squash the parameter value from the URL slash: When generating an href with a default parameter value, squash (remove) the parameter value, and, if the parameter is surrounded by slashes, squash (remove) one slash from the URL any other string, e.g. "~": When generating an href with a default parameter value, squash (remove) the parameter value from the URL and replace it with this string.
          */
        def defaultSquashPolicy(value: String): Unit = js.native
        
        /**
          * Returns true if the specified object is a UrlMatcher, or false otherwise.
          *
          * @param o {any} The object to perform the type check against.
          *
          * @returns {boolean} Returns true if the object matches the IUrlMatcher interface, by implementing all the same methods.
          */
        def isMatcher(o: js.Any): Boolean = js.native
        
        /**
          * Defines whether URLs should match trailing slashes, or not (the default behavior).
          *
          * @param value {boolean} false to match trailing slashes in URLs, otherwise true.
          *
          * @returns {boolean} the current value of strictMode
          */
        def strictMode(): Boolean = js.native
        def strictMode(value: Boolean): Boolean = js.native
        
        /**
          * Returns a type definition for the specified name
          *
          * @param name {string} The type definition name
          *
          * @returns {IType} The type definition
          */
        def `type`(name: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IType = js.native
        /**
          * Registers a custom Type object that can be used to generate URLs with typed parameters.
          *
          * @param {IType} definition The type definition.
          * @param {any[]} inlineAnnotedDefinitionFn A function that is injected before the app runtime starts. The result of this function is merged into the existing definition.
          *
          * @returns {IUrlMatcherFactory} Returns $urlMatcherFactoryProvider.
          */
        def `type`(name: String, definition: typings.angularUiRouter.mod.angularAugmentingMod.ui.IType): IUrlMatcherFactory = js.native
        def `type`(
          name: String,
          definition: typings.angularUiRouter.mod.angularAugmentingMod.ui.IType,
          definitionFn: js.Function1[/* repeated */ js.Any, typings.angularUiRouter.mod.angularAugmentingMod.ui.IType]
        ): IUrlMatcherFactory = js.native
        def `type`(
          name: String,
          definition: typings.angularUiRouter.mod.angularAugmentingMod.ui.IType,
          inlineAnnotedDefinitionFn: js.Array[js.Any]
        ): IUrlMatcherFactory = js.native
      }
      
      @js.native
      trait IUrlRouterProvider
        extends StObject
           with IServiceProvider {
        
        /**
          * Disables (or enables) deferring location change interception.
          *
          * If you wish to customize the behavior of syncing the URL (for example, if you wish to defer a transition but maintain the current URL), call this method at configuration time. Then, at run time, call $urlRouter.listen() after you have configured your own $locationChangeSuccess event handler.
          *
          * @param {boolean} defer Indicates whether to defer location change interception. Passing no parameter is equivalent to true.
          */
        def deferIntercept(): Unit = js.native
        def deferIntercept(defer: Boolean): Unit = js.native
        
        def otherwise(handler: js.Array[js.Any]): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def otherwise(handler: Function): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def otherwise(path: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        
        def rule(handler: js.Array[js.Any]): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def rule(handler: Function): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        
        def when(whenPath: String, handler: js.Array[js.Any]): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def when(whenPath: String, handler: Function): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def when(whenPath: String, toPath: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def when(
          whenPath: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher,
          handler: js.Array[js.Any]
        ): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def when(whenPath: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher, hanlder: Function): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def when(whenPath: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher, toPath: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def when(whenPath: RegExp, handler: js.Array[js.Any]): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def when(whenPath: RegExp, handler: Function): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
        def when(whenPath: RegExp, toPath: String): typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlRouterProvider = js.native
      }
      
      @js.native
      trait IUrlRouterService extends StObject {
        
        def href(urlMatcher: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher): String = js.native
        def href(
          urlMatcher: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher,
          params: Unit,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
        ): String = js.native
        def href(
          urlMatcher: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher,
          params: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService
        ): String = js.native
        def href(
          urlMatcher: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher,
          params: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
        ): String = js.native
        
        def listen(): Function = js.native
        
        def push(urlMatcher: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher): Unit = js.native
        def push(
          urlMatcher: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher,
          params: Unit,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
        ): Unit = js.native
        def push(
          urlMatcher: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher,
          params: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService
        ): Unit = js.native
        def push(
          urlMatcher: typings.angularUiRouter.mod.angularAugmentingMod.ui.IUrlMatcher,
          params: typings.angularUiRouter.mod.angularAugmentingMod.ui.IStateParamsService,
          options: typings.angularUiRouter.mod.angularAugmentingMod.ui.IHrefOptions
        ): Unit = js.native
        
        /*
          * Triggers an update; the same update that happens when the address bar
          * url changes, aka $locationChangeSuccess.
          *
          * This method is useful when you need to use preventDefault() on the
          * $locationChangeSuccess event, perform some custom logic (route protection,
          * auth, config, redirection, etc) and then finally proceed with the transition
          * by calling $urlRouter.sync().
          *
          */
        def sync(): Unit = js.native
        
        def update(): Unit = js.native
        def update(read: Boolean): Unit = js.native
      }
    }
  }
}
