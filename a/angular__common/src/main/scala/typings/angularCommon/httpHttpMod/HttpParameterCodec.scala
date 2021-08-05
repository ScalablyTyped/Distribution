package typings.angularCommon.httpHttpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpParameterCodec extends StObject {
  
  def decodeKey(key: String): String
  
  def decodeValue(value: String): String
  
  def encodeKey(key: String): String
  
  def encodeValue(value: String): String
}
object HttpParameterCodec {
  
  inline def apply(
    decodeKey: String => String,
    decodeValue: String => String,
    encodeKey: String => String,
    encodeValue: String => String
  ): HttpParameterCodec = {
    val __obj = js.Dynamic.literal(decodeKey = js.Any.fromFunction1(decodeKey), decodeValue = js.Any.fromFunction1(decodeValue), encodeKey = js.Any.fromFunction1(encodeKey), encodeValue = js.Any.fromFunction1(encodeValue))
    __obj.asInstanceOf[HttpParameterCodec]
  }
  
  extension [Self <: HttpParameterCodec](x: Self) {
    
    inline def setDecodeKey(value: String => String): Self = StObject.set(x, "decodeKey", js.Any.fromFunction1(value))
    
    inline def setDecodeValue(value: String => String): Self = StObject.set(x, "decodeValue", js.Any.fromFunction1(value))
    
    inline def setEncodeKey(value: String => String): Self = StObject.set(x, "encodeKey", js.Any.fromFunction1(value))
    
    inline def setEncodeValue(value: String => String): Self = StObject.set(x, "encodeValue", js.Any.fromFunction1(value))
  }
}
