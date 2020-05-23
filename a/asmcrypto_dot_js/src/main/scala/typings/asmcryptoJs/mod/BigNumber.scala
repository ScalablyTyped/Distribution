package typings.asmcryptoJs.mod

import typings.asmcryptoJs.anon.BitLength
import typings.asmcryptoJs.anon.Gcd
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js", "BigNumber")
@js.native
class BigNumber ()
  extends typings.asmcryptoJs.bignumMod.BigNumber {
  def this(num: Uint8Array) = this()
}

/* static members */
@JSImport("asmcrypto.js", "BigNumber")
@js.native
object BigNumber extends js.Object {
  var ONE: typings.asmcryptoJs.bignumMod.BigNumber = js.native
  var ZERO: typings.asmcryptoJs.bignumMod.BigNumber = js.native
  @JSName("extGCD")
  var extGCD_Original: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
  def extGCD(a: this.type, b: this.type): Gcd = js.native
  def fromArrayBuffer(buffer: ArrayBuffer): typings.asmcryptoJs.bignumMod.BigNumber = js.native
  def fromConfig(obj: BitLength): typings.asmcryptoJs.bignumMod.BigNumber = js.native
  def fromNumber(num: Double): typings.asmcryptoJs.bignumMod.BigNumber = js.native
  def fromString(str: String): typings.asmcryptoJs.bignumMod.BigNumber = js.native
}

