package typings.awsCryptoCrc32.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/crc32", "Crc32")
@js.native
class Crc32_ () extends js.Object {
  var checksum: js.Any = js.native
  def digest(): Double = js.native
  def update(data: Uint8Array): this.type = js.native
}

