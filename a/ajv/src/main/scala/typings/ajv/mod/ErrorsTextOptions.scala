package typings.ajv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorsTextOptions extends js.Object {
  
  var dataVar: js.UndefOr[String] = js.native
  
  var separator: js.UndefOr[String] = js.native
}
object ErrorsTextOptions {
  
  @scala.inline
  def apply(): ErrorsTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorsTextOptions]
  }
  
  @scala.inline
  implicit class ErrorsTextOptionsOps[Self <: ErrorsTextOptions] (val x: Self) extends AnyVal {
    
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
    def setDataVar(value: String): Self = this.set("dataVar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataVar: Self = this.set("dataVar", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
