package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "ContextualizedTypeStats")
@js.native
class ContextualizedTypeStats ()
  extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats {
  /**
       * Constructs a new ContextualizedTypeStats.
       * @param [properties] Properties to set
       */
  def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedTypeStats) = this()
}

@JSImport("apollo-engine-reporting-protobuf", "ContextualizedTypeStats")
@js.native
object ContextualizedTypeStats extends js.Object {
  /**
       * Creates a new ContextualizedTypeStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns ContextualizedTypeStats instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Creates a new ContextualizedTypeStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns ContextualizedTypeStats instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedTypeStats): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Decodes a ContextualizedTypeStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ContextualizedTypeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Decodes a ContextualizedTypeStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ContextualizedTypeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Decodes a ContextualizedTypeStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ContextualizedTypeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Decodes a ContextualizedTypeStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ContextualizedTypeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Decodes a ContextualizedTypeStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns ContextualizedTypeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Decodes a ContextualizedTypeStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns ContextualizedTypeStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Encodes the specified ContextualizedTypeStats message. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
       * @param message ContextualizedTypeStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedTypeStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ContextualizedTypeStats message. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
       * @param message ContextualizedTypeStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedTypeStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ContextualizedTypeStats message, length delimited. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
       * @param message ContextualizedTypeStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedTypeStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ContextualizedTypeStats message, length delimited. Does not implicitly {@link ContextualizedTypeStats.verify|verify} messages.
       * @param message ContextualizedTypeStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IContextualizedTypeStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a ContextualizedTypeStats message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns ContextualizedTypeStats
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats = js.native
  /**
       * Creates a plain object from a ContextualizedTypeStats message. Also converts values to other types if specified.
       * @param message ContextualizedTypeStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a ContextualizedTypeStats message. Also converts values to other types if specified.
       * @param message ContextualizedTypeStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ContextualizedTypeStats,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a ContextualizedTypeStats message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

