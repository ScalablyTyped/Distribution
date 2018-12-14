package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "QueryStats")
@js.native
class QueryStats ()
  extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats {
  /**
       * Constructs a new QueryStats.
       * @param [properties] Properties to set
       */
  def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IQueryStats) = this()
}

@JSImport("apollo-engine-reporting-protobuf", "QueryStats")
@js.native
object QueryStats extends js.Object {
  /**
       * Creates a new QueryStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns QueryStats instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Creates a new QueryStats instance using the specified properties.
       * @param [properties] Properties to set
       * @returns QueryStats instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IQueryStats): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Decodes a QueryStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns QueryStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Decodes a QueryStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns QueryStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Decodes a QueryStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns QueryStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Decodes a QueryStats message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns QueryStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Decodes a QueryStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns QueryStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Decodes a QueryStats message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns QueryStats
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Encodes the specified QueryStats message. Does not implicitly {@link QueryStats.verify|verify} messages.
       * @param message QueryStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IQueryStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified QueryStats message. Does not implicitly {@link QueryStats.verify|verify} messages.
       * @param message QueryStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IQueryStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified QueryStats message, length delimited. Does not implicitly {@link QueryStats.verify|verify} messages.
       * @param message QueryStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IQueryStats): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified QueryStats message, length delimited. Does not implicitly {@link QueryStats.verify|verify} messages.
       * @param message QueryStats message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IQueryStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a QueryStats message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns QueryStats
       */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats = js.native
  /**
       * Creates a plain object from a QueryStats message. Also converts values to other types if specified.
       * @param message QueryStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a QueryStats message. Also converts values to other types if specified.
       * @param message QueryStats
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.QueryStats,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a QueryStats message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

