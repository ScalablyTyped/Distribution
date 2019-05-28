package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcompressor extends js.Object {
  val INs: TypeofILzma
  /**
    * Brotli compressor (br)
    */
  val brotliNs: Typeofbrotli
  /**
    * Deflate compressor
    */
  val deflateNs: Typeofdeflate
  /**
    * GZIP compressor
    */
  val gzNs: Typeofgz
  /**
    * lzma compressor + common lzma functionality
    */
  val lzmaNs: Typeoflzma
  /**
    * Snappy compressor
    */
  val snappyNs: Typeofsnappy
  /**
    * xz compressor (lzma2) + common lzma functionality
    */
  val xzNs: Typeofxz
}

object Typeofcompressor {
  @scala.inline
  def apply(
    INs: TypeofILzma,
    brotliNs: Typeofbrotli,
    deflateNs: Typeofdeflate,
    gzNs: Typeofgz,
    lzmaNs: Typeoflzma,
    snappyNs: Typeofsnappy,
    xzNs: Typeofxz
  ): Typeofcompressor = {
    val __obj = js.Dynamic.literal(INs = INs, brotliNs = brotliNs, deflateNs = deflateNs, gzNs = gzNs, lzmaNs = lzmaNs, snappyNs = snappyNs, xzNs = xzNs)
  
    __obj.asInstanceOf[Typeofcompressor]
  }
}

