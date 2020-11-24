package typings.activexWord

import typings.activexWord.Word.Application
import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends js.Object {
  
  @JSName("Word.Application")
  var WordDotApplication: Application = js.native
  
  @JSName("Word.Document")
  var WordDotDocument: Document = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(WordDotApplication: Application, WordDotDocument: Document): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Word.Application")(WordDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Document")(WordDotDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
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
    def setWordDotApplication(value: Application): Self = this.set("Word.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotDocument(value: Document): Self = this.set("Word.Document", value.asInstanceOf[js.Any])
  }
}
