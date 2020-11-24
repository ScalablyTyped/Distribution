package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentControl extends js.Object {
  
  val ContentControl: typings.activexWord.Word.ContentControl = js.native
}
object ContentControl {
  
  @scala.inline
  def apply(ContentControl: typings.activexWord.Word.ContentControl): ContentControl = {
    val __obj = js.Dynamic.literal(ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControl]
  }
  
  @scala.inline
  implicit class ContentControlOps[Self <: ContentControl] (val x: Self) extends AnyVal {
    
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
    def setContentControl(value: typings.activexWord.Word.ContentControl): Self = this.set("ContentControl", value.asInstanceOf[js.Any])
  }
}
