package typings.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpParameterCodec extends StObject {
  
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
  implicit class HttpParameterCodecMutableBuilder[Self <: HttpParameterCodec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecodeKey(value: String => String): Self = StObject.set(x, "decodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDecodeValue(value: String => String): Self = StObject.set(x, "decodeValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeKey(value: String => String): Self = StObject.set(x, "encodeKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncodeValue(value: String => String): Self = StObject.set(x, "encodeValue", js.Any.fromFunction1(value))
  }
}
