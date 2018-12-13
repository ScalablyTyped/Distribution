package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "MemStats")
@js.native
class MemStats () extends IMemStats {
  /**
       * Constructs a new MemStats.
       * @param [properties] Properties to set
       */
  def this(properties: IMemStats) = this()
  /** MemStats gcCountDelta. */
  @JSName("gcCountDelta")
  var gcCountDelta_MemStats: scala.Double = js.native
  /** MemStats gcOverheadBytes. */
  @JSName("gcOverheadBytes")
  var gcOverheadBytes_MemStats: scala.Double = js.native
  /** MemStats gcStwNsDelta. */
  @JSName("gcStwNsDelta")
  var gcStwNsDelta_MemStats: scala.Double = js.native
  /** MemStats heapAllocatedBytesDelta. */
  @JSName("heapAllocatedBytesDelta")
  var heapAllocatedBytesDelta_MemStats: scala.Double = js.native
  /** MemStats heapAllocatedBytes. */
  @JSName("heapAllocatedBytes")
  var heapAllocatedBytes_MemStats: scala.Double = js.native
  /** MemStats heapAllocatedObjectsDelta. */
  @JSName("heapAllocatedObjectsDelta")
  var heapAllocatedObjectsDelta_MemStats: scala.Double = js.native
  /** MemStats heapAllocatedObjects. */
  @JSName("heapAllocatedObjects")
  var heapAllocatedObjects_MemStats: scala.Double = js.native
  /** MemStats heapBytes. */
  @JSName("heapBytes")
  var heapBytes_MemStats: scala.Double = js.native
  /** MemStats heapFreedObjectsDelta. */
  @JSName("heapFreedObjectsDelta")
  var heapFreedObjectsDelta_MemStats: scala.Double = js.native
  /** MemStats heapReleasedBytes. */
  @JSName("heapReleasedBytes")
  var heapReleasedBytes_MemStats: scala.Double = js.native
  /** MemStats stackBytes. */
  @JSName("stackBytes")
  var stackBytes_MemStats: scala.Double = js.native
  /** MemStats stackUsedBytes. */
  @JSName("stackUsedBytes")
  var stackUsedBytes_MemStats: scala.Double = js.native
  /** MemStats totalBytes. */
  @JSName("totalBytes")
  var totalBytes_MemStats: scala.Double = js.native
  /**
       * Converts this MemStats to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "MemStats")
@js.native
object MemStats extends js.Object {
  /**
       * Creates a new MemStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns MemStats instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Creates a new MemStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns MemStats instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IMemStats): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Decodes a MemStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns MemStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Decodes a MemStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns MemStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Decodes a MemStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns MemStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Decodes a MemStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns MemStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Decodes a MemStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns MemStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Decodes a MemStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns MemStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Encodes the specified MemStats message. Does not implicitly {@link MemStats.verify|verify} messages.
       * @param message MemStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IMemStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified MemStats message. Does not implicitly {@link MemStats.verify|verify} messages.
       * @param message MemStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IMemStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified MemStats message, length delimited. Does not implicitly {@link MemStats.verify|verify} messages.
       * @param message MemStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IMemStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified MemStats message, length delimited. Does not implicitly {@link MemStats.verify|verify} messages.
       * @param message MemStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IMemStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a MemStats message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns MemStats
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats = js.native
  /**
       * Creates a plain object from a MemStats message. Also converts values to other types if specified.
       * @param message MemStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a MemStats message. Also converts values to other types if specified.
       * @param message MemStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.MemStats,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a MemStats message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

