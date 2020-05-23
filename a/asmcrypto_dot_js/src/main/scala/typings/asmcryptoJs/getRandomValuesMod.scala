package typings.asmcryptoJs

import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/other/get-random-values", JSImport.Namespace)
@js.native
object getRandomValuesMod extends js.Object {
  def getRandomValues(buf: Uint32Array): Unit = js.native
  def getRandomValues(buf: Uint8Array): Unit = js.native
}

