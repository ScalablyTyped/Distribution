package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.arraybuffer
import typings.angularCommon.angularCommonStrings.blob
import typings.angularCommon.angularCommonStrings.json
import typings.angularCommon.angularCommonStrings.text
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetHeaders[V] extends StObject {
  
  var body: js.UndefOr[V | Null] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[HttpParams] = js.undefined
  
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.undefined
  
  var setHeaders: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
  
  var setParams: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object SetHeaders {
  
  inline def apply[V](): SetHeaders[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetHeaders[V]]
  }
  
  extension [Self <: SetHeaders[?], V](x: Self & SetHeaders[V]) {
    
    inline def setBody(value: V): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParams(value: HttpParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    inline def setResponseType(value: arraybuffer | blob | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setSetHeaders(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "setHeaders", value.asInstanceOf[js.Any])
    
    inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
    
    inline def setSetParams(value: StringDictionary[String]): Self = StObject.set(x, "setParams", value.asInstanceOf[js.Any])
    
    inline def setSetParamsUndefined: Self = StObject.set(x, "setParams", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
