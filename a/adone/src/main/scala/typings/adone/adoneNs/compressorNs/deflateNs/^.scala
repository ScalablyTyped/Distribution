package typings.adone.adoneNs.compressorNs.deflateNs

import typings.adone.Anon_Info
import typings.adone.adoneNs.compressorNs.deflateNs.INs.CompressOptions
import typings.adone.adoneNs.compressorNs.deflateNs.INs.CompressStreamOptions
import typings.adone.adoneNs.compressorNs.deflateNs.INs.DecompressOptions
import typings.adone.adoneNs.compressorNs.deflateNs.INs.DecompressStreamOptions
import typings.adone.adoneNs.compressorNs.deflateNs.INs.DeflateInfo
import typings.adone.adoneNs.compressorNs.deflateNs.INs.DeflateRawInfo
import typings.adone.adoneNs.compressorNs.deflateNs.INs.InflateInfo
import typings.adone.adoneNs.compressorNs.deflateNs.INs.InflateRawInfo
import typings.node.Buffer
import typings.node.zlibMod.Deflate
import typings.node.zlibMod.DeflateRaw
import typings.node.zlibMod.Inflate
import typings.node.zlibMod.InflateRaw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.compressor.deflate")
@js.native
object ^ extends js.Object {
  val Z_BEST_COMPRESSION: Double = js.native
  val Z_BEST_SPEED: Double = js.native
  val Z_BLOCK: Double = js.native
  val Z_BUF_ERROR: Double = js.native
  val Z_DATA_ERROR: Double = js.native
  val Z_DEFAULT_COMPRESSION: Double = js.native
  val Z_DEFAULT_STRATEGY: Double = js.native
  val Z_ERRNO: Double = js.native
  val Z_FILTERED: Double = js.native
  val Z_FINISH: Double = js.native
  val Z_FIXED: Double = js.native
  val Z_FULL_FLUSH: Double = js.native
  val Z_HUFFMAN_ONLY: Double = js.native
  val Z_MEM_ERROR: Double = js.native
  val Z_NEED_DICT: Double = js.native
  val Z_NO_COMPRESSION: Double = js.native
  val Z_NO_FLUSH: Double = js.native
  val Z_OK: Double = js.native
  val Z_PARTIAL_FLUSH: Double = js.native
  val Z_RLE: Double = js.native
  val Z_STREAM_END: Double = js.native
  val Z_STREAM_ERROR: Double = js.native
  val Z_SYNC_FLUSH: Double = js.native
  val Z_TREES: Double = js.native
  val Z_VERSION_ERROR: Double = js.native
  /**
    * Compresses the given string or buffer
    */
  def compress(buf: String): js.Promise[Buffer] = js.native
  /**
    * Compresses the given string or buffer
    */
  def compress(buf: String, options: (CompressOptions with Anon_Info) | CompressOptions): js.Promise[DeflateInfo] = js.native
  def compress(buf: Buffer): js.Promise[Buffer] = js.native
  def compress(buf: Buffer, options: (CompressOptions with Anon_Info) | CompressOptions): js.Promise[DeflateInfo] = js.native
  /**
    * Creates a compress stream
    */
  def compressStream(): Deflate = js.native
  def compressStream(options: CompressStreamOptions): Deflate = js.native
  /**
    * Synchronously compresses the given string or buffer
    */
  def compressSync(buf: String): Buffer = js.native
  def compressSync(buf: String, options: CompressOptions): Buffer = js.native
  def compressSync(buf: Buffer): Buffer = js.native
  def compressSync(buf: Buffer, options: CompressOptions): Buffer = js.native
  /**
    * Synchronously compresses the given string or buffer
    */
  @JSName("compressSync")
  def compressSync_DeflateInfo(buf: String, options: CompressOptions with Anon_Info): DeflateInfo = js.native
  @JSName("compressSync")
  def compressSync_DeflateInfo(buf: Buffer, options: CompressOptions with Anon_Info): DeflateInfo = js.native
  /**
    * Decomrpesses the given string of buffer
    */
  def decompress(buf: String): js.Promise[Buffer] = js.native
  /**
    * Decomrpesses the given string of buffer
    */
  def decompress(buf: String, options: (DecompressOptions with Anon_Info) | DecompressOptions): js.Promise[InflateInfo] = js.native
  def decompress(buf: Buffer): js.Promise[Buffer] = js.native
  def decompress(buf: Buffer, options: (DecompressOptions with Anon_Info) | DecompressOptions): js.Promise[InflateInfo] = js.native
  /**
    * Creates a decompress stream
    */
  def decompressStream(): Inflate = js.native
  def decompressStream(options: DecompressStreamOptions): Inflate = js.native
  /**
    * Synchronously decomrpesses the given string of buffer
    */
  def decompressSync(buf: String): Buffer = js.native
  def decompressSync(buf: String, options: DecompressOptions): Buffer = js.native
  def decompressSync(buf: Buffer): Buffer = js.native
  def decompressSync(buf: Buffer, options: DecompressOptions): Buffer = js.native
  /**
    * Synchronously decomrpesses the given string of buffer
    */
  @JSName("decompressSync")
  def decompressSync_InflateInfo(buf: String, options: DecompressOptions with Anon_Info): InflateInfo = js.native
  @JSName("decompressSync")
  def decompressSync_InflateInfo(buf: Buffer, options: DecompressOptions with Anon_Info): InflateInfo = js.native
  /**
    * Compresses data using deflate, and does not append a zlib header
    */
  def rawCompress(buf: String): js.Promise[Buffer] = js.native
  /**
    * Compresses data using deflate, and does not append a zlib header
    */
  def rawCompress(buf: String, options: (CompressOptions with Anon_Info) | CompressOptions): js.Promise[DeflateRawInfo] = js.native
  def rawCompress(buf: Buffer): js.Promise[Buffer] = js.native
  def rawCompress(buf: Buffer, options: (CompressOptions with Anon_Info) | CompressOptions): js.Promise[DeflateRawInfo] = js.native
  /**
    * Creates a raw compress stream
    */
  def rawCompressStream(): DeflateRaw = js.native
  def rawCompressStream(options: CompressStreamOptions): DeflateRaw = js.native
  /**
    * Synchronously compresses data using deflate, and does not append a zlib header
    */
  def rawCompressSync(buf: String): Buffer = js.native
  def rawCompressSync(buf: String, options: CompressOptions): Buffer = js.native
  def rawCompressSync(buf: Buffer): Buffer = js.native
  def rawCompressSync(buf: Buffer, options: CompressOptions): Buffer = js.native
  /**
    * Synchronously compresses data using deflate, and does not append a zlib header
    */
  @JSName("rawCompressSync")
  def rawCompressSync_DeflateRawInfo(buf: String, options: CompressOptions with Anon_Info): DeflateRawInfo = js.native
  @JSName("rawCompressSync")
  def rawCompressSync_DeflateRawInfo(buf: Buffer, options: CompressOptions with Anon_Info): DeflateRawInfo = js.native
  /**
    * Decompresses raw compressed data
    */
  def rawDecompress(buf: String): js.Promise[Buffer] = js.native
  /**
    * Decompresses raw compressed data
    */
  def rawDecompress(buf: String, options: (DecompressOptions with Anon_Info) | DecompressOptions): js.Promise[InflateRawInfo] = js.native
  def rawDecompress(buf: Buffer): js.Promise[Buffer] = js.native
  def rawDecompress(buf: Buffer, options: (DecompressOptions with Anon_Info) | DecompressOptions): js.Promise[InflateRawInfo] = js.native
  /**
    * Creates a raw decompress stream
    */
  def rawDecompressStream(): InflateRaw = js.native
  def rawDecompressStream(options: DecompressStreamOptions): InflateRaw = js.native
  /**
    * Synchronously decompresses raw compressed data
    */
  def rawDecompressSync(buf: String): Buffer = js.native
  def rawDecompressSync(buf: String, options: DecompressOptions): Buffer = js.native
  def rawDecompressSync(buf: Buffer): Buffer = js.native
  def rawDecompressSync(buf: Buffer, options: DecompressOptions): Buffer = js.native
  /**
    * Synchronously decompresses raw compressed data
    */
  @JSName("rawDecompressSync")
  def rawDecompressSync_InflateRawInfo(buf: String, options: DecompressOptions with Anon_Info): InflateRawInfo = js.native
  @JSName("rawDecompressSync")
  def rawDecompressSync_InflateRawInfo(buf: Buffer, options: DecompressOptions with Anon_Info): InflateRawInfo = js.native
}

