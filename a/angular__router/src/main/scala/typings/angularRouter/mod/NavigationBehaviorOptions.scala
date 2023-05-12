package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularRouter.angularRouterStrings.reload
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBehaviorOptions extends StObject {
  
  /**
    * How to handle a navigation request to the current URL.
    *
    * This value is a subset of the options available in `OnSameUrlNavigation` and
    * will take precedence over the default value set for the `Router`.
    *
    * @see `OnSameUrlNavigation`
    * @see `RouterConfigOptions`
    */
  var onSameUrlNavigation: js.UndefOr[Extract[OnSameUrlNavigation, reload]] = js.undefined
  
  /**
    * When true, navigates while replacing the current state in history.
    *
    * ```
    * // Navigate to /view
    * this.router.navigate(['/view'], { replaceUrl: true });
    * ```
    */
  var replaceUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, navigates without pushing a new state into history.
    *
    * ```
    * // Navigate silently to /view
    * this.router.navigate(['/view'], { skipLocationChange: true });
    * ```
    */
  var skipLocationChange: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Developer-defined state that can be passed to any navigation.
    * Access this value through the `Navigation.extras` object
    * returned from the [Router.getCurrentNavigation()
    * method](api/router/Router#getcurrentnavigation) while a navigation is executing.
    *
    * After a navigation completes, the router writes an object containing this
    * value together with a `navigationId` to `history.state`.
    * The value is written when `location.go()` or `location.replaceState()`
    * is called before activating this route.
    *
    * Note that `history.state` does not pass an object equality test because
    * the router adds the `navigationId` on each navigation.
    *
    */
  var state: js.UndefOr[StringDictionary[Any]] = js.undefined
}
object NavigationBehaviorOptions {
  
  inline def apply(): NavigationBehaviorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBehaviorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationBehaviorOptions] (val x: Self) extends AnyVal {
    
    inline def setOnSameUrlNavigation(value: Extract[OnSameUrlNavigation, reload]): Self = StObject.set(x, "onSameUrlNavigation", value.asInstanceOf[js.Any])
    
    inline def setOnSameUrlNavigationUndefined: Self = StObject.set(x, "onSameUrlNavigation", js.undefined)
    
    inline def setReplaceUrl(value: Boolean): Self = StObject.set(x, "replaceUrl", value.asInstanceOf[js.Any])
    
    inline def setReplaceUrlUndefined: Self = StObject.set(x, "replaceUrl", js.undefined)
    
    inline def setSkipLocationChange(value: Boolean): Self = StObject.set(x, "skipLocationChange", value.asInstanceOf[js.Any])
    
    inline def setSkipLocationChangeUndefined: Self = StObject.set(x, "skipLocationChange", js.undefined)
    
    inline def setState(value: StringDictionary[Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
