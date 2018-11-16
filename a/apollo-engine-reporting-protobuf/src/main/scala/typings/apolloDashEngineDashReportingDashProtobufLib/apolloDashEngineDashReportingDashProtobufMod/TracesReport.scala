package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "TracesReport")
@js.native
class TracesReport () extends ITracesReport {
  /**
       * Constructs a new TracesReport.
       * @param [properties] Properties to set
       */
  def this(properties: ITracesReport) = this()
  /** TracesReport trace. */
  @JSName("trace")
  var trace_TracesReport: js.Array[ITrace] = js.native
  /**
       * Converts this TracesReport to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf", "TracesReport")
@js.native
object TracesReport extends js.Object {
  /**
       * Creates a new TracesReport instance using the specified properties.
       * @param [properties] Properties to set
       * @returns TracesReport instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Creates a new TracesReport instance using the specified properties.
       * @param [properties] Properties to set
       * @returns TracesReport instance
       */
  def create(
    properties: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.ITracesReport
  ): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Decodes a TracesReport message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TracesReport
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Decodes a TracesReport message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TracesReport
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Decodes a TracesReport message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TracesReport
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Decodes a TracesReport message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TracesReport
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Decodes a TracesReport message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns TracesReport
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Decodes a TracesReport message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns TracesReport
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Encodes the specified TracesReport message. Does not implicitly {@link TracesReport.verify|verify} messages.
       * @param message TracesReport message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.ITracesReport
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TracesReport message. Does not implicitly {@link TracesReport.verify|verify} messages.
       * @param message TracesReport message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.ITracesReport,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TracesReport message, length delimited. Does not implicitly {@link TracesReport.verify|verify} messages.
       * @param message TracesReport message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.ITracesReport
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TracesReport message, length delimited. Does not implicitly {@link TracesReport.verify|verify} messages.
       * @param message TracesReport message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.ITracesReport,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a TracesReport message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns TracesReport
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport = js.native
  /**
       * Creates a plain object from a TracesReport message. Also converts values to other types if specified.
       * @param message TracesReport
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a TracesReport message. Also converts values to other types if specified.
       * @param message TracesReport
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TracesReport,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a TracesReport message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

