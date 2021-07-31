package typings.angularOdataResources.OData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Just a reference to facilitate describing new actions
trait IActionDescriptor extends StObject {
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var isArray: js.UndefOr[Boolean] = js.undefined
  
  var method: String
  
  var params: js.UndefOr[js.Any] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object IActionDescriptor {
  
  @scala.inline
  def apply(method: String): IActionDescriptor = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionDescriptor]
  }
  
  @scala.inline
  implicit class IActionDescriptorMutableBuilder[Self <: IActionDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setIsArray(value: Boolean): Self = StObject.set(x, "isArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsArrayUndefined: Self = StObject.set(x, "isArray", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
