package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportResponse extends StObject {
  
  /**
    * The binary blob response to GetExport, which contains the export.
    */
  var body: js.UndefOr[_Blob] = js.undefined
  
  /**
    * The content-disposition header value in the HTTP response.
    */
  var contentDisposition: js.UndefOr[String] = js.undefined
  
  /**
    * The content-type header value in the HTTP response. This will correspond to a valid 'accept' type in the request.
    */
  var contentType: js.UndefOr[String] = js.undefined
}
object ExportResponse {
  
  @scala.inline
  def apply(): ExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportResponse]
  }
  
  @scala.inline
  implicit class ExportResponseMutableBuilder[Self <: ExportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: _Blob): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setContentDisposition(value: String): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
  }
}
