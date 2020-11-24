package typings.antd.timePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerLocale extends js.Object {
  
  var placeholder: js.UndefOr[String] = js.native
  
  var rangePlaceholder: js.UndefOr[js.Tuple2[String, String]] = js.native
}
object TimePickerLocale {
  
  @scala.inline
  def apply(): TimePickerLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerLocale]
  }
  
  @scala.inline
  implicit class TimePickerLocaleOps[Self <: TimePickerLocale] (val x: Self) extends AnyVal {
    
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
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRangePlaceholder(value: js.Tuple2[String, String]): Self = this.set("rangePlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangePlaceholder: Self = this.set("rangePlaceholder", js.undefined)
  }
}
