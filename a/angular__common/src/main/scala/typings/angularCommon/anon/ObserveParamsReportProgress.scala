package typings.angularCommon.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.angularCommonStrings.arraybuffer
import typings.angularCommon.angularCommonStrings.blob
import typings.angularCommon.angularCommonStrings.json
import typings.angularCommon.angularCommonStrings.text
import typings.angularCommon.httpHttpMod.HttpHeaders
import typings.angularCommon.httpHttpMod.HttpObserve
import typings.angularCommon.httpHttpMod.HttpParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserveParamsReportProgress extends StObject {
  
  var body: js.UndefOr[js.Any] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders | (StringDictionary[String | js.Array[String]])] = js.undefined
  
  var observe: js.UndefOr[HttpObserve] = js.undefined
  
  var params: js.UndefOr[HttpParams | (StringDictionary[String | js.Array[String]])] = js.undefined
  
  var reportProgress: js.UndefOr[Boolean] = js.undefined
  
  var responseType: js.UndefOr[arraybuffer | blob | json | text] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object ObserveParamsReportProgress {
  
  @scala.inline
  def apply(): ObserveParamsReportProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObserveParamsReportProgress]
  }
  
  @scala.inline
  implicit class ObserveParamsReportProgressMutableBuilder[Self <: ObserveParamsReportProgress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHeaders(value: HttpHeaders | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setObserve(value: HttpObserve): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
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
    def setResponseType(value: arraybuffer | blob | json | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
