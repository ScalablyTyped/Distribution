package typings.adone.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "punycode")
@js.native
object punycodeNs extends js.Object {
  val version: String = js.native
  def decode(input: String): String = js.native
  def encode(input: String): String = js.native
  def toASCII(input: String): String = js.native
  def toUnicode(input: String): String = js.native
  @JSName("ucs2")
  @js.native
  object ucs2Ns extends js.Object {
    def decode(string: String): js.Array[Double] = js.native
    def encode(array: js.Array[Double]): String = js.native
  }
  
}

