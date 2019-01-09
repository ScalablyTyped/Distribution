package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AloneDecoder extends js.Object {
  val CHECK_CRC32: scala.Double = js.native
  val CHECK_CRC64: scala.Double = js.native
  val CHECK_NONE: scala.Double = js.native
  val CHECK_SHA256: scala.Double = js.native
  val FILTERS_MAX: java.lang.String = js.native
  val FILTER_ARM: java.lang.String = js.native
  val FILTER_ARMTHUMB: java.lang.String = js.native
  val FILTER_DELTA: java.lang.String = js.native
  val FILTER_IA64: java.lang.String = js.native
  val FILTER_LZMA1: java.lang.String = js.native
  val FILTER_LZMA2: java.lang.String = js.native
  val FILTER_POWERPC: java.lang.String = js.native
  val FILTER_SPARC: java.lang.String = js.native
  val FILTER_X86: java.lang.String = js.native
  val LZMA_CONCATENATED: scala.Double = js.native
  val LZMA_TELL_ANY_CHECK: scala.Double = js.native
  val LZMA_TELL_NO_CHECK: scala.Double = js.native
  val LZMA_TELL_UNSUPPORTED_CHECK: scala.Double = js.native
  val MF_BT2: scala.Double = js.native
  val MF_BT3: scala.Double = js.native
  val MF_BT4: scala.Double = js.native
  val MF_HC3: scala.Double = js.native
  val MF_HC4: scala.Double = js.native
  val MODE_FAST: scala.Double = js.native
  val MODE_NORMAL: scala.Double = js.native
  val PRESET_DEFAULT: scala.Double = js.native
  val PRESET_EXTREME: scala.Double = js.native
  val PRESET_LEVEL_MASK: scala.Double = js.native
  val STREAM_HEADER_SIZE: scala.Double = js.native
  val asyncCodeAvailable: scala.Boolean = js.native
  /**
    * Checks whether the given Check ID is supported by this liblzma build
    */
  def checkIsSupported(check: scala.Double): scala.Boolean = js.native
  /**
    * Return the byte size of a check sums
    *
    * @param check Any supported check constant
    */
  def checkSize(check: scala.Double): scala.Double = js.native
  /**
    * Compresses the given string or buffer
    *
    * @param options preset or options
    */
  def compress(buf: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def compress(buf: java.lang.String, options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.AloneEncoderOptions): js.Promise[nodeLib.Buffer] = js.native
  def compress(buf: java.lang.String, options: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  def compress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def compress(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.AloneEncoderOptions): js.Promise[nodeLib.Buffer] = js.native
  def compress(buf: nodeLib.Buffer, options: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Creates a compress stream
    *
    * @param options preset or options
    */
  def compressStream(): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  def compressStream(options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.AloneEncoderOptions): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  def compressStream(options: scala.Double): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns a standard LZMA decoder
    */
  @JSName("createStream")
  def createStream_aloneDecoder(coder: adoneLib.adoneLibStrings.aloneDecoder): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_aloneDecoder(
    coder: adoneLib.adoneLibStrings.aloneDecoder,
    options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.AloneDecoderOptions
  ): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns a standard LZMA encoder
    *
    * @param options preset or options
    */
  @JSName("createStream")
  def createStream_aloneEncoder(coder: adoneLib.adoneLibStrings.aloneEncoder): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_aloneEncoder(
    coder: adoneLib.adoneLibStrings.aloneEncoder,
    options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.AloneEncoderOptions
  ): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_aloneEncoder(coder: adoneLib.adoneLibStrings.aloneEncoder, options: scala.Double): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns a standard LZMA 1/2 (bith .xz and .lzma) decoder with auto detection of file format
    *
    * @param options preset or options
    */
  @JSName("createStream")
  def createStream_autoDecoder(coder: adoneLib.adoneLibStrings.autoDecoder): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_autoDecoder(
    coder: adoneLib.adoneLibStrings.autoDecoder,
    options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.AutoDecoderOptions
  ): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns a standard LZMA2 (.xz) encoder
    *
    * @param options preset or options
    */
  @JSName("createStream")
  def createStream_easyEncoder(coder: adoneLib.adoneLibStrings.easyEncoder): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_easyEncoder(
    coder: adoneLib.adoneLibStrings.easyEncoder,
    options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.EasyEncoderOptions
  ): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_easyEncoder(coder: adoneLib.adoneLibStrings.easyEncoder, options: scala.Double): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns a custom decoder corresponding to lzma_raw_decoder
    */
  @JSName("createStream")
  def createStream_rawDecoder(coder: adoneLib.adoneLibStrings.rawDecoder): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_rawDecoder(
    coder: adoneLib.adoneLibStrings.rawDecoder,
    options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.RawDecoderOptions
  ): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns a custom encoder corresponding to lzma_raw_encoder
    */
  @JSName("createStream")
  def createStream_rawEncoder(coder: adoneLib.adoneLibStrings.rawEncoder): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_rawEncoder(
    coder: adoneLib.adoneLibStrings.rawEncoder,
    options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.RawEncoderOptions
  ): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns a custom decoder corresponding to lzma_stream_decoder
    */
  @JSName("createStream")
  def createStream_streamDecoder(coder: adoneLib.adoneLibStrings.streamDecoder): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_streamDecoder(
    coder: adoneLib.adoneLibStrings.streamDecoder,
    options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.StreamDecoderOptions
  ): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns a custom encoder corresponding to lzma_stream_encoder
    */
  @JSName("createStream")
  def createStream_streamEncoder(coder: adoneLib.adoneLibStrings.streamEncoder): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  @JSName("createStream")
  def createStream_streamEncoder(
    coder: adoneLib.adoneLibStrings.streamEncoder,
    options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.StreamEncoderOptions
  ): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Decompresses the given buffer
    */
  def decompress(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def decompress(buf: nodeLib.Buffer, options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.AloneDecoderOptions): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Creates a decompress stream
    *
    * @param options preset or options
    */
  def decompressStream(): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  def decompressStream(options: adoneLib.adoneNs.compressorNs.INs.lzmaNs.AloneDecoderOptions): adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream = js.native
  /**
    * Returns the approximate memory usage when decoding using easyDecoder for a given preset
    */
  def easyDecoderMemusage(preset: scala.Double): scala.Double = js.native
  /**
    * Returns the approximate memory usage when encoding using easyEncoder for a given preset
    */
  def easyEncoderMemusage(preset: scala.Double): scala.Double = js.native
  /**
    * Checks whether the given encoder filter is supported
    */
  def filterDecoderIsSupported(decoder: java.lang.String): scala.Boolean = js.native
  /**
    * Checks whether the given encoder filter is supported
    */
  def filterEncoderIsSupported(encoder: java.lang.String): scala.Boolean = js.native
  /**
    * Checks whether the given match finder is supported by this liblzma build
    */
  def mfIsSupported(mf: scala.Double): scala.Boolean = js.native
  /**
    * Checks whether the given compression mode is supported by this liblzma build
    */
  def modeIsSupported(mode: scala.Double): scala.Boolean = js.native
  /**
    * Returns the approximate memory usage when decoding using rawDecoder for a given filter list
    */
  def rawDecoderMemusage(filters: adoneLib.adoneNs.compressorNs.INs.lzmaNs.Filters): scala.Double = js.native
  /**
    * Returns the approximate memory usage when encoding using rawEncoder for a given filter list
    */
  def rawEncoderMemusage(filters: adoneLib.adoneNs.compressorNs.INs.lzmaNs.Filters): scala.Double = js.native
  /**
    * Encodes the given string or buffer using the given stream
    */
  def singleStringCoding(stream: adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream, string: java.lang.String): js.Promise[nodeLib.Buffer] = js.native
  def singleStringCoding(
    stream: adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream,
    string: java.lang.String,
    onFinish: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): js.Promise[nodeLib.Buffer] = js.native
  def singleStringCoding(
    stream: adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream,
    string: java.lang.String,
    onFinish: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit],
    onProgress: js.Function1[/* progress */ scala.Double, scala.Unit]
  ): js.Promise[nodeLib.Buffer] = js.native
  def singleStringCoding(stream: adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream, string: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def singleStringCoding(
    stream: adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream,
    string: nodeLib.Buffer,
    onFinish: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit]
  ): js.Promise[nodeLib.Buffer] = js.native
  def singleStringCoding(
    stream: adoneLib.adoneNs.compressorNs.INs.lzmaNs.Stream,
    string: nodeLib.Buffer,
    onFinish: js.Function2[/* err */ js.Any, /* data */ nodeLib.Buffer, scala.Unit],
    onProgress: js.Function1[/* progress */ scala.Double, scala.Unit]
  ): js.Promise[nodeLib.Buffer] = js.native
  /**
    * Returns the version of the underlying C library
    */
  def versionNumber(): scala.Double = js.native
  /**
    * Returns the version of the underlying C library
    */
  def versionString(): java.lang.String = js.native
}

