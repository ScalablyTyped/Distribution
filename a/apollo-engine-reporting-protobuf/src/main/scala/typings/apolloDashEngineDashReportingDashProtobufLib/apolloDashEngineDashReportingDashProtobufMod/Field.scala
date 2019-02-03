package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "Field")
@js.native
/**
  * Constructs a new Field.
  * @param [properties] Properties to set
  */
class Field ()
  extends apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field {
  def this(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IField) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Field")
@js.native
object Field extends js.Object {
  /**
    * Creates a new Field instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Field instance
    */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IField): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  /**
    * Decodes a Field message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  /**
    * Decodes a Field message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Field
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  /**
    * Encodes the specified Field message. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IField): protobufjsLib.protobufjsMod.Writer = js.native
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IField,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Encodes the specified Field message, length delimited. Does not implicitly {@link Field.verify|verify} messages.
    * @param message Field message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IField): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IField,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Creates a Field message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Field
    */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field = js.native
  /**
    * Creates a plain object from a Field message. Also converts values to other types if specified.
    * @param message Field
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.Field,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Verifies a Field message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

