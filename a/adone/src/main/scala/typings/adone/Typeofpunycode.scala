package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpunycode extends js.Object {
  val ucs2Ns: Typeofucs2
  val version: String
  def decode(input: String): String
  def encode(input: String): String
  def toASCII(input: String): String
  def toUnicode(input: String): String
}

object Typeofpunycode {
  @scala.inline
  def apply(
    decode: String => String,
    encode: String => String,
    toASCII: String => String,
    toUnicode: String => String,
    ucs2Ns: Typeofucs2,
    version: String
  ): Typeofpunycode = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), toASCII = js.Any.fromFunction1(toASCII), toUnicode = js.Any.fromFunction1(toUnicode), ucs2Ns = ucs2Ns, version = version)
  
    __obj.asInstanceOf[Typeofpunycode]
  }
}

