package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "PathErrorStats")
@js.native
/**
  * Constructs a new PathErrorStats.
  * @param [properties] Properties to set
  */
class PathErrorStats ()
  extends StObject
     with IPathErrorStats {
  def this(properties: IPathErrorStats) = this()
  
  /** PathErrorStats children. */
  @JSName("children")
  var children_PathErrorStats: StringDictionary[IPathErrorStats] = js.native
  
  /** PathErrorStats errorsCount. */
  @JSName("errorsCount")
  var errorsCount_PathErrorStats: Double = js.native
  
  /** PathErrorStats requestsWithErrorsCount. */
  @JSName("requestsWithErrorsCount")
  var requestsWithErrorsCount_PathErrorStats: Double = js.native
  
  /**
    * Converts this PathErrorStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object PathErrorStats {
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "PathErrorStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PathErrorStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PathErrorStats instance
    */
  @scala.inline
  def create(): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PathErrorStats]
  @scala.inline
  def create(properties: IPathErrorStats): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  @scala.inline
  def decode(reader: Reader, length: Double): PathErrorStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PathErrorStats]
  @scala.inline
  def decode(reader: Uint8Array): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): PathErrorStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PathErrorStats]
  
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  
  /**
    * Encodes the specified PathErrorStats message. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: IPathErrorStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: IPathErrorStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PathErrorStats message, length delimited. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: IPathErrorStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: IPathErrorStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PathErrorStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PathErrorStats
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  
  /**
    * Creates a plain object from a PathErrorStats message. Also converts values to other types if specified.
    * @param message PathErrorStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: PathErrorStats): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: PathErrorStats, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PathErrorStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
