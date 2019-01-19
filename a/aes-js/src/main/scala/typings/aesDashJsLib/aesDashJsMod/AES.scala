package typings
package aesDashJsLib.aesDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aes-js", "AES")
@js.native
class AES protected () extends js.Object {
  /**
    * Create a new AES block cipher.
    * @param key The cipher key.
    */
  def this(key: ByteSource) = this()
  def encrypt(v: ByteSource): ByteSource = js.native
}

