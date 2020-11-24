package typings.accounting.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberSettings extends js.Object {
  
  var decimal: js.UndefOr[String] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
    // default precision on numbers is 0
  var thousand: js.UndefOr[String] = js.native
}
object NumberSettings {
  
  @scala.inline
  def apply(): NumberSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberSettings]
  }
  
  @scala.inline
  implicit class NumberSettingsOps[Self <: NumberSettings] (val x: Self) extends AnyVal {
    
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
    def setDecimal(value: String): Self = this.set("decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal: Self = this.set("decimal", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setThousand(value: String): Self = this.set("thousand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThousand: Self = this.set("thousand", js.undefined)
  }
}
