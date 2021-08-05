package typings.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloProtobufjs.mod.IConversionOptions
import typings.apolloProtobufjs.mod.Reader
import typings.apolloProtobufjs.mod.Writer
import typings.apolloReportingProtobuf.protobufMod.ITrace
import typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.IValues
import typings.apolloReportingProtobuf.protobufMod.Trace.ICachePolicy
import typings.apolloReportingProtobuf.protobufMod.Trace.IDetails
import typings.apolloReportingProtobuf.protobufMod.Trace.IError
import typings.apolloReportingProtobuf.protobufMod.Trace.IHTTP
import typings.apolloReportingProtobuf.protobufMod.Trace.ILocation
import typings.apolloReportingProtobuf.protobufMod.Trace.INode
import typings.apolloReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFetchNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IFlattenNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IParallelNode
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.IResponsePathElement
import typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ISequenceNode
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "Trace")
@js.native
/**
  * Constructs a new Trace.
  * @param [properties] Properties to set
  */
class Trace ()
  extends typings.apolloReportingProtobuf.protobufMod.Trace {
  def this(properties: ITrace) = this()
}
/* static members */
object Trace {
  
  @JSImport("apollo-reporting-protobuf", "Trace")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a CachePolicy. */
  @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy")
  @js.native
  /**
    * Constructs a new CachePolicy.
    * @param [properties] Properties to set
    */
  class CachePolicy ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy {
    def this(properties: ICachePolicy) = this()
  }
  object CachePolicy {
    
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /** Scope enum. */
    @JSImport("apollo-reporting-protobuf", "Trace.CachePolicy.Scope")
    @js.native
    object Scope extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope & Double] = js.native
      
      /* 2 */ val PRIVATE: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PRIVATE & Double = js.native
      
      /* 1 */ val PUBLIC: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PUBLIC & Double = js.native
      
      /* 0 */ val UNKNOWN: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.UNKNOWN & Double = js.native
    }
    
    /**
      * Creates a new CachePolicy instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CachePolicy instance
      */
    /* static member */
    inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    inline def create(properties: ICachePolicy): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    
    /**
      * Decodes a CachePolicy message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    
    /**
      * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CachePolicy
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    
    /**
      * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ICachePolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ICachePolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
      * @param message CachePolicy message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ICachePolicy): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ICachePolicy, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CachePolicy
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy]
    
    /**
      * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
      * @param message CachePolicy
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(
      message: typings.apolloReportingProtobuf.protobufMod.Trace.CachePolicy,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a CachePolicy message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Details. */
  @JSImport("apollo-reporting-protobuf", "Trace.Details")
  @js.native
  /**
    * Constructs a new Details.
    * @param [properties] Properties to set
    */
  class Details ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.Details {
    def this(properties: IDetails) = this()
  }
  object Details {
    
    @JSImport("apollo-reporting-protobuf", "Trace.Details")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Details instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Details instance
      */
    /* static member */
    inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.Details = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    inline def create(properties: IDetails): typings.apolloReportingProtobuf.protobufMod.Trace.Details = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    
    /**
      * Decodes a Details message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Details = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Details = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Details = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Details = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    
    /**
      * Decodes a Details message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Details
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Details = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Details = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    
    /**
      * Encodes the specified Details message. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IDetails): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IDetails, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Details message, length delimited. Does not implicitly {@link Trace.Details.verify|verify} messages.
      * @param message Details message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IDetails): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IDetails, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Details message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Details
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.Details = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Details]
    
    /**
      * Creates a plain object from a Details message. Also converts values to other types if specified.
      * @param message Details
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Details): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Details, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Details message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents an Error. */
  @JSImport("apollo-reporting-protobuf", "Trace.Error")
  @js.native
  /**
    * Constructs a new Error.
    * @param [properties] Properties to set
    */
  class Error ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.Error {
    def this(properties: IError) = this()
  }
  object Error {
    
    @JSImport("apollo-reporting-protobuf", "Trace.Error")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Error instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Error instance
      */
    /* static member */
    inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    inline def create(properties: IError): typings.apolloReportingProtobuf.protobufMod.Trace.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    
    /**
      * Decodes an Error message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    
    /**
      * Decodes an Error message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Error
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    
    /**
      * Encodes the specified Error message. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IError): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IError, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Error message, length delimited. Does not implicitly {@link Trace.Error.verify|verify} messages.
      * @param message Error message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IError): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IError, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates an Error message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Error
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Error]
    
    /**
      * Creates a plain object from an Error message. Also converts values to other types if specified.
      * @param message Error
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Error): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Error, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies an Error message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a HTTP. */
  @JSImport("apollo-reporting-protobuf", "Trace.HTTP")
  @js.native
  /**
    * Constructs a new HTTP.
    * @param [properties] Properties to set
    */
  class HTTP ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.HTTP {
    def this(properties: IHTTP) = this()
  }
  object HTTP {
    
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP")
    @js.native
    val ^ : js.Any = js.native
    
    /** Method enum. */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Method")
    @js.native
    object Method extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method & Double] = js.native
      
      /* 8 */ val CONNECT: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.CONNECT & Double = js.native
      
      /* 6 */ val DELETE: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.DELETE & Double = js.native
      
      /* 2 */ val GET: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.GET & Double = js.native
      
      /* 3 */ val HEAD: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.HEAD & Double = js.native
      
      /* 1 */ val OPTIONS: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.OPTIONS & Double = js.native
      
      /* 9 */ val PATCH: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.PATCH & Double = js.native
      
      /* 4 */ val POST: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.POST & Double = js.native
      
      /* 5 */ val PUT: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.PUT & Double = js.native
      
      /* 7 */ val TRACE: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.TRACE & Double = js.native
      
      /* 0 */ val UNKNOWN: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Method.UNKNOWN & Double = js.native
    }
    
    /** Represents a Values. */
    @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values")
    @js.native
    /**
      * Constructs a new Values.
      * @param [properties] Properties to set
      */
    class Values ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values {
      def this(properties: IValues) = this()
    }
    object Values {
      
      @JSImport("apollo-reporting-protobuf", "Trace.HTTP.Values")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new Values instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Values instance
        */
      /* static member */
      inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      inline def create(properties: IValues): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      
      /**
        * Decodes a Values message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      
      /**
        * Decodes a Values message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Values
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      
      /**
        * Encodes the specified Values message. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IValues): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IValues, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified Values message, length delimited. Does not implicitly {@link Trace.HTTP.Values.verify|verify} messages.
        * @param message Values message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IValues): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IValues, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a Values message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Values
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values]
      
      /**
        * Creates a plain object from a Values message. Also converts values to other types if specified.
        * @param message Values
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP.Values,
        options: IConversionOptions
      ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a Values message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new HTTP instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HTTP instance
      */
    /* static member */
    inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    inline def create(properties: IHTTP): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    
    /**
      * Decodes a HTTP message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    
    /**
      * Decodes a HTTP message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HTTP
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    
    /**
      * Encodes the specified HTTP message. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IHTTP): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IHTTP, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified HTTP message, length delimited. Does not implicitly {@link Trace.HTTP.verify|verify} messages.
      * @param message HTTP message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IHTTP): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IHTTP, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a HTTP message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HTTP
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.HTTP = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.HTTP]
    
    /**
      * Creates a plain object from a HTTP message. Also converts values to other types if specified.
      * @param message HTTP
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.HTTP, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a HTTP message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Location. */
  @JSImport("apollo-reporting-protobuf", "Trace.Location")
  @js.native
  /**
    * Constructs a new Location.
    * @param [properties] Properties to set
    */
  class Location ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.Location {
    def this(properties: ILocation) = this()
  }
  object Location {
    
    @JSImport("apollo-reporting-protobuf", "Trace.Location")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Location instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Location instance
      */
    /* static member */
    inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    inline def create(properties: ILocation): typings.apolloReportingProtobuf.protobufMod.Trace.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    
    /**
      * Decodes a Location message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Location = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    
    /**
      * Decodes a Location message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Location
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    
    /**
      * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
      * @param message Location message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: ILocation): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: ILocation, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Location message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Location
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.Location = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Location]
    
    /**
      * Creates a plain object from a Location message. Also converts values to other types if specified.
      * @param message Location
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Location): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Location, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Location message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a Node. */
  @JSImport("apollo-reporting-protobuf", "Trace.Node")
  @js.native
  /**
    * Constructs a new Node.
    * @param [properties] Properties to set
    */
  class Node ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.Node {
    def this(properties: INode) = this()
  }
  object Node {
    
    @JSImport("apollo-reporting-protobuf", "Trace.Node")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Node instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Node instance
      */
    /* static member */
    inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    inline def create(properties: INode): typings.apolloReportingProtobuf.protobufMod.Trace.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    
    /**
      * Decodes a Node message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    
    /**
      * Decodes a Node message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Node
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    
    /**
      * Encodes the specified Node message. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: INode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: INode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified Node message, length delimited. Does not implicitly {@link Trace.Node.verify|verify} messages.
      * @param message Node message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: INode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: INode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a Node message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Node
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.Node]
    
    /**
      * Creates a plain object from a Node message. Also converts values to other types if specified.
      * @param message Node
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Node): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.Node, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a Node message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a QueryPlanNode. */
  @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode")
  @js.native
  /**
    * Constructs a new QueryPlanNode.
    * @param [properties] Properties to set
    */
  class QueryPlanNode ()
    extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode {
    def this(properties: IQueryPlanNode) = this()
  }
  object QueryPlanNode {
    
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a FetchNode. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode")
    @js.native
    /**
      * Constructs a new FetchNode.
      * @param [properties] Properties to set
      */
    class FetchNode ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode {
      def this(properties: IFetchNode) = this()
    }
    object FetchNode {
      
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FetchNode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new FetchNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FetchNode instance
        */
      /* static member */
      inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      inline def create(properties: IFetchNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      
      /**
        * Decodes a FetchNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      
      /**
        * Decodes a FetchNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FetchNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      
      /**
        * Encodes the specified FetchNode message. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IFetchNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IFetchNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified FetchNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FetchNode.verify|verify} messages.
        * @param message FetchNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IFetchNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IFetchNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a FetchNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FetchNode
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode]
      
      /**
        * Creates a plain object from a FetchNode message. Also converts values to other types if specified.
        * @param message FetchNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FetchNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a FetchNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a FlattenNode. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode")
    @js.native
    /**
      * Constructs a new FlattenNode.
      * @param [properties] Properties to set
      */
    class FlattenNode ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode {
      def this(properties: IFlattenNode) = this()
    }
    object FlattenNode {
      
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.FlattenNode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new FlattenNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns FlattenNode instance
        */
      /* static member */
      inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      inline def create(properties: IFlattenNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      
      /**
        * Decodes a FlattenNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      
      /**
        * Decodes a FlattenNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns FlattenNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      
      /**
        * Encodes the specified FlattenNode message. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IFlattenNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IFlattenNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified FlattenNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.FlattenNode.verify|verify} messages.
        * @param message FlattenNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IFlattenNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IFlattenNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a FlattenNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns FlattenNode
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode]
      
      /**
        * Creates a plain object from a FlattenNode message. Also converts values to other types if specified.
        * @param message FlattenNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.FlattenNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a FlattenNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ParallelNode. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode")
    @js.native
    /**
      * Constructs a new ParallelNode.
      * @param [properties] Properties to set
      */
    class ParallelNode ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode {
      def this(properties: IParallelNode) = this()
    }
    object ParallelNode {
      
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ParallelNode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ParallelNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ParallelNode instance
        */
      /* static member */
      inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      inline def create(properties: IParallelNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      
      /**
        * Decodes a ParallelNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      
      /**
        * Decodes a ParallelNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ParallelNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      
      /**
        * Encodes the specified ParallelNode message. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IParallelNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IParallelNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ParallelNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ParallelNode.verify|verify} messages.
        * @param message ParallelNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IParallelNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IParallelNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ParallelNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ParallelNode
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode]
      
      /**
        * Creates a plain object from a ParallelNode message. Also converts values to other types if specified.
        * @param message ParallelNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ParallelNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a ParallelNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a ResponsePathElement. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement")
    @js.native
    /**
      * Constructs a new ResponsePathElement.
      * @param [properties] Properties to set
      */
    class ResponsePathElement ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement {
      def this(properties: IResponsePathElement) = this()
    }
    object ResponsePathElement {
      
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.ResponsePathElement")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new ResponsePathElement instance using the specified properties.
        * @param [properties] Properties to set
        * @returns ResponsePathElement instance
        */
      /* static member */
      inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      inline def create(properties: IResponsePathElement): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      
      /**
        * Decodes a ResponsePathElement message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns ResponsePathElement
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      
      /**
        * Encodes the specified ResponsePathElement message. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IResponsePathElement): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IResponsePathElement, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified ResponsePathElement message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.ResponsePathElement.verify|verify} messages.
        * @param message ResponsePathElement message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IResponsePathElement): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IResponsePathElement, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a ResponsePathElement message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns ResponsePathElement
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement]
      
      /**
        * Creates a plain object from a ResponsePathElement message. Also converts values to other types if specified.
        * @param message ResponsePathElement
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.ResponsePathElement,
        options: IConversionOptions
      ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a ResponsePathElement message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /** Represents a SequenceNode. */
    @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode")
    @js.native
    /**
      * Constructs a new SequenceNode.
      * @param [properties] Properties to set
      */
    class SequenceNode ()
      extends typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode {
      def this(properties: ISequenceNode) = this()
    }
    object SequenceNode {
      
      @JSImport("apollo-reporting-protobuf", "Trace.QueryPlanNode.SequenceNode")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new SequenceNode instance using the specified properties.
        * @param [properties] Properties to set
        * @returns SequenceNode instance
        */
      /* static member */
      inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      inline def create(properties: ISequenceNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      
      /**
        * Decodes a SequenceNode message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      
      /**
        * Decodes a SequenceNode message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns SequenceNode
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      
      /**
        * Encodes the specified SequenceNode message. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: ISequenceNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: ISequenceNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified SequenceNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.SequenceNode.verify|verify} messages.
        * @param message SequenceNode message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: ISequenceNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: ISequenceNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a SequenceNode message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns SequenceNode
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode]
      
      /**
        * Creates a plain object from a SequenceNode message. Also converts values to other types if specified.
        * @param message SequenceNode
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(
        message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode.SequenceNode,
        options: IConversionOptions
      ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a SequenceNode message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new QueryPlanNode instance using the specified properties.
      * @param [properties] Properties to set
      * @returns QueryPlanNode instance
      */
    /* static member */
    inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    inline def create(properties: IQueryPlanNode): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    
    /**
      * Decodes a QueryPlanNode message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns QueryPlanNode
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    
    /**
      * Encodes the specified QueryPlanNode message. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IQueryPlanNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IQueryPlanNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified QueryPlanNode message, length delimited. Does not implicitly {@link Trace.QueryPlanNode.verify|verify} messages.
      * @param message QueryPlanNode message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IQueryPlanNode): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IQueryPlanNode, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a QueryPlanNode message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns QueryPlanNode
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode]
    
    /**
      * Creates a plain object from a QueryPlanNode message. Also converts values to other types if specified.
      * @param message QueryPlanNode
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(
      message: typings.apolloReportingProtobuf.protobufMod.Trace.QueryPlanNode,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a QueryPlanNode message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new Trace instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Trace instance
    */
  inline def create(): typings.apolloReportingProtobuf.protobufMod.Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  inline def create(properties: ITrace): typings.apolloReportingProtobuf.protobufMod.Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  
  /**
    * Decodes a Trace message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  inline def decode(reader: Reader, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  inline def decode(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  inline def decode(reader: Uint8Array, length: Double): typings.apolloReportingProtobuf.protobufMod.Trace = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  
  /**
    * Decodes a Trace message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Trace
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typings.apolloReportingProtobuf.protobufMod.Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  inline def decodeDelimited(reader: Uint8Array): typings.apolloReportingProtobuf.protobufMod.Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  
  /**
    * Encodes the specified Trace message. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITrace): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITrace, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Trace message, length delimited. Does not implicitly {@link Trace.verify|verify} messages.
    * @param message Trace message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITrace): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITrace, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Trace message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Trace
    */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.apolloReportingProtobuf.protobufMod.Trace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.apolloReportingProtobuf.protobufMod.Trace]
  
  /**
    * Creates a plain object from a Trace message. Also converts values to other types if specified.
    * @param message Trace
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: typings.apolloReportingProtobuf.protobufMod.Trace, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a Trace message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
