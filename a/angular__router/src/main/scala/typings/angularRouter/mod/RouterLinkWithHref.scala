package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.mod.LocationStrategy
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.SimpleChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterLinkWithHref")
@js.native
class RouterLinkWithHref protected ()
  extends StObject
     with OnChanges
     with OnDestroy {
  def this(router: Router, route: ActivatedRoute, locationStrategy: LocationStrategy) = this()
  
  var commands: js.Any = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#fragment UrlCreationOptions#fragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var fragment: js.UndefOr[String] = js.native
  
  var href: String = js.native
  
  var locationStrategy: js.Any = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /** @nodoc */
  def onClick(button: Double, ctrlKey: Boolean, shiftKey: Boolean, altKey: Boolean, metaKey: Boolean): Boolean = js.native
  
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
  def routerLink_=(commands: js.UndefOr[js.Array[js.Any] | String | Null]): Unit = js.native
  
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
  
  var subscription: js.Any = js.native
  
  var target: String = js.native
  
  var updateTargetUrlAndHref: js.Any = js.native
  
  def urlTree: UrlTree = js.native
}
