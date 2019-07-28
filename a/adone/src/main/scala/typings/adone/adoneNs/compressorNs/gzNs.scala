package typings.adone.adoneNs.compressorNs

import typings.adone.Anon_Info
import typings.adone.adoneNs.compressorNs.INs.zlibNs.CompressOptions
import typings.adone.adoneNs.compressorNs.INs.zlibNs.CompressStreamOptions
import typings.adone.adoneNs.compressorNs.INs.zlibNs.DecompressOptions
import typings.adone.adoneNs.compressorNs.INs.zlibNs.DecompressStreamOptions
import typings.adone.adoneNs.compressorNs.INs.zlibNs.GunzipInfo
import typings.adone.adoneNs.compressorNs.INs.zlibNs.GzipInfo
import typings.node.Buffer
import typings.node.zlibMod.Gunzip
import typings.node.zlibMod.Gzip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GZIP compressor
  */
@JSGlobal("adone.compressor.gz")
@js.native
object gzNs extends js.Object {
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
  def compress(buf: String, options: (CompressOptions with Anon_Info) | CompressOptions): js.Promise[GzipInfo] = js.native
  def compress(buf: Buffer): js.Promise[Buffer] = js.native
  def compress(buf: Buffer, options: (CompressOptions with Anon_Info) | CompressOptions): js.Promise[GzipInfo] = js.native
  /**
    * Creates a compress stream
    */
  def compressStream(): Gzip = js.native
  def compressStream(options: CompressStreamOptions): Gzip = js.native
  /**
    * Synchronously compreses the given string or buffer
    */
  def compressSync(buf: String): Buffer = js.native
  def compressSync(buf: String, options: CompressOptions): Buffer = js.native
  def compressSync(buf: Buffer): Buffer = js.native
  def compressSync(buf: Buffer, options: CompressOptions): Buffer = js.native
  /**
    * Synchronously compreses the given string or buffer
    */
  @JSName("compressSync")
  def compressSync_GzipInfo(buf: String, options: CompressOptions with Anon_Info): GzipInfo = js.native
  @JSName("compressSync")
  def compressSync_GzipInfo(buf: Buffer, options: CompressOptions with Anon_Info): GzipInfo = js.native
  /**
    * Decompresses the given string or buffer
    */
  def decompress(buf: String): js.Promise[Buffer] = js.native
  /**
    * Decompresses the given string or buffer
    */
  def decompress(buf: String, options: (DecompressOptions with Anon_Info) | DecompressOptions): js.Promise[GunzipInfo] = js.native
  def decompress(buf: Buffer): js.Promise[Buffer] = js.native
  def decompress(buf: Buffer, options: (DecompressOptions with Anon_Info) | DecompressOptions): js.Promise[GunzipInfo] = js.native
  /**
    * Creates a decompress stream
    */
  def decompressStream(): Gunzip = js.native
  def decompressStream(options: DecompressStreamOptions): Gunzip = js.native
  /**
    * Synchronously decompresses the given string or buffer
    */
  def decompressSync(buf: String): Buffer = js.native
  def decompressSync(buf: String, options: DecompressOptions): Buffer = js.native
  def decompressSync(buf: Buffer): Buffer = js.native
  def decompressSync(buf: Buffer, options: DecompressOptions): Buffer = js.native
  /**
    * Synchronously decompresses the given string or buffer
    */
  @JSName("decompressSync")
  def decompressSync_GunzipInfo(buf: String, options: DecompressOptions with Anon_Info): GunzipInfo = js.native
  @JSName("decompressSync")
  def decompressSync_GunzipInfo(buf: Buffer, options: DecompressOptions with Anon_Info): GunzipInfo = js.native
}

