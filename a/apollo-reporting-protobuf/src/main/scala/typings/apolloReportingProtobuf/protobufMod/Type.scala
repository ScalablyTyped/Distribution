package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/dist/protobuf", "Type")
@js.native
/**
  * Constructs a new Type.
  * @param [properties] Properties to set
  */
class Type ()
  extends StObject
     with IType {
  def this(properties: IType) = this()
  
  /** Type field. */
  @JSName("field")
  var field_Type: js.Array[IField] = js.native
  
  /** Type name. */
  @JSName("name")
  var name_Type: String = js.native
  
  /**
    * Converts this Type to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
object Type {
  
  @JSImport("apollo-reporting-protobuf/dist/protobuf", "Type")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Type instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Type instance
    */
  inline def create(): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Type]
  inline def create(properties: IType): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  /**
    * Decodes a Type message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Type
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def decode(reader: Reader, length: Double): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Type]
  inline def decode(reader: Uint8Array): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def decode(reader: Uint8Array, length: Double): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  /**
    * Decodes a Type message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Type
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def decodeDelimited(reader: Uint8Array): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  /**
    * Encodes the specified Type message. Does not implicitly {@link Type.verify|verify} messages.
    * @param message Type message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Type message, length delimited. Does not implicitly {@link Type.verify|verify} messages.
    * @param message Type message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Type message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Type
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  /**
    * Creates a plain object from a Type message. Also converts values to other types if specified.
    * @param message Type
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: Type): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: Type, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Type message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
