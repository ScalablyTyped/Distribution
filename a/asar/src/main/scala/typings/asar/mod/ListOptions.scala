package typings.asar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOptions extends js.Object {
  
  var isPack: Boolean = js.native
}
object ListOptions {
  
  @scala.inline
  def apply(isPack: Boolean): ListOptions = {
    val __obj = js.Dynamic.literal(isPack = isPack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOptions]
  }
  
  @scala.inline
  implicit class ListOptionsOps[Self <: ListOptions] (val x: Self) extends AnyVal {
    
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
    def setIsPack(value: Boolean): Self = this.set("isPack", value.asInstanceOf[js.Any])
  }
}
