package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignatureUrlOptions extends StObject {
  
  // the HTTP method, default is 'GET'
  var `Content-Type`: js.UndefOr[String] = js.native
  
  // set the response headers for download
  var callback: js.UndefOr[ObjectCallback] = js.native
  
  var expires: js.UndefOr[Double] = js.native
  
  // after expires seconds, the url will become invalid, default is 1800
  var method: js.UndefOr[HTTPMethods] = js.native
  
  // set the request content type
  var process: js.UndefOr[String] = js.native
  
  var response: js.UndefOr[ResponseHeaderType] = js.native
}
object SignatureUrlOptions {
  
  @scala.inline
  def apply(): SignatureUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureUrlOptions]
  }
  
  @scala.inline
  implicit class SignatureUrlOptionsMutableBuilder[Self <: SignatureUrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: ObjectCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setContent-TypeUndefined`: Self = StObject.set(x, "Content-Type", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    @scala.inline
    def setResponse(value: ResponseHeaderType): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
