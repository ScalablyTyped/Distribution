package typings.adone.adoneNs.compressorNs.brotliNs

import typings.adone.adoneNs.compressorNs.brotliNs.INs.CompressOptions
import typings.adone.adoneNs.compressorNs.brotliNs.INs.DecodeStream
import typings.adone.adoneNs.compressorNs.brotliNs.INs.DecompressOptions
import typings.adone.adoneNs.compressorNs.brotliNs.INs.EncodeStream
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.compressor.brotli")
@js.native
object ^ extends js.Object {
  /**
    * Compresses the given string or buffer
    */
  def compress(buf: String): js.Promise[Buffer] = js.native
  def compress(buf: String, options: CompressOptions): js.Promise[Buffer] = js.native
  def compress(buf: Buffer): js.Promise[Buffer] = js.native
  def compress(buf: Buffer, options: CompressOptions): js.Promise[Buffer] = js.native
  /**
    * Creates a compress stream
    */
  def compressStream(): EncodeStream = js.native
  def compressStream(options: CompressOptions): EncodeStream = js.native
  /**
    * Synchronously compresses the given string or buffer
    */
  def compressSync(buf: String): Buffer = js.native
  def compressSync(buf: String, options: CompressOptions): Buffer = js.native
  def compressSync(buf: Buffer): Buffer = js.native
  def compressSync(buf: Buffer, options: CompressOptions): Buffer = js.native
  /**
    * Decompresses the given buffer
    */
  def decompress(buf: Buffer): js.Promise[Buffer] = js.native
  def decompress(buf: Buffer, options: DecompressOptions): js.Promise[Buffer] = js.native
  /**
    * Creates a decompress stream
    */
  def decompressStream(): DecodeStream = js.native
  def decompressStream(options: DecompressOptions): DecodeStream = js.native
  /**
    * Synchronously decompresses the given buffer
    */
  def decompressSync(buf: Buffer): Buffer = js.native
  def decompressSync(buf: Buffer, options: DecompressOptions): Buffer = js.native
}

