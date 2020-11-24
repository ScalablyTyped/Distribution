package typings.antDesignPro.loginItemMod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginItemProps extends js.Object {
  
  var buttonText: js.UndefOr[ReactNode] = js.native
  
  var countDown: js.UndefOr[Double] = js.native
  
  var customprops: js.UndefOr[js.Any] = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any = js.native
  
  var getCaptchaButtonText: js.UndefOr[String] = js.native
  
  var getCaptchaSecondText: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  
  var onGetCaptcha: js.UndefOr[js.Function1[/* event */ js.UndefOr[MouseEvent], Unit]] = js.native
  
  var onPressEnter: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var rules: js.UndefOr[js.Array[_]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var `type`: String = js.native
  
  def updateActive(activeItem: js.Any): Unit = js.native
}
object LoginItemProps {
  
  @scala.inline
  def apply(
    form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any,
    `type`: String,
    updateActive: js.Any => Unit
  ): LoginItemProps = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1(updateActive))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginItemProps]
  }
  
  @scala.inline
  implicit class LoginItemPropsOps[Self <: LoginItemProps] (val x: Self) extends AnyVal {
    
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
    def setForm(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ js.Any
    ): Self = this.set("form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateActive(value: js.Any => Unit): Self = this.set("updateActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setButtonText(value: ReactNode): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setCountDown(value: Double): Self = this.set("countDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountDown: Self = this.set("countDown", js.undefined)
    
    @scala.inline
    def setCustomprops(value: js.Any): Self = this.set("customprops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomprops: Self = this.set("customprops", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setGetCaptchaButtonText(value: String): Self = this.set("getCaptchaButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetCaptchaButtonText: Self = this.set("getCaptchaButtonText", js.undefined)
    
    @scala.inline
    def setGetCaptchaSecondText(value: String): Self = this.set("getCaptchaSecondText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetCaptchaSecondText: Self = this.set("getCaptchaSecondText", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnGetCaptcha(value: /* event */ js.UndefOr[MouseEvent] => Unit): Self = this.set("onGetCaptcha", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnGetCaptcha: Self = this.set("onGetCaptcha", js.undefined)
    
    @scala.inline
    def setOnPressEnter(value: /* e */ js.Any => Unit): Self = this.set("onPressEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPressEnter: Self = this.set("onPressEnter", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: js.Any*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[_]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
