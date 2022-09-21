package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlCreationOptions extends StObject {
  
  /**
    * Sets the hash fragment for the URL.
    *
    * ```
    * // Navigate to /results#top
    * this.router.navigate(['/results'], { fragment: 'top' });
    * ```
    */
  var fragment: js.UndefOr[String] = js.undefined
  
  /**
    * When true, preserves the URL fragment for the next navigation
    *
    * ```
    * // Preserve fragment from /results#top to /view#top
    * this.router.navigate(['/view'], { preserveFragment: true });
    * ```
    */
  var preserveFragment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets query parameters to the URL.
    *
    * ```
    * // Navigate to /results?page=1
    * this.router.navigate(['/results'], { queryParams: { page: 1 } });
    * ```
    */
  var queryParams: js.UndefOr[Params | Null] = js.undefined
  
  /**
    * How to handle query parameters in the router link for the next navigation.
    * One of:
    * * `preserve` : Preserve current parameters.
    * * `merge` : Merge new with current parameters.
    *
    * The "preserve" option discards any new query params:
    * ```
    * // from /view1?page=1 to/view2?page=1
    * this.router.navigate(['/view2'], { queryParams: { page: 2 },  queryParamsHandling: "preserve"
    * });
    * ```
    * The "merge" option appends new query params to the params from the current URL:
    * ```
    * // from /view1?page=1 to/view2?page=1&otherKey=2
    * this.router.navigate(['/view2'], { queryParams: { otherKey: 2 },  queryParamsHandling: "merge"
    * });
    * ```
    * In case of a key collision between current parameters and those in the `queryParams` object,
    * the new value is used.
    *
    */
  var queryParamsHandling: js.UndefOr[QueryParamsHandling | Null] = js.undefined
  
  /**
    * Specifies a root URI to use for relative navigation.
    *
    * For example, consider the following route configuration where the parent route
    * has two children.
    *
    * ```
    * [{
    *   path: 'parent',
    *   component: ParentComponent,
    *   children: [{
    *     path: 'list',
    *     component: ListComponent
    *   },{
    *     path: 'child',
    *     component: ChildComponent
    *   }]
    * }]
    * ```
    *
    * The following `go()` function navigates to the `list` route by
    * interpreting the destination URI as relative to the activated `child`  route
    *
    * ```
    *  @Component({...})
    *  class ChildComponent {
    *    constructor(private router: Router, private route: ActivatedRoute) {}
    *
    *    go() {
    *      this.router.navigate(['../list'], { relativeTo: this.route });
    *    }
    *  }
    * ```
    *
    * A value of `null` or `undefined` indicates that the navigation commands should be applied
    * relative to the root.
    */
  var relativeTo: js.UndefOr[ActivatedRoute | Null] = js.undefined
}
object UrlCreationOptions {
  
  inline def apply(): UrlCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlCreationOptions]
  }
  
  extension [Self <: UrlCreationOptions](x: Self) {
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setPreserveFragment(value: Boolean): Self = StObject.set(x, "preserveFragment", value.asInstanceOf[js.Any])
    
    inline def setPreserveFragmentUndefined: Self = StObject.set(x, "preserveFragment", js.undefined)
    
    inline def setQueryParams(value: Params): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsHandling(value: QueryParamsHandling): Self = StObject.set(x, "queryParamsHandling", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsHandlingNull: Self = StObject.set(x, "queryParamsHandling", null)
    
    inline def setQueryParamsHandlingUndefined: Self = StObject.set(x, "queryParamsHandling", js.undefined)
    
    inline def setQueryParamsNull: Self = StObject.set(x, "queryParams", null)
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setRelativeTo(value: ActivatedRoute): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setRelativeToNull: Self = StObject.set(x, "relativeTo", null)
    
    inline def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
  }
}
