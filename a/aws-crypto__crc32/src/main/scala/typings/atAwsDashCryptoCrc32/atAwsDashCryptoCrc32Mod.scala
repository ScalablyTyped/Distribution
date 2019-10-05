package typings.atAwsDashCryptoCrc32

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/crc32", JSImport.Namespace)
@js.native
object atAwsDashCryptoCrc32Mod extends js.Object {
  @js.native
  class Crc32 () extends js.Object {
    var checksum: js.Any = js.native
    def digest(): Double = js.native
    def update(data: Uint8Array): this.type = js.native
  }
  
  def crc32(data: Uint8Array): Double = js.native
}

