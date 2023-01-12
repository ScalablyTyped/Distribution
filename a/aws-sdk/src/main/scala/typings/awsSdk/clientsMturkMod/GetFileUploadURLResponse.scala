package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileUploadURLResponse extends StObject {
  
  /**
    *  A temporary URL for the file that the Worker uploaded for the answer. 
    */
  var FileUploadURL: js.UndefOr[String] = js.undefined
}
object GetFileUploadURLResponse {
  
  inline def apply(): GetFileUploadURLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileUploadURLResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFileUploadURLResponse] (val x: Self) extends AnyVal {
    
    inline def setFileUploadURL(value: String): Self = StObject.set(x, "FileUploadURL", value.asInstanceOf[js.Any])
    
    inline def setFileUploadURLUndefined: Self = StObject.set(x, "FileUploadURL", js.undefined)
  }
}
