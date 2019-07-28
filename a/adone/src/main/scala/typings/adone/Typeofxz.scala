package typings.adone

import typings.adone.adoneNs.compressorNs.INs.lzmaNs.AloneDecoderOptions
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.AloneEncoderOptions
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.AutoDecoderOptions
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.EasyEncoderOptions
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.Filters
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.RawDecoderOptions
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.RawEncoderOptions
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.Stream
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.StreamDecoderOptions
import typings.adone.adoneNs.compressorNs.INs.lzmaNs.StreamEncoderOptions
import typings.adone.adoneStrings.aloneDecoder
import typings.adone.adoneStrings.aloneEncoder
import typings.adone.adoneStrings.autoDecoder
import typings.adone.adoneStrings.easyEncoder
import typings.adone.adoneStrings.rawDecoder
import typings.adone.adoneStrings.rawEncoder
import typings.adone.adoneStrings.streamDecoder
import typings.adone.adoneStrings.streamEncoder
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofxz extends js.Object {
  val CHECK_CRC32: Double = js.native
  val CHECK_CRC64: Double = js.native
  val CHECK_NONE: Double = js.native
  val CHECK_SHA256: Double = js.native
  val FILTERS_MAX: String = js.native
  val FILTER_ARM: String = js.native
  val FILTER_ARMTHUMB: String = js.native
  val FILTER_DELTA: String = js.native
  val FILTER_IA64: String = js.native
  val FILTER_LZMA1: String = js.native
  val FILTER_LZMA2: String = js.native
  val FILTER_POWERPC: String = js.native
  val FILTER_SPARC: String = js.native
  val FILTER_X86: String = js.native
  val LZMA_CONCATENATED: Double = js.native
  val LZMA_TELL_ANY_CHECK: Double = js.native
  val LZMA_TELL_NO_CHECK: Double = js.native
  val LZMA_TELL_UNSUPPORTED_CHECK: Double = js.native
  val MF_BT2: Double = js.native
  val MF_BT3: Double = js.native
  val MF_BT4: Double = js.native
  val MF_HC3: Double = js.native
  val MF_HC4: Double = js.native
  val MODE_FAST: Double = js.native
  val MODE_NORMAL: Double = js.native
  val PRESET_DEFAULT: Double = js.native
  val PRESET_EXTREME: Double = js.native
  val PRESET_LEVEL_MASK: Double = js.native
  val STREAM_HEADER_SIZE: Double = js.native
  val asyncCodeAvailable: Boolean = js.native
  /**
    * Checks whether the given Check ID is supported by this liblzma build
    */
  def checkIsSupported(check: Double): Boolean = js.native
  /**
    * Return the byte size of a check sums
    *
    * @param check Any supported check constant
    */
  def checkSize(check: Double): Double = js.native
  /**
    * Compresses the given string or buffer
    *
    * @param options preset or options
    */
  def compress(buf: String): js.Promise[Buffer] = js.native
  def compress(buf: String, options: Double): js.Promise[Buffer] = js.native
  def compress(buf: String, options: EasyEncoderOptions): js.Promise[Buffer] = js.native
  def compress(buf: Buffer): js.Promise[Buffer] = js.native
  def compress(buf: Buffer, options: Double): js.Promise[Buffer] = js.native
  def compress(buf: Buffer, options: EasyEncoderOptions): js.Promise[Buffer] = js.native
  /**
    * Creates a compress stream
    *
    * @param options preset or options
    */
  def compressStream(): Stream = js.native
  def compressStream(options: Double): Stream = js.native
  def compressStream(options: EasyEncoderOptions): Stream = js.native
  /**
    * Returns a standard LZMA decoder
    */
  @JSName("createStream")
  def createStream_aloneDecoder(coder: aloneDecoder): Stream = js.native
  @JSName("createStream")
  def createStream_aloneDecoder(coder: aloneDecoder, options: AloneDecoderOptions): Stream = js.native
  /**
    * Returns a standard LZMA encoder
    *
    * @param options preset or options
    */
  @JSName("createStream")
  def createStream_aloneEncoder(coder: aloneEncoder): Stream = js.native
  @JSName("createStream")
  def createStream_aloneEncoder(coder: aloneEncoder, options: Double): Stream = js.native
  @JSName("createStream")
  def createStream_aloneEncoder(coder: aloneEncoder, options: AloneEncoderOptions): Stream = js.native
  /**
    * Returns a standard LZMA 1/2 (bith .xz and .lzma) decoder with auto detection of file format
    */
  @JSName("createStream")
  def createStream_autoDecoder(coder: autoDecoder): Stream = js.native
  @JSName("createStream")
  def createStream_autoDecoder(coder: autoDecoder, options: AutoDecoderOptions): Stream = js.native
  /**
    * Returns a standard LZMA2 (.xz) encoder
    *
    * @param options preset or options
    */
  @JSName("createStream")
  def createStream_easyEncoder(coder: easyEncoder): Stream = js.native
  @JSName("createStream")
  def createStream_easyEncoder(coder: easyEncoder, options: Double): Stream = js.native
  @JSName("createStream")
  def createStream_easyEncoder(coder: easyEncoder, options: EasyEncoderOptions): Stream = js.native
  /**
    * Returns a custom decoder corresponding to lzma_raw_decoder
    */
  @JSName("createStream")
  def createStream_rawDecoder(coder: rawDecoder): Stream = js.native
  @JSName("createStream")
  def createStream_rawDecoder(coder: rawDecoder, options: RawDecoderOptions): Stream = js.native
  /**
    * Returns a custom encoder corresponding to lzma_raw_encoder
    */
  @JSName("createStream")
  def createStream_rawEncoder(coder: rawEncoder): Stream = js.native
  @JSName("createStream")
  def createStream_rawEncoder(coder: rawEncoder, options: RawEncoderOptions): Stream = js.native
  /**
    * Returns a custom decoder corresponding to lzma_stream_decoder
    */
  @JSName("createStream")
  def createStream_streamDecoder(coder: streamDecoder): Stream = js.native
  @JSName("createStream")
  def createStream_streamDecoder(coder: streamDecoder, options: StreamDecoderOptions): Stream = js.native
  /**
    * Returns a custom encoder corresponding to lzma_stream_encoder
    */
  @JSName("createStream")
  def createStream_streamEncoder(coder: streamEncoder): Stream = js.native
  @JSName("createStream")
  def createStream_streamEncoder(coder: streamEncoder, options: StreamEncoderOptions): Stream = js.native
  /**
    * Decompresses the given buffer
    */
  def decompress(buf: Buffer): js.Promise[Buffer] = js.native
  def decompress(buf: Buffer, options: AutoDecoderOptions): js.Promise[Buffer] = js.native
  /**
    * Creates a decompress stream
    *
    * @param options preset or options
    */
  def decompressStream(): Stream = js.native
  def decompressStream(options: AutoDecoderOptions): Stream = js.native
  /**
    * Returns the approximate memory usage when decoding using easyDecoder for a given preset
    */
  def easyDecoderMemusage(preset: Double): Double = js.native
  /**
    * Returns the approximate memory usage when encoding using easyEncoder for a given preset
    */
  def easyEncoderMemusage(preset: Double): Double = js.native
  /**
    * Checks whether the given encoder filter is supported
    */
  def filterDecoderIsSupported(decoder: String): Boolean = js.native
  /**
    * Checks whether the given encoder filter is supported
    */
  def filterEncoderIsSupported(encoder: String): Boolean = js.native
  /**
    * Checks whether the given match finder is supported by this liblzma build
    */
  def mfIsSupported(mf: Double): Boolean = js.native
  /**
    * Checks whether the given compression mode is supported by this liblzma build
    */
  def modeIsSupported(mode: Double): Boolean = js.native
  /**
    * Returns the approximate memory usage when decoding using rawDecoder for a given filter list
    */
  def rawDecoderMemusage(filters: Filters): Double = js.native
  /**
    * Returns the approximate memory usage when encoding using rawEncoder for a given filter list
    */
  def rawEncoderMemusage(filters: Filters): Double = js.native
  /**
    * Encodes the given string or buffer using the given stream
    */
  def singleStringCoding(stream: Stream, string: String): js.Promise[Buffer] = js.native
  def singleStringCoding(stream: Stream, string: String, onFinish: js.Function2[/* err */ js.Any, /* data */ Buffer, Unit]): js.Promise[Buffer] = js.native
  def singleStringCoding(
    stream: Stream,
    string: String,
    onFinish: js.Function2[/* err */ js.Any, /* data */ Buffer, Unit],
    onProgress: js.Function1[/* progress */ Double, Unit]
  ): js.Promise[Buffer] = js.native
  def singleStringCoding(stream: Stream, string: Buffer): js.Promise[Buffer] = js.native
  def singleStringCoding(stream: Stream, string: Buffer, onFinish: js.Function2[/* err */ js.Any, /* data */ Buffer, Unit]): js.Promise[Buffer] = js.native
  def singleStringCoding(
    stream: Stream,
    string: Buffer,
    onFinish: js.Function2[/* err */ js.Any, /* data */ Buffer, Unit],
    onProgress: js.Function1[/* progress */ Double, Unit]
  ): js.Promise[Buffer] = js.native
  /**
    * Returns the version of the underlying C library
    */
  def versionNumber(): Double = js.native
  /**
    * Returns the version of the underlying C library
    */
  def versionString(): String = js.native
}

