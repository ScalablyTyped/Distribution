package typings.adone

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofsnappy extends js.Object {
  /**
    * Compresses the given string or buffer
    */
  def compress(buf: String): js.Promise[Buffer] = js.native
  def compress(buf: Buffer): js.Promise[Buffer] = js.native
  /**
    * Synchronously compresses the given string or buffer
    */
  def compressSync(buf: String): Buffer = js.native
  def compressSync(buf: Buffer): Buffer = js.native
  /**
    * Decompresses the given buffer
    */
  def decompress(buf: Buffer): js.Promise[Buffer] = js.native
  /**
    * Synchronously decompresses the given buffer
    */
  def decompressSync(buf: Buffer): Buffer = js.native
  /**
    * Checks whether the given buffer is a valid compressed buffer
    */
  def isValidCompressed(buf: Buffer): js.Promise[Boolean] = js.native
  /**
    * Synchronously checks whether the given buffer is a valid compressed buffer
    */
  def isValidCompressedSync(buf: Buffer): Boolean = js.native
}

