package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.body
import typings.angularCommon.angularCommonStrings.text
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersObserveParamsReportProgress extends StObject {
  
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  
  var observe: js.UndefOr[body] = js.undefined
  
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  var responseType: text
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object HeadersObserveParamsReportProgress {
  
  @scala.inline
  def apply(): HeadersObserveParamsReportProgress = {
    val __obj = js.Dynamic.literal(responseType = "text")
    __obj.asInstanceOf[HeadersObserveParamsReportProgress]
  }
  
  @scala.inline
  implicit class HeadersObserveParamsReportProgressMutableBuilder[Self <: HeadersObserveParamsReportProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setObserve(value: body): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
    
    @scala.inline
    def setParams(value: HttpParams | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setReportProgress(value: Boolean): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportProgressUndefined: Self = StObject.set(x, "reportProgress", js.undefined)
    
    @scala.inline
    def setResponseType(value: text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
