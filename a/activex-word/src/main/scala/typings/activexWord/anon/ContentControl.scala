package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentControl extends StObject {
  
  val ContentControl: typings.activexWord.Word.ContentControl = js.native
}
object ContentControl {
  
  @scala.inline
  def apply(ContentControl: typings.activexWord.Word.ContentControl): ContentControl = {
    val __obj = js.Dynamic.literal(ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentControl]
  }
  
  @scala.inline
  implicit class ContentControlMutableBuilder[Self <: ContentControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentControl(value: typings.activexWord.Word.ContentControl): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
  }
}
