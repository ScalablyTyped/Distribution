package typings.antDesignProProvider.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlType extends js.Object {
  
  def getMessage(id: String, defaultMessage: String): String = js.native
  
  var locale: String = js.native
}
object IntlType {
  
  @scala.inline
  def apply(getMessage: (String, String) => String, locale: String): IntlType = {
    val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction2(getMessage), locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlType]
  }
  
  @scala.inline
  implicit class IntlTypeOps[Self <: IntlType] (val x: Self) extends AnyVal {
    
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
    def setGetMessage(value: (String, String) => String): Self = this.set("getMessage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
  }
}
