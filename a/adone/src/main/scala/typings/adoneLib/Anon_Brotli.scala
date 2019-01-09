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
  val brotliNs: Anon_BufCompressCompressStreamCompressSync
  /**
    * Deflate compressor
    */
  val deflateNs: Anon_BufCompressCompressStream
  /**
    * GZIP compressor
    */
  val gzNs: Anon_BufCompress
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

