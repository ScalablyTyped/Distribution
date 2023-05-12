package typings.angularRouter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fragment extends StObject {
  
  var fragment: AliasRequired
  
  var preserveFragment: `3`
  
  var queryParams: Required
  
  var queryParamsHandling: `0`
  
  var relativeTo: `2`
  
  var replaceUrl: `5`
  
  var routerLink: `6`
  
  var skipLocationChange: `4`
  
  var state: `1`
  
  var target: Alias
}
object Fragment {
  
  inline def apply(
    fragment: AliasRequired,
    preserveFragment: `3`,
    queryParams: Required,
    queryParamsHandling: `0`,
    relativeTo: `2`,
    replaceUrl: `5`,
    routerLink: `6`,
    skipLocationChange: `4`,
    state: `1`,
    target: Alias
  ): Fragment = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], preserveFragment = preserveFragment.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], queryParamsHandling = queryParamsHandling.asInstanceOf[js.Any], relativeTo = relativeTo.asInstanceOf[js.Any], replaceUrl = replaceUrl.asInstanceOf[js.Any], routerLink = routerLink.asInstanceOf[js.Any], skipLocationChange = skipLocationChange.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
    
    inline def setFragment(value: AliasRequired): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setPreserveFragment(value: `3`): Self = StObject.set(x, "preserveFragment", value.asInstanceOf[js.Any])
    
    inline def setQueryParams(value: Required): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsHandling(value: `0`): Self = StObject.set(x, "queryParamsHandling", value.asInstanceOf[js.Any])
    
    inline def setRelativeTo(value: `2`): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    inline def setReplaceUrl(value: `5`): Self = StObject.set(x, "replaceUrl", value.asInstanceOf[js.Any])
    
    inline def setRouterLink(value: `6`): Self = StObject.set(x, "routerLink", value.asInstanceOf[js.Any])
    
    inline def setSkipLocationChange(value: `4`): Self = StObject.set(x, "skipLocationChange", value.asInstanceOf[js.Any])
    
    inline def setState(value: `1`): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Alias): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
