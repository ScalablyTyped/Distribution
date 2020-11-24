package typings.angularCompiler.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostBinding extends js.Object {
  
  var hostPropertyName: js.UndefOr[String] = js.native
}
object HostBinding {
  
  @scala.inline
  def apply(): HostBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostBinding]
  }
  
  @scala.inline
  implicit class HostBindingOps[Self <: HostBinding] (val x: Self) extends AnyVal {
    
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
    def setHostPropertyName(value: String): Self = this.set("hostPropertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPropertyName: Self = this.set("hostPropertyName", js.undefined)
  }
}
