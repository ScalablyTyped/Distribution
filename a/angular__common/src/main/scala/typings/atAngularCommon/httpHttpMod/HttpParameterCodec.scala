package typings.atAngularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpParameterCodec extends js.Object {
  def decodeKey(key: String): String
  def decodeValue(value: String): String
  def encodeKey(key: String): String
  def encodeValue(value: String): String
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
}

