package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.IPathErrorStats
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "PathErrorStats")
@js.native
/**
  * Constructs a new PathErrorStats.
  * @param [properties] Properties to set
  */
class PathErrorStats ()
  extends typings.apolloReportingProtobuf.protobufMod.PathErrorStats {
  def this(properties: IPathErrorStats) = this()
}
/* static members */
object PathErrorStats {
  
  /**
    * Creates a new PathErrorStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PathErrorStats instance
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.create")
  @js.native
  def create(): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.create")
  @js.native
  def create(properties: IPathErrorStats): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decode")
  @js.native
  def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decode")
  @js.native
  def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Encodes the specified PathErrorStats message. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.encode")
  @js.native
  def encode(message: IPathErrorStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.encode")
  @js.native
  def encode(message: IPathErrorStats, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PathErrorStats message, length delimited. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPathErrorStats): Writer = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPathErrorStats, writer: Writer): Writer = js.native
  
  /**
    * Creates a PathErrorStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PathErrorStats
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.PathErrorStats = js.native
  
  /**
    * Creates a plain object from a PathErrorStats message. Also converts values to other types if specified.
    * @param message PathErrorStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.PathErrorStats): StringDictionary[js.Any] = js.native
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.toObject")
  @js.native
  def toObject(message: typings.apolloReportingProtobuf.protobufMod.PathErrorStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PathErrorStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("apollo-reporting-protobuf", "PathErrorStats.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
