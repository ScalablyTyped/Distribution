package typings.aliApp.my

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendSocketMessageOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要发送的内容：普通的文本内容 String 或者经 base64 编码后的 String
    */
  var data: String | ArrayBuffer
  
  /**
    * 如果需要发送二进制数据，需要将入参数据经 base64 编码成 String 后赋值 data，同时将此字段设置为true，否则如果是普通的文本内容 String，不需要设置此字段
    */
  var isBuffer: js.UndefOr[Boolean] = js.undefined
}
object SendSocketMessageOptions {
  
  @scala.inline
  def apply(data: String | ArrayBuffer): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
  
  @scala.inline
  implicit class SendSocketMessageOptionsMutableBuilder[Self <: SendSocketMessageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuffer(value: Boolean): Self = StObject.set(x, "isBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBufferUndefined: Self = StObject.set(x, "isBuffer", js.undefined)
  }
}
