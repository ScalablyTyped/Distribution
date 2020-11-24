package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyAscii extends js.Object {
  
  val KeyAscii: Double = js.native
}
object KeyAscii {
  
  @scala.inline
  def apply(KeyAscii: Double): KeyAscii = {
    val __obj = js.Dynamic.literal(KeyAscii = KeyAscii.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyAscii]
  }
  
  @scala.inline
  implicit class KeyAsciiOps[Self <: KeyAscii] (val x: Self) extends AnyVal {
    
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
    def setKeyAscii(value: Double): Self = this.set("KeyAscii", value.asInstanceOf[js.Any])
  }
}
