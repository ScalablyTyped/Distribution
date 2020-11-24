package typings.actionsOnGoogle.datetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeOptions extends js.Object {
  
  /**
    * Prompts for the user
    * @public
    */
  var prompts: js.UndefOr[DateTimeOptionsPrompts] = js.native
}
object DateTimeOptions {
  
  @scala.inline
  def apply(): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeOptions]
  }
  
  @scala.inline
  implicit class DateTimeOptionsOps[Self <: DateTimeOptions] (val x: Self) extends AnyVal {
    
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
    def setPrompts(value: DateTimeOptionsPrompts): Self = this.set("prompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompts: Self = this.set("prompts", js.undefined)
  }
}
