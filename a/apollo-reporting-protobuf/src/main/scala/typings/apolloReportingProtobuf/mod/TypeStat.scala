package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.ITypeStat
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "TypeStat")
@js.native
/**
  * Constructs a new TypeStat.
  * @param [properties] Properties to set
  */
class TypeStat ()
  extends typings.apolloReportingProtobuf.protobufMod.TypeStat {
  def this(properties: ITypeStat) = this()
}
/* static members */
object TypeStat {
  
  /**
    * Creates a new TypeStat instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TypeStat instance
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.create")
  @js.native
  def create(): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.create")
  @js.native
  def create(properties: ITypeStat): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  
  /**
    * Decodes a TypeStat message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.decode")
  @js.native
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.decode")
  @js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  
  /**
    * Decodes a TypeStat message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  
  /**
    * Encodes the specified TypeStat message. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.encode")
  @js.native
  def encode(message: ITypeStat): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.encode")
  @js.native
  def encode(message: ITypeStat, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TypeStat message, length delimited. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITypeStat): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITypeStat, writer: Writer): Writer = js.native
  
  /**
    * Creates a TypeStat message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TypeStat
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.TypeStat = js.native
  
  /**
    * Creates a plain object from a TypeStat message. Also converts values to other types if specified.
    * @param message TypeStat
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.TypeStat): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "TypeStat.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.TypeStat, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TypeStat message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "TypeStat.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
