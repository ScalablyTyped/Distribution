package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "ContextualizedQueryLatencyStats")
@js.native
class ContextualizedQueryLatencyStats () extends IContextualizedQueryLatencyStats {
  /**
       * Constructs a new ContextualizedQueryLatencyStats.
       * @param [properties] Properties to set
       */
  def this(properties: IContextualizedQueryLatencyStats) = this()
  /**
       * Converts this ContextualizedQueryLatencyStats to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "ContextualizedQueryLatencyStats")
@js.native
object ContextualizedQueryLatencyStats extends js.Object {
  /**
       * Creates a new ContextualizedQueryLatencyStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns ContextualizedQueryLatencyStats instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Creates a new ContextualizedQueryLatencyStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns ContextualizedQueryLatencyStats instance
       */
  def create(
    properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedQueryLatencyStats
  ): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ContextualizedQueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ContextualizedQueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ContextualizedQueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ContextualizedQueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns ContextualizedQueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Decodes a ContextualizedQueryLatencyStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns ContextualizedQueryLatencyStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Encodes the specified ContextualizedQueryLatencyStats message. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
       * @param message ContextualizedQueryLatencyStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedQueryLatencyStats
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ContextualizedQueryLatencyStats message. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
       * @param message ContextualizedQueryLatencyStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedQueryLatencyStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ContextualizedQueryLatencyStats message, length delimited. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
       * @param message ContextualizedQueryLatencyStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedQueryLatencyStats
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ContextualizedQueryLatencyStats message, length delimited. Does not implicitly {@link ContextualizedQueryLatencyStats.verify|verify} messages.
       * @param message ContextualizedQueryLatencyStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedQueryLatencyStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a ContextualizedQueryLatencyStats message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns ContextualizedQueryLatencyStats
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats = js.native
  /**
       * Creates a plain object from a ContextualizedQueryLatencyStats message. Also converts values to other types if specified.
       * @param message ContextualizedQueryLatencyStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a ContextualizedQueryLatencyStats message. Also converts values to other types if specified.
       * @param message ContextualizedQueryLatencyStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedQueryLatencyStats,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a ContextualizedQueryLatencyStats message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

