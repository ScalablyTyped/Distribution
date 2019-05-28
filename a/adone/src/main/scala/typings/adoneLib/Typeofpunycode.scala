package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofpunycode extends js.Object {
  val ucs2Ns: Typeofucs2
  val version: java.lang.String
  def decode(input: java.lang.String): java.lang.String
  def encode(input: java.lang.String): java.lang.String
  def toASCII(input: java.lang.String): java.lang.String
  def toUnicode(input: java.lang.String): java.lang.String
}

object Typeofpunycode {
  @scala.inline
  def apply(
    decode: java.lang.String => java.lang.String,
    encode: java.lang.String => java.lang.String,
    toASCII: java.lang.String => java.lang.String,
    toUnicode: java.lang.String => java.lang.String,
    ucs2Ns: Typeofucs2,
    version: java.lang.String
  ): Typeofpunycode = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), toASCII = js.Any.fromFunction1(toASCII), toUnicode = js.Any.fromFunction1(toUnicode), ucs2Ns = ucs2Ns, version = version)
  
    __obj.asInstanceOf[Typeofpunycode]
  }
}

