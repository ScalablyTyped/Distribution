package typings.animejs.anon

import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait El extends js.Object {
  
  var el: HTMLElement | SVGElement = js.native
  
  var property: String = js.native
  
  var totalLength: Double = js.native
}
object El {
  
  @scala.inline
  def apply(el: HTMLElement | SVGElement, property: String, totalLength: Double): El = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], totalLength = totalLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[El]
  }
  
  @scala.inline
  implicit class ElOps[Self <: El] (val x: Self) extends AnyVal {
    
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
    def setEl(value: HTMLElement | SVGElement): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalLength(value: Double): Self = this.set("totalLength", value.asInstanceOf[js.Any])
  }
}
