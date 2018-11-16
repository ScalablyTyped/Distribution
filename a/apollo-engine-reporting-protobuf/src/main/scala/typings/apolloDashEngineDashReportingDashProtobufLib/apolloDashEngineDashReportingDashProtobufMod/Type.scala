package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "Type")
@js.native
class Type () extends IType {
  /**
       * Constructs a new Type.
       * @param [properties] Properties to set
       */
  def this(properties: IType) = this()
  /** Type field. */
  @JSName("field")
  var field_Type: js.Array[IField] = js.native
  /** Type name. */
  @JSName("name")
  var name_Type: java.lang.String = js.native
  /**
       * Converts this Type to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf", "Type")
@js.native
object Type extends js.Object {
  /**
       * Creates a new Type instance using the specified properties.
       * @param [properties] Properties to set
       * @returns Type instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Creates a new Type instance using the specified properties.
       * @param [properties] Properties to set
       * @returns Type instance
       */
  def create(
    properties: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IType
  ): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Decodes a Type message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Type
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Decodes a Type message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Type
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Decodes a Type message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Type
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Decodes a Type message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns Type
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Decodes a Type message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns Type
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Decodes a Type message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns Type
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Encodes the specified Type message. Does not implicitly {@link Type.verify|verify} messages.
       * @param message Type message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IType
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Type message. Does not implicitly {@link Type.verify|verify} messages.
       * @param message Type message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IType,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Type message, length delimited. Does not implicitly {@link Type.verify|verify} messages.
       * @param message Type message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IType
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified Type message, length delimited. Does not implicitly {@link Type.verify|verify} messages.
       * @param message Type message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.IType,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a Type message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns Type
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type = js.native
  /**
       * Creates a plain object from a Type message. Also converts values to other types if specified.
       * @param message Type
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a Type message. Also converts values to other types if specified.
       * @param message Type
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Type,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a Type message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

