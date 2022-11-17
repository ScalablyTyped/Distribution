package typings.angularCommon.anon

import typings.angularCommon.httpMod.HttpContext
import typings.angularCommon.httpMod.HttpHeaders
import typings.angularCommon.httpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersParams extends StObject {
  
  var context: js.UndefOr[HttpContext] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var params: js.UndefOr[HttpParams] = js.undefined
  
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  var responseType: js.UndefOr["arraybuffer" | "blob" | "json" | "text"] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object HeadersParams {
  
  inline def apply(): HeadersParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadersParams]
  }
  
  extension [Self <: HeadersParams](x: Self) {
    
    inline def setContext(value: HttpContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setParams(value: HttpParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    inline def setResponseType(value: "arraybuffer" | "blob" | "json" | "text"): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
