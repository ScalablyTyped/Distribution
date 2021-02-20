package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
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
object Report {
  
  /**
    * Creates a new Report instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Report instance
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.create")
  @js.native
  def create(): Report = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.create")
  @js.native
  def create(properties: IReport): Report = js.native
  
  /**
    * Decodes a Report message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Report
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.decode")
  @js.native
  def decode(reader: Reader): Report = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.decode")
  @js.native
  def decode(reader: Reader, length: Double): Report = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.decode")
  @js.native
  def decode(reader: Uint8Array): Report = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Report = js.native
  
  /**
    * Decodes a Report message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Report
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Report = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Report = js.native
  
  /**
    * Encodes the specified Report message. Does not implicitly {@link Report.verify|verify} messages.
    * @param message Report message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.encode")
  @js.native
  def encode(message: IReport): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.encode")
  @js.native
  def encode(message: IReport, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Report message, length delimited. Does not implicitly {@link Report.verify|verify} messages.
    * @param message Report message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.encodeDelimited")
  @js.native
  def encodeDelimited(message: IReport): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.encodeDelimited")
  @js.native
  def encodeDelimited(message: IReport, writer: Writer): Writer = js.native
  
  /**
    * Creates a Report message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Report
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Report = js.native
  
  /**
    * Creates a plain object from a Report message. Also converts values to other types if specified.
    * @param message Report
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.toObject")
  @js.native
  def toObject(message: Report): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.toObject")
  @js.native
  def toObject(message: Report, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Report message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
