package typings.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsActiveMatchOptions extends StObject {
  
  /**
    * - `'exact'`: indicates that the `UrlTree` fragments must be equal.
    * - `'ignored'`: the fragments will not be compared when determining if a
    * `UrlTree` is active.
    */
  var fragment: "exact" | "ignored"
  
  /**
    * Defines the strategy for comparing the matrix parameters of two `UrlTree`s.
    *
    * The matrix parameter matching is dependent on the strategy for matching the
    * segments. That is, if the `paths` option is set to `'subset'`, only
    * the matrix parameters of the matching segments will be compared.
    *
    * - `'exact'`: Requires that matching segments also have exact matrix parameter
    * matches.
    * - `'subset'`: The matching segments in the router's active `UrlTree` may contain
    * extra matrix parameters, but those that exist in the `UrlTree` in question must match.
    * - `'ignored'`: When comparing `UrlTree`s, matrix params will be ignored.
    */
  var matrixParams: "exact" | "subset" | "ignored"
  
  /**
    * Defines the strategy for comparing the `UrlSegment`s of the `UrlTree`s.
    *
    * - `'exact'`: all segments in each `UrlTree` must match.
    * - `'subset'`: a `UrlTree` will be determined to be active if it
    * is a subtree of the active route. That is, the active route may contain extra
    * segments, but must at least have all the segments of the `UrlTree` in question.
    */
  var paths: "exact" | "subset"
  
  /**
    * Defines the strategy for comparing the query parameters of two `UrlTree`s.
    *
    * - `'exact'`: the query parameters must match exactly.
    * - `'subset'`: the active `UrlTree` may contain extra parameters,
    * but must match the key and value of any that exist in the `UrlTree` in question.
    * - `'ignored'`: When comparing `UrlTree`s, query params will be ignored.
    */
  var queryParams: "exact" | "subset" | "ignored"
}
object IsActiveMatchOptions {
  
  inline def apply(
    fragment: "exact" | "ignored",
    matrixParams: "exact" | "subset" | "ignored",
    paths: "exact" | "subset",
    queryParams: "exact" | "subset" | "ignored"
  ): IsActiveMatchOptions = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], matrixParams = matrixParams.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsActiveMatchOptions]
  }
  
  extension [Self <: IsActiveMatchOptions](x: Self) {
    
    inline def setFragment(value: "exact" | "ignored"): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setMatrixParams(value: "exact" | "subset" | "ignored"): Self = StObject.set(x, "matrixParams", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: "exact" | "subset"): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setQueryParams(value: "exact" | "subset" | "ignored"): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
  }
}
