package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "PathErrorStats")
@js.native
class PathErrorStats () extends IPathErrorStats {
  /**
       * Constructs a new PathErrorStats.
       * @param [properties] Properties to set
       */
  def this(properties: IPathErrorStats) = this()
  /** PathErrorStats children. */
  @JSName("children")
  var children_PathErrorStats: org.scalablytyped.runtime.StringDictionary[IPathErrorStats] = js.native
  /** PathErrorStats errorsCount. */
  @JSName("errorsCount")
  var errorsCount_PathErrorStats: scala.Double = js.native
  /** PathErrorStats requestsWithErrorsCount. */
  @JSName("requestsWithErrorsCount")
  var requestsWithErrorsCount_PathErrorStats: scala.Double = js.native
  /**
       * Converts this PathErrorStats to JSON.
       * @returns JSON object
       */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "PathErrorStats")
@js.native
object PathErrorStats extends js.Object {
  /**
       * Creates a new PathErrorStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns PathErrorStats instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Creates a new PathErrorStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns PathErrorStats instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IPathErrorStats): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Decodes a PathErrorStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns PathErrorStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Decodes a PathErrorStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns PathErrorStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Decodes a PathErrorStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns PathErrorStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Decodes a PathErrorStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns PathErrorStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Decodes a PathErrorStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns PathErrorStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Decodes a PathErrorStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns PathErrorStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Encodes the specified PathErrorStats message. Does not implicitly {@link PathErrorStats.verify|verify} messages.
       * @param message PathErrorStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IPathErrorStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified PathErrorStats message. Does not implicitly {@link PathErrorStats.verify|verify} messages.
       * @param message PathErrorStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IPathErrorStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified PathErrorStats message, length delimited. Does not implicitly {@link PathErrorStats.verify|verify} messages.
       * @param message PathErrorStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IPathErrorStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified PathErrorStats message, length delimited. Does not implicitly {@link PathErrorStats.verify|verify} messages.
       * @param message PathErrorStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IPathErrorStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a PathErrorStats message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns PathErrorStats
       */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats = js.native
  /**
       * Creates a plain object from a PathErrorStats message. Also converts values to other types if specified.
       * @param message PathErrorStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a PathErrorStats message. Also converts values to other types if specified.
       * @param message PathErrorStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.PathErrorStats,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a PathErrorStats message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

