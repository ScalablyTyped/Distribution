package typings.antDesignPro.loginMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var defaultActiveKey: js.UndefOr[String] = js.native
  
  var onSubmit: js.UndefOr[js.Function2[/* error */ js.Any, /* values */ js.Any, Unit]] = js.native
  
  var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object LoginProps {
  
  @scala.inline
  def apply(): LoginProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginProps]
  }
  
  @scala.inline
  implicit class LoginPropsOps[Self <: LoginProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultActiveKey(value: String): Self = this.set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveKey: Self = this.set("defaultActiveKey", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: (/* error */ js.Any, /* values */ js.Any) => Unit): Self = this.set("onSubmit", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnTabChange(value: /* key */ String => Unit): Self = this.set("onTabChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTabChange: Self = this.set("onTabChange", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
