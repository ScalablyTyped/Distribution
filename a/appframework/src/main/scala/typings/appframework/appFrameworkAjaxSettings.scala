package typings.appframework

import typings.std.Error
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait appFrameworkAjaxSettings extends StObject {
  
  var beforeSend: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* settings */ this.type, Boolean]] = js.undefined
  
  var complete: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* status */ String, Unit]] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var context: js.UndefOr[js.Any] = js.undefined
  
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error, Unit]
  ] = js.undefined
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object appFrameworkAjaxSettings {
  
  inline def apply(): appFrameworkAjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[appFrameworkAjaxSettings]
  }
  
  extension [Self <: appFrameworkAjaxSettings](x: Self) {
    
    inline def setBeforeSend(value: (/* xhr */ XMLHttpRequest, appFrameworkAjaxSettings) => Boolean): Self = StObject.set(x, "beforeSend", js.Any.fromFunction2(value))
    
    inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    inline def setComplete(value: (/* xhr */ XMLHttpRequest, /* status */ String) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
    
    inline def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setError(value: (/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setSuccess(value: (/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
