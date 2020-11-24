package typings.antDesignPro.authorizedRouteMod

import typings.reactRouter.mod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthorizedRouteProps extends RouteProps {
  
  var authority: typings.antDesignPro.authorizedRouteMod.authority = js.native
}
object IAuthorizedRouteProps {
  
  @scala.inline
  def apply(authority: authority): IAuthorizedRouteProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedRouteProps]
  }
  
  @scala.inline
  implicit class IAuthorizedRoutePropsOps[Self <: IAuthorizedRouteProps] (val x: Self) extends AnyVal {
    
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
    def setAuthorityVarargs(value: String*): Self = this.set("authority", js.Array(value :_*))
    
    @scala.inline
    def setAuthorityFunction1(value: /* currentAuthority */ js.UndefOr[String] => Boolean): Self = this.set("authority", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuthority(value: authority): Self = this.set("authority", value.asInstanceOf[js.Any])
  }
}
