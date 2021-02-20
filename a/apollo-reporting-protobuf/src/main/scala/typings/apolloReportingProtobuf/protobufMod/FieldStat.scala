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

@JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat")
@js.native
/**
  * Constructs a new FieldStat.
  * @param [properties] Properties to set
  */
class FieldStat () extends IFieldStat {
  def this(properties: IFieldStat) = this()
  
  /** FieldStat count. */
  @JSName("count")
  var count_FieldStat: Double = js.native
  
  /** FieldStat errorsCount. */
  @JSName("errorsCount")
  var errorsCount_FieldStat: Double = js.native
  
  /** FieldStat latencyCount. */
  @JSName("latencyCount")
  var latencyCount_FieldStat: js.Array[Double] = js.native
  
  /** FieldStat requestsWithErrorsCount. */
  @JSName("requestsWithErrorsCount")
  var requestsWithErrorsCount_FieldStat: Double = js.native
  
  /** FieldStat returnType. */
  @JSName("returnType")
  var returnType_FieldStat: String = js.native
  
  /**
    * Converts this FieldStat to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object FieldStat {
  
  /**
    * Creates a new FieldStat instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldStat instance
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.create")
  @js.native
  def create(): FieldStat = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.create")
  @js.native
  def create(properties: IFieldStat): FieldStat = js.native
  
  /**
    * Decodes a FieldStat message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.decode")
  @js.native
  def decode(reader: Reader): FieldStat = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.decode")
  @js.native
  def decode(reader: Reader, length: Double): FieldStat = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.decode")
  @js.native
  def decode(reader: Uint8Array): FieldStat = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): FieldStat = js.native
  
  /**
    * Decodes a FieldStat message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): FieldStat = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): FieldStat = js.native
  
  /**
    * Encodes the specified FieldStat message. Does not implicitly {@link FieldStat.verify|verify} messages.
    * @param message FieldStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.encode")
  @js.native
  def encode(message: IFieldStat): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.encode")
  @js.native
  def encode(message: IFieldStat, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified FieldStat message, length delimited. Does not implicitly {@link FieldStat.verify|verify} messages.
    * @param message FieldStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldStat): Writer = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.encodeDelimited")
  @js.native
  def encodeDelimited(message: IFieldStat, writer: Writer): Writer = js.native
  
  /**
    * Creates a FieldStat message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldStat
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): FieldStat = js.native
  
  /**
    * Creates a plain object from a FieldStat message. Also converts values to other types if specified.
    * @param message FieldStat
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.toObject")
  @js.native
  def toObject(message: FieldStat): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.toObject")
  @js.native
  def toObject(message: FieldStat, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a FieldStat message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "FieldStat.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
