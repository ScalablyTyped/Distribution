package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleData extends StObject {
  
  /** style content */
  var Content: String
  
  /** style create time */
  var CreateTime: String
  
  /** style last modify time */
  var LastModifyTime: String
  
  /** style name */
  var Name: String
}
object StyleData {
  
  inline def apply(Content: String, CreateTime: String, LastModifyTime: String, Name: String): StyleData = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], CreateTime = CreateTime.asInstanceOf[js.Any], LastModifyTime = LastModifyTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleData]
  }
  
  extension [Self <: StyleData](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifyTime(value: String): Self = StObject.set(x, "LastModifyTime", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
