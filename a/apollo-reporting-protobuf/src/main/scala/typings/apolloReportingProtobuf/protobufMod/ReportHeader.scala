package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "ReportHeader")
@js.native
/**
  * Constructs a new ReportHeader.
  * @param [properties] Properties to set
  */
class ReportHeader () extends IReportHeader {
  def this(properties: IReportHeader) = this()
  
  /** ReportHeader agentVersion. */
  @JSName("agentVersion")
  var agentVersion_ReportHeader: String = js.native
  
  /** ReportHeader executableSchemaId. */
  @JSName("executableSchemaId")
  var executableSchemaId_ReportHeader: String = js.native
  
  /** ReportHeader hostname. */
  @JSName("hostname")
  var hostname_ReportHeader: String = js.native
  
  /** ReportHeader runtimeVersion. */
  @JSName("runtimeVersion")
  var runtimeVersion_ReportHeader: String = js.native
  
  /** ReportHeader schemaTag. */
  @JSName("schemaTag")
  var schemaTag_ReportHeader: String = js.native
  
  /** ReportHeader serviceVersion. */
  @JSName("serviceVersion")
  var serviceVersion_ReportHeader: String = js.native
  
  /**
    * Converts this ReportHeader to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ReportHeader uname. */
  @JSName("uname")
  var uname_ReportHeader: String = js.native
}
/* static members */
@JSImport("apollo-reporting-protobuf/dist/protobuf", "ReportHeader")
@js.native
object ReportHeader extends js.Object {
  
  /**
    * Creates a new ReportHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReportHeader instance
    */
  def create(): ReportHeader = js.native
  def create(properties: IReportHeader): ReportHeader = js.native
  
  /**
    * Decodes a ReportHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReportHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ReportHeader = js.native
  def decode(reader: Reader, length: Double): ReportHeader = js.native
  def decode(reader: Uint8Array): ReportHeader = js.native
  def decode(reader: Uint8Array, length: Double): ReportHeader = js.native
  
  /**
    * Decodes a ReportHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReportHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ReportHeader = js.native
  def decodeDelimited(reader: Uint8Array): ReportHeader = js.native
  
  /**
    * Encodes the specified ReportHeader message. Does not implicitly {@link ReportHeader.verify|verify} messages.
    * @param message ReportHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IReportHeader): Writer = js.native
  def encode(message: IReportHeader, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ReportHeader message, length delimited. Does not implicitly {@link ReportHeader.verify|verify} messages.
    * @param message ReportHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IReportHeader): Writer = js.native
  def encodeDelimited(message: IReportHeader, writer: Writer): Writer = js.native
  
  /**
    * Creates a ReportHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ReportHeader
    */
  def fromObject(`object`: StringDictionary[js.Any]): ReportHeader = js.native
  
  /**
    * Creates a plain object from a ReportHeader message. Also converts values to other types if specified.
    * @param message ReportHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ReportHeader): StringDictionary[js.Any] = js.native
  def toObject(message: ReportHeader, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ReportHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
