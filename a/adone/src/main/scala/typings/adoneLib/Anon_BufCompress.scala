package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BufCompress extends js.Object {
  val INs: js.Any = js.native
  val Z_BEST_COMPRESSION: scala.Double = js.native
  val Z_BEST_SPEED: scala.Double = js.native
  val Z_BLOCK: scala.Double = js.native
  val Z_BUF_ERROR: scala.Double = js.native
  val Z_DATA_ERROR: scala.Double = js.native
  val Z_DEFAULT_COMPRESSION: scala.Double = js.native
  val Z_DEFAULT_STRATEGY: scala.Double = js.native
  val Z_ERRNO: scala.Double = js.native
  val Z_FILTERED: scala.Double = js.native
  val Z_FINISH: scala.Double = js.native
  val Z_FIXED: scala.Double = js.native
  val Z_FULL_FLUSH: scala.Double = js.native
  val Z_HUFFMAN_ONLY: scala.Double = js.native
  val Z_MEM_ERROR: scala.Double = js.native
  val Z_NEED_DICT: scala.Double = js.native
  val Z_NO_COMPRESSION: scala.Double = js.native
  val Z_NO_FLUSH: scala.Double = js.native
  val Z_OK: scala.Double = js.native
  val Z_PARTIAL_FLUSH: scala.Double = js.native
  val Z_RLE: scala.Double = js.native
  val Z_STREAM_END: scala.Double = js.native
  val Z_STREAM_ERROR: scala.Double = js.native
  val Z_SYNC_FLUSH: scala.Double = js.native
  val Z_TREES: scala.Double = js.native
  val Z_VERSION_ERROR: scala.Double = js.native
  /**
    * Compresses the given string or buffer
    */
  def compress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Compresses the given string or buffer
    */
  def compress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateInfo] = js.native
  def compress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateInfo] = js.native
  /**
    * Creates a compress stream
    */
  def compressStream(): nodeLib.zlibMod.Deflate = js.native
  def compressStream(options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressStreamOptions): nodeLib.zlibMod.Deflate = js.native
  /**
    * Synchronously compresses the given string or buffer
    */
  def compressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  def compressSync(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions): nodeLib.Buffer = js.native
  def compressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def compressSync(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions): nodeLib.Buffer = js.native
  /**
    * Synchronously compresses the given string or buffer
    */
  @JSName("compressSync")
  def compressSync_DeflateInfo(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateInfo = js.native
  @JSName("compressSync")
  def compressSync_DeflateInfo(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateInfo = js.native
  /**
    * Decomrpesses the given string of buffer
    */
  def decompress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Decomrpesses the given string of buffer
    */
  def decompress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateInfo] = js.native
  def decompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def decompress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateInfo] = js.native
  /**
    * Creates a decompress stream
    */
  def decompressStream(): nodeLib.zlibMod.Inflate = js.native
  def decompressStream(options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressStreamOptions): nodeLib.zlibMod.Inflate = js.native
  /**
    * Synchronously decomrpesses the given string of buffer
    */
  def decompressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  /**
    * Synchronously decomrpesses the given string of buffer
    */
  def decompressSync(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateInfo = js.native
  def decompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def decompressSync(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateInfo = js.native
  @JSName("decompressSync")
  def decompressSync_Buffer(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions): nodeLib.Buffer = js.native
  @JSName("decompressSync")
  def decompressSync_Buffer(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions): nodeLib.Buffer = js.native
  /**
    * Compresses data using deflate, and does not append a zlib header
    */
  def rawCompress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Compresses data using deflate, and does not append a zlib header
    */
  def rawCompress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo] = js.native
  def rawCompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def rawCompress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo] = js.native
  /**
    * Creates a raw compress stream
    */
  def rawCompressStream(): nodeLib.zlibMod.DeflateRaw = js.native
  def rawCompressStream(options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressStreamOptions): nodeLib.zlibMod.DeflateRaw = js.native
  /**
    * Synchronously compresses data using deflate, and does not append a zlib header
    */
  def rawCompressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  /**
    * Synchronously compresses data using deflate, and does not append a zlib header
    */
  def rawCompressSync(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo = js.native
  def rawCompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def rawCompressSync(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo = js.native
  @JSName("rawCompressSync")
  def rawCompressSync_Buffer(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions): nodeLib.Buffer = js.native
  @JSName("rawCompressSync")
  def rawCompressSync_Buffer(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.CompressOptions): nodeLib.Buffer = js.native
  /**
    * Decompresses raw compressed data
    */
  def rawDecompress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Decompresses raw compressed data
    */
  def rawDecompress(
    buf: java.lang.String,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo] = js.native
  def rawDecompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def rawDecompress(
    buf: nodeLib.Buffer,
    options: (adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with Anon_Info) | adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
  ): js.Promise[adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo] = js.native
  /**
    * Creates a raw decompress stream
    */
  def rawDecompressStream(): nodeLib.zlibMod.InflateRaw = js.native
  def rawDecompressStream(options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressStreamOptions): nodeLib.zlibMod.InflateRaw = js.native
  /**
    * Synchronously decompresses raw compressed data
    */
  def rawDecompressSync(buf: java.lang.String): nodeLib.Buffer = js.native
  def rawDecompressSync(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions): nodeLib.Buffer = js.native
  def rawDecompressSync(buf: nodeLib.Buffer): nodeLib.Buffer = js.native
  def rawDecompressSync(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions): nodeLib.Buffer = js.native
  /**
    * Synchronously decompresses raw compressed data
    */
  @JSName("rawDecompressSync")
  def rawDecompressSync_InflateRawInfo(
    buf: java.lang.String,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo = js.native
  @JSName("rawDecompressSync")
  def rawDecompressSync_InflateRawInfo(
    buf: nodeLib.Buffer,
    options: adoneLib.adoneNs.compressorNs.deflateNs.INs.DecompressOptions with Anon_Info
  ): adoneLib.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo = js.native
}

