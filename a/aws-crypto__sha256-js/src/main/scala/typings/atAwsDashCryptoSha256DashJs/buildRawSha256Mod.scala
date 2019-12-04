package typings.atAwsDashCryptoSha256DashJs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-crypto/sha256-js/build/RawSha256", JSImport.Namespace)
@js.native
object buildRawSha256Mod extends js.Object {
  @js.native
  class RawSha256 () extends js.Object {
    var buffer: js.Any = js.native
    var bufferLength: js.Any = js.native
    var bytesHashed: js.Any = js.native
    /**
      * @internal
      */
    var finished: Boolean = js.native
    var hashBuffer: js.Any = js.native
    var state: js.Any = js.native
    var temp: js.Any = js.native
    def digest(): Uint8Array = js.native
    def update(data: Uint8Array): Unit = js.native
  }
  
}

