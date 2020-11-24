package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Report")
@js.native
/**
  * Constructs a new Report.
  * @param [properties] Properties to set
  */
class Report () extends IReport {
  def this(properties: IReport) = this()
  
  /**
    * Converts this Report to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Report tracesPerQuery. */
  @JSName("tracesPerQuery")
  var tracesPerQuery_Report: StringDictionary[ITracesAndStats] = js.native
}
/* static members */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "Report")
@js.native
object Report extends js.Object {
  
  /**
    * Creates a new Report instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Report instance
    */
  def create(): Report = js.native
  def create(properties: IReport): Report = js.native
  
  /**
    * Decodes a Report message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Report
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Report = js.native
  def decode(reader: Reader, length: Double): Report = js.native
  def decode(reader: Uint8Array): Report = js.native
  def decode(reader: Uint8Array, length: Double): Report = js.native
  
  /**
    * Decodes a Report message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Report
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Report = js.native
  def decodeDelimited(reader: Uint8Array): Report = js.native
  
  /**
    * Encodes the specified Report message. Does not implicitly {@link Report.verify|verify} messages.
    * @param message Report message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IReport): Writer = js.native
  def encode(message: IReport, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Report message, length delimited. Does not implicitly {@link Report.verify|verify} messages.
    * @param message Report message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IReport): Writer = js.native
  def encodeDelimited(message: IReport, writer: Writer): Writer = js.native
  
  /**
    * Creates a Report message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Report
    */
  def fromObject(`object`: StringDictionary[js.Any]): Report = js.native
  
  /**
    * Creates a plain object from a Report message. Also converts values to other types if specified.
    * @param message Report
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Report): StringDictionary[js.Any] = js.native
  def toObject(message: Report, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Report message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
