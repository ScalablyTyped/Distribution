package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenTipText extends js.Object {
  
  val ScreenTipText: js.Any = js.native
  
  val SourceObject: js.Any = js.native
}
object ScreenTipText {
  
  @scala.inline
  def apply(ScreenTipText: js.Any, SourceObject: js.Any): ScreenTipText = {
    val __obj = js.Dynamic.literal(ScreenTipText = ScreenTipText.asInstanceOf[js.Any], SourceObject = SourceObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenTipText]
  }
  
  @scala.inline
  implicit class ScreenTipTextOps[Self <: ScreenTipText] (val x: Self) extends AnyVal {
    
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
    def setScreenTipText(value: js.Any): Self = this.set("ScreenTipText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceObject(value: js.Any): Self = this.set("SourceObject", value.asInstanceOf[js.Any])
  }
}
