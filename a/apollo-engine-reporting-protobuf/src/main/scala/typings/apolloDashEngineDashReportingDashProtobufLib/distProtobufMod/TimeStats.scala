package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "TimeStats")
@js.native
class TimeStats () extends ITimeStats {
  /**
       * Constructs a new TimeStats.
       * @param [properties] Properties to set
       */
  def this(properties: ITimeStats) = this()
  /** TimeStats realNsDelta. */
  @JSName("realNsDelta")
  var realNsDelta_TimeStats: scala.Double = js.native
  /** TimeStats sysNsDelta. */
  @JSName("sysNsDelta")
  var sysNsDelta_TimeStats: scala.Double = js.native
  /** TimeStats uptimeNs. */
  @JSName("uptimeNs")
  var uptimeNs_TimeStats: scala.Double = js.native
  /** TimeStats userNsDelta. */
  @JSName("userNsDelta")
  var userNsDelta_TimeStats: scala.Double = js.native
  /**
       * Converts this TimeStats to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "TimeStats")
@js.native
object TimeStats extends js.Object {
  /**
       * Creates a new TimeStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns TimeStats instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Creates a new TimeStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns TimeStats instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITimeStats): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Decodes a TimeStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TimeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Decodes a TimeStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TimeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Decodes a TimeStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TimeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Decodes a TimeStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TimeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Decodes a TimeStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns TimeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Decodes a TimeStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns TimeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Encodes the specified TimeStats message. Does not implicitly {@link TimeStats.verify|verify} messages.
       * @param message TimeStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITimeStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TimeStats message. Does not implicitly {@link TimeStats.verify|verify} messages.
       * @param message TimeStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITimeStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TimeStats message, length delimited. Does not implicitly {@link TimeStats.verify|verify} messages.
       * @param message TimeStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITimeStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TimeStats message, length delimited. Does not implicitly {@link TimeStats.verify|verify} messages.
       * @param message TimeStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITimeStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a TimeStats message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns TimeStats
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats = js.native
  /**
       * Creates a plain object from a TimeStats message. Also converts values to other types if specified.
       * @param message TimeStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a TimeStats message. Also converts values to other types if specified.
       * @param message TimeStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TimeStats,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a TimeStats message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

