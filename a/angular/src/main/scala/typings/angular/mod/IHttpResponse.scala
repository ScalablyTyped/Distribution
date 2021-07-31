package typings.angular.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularStrings.abort
import typings.angular.angularStrings.complete
import typings.angular.angularStrings.error
import typings.angular.angularStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHttpResponse[T] extends StObject {
  
  var config: IRequestConfig
  
  var data: T
  
  def headers(): StringDictionary[String]
  def headers(headerName: String): String
  @JSName("headers")
  var headers_Original: IHttpHeadersGetter
  
  var status: Double
  
  var statusText: String
  
  /** Added in AngularJS 1.6.6 */
  var xhrStatus: complete | error | timeout | abort
}
object IHttpResponse {
  
  @scala.inline
  def apply[T](
    config: IRequestConfig,
    data: T,
    headers: IHttpHeadersGetter,
    status: Double,
    statusText: String,
    xhrStatus: complete | error | timeout | abort
  ): IHttpResponse[T] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], xhrStatus = xhrStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHttpResponse[T]]
  }
  
  @scala.inline
  implicit class IHttpResponseMutableBuilder[Self <: IHttpResponse[?], T] (val x: Self & IHttpResponse[T]) extends AnyVal {
    
    @scala.inline
    def setConfig(value: IRequestConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: IHttpHeadersGetter): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrStatus(value: complete | error | timeout | abort): Self = StObject.set(x, "xhrStatus", value.asInstanceOf[js.Any])
  }
}
