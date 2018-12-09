package typings
package adoneLib.adoneNs.compressorNs.brotliNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.compressor.brotli")
@js.native
object brotliNsMembers extends js.Object {
  /**
               * Compresses the given string or buffer
               */
  def compress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Compresses the given string or buffer
               */
  def compress(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.brotliNs.INs.CompressOptions): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Compresses the given string or buffer
               */
  def compress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Compresses the given string or buffer
               */
  def compress(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.brotliNs.INs.CompressOptions): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Creates a compress stream
               */
  def compressStream(): adoneLib.adoneNs.compressorNs.brotliNs.INs.EncodeStream = js.native
  /**
               * Creates a compress stream
               */
  def compressStream(options: adoneLib.adoneNs.compressorNs.brotliNs.INs.CompressOptions): adoneLib.adoneNs.compressorNs.brotliNs.INs.EncodeStream = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  def compressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  def compressSync(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.brotliNs.INs.CompressOptions): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  def compressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
               * Synchronously compresses the given string or buffer
               */
  def compressSync(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.brotliNs.INs.CompressOptions): nodeLib.Buffer = js.native
  /**
               * Decompresses the given buffer
               */
  def decompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Decompresses the given buffer
               */
  def decompress(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.brotliNs.INs.DecompressOptions): js.Promise[nodeLib.Buffer] = js.native
  /**
               * Creates a decompress stream
               */
  def decompressStream(): adoneLib.adoneNs.compressorNs.brotliNs.INs.DecodeStream = js.native
  /**
               * Creates a decompress stream
               */
  def decompressStream(options: adoneLib.adoneNs.compressorNs.brotliNs.INs.DecompressOptions): adoneLib.adoneNs.compressorNs.brotliNs.INs.DecodeStream = js.native
  /**
               * Synchronously decompresses the given buffer
               */
  def decompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
               * Synchronously decompresses the given buffer
               */
  def decompressSync(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.brotliNs.INs.DecompressOptions): nodeLib.Buffer = js.native
}

