package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyData extends StObject {
  
  //  object last modified GMT string
  var etag: String
  
  var lastModified: String
}
object ModifyData {
  
  @scala.inline
  def apply(etag: String, lastModified: String): ModifyData = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyData]
  }
  
  @scala.inline
  implicit class ModifyDataMutableBuilder[Self <: ModifyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
  }
}
