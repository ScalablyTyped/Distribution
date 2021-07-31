package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region 基本参数
trait DataResponse extends StObject {
  
  /** 回调函数返回的内容 */
  var data: js.Any
  
  /** 开发者服务器返回的 HTTP Response Header */
  var headers: js.Object
  
  /** 开发者服务器返回的 HTTP 状态码 */
  var status: Double
}
object DataResponse {
  
  @scala.inline
  def apply(data: js.Any, headers: js.Object, status: Double): DataResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResponse]
  }
  
  @scala.inline
  implicit class DataResponseMutableBuilder[Self <: DataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
