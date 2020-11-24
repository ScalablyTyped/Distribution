package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleData extends js.Object {
  
   // style name
  var Content: String = js.native
  
   // style content
  var CreateTime: String = js.native
  
   // style create time
  var LastModifyTime: String = js.native
  
  var Name: String = js.native
}
object StyleData {
  
  @scala.inline
  def apply(Content: String, CreateTime: String, LastModifyTime: String, Name: String): StyleData = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any], LastModifyTime = LastModifyTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleData]
  }
  
  @scala.inline
  implicit class StyleDataOps[Self <: StyleData] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyTime(value: String): Self = this.set("LastModifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
