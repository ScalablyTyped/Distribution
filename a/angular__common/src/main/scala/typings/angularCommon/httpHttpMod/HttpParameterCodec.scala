package typings.angularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpParameterCodec extends js.Object {
  
  def decodeKey(key: String): String = js.native
  
  def decodeValue(value: String): String = js.native
  
  def encodeKey(key: String): String = js.native
  
  def encodeValue(value: String): String = js.native
}
object HttpParameterCodec {
  
  @scala.inline
  def apply(
    decodeKey: String => String,
    decodeValue: String => String,
    encodeKey: String => String,
    encodeValue: String => String
  ): HttpParameterCodec = {
    val __obj = js.Dynamic.literal(decodeKey = js.Any.fromFunction1(decodeKey), decodeValue = js.Any.fromFunction1(decodeValue), encodeKey = js.Any.fromFunction1(encodeKey), encodeValue = js.Any.fromFunction1(encodeValue))
    __obj.asInstanceOf[HttpParameterCodec]
  }
  
  @scala.inline
  implicit class HttpParameterCodecOps[Self <: HttpParameterCodec] (val x: Self) extends AnyVal {
    
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
    def setDecodeKey(value: String => String): Self = this.set("decodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeValue(value: String => String): Self = this.set("decodeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeKey(value: String => String): Self = this.set("encodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeValue(value: String => String): Self = this.set("encodeValue", js.Any.fromFunction1(value))
  }
}
