package typings.antDesignPro.authorizedMod

import typings.antDesignPro.authorizedRouteMod.authority
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthorizedProps extends js.Object {
  
  var authority: typings.antDesignPro.authorizedRouteMod.authority = js.native
  
  var noMatch: js.UndefOr[ReactNode] = js.native
}
object IAuthorizedProps {
  
  @scala.inline
  def apply(authority: authority): IAuthorizedProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedProps]
  }
  
  @scala.inline
  implicit class IAuthorizedPropsOps[Self <: IAuthorizedProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setNoMatch(value: ReactNode): Self = this.set("noMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoMatch: Self = this.set("noMatch", js.undefined)
  }
}
