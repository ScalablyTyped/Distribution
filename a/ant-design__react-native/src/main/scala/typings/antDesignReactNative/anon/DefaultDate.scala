package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultDate extends js.Object {
  
  var date: js.Any = js.native
  
  var defaultDate: js.Any = js.native
}
object DefaultDate {
  
  @scala.inline
  def apply(date: js.Any, defaultDate: js.Any): DefaultDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDate]
  }
  
  @scala.inline
  implicit class DefaultDateOps[Self <: DefaultDate] (val x: Self) extends AnyVal {
    
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
    def setDate(value: js.Any): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDate(value: js.Any): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
  }
}
