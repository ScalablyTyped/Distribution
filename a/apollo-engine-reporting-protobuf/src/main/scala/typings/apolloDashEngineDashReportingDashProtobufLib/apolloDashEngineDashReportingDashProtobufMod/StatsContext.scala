package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "StatsContext")
@js.native
class StatsContext () extends IStatsContext {
  /**
       * Constructs a new StatsContext.
       * @param [properties] Properties to set
       */
  def this(properties: IStatsContext) = this()
  /** StatsContext clientName. */
  @JSName("clientName")
  var clientName_StatsContext: java.lang.String = js.native
  /** StatsContext clientReferenceId. */
  @JSName("clientReferenceId")
  var clientReferenceId_StatsContext: java.lang.String = js.native
  /** StatsContext clientVersion. */
  @JSName("clientVersion")
  var clientVersion_StatsContext: java.lang.String = js.native
  /**
       * Converts this StatsContext to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf", "StatsContext")
@js.native
object StatsContext extends js.Object {
  /**
       * Creates a new StatsContext instance using the specified properties.
       * @param [properties] Properties to set
       * @returns StatsContext instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Creates a new StatsContext instance using the specified properties.
       * @param [properties] Properties to set
       * @returns StatsContext instance
       */
  def create(
    properties: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IStatsContext
  ): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Decodes a StatsContext message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns StatsContext
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Decodes a StatsContext message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns StatsContext
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Decodes a StatsContext message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns StatsContext
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Decodes a StatsContext message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns StatsContext
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Decodes a StatsContext message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns StatsContext
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Decodes a StatsContext message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns StatsContext
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Encodes the specified StatsContext message. Does not implicitly {@link StatsContext.verify|verify} messages.
       * @param message StatsContext message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IStatsContext
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified StatsContext message. Does not implicitly {@link StatsContext.verify|verify} messages.
       * @param message StatsContext message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IStatsContext,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified StatsContext message, length delimited. Does not implicitly {@link StatsContext.verify|verify} messages.
       * @param message StatsContext message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IStatsContext
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified StatsContext message, length delimited. Does not implicitly {@link StatsContext.verify|verify} messages.
       * @param message StatsContext message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IStatsContext,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a StatsContext message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns StatsContext
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext = js.native
  /**
       * Creates a plain object from a StatsContext message. Also converts values to other types if specified.
       * @param message StatsContext
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a StatsContext message. Also converts values to other types if specified.
       * @param message StatsContext
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.StatsContext,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a StatsContext message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

