package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "TypeStat")
@js.native
/**
  * Constructs a new TypeStat.
  * @param [properties] Properties to set
  */
class TypeStat ()
  extends StObject
     with ITypeStat {
  def this(properties: ITypeStat) = this()
  
  /** TypeStat perFieldStat. */
  @JSName("perFieldStat")
  var perFieldStat_TypeStat: StringDictionary[IFieldStat] = js.native
  
  /**
    * Converts this TypeStat to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object TypeStat {
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "TypeStat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TypeStat instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TypeStat instance
    */
  @scala.inline
  def create(): TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TypeStat]
  @scala.inline
  def create(properties: ITypeStat): TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TypeStat]
  
  /**
    * Decodes a TypeStat message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decode(reader: Reader): TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TypeStat]
  @scala.inline
  def decode(reader: Reader, length: Double): TypeStat = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TypeStat]
  @scala.inline
  def decode(reader: Uint8Array): TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TypeStat]
  @scala.inline
  def decode(reader: Uint8Array, length: Double): TypeStat = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TypeStat]
  
  /**
    * Decodes a TypeStat message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @scala.inline
  def decodeDelimited(reader: Reader): TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TypeStat]
  @scala.inline
  def decodeDelimited(reader: Uint8Array): TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TypeStat]
  
  /**
    * Encodes the specified TypeStat message. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encode(message: ITypeStat): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encode(message: ITypeStat, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TypeStat message, length delimited. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @scala.inline
  def encodeDelimited(message: ITypeStat): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  @scala.inline
  def encodeDelimited(message: ITypeStat, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TypeStat message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TypeStat
    */
  @scala.inline
  def fromObject(`object`: StringDictionary[js.Any]): TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TypeStat]
  
  /**
    * Creates a plain object from a TypeStat message. Also converts values to other types if specified.
    * @param message TypeStat
    * @param [options] Conversion options
    * @returns Plain object
    */
  @scala.inline
  def toObject(message: TypeStat): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def toObject(message: TypeStat, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TypeStat message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @scala.inline
  def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
