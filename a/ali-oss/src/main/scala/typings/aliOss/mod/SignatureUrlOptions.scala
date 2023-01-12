package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignatureUrlOptions extends StObject {
  
  /** set the request content type */
  var `Content-Type`: js.UndefOr[String] = js.undefined
  
  /** set the callback for the operation */
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  
  /** after expires seconds, the url will become invalid, default is 1800 */
  var expires: js.UndefOr[Double] = js.undefined
  
  /** the HTTP method, default is 'GET' */
  var method: js.UndefOr[HTTPMethods] = js.undefined
  
  /**  image process params, will send with x-oss-process e.g.: {process: 'image/resize,w_200'} */
  var process: js.UndefOr[String] = js.undefined
  
  /** set the response headers for download */
  var response: js.UndefOr[ResponseHeaderType] = js.undefined
  
  /** additional signature parameters in url */
  var subResource: js.UndefOr[js.Object] = js.undefined
  
  /** traffic limit, range: 819200~838860800 */
  var trafficLimit: js.UndefOr[Double] = js.undefined
}
object SignatureUrlOptions {
  
  inline def apply(): SignatureUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureUrlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignatureUrlOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: ObjectCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def `setContent-Type`(value: String): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    inline def `setContent-TypeUndefined`: Self = StObject.set(x, "Content-Type", js.undefined)
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setProcess(value: String): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    inline def setProcessUndefined: Self = StObject.set(x, "process", js.undefined)
    
    inline def setResponse(value: ResponseHeaderType): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    
    inline def setSubResource(value: js.Object): Self = StObject.set(x, "subResource", value.asInstanceOf[js.Any])
    
    inline def setSubResourceUndefined: Self = StObject.set(x, "subResource", js.undefined)
    
    inline def setTrafficLimit(value: Double): Self = StObject.set(x, "trafficLimit", value.asInstanceOf[js.Any])
    
    inline def setTrafficLimitUndefined: Self = StObject.set(x, "trafficLimit", js.undefined)
  }
}
