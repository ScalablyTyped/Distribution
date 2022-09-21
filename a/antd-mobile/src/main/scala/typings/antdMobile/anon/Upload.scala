package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Upload extends StObject {
  
  var upload: String
  
  var uploading: String
}
object Upload {
  
  inline def apply(upload: String, uploading: String): Upload = {
    val __obj = js.Dynamic.literal(upload = upload.asInstanceOf[js.Any], uploading = uploading.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upload]
  }
  
  extension [Self <: Upload](x: Self) {
    
    inline def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
    
    inline def setUploading(value: String): Self = StObject.set(x, "uploading", value.asInstanceOf[js.Any])
  }
}
