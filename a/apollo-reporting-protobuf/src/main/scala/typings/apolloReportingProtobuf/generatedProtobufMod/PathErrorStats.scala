package typings.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/generated/protobuf", "PathErrorStats")
@js.native
/**
  * Constructs a new PathErrorStats.
  * @param [properties] Properties to set
  */
open class PathErrorStats ()
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
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object PathErrorStats {
  
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "PathErrorStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PathErrorStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PathErrorStats instance
    */
  inline def create(): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PathErrorStats]
  inline def create(properties: IPathErrorStats): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  
  inline def decode(reader: js.typedarray.Uint8Array): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PathErrorStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PathErrorStats]
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  inline def decode(reader: Reader, length: Double): PathErrorStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PathErrorStats]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  /**
    * Decodes a PathErrorStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PathErrorStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): PathErrorStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PathErrorStats]
  
  /**
    * Encodes the specified PathErrorStats message. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IPathErrorStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPathErrorStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PathErrorStats message, length delimited. Does not implicitly {@link PathErrorStats.verify|verify} messages.
    * @param message PathErrorStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IPathErrorStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPathErrorStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a PathErrorStats message. Also converts values to other types if specified.
    * @param message PathErrorStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: PathErrorStats): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PathErrorStats, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PathErrorStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
