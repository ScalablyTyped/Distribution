package typings.atom.anon

import typings.atom.mod.FileEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewValueFileEncoding extends js.Object {
  
  var newValue: FileEncoding = js.native
  
  var oldValue: js.UndefOr[FileEncoding] = js.native
}
object NewValueFileEncoding {
  
  @scala.inline
  def apply(newValue: FileEncoding): NewValueFileEncoding = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueFileEncoding]
  }
  
  @scala.inline
  implicit class NewValueFileEncodingOps[Self <: NewValueFileEncoding] (val x: Self) extends AnyVal {
    
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
    def setNewValue(value: FileEncoding): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: FileEncoding): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
