package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends js.Object {
  
  /** Returns a string in the form '#abcdef'. */
  def toHexString(): String = js.native
  
  /** Returns a string in the form 'rgba(25, 50, 75, .9)'. */
  def toRGBAString(): String = js.native
}
object Color {
  
  @scala.inline
  def apply(toHexString: () => String, toRGBAString: () => String): Color = {
    val __obj = js.Dynamic.literal(toHexString = js.Any.fromFunction0(toHexString), toRGBAString = js.Any.fromFunction0(toRGBAString))
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    
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
    def setToHexString(value: () => String): Self = this.set("toHexString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToRGBAString(value: () => String): Self = this.set("toRGBAString", js.Any.fromFunction0(value))
  }
}
