package typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod.Trace

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IError
import typings.protobufjs.protobufjsMod.IConversionOptions
import typings.protobufjs.protobufjsMod.Reader
import typings.protobufjs.protobufjsMod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an Error. */
@JSImport("apollo-engine-reporting-protobuf", "Trace.Error")
@js.native
/**
  * Constructs a new Error.
  * @param [properties] Properties to set
  */
class Error ()
  extends typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error {
  def this(properties: IError) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Trace.Error")
@js.native
object Error extends js.Object {
  /**
    * Creates a new Error instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Error instance
    */
  def create(): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  def create(properties: IError): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  /**
    * Decodes an Error message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Error
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  def decode(reader: Reader, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  def decode(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  /**
    * Decodes an Error message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Error
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  /**
    * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
    * @param message Error message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IError): Writer = js.native
  def encode(message: IError, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
    * @param message Error message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IError): Writer = js.native
  def encodeDelimited(message: IError, writer: Writer): Writer = js.native
  /**
    * Creates an Error message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Error
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error = js.native
  /**
    * Creates a plain object from an Error message. Also converts values to other types if specified.
    * @param message Error
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.Error,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Error message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

