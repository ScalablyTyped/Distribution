package typings.aesDashJs.aesDashJsMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aes-js", "padding")
@js.native
object paddingNs extends js.Object {
  @JSName("pkcs7")
  @js.native
  object pkcs7Ns extends js.Object {
    /**
      * Add standard PKCS7 padding to an array.
      * @param data The input data.
      */
    def pad(data: ByteSource): Uint8Array = js.native
    /**
      * Remove standard PKCS7 padding from an array.
      * @param data The input data.
      */
    def strip(data: ByteSource): Uint8Array = js.native
  }
  
}

