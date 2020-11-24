package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterLink")
@js.native
class RouterLink protected () extends OnChanges {
  def this(router: Router, route: ActivatedRoute, tabIndex: String, renderer: Renderer2, el: ElementRef[_]) = this()
  
  var commands: js.Any = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#fragment UrlCreationOptions#fragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var fragment: js.UndefOr[String] = js.native
  
  /** @nodoc */
  def onClick(): Boolean = js.native
  
  var preserve: js.Any = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#preserveFragment UrlCreationOptions#preserveFragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var preserveFragment: Boolean = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#queryParams UrlCreationOptions#queryParams}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var queryParams: js.UndefOr[Params | Null] = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#queryParamsHandling UrlCreationOptions#queryParamsHandling}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var queryParamsHandling: js.UndefOr[QueryParamsHandling | Null] = js.native
  
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#replaceUrl NavigationBehaviorOptions#replaceUrl}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  var replaceUrl: Boolean = js.native
  
  var route: js.Any = js.native
  
  var router: js.Any = js.native
  
  /**
    * Commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **array**: commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **string**: shorthand for array of commands with just the string, i.e. `['/route']`
    *   - **null|undefined**: shorthand for an empty array of commands, i.e. `[]`
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  def routerLink_=(commands: js.UndefOr[js.Array[_] | String | Null]): Unit = js.native
  
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#skipLocationChange NavigationBehaviorOptions#skipLocationChange}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  var skipLocationChange: Boolean = js.native
  
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#state NavigationBehaviorOptions#state}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  var state: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  def urlTree: UrlTree = js.native
}
