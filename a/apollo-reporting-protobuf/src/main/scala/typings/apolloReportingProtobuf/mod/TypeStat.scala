package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.ITypeStat
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("apollo-reporting-protobuf", "TypeStat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TypeStat instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TypeStat instance
    */
  inline def create(): typings.apolloReportingProtobuf.protobufMod.TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  inline def create(properties: ITypeStat): typings.apolloReportingProtobuf.protobufMod.TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  
  /**
    * Decodes a TypeStat message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.TypeStat = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.TypeStat = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  
  /**
    * Decodes a TypeStat message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  
  /**
    * Encodes the specified TypeStat message. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITypeStat): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITypeStat, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TypeStat message, length delimited. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITypeStat): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITypeStat, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TypeStat message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TypeStat
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.TypeStat = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.TypeStat]
  
  /**
    * Creates a plain object from a TypeStat message. Also converts values to other types if specified.
    * @param message TypeStat
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.TypeStat): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.TypeStat, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a TypeStat message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
