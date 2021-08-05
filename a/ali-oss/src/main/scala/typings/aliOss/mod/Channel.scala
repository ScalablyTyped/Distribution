package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  var Description: String
  
  var LastModified: String
  
  var Name: String
  
  var PlayUrls: js.Array[String]
  
  var PublishUrls: js.Array[String]
  
  var Status: String
}
object Channel {
  
  inline def apply(
    Description: String,
    LastModified: String,
    Name: String,
    PlayUrls: js.Array[String],
    PublishUrls: js.Array[String],
    Status: String
  ): Channel = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], LastModified = LastModified.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlayUrls = PlayUrls.asInstanceOf[js.Any], PublishUrls = PublishUrls.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: String): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlayUrls(value: js.Array[String]): Self = StObject.set(x, "PlayUrls", value.asInstanceOf[js.Any])
    
    inline def setPlayUrlsVarargs(value: String*): Self = StObject.set(x, "PlayUrls", js.Array(value :_*))
    
    inline def setPublishUrls(value: js.Array[String]): Self = StObject.set(x, "PublishUrls", value.asInstanceOf[js.Any])
    
    inline def setPublishUrlsVarargs(value: String*): Self = StObject.set(x, "PublishUrls", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
