package typings.asmcryptoJs.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asmcrypto.js", "AES_CMAC")
@js.native
class AES_CMAC protected ()
  extends typings.asmcryptoJs.cmacMod.AES_CMAC {
  def this(key: Uint8Array) = this()
}
/* static members */
@JSImport("asmcrypto.js", "AES_CMAC")
@js.native
object AES_CMAC extends js.Object {
  
  def bytes(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
}
