package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Report")
@js.native
/**
  * Constructs a new Report.
  * @param [properties] Properties to set
  */
class Report ()
  extends StObject
     with IReport {
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
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Report")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Report instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Report instance
    */
  @scala.inline
  def create(): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Report]
  @scala.inline
  def create(properties: IReport): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Report]
  
  /**
    * Decodes a Report message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Report
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Report]
  @scala.inline
  def decode(reader: Reader, length: Double): Report = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Report]
  @scala.inline
  def decode(reader: Uint8Array): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Report]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): Report = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Report]
  
  /**
    * Decodes a Report message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Report
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Report]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Report]
  
  /**
    * Encodes the specified Report message. Does not implicitly {@link Report.verify|verify} messages.
    * @param message Report message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IReport): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IReport, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Report message, length delimited. Does not implicitly {@link Report.verify|verify} messages.
    * @param message Report message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IReport): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IReport, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Report message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Report
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Report]
  
  /**
    * Creates a plain object from a Report message. Also converts values to other types if specified.
    * @param message Report
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: Report): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: Report, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Report message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
