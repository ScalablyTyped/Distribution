package typings.appframework

import typings.std.Error
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait appFrameworkAjaxSettings extends StObject {
  
  var beforeSend: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* settings */ this.type, Boolean]] = js.native
  
  var complete: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* status */ String, Unit]] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var context: js.UndefOr[js.Any] = js.native
  
  var crossDomain: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataType: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[
    js.Function3[/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error, Unit]
  ] = js.native
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var success: js.UndefOr[
    js.Function3[/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest, Unit]
  ] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object appFrameworkAjaxSettings {
  
  @scala.inline
  def apply(): appFrameworkAjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[appFrameworkAjaxSettings]
  }
  
  @scala.inline
  implicit class appFrameworkAjaxSettingsMutableBuilder[Self <: appFrameworkAjaxSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeSend(value: (/* xhr */ XMLHttpRequest, appFrameworkAjaxSettings) => Boolean): Self = StObject.set(x, "beforeSend", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setComplete(value: (/* xhr */ XMLHttpRequest, /* status */ String) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setCrossDomain(value: Boolean): Self = StObject.set(x, "crossDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossDomainUndefined: Self = StObject.set(x, "crossDomain", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setError(value: (/* xhr */ XMLHttpRequest, /* errorType */ String, /* error */ Error) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* data */ js.Any, /* status */ String, /* xhr */ XMLHttpRequest) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
