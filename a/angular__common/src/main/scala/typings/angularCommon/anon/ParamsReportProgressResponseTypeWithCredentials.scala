package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.blob
import typings.angularCommon.angularCommonStrings.events
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsReportProgressResponseTypeWithCredentials extends StObject {
  
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  
  var observe: events
  
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  var responseType: blob
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ParamsReportProgressResponseTypeWithCredentials {
  
  inline def apply(): ParamsReportProgressResponseTypeWithCredentials = {
    val __obj = js.Dynamic.literal(observe = "events", responseType = "blob")
    __obj.asInstanceOf[ParamsReportProgressResponseTypeWithCredentials]
  }
  
  extension [Self <: ParamsReportProgressResponseTypeWithCredentials](x: Self) {
    
    inline def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setObserve(value: events): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
    inline def setParams(value: HttpParams | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    inline def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    inline def setResponseType(value: blob): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
