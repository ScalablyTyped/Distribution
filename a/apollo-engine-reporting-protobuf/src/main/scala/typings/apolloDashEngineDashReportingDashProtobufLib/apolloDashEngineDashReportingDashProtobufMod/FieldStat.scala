package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "FieldStat")
@js.native
class FieldStat () extends IFieldStat {
  /**
       * Constructs a new FieldStat.
       * @param [properties] Properties to set
       */
  def this(properties: IFieldStat) = this()
  /** FieldStat count. */
  @JSName("count")
  var count_FieldStat: scala.Double = js.native
  /** FieldStat errorsCount. */
  @JSName("errorsCount")
  var errorsCount_FieldStat: scala.Double = js.native
  /** FieldStat latencyCount. */
  @JSName("latencyCount")
  var latencyCount_FieldStat: js.Array[scala.Double] = js.native
  /** FieldStat name. */
  @JSName("name")
  var name_FieldStat: java.lang.String = js.native
  /** FieldStat requestsWithErrorsCount. */
  @JSName("requestsWithErrorsCount")
  var requestsWithErrorsCount_FieldStat: scala.Double = js.native
  /** FieldStat returnType. */
  @JSName("returnType")
  var returnType_FieldStat: java.lang.String = js.native
  /**
       * Converts this FieldStat to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf", "FieldStat")
@js.native
object FieldStat extends js.Object {
  /**
       * Creates a new FieldStat instance using the specified properties.
       * @param [properties] Properties to set
       * @returns FieldStat instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Creates a new FieldStat instance using the specified properties.
       * @param [properties] Properties to set
       * @returns FieldStat instance
       */
  def create(
    properties: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IFieldStat
  ): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Decodes a FieldStat message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns FieldStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Decodes a FieldStat message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns FieldStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Decodes a FieldStat message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns FieldStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Decodes a FieldStat message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns FieldStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Decodes a FieldStat message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns FieldStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Decodes a FieldStat message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns FieldStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Encodes the specified FieldStat message. Does not implicitly {@link FieldStat.verify|verify} messages.
       * @param message FieldStat message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IFieldStat
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified FieldStat message. Does not implicitly {@link FieldStat.verify|verify} messages.
       * @param message FieldStat message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IFieldStat,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified FieldStat message, length delimited. Does not implicitly {@link FieldStat.verify|verify} messages.
       * @param message FieldStat message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IFieldStat
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified FieldStat message, length delimited. Does not implicitly {@link FieldStat.verify|verify} messages.
       * @param message FieldStat message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IFieldStat,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a FieldStat message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns FieldStat
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat = js.native
  /**
       * Creates a plain object from a FieldStat message. Also converts values to other types if specified.
       * @param message FieldStat
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a FieldStat message. Also converts values to other types if specified.
       * @param message FieldStat
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.FieldStat,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a FieldStat message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

