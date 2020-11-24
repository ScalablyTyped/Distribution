package typings.asana.mod.resources.Projects

import typings.asana.mod.resources.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Status extends js.Object {
  
  var author: Resource = js.native
  
  var color: String = js.native
  
  var html_text: String = js.native
  
  var modified_at: String = js.native
  
  var text: String = js.native
}
object Status {
  
  @scala.inline
  def apply(author: Resource, color: String, html_text: String, modified_at: String, text: String): Status = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], html_text = html_text.asInstanceOf[js.Any], modified_at = modified_at.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusOps[Self <: Status] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: Resource): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_text(value: String): Self = this.set("html_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModified_at(value: String): Self = this.set("modified_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
