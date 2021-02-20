package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleData extends StObject {
  
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
  implicit class StyleDataMutableBuilder[Self <: StyleData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyTime(value: String): Self = StObject.set(x, "LastModifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
