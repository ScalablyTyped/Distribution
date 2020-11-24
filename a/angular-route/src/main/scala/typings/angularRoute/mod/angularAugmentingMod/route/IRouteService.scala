package typings.angularRoute.mod.angularAugmentingMod.route

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// RouteService
// see http://docs.angularjs.org/api/ngRoute.$route
// see http://docs.angularjs.org/api/ngRoute.$routeProvider
///////////////////////////////////////////////////////////////////////////
@js.native
trait IRouteService extends js.Object {
  
  // May not always be available. For instance, current will not be available
  // to a controller that was not initialized as a result of a route maching.
  var current: js.UndefOr[ICurrentRoute] = js.native
  
  def reload(): Unit = js.native
  
  var routes: js.Any = js.native
  
  /**
    * Causes $route service to update the current URL, replacing current route parameters with those specified in newParams.
    * Provided property names that match the route's path segment definitions will be interpolated into the
    * location's path, while remaining properties will be treated as query params.
    *
    * @param newParams Object.<string, string> mapping of URL parameter names to values
    */
  def updateParams(newParams: StringDictionary[String]): Unit = js.native
}
object IRouteService {
  
  @scala.inline
  def apply(reload: () => Unit, routes: js.Any, updateParams: StringDictionary[String] => Unit): IRouteService = {
    val __obj = js.Dynamic.literal(reload = js.Any.fromFunction0(reload), routes = routes.asInstanceOf[js.Any], updateParams = js.Any.fromFunction1(updateParams))
    __obj.asInstanceOf[IRouteService]
  }
  
  @scala.inline
  implicit class IRouteServiceOps[Self <: IRouteService] (val x: Self) extends AnyVal {
    
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
    def setReload(value: () => Unit): Self = this.set("reload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRoutes(value: js.Any): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateParams(value: StringDictionary[String] => Unit): Self = this.set("updateParams", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurrent(value: ICurrentRoute): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
  }
}
