package typings.apolloUsageReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/usage-reporting-protobuf", "ReferencedFieldsForType")
@js.native
/**
  * Constructs a new ReferencedFieldsForType.
  * @param [properties] Properties to set
  */
open class ReferencedFieldsForType ()
  extends StObject
     with IReferencedFieldsForType {
  def this(properties: IReferencedFieldsForType) = this()
  
  /** ReferencedFieldsForType fieldNames. */
  @JSName("fieldNames")
  var fieldNames_ReferencedFieldsForType: js.Array[String] = js.native
  
  /** ReferencedFieldsForType isInterface. */
  @JSName("isInterface")
  var isInterface_ReferencedFieldsForType: Boolean = js.native
  
  /**
    * Converts this ReferencedFieldsForType to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ReferencedFieldsForType {
  
  @JSImport("@apollo/usage-reporting-protobuf", "ReferencedFieldsForType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ReferencedFieldsForType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ReferencedFieldsForType instance
    */
  inline def create(): ReferencedFieldsForType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ReferencedFieldsForType]
  inline def create(properties: IReferencedFieldsForType): ReferencedFieldsForType = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ReferencedFieldsForType]
  
  inline def decode(reader: js.typedarray.Uint8Array): ReferencedFieldsForType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReferencedFieldsForType]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ReferencedFieldsForType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReferencedFieldsForType]
  /**
    * Decodes a ReferencedFieldsForType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ReferencedFieldsForType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ReferencedFieldsForType = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ReferencedFieldsForType]
  inline def decode(reader: Reader, length: Double): ReferencedFieldsForType = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ReferencedFieldsForType]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ReferencedFieldsForType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReferencedFieldsForType]
  /**
    * Decodes a ReferencedFieldsForType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ReferencedFieldsForType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ReferencedFieldsForType = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ReferencedFieldsForType]
  
  /**
    * Encodes the specified ReferencedFieldsForType message. Does not implicitly {@link ReferencedFieldsForType.verify|verify} messages.
    * @param message ReferencedFieldsForType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IReferencedFieldsForType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IReferencedFieldsForType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ReferencedFieldsForType message, length delimited. Does not implicitly {@link ReferencedFieldsForType.verify|verify} messages.
    * @param message ReferencedFieldsForType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IReferencedFieldsForType): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IReferencedFieldsForType, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a ReferencedFieldsForType message. Also converts values to other types if specified.
    * @param message ReferencedFieldsForType
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ReferencedFieldsForType): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ReferencedFieldsForType, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ReferencedFieldsForType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
