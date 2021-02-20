package typings.aliApp.my

import typings.aliApp.aliAppStrings.GET
import typings.aliApp.aliAppStrings.POST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 请求的参数 */
  var data: js.UndefOr[js.Any] = js.native
  
  /** 设置请求的头部 */
  var header: js.UndefOr[RequestHeader] = js.native
  
  var method: js.UndefOr[GET | POST] = js.native
  
  /** 目标服务器url */
  var url: String = js.native
}
object ConnectSocketOptions {
  
  @scala.inline
  def apply(url: String): ConnectSocketOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectSocketOptions]
  }
  
  @scala.inline
  implicit class ConnectSocketOptionsMutableBuilder[Self <: ConnectSocketOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setHeader(value: RequestHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
