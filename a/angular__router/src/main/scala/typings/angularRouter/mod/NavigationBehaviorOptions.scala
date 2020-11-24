package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationBehaviorOptions extends js.Object {
  
  /**
    * When true, navigates while replacing the current state in history.
    *
    * ```
    * // Navigate to /view
    * this.router.navigate(['/view'], { replaceUrl: true });
    * ```
    */
  var replaceUrl: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, navigates without pushing a new state into history.
    *
    * ```
    * // Navigate silently to /view
    * this.router.navigate(['/view'], { skipLocationChange: true });
    * ```
    */
  var skipLocationChange: js.UndefOr[Boolean] = js.native
  
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
  var state: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object NavigationBehaviorOptions {
  
  @scala.inline
  def apply(): NavigationBehaviorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBehaviorOptions]
  }
  
  @scala.inline
  implicit class NavigationBehaviorOptionsOps[Self <: NavigationBehaviorOptions] (val x: Self) extends AnyVal {
    
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
    def setReplaceUrl(value: Boolean): Self = this.set("replaceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceUrl: Self = this.set("replaceUrl", js.undefined)
    
    @scala.inline
    def setSkipLocationChange(value: Boolean): Self = this.set("skipLocationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipLocationChange: Self = this.set("skipLocationChange", js.undefined)
    
    @scala.inline
    def setState(value: StringDictionary[js.Any]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
