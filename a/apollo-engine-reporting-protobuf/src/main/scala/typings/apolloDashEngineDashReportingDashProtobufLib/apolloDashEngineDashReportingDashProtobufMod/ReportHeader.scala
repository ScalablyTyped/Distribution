package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "ReportHeader")
@js.native
class ReportHeader ()
  extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader {
  /**
       * Constructs a new ReportHeader.
       * @param [properties] Properties to set
       */
  def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IReportHeader) = this()
}

@JSImport("apollo-engine-reporting-protobuf", "ReportHeader")
@js.native
object ReportHeader extends js.Object {
  /**
       * Creates a new ReportHeader instance using the specified properties.
       * @param [properties] Properties to set
       * @returns ReportHeader instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Creates a new ReportHeader instance using the specified properties.
       * @param [properties] Properties to set
       * @returns ReportHeader instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IReportHeader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Decodes a ReportHeader message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ReportHeader
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Decodes a ReportHeader message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ReportHeader
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Decodes a ReportHeader message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ReportHeader
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Decodes a ReportHeader message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns ReportHeader
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Decodes a ReportHeader message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns ReportHeader
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Decodes a ReportHeader message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns ReportHeader
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Encodes the specified ReportHeader message. Does not implicitly {@link ReportHeader.verify|verify} messages.
       * @param message ReportHeader message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IReportHeader): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ReportHeader message. Does not implicitly {@link ReportHeader.verify|verify} messages.
       * @param message ReportHeader message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IReportHeader,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ReportHeader message, length delimited. Does not implicitly {@link ReportHeader.verify|verify} messages.
       * @param message ReportHeader message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IReportHeader): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified ReportHeader message, length delimited. Does not implicitly {@link ReportHeader.verify|verify} messages.
       * @param message ReportHeader message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IReportHeader,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a ReportHeader message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns ReportHeader
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader = js.native
  /**
       * Creates a plain object from a ReportHeader message. Also converts values to other types if specified.
       * @param message ReportHeader
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a ReportHeader message. Also converts values to other types if specified.
       * @param message ReportHeader
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ReportHeader,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a ReportHeader message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

