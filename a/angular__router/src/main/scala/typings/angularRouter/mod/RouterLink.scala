package typings.angularRouter.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnChanges
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularRouter.angularRouterBooleans.`true`
import typings.angularRouter.angularRouterStrings.`ColonnotLeftparenthesisaRightparenthesisColonnotLeftparenthesisareaRightparenthesis[routerLink]`
import typings.angularRouter.anon.Attribute
import typings.angularRouter.anon.Fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/router", "RouterLink")
@js.native
open class RouterLink protected ()
  extends StObject
     with OnChanges {
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: String,
    renderer: Renderer2,
    el: ElementRef[Any]
  ) = this()
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: Null,
    renderer: Renderer2,
    el: ElementRef[Any]
  ) = this()
  def this(
    router: Router,
    route: ActivatedRoute,
    tabIndexAttribute: Unit,
    renderer: Renderer2,
    el: ElementRef[Any]
  ) = this()
  
  /* private */ var _preserveFragment: Any = js.native
  
  /* private */ var _replaceUrl: Any = js.native
  
  /* private */ var _skipLocationChange: Any = js.native
  
  /* private */ var commands: Any = js.native
  
  /* private */ val el: Any = js.native
  
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#fragment UrlCreationOptions#fragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var fragment: js.UndefOr[String] = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /** @nodoc */
  def onClick(): Boolean = js.native
  
  def preserveFragment: Boolean = js.native
  /**
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * @see {@link UrlCreationOptions#preserveFragment UrlCreationOptions#preserveFragment}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  def preserveFragment_=(preserveFragment: js.UndefOr[Boolean | String | Null]): Unit = js.native
  
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
    * Passed to {@link Router#createUrlTree Router#createUrlTree} as part of the
    * `UrlCreationOptions`.
    * Specify a value here when you do not want to use the default value
    * for `routerLink`, which is the current activated route.
    * Note that a value of `undefined` here will use the `routerLink` default.
    * @see {@link UrlCreationOptions#relativeTo UrlCreationOptions#relativeTo}
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  var relativeTo: js.UndefOr[ActivatedRoute | Null] = js.native
  
  /* private */ val renderer: Any = js.native
  
  def replaceUrl: Boolean = js.native
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#replaceUrl NavigationBehaviorOptions#replaceUrl}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  def replaceUrl_=(replaceUrl: js.UndefOr[Boolean | String | Null]): Unit = js.native
  
  /* private */ var route: Any = js.native
  
  /* private */ var router: Any = js.native
  
  /**
    * Commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **array**: commands to pass to {@link Router#createUrlTree Router#createUrlTree}.
    *   - **string**: shorthand for array of commands with just the string, i.e. `['/route']`
    *   - **null|undefined**: effectively disables the `routerLink`
    * @see {@link Router#createUrlTree Router#createUrlTree}
    */
  def routerLink_=(commands: js.UndefOr[js.Array[Any] | String | Null]): Unit = js.native
  
  /**
    * Modifies the tab index if there was not a tabindex attribute on the element during
    * instantiation.
    */
  /* private */ var setTabIndexIfNotOnNativeEl: Any = js.native
  
  def skipLocationChange: Boolean = js.native
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#skipLocationChange NavigationBehaviorOptions#skipLocationChange}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  def skipLocationChange_=(skipLocationChange: js.UndefOr[Boolean | String | Null]): Unit = js.native
  
  /**
    * Passed to {@link Router#navigateByUrl Router#navigateByUrl} as part of the
    * `NavigationBehaviorOptions`.
    * @see {@link NavigationBehaviorOptions#state NavigationBehaviorOptions#state}
    * @see {@link Router#navigateByUrl Router#navigateByUrl}
    */
  var state: js.UndefOr[StringDictionary[Any]] = js.native
  
  /* private */ val tabIndexAttribute: Any = js.native
  
  def urlTree: UrlTree | Null = js.native
}
/* static members */
object RouterLink {
  
  @JSImport("@angular/router", "RouterLink")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/router", "RouterLink.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    RouterLink, 
    `ColonnotLeftparenthesisaRightparenthesisColonnotLeftparenthesisareaRightparenthesis[routerLink]`, 
    scala.Nothing, 
    Fragment, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      RouterLink, 
      `ColonnotLeftparenthesisaRightparenthesisColonnotLeftparenthesisareaRightparenthesis[routerLink]`, 
      scala.Nothing, 
      Fragment, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/router", "RouterLink.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[RouterLink, js.Tuple5[Null, Null, Attribute, Null, Null]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[RouterLink, js.Tuple5[Null, Null, Attribute, Null, Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
