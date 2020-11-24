package typings.aliApp.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsBuffer extends js.Object {
  
  /**
    * 需要发送的内容：普通的文本内容 String 或者经 base64 编码后的 String
    */
  var data: String | ArrayBuffer = js.native
  
  /**
    * 如果需要发送二进制数据，需要将入参数据经 base64 编码成 String 后赋值 data，同时将此字段设置为true，否则如果是普通的文本内容 String，不需要设置此字段
    */
  var isBuffer: js.UndefOr[Boolean] = js.native
}
object IsBuffer {
  
  @scala.inline
  def apply(data: String | ArrayBuffer): IsBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsBuffer]
  }
  
  @scala.inline
  implicit class IsBufferOps[Self <: IsBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: String | ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuffer(value: Boolean): Self = this.set("isBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBuffer: Self = this.set("isBuffer", js.undefined)
  }
}
