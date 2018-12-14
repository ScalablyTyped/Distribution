package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Traces")
@js.native
class Traces () extends ITraces {
  /**
       * Constructs a new Traces.
       * @param [properties] Properties to set
       */
  def this(properties: ITraces) = this()
  /** Traces trace. */
  @JSName("trace")
  var trace_Traces: js.Array[ITrace] = js.native
  /**
       * Converts this Traces to JSON.
       * @returns JSON object
       */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "Traces")
@js.native
object Traces extends js.Object {
  /**
       * Creates a new Traces instance using the specified properties.
       * @param [properties] Properties to set
       * @returns Traces instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Creates a new Traces instance using the specified properties.
       * @param [properties] Properties to set
       * @returns Traces instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraces): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Decodes a Traces message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Traces
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Decodes a Traces message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Traces
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Decodes a Traces message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Traces
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Decodes a Traces message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Traces
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Decodes a Traces message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns Traces
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Decodes a Traces message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns Traces
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Encodes the specified Traces message. Does not implicitly {@link Traces.verify|verify} messages.
       * @param message Traces message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraces): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Traces message. Does not implicitly {@link Traces.verify|verify} messages.
       * @param message Traces message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraces,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Traces message, length delimited. Does not implicitly {@link Traces.verify|verify} messages.
       * @param message Traces message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraces): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Traces message, length delimited. Does not implicitly {@link Traces.verify|verify} messages.
       * @param message Traces message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITraces,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a Traces message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns Traces
       */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces = js.native
  /**
       * Creates a plain object from a Traces message. Also converts values to other types if specified.
       * @param message Traces
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a Traces message. Also converts values to other types if specified.
       * @param message Traces
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Traces,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a Traces message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

