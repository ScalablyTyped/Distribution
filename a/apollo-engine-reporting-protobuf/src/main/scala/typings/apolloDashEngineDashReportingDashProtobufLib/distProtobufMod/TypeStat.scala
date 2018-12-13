package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "TypeStat")
@js.native
class TypeStat () extends ITypeStat {
  /**
       * Constructs a new TypeStat.
       * @param [properties] Properties to set
       */
  def this(properties: ITypeStat) = this()
  /** TypeStat field. */
  @JSName("field")
  var field_TypeStat: js.Array[IFieldStat] = js.native
  /** TypeStat name. */
  @JSName("name")
  var name_TypeStat: java.lang.String = js.native
  /** TypeStat perFieldStat. */
  @JSName("perFieldStat")
  var perFieldStat_TypeStat: ScalablyTyped.runtime.StringDictionary[IFieldStat] = js.native
  /**
       * Converts this TypeStat to JSON.
       * @returns JSON object
       */
  def toJSON(): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "TypeStat")
@js.native
object TypeStat extends js.Object {
  /**
       * Creates a new TypeStat instance using the specified properties.
       * @param [properties] Properties to set
       * @returns TypeStat instance
       */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Creates a new TypeStat instance using the specified properties.
       * @param [properties] Properties to set
       * @returns TypeStat instance
       */
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITypeStat): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Decodes a TypeStat message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TypeStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Decodes a TypeStat message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TypeStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Decodes a TypeStat message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TypeStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Decodes a TypeStat message from the specified reader or buffer.
       * @param reader Reader or buffer to decode from
       * @param [length] Message length if known beforehand
       * @returns TypeStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Decodes a TypeStat message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns TypeStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Decodes a TypeStat message from the specified reader or buffer, length delimited.
       * @param reader Reader or buffer to decode from
       * @returns TypeStat
       * @throws {Error} If the payload is not a reader or valid buffer
       * @throws {$protobuf.util.ProtocolError} If required fields are missing
       */
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Encodes the specified TypeStat message. Does not implicitly {@link TypeStat.verify|verify} messages.
       * @param message TypeStat message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITypeStat): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TypeStat message. Does not implicitly {@link TypeStat.verify|verify} messages.
       * @param message TypeStat message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITypeStat,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TypeStat message, length delimited. Does not implicitly {@link TypeStat.verify|verify} messages.
       * @param message TypeStat message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITypeStat): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Encodes the specified TypeStat message, length delimited. Does not implicitly {@link TypeStat.verify|verify} messages.
       * @param message TypeStat message or plain object to encode
       * @param [writer] Writer to encode to
       * @returns Writer
       */
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ITypeStat,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
       * Creates a TypeStat message from a plain object. Also converts values to their respective internal types.
       * @param object Plain object
       * @returns TypeStat
       */
  def fromObject(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat = js.native
  /**
       * Creates a plain object from a TypeStat message. Also converts values to other types if specified.
       * @param message TypeStat
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Creates a plain object from a TypeStat message. Also converts values to other types if specified.
       * @param message TypeStat
       * @param [options] Conversion options
       * @returns Plain object
       */
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TypeStat,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  /**
       * Verifies a TypeStat message.
       * @param message Plain object to verify
       * @returns `null` if valid, otherwise the reason why it is not
       */
  def verify(message: ScalablyTyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

