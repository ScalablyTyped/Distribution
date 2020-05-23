package typings.asmcryptoJs.sha256AsmMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/hash/sha256/sha256.asm", "sha256_asm")
@js.native
object sha256Asm extends js.Object {
  def apply(stdlib: js.Any, foreign: js.Any, buffer: ArrayBuffer): sha256result = js.native
}

