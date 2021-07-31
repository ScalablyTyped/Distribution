package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBehaviorOptions extends StObject {
  
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
  var state: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object NavigationBehaviorOptions {
  
  @scala.inline
  def apply(): NavigationBehaviorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBehaviorOptions]
  }
  
  @scala.inline
  implicit class NavigationBehaviorOptionsMutableBuilder[Self <: NavigationBehaviorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplaceUrl(value: Boolean): Self = StObject.set(x, "replaceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUrlUndefined: Self = StObject.set(x, "replaceUrl", js.undefined)
    
    @scala.inline
    def setSkipLocationChange(value: Boolean): Self = StObject.set(x, "skipLocationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipLocationChangeUndefined: Self = StObject.set(x, "skipLocationChange", js.undefined)
    
    @scala.inline
    def setState(value: StringDictionary[js.Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
