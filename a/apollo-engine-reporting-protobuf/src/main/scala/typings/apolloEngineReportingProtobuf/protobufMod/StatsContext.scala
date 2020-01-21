package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "StatsContext")
@js.native
/**
  * Constructs a new StatsContext.
  * @param [properties] Properties to set
  */
class StatsContext () extends IStatsContext {
  def this(properties: IStatsContext) = this()
  /** StatsContext clientName. */
  @JSName("clientName")
  var clientName_StatsContext: String = js.native
  /** StatsContext clientReferenceId. */
  @JSName("clientReferenceId")
  var clientReferenceId_StatsContext: String = js.native
  /** StatsContext clientVersion. */
  @JSName("clientVersion")
  var clientVersion_StatsContext: String = js.native
  /**
    * Converts this StatsContext to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "StatsContext")
@js.native
object StatsContext extends js.Object {
  /**
    * Creates a new StatsContext instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StatsContext instance
    */
  def create(): StatsContext = js.native
  def create(properties: IStatsContext): StatsContext = js.native
  /**
    * Decodes a StatsContext message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StatsContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): StatsContext = js.native
  def decode(reader: Reader, length: Double): StatsContext = js.native
  def decode(reader: Uint8Array): StatsContext = js.native
  def decode(reader: Uint8Array, length: Double): StatsContext = js.native
  /**
    * Decodes a StatsContext message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StatsContext
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): StatsContext = js.native
  def decodeDelimited(reader: Uint8Array): StatsContext = js.native
  /**
    * Encodes the specified StatsContext message. Does not implicitly {@link StatsContext.verify|verify} messages.
    * @param message StatsContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStatsContext): Writer = js.native
  def encode(message: IStatsContext, writer: Writer): Writer = js.native
  /**
    * Encodes the specified StatsContext message, length delimited. Does not implicitly {@link StatsContext.verify|verify} messages.
    * @param message StatsContext message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStatsContext): Writer = js.native
  def encodeDelimited(message: IStatsContext, writer: Writer): Writer = js.native
  /**
    * Creates a StatsContext message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StatsContext
    */
  def fromObject(`object`: StringDictionary[js.Any]): StatsContext = js.native
  /**
    * Creates a plain object from a StatsContext message. Also converts values to other types if specified.
    * @param message StatsContext
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: StatsContext): StringDictionary[js.Any] = js.native
  def toObject(message: StatsContext, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StatsContext message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

