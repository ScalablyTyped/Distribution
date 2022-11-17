package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterConfigOptions extends StObject {
  
  /**
    * Configures how the Router attempts to restore state when a navigation is cancelled.
    *
    * 'replace' - Always uses `location.replaceState` to set the browser state to the state of the
    * router before the navigation started. This means that if the URL of the browser is updated
    * _before_ the navigation is canceled, the Router will simply replace the item in history rather
    * than trying to restore to the previous location in the session history. This happens most
    * frequently with `urlUpdateStrategy: 'eager'` and navigations with the browser back/forward
    * buttons.
    *
    * 'computed' - Will attempt to return to the same index in the session history that corresponds
    * to the Angular route when the navigation gets cancelled. For example, if the browser back
    * button is clicked and the navigation is cancelled, the Router will trigger a forward navigation
    * and vice versa.
    *
    * Note: the 'computed' option is incompatible with any `UrlHandlingStrategy` which only
    * handles a portion of the URL because the history restoration navigates to the previous place in
    * the browser history rather than simply resetting a portion of the URL.
    *
    * The default value is `replace` when not set.
    */
  var canceledNavigationResolution: js.UndefOr["replace" | "computed"] = js.undefined
  
  /**
    * Define what the router should do if it receives a navigation request to the current URL.
    * Default is `ignore`, which causes the router ignores the navigation.
    * This can disable features such as a "refresh" button.
    * Use this option to configure the behavior when navigating to the
    * current URL. Default is 'ignore'.
    */
  var onSameUrlNavigation: js.UndefOr["reload" | "ignore"] = js.undefined
  
  /**
    * Defines how the router merges parameters, data, and resolved data from parent to child
    * routes. By default ('emptyOnly'), inherits parent parameters only for
    * path-less or component-less routes.
    *
    * Set to 'always' to enable unconditional inheritance of parent parameters.
    *
    * Note that when dealing with matrix parameters, "parent" refers to the parent `Route`
    * config which does not necessarily mean the "URL segment to the left". When the `Route` `path`
    * contains multiple segments, the matrix parameters must appear on the last segment. For example,
    * matrix parameters for `{path: 'a/b', component: MyComp}` should appear as `a/b;foo=bar` and not
    * `a;foo=bar/b`.
    *
    */
  var paramsInheritanceStrategy: js.UndefOr["emptyOnly" | "always"] = js.undefined
  
  /**
    * Defines when the router updates the browser URL. By default ('deferred'),
    * update after successful navigation.
    * Set to 'eager' if prefer to update the URL at the beginning of navigation.
    * Updating the URL early allows you to handle a failure of navigation by
    * showing an error message with the URL that failed.
    */
  var urlUpdateStrategy: js.UndefOr["deferred" | "eager"] = js.undefined
}
object RouterConfigOptions {
  
  inline def apply(): RouterConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterConfigOptions]
  }
  
  extension [Self <: RouterConfigOptions](x: Self) {
    
    inline def setCanceledNavigationResolution(value: "replace" | "computed"): Self = StObject.set(x, "canceledNavigationResolution", value.asInstanceOf[js.Any])
    
    inline def setCanceledNavigationResolutionUndefined: Self = StObject.set(x, "canceledNavigationResolution", js.undefined)
    
    inline def setOnSameUrlNavigation(value: "reload" | "ignore"): Self = StObject.set(x, "onSameUrlNavigation", value.asInstanceOf[js.Any])
    
    inline def setOnSameUrlNavigationUndefined: Self = StObject.set(x, "onSameUrlNavigation", js.undefined)
    
    inline def setParamsInheritanceStrategy(value: "emptyOnly" | "always"): Self = StObject.set(x, "paramsInheritanceStrategy", value.asInstanceOf[js.Any])
    
    inline def setParamsInheritanceStrategyUndefined: Self = StObject.set(x, "paramsInheritanceStrategy", js.undefined)
    
    inline def setUrlUpdateStrategy(value: "deferred" | "eager"): Self = StObject.set(x, "urlUpdateStrategy", value.asInstanceOf[js.Any])
    
    inline def setUrlUpdateStrategyUndefined: Self = StObject.set(x, "urlUpdateStrategy", js.undefined)
  }
}
