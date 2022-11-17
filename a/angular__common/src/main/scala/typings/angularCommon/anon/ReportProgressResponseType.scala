package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.httpMod.HttpContext
import typings.angularCommon.httpMod.HttpHeaders
import typings.angularCommon.httpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportProgressResponseType extends StObject {
  
  var body: js.UndefOr[Any | Null] = js.undefined
  
  var context: js.UndefOr[HttpContext] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  
  var observe: js.UndefOr["body"] = js.undefined
  
  var params: js.UndefOr[
    HttpParams | (StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])])
  ] = js.undefined
  
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  var responseType: "arraybuffer"
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ReportProgressResponseType {
  
  inline def apply(): ReportProgressResponseType = {
    val __obj = js.Dynamic.literal(responseType = "arraybuffer")
    __obj.asInstanceOf[ReportProgressResponseType]
  }
  
  extension [Self <: ReportProgressResponseType](x: Self) {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContext(value: HttpContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setObserve(value: "body"): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
    inline def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
    
    inline def setParams(
      value: HttpParams | (StringDictionary[String | Double | Boolean | (js.Array[String | Double | Boolean])])
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    inline def setResponseType(value: "arraybuffer"): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
