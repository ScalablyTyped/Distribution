package typings.angular.angular

import typings.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `RouteDefinition` defines a route within a {@link RouteConfig} decorator.
  *
  * Supported keys:
  * - `path` or `aux` (requires exactly one of these)
  * - `component`, `loader`,  `redirectTo` (requires exactly one of these)
  * - `name` or `as` (optional) (requires exactly one of these)
  * - `data` (optional)
  *
  * See also {@link Route}, {@link AsyncRoute}, {@link AuxRoute}, and {@link Redirect}.
  */
@js.native
trait RouteDefinition extends js.Object {
  
  var as: js.UndefOr[String] = js.native
  
  var aux: js.UndefOr[String] = js.native
  
  var component: js.UndefOr[Type | ComponentDefinition | String] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var loader: js.UndefOr[Function] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var redirectTo: js.UndefOr[js.Array[_]] = js.native
  
  var useAsDefault: js.UndefOr[Boolean] = js.native
}
object RouteDefinition {
  
  @scala.inline
  def apply(): RouteDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteDefinition]
  }
  
  @scala.inline
  implicit class RouteDefinitionOps[Self <: RouteDefinition] (val x: Self) extends AnyVal {
    
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAux(value: String): Self = this.set("aux", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAux: Self = this.set("aux", js.undefined)
    
    @scala.inline
    def setComponent(value: Type | ComponentDefinition | String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setLoader(value: Function): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setRedirectToVarargs(value: js.Any*): Self = this.set("redirectTo", js.Array(value :_*))
    
    @scala.inline
    def setRedirectTo(value: js.Array[_]): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
    
    @scala.inline
    def setUseAsDefault(value: Boolean): Self = this.set("useAsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAsDefault: Self = this.set("useAsDefault", js.undefined)
  }
}
