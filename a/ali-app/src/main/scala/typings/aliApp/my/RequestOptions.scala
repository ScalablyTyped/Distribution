package typings.aliApp.my

import typings.aliApp.aliAppStrings.GET
import typings.aliApp.aliAppStrings.POST
import typings.aliApp.aliAppStrings.base64
import typings.aliApp.aliAppStrings.json
import typings.aliApp.aliAppStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions
  extends StObject
     with BaseOptions[DataResponse, Any] {
  
  /** 请求的参数 */
  var data: js.UndefOr[Any] = js.undefined
  
  /** 期望返回的数据格式，默认json，支持json，text，base64 */
  var dataType: js.UndefOr[json | text | base64] = js.undefined
  
  /** 设置请求的 HTTP 头，默认 {'Content-Type': 'application/x-www-form-urlencoded'} */
  var header: js.UndefOr[RequestHeader] = js.undefined
  
  /** 默认GET，目前支持GET，POST */
  var method: js.UndefOr[GET | POST] = js.undefined
  
  /**
    * 超时时间，单位ms，默认30000
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /** 目标服务器url */
  var url: String
}
object RequestOptions {
  
  inline def apply(url: String): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  extension [Self <: RequestOptions](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: json | text | base64): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
