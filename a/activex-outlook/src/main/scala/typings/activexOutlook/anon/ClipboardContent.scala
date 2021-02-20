package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipboardContent extends StObject {
  
  var Cancel: Boolean = js.native
  
  val ClipboardContent: js.Any = js.native
  
  val Target: typings.activexOutlook.Outlook.Folder = js.native
}
object ClipboardContent {
  
  @scala.inline
  def apply(Cancel: Boolean, ClipboardContent: js.Any, Target: typings.activexOutlook.Outlook.Folder): ClipboardContent = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ClipboardContent = ClipboardContent.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardContent]
  }
  
  @scala.inline
  implicit class ClipboardContentMutableBuilder[Self <: ClipboardContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipboardContent(value: js.Any): Self = StObject.set(x, "ClipboardContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: typings.activexOutlook.Outlook.Folder): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
  }
}
