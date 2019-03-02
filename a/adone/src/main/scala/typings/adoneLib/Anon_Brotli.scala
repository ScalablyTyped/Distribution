package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brotli extends js.Object {
  val INs: Anon_Lzma
  /**
    * Brotli compressor (br)
    */
  val brotliNs: Anon_BufCompressCompressStream
  /**
    * Deflate compressor
    */
  val deflateNs: Anon_BufCompress
  /**
    * GZIP compressor
    */
  val gzNs: Anon_Buf
  /**
    * lzma compressor + common lzma functionality
    */
  val lzmaNs: Anon_AloneDecoder
  /**
    * Snappy compressor
    */
  val snappyNs: Anon_BufCompressCompressSync
  /**
    * xz compressor (lzma2) + common lzma functionality
    */
  val xzNs: Anon_AloneDecoderAloneEncoder
}

object Anon_Brotli {
  @scala.inline
  def apply(
    INs: Anon_Lzma,
    brotliNs: Anon_BufCompressCompressStream,
    deflateNs: Anon_BufCompress,
    gzNs: Anon_Buf,
    lzmaNs: Anon_AloneDecoder,
    snappyNs: Anon_BufCompressCompressSync,
    xzNs: Anon_AloneDecoderAloneEncoder
  ): Anon_Brotli = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("INs")(INs)
    __obj.updateDynamic("brotliNs")(brotliNs)
    __obj.updateDynamic("deflateNs")(deflateNs)
    __obj.updateDynamic("gzNs")(gzNs)
    __obj.updateDynamic("lzmaNs")(lzmaNs)
    __obj.updateDynamic("snappyNs")(snappyNs)
    __obj.updateDynamic("xzNs")(xzNs)
    __obj.asInstanceOf[Anon_Brotli]
  }
}

