package typings.angular

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  /**
    * Defines route lifecycle method `routerCanDeactivate`, which is called by the router to determine
    * if a component can be removed as part of a navigation.
    *
    * The `routerCanDeactivate` hook is called with two {@link ComponentInstruction}s as parameters,
    * the
    * first representing the current route being navigated to, and the second parameter
    * representing the previous route.
    *
    * If `routerCanDeactivate` returns or resolves to `false`, the navigation is cancelled. If it
    * returns or
    * resolves to `true`, then the navigation continues, and the component will be deactivated
    * (the {@link OnDeactivate} hook will be run) and removed.
    *
    * If `routerCanDeactivate` throws or rejects, the navigation is also cancelled.
    *
    * ### Example
    * {@example router/ts/can_deactivate/can_deactivate_example.ts region='routerCanDeactivate'}
    */
  @js.native
  trait CanDeactivate extends StObject {
    
    @JSName("$routerCanDeactivate")
    def $routerCanDeactivate(): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ Any) = js.native
    @JSName("$routerCanDeactivate")
    def $routerCanDeactivate(next: Unit, prev: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ Any) = js.native
    @JSName("$routerCanDeactivate")
    def $routerCanDeactivate(next: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ Any) = js.native
    @JSName("$routerCanDeactivate")
    def $routerCanDeactivate(next: ComponentInstruction, prev: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ Any) = js.native
  }
  
  /**
    * Defines route lifecycle method `routerCanReuse`, which is called by the router to determine
    * whether a
    * component should be reused across routes, or whether to destroy and instantiate a new component.
    *
    * The `routerCanReuse` hook is called with two {@link ComponentInstruction}s as parameters, the
    * first
    * representing the current route being navigated to, and the second parameter representing the
    * previous route.
    *
    * If `routerCanReuse` returns or resolves to `true`, the component instance will be reused and the
    * {@link OnDeactivate} hook will be run. If `routerCanReuse` returns or resolves to `false`, a new
    * component will be instantiated, and the existing component will be deactivated and removed as
    * part of the navigation.
    *
    * If `routerCanReuse` throws or rejects, the navigation will be cancelled.
    *
    * ### Example
    * {@example router/ts/reuse/reuse_example.ts region='reuseCmp'}
    */
  @js.native
  trait CanReuse extends StObject {
    
    @JSName("$routerCanReuse")
    def $routerCanReuse(): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ Any) = js.native
    @JSName("$routerCanReuse")
    def $routerCanReuse(next: Unit, prev: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ Any) = js.native
    @JSName("$routerCanReuse")
    def $routerCanReuse(next: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ Any) = js.native
    @JSName("$routerCanReuse")
    def $routerCanReuse(next: ComponentInstruction, prev: ComponentInstruction): Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPromise<boolean> */ Any) = js.native
  }
  
  /**
    * Represents either a component type (`type` is `component`) or a loader function
    * (`type` is `loader`).
    *
    * See also {@link RouteDefinition}.
    */
  trait ComponentDefinition extends StObject {
    
    var component: js.UndefOr[Type] = js.undefined
    
    var loader: js.UndefOr[Function] = js.undefined
    
    var `type`: String
  }
  object ComponentDefinition {
    
    inline def apply(`type`: String): ComponentDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentDefinition] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: Type): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setLoader(value: Function): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A `ComponentInstruction` represents the route state for a single component. An `Instruction` is
    * composed of a tree of these `ComponentInstruction`s.
    *
    * `ComponentInstructions` is a public API. Instances of `ComponentInstruction` are passed
    * to route lifecycle hooks, like {@link CanActivate}.
    *
    * `ComponentInstruction`s are [https://en.wikipedia.org/wiki/Hash_consing](hash consed). You should
    * never construct one yourself with "new." Instead, rely on {@link Router/RouteRecognizer} to
    * construct `ComponentInstruction`s.
    *
    * You should not modify this object. It should be treated as immutable.
    */
  trait ComponentInstruction extends StObject {
    
    var componentType: Any
    
    var data: RouteData
    
    var params: StringDictionary[Any]
    
    var reuse: Boolean
    
    var routeData: RouteData
    
    var specificity: Double
    
    var terminal: Boolean
    
    var urlParams: js.Array[String]
    
    var urlPath: String
  }
  object ComponentInstruction {
    
    inline def apply(
      componentType: Any,
      data: RouteData,
      params: StringDictionary[Any],
      reuse: Boolean,
      routeData: RouteData,
      specificity: Double,
      terminal: Boolean,
      urlParams: js.Array[String],
      urlPath: String
    ): ComponentInstruction = {
      val __obj = js.Dynamic.literal(componentType = componentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], reuse = reuse.asInstanceOf[js.Any], routeData = routeData.asInstanceOf[js.Any], specificity = specificity.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], urlParams = urlParams.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentInstruction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentInstruction] (val x: Self) extends AnyVal {
      
      inline def setComponentType(value: Any): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
      
      inline def setData(value: RouteData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setReuse(value: Boolean): Self = StObject.set(x, "reuse", value.asInstanceOf[js.Any])
      
      inline def setRouteData(value: RouteData): Self = StObject.set(x, "routeData", value.asInstanceOf[js.Any])
      
      inline def setSpecificity(value: Double): Self = StObject.set(x, "specificity", value.asInstanceOf[js.Any])
      
      inline def setTerminal(value: Boolean): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setUrlParams(value: js.Array[String]): Self = StObject.set(x, "urlParams", value.asInstanceOf[js.Any])
      
      inline def setUrlParamsVarargs(value: String*): Self = StObject.set(x, "urlParams", js.Array(value*))
      
      inline def setUrlPath(value: String): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
    }
  }
  
  // Supplement IComponentOptions from angular.d.ts with router-specific
  // fields.
  trait IComponentOptions extends StObject {
    
    @JSName("$canActivate")
    var $canActivate: js.UndefOr[
        js.Function1[
          /* repeated */ Any, 
          Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<boolean> */ Any)
        ]
      ] = js.undefined
    
    @JSName("$routeConfig")
    var $routeConfig: js.UndefOr[js.Array[RouteDefinition]] = js.undefined
  }
  object IComponentOptions {
    
    inline def apply(): IComponentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IComponentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IComponentOptions] (val x: Self) extends AnyVal {
      
      inline def set$canActivate(
        value: /* repeated */ Any => Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<boolean> */ Any)
      ): Self = StObject.set(x, "$canActivate", js.Any.fromFunction1(value))
      
      inline def set$canActivateUndefined: Self = StObject.set(x, "$canActivate", js.undefined)
      
      inline def set$routeConfig(value: js.Array[RouteDefinition]): Self = StObject.set(x, "$routeConfig", value.asInstanceOf[js.Any])
      
      inline def set$routeConfigUndefined: Self = StObject.set(x, "$routeConfig", js.undefined)
      
      inline def set$routeConfigVarargs(value: RouteDefinition*): Self = StObject.set(x, "$routeConfig", js.Array(value*))
    }
  }
  
  /**
    * `Instruction` is a tree of {@link ComponentInstruction}s with all the information needed
    * to transition each component in the app to a given route, including all auxiliary routes.
    *
    * `Instruction`s can be created using {@link Router#generate}, and can be used to
    * perform route changes with {@link Router#navigateByInstruction}.
    *
    * ### Example
    *
    * ```
    * import { Component } from 'angular2/core';
    * import {bootstrap} from 'angular2/platform/browser';
    * import {Router, ROUTER_DIRECTIVES, ROUTER_PROVIDERS, RouteConfig} from 'angular2/router';
    *
    * @Component({directives: [ROUTER_DIRECTIVES]})
    * @RouteConfig([
    *  {...},
    * ])
    * class AppCmp {
    *   constructor(router: Router) {
    *     var instruction = router.generate(['/MyRoute']);
    *     router.navigateByInstruction(instruction);
    *   }
    * }
    *
    * bootstrap(AppCmp, ROUTER_PROVIDERS);
    * ```
    */
  trait Instruction extends StObject {
    
    var auxInstruction: StringDictionary[Instruction]
    
    var child: Instruction
    
    var component: ComponentInstruction
    
    /**
      * Returns a new instruction that shares the state of the existing instruction, but with
      * the given child {@link Instruction} replacing the existing child.
      */
    def replaceChild(child: Instruction): Instruction
    
    def resolveComponent(): Any
    
    def specificity(): Double
    
    /**
      * default instructions override these
      */
    def toLinkUrl(): String
    
    /**
      * converts the instruction into a URL string
      */
    def toRootUrl(): String
    
    /**
      * If the final URL for the instruction is ``
      */
    def toUrlPath(): String
    
    def toUrlQuery(): String
    
    def urlParams(): js.Array[String]
    
    def urlPath(): String
  }
  object Instruction {
    
    inline def apply(
      auxInstruction: StringDictionary[Instruction],
      child: Instruction,
      component: ComponentInstruction,
      replaceChild: Instruction => Instruction,
      resolveComponent: () => Any,
      specificity: () => Double,
      toLinkUrl: () => String,
      toRootUrl: () => String,
      toUrlPath: () => String,
      toUrlQuery: () => String,
      urlParams: () => js.Array[String],
      urlPath: () => String
    ): Instruction = {
      val __obj = js.Dynamic.literal(auxInstruction = auxInstruction.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], replaceChild = js.Any.fromFunction1(replaceChild), resolveComponent = js.Any.fromFunction0(resolveComponent), specificity = js.Any.fromFunction0(specificity), toLinkUrl = js.Any.fromFunction0(toLinkUrl), toRootUrl = js.Any.fromFunction0(toRootUrl), toUrlPath = js.Any.fromFunction0(toUrlPath), toUrlQuery = js.Any.fromFunction0(toUrlQuery), urlParams = js.Any.fromFunction0(urlParams), urlPath = js.Any.fromFunction0(urlPath))
      __obj.asInstanceOf[Instruction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Instruction] (val x: Self) extends AnyVal {
      
      inline def setAuxInstruction(value: StringDictionary[Instruction]): Self = StObject.set(x, "auxInstruction", value.asInstanceOf[js.Any])
      
      inline def setChild(value: Instruction): Self = StObject.set(x, "child", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: ComponentInstruction): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setReplaceChild(value: Instruction => Instruction): Self = StObject.set(x, "replaceChild", js.Any.fromFunction1(value))
      
      inline def setResolveComponent(value: () => Any): Self = StObject.set(x, "resolveComponent", js.Any.fromFunction0(value))
      
      inline def setSpecificity(value: () => Double): Self = StObject.set(x, "specificity", js.Any.fromFunction0(value))
      
      inline def setToLinkUrl(value: () => String): Self = StObject.set(x, "toLinkUrl", js.Any.fromFunction0(value))
      
      inline def setToRootUrl(value: () => String): Self = StObject.set(x, "toRootUrl", js.Any.fromFunction0(value))
      
      inline def setToUrlPath(value: () => String): Self = StObject.set(x, "toUrlPath", js.Any.fromFunction0(value))
      
      inline def setToUrlQuery(value: () => String): Self = StObject.set(x, "toUrlQuery", js.Any.fromFunction0(value))
      
      inline def setUrlParams(value: () => js.Array[String]): Self = StObject.set(x, "urlParams", js.Any.fromFunction0(value))
      
      inline def setUrlPath(value: () => String): Self = StObject.set(x, "urlPath", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Defines route lifecycle method `routerOnActivate`, which is called by the router at the end of a
    * successful route navigation.
    *
    * For a single component's navigation, only one of either {@link OnActivate} or {@link OnReuse}
    * will be called depending on the result of {@link CanReuse}.
    *
    * The `routerOnActivate` hook is called with two {@link ComponentInstruction}s as parameters, the
    * first
    * representing the current route being navigated to, and the second parameter representing the
    * previous route or `null`.
    *
    * If `routerOnActivate` returns a promise, the route change will wait until the promise settles to
    * instantiate and activate child components.
    *
    * ### Example
    * {@example router/ts/on_activate/on_activate_example.ts region='routerOnActivate'}
    */
  @js.native
  trait OnActivate extends StObject {
    
    @JSName("$routerOnActivate")
    def $routerOnActivate(): Any = js.native
    @JSName("$routerOnActivate")
    def $routerOnActivate(next: Unit, prev: ComponentInstruction): Any = js.native
    @JSName("$routerOnActivate")
    def $routerOnActivate(next: ComponentInstruction): Any = js.native
    @JSName("$routerOnActivate")
    def $routerOnActivate(next: ComponentInstruction, prev: ComponentInstruction): Any = js.native
  }
  
  /**
    * Defines route lifecycle method `routerOnDeactivate`, which is called by the router before
    * destroying
    * a component as part of a route change.
    *
    * The `routerOnDeactivate` hook is called with two {@link ComponentInstruction}s as parameters, the
    * first
    * representing the current route being navigated to, and the second parameter representing the
    * previous route.
    *
    * If `routerOnDeactivate` returns a promise, the route change will wait until the promise settles.
    *
    * ### Example
    * {@example router/ts/on_deactivate/on_deactivate_example.ts region='routerOnDeactivate'}
    */
  @js.native
  trait OnDeactivate extends StObject {
    
    @JSName("$routerOnDeactivate")
    def $routerOnDeactivate(): Any = js.native
    @JSName("$routerOnDeactivate")
    def $routerOnDeactivate(next: Unit, prev: ComponentInstruction): Any = js.native
    @JSName("$routerOnDeactivate")
    def $routerOnDeactivate(next: ComponentInstruction): Any = js.native
    @JSName("$routerOnDeactivate")
    def $routerOnDeactivate(next: ComponentInstruction, prev: ComponentInstruction): Any = js.native
  }
  
  /**
    * Defines route lifecycle method `routerOnReuse`, which is called by the router at the end of a
    * successful route navigation when {@link CanReuse} is implemented and returns or resolves to true.
    *
    * For a single component's navigation, only one of either {@link OnActivate} or {@link OnReuse}
    * will be called, depending on the result of {@link CanReuse}.
    *
    * The `routerOnReuse` hook is called with two {@link ComponentInstruction}s as parameters, the
    * first
    * representing the current route being navigated to, and the second parameter representing the
    * previous route or `null`.
    *
    * ### Example
    * {@example router/ts/reuse/reuse_example.ts region='reuseCmp'}
    */
  @js.native
  trait OnReuse extends StObject {
    
    @JSName("$routerOnReuse")
    def $routerOnReuse(): Any = js.native
    @JSName("$routerOnReuse")
    def $routerOnReuse(next: Unit, prev: ComponentInstruction): Any = js.native
    @JSName("$routerOnReuse")
    def $routerOnReuse(next: ComponentInstruction): Any = js.native
    @JSName("$routerOnReuse")
    def $routerOnReuse(next: ComponentInstruction, prev: ComponentInstruction): Any = js.native
  }
  
  /**
    * RouteData is an immutable map of additional data you can configure in your Route.
    * You can inject RouteData into the constructor of a component to use it.
    */
  trait RouteData extends StObject {
    
    var data: StringDictionary[Any]
    
    def get(key: String): Any
  }
  object RouteData {
    
    inline def apply(data: StringDictionary[Any], get: String => Any): RouteData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[RouteData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteData] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * `RouteDefinition` defines a route within a {@link RouteConfig} decorator.
    *
    * Supported keys:
    * - `path` or `aux` (requires exactly one of these)
    * - `component`, `loader`,  `redirectTo` (requires exactly one of these)
    * - `name` or `as` (optional) (requires exactly one of these)
    * - `data` (optional)
    *
    * See also {@link Route}, {@link AsyncRoute}, {@link AuxRoute}, and {@link Redirect}.
    */
  trait RouteDefinition extends StObject {
    
    var as: js.UndefOr[String] = js.undefined
    
    var aux: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[Type | ComponentDefinition | String] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var loader: js.UndefOr[Function] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var redirectTo: js.UndefOr[js.Array[Any]] = js.undefined
    
    var useAsDefault: js.UndefOr[Boolean] = js.undefined
  }
  object RouteDefinition {
    
    inline def apply(): RouteDefinition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteDefinition] (val x: Self) extends AnyVal {
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAux(value: String): Self = StObject.set(x, "aux", value.asInstanceOf[js.Any])
      
      inline def setAuxUndefined: Self = StObject.set(x, "aux", js.undefined)
      
      inline def setComponent(value: Type | ComponentDefinition | String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setLoader(value: Function): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRedirectTo(value: js.Array[Any]): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
      
      inline def setRedirectToVarargs(value: Any*): Self = StObject.set(x, "redirectTo", js.Array(value*))
      
      inline def setUseAsDefault(value: Boolean): Self = StObject.set(x, "useAsDefault", value.asInstanceOf[js.Any])
      
      inline def setUseAsDefaultUndefined: Self = StObject.set(x, "useAsDefault", js.undefined)
    }
  }
  
  @js.native
  trait RouteRegistry extends StObject {
    
    /**
      * Given a component and a configuration object, add the route to this registry
      */
    def config(parentComponent: Any, config: RouteDefinition): Unit = js.native
    
    /**
      * Reads the annotations of a component and configures the registry based on them
      */
    def configFromComponent(component: Any): Unit = js.native
    
    /**
      * Given a normalized list with component names and params like: `['user', {id: 3 }]`
      * generates a url with a leading slash relative to the provided `parentComponent`.
      *
      * If the optional param `_aux` is `true`, then we generate starting at an auxiliary
      * route boundary.
      */
    def generate(linkParams: js.Array[Any], ancestorInstructions: js.Array[Instruction]): Instruction = js.native
    def generate(linkParams: js.Array[Any], ancestorInstructions: js.Array[Instruction], _aux: Boolean): Instruction = js.native
    
    def generateDefault(componentCursor: Any): Instruction = js.native
    
    def hasRoute(name: String, parentComponent: Any): Boolean = js.native
    
    /**
      * Given a URL and a parent component, return the most specific instruction for navigating
      * the application into the state specified by the url
      */
    def recognize(url: String, ancestorInstructions: js.Array[Instruction]): Any = js.native
  }
  
  /**
    * The `Router` is responsible for mapping URLs to components.
    *
    * You can see the state of the router by inspecting the read-only field `router.navigating`.
    * This may be useful for showing a spinner, for instance.
    *
    * ## Concepts
    *
    * Routers and component instances have a 1:1 correspondence.
    *
    * The router holds reference to a number of {@link RouterOutlet}.
    * An outlet is a placeholder that the router dynamically fills in depending on the current URL.
    *
    * When the router navigates from a URL, it must first recognize it and serialize it into an
    * `Instruction`.
    * The router uses the `RouteRegistry` to get an `Instruction`.
    */
  @js.native
  trait Router extends StObject {
    
    /**
      * Constructs a child router. You probably don't need to use this unless you're writing a reusable
      * component.
      */
    def auxRouter(hostComponent: Any): Router = js.native
    
    /**
      * Constructs a child router. You probably don't need to use this unless you're writing a reusable
      * component.
      */
    def childRouter(hostComponent: Any): Router = js.native
    
    /**
      * Updates this router and all descendant routers according to the given instruction
      */
    def commit(instruction: Instruction): Any = js.native
    def commit(instruction: Instruction, _skipLocationChange: Boolean): Any = js.native
    
    /**
      * Dynamically update the routing configuration and trigger a navigation.
      *
      * ### Usage
      *
      * ```
      * router.config([
      *   { 'path': '/', 'component': IndexComp },
      *   { 'path': '/user/:id', 'component': UserComp },
      * ]);
      * ```
      */
    def config(definitions: js.Array[RouteDefinition]): Any = js.native
    
    var currentInstruction: Instruction = js.native
    
    /**
      * Removes the contents of this router's outlet and all descendant outlets
      */
    def deactivate(instruction: Instruction): Any = js.native
    
    /**
      * Generate an `Instruction` based on the provided Route Link DSL.
      */
    def generate(linkParams: js.Array[Any]): Instruction = js.native
    
    var hostComponent: Any = js.native
    
    /**
      * Given an instruction, returns `true` if the instruction is currently active,
      * otherwise `false`.
      */
    def isRouteActive(instruction: Instruction): Boolean = js.native
    
    var lastNavigationAttempt: String = js.native
    
    /**
      * Navigate based on the provided Route Link DSL. It's preferred to navigate with this method
      * over `navigateByUrl`.
      *
      * ### Usage
      *
      * This method takes an array representing the Route Link DSL:
      * ```
      * ['./MyCmp', {param: 3}]
      * ```
      * See the {@link RouterLink} directive for more.
      */
    def navigate(linkParams: js.Array[Any]): Any = js.native
    
    /**
      * Navigate via the provided instruction. Returns a promise that resolves when navigation is
      * complete.
      */
    def navigateByInstruction(instruction: Instruction): Any = js.native
    def navigateByInstruction(instruction: Instruction, _skipLocationChange: Boolean): Any = js.native
    
    /**
      * Navigate to a URL. Returns a promise that resolves when navigation is complete.
      * It's preferred to navigate with `navigate` instead of this method, since URLs are more brittle.
      *
      * If the given URL begins with a `/`, router will navigate absolutely.
      * If the given URL does not begin with `/`, the router will navigate relative to this component.
      */
    def navigateByUrl(url: String): Any = js.native
    def navigateByUrl(url: String, _skipLocationChange: Boolean): Any = js.native
    
    var navigating: Boolean = js.native
    
    var parent: Router = js.native
    
    /**
      * Given a URL, returns an instruction representing the component graph
      */
    def recognize(url: String): Any = js.native
    
    /**
      * Register an outlet to notified of auxiliary route changes.
      *
      * You probably don't need to use this unless you're writing a reusable component.
      */
    def registerAuxOutlet(outlet: RouterOutlet): Any = js.native
    
    /**
      * Register an outlet to be notified of primary route changes.
      *
      * You probably don't need to use this unless you're writing a reusable component.
      */
    def registerPrimaryOutlet(outlet: RouterOutlet): Any = js.native
    
    var registry: RouteRegistry = js.native
    
    /**
      * Navigates to either the last URL successfully navigated to, or the last URL requested if the
      * router has yet to successfully navigate.
      */
    def renavigate(): Any = js.native
    
    /**
      * Subscribe to URL updates from the router
      */
    def subscribe(onNext: js.Function1[/* value */ Any, Unit]): js.Object = js.native
  }
  
  /**
    * A router outlet is a placeholder that Angular dynamically fills based on the application's route.
    *
    * ## Use
    *
    * ```
    * <router-outlet></router-outlet>
    * ```
    */
  trait RouterOutlet extends StObject {
    
    /**
      * Called by the Router to instantiate a new component during the commit phase of a navigation.
      * This method in turn is responsible for calling the `routerOnActivate` hook of its child.
      */
    def activate(nextInstruction: ComponentInstruction): Any
    
    /**
      * Called by the {@link Router} when an outlet disposes of a component's contents.
      * This method in turn is responsible for calling the `routerOnDeactivate` hook of its child.
      */
    def deactivate(nextInstruction: ComponentInstruction): Any
    
    var name: String
    
    /**
      * Called by the {@link Router} during the commit phase of a navigation when an outlet
      * reuses a component between different routes.
      * This method in turn is responsible for calling the `routerOnReuse` hook of its child.
      */
    def reuse(nextInstruction: ComponentInstruction): Any
    
    /**
      * Called by the {@link Router} during recognition phase of a navigation.
      *
      * If this resolves to `false`, the given navigation is cancelled.
      *
      * This method delegates to the child component's `routerCanDeactivate` hook if it exists,
      * and otherwise resolves to true.
      */
    def routerCanDeactivate(nextInstruction: ComponentInstruction): Any
    
    /**
      * Called by the {@link Router} during recognition phase of a navigation.
      *
      * If the new child component has a different Type than the existing child component,
      * this will resolve to `false`. You can't reuse an old component when the new component
      * is of a different Type.
      *
      * Otherwise, this method delegates to the child component's `routerCanReuse` hook if it exists,
      * or resolves to true if the hook is not present.
      */
    def routerCanReuse(nextInstruction: ComponentInstruction): Any
  }
  object RouterOutlet {
    
    inline def apply(
      activate: ComponentInstruction => Any,
      deactivate: ComponentInstruction => Any,
      name: String,
      reuse: ComponentInstruction => Any,
      routerCanDeactivate: ComponentInstruction => Any,
      routerCanReuse: ComponentInstruction => Any
    ): RouterOutlet = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), deactivate = js.Any.fromFunction1(deactivate), name = name.asInstanceOf[js.Any], reuse = js.Any.fromFunction1(reuse), routerCanDeactivate = js.Any.fromFunction1(routerCanDeactivate), routerCanReuse = js.Any.fromFunction1(routerCanReuse))
      __obj.asInstanceOf[RouterOutlet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterOutlet] (val x: Self) extends AnyVal {
      
      inline def setActivate(value: ComponentInstruction => Any): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
      
      inline def setDeactivate(value: ComponentInstruction => Any): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReuse(value: ComponentInstruction => Any): Self = StObject.set(x, "reuse", js.Any.fromFunction1(value))
      
      inline def setRouterCanDeactivate(value: ComponentInstruction => Any): Self = StObject.set(x, "routerCanDeactivate", js.Any.fromFunction1(value))
      
      inline def setRouterCanReuse(value: ComponentInstruction => Any): Self = StObject.set(x, "routerCanReuse", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Runtime representation a type that a Component or other object is instances of.
    *
    * An example of a `Type` is `MyCustomComponent` class, which in JavaScript is be represented by
    * the `MyCustomComponent` constructor function.
    */
  type Type = Function
}
