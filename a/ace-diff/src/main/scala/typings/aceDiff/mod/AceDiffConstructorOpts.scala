package typings.aceDiff.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AceDiffConstructorOpts extends AceDiffOpts {
  
  var element: String | HTMLElement = js.native
  
  @JSName("left")
  var left_AceDiffConstructorOpts: AceDiffLROpts = js.native
  
  @JSName("right")
  var right_AceDiffConstructorOpts: AceDiffLROpts = js.native
}
object AceDiffConstructorOpts {
  
  @scala.inline
  def apply(element: String | HTMLElement, left: AceDiffLROpts, right: AceDiffLROpts): AceDiffConstructorOpts = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AceDiffConstructorOpts]
  }
  
  @scala.inline
  implicit class AceDiffConstructorOptsOps[Self <: AceDiffConstructorOpts] (val x: Self) extends AnyVal {
    
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
    def setElement(value: String | HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: AceDiffLROpts): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: AceDiffLROpts): Self = this.set("right", value.asInstanceOf[js.Any])
  }
}
